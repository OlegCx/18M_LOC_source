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
package com.amazonaws.services.config;

import javax.annotation.Generated;

import com.amazonaws.services.config.model.*;

/**
 * Interface for accessing Config Service asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.config.AbstractAmazonConfigAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Config</fullname>
 * <p>
 * AWS Config provides a way to keep track of the configurations of all the AWS resources associated with your AWS
 * account. You can use AWS Config to get the current and historical configurations of each AWS resource and also to get
 * information about the relationship between the resources. An AWS resource can be an Amazon Compute Cloud (Amazon EC2)
 * instance, an Elastic Block Store (EBS) volume, an elastic network Interface (ENI), or a security group. For a
 * complete list of resources currently supported by AWS Config, see <a
 * href="https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
 * >Supported AWS Resources</a>.
 * </p>
 * <p>
 * You can access and manage AWS Config through the AWS Management Console, the AWS Command Line Interface (AWS CLI),
 * the AWS Config API, or the AWS SDKs for AWS Config. This reference guide contains documentation for the AWS Config
 * API and the AWS CLI commands that you can use to manage AWS Config. The AWS Config API uses the Signature Version 4
 * protocol for signing requests. For more information about how to sign a request with this protocol, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
 * Process</a>. For detailed information about AWS Config features and their associated actions or commands, as well as
 * how to work with AWS Management Console, see <a
 * href="https://docs.aws.amazon.com/config/latest/developerguide/WhatIsConfig.html">What Is AWS Config</a> in the
 * <i>AWS Config Developer Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonConfigAsync extends AmazonConfig {

    /**
     * <p>
     * Returns the current configuration items for resources that are present in your AWS Config aggregator. The
     * operation also returns a list of resources that are not processed in the current request. If there are no
     * unprocessed resources, the operation returns an empty <code>unprocessedResourceIdentifiers</code> list.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The API does not return results for deleted resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * The API does not return tags and relationships.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param batchGetAggregateResourceConfigRequest
     * @return A Java Future containing the result of the BatchGetAggregateResourceConfig operation returned by the
     *         service.
     * @sample AmazonConfigAsync.BatchGetAggregateResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/BatchGetAggregateResourceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetAggregateResourceConfigResult> batchGetAggregateResourceConfigAsync(
            BatchGetAggregateResourceConfigRequest batchGetAggregateResourceConfigRequest);

    /**
     * <p>
     * Returns the current configuration items for resources that are present in your AWS Config aggregator. The
     * operation also returns a list of resources that are not processed in the current request. If there are no
     * unprocessed resources, the operation returns an empty <code>unprocessedResourceIdentifiers</code> list.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The API does not return results for deleted resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * The API does not return tags and relationships.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param batchGetAggregateResourceConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetAggregateResourceConfig operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.BatchGetAggregateResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/BatchGetAggregateResourceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetAggregateResourceConfigResult> batchGetAggregateResourceConfigAsync(
            BatchGetAggregateResourceConfigRequest batchGetAggregateResourceConfigRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetAggregateResourceConfigRequest, BatchGetAggregateResourceConfigResult> asyncHandler);

    /**
     * <p>
     * Returns the current configuration for one or more requested resources. The operation also returns a list of
     * resources that are not processed in the current request. If there are no unprocessed resources, the operation
     * returns an empty unprocessedResourceKeys list.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The API does not return results for deleted resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * The API does not return any tags for the requested resources. This information is filtered out of the
     * supplementaryConfiguration section of the API response.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param batchGetResourceConfigRequest
     * @return A Java Future containing the result of the BatchGetResourceConfig operation returned by the service.
     * @sample AmazonConfigAsync.BatchGetResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/BatchGetResourceConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetResourceConfigResult> batchGetResourceConfigAsync(BatchGetResourceConfigRequest batchGetResourceConfigRequest);

    /**
     * <p>
     * Returns the current configuration for one or more requested resources. The operation also returns a list of
     * resources that are not processed in the current request. If there are no unprocessed resources, the operation
     * returns an empty unprocessedResourceKeys list.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The API does not return results for deleted resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * The API does not return any tags for the requested resources. This information is filtered out of the
     * supplementaryConfiguration section of the API response.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param batchGetResourceConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetResourceConfig operation returned by the service.
     * @sample AmazonConfigAsyncHandler.BatchGetResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/BatchGetResourceConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetResourceConfigResult> batchGetResourceConfigAsync(BatchGetResourceConfigRequest batchGetResourceConfigRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetResourceConfigRequest, BatchGetResourceConfigResult> asyncHandler);

    /**
     * <p>
     * Deletes the authorization granted to the specified configuration aggregator account in a specified region.
     * </p>
     * 
     * @param deleteAggregationAuthorizationRequest
     * @return A Java Future containing the result of the DeleteAggregationAuthorization operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DeleteAggregationAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteAggregationAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAggregationAuthorizationResult> deleteAggregationAuthorizationAsync(
            DeleteAggregationAuthorizationRequest deleteAggregationAuthorizationRequest);

    /**
     * <p>
     * Deletes the authorization granted to the specified configuration aggregator account in a specified region.
     * </p>
     * 
     * @param deleteAggregationAuthorizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAggregationAuthorization operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DeleteAggregationAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteAggregationAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAggregationAuthorizationResult> deleteAggregationAuthorizationAsync(
            DeleteAggregationAuthorizationRequest deleteAggregationAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAggregationAuthorizationRequest, DeleteAggregationAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified AWS Config rule and all of its evaluation results.
     * </p>
     * <p>
     * AWS Config sets the state of a rule to <code>DELETING</code> until the deletion is complete. You cannot update a
     * rule while it is in this state. If you make a <code>PutConfigRule</code> or <code>DeleteConfigRule</code> request
     * for the rule, you will receive a <code>ResourceInUseException</code>.
     * </p>
     * <p>
     * You can check the state of a rule by using the <code>DescribeConfigRules</code> request.
     * </p>
     * 
     * @param deleteConfigRuleRequest
     * @return A Java Future containing the result of the DeleteConfigRule operation returned by the service.
     * @sample AmazonConfigAsync.DeleteConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteConfigRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigRuleResult> deleteConfigRuleAsync(DeleteConfigRuleRequest deleteConfigRuleRequest);

    /**
     * <p>
     * Deletes the specified AWS Config rule and all of its evaluation results.
     * </p>
     * <p>
     * AWS Config sets the state of a rule to <code>DELETING</code> until the deletion is complete. You cannot update a
     * rule while it is in this state. If you make a <code>PutConfigRule</code> or <code>DeleteConfigRule</code> request
     * for the rule, you will receive a <code>ResourceInUseException</code>.
     * </p>
     * <p>
     * You can check the state of a rule by using the <code>DescribeConfigRules</code> request.
     * </p>
     * 
     * @param deleteConfigRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfigRule operation returned by the service.
     * @sample AmazonConfigAsyncHandler.DeleteConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteConfigRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigRuleResult> deleteConfigRuleAsync(DeleteConfigRuleRequest deleteConfigRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigRuleRequest, DeleteConfigRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified configuration aggregator and the aggregated data associated with the aggregator.
     * </p>
     * 
     * @param deleteConfigurationAggregatorRequest
     * @return A Java Future containing the result of the DeleteConfigurationAggregator operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DeleteConfigurationAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteConfigurationAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationAggregatorResult> deleteConfigurationAggregatorAsync(
            DeleteConfigurationAggregatorRequest deleteConfigurationAggregatorRequest);

    /**
     * <p>
     * Deletes the specified configuration aggregator and the aggregated data associated with the aggregator.
     * </p>
     * 
     * @param deleteConfigurationAggregatorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfigurationAggregator operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DeleteConfigurationAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteConfigurationAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationAggregatorResult> deleteConfigurationAggregatorAsync(
            DeleteConfigurationAggregatorRequest deleteConfigurationAggregatorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigurationAggregatorRequest, DeleteConfigurationAggregatorResult> asyncHandler);

    /**
     * <p>
     * Deletes the configuration recorder.
     * </p>
     * <p>
     * After the configuration recorder is deleted, AWS Config will not record resource configuration changes until you
     * create a new configuration recorder.
     * </p>
     * <p>
     * This action does not delete the configuration information that was previously recorded. You will be able to
     * access the previously recorded information by using the <code>GetResourceConfigHistory</code> action, but you
     * will not be able to access this information in the AWS Config console until you create a new configuration
     * recorder.
     * </p>
     * 
     * @param deleteConfigurationRecorderRequest
     *        The request object for the <code>DeleteConfigurationRecorder</code> action.
     * @return A Java Future containing the result of the DeleteConfigurationRecorder operation returned by the service.
     * @sample AmazonConfigAsync.DeleteConfigurationRecorder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteConfigurationRecorder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationRecorderResult> deleteConfigurationRecorderAsync(
            DeleteConfigurationRecorderRequest deleteConfigurationRecorderRequest);

    /**
     * <p>
     * Deletes the configuration recorder.
     * </p>
     * <p>
     * After the configuration recorder is deleted, AWS Config will not record resource configuration changes until you
     * create a new configuration recorder.
     * </p>
     * <p>
     * This action does not delete the configuration information that was previously recorded. You will be able to
     * access the previously recorded information by using the <code>GetResourceConfigHistory</code> action, but you
     * will not be able to access this information in the AWS Config console until you create a new configuration
     * recorder.
     * </p>
     * 
     * @param deleteConfigurationRecorderRequest
     *        The request object for the <code>DeleteConfigurationRecorder</code> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfigurationRecorder operation returned by the service.
     * @sample AmazonConfigAsyncHandler.DeleteConfigurationRecorder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteConfigurationRecorder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationRecorderResult> deleteConfigurationRecorderAsync(
            DeleteConfigurationRecorderRequest deleteConfigurationRecorderRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigurationRecorderRequest, DeleteConfigurationRecorderResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified conformance pack and all the AWS Config rules, remediation actions, and all evaluation
     * results within that conformance pack.
     * </p>
     * <p>
     * AWS Config sets the conformance pack to <code>DELETE_IN_PROGRESS</code> until the deletion is complete. You
     * cannot update a conformance pack while it is in this state.
     * </p>
     * 
     * @param deleteConformancePackRequest
     * @return A Java Future containing the result of the DeleteConformancePack operation returned by the service.
     * @sample AmazonConfigAsync.DeleteConformancePack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteConformancePack" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConformancePackResult> deleteConformancePackAsync(DeleteConformancePackRequest deleteConformancePackRequest);

    /**
     * <p>
     * Deletes the specified conformance pack and all the AWS Config rules, remediation actions, and all evaluation
     * results within that conformance pack.
     * </p>
     * <p>
     * AWS Config sets the conformance pack to <code>DELETE_IN_PROGRESS</code> until the deletion is complete. You
     * cannot update a conformance pack while it is in this state.
     * </p>
     * 
     * @param deleteConformancePackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConformancePack operation returned by the service.
     * @sample AmazonConfigAsyncHandler.DeleteConformancePack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteConformancePack" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConformancePackResult> deleteConformancePackAsync(DeleteConformancePackRequest deleteConformancePackRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConformancePackRequest, DeleteConformancePackResult> asyncHandler);

    /**
     * <p>
     * Deletes the delivery channel.
     * </p>
     * <p>
     * Before you can delete the delivery channel, you must stop the configuration recorder by using the
     * <a>StopConfigurationRecorder</a> action.
     * </p>
     * 
     * @param deleteDeliveryChannelRequest
     *        The input for the <a>DeleteDeliveryChannel</a> action. The action accepts the following data, in JSON
     *        format.
     * @return A Java Future containing the result of the DeleteDeliveryChannel operation returned by the service.
     * @sample AmazonConfigAsync.DeleteDeliveryChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteDeliveryChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeliveryChannelResult> deleteDeliveryChannelAsync(DeleteDeliveryChannelRequest deleteDeliveryChannelRequest);

    /**
     * <p>
     * Deletes the delivery channel.
     * </p>
     * <p>
     * Before you can delete the delivery channel, you must stop the configuration recorder by using the
     * <a>StopConfigurationRecorder</a> action.
     * </p>
     * 
     * @param deleteDeliveryChannelRequest
     *        The input for the <a>DeleteDeliveryChannel</a> action. The action accepts the following data, in JSON
     *        format.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDeliveryChannel operation returned by the service.
     * @sample AmazonConfigAsyncHandler.DeleteDeliveryChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteDeliveryChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeliveryChannelResult> deleteDeliveryChannelAsync(DeleteDeliveryChannelRequest deleteDeliveryChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDeliveryChannelRequest, DeleteDeliveryChannelResult> asyncHandler);

    /**
     * <p>
     * Deletes the evaluation results for the specified AWS Config rule. You can specify one AWS Config rule per
     * request. After you delete the evaluation results, you can call the <a>StartConfigRulesEvaluation</a> API to start
     * evaluating your AWS resources against the rule.
     * </p>
     * 
     * @param deleteEvaluationResultsRequest
     * @return A Java Future containing the result of the DeleteEvaluationResults operation returned by the service.
     * @sample AmazonConfigAsync.DeleteEvaluationResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteEvaluationResults" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEvaluationResultsResult> deleteEvaluationResultsAsync(DeleteEvaluationResultsRequest deleteEvaluationResultsRequest);

    /**
     * <p>
     * Deletes the evaluation results for the specified AWS Config rule. You can specify one AWS Config rule per
     * request. After you delete the evaluation results, you can call the <a>StartConfigRulesEvaluation</a> API to start
     * evaluating your AWS resources against the rule.
     * </p>
     * 
     * @param deleteEvaluationResultsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEvaluationResults operation returned by the service.
     * @sample AmazonConfigAsyncHandler.DeleteEvaluationResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteEvaluationResults" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEvaluationResultsResult> deleteEvaluationResultsAsync(DeleteEvaluationResultsRequest deleteEvaluationResultsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEvaluationResultsRequest, DeleteEvaluationResultsResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified organization config rule and all of its evaluation results from all member accounts in that
     * organization.
     * </p>
     * <p>
     * Only a master account and a delegated administrator account can delete an organization config rule. When calling
     * this API with a delegated administrator, you must ensure AWS Organizations
     * <code>ListDelegatedAdministrator</code> permissions are added.
     * </p>
     * <p>
     * AWS Config sets the state of a rule to DELETE_IN_PROGRESS until the deletion is complete. You cannot update a
     * rule while it is in this state.
     * </p>
     * 
     * @param deleteOrganizationConfigRuleRequest
     * @return A Java Future containing the result of the DeleteOrganizationConfigRule operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DeleteOrganizationConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteOrganizationConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOrganizationConfigRuleResult> deleteOrganizationConfigRuleAsync(
            DeleteOrganizationConfigRuleRequest deleteOrganizationConfigRuleRequest);

    /**
     * <p>
     * Deletes the specified organization config rule and all of its evaluation results from all member accounts in that
     * organization.
     * </p>
     * <p>
     * Only a master account and a delegated administrator account can delete an organization config rule. When calling
     * this API with a delegated administrator, you must ensure AWS Organizations
     * <code>ListDelegatedAdministrator</code> permissions are added.
     * </p>
     * <p>
     * AWS Config sets the state of a rule to DELETE_IN_PROGRESS until the deletion is complete. You cannot update a
     * rule while it is in this state.
     * </p>
     * 
     * @param deleteOrganizationConfigRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOrganizationConfigRule operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DeleteOrganizationConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteOrganizationConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOrganizationConfigRuleResult> deleteOrganizationConfigRuleAsync(
            DeleteOrganizationConfigRuleRequest deleteOrganizationConfigRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOrganizationConfigRuleRequest, DeleteOrganizationConfigRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified organization conformance pack and all of the config rules and remediation actions from all
     * member accounts in that organization.
     * </p>
     * <p>
     * Only a master account or a delegated administrator account can delete an organization conformance pack. When
     * calling this API with a delegated administrator, you must ensure AWS Organizations
     * <code>ListDelegatedAdministrator</code> permissions are added.
     * </p>
     * <p>
     * AWS Config sets the state of a conformance pack to DELETE_IN_PROGRESS until the deletion is complete. You cannot
     * update a conformance pack while it is in this state.
     * </p>
     * 
     * @param deleteOrganizationConformancePackRequest
     * @return A Java Future containing the result of the DeleteOrganizationConformancePack operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DeleteOrganizationConformancePack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteOrganizationConformancePack"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOrganizationConformancePackResult> deleteOrganizationConformancePackAsync(
            DeleteOrganizationConformancePackRequest deleteOrganizationConformancePackRequest);

    /**
     * <p>
     * Deletes the specified organization conformance pack and all of the config rules and remediation actions from all
     * member accounts in that organization.
     * </p>
     * <p>
     * Only a master account or a delegated administrator account can delete an organization conformance pack. When
     * calling this API with a delegated administrator, you must ensure AWS Organizations
     * <code>ListDelegatedAdministrator</code> permissions are added.
     * </p>
     * <p>
     * AWS Config sets the state of a conformance pack to DELETE_IN_PROGRESS until the deletion is complete. You cannot
     * update a conformance pack while it is in this state.
     * </p>
     * 
     * @param deleteOrganizationConformancePackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOrganizationConformancePack operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DeleteOrganizationConformancePack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteOrganizationConformancePack"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOrganizationConformancePackResult> deleteOrganizationConformancePackAsync(
            DeleteOrganizationConformancePackRequest deleteOrganizationConformancePackRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOrganizationConformancePackRequest, DeleteOrganizationConformancePackResult> asyncHandler);

    /**
     * <p>
     * Deletes pending authorization requests for a specified aggregator account in a specified region.
     * </p>
     * 
     * @param deletePendingAggregationRequestRequest
     * @return A Java Future containing the result of the DeletePendingAggregationRequest operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DeletePendingAggregationRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeletePendingAggregationRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePendingAggregationRequestResult> deletePendingAggregationRequestAsync(
            DeletePendingAggregationRequestRequest deletePendingAggregationRequestRequest);

    /**
     * <p>
     * Deletes pending authorization requests for a specified aggregator account in a specified region.
     * </p>
     * 
     * @param deletePendingAggregationRequestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePendingAggregationRequest operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DeletePendingAggregationRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeletePendingAggregationRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePendingAggregationRequestResult> deletePendingAggregationRequestAsync(
            DeletePendingAggregationRequestRequest deletePendingAggregationRequestRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePendingAggregationRequestRequest, DeletePendingAggregationRequestResult> asyncHandler);

    /**
     * <p>
     * Deletes the remediation configuration.
     * </p>
     * 
     * @param deleteRemediationConfigurationRequest
     * @return A Java Future containing the result of the DeleteRemediationConfiguration operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DeleteRemediationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteRemediationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRemediationConfigurationResult> deleteRemediationConfigurationAsync(
            DeleteRemediationConfigurationRequest deleteRemediationConfigurationRequest);

    /**
     * <p>
     * Deletes the remediation configuration.
     * </p>
     * 
     * @param deleteRemediationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRemediationConfiguration operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DeleteRemediationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteRemediationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRemediationConfigurationResult> deleteRemediationConfigurationAsync(
            DeleteRemediationConfigurationRequest deleteRemediationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRemediationConfigurationRequest, DeleteRemediationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes one or more remediation exceptions mentioned in the resource keys.
     * </p>
     * <note>
     * <p>
     * AWS Config generates a remediation exception when a problem occurs executing a remediation action to a specific
     * resource. Remediation exceptions blocks auto-remediation until the exception is cleared.
     * </p>
     * </note>
     * 
     * @param deleteRemediationExceptionsRequest
     * @return A Java Future containing the result of the DeleteRemediationExceptions operation returned by the service.
     * @sample AmazonConfigAsync.DeleteRemediationExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteRemediationExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRemediationExceptionsResult> deleteRemediationExceptionsAsync(
            DeleteRemediationExceptionsRequest deleteRemediationExceptionsRequest);

    /**
     * <p>
     * Deletes one or more remediation exceptions mentioned in the resource keys.
     * </p>
     * <note>
     * <p>
     * AWS Config generates a remediation exception when a problem occurs executing a remediation action to a specific
     * resource. Remediation exceptions blocks auto-remediation until the exception is cleared.
     * </p>
     * </note>
     * 
     * @param deleteRemediationExceptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRemediationExceptions operation returned by the service.
     * @sample AmazonConfigAsyncHandler.DeleteRemediationExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteRemediationExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRemediationExceptionsResult> deleteRemediationExceptionsAsync(
            DeleteRemediationExceptionsRequest deleteRemediationExceptionsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRemediationExceptionsRequest, DeleteRemediationExceptionsResult> asyncHandler);

    /**
     * <p>
     * Records the configuration state for a custom resource that has been deleted. This API records a new
     * ConfigurationItem with a ResourceDeleted status. You can retrieve the ConfigurationItems recorded for this
     * resource in your AWS Config History.
     * </p>
     * 
     * @param deleteResourceConfigRequest
     * @return A Java Future containing the result of the DeleteResourceConfig operation returned by the service.
     * @sample AmazonConfigAsync.DeleteResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteResourceConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceConfigResult> deleteResourceConfigAsync(DeleteResourceConfigRequest deleteResourceConfigRequest);

    /**
     * <p>
     * Records the configuration state for a custom resource that has been deleted. This API records a new
     * ConfigurationItem with a ResourceDeleted status. You can retrieve the ConfigurationItems recorded for this
     * resource in your AWS Config History.
     * </p>
     * 
     * @param deleteResourceConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourceConfig operation returned by the service.
     * @sample AmazonConfigAsyncHandler.DeleteResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteResourceConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceConfigResult> deleteResourceConfigAsync(DeleteResourceConfigRequest deleteResourceConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourceConfigRequest, DeleteResourceConfigResult> asyncHandler);

    /**
     * <p>
     * Deletes the retention configuration.
     * </p>
     * 
     * @param deleteRetentionConfigurationRequest
     * @return A Java Future containing the result of the DeleteRetentionConfiguration operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DeleteRetentionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteRetentionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRetentionConfigurationResult> deleteRetentionConfigurationAsync(
            DeleteRetentionConfigurationRequest deleteRetentionConfigurationRequest);

    /**
     * <p>
     * Deletes the retention configuration.
     * </p>
     * 
     * @param deleteRetentionConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRetentionConfiguration operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DeleteRetentionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteRetentionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRetentionConfigurationResult> deleteRetentionConfigurationAsync(
            DeleteRetentionConfigurationRequest deleteRetentionConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRetentionConfigurationRequest, DeleteRetentionConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the stored query for a single AWS account and a single AWS Region.
     * </p>
     * 
     * @param deleteStoredQueryRequest
     * @return A Java Future containing the result of the DeleteStoredQuery operation returned by the service.
     * @sample AmazonConfigAsync.DeleteStoredQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteStoredQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStoredQueryResult> deleteStoredQueryAsync(DeleteStoredQueryRequest deleteStoredQueryRequest);

    /**
     * <p>
     * Deletes the stored query for a single AWS account and a single AWS Region.
     * </p>
     * 
     * @param deleteStoredQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStoredQuery operation returned by the service.
     * @sample AmazonConfigAsyncHandler.DeleteStoredQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteStoredQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStoredQueryResult> deleteStoredQueryAsync(DeleteStoredQueryRequest deleteStoredQueryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStoredQueryRequest, DeleteStoredQueryResult> asyncHandler);

    /**
     * <p>
     * Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel. After
     * the delivery has started, AWS Config sends the following notifications using an Amazon SNS topic that you have
     * specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Notification of the start of the delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * Notification of the completion of the delivery, if the delivery was successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Notification of delivery failure, if the delivery failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deliverConfigSnapshotRequest
     *        The input for the <a>DeliverConfigSnapshot</a> action.
     * @return A Java Future containing the result of the DeliverConfigSnapshot operation returned by the service.
     * @sample AmazonConfigAsync.DeliverConfigSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeliverConfigSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeliverConfigSnapshotResult> deliverConfigSnapshotAsync(DeliverConfigSnapshotRequest deliverConfigSnapshotRequest);

    /**
     * <p>
     * Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel. After
     * the delivery has started, AWS Config sends the following notifications using an Amazon SNS topic that you have
     * specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Notification of the start of the delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * Notification of the completion of the delivery, if the delivery was successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Notification of delivery failure, if the delivery failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deliverConfigSnapshotRequest
     *        The input for the <a>DeliverConfigSnapshot</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeliverConfigSnapshot operation returned by the service.
     * @sample AmazonConfigAsyncHandler.DeliverConfigSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeliverConfigSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeliverConfigSnapshotResult> deliverConfigSnapshotAsync(DeliverConfigSnapshotRequest deliverConfigSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeliverConfigSnapshotRequest, DeliverConfigSnapshotResult> asyncHandler);

    /**
     * <p>
     * Returns a list of compliant and noncompliant rules with the number of resources for compliant and noncompliant
     * rules.
     * </p>
     * <note>
     * <p>
     * The results can return an empty result page, but if you have a <code>nextToken</code>, the results are displayed
     * on the next page.
     * </p>
     * </note>
     * 
     * @param describeAggregateComplianceByConfigRulesRequest
     * @return A Java Future containing the result of the DescribeAggregateComplianceByConfigRules operation returned by
     *         the service.
     * @sample AmazonConfigAsync.DescribeAggregateComplianceByConfigRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeAggregateComplianceByConfigRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAggregateComplianceByConfigRulesResult> describeAggregateComplianceByConfigRulesAsync(
            DescribeAggregateComplianceByConfigRulesRequest describeAggregateComplianceByConfigRulesRequest);

    /**
     * <p>
     * Returns a list of compliant and noncompliant rules with the number of resources for compliant and noncompliant
     * rules.
     * </p>
     * <note>
     * <p>
     * The results can return an empty result page, but if you have a <code>nextToken</code>, the results are displayed
     * on the next page.
     * </p>
     * </note>
     * 
     * @param describeAggregateComplianceByConfigRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAggregateComplianceByConfigRules operation returned by
     *         the service.
     * @sample AmazonConfigAsyncHandler.DescribeAggregateComplianceByConfigRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeAggregateComplianceByConfigRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAggregateComplianceByConfigRulesResult> describeAggregateComplianceByConfigRulesAsync(
            DescribeAggregateComplianceByConfigRulesRequest describeAggregateComplianceByConfigRulesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAggregateComplianceByConfigRulesRequest, DescribeAggregateComplianceByConfigRulesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the conformance packs and their associated compliance status with the count of compliant and
     * noncompliant AWS Config rules within each conformance pack. Also returns the total rule count which includes
     * compliant rules, noncompliant rules, and rules that cannot be evaluated due to insufficient data.
     * </p>
     * <note>
     * <p>
     * The results can return an empty result page, but if you have a <code>nextToken</code>, the results are displayed
     * on the next page.
     * </p>
     * </note>
     * 
     * @param describeAggregateComplianceByConformancePacksRequest
     * @return A Java Future containing the result of the DescribeAggregateComplianceByConformancePacks operation
     *         returned by the service.
     * @sample AmazonConfigAsync.DescribeAggregateComplianceByConformancePacks
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeAggregateComplianceByConformancePacks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAggregateComplianceByConformancePacksResult> describeAggregateComplianceByConformancePacksAsync(
            DescribeAggregateComplianceByConformancePacksRequest describeAggregateComplianceByConformancePacksRequest);

    /**
     * <p>
     * Returns a list of the conformance packs and their associated compliance status with the count of compliant and
     * noncompliant AWS Config rules within each conformance pack. Also returns the total rule count which includes
     * compliant rules, noncompliant rules, and rules that cannot be evaluated due to insufficient data.
     * </p>
     * <note>
     * <p>
     * The results can return an empty result page, but if you have a <code>nextToken</code>, the results are displayed
     * on the next page.
     * </p>
     * </note>
     * 
     * @param describeAggregateComplianceByConformancePacksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAggregateComplianceByConformancePacks operation
     *         returned by the service.
     * @sample AmazonConfigAsyncHandler.DescribeAggregateComplianceByConformancePacks
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeAggregateComplianceByConformancePacks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAggregateComplianceByConformancePacksResult> describeAggregateComplianceByConformancePacksAsync(
            DescribeAggregateComplianceByConformancePacksRequest describeAggregateComplianceByConformancePacksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAggregateComplianceByConformancePacksRequest, DescribeAggregateComplianceByConformancePacksResult> asyncHandler);

    /**
     * <p>
     * Returns a list of authorizations granted to various aggregator accounts and regions.
     * </p>
     * 
     * @param describeAggregationAuthorizationsRequest
     * @return A Java Future containing the result of the DescribeAggregationAuthorizations operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeAggregationAuthorizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeAggregationAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAggregationAuthorizationsResult> describeAggregationAuthorizationsAsync(
            DescribeAggregationAuthorizationsRequest describeAggregationAuthorizationsRequest);

    /**
     * <p>
     * Returns a list of authorizations granted to various aggregator accounts and regions.
     * </p>
     * 
     * @param describeAggregationAuthorizationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAggregationAuthorizations operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeAggregationAuthorizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeAggregationAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAggregationAuthorizationsResult> describeAggregationAuthorizationsAsync(
            DescribeAggregationAuthorizationsRequest describeAggregationAuthorizationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAggregationAuthorizationsRequest, DescribeAggregationAuthorizationsResult> asyncHandler);

    /**
     * <p>
     * Indicates whether the specified AWS Config rules are compliant. If a rule is noncompliant, this action returns
     * the number of AWS resources that do not comply with the rule.
     * </p>
     * <p>
     * A rule is compliant if all of the evaluated resources comply with it. It is noncompliant if any of these
     * resources do not comply.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the rule, it returns <code>INSUFFICIENT_DATA</code>. This
     * result might indicate one of the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Config has never invoked an evaluation for the rule. To check whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role you
     * assigned to your configuration recorder includes the <code>config:PutEvaluations</code> permission. If the rule
     * is a custom rule, verify that the AWS Lambda execution role includes the <code>config:PutEvaluations</code>
     * permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function has returned <code>NOT_APPLICABLE</code> for all evaluation results. This can
     * occur if the resources were deleted or removed from the rule's scope.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeComplianceByConfigRuleRequest
     * @return A Java Future containing the result of the DescribeComplianceByConfigRule operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeComplianceByConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeComplianceByConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(
            DescribeComplianceByConfigRuleRequest describeComplianceByConfigRuleRequest);

    /**
     * <p>
     * Indicates whether the specified AWS Config rules are compliant. If a rule is noncompliant, this action returns
     * the number of AWS resources that do not comply with the rule.
     * </p>
     * <p>
     * A rule is compliant if all of the evaluated resources comply with it. It is noncompliant if any of these
     * resources do not comply.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the rule, it returns <code>INSUFFICIENT_DATA</code>. This
     * result might indicate one of the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Config has never invoked an evaluation for the rule. To check whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role you
     * assigned to your configuration recorder includes the <code>config:PutEvaluations</code> permission. If the rule
     * is a custom rule, verify that the AWS Lambda execution role includes the <code>config:PutEvaluations</code>
     * permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function has returned <code>NOT_APPLICABLE</code> for all evaluation results. This can
     * occur if the resources were deleted or removed from the rule's scope.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeComplianceByConfigRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeComplianceByConfigRule operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeComplianceByConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeComplianceByConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(
            DescribeComplianceByConfigRuleRequest describeComplianceByConfigRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByConfigRuleRequest, DescribeComplianceByConfigRuleResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeComplianceByConfigRule operation.
     *
     * @see #describeComplianceByConfigRuleAsync(DescribeComplianceByConfigRuleRequest)
     */
    java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync();

    /**
     * Simplified method form for invoking the DescribeComplianceByConfigRule operation with an AsyncHandler.
     *
     * @see #describeComplianceByConfigRuleAsync(DescribeComplianceByConfigRuleRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByConfigRuleRequest, DescribeComplianceByConfigRuleResult> asyncHandler);

    /**
     * <p>
     * Indicates whether the specified AWS resources are compliant. If a resource is noncompliant, this action returns
     * the number of AWS Config rules that the resource does not comply with.
     * </p>
     * <p>
     * A resource is compliant if it complies with all the AWS Config rules that evaluate it. It is noncompliant if it
     * does not comply with one or more of these rules.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the resource, it returns <code>INSUFFICIENT_DATA</code>. This
     * result might indicate one of the following conditions about the rules that evaluate the resource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Config has never invoked an evaluation for the rule. To check whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role that you
     * assigned to your configuration recorder includes the <code>config:PutEvaluations</code> permission. If the rule
     * is a custom rule, verify that the AWS Lambda execution role includes the <code>config:PutEvaluations</code>
     * permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function has returned <code>NOT_APPLICABLE</code> for all evaluation results. This can
     * occur if the resources were deleted or removed from the rule's scope.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeComplianceByResourceRequest
     * @return A Java Future containing the result of the DescribeComplianceByResource operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeComplianceByResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeComplianceByResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(
            DescribeComplianceByResourceRequest describeComplianceByResourceRequest);

    /**
     * <p>
     * Indicates whether the specified AWS resources are compliant. If a resource is noncompliant, this action returns
     * the number of AWS Config rules that the resource does not comply with.
     * </p>
     * <p>
     * A resource is compliant if it complies with all the AWS Config rules that evaluate it. It is noncompliant if it
     * does not comply with one or more of these rules.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the resource, it returns <code>INSUFFICIENT_DATA</code>. This
     * result might indicate one of the following conditions about the rules that evaluate the resource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Config has never invoked an evaluation for the rule. To check whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role that you
     * assigned to your configuration recorder includes the <code>config:PutEvaluations</code> permission. If the rule
     * is a custom rule, verify that the AWS Lambda execution role includes the <code>config:PutEvaluations</code>
     * permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function has returned <code>NOT_APPLICABLE</code> for all evaluation results. This can
     * occur if the resources were deleted or removed from the rule's scope.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeComplianceByResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeComplianceByResource operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeComplianceByResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeComplianceByResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(
            DescribeComplianceByResourceRequest describeComplianceByResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByResourceRequest, DescribeComplianceByResourceResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeComplianceByResource operation.
     *
     * @see #describeComplianceByResourceAsync(DescribeComplianceByResourceRequest)
     */
    java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync();

    /**
     * Simplified method form for invoking the DescribeComplianceByResource operation with an AsyncHandler.
     *
     * @see #describeComplianceByResourceAsync(DescribeComplianceByResourceRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByResourceRequest, DescribeComplianceByResourceResult> asyncHandler);

    /**
     * <p>
     * Returns status information for each of your AWS managed Config rules. The status includes information such as the
     * last time AWS Config invoked the rule, the last time AWS Config failed to invoke the rule, and the related error
     * for the last failure.
     * </p>
     * 
     * @param describeConfigRuleEvaluationStatusRequest
     * @return A Java Future containing the result of the DescribeConfigRuleEvaluationStatus operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeConfigRuleEvaluationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigRuleEvaluationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(
            DescribeConfigRuleEvaluationStatusRequest describeConfigRuleEvaluationStatusRequest);

    /**
     * <p>
     * Returns status information for each of your AWS managed Config rules. The status includes information such as the
     * last time AWS Config invoked the rule, the last time AWS Config failed to invoke the rule, and the related error
     * for the last failure.
     * </p>
     * 
     * @param describeConfigRuleEvaluationStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfigRuleEvaluationStatus operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeConfigRuleEvaluationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigRuleEvaluationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(
            DescribeConfigRuleEvaluationStatusRequest describeConfigRuleEvaluationStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRuleEvaluationStatusRequest, DescribeConfigRuleEvaluationStatusResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeConfigRuleEvaluationStatus operation.
     *
     * @see #describeConfigRuleEvaluationStatusAsync(DescribeConfigRuleEvaluationStatusRequest)
     */
    java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync();

    /**
     * Simplified method form for invoking the DescribeConfigRuleEvaluationStatus operation with an AsyncHandler.
     *
     * @see #describeConfigRuleEvaluationStatusAsync(DescribeConfigRuleEvaluationStatusRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRuleEvaluationStatusRequest, DescribeConfigRuleEvaluationStatusResult> asyncHandler);

    /**
     * <p>
     * Returns details about your AWS Config rules.
     * </p>
     * 
     * @param describeConfigRulesRequest
     * @return A Java Future containing the result of the DescribeConfigRules operation returned by the service.
     * @sample AmazonConfigAsync.DescribeConfigRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync(DescribeConfigRulesRequest describeConfigRulesRequest);

    /**
     * <p>
     * Returns details about your AWS Config rules.
     * </p>
     * 
     * @param describeConfigRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfigRules operation returned by the service.
     * @sample AmazonConfigAsyncHandler.DescribeConfigRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync(DescribeConfigRulesRequest describeConfigRulesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRulesRequest, DescribeConfigRulesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeConfigRules operation.
     *
     * @see #describeConfigRulesAsync(DescribeConfigRulesRequest)
     */
    java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync();

    /**
     * Simplified method form for invoking the DescribeConfigRules operation with an AsyncHandler.
     *
     * @see #describeConfigRulesAsync(DescribeConfigRulesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRulesRequest, DescribeConfigRulesResult> asyncHandler);

    /**
     * <p>
     * Returns status information for sources within an aggregator. The status includes information about the last time
     * AWS Config verified authorization between the source account and an aggregator account. In case of a failure, the
     * status contains the related error code or message.
     * </p>
     * 
     * @param describeConfigurationAggregatorSourcesStatusRequest
     * @return A Java Future containing the result of the DescribeConfigurationAggregatorSourcesStatus operation
     *         returned by the service.
     * @sample AmazonConfigAsync.DescribeConfigurationAggregatorSourcesStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationAggregatorSourcesStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigurationAggregatorSourcesStatusResult> describeConfigurationAggregatorSourcesStatusAsync(
            DescribeConfigurationAggregatorSourcesStatusRequest describeConfigurationAggregatorSourcesStatusRequest);

    /**
     * <p>
     * Returns status information for sources within an aggregator. The status includes information about the last time
     * AWS Config verified authorization between the source account and an aggregator account. In case of a failure, the
     * status contains the related error code or message.
     * </p>
     * 
     * @param describeConfigurationAggregatorSourcesStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfigurationAggregatorSourcesStatus operation
     *         returned by the service.
     * @sample AmazonConfigAsyncHandler.DescribeConfigurationAggregatorSourcesStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationAggregatorSourcesStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigurationAggregatorSourcesStatusResult> describeConfigurationAggregatorSourcesStatusAsync(
            DescribeConfigurationAggregatorSourcesStatusRequest describeConfigurationAggregatorSourcesStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationAggregatorSourcesStatusRequest, DescribeConfigurationAggregatorSourcesStatusResult> asyncHandler);

    /**
     * <p>
     * Returns the details of one or more configuration aggregators. If the configuration aggregator is not specified,
     * this action returns the details for all the configuration aggregators associated with the account.
     * </p>
     * 
     * @param describeConfigurationAggregatorsRequest
     * @return A Java Future containing the result of the DescribeConfigurationAggregators operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeConfigurationAggregators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationAggregators"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigurationAggregatorsResult> describeConfigurationAggregatorsAsync(
            DescribeConfigurationAggregatorsRequest describeConfigurationAggregatorsRequest);

    /**
     * <p>
     * Returns the details of one or more configuration aggregators. If the configuration aggregator is not specified,
     * this action returns the details for all the configuration aggregators associated with the account.
     * </p>
     * 
     * @param describeConfigurationAggregatorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfigurationAggregators operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeConfigurationAggregators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationAggregators"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigurationAggregatorsResult> describeConfigurationAggregatorsAsync(
            DescribeConfigurationAggregatorsRequest describeConfigurationAggregatorsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationAggregatorsRequest, DescribeConfigurationAggregatorsResult> asyncHandler);

    /**
     * <p>
     * Returns the current status of the specified configuration recorder. If a configuration recorder is not specified,
     * this action returns the status of all configuration recorders associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per region in your account.
     * </p>
     * </note>
     * 
     * @param describeConfigurationRecorderStatusRequest
     *        The input for the <a>DescribeConfigurationRecorderStatus</a> action.
     * @return A Java Future containing the result of the DescribeConfigurationRecorderStatus operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeConfigurationRecorderStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationRecorderStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(
            DescribeConfigurationRecorderStatusRequest describeConfigurationRecorderStatusRequest);

    /**
     * <p>
     * Returns the current status of the specified configuration recorder. If a configuration recorder is not specified,
     * this action returns the status of all configuration recorders associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per region in your account.
     * </p>
     * </note>
     * 
     * @param describeConfigurationRecorderStatusRequest
     *        The input for the <a>DescribeConfigurationRecorderStatus</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfigurationRecorderStatus operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeConfigurationRecorderStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationRecorderStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(
            DescribeConfigurationRecorderStatusRequest describeConfigurationRecorderStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecorderStatusRequest, DescribeConfigurationRecorderStatusResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeConfigurationRecorderStatus operation.
     *
     * @see #describeConfigurationRecorderStatusAsync(DescribeConfigurationRecorderStatusRequest)
     */
    java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync();

    /**
     * Simplified method form for invoking the DescribeConfigurationRecorderStatus operation with an AsyncHandler.
     *
     * @see #describeConfigurationRecorderStatusAsync(DescribeConfigurationRecorderStatusRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecorderStatusRequest, DescribeConfigurationRecorderStatusResult> asyncHandler);

    /**
     * <p>
     * Returns the details for the specified configuration recorders. If the configuration recorder is not specified,
     * this action returns the details for all configuration recorders associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per region in your account.
     * </p>
     * </note>
     * 
     * @param describeConfigurationRecordersRequest
     *        The input for the <a>DescribeConfigurationRecorders</a> action.
     * @return A Java Future containing the result of the DescribeConfigurationRecorders operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeConfigurationRecorders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationRecorders"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(
            DescribeConfigurationRecordersRequest describeConfigurationRecordersRequest);

    /**
     * <p>
     * Returns the details for the specified configuration recorders. If the configuration recorder is not specified,
     * this action returns the details for all configuration recorders associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per region in your account.
     * </p>
     * </note>
     * 
     * @param describeConfigurationRecordersRequest
     *        The input for the <a>DescribeConfigurationRecorders</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfigurationRecorders operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeConfigurationRecorders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationRecorders"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(
            DescribeConfigurationRecordersRequest describeConfigurationRecordersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecordersRequest, DescribeConfigurationRecordersResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeConfigurationRecorders operation.
     *
     * @see #describeConfigurationRecordersAsync(DescribeConfigurationRecordersRequest)
     */
    java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync();

    /**
     * Simplified method form for invoking the DescribeConfigurationRecorders operation with an AsyncHandler.
     *
     * @see #describeConfigurationRecordersAsync(DescribeConfigurationRecordersRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecordersRequest, DescribeConfigurationRecordersResult> asyncHandler);

    /**
     * <p>
     * Returns compliance details for each rule in that conformance pack.
     * </p>
     * <note>
     * <p>
     * You must provide exact rule names.
     * </p>
     * </note>
     * 
     * @param describeConformancePackComplianceRequest
     * @return A Java Future containing the result of the DescribeConformancePackCompliance operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeConformancePackCompliance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConformancePackCompliance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConformancePackComplianceResult> describeConformancePackComplianceAsync(
            DescribeConformancePackComplianceRequest describeConformancePackComplianceRequest);

    /**
     * <p>
     * Returns compliance details for each rule in that conformance pack.
     * </p>
     * <note>
     * <p>
     * You must provide exact rule names.
     * </p>
     * </note>
     * 
     * @param describeConformancePackComplianceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConformancePackCompliance operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeConformancePackCompliance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConformancePackCompliance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConformancePackComplianceResult> describeConformancePackComplianceAsync(
            DescribeConformancePackComplianceRequest describeConformancePackComplianceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConformancePackComplianceRequest, DescribeConformancePackComplianceResult> asyncHandler);

    /**
     * <p>
     * Provides one or more conformance packs deployment status.
     * </p>
     * <note>
     * <p>
     * If there are no conformance packs then you will see an empty result.
     * </p>
     * </note>
     * 
     * @param describeConformancePackStatusRequest
     * @return A Java Future containing the result of the DescribeConformancePackStatus operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeConformancePackStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConformancePackStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConformancePackStatusResult> describeConformancePackStatusAsync(
            DescribeConformancePackStatusRequest describeConformancePackStatusRequest);

    /**
     * <p>
     * Provides one or more conformance packs deployment status.
     * </p>
     * <note>
     * <p>
     * If there are no conformance packs then you will see an empty result.
     * </p>
     * </note>
     * 
     * @param describeConformancePackStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConformancePackStatus operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeConformancePackStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConformancePackStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConformancePackStatusResult> describeConformancePackStatusAsync(
            DescribeConformancePackStatusRequest describeConformancePackStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConformancePackStatusRequest, DescribeConformancePackStatusResult> asyncHandler);

    /**
     * <p>
     * Returns a list of one or more conformance packs.
     * </p>
     * 
     * @param describeConformancePacksRequest
     * @return A Java Future containing the result of the DescribeConformancePacks operation returned by the service.
     * @sample AmazonConfigAsync.DescribeConformancePacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConformancePacks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConformancePacksResult> describeConformancePacksAsync(DescribeConformancePacksRequest describeConformancePacksRequest);

    /**
     * <p>
     * Returns a list of one or more conformance packs.
     * </p>
     * 
     * @param describeConformancePacksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConformancePacks operation returned by the service.
     * @sample AmazonConfigAsyncHandler.DescribeConformancePacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConformancePacks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConformancePacksResult> describeConformancePacksAsync(DescribeConformancePacksRequest describeConformancePacksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConformancePacksRequest, DescribeConformancePacksResult> asyncHandler);

    /**
     * <p>
     * Returns the current status of the specified delivery channel. If a delivery channel is not specified, this action
     * returns the current status of all delivery channels associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one delivery channel per region in your account.
     * </p>
     * </note>
     * 
     * @param describeDeliveryChannelStatusRequest
     *        The input for the <a>DeliveryChannelStatus</a> action.
     * @return A Java Future containing the result of the DescribeDeliveryChannelStatus operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeDeliveryChannelStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeDeliveryChannelStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(
            DescribeDeliveryChannelStatusRequest describeDeliveryChannelStatusRequest);

    /**
     * <p>
     * Returns the current status of the specified delivery channel. If a delivery channel is not specified, this action
     * returns the current status of all delivery channels associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one delivery channel per region in your account.
     * </p>
     * </note>
     * 
     * @param describeDeliveryChannelStatusRequest
     *        The input for the <a>DeliveryChannelStatus</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDeliveryChannelStatus operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeDeliveryChannelStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeDeliveryChannelStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(
            DescribeDeliveryChannelStatusRequest describeDeliveryChannelStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelStatusRequest, DescribeDeliveryChannelStatusResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDeliveryChannelStatus operation.
     *
     * @see #describeDeliveryChannelStatusAsync(DescribeDeliveryChannelStatusRequest)
     */
    java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync();

    /**
     * Simplified method form for invoking the DescribeDeliveryChannelStatus operation with an AsyncHandler.
     *
     * @see #describeDeliveryChannelStatusAsync(DescribeDeliveryChannelStatusRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelStatusRequest, DescribeDeliveryChannelStatusResult> asyncHandler);

    /**
     * <p>
     * Returns details about the specified delivery channel. If a delivery channel is not specified, this action returns
     * the details of all delivery channels associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one delivery channel per region in your account.
     * </p>
     * </note>
     * 
     * @param describeDeliveryChannelsRequest
     *        The input for the <a>DescribeDeliveryChannels</a> action.
     * @return A Java Future containing the result of the DescribeDeliveryChannels operation returned by the service.
     * @sample AmazonConfigAsync.DescribeDeliveryChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeDeliveryChannels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest describeDeliveryChannelsRequest);

    /**
     * <p>
     * Returns details about the specified delivery channel. If a delivery channel is not specified, this action returns
     * the details of all delivery channels associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one delivery channel per region in your account.
     * </p>
     * </note>
     * 
     * @param describeDeliveryChannelsRequest
     *        The input for the <a>DescribeDeliveryChannels</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDeliveryChannels operation returned by the service.
     * @sample AmazonConfigAsyncHandler.DescribeDeliveryChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeDeliveryChannels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest describeDeliveryChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelsRequest, DescribeDeliveryChannelsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDeliveryChannels operation.
     *
     * @see #describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest)
     */
    java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync();

    /**
     * Simplified method form for invoking the DescribeDeliveryChannels operation with an AsyncHandler.
     *
     * @see #describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelsRequest, DescribeDeliveryChannelsResult> asyncHandler);

    /**
     * <p>
     * Provides organization config rule deployment status for an organization.
     * </p>
     * <note>
     * <p>
     * The status is not considered successful until organization config rule is successfully deployed in all the member
     * accounts with an exception of excluded accounts.
     * </p>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response. Limit and next token are not
     * applicable if you specify organization config rule names. It is only applicable, when you request all the
     * organization config rules.
     * </p>
     * </note>
     * 
     * @param describeOrganizationConfigRuleStatusesRequest
     * @return A Java Future containing the result of the DescribeOrganizationConfigRuleStatuses operation returned by
     *         the service.
     * @sample AmazonConfigAsync.DescribeOrganizationConfigRuleStatuses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConfigRuleStatuses"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConfigRuleStatusesResult> describeOrganizationConfigRuleStatusesAsync(
            DescribeOrganizationConfigRuleStatusesRequest describeOrganizationConfigRuleStatusesRequest);

    /**
     * <p>
     * Provides organization config rule deployment status for an organization.
     * </p>
     * <note>
     * <p>
     * The status is not considered successful until organization config rule is successfully deployed in all the member
     * accounts with an exception of excluded accounts.
     * </p>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response. Limit and next token are not
     * applicable if you specify organization config rule names. It is only applicable, when you request all the
     * organization config rules.
     * </p>
     * </note>
     * 
     * @param describeOrganizationConfigRuleStatusesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOrganizationConfigRuleStatuses operation returned by
     *         the service.
     * @sample AmazonConfigAsyncHandler.DescribeOrganizationConfigRuleStatuses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConfigRuleStatuses"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConfigRuleStatusesResult> describeOrganizationConfigRuleStatusesAsync(
            DescribeOrganizationConfigRuleStatusesRequest describeOrganizationConfigRuleStatusesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrganizationConfigRuleStatusesRequest, DescribeOrganizationConfigRuleStatusesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of organization config rules.
     * </p>
     * <note>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response. Limit and next token are not
     * applicable if you specify organization config rule names. It is only applicable, when you request all the
     * organization config rules.
     * </p>
     * </note>
     * 
     * @param describeOrganizationConfigRulesRequest
     * @return A Java Future containing the result of the DescribeOrganizationConfigRules operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeOrganizationConfigRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConfigRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConfigRulesResult> describeOrganizationConfigRulesAsync(
            DescribeOrganizationConfigRulesRequest describeOrganizationConfigRulesRequest);

    /**
     * <p>
     * Returns a list of organization config rules.
     * </p>
     * <note>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response. Limit and next token are not
     * applicable if you specify organization config rule names. It is only applicable, when you request all the
     * organization config rules.
     * </p>
     * </note>
     * 
     * @param describeOrganizationConfigRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOrganizationConfigRules operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeOrganizationConfigRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConfigRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConfigRulesResult> describeOrganizationConfigRulesAsync(
            DescribeOrganizationConfigRulesRequest describeOrganizationConfigRulesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrganizationConfigRulesRequest, DescribeOrganizationConfigRulesResult> asyncHandler);

    /**
     * <p>
     * Provides organization conformance pack deployment status for an organization.
     * </p>
     * <note>
     * <p>
     * The status is not considered successful until organization conformance pack is successfully deployed in all the
     * member accounts with an exception of excluded accounts.
     * </p>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response. Limit and next token are not
     * applicable if you specify organization conformance pack names. They are only applicable, when you request all the
     * organization conformance packs.
     * </p>
     * </note>
     * 
     * @param describeOrganizationConformancePackStatusesRequest
     * @return A Java Future containing the result of the DescribeOrganizationConformancePackStatuses operation returned
     *         by the service.
     * @sample AmazonConfigAsync.DescribeOrganizationConformancePackStatuses
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConformancePackStatuses"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConformancePackStatusesResult> describeOrganizationConformancePackStatusesAsync(
            DescribeOrganizationConformancePackStatusesRequest describeOrganizationConformancePackStatusesRequest);

    /**
     * <p>
     * Provides organization conformance pack deployment status for an organization.
     * </p>
     * <note>
     * <p>
     * The status is not considered successful until organization conformance pack is successfully deployed in all the
     * member accounts with an exception of excluded accounts.
     * </p>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response. Limit and next token are not
     * applicable if you specify organization conformance pack names. They are only applicable, when you request all the
     * organization conformance packs.
     * </p>
     * </note>
     * 
     * @param describeOrganizationConformancePackStatusesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOrganizationConformancePackStatuses operation returned
     *         by the service.
     * @sample AmazonConfigAsyncHandler.DescribeOrganizationConformancePackStatuses
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConformancePackStatuses"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConformancePackStatusesResult> describeOrganizationConformancePackStatusesAsync(
            DescribeOrganizationConformancePackStatusesRequest describeOrganizationConformancePackStatusesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrganizationConformancePackStatusesRequest, DescribeOrganizationConformancePackStatusesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of organization conformance packs.
     * </p>
     * <note>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response.
     * </p>
     * <p>
     * Limit and next token are not applicable if you specify organization conformance packs names. They are only
     * applicable, when you request all the organization conformance packs.
     * </p>
     * </note>
     * 
     * @param describeOrganizationConformancePacksRequest
     * @return A Java Future containing the result of the DescribeOrganizationConformancePacks operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeOrganizationConformancePacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConformancePacks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConformancePacksResult> describeOrganizationConformancePacksAsync(
            DescribeOrganizationConformancePacksRequest describeOrganizationConformancePacksRequest);

    /**
     * <p>
     * Returns a list of organization conformance packs.
     * </p>
     * <note>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response.
     * </p>
     * <p>
     * Limit and next token are not applicable if you specify organization conformance packs names. They are only
     * applicable, when you request all the organization conformance packs.
     * </p>
     * </note>
     * 
     * @param describeOrganizationConformancePacksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOrganizationConformancePacks operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeOrganizationConformancePacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConformancePacks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConformancePacksResult> describeOrganizationConformancePacksAsync(
            DescribeOrganizationConformancePacksRequest describeOrganizationConformancePacksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrganizationConformancePacksRequest, DescribeOrganizationConformancePacksResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all pending aggregation requests.
     * </p>
     * 
     * @param describePendingAggregationRequestsRequest
     * @return A Java Future containing the result of the DescribePendingAggregationRequests operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribePendingAggregationRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribePendingAggregationRequests"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePendingAggregationRequestsResult> describePendingAggregationRequestsAsync(
            DescribePendingAggregationRequestsRequest describePendingAggregationRequestsRequest);

    /**
     * <p>
     * Returns a list of all pending aggregation requests.
     * </p>
     * 
     * @param describePendingAggregationRequestsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePendingAggregationRequests operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribePendingAggregationRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribePendingAggregationRequests"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePendingAggregationRequestsResult> describePendingAggregationRequestsAsync(
            DescribePendingAggregationRequestsRequest describePendingAggregationRequestsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePendingAggregationRequestsRequest, DescribePendingAggregationRequestsResult> asyncHandler);

    /**
     * <p>
     * Returns the details of one or more remediation configurations.
     * </p>
     * 
     * @param describeRemediationConfigurationsRequest
     * @return A Java Future containing the result of the DescribeRemediationConfigurations operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeRemediationConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRemediationConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRemediationConfigurationsResult> describeRemediationConfigurationsAsync(
            DescribeRemediationConfigurationsRequest describeRemediationConfigurationsRequest);

    /**
     * <p>
     * Returns the details of one or more remediation configurations.
     * </p>
     * 
     * @param describeRemediationConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRemediationConfigurations operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeRemediationConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRemediationConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRemediationConfigurationsResult> describeRemediationConfigurationsAsync(
            DescribeRemediationConfigurationsRequest describeRemediationConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRemediationConfigurationsRequest, DescribeRemediationConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Returns the details of one or more remediation exceptions. A detailed view of a remediation exception for a set
     * of resources that includes an explanation of an exception and the time when the exception will be deleted. When
     * you specify the limit and the next token, you receive a paginated response.
     * </p>
     * <note>
     * <p>
     * AWS Config generates a remediation exception when a problem occurs executing a remediation action to a specific
     * resource. Remediation exceptions blocks auto-remediation until the exception is cleared.
     * </p>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response.
     * </p>
     * <p>
     * Limit and next token are not applicable if you request resources in batch. It is only applicable, when you
     * request all resources.
     * </p>
     * </note>
     * 
     * @param describeRemediationExceptionsRequest
     * @return A Java Future containing the result of the DescribeRemediationExceptions operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeRemediationExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRemediationExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRemediationExceptionsResult> describeRemediationExceptionsAsync(
            DescribeRemediationExceptionsRequest describeRemediationExceptionsRequest);

    /**
     * <p>
     * Returns the details of one or more remediation exceptions. A detailed view of a remediation exception for a set
     * of resources that includes an explanation of an exception and the time when the exception will be deleted. When
     * you specify the limit and the next token, you receive a paginated response.
     * </p>
     * <note>
     * <p>
     * AWS Config generates a remediation exception when a problem occurs executing a remediation action to a specific
     * resource. Remediation exceptions blocks auto-remediation until the exception is cleared.
     * </p>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response.
     * </p>
     * <p>
     * Limit and next token are not applicable if you request resources in batch. It is only applicable, when you
     * request all resources.
     * </p>
     * </note>
     * 
     * @param describeRemediationExceptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRemediationExceptions operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeRemediationExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRemediationExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRemediationExceptionsResult> describeRemediationExceptionsAsync(
            DescribeRemediationExceptionsRequest describeRemediationExceptionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRemediationExceptionsRequest, DescribeRemediationExceptionsResult> asyncHandler);

    /**
     * <p>
     * Provides a detailed view of a Remediation Execution for a set of resources including state, timestamps for when
     * steps for the remediation execution occur, and any error messages for steps that have failed. When you specify
     * the limit and the next token, you receive a paginated response.
     * </p>
     * 
     * @param describeRemediationExecutionStatusRequest
     * @return A Java Future containing the result of the DescribeRemediationExecutionStatus operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeRemediationExecutionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRemediationExecutionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRemediationExecutionStatusResult> describeRemediationExecutionStatusAsync(
            DescribeRemediationExecutionStatusRequest describeRemediationExecutionStatusRequest);

    /**
     * <p>
     * Provides a detailed view of a Remediation Execution for a set of resources including state, timestamps for when
     * steps for the remediation execution occur, and any error messages for steps that have failed. When you specify
     * the limit and the next token, you receive a paginated response.
     * </p>
     * 
     * @param describeRemediationExecutionStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRemediationExecutionStatus operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeRemediationExecutionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRemediationExecutionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRemediationExecutionStatusResult> describeRemediationExecutionStatusAsync(
            DescribeRemediationExecutionStatusRequest describeRemediationExecutionStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRemediationExecutionStatusRequest, DescribeRemediationExecutionStatusResult> asyncHandler);

    /**
     * <p>
     * Returns the details of one or more retention configurations. If the retention configuration name is not
     * specified, this action returns the details for all the retention configurations for that account.
     * </p>
     * <note>
     * <p>
     * Currently, AWS Config supports only one retention configuration per region in your account.
     * </p>
     * </note>
     * 
     * @param describeRetentionConfigurationsRequest
     * @return A Java Future containing the result of the DescribeRetentionConfigurations operation returned by the
     *         service.
     * @sample AmazonConfigAsync.DescribeRetentionConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRetentionConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRetentionConfigurationsResult> describeRetentionConfigurationsAsync(
            DescribeRetentionConfigurationsRequest describeRetentionConfigurationsRequest);

    /**
     * <p>
     * Returns the details of one or more retention configurations. If the retention configuration name is not
     * specified, this action returns the details for all the retention configurations for that account.
     * </p>
     * <note>
     * <p>
     * Currently, AWS Config supports only one retention configuration per region in your account.
     * </p>
     * </note>
     * 
     * @param describeRetentionConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRetentionConfigurations operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.DescribeRetentionConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRetentionConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRetentionConfigurationsResult> describeRetentionConfigurationsAsync(
            DescribeRetentionConfigurationsRequest describeRetentionConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRetentionConfigurationsRequest, DescribeRetentionConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Returns the evaluation results for the specified AWS Config rule for a specific resource in a rule. The results
     * indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each
     * resource complies with the rule.
     * </p>
     * <note>
     * <p>
     * The results can return an empty result page. But if you have a <code>nextToken</code>, the results are displayed
     * on the next page.
     * </p>
     * </note>
     * 
     * @param getAggregateComplianceDetailsByConfigRuleRequest
     * @return A Java Future containing the result of the GetAggregateComplianceDetailsByConfigRule operation returned
     *         by the service.
     * @sample AmazonConfigAsync.GetAggregateComplianceDetailsByConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateComplianceDetailsByConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAggregateComplianceDetailsByConfigRuleResult> getAggregateComplianceDetailsByConfigRuleAsync(
            GetAggregateComplianceDetailsByConfigRuleRequest getAggregateComplianceDetailsByConfigRuleRequest);

    /**
     * <p>
     * Returns the evaluation results for the specified AWS Config rule for a specific resource in a rule. The results
     * indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each
     * resource complies with the rule.
     * </p>
     * <note>
     * <p>
     * The results can return an empty result page. But if you have a <code>nextToken</code>, the results are displayed
     * on the next page.
     * </p>
     * </note>
     * 
     * @param getAggregateComplianceDetailsByConfigRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAggregateComplianceDetailsByConfigRule operation returned
     *         by the service.
     * @sample AmazonConfigAsyncHandler.GetAggregateComplianceDetailsByConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateComplianceDetailsByConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAggregateComplianceDetailsByConfigRuleResult> getAggregateComplianceDetailsByConfigRuleAsync(
            GetAggregateComplianceDetailsByConfigRuleRequest getAggregateComplianceDetailsByConfigRuleRequest,
            com.amazonaws.handlers.AsyncHandler<GetAggregateComplianceDetailsByConfigRuleRequest, GetAggregateComplianceDetailsByConfigRuleResult> asyncHandler);

    /**
     * <p>
     * Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.
     * </p>
     * <note>
     * <p>
     * The results can return an empty result page, but if you have a nextToken, the results are displayed on the next
     * page.
     * </p>
     * </note>
     * 
     * @param getAggregateConfigRuleComplianceSummaryRequest
     * @return A Java Future containing the result of the GetAggregateConfigRuleComplianceSummary operation returned by
     *         the service.
     * @sample AmazonConfigAsync.GetAggregateConfigRuleComplianceSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateConfigRuleComplianceSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAggregateConfigRuleComplianceSummaryResult> getAggregateConfigRuleComplianceSummaryAsync(
            GetAggregateConfigRuleComplianceSummaryRequest getAggregateConfigRuleComplianceSummaryRequest);

    /**
     * <p>
     * Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.
     * </p>
     * <note>
     * <p>
     * The results can return an empty result page, but if you have a nextToken, the results are displayed on the next
     * page.
     * </p>
     * </note>
     * 
     * @param getAggregateConfigRuleComplianceSummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAggregateConfigRuleComplianceSummary operation returned by
     *         the service.
     * @sample AmazonConfigAsyncHandler.GetAggregateConfigRuleComplianceSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateConfigRuleComplianceSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAggregateConfigRuleComplianceSummaryResult> getAggregateConfigRuleComplianceSummaryAsync(
            GetAggregateConfigRuleComplianceSummaryRequest getAggregateConfigRuleComplianceSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetAggregateConfigRuleComplianceSummaryRequest, GetAggregateConfigRuleComplianceSummaryResult> asyncHandler);

    /**
     * <p>
     * Returns the count of compliant and noncompliant conformance packs across all AWS Accounts and AWS Regions in an
     * aggregator. You can filter based on AWS Account ID or AWS Region.
     * </p>
     * <note>
     * <p>
     * The results can return an empty result page, but if you have a nextToken, the results are displayed on the next
     * page.
     * </p>
     * </note>
     * 
     * @param getAggregateConformancePackComplianceSummaryRequest
     * @return A Java Future containing the result of the GetAggregateConformancePackComplianceSummary operation
     *         returned by the service.
     * @sample AmazonConfigAsync.GetAggregateConformancePackComplianceSummary
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateConformancePackComplianceSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAggregateConformancePackComplianceSummaryResult> getAggregateConformancePackComplianceSummaryAsync(
            GetAggregateConformancePackComplianceSummaryRequest getAggregateConformancePackComplianceSummaryRequest);

    /**
     * <p>
     * Returns the count of compliant and noncompliant conformance packs across all AWS Accounts and AWS Regions in an
     * aggregator. You can filter based on AWS Account ID or AWS Region.
     * </p>
     * <note>
     * <p>
     * The results can return an empty result page, but if you have a nextToken, the results are displayed on the next
     * page.
     * </p>
     * </note>
     * 
     * @param getAggregateConformancePackComplianceSummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAggregateConformancePackComplianceSummary operation
     *         returned by the service.
     * @sample AmazonConfigAsyncHandler.GetAggregateConformancePackComplianceSummary
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateConformancePackComplianceSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAggregateConformancePackComplianceSummaryResult> getAggregateConformancePackComplianceSummaryAsync(
            GetAggregateConformancePackComplianceSummaryRequest getAggregateConformancePackComplianceSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetAggregateConformancePackComplianceSummaryRequest, GetAggregateConformancePackComplianceSummaryResult> asyncHandler);

    /**
     * <p>
     * Returns the resource counts across accounts and regions that are present in your AWS Config aggregator. You can
     * request the resource counts by providing filters and GroupByKey.
     * </p>
     * <p>
     * For example, if the input contains accountID 12345678910 and region us-east-1 in filters, the API returns the
     * count of resources in account ID 12345678910 and region us-east-1. If the input contains ACCOUNT_ID as a
     * GroupByKey, the API returns resource counts for all source accounts that are present in your aggregator.
     * </p>
     * 
     * @param getAggregateDiscoveredResourceCountsRequest
     * @return A Java Future containing the result of the GetAggregateDiscoveredResourceCounts operation returned by the
     *         service.
     * @sample AmazonConfigAsync.GetAggregateDiscoveredResourceCounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateDiscoveredResourceCounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAggregateDiscoveredResourceCountsResult> getAggregateDiscoveredResourceCountsAsync(
            GetAggregateDiscoveredResourceCountsRequest getAggregateDiscoveredResourceCountsRequest);

    /**
     * <p>
     * Returns the resource counts across accounts and regions that are present in your AWS Config aggregator. You can
     * request the resource counts by providing filters and GroupByKey.
     * </p>
     * <p>
     * For example, if the input contains accountID 12345678910 and region us-east-1 in filters, the API returns the
     * count of resources in account ID 12345678910 and region us-east-1. If the input contains ACCOUNT_ID as a
     * GroupByKey, the API returns resource counts for all source accounts that are present in your aggregator.
     * </p>
     * 
     * @param getAggregateDiscoveredResourceCountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAggregateDiscoveredResourceCounts operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.GetAggregateDiscoveredResourceCounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateDiscoveredResourceCounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAggregateDiscoveredResourceCountsResult> getAggregateDiscoveredResourceCountsAsync(
            GetAggregateDiscoveredResourceCountsRequest getAggregateDiscoveredResourceCountsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAggregateDiscoveredResourceCountsRequest, GetAggregateDiscoveredResourceCountsResult> asyncHandler);

    /**
     * <p>
     * Returns configuration item that is aggregated for your specific resource in a specific source account and region.
     * </p>
     * 
     * @param getAggregateResourceConfigRequest
     * @return A Java Future containing the result of the GetAggregateResourceConfig operation returned by the service.
     * @sample AmazonConfigAsync.GetAggregateResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateResourceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAggregateResourceConfigResult> getAggregateResourceConfigAsync(
            GetAggregateResourceConfigRequest getAggregateResourceConfigRequest);

    /**
     * <p>
     * Returns configuration item that is aggregated for your specific resource in a specific source account and region.
     * </p>
     * 
     * @param getAggregateResourceConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAggregateResourceConfig operation returned by the service.
     * @sample AmazonConfigAsyncHandler.GetAggregateResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateResourceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAggregateResourceConfigResult> getAggregateResourceConfigAsync(
            GetAggregateResourceConfigRequest getAggregateResourceConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetAggregateResourceConfigRequest, GetAggregateResourceConfigResult> asyncHandler);

    /**
     * <p>
     * Returns the evaluation results for the specified AWS Config rule. The results indicate which AWS resources were
     * evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.
     * </p>
     * 
     * @param getComplianceDetailsByConfigRuleRequest
     * @return A Java Future containing the result of the GetComplianceDetailsByConfigRule operation returned by the
     *         service.
     * @sample AmazonConfigAsync.GetComplianceDetailsByConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceDetailsByConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetComplianceDetailsByConfigRuleResult> getComplianceDetailsByConfigRuleAsync(
            GetComplianceDetailsByConfigRuleRequest getComplianceDetailsByConfigRuleRequest);

    /**
     * <p>
     * Returns the evaluation results for the specified AWS Config rule. The results indicate which AWS resources were
     * evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.
     * </p>
     * 
     * @param getComplianceDetailsByConfigRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComplianceDetailsByConfigRule operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.GetComplianceDetailsByConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceDetailsByConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetComplianceDetailsByConfigRuleResult> getComplianceDetailsByConfigRuleAsync(
            GetComplianceDetailsByConfigRuleRequest getComplianceDetailsByConfigRuleRequest,
            com.amazonaws.handlers.AsyncHandler<GetComplianceDetailsByConfigRuleRequest, GetComplianceDetailsByConfigRuleResult> asyncHandler);

    /**
     * <p>
     * Returns the evaluation results for the specified AWS resource. The results indicate which AWS Config rules were
     * used to evaluate the resource, when each rule was last used, and whether the resource complies with each rule.
     * </p>
     * 
     * @param getComplianceDetailsByResourceRequest
     * @return A Java Future containing the result of the GetComplianceDetailsByResource operation returned by the
     *         service.
     * @sample AmazonConfigAsync.GetComplianceDetailsByResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceDetailsByResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetComplianceDetailsByResourceResult> getComplianceDetailsByResourceAsync(
            GetComplianceDetailsByResourceRequest getComplianceDetailsByResourceRequest);

    /**
     * <p>
     * Returns the evaluation results for the specified AWS resource. The results indicate which AWS Config rules were
     * used to evaluate the resource, when each rule was last used, and whether the resource complies with each rule.
     * </p>
     * 
     * @param getComplianceDetailsByResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComplianceDetailsByResource operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.GetComplianceDetailsByResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceDetailsByResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetComplianceDetailsByResourceResult> getComplianceDetailsByResourceAsync(
            GetComplianceDetailsByResourceRequest getComplianceDetailsByResourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetComplianceDetailsByResourceRequest, GetComplianceDetailsByResourceResult> asyncHandler);

    /**
     * <p>
     * Returns the number of AWS Config rules that are compliant and noncompliant, up to a maximum of 25 for each.
     * </p>
     * 
     * @param getComplianceSummaryByConfigRuleRequest
     * @return A Java Future containing the result of the GetComplianceSummaryByConfigRule operation returned by the
     *         service.
     * @sample AmazonConfigAsync.GetComplianceSummaryByConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceSummaryByConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(
            GetComplianceSummaryByConfigRuleRequest getComplianceSummaryByConfigRuleRequest);

    /**
     * <p>
     * Returns the number of AWS Config rules that are compliant and noncompliant, up to a maximum of 25 for each.
     * </p>
     * 
     * @param getComplianceSummaryByConfigRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComplianceSummaryByConfigRule operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.GetComplianceSummaryByConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceSummaryByConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(
            GetComplianceSummaryByConfigRuleRequest getComplianceSummaryByConfigRuleRequest,
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByConfigRuleRequest, GetComplianceSummaryByConfigRuleResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetComplianceSummaryByConfigRule operation.
     *
     * @see #getComplianceSummaryByConfigRuleAsync(GetComplianceSummaryByConfigRuleRequest)
     */
    java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync();

    /**
     * Simplified method form for invoking the GetComplianceSummaryByConfigRule operation with an AsyncHandler.
     *
     * @see #getComplianceSummaryByConfigRuleAsync(GetComplianceSummaryByConfigRuleRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByConfigRuleRequest, GetComplianceSummaryByConfigRuleResult> asyncHandler);

    /**
     * <p>
     * Returns the number of resources that are compliant and the number that are noncompliant. You can specify one or
     * more resource types to get these numbers for each resource type. The maximum number returned is 100.
     * </p>
     * 
     * @param getComplianceSummaryByResourceTypeRequest
     * @return A Java Future containing the result of the GetComplianceSummaryByResourceType operation returned by the
     *         service.
     * @sample AmazonConfigAsync.GetComplianceSummaryByResourceType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceSummaryByResourceType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(
            GetComplianceSummaryByResourceTypeRequest getComplianceSummaryByResourceTypeRequest);

    /**
     * <p>
     * Returns the number of resources that are compliant and the number that are noncompliant. You can specify one or
     * more resource types to get these numbers for each resource type. The maximum number returned is 100.
     * </p>
     * 
     * @param getComplianceSummaryByResourceTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComplianceSummaryByResourceType operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.GetComplianceSummaryByResourceType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceSummaryByResourceType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(
            GetComplianceSummaryByResourceTypeRequest getComplianceSummaryByResourceTypeRequest,
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByResourceTypeRequest, GetComplianceSummaryByResourceTypeResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetComplianceSummaryByResourceType operation.
     *
     * @see #getComplianceSummaryByResourceTypeAsync(GetComplianceSummaryByResourceTypeRequest)
     */
    java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync();

    /**
     * Simplified method form for invoking the GetComplianceSummaryByResourceType operation with an AsyncHandler.
     *
     * @see #getComplianceSummaryByResourceTypeAsync(GetComplianceSummaryByResourceTypeRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByResourceTypeRequest, GetComplianceSummaryByResourceTypeResult> asyncHandler);

    /**
     * <p>
     * Returns compliance details of a conformance pack for all AWS resources that are monitered by conformance pack.
     * </p>
     * 
     * @param getConformancePackComplianceDetailsRequest
     * @return A Java Future containing the result of the GetConformancePackComplianceDetails operation returned by the
     *         service.
     * @sample AmazonConfigAsync.GetConformancePackComplianceDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetConformancePackComplianceDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConformancePackComplianceDetailsResult> getConformancePackComplianceDetailsAsync(
            GetConformancePackComplianceDetailsRequest getConformancePackComplianceDetailsRequest);

    /**
     * <p>
     * Returns compliance details of a conformance pack for all AWS resources that are monitered by conformance pack.
     * </p>
     * 
     * @param getConformancePackComplianceDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConformancePackComplianceDetails operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.GetConformancePackComplianceDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetConformancePackComplianceDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConformancePackComplianceDetailsResult> getConformancePackComplianceDetailsAsync(
            GetConformancePackComplianceDetailsRequest getConformancePackComplianceDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetConformancePackComplianceDetailsRequest, GetConformancePackComplianceDetailsResult> asyncHandler);

    /**
     * <p>
     * Returns compliance details for the conformance pack based on the cumulative compliance results of all the rules
     * in that conformance pack.
     * </p>
     * 
     * @param getConformancePackComplianceSummaryRequest
     * @return A Java Future containing the result of the GetConformancePackComplianceSummary operation returned by the
     *         service.
     * @sample AmazonConfigAsync.GetConformancePackComplianceSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetConformancePackComplianceSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConformancePackComplianceSummaryResult> getConformancePackComplianceSummaryAsync(
            GetConformancePackComplianceSummaryRequest getConformancePackComplianceSummaryRequest);

    /**
     * <p>
     * Returns compliance details for the conformance pack based on the cumulative compliance results of all the rules
     * in that conformance pack.
     * </p>
     * 
     * @param getConformancePackComplianceSummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConformancePackComplianceSummary operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.GetConformancePackComplianceSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetConformancePackComplianceSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConformancePackComplianceSummaryResult> getConformancePackComplianceSummaryAsync(
            GetConformancePackComplianceSummaryRequest getConformancePackComplianceSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetConformancePackComplianceSummaryRequest, GetConformancePackComplianceSummaryResult> asyncHandler);

    /**
     * <p>
     * Returns the resource types, the number of each resource type, and the total number of resources that AWS Config
     * is recording in this region for your AWS account.
     * </p>
     * <p class="title">
     * <b>Example</b>
     * </p>
     * <ol>
     * <li>
     * <p>
     * AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20
     * IAM users, and 15 S3 buckets.
     * </p>
     * </li>
     * <li>
     * <p>
     * You make a call to the <code>GetDiscoveredResourceCounts</code> action and specify that you want all resource
     * types.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Config returns the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource types (EC2 instances, IAM users, and S3 buckets).
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of each resource type (25, 20, and 15).
     * </p>
     * </li>
     * <li>
     * <p>
     * The total number of all resources (60).
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ol>
     * <p>
     * The response is paginated. By default, AWS Config lists 100 <a>ResourceCount</a> objects on each page. You can
     * customize this number with the <code>limit</code> parameter. The response includes a <code>nextToken</code>
     * string. To get the next page of results, run the request again and specify the string for the
     * <code>nextToken</code> parameter.
     * </p>
     * <note>
     * <p>
     * If you make a call to the <a>GetDiscoveredResourceCounts</a> action, you might not immediately receive resource
     * counts in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You are a new AWS Config customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * You just enabled resource recording.
     * </p>
     * </li>
     * </ul>
     * <p>
     * It might take a few minutes for AWS Config to record and count your resources. Wait a few minutes and then retry
     * the <a>GetDiscoveredResourceCounts</a> action.
     * </p>
     * </note>
     * 
     * @param getDiscoveredResourceCountsRequest
     * @return A Java Future containing the result of the GetDiscoveredResourceCounts operation returned by the service.
     * @sample AmazonConfigAsync.GetDiscoveredResourceCounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetDiscoveredResourceCounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDiscoveredResourceCountsResult> getDiscoveredResourceCountsAsync(
            GetDiscoveredResourceCountsRequest getDiscoveredResourceCountsRequest);

    /**
     * <p>
     * Returns the resource types, the number of each resource type, and the total number of resources that AWS Config
     * is recording in this region for your AWS account.
     * </p>
     * <p class="title">
     * <b>Example</b>
     * </p>
     * <ol>
     * <li>
     * <p>
     * AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20
     * IAM users, and 15 S3 buckets.
     * </p>
     * </li>
     * <li>
     * <p>
     * You make a call to the <code>GetDiscoveredResourceCounts</code> action and specify that you want all resource
     * types.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Config returns the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource types (EC2 instances, IAM users, and S3 buckets).
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of each resource type (25, 20, and 15).
     * </p>
     * </li>
     * <li>
     * <p>
     * The total number of all resources (60).
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ol>
     * <p>
     * The response is paginated. By default, AWS Config lists 100 <a>ResourceCount</a> objects on each page. You can
     * customize this number with the <code>limit</code> parameter. The response includes a <code>nextToken</code>
     * string. To get the next page of results, run the request again and specify the string for the
     * <code>nextToken</code> parameter.
     * </p>
     * <note>
     * <p>
     * If you make a call to the <a>GetDiscoveredResourceCounts</a> action, you might not immediately receive resource
     * counts in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You are a new AWS Config customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * You just enabled resource recording.
     * </p>
     * </li>
     * </ul>
     * <p>
     * It might take a few minutes for AWS Config to record and count your resources. Wait a few minutes and then retry
     * the <a>GetDiscoveredResourceCounts</a> action.
     * </p>
     * </note>
     * 
     * @param getDiscoveredResourceCountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDiscoveredResourceCounts operation returned by the service.
     * @sample AmazonConfigAsyncHandler.GetDiscoveredResourceCounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetDiscoveredResourceCounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDiscoveredResourceCountsResult> getDiscoveredResourceCountsAsync(
            GetDiscoveredResourceCountsRequest getDiscoveredResourceCountsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDiscoveredResourceCountsRequest, GetDiscoveredResourceCountsResult> asyncHandler);

    /**
     * <p>
     * Returns detailed status for each member account within an organization for a given organization config rule.
     * </p>
     * 
     * @param getOrganizationConfigRuleDetailedStatusRequest
     * @return A Java Future containing the result of the GetOrganizationConfigRuleDetailedStatus operation returned by
     *         the service.
     * @sample AmazonConfigAsync.GetOrganizationConfigRuleDetailedStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetOrganizationConfigRuleDetailedStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOrganizationConfigRuleDetailedStatusResult> getOrganizationConfigRuleDetailedStatusAsync(
            GetOrganizationConfigRuleDetailedStatusRequest getOrganizationConfigRuleDetailedStatusRequest);

    /**
     * <p>
     * Returns detailed status for each member account within an organization for a given organization config rule.
     * </p>
     * 
     * @param getOrganizationConfigRuleDetailedStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOrganizationConfigRuleDetailedStatus operation returned by
     *         the service.
     * @sample AmazonConfigAsyncHandler.GetOrganizationConfigRuleDetailedStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetOrganizationConfigRuleDetailedStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOrganizationConfigRuleDetailedStatusResult> getOrganizationConfigRuleDetailedStatusAsync(
            GetOrganizationConfigRuleDetailedStatusRequest getOrganizationConfigRuleDetailedStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetOrganizationConfigRuleDetailedStatusRequest, GetOrganizationConfigRuleDetailedStatusResult> asyncHandler);

    /**
     * <p>
     * Returns detailed status for each member account within an organization for a given organization conformance pack.
     * </p>
     * 
     * @param getOrganizationConformancePackDetailedStatusRequest
     * @return A Java Future containing the result of the GetOrganizationConformancePackDetailedStatus operation
     *         returned by the service.
     * @sample AmazonConfigAsync.GetOrganizationConformancePackDetailedStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetOrganizationConformancePackDetailedStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOrganizationConformancePackDetailedStatusResult> getOrganizationConformancePackDetailedStatusAsync(
            GetOrganizationConformancePackDetailedStatusRequest getOrganizationConformancePackDetailedStatusRequest);

    /**
     * <p>
     * Returns detailed status for each member account within an organization for a given organization conformance pack.
     * </p>
     * 
     * @param getOrganizationConformancePackDetailedStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOrganizationConformancePackDetailedStatus operation
     *         returned by the service.
     * @sample AmazonConfigAsyncHandler.GetOrganizationConformancePackDetailedStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetOrganizationConformancePackDetailedStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOrganizationConformancePackDetailedStatusResult> getOrganizationConformancePackDetailedStatusAsync(
            GetOrganizationConformancePackDetailedStatusRequest getOrganizationConformancePackDetailedStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetOrganizationConformancePackDetailedStatusRequest, GetOrganizationConformancePackDetailedStatusResult> asyncHandler);

    /**
     * <p>
     * Returns a list of configuration items for the specified resource. The list contains details about each state of
     * the resource during the specified time interval. If you specified a retention period to retain your
     * <code>ConfigurationItems</code> between a minimum of 30 days and a maximum of 7 years (2557 days), AWS Config
     * returns the <code>ConfigurationItems</code> for the specified retention period.
     * </p>
     * <p>
     * The response is paginated. By default, AWS Config returns a limit of 10 configuration items per page. You can
     * customize this number with the <code>limit</code> parameter. The response includes a <code>nextToken</code>
     * string. To get the next page of results, run the request again and specify the string for the
     * <code>nextToken</code> parameter.
     * </p>
     * <note>
     * <p>
     * Each call to the API is limited to span a duration of seven days. It is likely that the number of records
     * returned is smaller than the specified <code>limit</code>. In such cases, you can make another call, using the
     * <code>nextToken</code>.
     * </p>
     * </note>
     * 
     * @param getResourceConfigHistoryRequest
     *        The input for the <a>GetResourceConfigHistory</a> action.
     * @return A Java Future containing the result of the GetResourceConfigHistory operation returned by the service.
     * @sample AmazonConfigAsync.GetResourceConfigHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetResourceConfigHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceConfigHistoryResult> getResourceConfigHistoryAsync(GetResourceConfigHistoryRequest getResourceConfigHistoryRequest);

    /**
     * <p>
     * Returns a list of configuration items for the specified resource. The list contains details about each state of
     * the resource during the specified time interval. If you specified a retention period to retain your
     * <code>ConfigurationItems</code> between a minimum of 30 days and a maximum of 7 years (2557 days), AWS Config
     * returns the <code>ConfigurationItems</code> for the specified retention period.
     * </p>
     * <p>
     * The response is paginated. By default, AWS Config returns a limit of 10 configuration items per page. You can
     * customize this number with the <code>limit</code> parameter. The response includes a <code>nextToken</code>
     * string. To get the next page of results, run the request again and specify the string for the
     * <code>nextToken</code> parameter.
     * </p>
     * <note>
     * <p>
     * Each call to the API is limited to span a duration of seven days. It is likely that the number of records
     * returned is smaller than the specified <code>limit</code>. In such cases, you can make another call, using the
     * <code>nextToken</code>.
     * </p>
     * </note>
     * 
     * @param getResourceConfigHistoryRequest
     *        The input for the <a>GetResourceConfigHistory</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceConfigHistory operation returned by the service.
     * @sample AmazonConfigAsyncHandler.GetResourceConfigHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetResourceConfigHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceConfigHistoryResult> getResourceConfigHistoryAsync(GetResourceConfigHistoryRequest getResourceConfigHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceConfigHistoryRequest, GetResourceConfigHistoryResult> asyncHandler);

    /**
     * <p>
     * Returns the details of a specific stored query.
     * </p>
     * 
     * @param getStoredQueryRequest
     * @return A Java Future containing the result of the GetStoredQuery operation returned by the service.
     * @sample AmazonConfigAsync.GetStoredQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetStoredQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStoredQueryResult> getStoredQueryAsync(GetStoredQueryRequest getStoredQueryRequest);

    /**
     * <p>
     * Returns the details of a specific stored query.
     * </p>
     * 
     * @param getStoredQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStoredQuery operation returned by the service.
     * @sample AmazonConfigAsyncHandler.GetStoredQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetStoredQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStoredQueryResult> getStoredQueryAsync(GetStoredQueryRequest getStoredQueryRequest,
            com.amazonaws.handlers.AsyncHandler<GetStoredQueryRequest, GetStoredQueryResult> asyncHandler);

    /**
     * <p>
     * Accepts a resource type and returns a list of resource identifiers that are aggregated for a specific resource
     * type across accounts and regions. A resource identifier includes the resource type, ID, (if available) the custom
     * resource name, source account, and source region. You can narrow the results to include only resources that have
     * specific resource IDs, or a resource name, or source account ID, or source region.
     * </p>
     * <p>
     * For example, if the input consists of accountID 12345678910 and the region is us-east-1 for resource type
     * <code>AWS::EC2::Instance</code> then the API returns all the EC2 instance identifiers of accountID 12345678910
     * and region us-east-1.
     * </p>
     * 
     * @param listAggregateDiscoveredResourcesRequest
     * @return A Java Future containing the result of the ListAggregateDiscoveredResources operation returned by the
     *         service.
     * @sample AmazonConfigAsync.ListAggregateDiscoveredResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListAggregateDiscoveredResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAggregateDiscoveredResourcesResult> listAggregateDiscoveredResourcesAsync(
            ListAggregateDiscoveredResourcesRequest listAggregateDiscoveredResourcesRequest);

    /**
     * <p>
     * Accepts a resource type and returns a list of resource identifiers that are aggregated for a specific resource
     * type across accounts and regions. A resource identifier includes the resource type, ID, (if available) the custom
     * resource name, source account, and source region. You can narrow the results to include only resources that have
     * specific resource IDs, or a resource name, or source account ID, or source region.
     * </p>
     * <p>
     * For example, if the input consists of accountID 12345678910 and the region is us-east-1 for resource type
     * <code>AWS::EC2::Instance</code> then the API returns all the EC2 instance identifiers of accountID 12345678910
     * and region us-east-1.
     * </p>
     * 
     * @param listAggregateDiscoveredResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAggregateDiscoveredResources operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.ListAggregateDiscoveredResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListAggregateDiscoveredResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAggregateDiscoveredResourcesResult> listAggregateDiscoveredResourcesAsync(
            ListAggregateDiscoveredResourcesRequest listAggregateDiscoveredResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAggregateDiscoveredResourcesRequest, ListAggregateDiscoveredResourcesResult> asyncHandler);

    /**
     * <p>
     * Accepts a resource type and returns a list of resource identifiers for the resources of that type. A resource
     * identifier includes the resource type, ID, and (if available) the custom resource name. The results consist of
     * resources that AWS Config has discovered, including those that AWS Config is not currently recording. You can
     * narrow the results to include only resources that have specific resource IDs or a resource name.
     * </p>
     * <note>
     * <p>
     * You can specify either resource IDs or a resource name, but not both, in the same request.
     * </p>
     * </note>
     * <p>
     * The response is paginated. By default, AWS Config lists 100 resource identifiers on each page. You can customize
     * this number with the <code>limit</code> parameter. The response includes a <code>nextToken</code> string. To get
     * the next page of results, run the request again and specify the string for the <code>nextToken</code> parameter.
     * </p>
     * 
     * @param listDiscoveredResourcesRequest
     * @return A Java Future containing the result of the ListDiscoveredResources operation returned by the service.
     * @sample AmazonConfigAsync.ListDiscoveredResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListDiscoveredResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(ListDiscoveredResourcesRequest listDiscoveredResourcesRequest);

    /**
     * <p>
     * Accepts a resource type and returns a list of resource identifiers for the resources of that type. A resource
     * identifier includes the resource type, ID, and (if available) the custom resource name. The results consist of
     * resources that AWS Config has discovered, including those that AWS Config is not currently recording. You can
     * narrow the results to include only resources that have specific resource IDs or a resource name.
     * </p>
     * <note>
     * <p>
     * You can specify either resource IDs or a resource name, but not both, in the same request.
     * </p>
     * </note>
     * <p>
     * The response is paginated. By default, AWS Config lists 100 resource identifiers on each page. You can customize
     * this number with the <code>limit</code> parameter. The response includes a <code>nextToken</code> string. To get
     * the next page of results, run the request again and specify the string for the <code>nextToken</code> parameter.
     * </p>
     * 
     * @param listDiscoveredResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDiscoveredResources operation returned by the service.
     * @sample AmazonConfigAsyncHandler.ListDiscoveredResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListDiscoveredResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(ListDiscoveredResourcesRequest listDiscoveredResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDiscoveredResourcesRequest, ListDiscoveredResourcesResult> asyncHandler);

    /**
     * <p>
     * Lists the stored queries for a single AWS account and a single AWS Region. The default is 100.
     * </p>
     * 
     * @param listStoredQueriesRequest
     * @return A Java Future containing the result of the ListStoredQueries operation returned by the service.
     * @sample AmazonConfigAsync.ListStoredQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListStoredQueries" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStoredQueriesResult> listStoredQueriesAsync(ListStoredQueriesRequest listStoredQueriesRequest);

    /**
     * <p>
     * Lists the stored queries for a single AWS account and a single AWS Region. The default is 100.
     * </p>
     * 
     * @param listStoredQueriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStoredQueries operation returned by the service.
     * @sample AmazonConfigAsyncHandler.ListStoredQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListStoredQueries" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStoredQueriesResult> listStoredQueriesAsync(ListStoredQueriesRequest listStoredQueriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListStoredQueriesRequest, ListStoredQueriesResult> asyncHandler);

    /**
     * <p>
     * List the tags for AWS Config resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonConfigAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List the tags for AWS Config resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonConfigAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Authorizes the aggregator account and region to collect data from the source account and region.
     * </p>
     * 
     * @param putAggregationAuthorizationRequest
     * @return A Java Future containing the result of the PutAggregationAuthorization operation returned by the service.
     * @sample AmazonConfigAsync.PutAggregationAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutAggregationAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAggregationAuthorizationResult> putAggregationAuthorizationAsync(
            PutAggregationAuthorizationRequest putAggregationAuthorizationRequest);

    /**
     * <p>
     * Authorizes the aggregator account and region to collect data from the source account and region.
     * </p>
     * 
     * @param putAggregationAuthorizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAggregationAuthorization operation returned by the service.
     * @sample AmazonConfigAsyncHandler.PutAggregationAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutAggregationAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAggregationAuthorizationResult> putAggregationAuthorizationAsync(
            PutAggregationAuthorizationRequest putAggregationAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<PutAggregationAuthorizationRequest, PutAggregationAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Adds or updates an AWS Config rule for evaluating whether your AWS resources comply with your desired
     * configurations.
     * </p>
     * <p>
     * You can use this action for custom AWS Config rules and AWS managed Config rules. A custom AWS Config rule is a
     * rule that you develop and maintain. An AWS managed Config rule is a customizable, predefined rule that AWS Config
     * provides.
     * </p>
     * <p>
     * If you are adding a new custom AWS Config rule, you must first create the AWS Lambda function that the rule
     * invokes to evaluate your resources. When you use the <code>PutConfigRule</code> action to add the rule to AWS
     * Config, you must specify the Amazon Resource Name (ARN) that AWS Lambda assigns to the function. Specify the ARN
     * for the <code>SourceIdentifier</code> key. This key is part of the <code>Source</code> object, which is part of
     * the <code>ConfigRule</code> object.
     * </p>
     * <p>
     * If you are adding an AWS managed Config rule, specify the rule's identifier for the <code>SourceIdentifier</code>
     * key. To reference AWS managed Config rule identifiers, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">About AWS
     * Managed Config Rules</a>.
     * </p>
     * <p>
     * For any new rule that you add, specify the <code>ConfigRuleName</code> in the <code>ConfigRule</code> object. Do
     * not specify the <code>ConfigRuleArn</code> or the <code>ConfigRuleId</code>. These values are generated by AWS
     * Config for new rules.
     * </p>
     * <p>
     * If you are updating a rule that you added previously, you can specify the rule by <code>ConfigRuleName</code>,
     * <code>ConfigRuleId</code>, or <code>ConfigRuleArn</code> in the <code>ConfigRule</code> data type that you use in
     * this request.
     * </p>
     * <p>
     * The maximum number of rules that AWS Config supports is 150.
     * </p>
     * <p>
     * For information about requesting a rule limit increase, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_config">AWS Config Limits</a>
     * in the <i>AWS General Reference Guide</i>.
     * </p>
     * <p>
     * For more information about developing and using AWS Config rules, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html">Evaluating AWS Resource
     * Configurations with AWS Config</a> in the <i>AWS Config Developer Guide</i>.
     * </p>
     * 
     * @param putConfigRuleRequest
     * @return A Java Future containing the result of the PutConfigRule operation returned by the service.
     * @sample AmazonConfigAsync.PutConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConfigRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutConfigRuleResult> putConfigRuleAsync(PutConfigRuleRequest putConfigRuleRequest);

    /**
     * <p>
     * Adds or updates an AWS Config rule for evaluating whether your AWS resources comply with your desired
     * configurations.
     * </p>
     * <p>
     * You can use this action for custom AWS Config rules and AWS managed Config rules. A custom AWS Config rule is a
     * rule that you develop and maintain. An AWS managed Config rule is a customizable, predefined rule that AWS Config
     * provides.
     * </p>
     * <p>
     * If you are adding a new custom AWS Config rule, you must first create the AWS Lambda function that the rule
     * invokes to evaluate your resources. When you use the <code>PutConfigRule</code> action to add the rule to AWS
     * Config, you must specify the Amazon Resource Name (ARN) that AWS Lambda assigns to the function. Specify the ARN
     * for the <code>SourceIdentifier</code> key. This key is part of the <code>Source</code> object, which is part of
     * the <code>ConfigRule</code> object.
     * </p>
     * <p>
     * If you are adding an AWS managed Config rule, specify the rule's identifier for the <code>SourceIdentifier</code>
     * key. To reference AWS managed Config rule identifiers, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">About AWS
     * Managed Config Rules</a>.
     * </p>
     * <p>
     * For any new rule that you add, specify the <code>ConfigRuleName</code> in the <code>ConfigRule</code> object. Do
     * not specify the <code>ConfigRuleArn</code> or the <code>ConfigRuleId</code>. These values are generated by AWS
     * Config for new rules.
     * </p>
     * <p>
     * If you are updating a rule that you added previously, you can specify the rule by <code>ConfigRuleName</code>,
     * <code>ConfigRuleId</code>, or <code>ConfigRuleArn</code> in the <code>ConfigRule</code> data type that you use in
     * this request.
     * </p>
     * <p>
     * The maximum number of rules that AWS Config supports is 150.
     * </p>
     * <p>
     * For information about requesting a rule limit increase, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_config">AWS Config Limits</a>
     * in the <i>AWS General Reference Guide</i>.
     * </p>
     * <p>
     * For more information about developing and using AWS Config rules, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html">Evaluating AWS Resource
     * Configurations with AWS Config</a> in the <i>AWS Config Developer Guide</i>.
     * </p>
     * 
     * @param putConfigRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutConfigRule operation returned by the service.
     * @sample AmazonConfigAsyncHandler.PutConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConfigRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutConfigRuleResult> putConfigRuleAsync(PutConfigRuleRequest putConfigRuleRequest,
            com.amazonaws.handlers.AsyncHandler<PutConfigRuleRequest, PutConfigRuleResult> asyncHandler);

    /**
     * <p>
     * Creates and updates the configuration aggregator with the selected source accounts and regions. The source
     * account can be individual account(s) or an organization.
     * </p>
     * <p>
     * <code>accountIds</code> that are passed will be replaced with existing accounts. If you want to add additional
     * accounts into the aggregator, call <code>DescribeAggregator</code> to get the previous accounts and then append
     * new ones.
     * </p>
     * <note>
     * <p>
     * AWS Config should be enabled in source accounts and regions you want to aggregate.
     * </p>
     * <p>
     * If your source type is an organization, you must be signed in to the management account or a registered delegated
     * administrator and all the features must be enabled in your organization. If the caller is a management account,
     * AWS Config calls <code>EnableAwsServiceAccess</code> API to enable integration between AWS Config and AWS
     * Organizations. If the caller is a registered delegated administrator, AWS Config calls
     * <code>ListDelegatedAdministrators</code> API to verify whether the caller is a valid delegated administrator.
     * </p>
     * <p>
     * To register a delegated administrator, see <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/set-up-aggregator-cli.html#register-a-delegated-administrator-cli"
     * >Register a Delegated Administrator</a> in the AWS Config developer guide.
     * </p>
     * </note>
     * 
     * @param putConfigurationAggregatorRequest
     * @return A Java Future containing the result of the PutConfigurationAggregator operation returned by the service.
     * @sample AmazonConfigAsync.PutConfigurationAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConfigurationAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConfigurationAggregatorResult> putConfigurationAggregatorAsync(
            PutConfigurationAggregatorRequest putConfigurationAggregatorRequest);

    /**
     * <p>
     * Creates and updates the configuration aggregator with the selected source accounts and regions. The source
     * account can be individual account(s) or an organization.
     * </p>
     * <p>
     * <code>accountIds</code> that are passed will be replaced with existing accounts. If you want to add additional
     * accounts into the aggregator, call <code>DescribeAggregator</code> to get the previous accounts and then append
     * new ones.
     * </p>
     * <note>
     * <p>
     * AWS Config should be enabled in source accounts and regions you want to aggregate.
     * </p>
     * <p>
     * If your source type is an organization, you must be signed in to the management account or a registered delegated
     * administrator and all the features must be enabled in your organization. If the caller is a management account,
     * AWS Config calls <code>EnableAwsServiceAccess</code> API to enable integration between AWS Config and AWS
     * Organizations. If the caller is a registered delegated administrator, AWS Config calls
     * <code>ListDelegatedAdministrators</code> API to verify whether the caller is a valid delegated administrator.
     * </p>
     * <p>
     * To register a delegated administrator, see <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/set-up-aggregator-cli.html#register-a-delegated-administrator-cli"
     * >Register a Delegated Administrator</a> in the AWS Config developer guide.
     * </p>
     * </note>
     * 
     * @param putConfigurationAggregatorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutConfigurationAggregator operation returned by the service.
     * @sample AmazonConfigAsyncHandler.PutConfigurationAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConfigurationAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConfigurationAggregatorResult> putConfigurationAggregatorAsync(
            PutConfigurationAggregatorRequest putConfigurationAggregatorRequest,
            com.amazonaws.handlers.AsyncHandler<PutConfigurationAggregatorRequest, PutConfigurationAggregatorResult> asyncHandler);

    /**
     * <p>
     * Creates a new configuration recorder to record the selected resource configurations.
     * </p>
     * <p>
     * You can use this action to change the role <code>roleARN</code> or the <code>recordingGroup</code> of an existing
     * recorder. To change the role, call the action on the existing configuration recorder and specify a role.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per region in your account.
     * </p>
     * <p>
     * If <code>ConfigurationRecorder</code> does not have the <b>recordingGroup</b> parameter specified, the default is
     * to record all supported resource types.
     * </p>
     * </note>
     * 
     * @param putConfigurationRecorderRequest
     *        The input for the <a>PutConfigurationRecorder</a> action.
     * @return A Java Future containing the result of the PutConfigurationRecorder operation returned by the service.
     * @sample AmazonConfigAsync.PutConfigurationRecorder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConfigurationRecorder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConfigurationRecorderResult> putConfigurationRecorderAsync(PutConfigurationRecorderRequest putConfigurationRecorderRequest);

    /**
     * <p>
     * Creates a new configuration recorder to record the selected resource configurations.
     * </p>
     * <p>
     * You can use this action to change the role <code>roleARN</code> or the <code>recordingGroup</code> of an existing
     * recorder. To change the role, call the action on the existing configuration recorder and specify a role.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per region in your account.
     * </p>
     * <p>
     * If <code>ConfigurationRecorder</code> does not have the <b>recordingGroup</b> parameter specified, the default is
     * to record all supported resource types.
     * </p>
     * </note>
     * 
     * @param putConfigurationRecorderRequest
     *        The input for the <a>PutConfigurationRecorder</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutConfigurationRecorder operation returned by the service.
     * @sample AmazonConfigAsyncHandler.PutConfigurationRecorder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConfigurationRecorder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConfigurationRecorderResult> putConfigurationRecorderAsync(PutConfigurationRecorderRequest putConfigurationRecorderRequest,
            com.amazonaws.handlers.AsyncHandler<PutConfigurationRecorderRequest, PutConfigurationRecorderResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a conformance pack. A conformance pack is a collection of AWS Config rules that can be easily
     * deployed in an account and a region and across AWS Organization.
     * </p>
     * <p>
     * This API creates a service linked role <code>AWSServiceRoleForConfigConforms</code> in your account. The service
     * linked role is created only when the role does not exist in your account.
     * </p>
     * <note>
     * <p>
     * You must specify either the <code>TemplateS3Uri</code> or the <code>TemplateBody</code> parameter, but not both.
     * If you provide both AWS Config uses the <code>TemplateS3Uri</code> parameter and ignores the
     * <code>TemplateBody</code> parameter.
     * </p>
     * </note>
     * 
     * @param putConformancePackRequest
     * @return A Java Future containing the result of the PutConformancePack operation returned by the service.
     * @sample AmazonConfigAsync.PutConformancePack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConformancePack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutConformancePackResult> putConformancePackAsync(PutConformancePackRequest putConformancePackRequest);

    /**
     * <p>
     * Creates or updates a conformance pack. A conformance pack is a collection of AWS Config rules that can be easily
     * deployed in an account and a region and across AWS Organization.
     * </p>
     * <p>
     * This API creates a service linked role <code>AWSServiceRoleForConfigConforms</code> in your account. The service
     * linked role is created only when the role does not exist in your account.
     * </p>
     * <note>
     * <p>
     * You must specify either the <code>TemplateS3Uri</code> or the <code>TemplateBody</code> parameter, but not both.
     * If you provide both AWS Config uses the <code>TemplateS3Uri</code> parameter and ignores the
     * <code>TemplateBody</code> parameter.
     * </p>
     * </note>
     * 
     * @param putConformancePackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutConformancePack operation returned by the service.
     * @sample AmazonConfigAsyncHandler.PutConformancePack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConformancePack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutConformancePackResult> putConformancePackAsync(PutConformancePackRequest putConformancePackRequest,
            com.amazonaws.handlers.AsyncHandler<PutConformancePackRequest, PutConformancePackResult> asyncHandler);

    /**
     * <p>
     * Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS
     * topic.
     * </p>
     * <p>
     * Before you can create a delivery channel, you must create a configuration recorder.
     * </p>
     * <p>
     * You can use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery channel.
     * To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the changed values for the S3
     * bucket and the SNS topic. If you specify a different value for either the S3 bucket or the SNS topic, this action
     * will keep the existing value for the parameter that is not changed.
     * </p>
     * <note>
     * <p>
     * You can have only one delivery channel per region in your account.
     * </p>
     * </note>
     * 
     * @param putDeliveryChannelRequest
     *        The input for the <a>PutDeliveryChannel</a> action.
     * @return A Java Future containing the result of the PutDeliveryChannel operation returned by the service.
     * @sample AmazonConfigAsync.PutDeliveryChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutDeliveryChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutDeliveryChannelResult> putDeliveryChannelAsync(PutDeliveryChannelRequest putDeliveryChannelRequest);

    /**
     * <p>
     * Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS
     * topic.
     * </p>
     * <p>
     * Before you can create a delivery channel, you must create a configuration recorder.
     * </p>
     * <p>
     * You can use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery channel.
     * To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the changed values for the S3
     * bucket and the SNS topic. If you specify a different value for either the S3 bucket or the SNS topic, this action
     * will keep the existing value for the parameter that is not changed.
     * </p>
     * <note>
     * <p>
     * You can have only one delivery channel per region in your account.
     * </p>
     * </note>
     * 
     * @param putDeliveryChannelRequest
     *        The input for the <a>PutDeliveryChannel</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDeliveryChannel operation returned by the service.
     * @sample AmazonConfigAsyncHandler.PutDeliveryChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutDeliveryChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutDeliveryChannelResult> putDeliveryChannelAsync(PutDeliveryChannelRequest putDeliveryChannelRequest,
            com.amazonaws.handlers.AsyncHandler<PutDeliveryChannelRequest, PutDeliveryChannelResult> asyncHandler);

    /**
     * <p>
     * Used by an AWS Lambda function to deliver evaluation results to AWS Config. This action is required in every AWS
     * Lambda function that is invoked by an AWS Config rule.
     * </p>
     * 
     * @param putEvaluationsRequest
     * @return A Java Future containing the result of the PutEvaluations operation returned by the service.
     * @sample AmazonConfigAsync.PutEvaluations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutEvaluations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutEvaluationsResult> putEvaluationsAsync(PutEvaluationsRequest putEvaluationsRequest);

    /**
     * <p>
     * Used by an AWS Lambda function to deliver evaluation results to AWS Config. This action is required in every AWS
     * Lambda function that is invoked by an AWS Config rule.
     * </p>
     * 
     * @param putEvaluationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEvaluations operation returned by the service.
     * @sample AmazonConfigAsyncHandler.PutEvaluations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutEvaluations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutEvaluationsResult> putEvaluationsAsync(PutEvaluationsRequest putEvaluationsRequest,
            com.amazonaws.handlers.AsyncHandler<PutEvaluationsRequest, PutEvaluationsResult> asyncHandler);

    /**
     * <p>
     * Add or updates the evaluations for process checks. This API checks if the rule is a process check when the name
     * of the AWS Config rule is provided.
     * </p>
     * 
     * @param putExternalEvaluationRequest
     * @return A Java Future containing the result of the PutExternalEvaluation operation returned by the service.
     * @sample AmazonConfigAsync.PutExternalEvaluation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutExternalEvaluation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutExternalEvaluationResult> putExternalEvaluationAsync(PutExternalEvaluationRequest putExternalEvaluationRequest);

    /**
     * <p>
     * Add or updates the evaluations for process checks. This API checks if the rule is a process check when the name
     * of the AWS Config rule is provided.
     * </p>
     * 
     * @param putExternalEvaluationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutExternalEvaluation operation returned by the service.
     * @sample AmazonConfigAsyncHandler.PutExternalEvaluation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutExternalEvaluation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutExternalEvaluationResult> putExternalEvaluationAsync(PutExternalEvaluationRequest putExternalEvaluationRequest,
            com.amazonaws.handlers.AsyncHandler<PutExternalEvaluationRequest, PutExternalEvaluationResult> asyncHandler);

    /**
     * <p>
     * Adds or updates organization config rule for your entire organization evaluating whether your AWS resources
     * comply with your desired configurations.
     * </p>
     * <p>
     * Only a master account and a delegated administrator can create or update an organization config rule. When
     * calling this API with a delegated administrator, you must ensure AWS Organizations
     * <code>ListDelegatedAdministrator</code> permissions are added.
     * </p>
     * <p>
     * This API enables organization service access through the <code>EnableAWSServiceAccess</code> action and creates a
     * service linked role <code>AWSServiceRoleForConfigMultiAccountSetup</code> in the master or delegated
     * administrator account of your organization. The service linked role is created only when the role does not exist
     * in the caller account. AWS Config verifies the existence of role with <code>GetRole</code> action.
     * </p>
     * <p>
     * To use this API with delegated administrator, register a delegated administrator by calling AWS Organization
     * <code>register-delegated-administrator</code> for <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * You can use this action to create both custom AWS Config rules and AWS managed Config rules. If you are adding a
     * new custom AWS Config rule, you must first create AWS Lambda function in the master account or a delegated
     * administrator that the rule invokes to evaluate your resources. When you use the
     * <code>PutOrganizationConfigRule</code> action to add the rule to AWS Config, you must specify the Amazon Resource
     * Name (ARN) that AWS Lambda assigns to the function. If you are adding an AWS managed Config rule, specify the
     * rule's identifier for the <code>RuleIdentifier</code> key.
     * </p>
     * <p>
     * The maximum number of organization config rules that AWS Config supports is 150 and 3 delegated administrator per
     * organization.
     * </p>
     * <note>
     * <p>
     * Prerequisite: Ensure you call <code>EnableAllFeatures</code> API to enable all features in an organization.
     * </p>
     * <p>
     * Specify either <code>OrganizationCustomRuleMetadata</code> or <code>OrganizationManagedRuleMetadata</code>.
     * </p>
     * </note>
     * 
     * @param putOrganizationConfigRuleRequest
     * @return A Java Future containing the result of the PutOrganizationConfigRule operation returned by the service.
     * @sample AmazonConfigAsync.PutOrganizationConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutOrganizationConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutOrganizationConfigRuleResult> putOrganizationConfigRuleAsync(
            PutOrganizationConfigRuleRequest putOrganizationConfigRuleRequest);

    /**
     * <p>
     * Adds or updates organization config rule for your entire organization evaluating whether your AWS resources
     * comply with your desired configurations.
     * </p>
     * <p>
     * Only a master account and a delegated administrator can create or update an organization config rule. When
     * calling this API with a delegated administrator, you must ensure AWS Organizations
     * <code>ListDelegatedAdministrator</code> permissions are added.
     * </p>
     * <p>
     * This API enables organization service access through the <code>EnableAWSServiceAccess</code> action and creates a
     * service linked role <code>AWSServiceRoleForConfigMultiAccountSetup</code> in the master or delegated
     * administrator account of your organization. The service linked role is created only when the role does not exist
     * in the caller account. AWS Config verifies the existence of role with <code>GetRole</code> action.
     * </p>
     * <p>
     * To use this API with delegated administrator, register a delegated administrator by calling AWS Organization
     * <code>register-delegated-administrator</code> for <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * You can use this action to create both custom AWS Config rules and AWS managed Config rules. If you are adding a
     * new custom AWS Config rule, you must first create AWS Lambda function in the master account or a delegated
     * administrator that the rule invokes to evaluate your resources. When you use the
     * <code>PutOrganizationConfigRule</code> action to add the rule to AWS Config, you must specify the Amazon Resource
     * Name (ARN) that AWS Lambda assigns to the function. If you are adding an AWS managed Config rule, specify the
     * rule's identifier for the <code>RuleIdentifier</code> key.
     * </p>
     * <p>
     * The maximum number of organization config rules that AWS Config supports is 150 and 3 delegated administrator per
     * organization.
     * </p>
     * <note>
     * <p>
     * Prerequisite: Ensure you call <code>EnableAllFeatures</code> API to enable all features in an organization.
     * </p>
     * <p>
     * Specify either <code>OrganizationCustomRuleMetadata</code> or <code>OrganizationManagedRuleMetadata</code>.
     * </p>
     * </note>
     * 
     * @param putOrganizationConfigRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutOrganizationConfigRule operation returned by the service.
     * @sample AmazonConfigAsyncHandler.PutOrganizationConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutOrganizationConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutOrganizationConfigRuleResult> putOrganizationConfigRuleAsync(
            PutOrganizationConfigRuleRequest putOrganizationConfigRuleRequest,
            com.amazonaws.handlers.AsyncHandler<PutOrganizationConfigRuleRequest, PutOrganizationConfigRuleResult> asyncHandler);

    /**
     * <p>
     * Deploys conformance packs across member accounts in an AWS Organization.
     * </p>
     * <p>
     * Only a master account and a delegated administrator can call this API. When calling this API with a delegated
     * administrator, you must ensure AWS Organizations <code>ListDelegatedAdministrator</code> permissions are added.
     * </p>
     * <p>
     * This API enables organization service access for <code>config-multiaccountsetup.amazonaws.com</code> through the
     * <code>EnableAWSServiceAccess</code> action and creates a service linked role
     * <code>AWSServiceRoleForConfigMultiAccountSetup</code> in the master or delegated administrator account of your
     * organization. The service linked role is created only when the role does not exist in the caller account. To use
     * this API with delegated administrator, register a delegated administrator by calling AWS Organization
     * <code>register-delegate-admin</code> for <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <note>
     * <p>
     * Prerequisite: Ensure you call <code>EnableAllFeatures</code> API to enable all features in an organization.
     * </p>
     * <p>
     * You must specify either the <code>TemplateS3Uri</code> or the <code>TemplateBody</code> parameter, but not both.
     * If you provide both AWS Config uses the <code>TemplateS3Uri</code> parameter and ignores the
     * <code>TemplateBody</code> parameter.
     * </p>
     * <p>
     * AWS Config sets the state of a conformance pack to CREATE_IN_PROGRESS and UPDATE_IN_PROGRESS until the
     * conformance pack is created or updated. You cannot update a conformance pack while it is in this state.
     * </p>
     * <p>
     * You can create 50 conformance packs with 25 AWS Config rules in each pack and 3 delegated administrator per
     * organization.
     * </p>
     * </note>
     * 
     * @param putOrganizationConformancePackRequest
     * @return A Java Future containing the result of the PutOrganizationConformancePack operation returned by the
     *         service.
     * @sample AmazonConfigAsync.PutOrganizationConformancePack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutOrganizationConformancePack"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutOrganizationConformancePackResult> putOrganizationConformancePackAsync(
            PutOrganizationConformancePackRequest putOrganizationConformancePackRequest);

    /**
     * <p>
     * Deploys conformance packs across member accounts in an AWS Organization.
     * </p>
     * <p>
     * Only a master account and a delegated administrator can call this API. When calling this API with a delegated
     * administrator, you must ensure AWS Organizations <code>ListDelegatedAdministrator</code> permissions are added.
     * </p>
     * <p>
     * This API enables organization service access for <code>config-multiaccountsetup.amazonaws.com</code> through the
     * <code>EnableAWSServiceAccess</code> action and creates a service linked role
     * <code>AWSServiceRoleForConfigMultiAccountSetup</code> in the master or delegated administrator account of your
     * organization. The service linked role is created only when the role does not exist in the caller account. To use
     * this API with delegated administrator, register a delegated administrator by calling AWS Organization
     * <code>register-delegate-admin</code> for <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <note>
     * <p>
     * Prerequisite: Ensure you call <code>EnableAllFeatures</code> API to enable all features in an organization.
     * </p>
     * <p>
     * You must specify either the <code>TemplateS3Uri</code> or the <code>TemplateBody</code> parameter, but not both.
     * If you provide both AWS Config uses the <code>TemplateS3Uri</code> parameter and ignores the
     * <code>TemplateBody</code> parameter.
     * </p>
     * <p>
     * AWS Config sets the state of a conformance pack to CREATE_IN_PROGRESS and UPDATE_IN_PROGRESS until the
     * conformance pack is created or updated. You cannot update a conformance pack while it is in this state.
     * </p>
     * <p>
     * You can create 50 conformance packs with 25 AWS Config rules in each pack and 3 delegated administrator per
     * organization.
     * </p>
     * </note>
     * 
     * @param putOrganizationConformancePackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutOrganizationConformancePack operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.PutOrganizationConformancePack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutOrganizationConformancePack"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutOrganizationConformancePackResult> putOrganizationConformancePackAsync(
            PutOrganizationConformancePackRequest putOrganizationConformancePackRequest,
            com.amazonaws.handlers.AsyncHandler<PutOrganizationConformancePackRequest, PutOrganizationConformancePackResult> asyncHandler);

    /**
     * <p>
     * Adds or updates the remediation configuration with a specific AWS Config rule with the selected target or action.
     * The API creates the <code>RemediationConfiguration</code> object for the AWS Config rule. The AWS Config rule
     * must already exist for you to add a remediation configuration. The target (SSM document) must exist and have
     * permissions to use the target.
     * </p>
     * <note>
     * <p>
     * If you make backward incompatible changes to the SSM document, you must call this again to ensure the
     * remediations can run.
     * </p>
     * <p>
     * This API does not support adding remediation configurations for service-linked AWS Config Rules such as
     * Organization Config rules, the rules deployed by conformance packs, and rules deployed by AWS Security Hub.
     * </p>
     * </note>
     * 
     * @param putRemediationConfigurationsRequest
     * @return A Java Future containing the result of the PutRemediationConfigurations operation returned by the
     *         service.
     * @sample AmazonConfigAsync.PutRemediationConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutRemediationConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRemediationConfigurationsResult> putRemediationConfigurationsAsync(
            PutRemediationConfigurationsRequest putRemediationConfigurationsRequest);

    /**
     * <p>
     * Adds or updates the remediation configuration with a specific AWS Config rule with the selected target or action.
     * The API creates the <code>RemediationConfiguration</code> object for the AWS Config rule. The AWS Config rule
     * must already exist for you to add a remediation configuration. The target (SSM document) must exist and have
     * permissions to use the target.
     * </p>
     * <note>
     * <p>
     * If you make backward incompatible changes to the SSM document, you must call this again to ensure the
     * remediations can run.
     * </p>
     * <p>
     * This API does not support adding remediation configurations for service-linked AWS Config Rules such as
     * Organization Config rules, the rules deployed by conformance packs, and rules deployed by AWS Security Hub.
     * </p>
     * </note>
     * 
     * @param putRemediationConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRemediationConfigurations operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.PutRemediationConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutRemediationConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRemediationConfigurationsResult> putRemediationConfigurationsAsync(
            PutRemediationConfigurationsRequest putRemediationConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<PutRemediationConfigurationsRequest, PutRemediationConfigurationsResult> asyncHandler);

    /**
     * <p>
     * A remediation exception is when a specific resource is no longer considered for auto-remediation. This API adds a
     * new exception or updates an existing exception for a specific resource with a specific AWS Config rule.
     * </p>
     * <note>
     * <p>
     * AWS Config generates a remediation exception when a problem occurs executing a remediation action to a specific
     * resource. Remediation exceptions blocks auto-remediation until the exception is cleared.
     * </p>
     * </note>
     * 
     * @param putRemediationExceptionsRequest
     * @return A Java Future containing the result of the PutRemediationExceptions operation returned by the service.
     * @sample AmazonConfigAsync.PutRemediationExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutRemediationExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRemediationExceptionsResult> putRemediationExceptionsAsync(PutRemediationExceptionsRequest putRemediationExceptionsRequest);

    /**
     * <p>
     * A remediation exception is when a specific resource is no longer considered for auto-remediation. This API adds a
     * new exception or updates an existing exception for a specific resource with a specific AWS Config rule.
     * </p>
     * <note>
     * <p>
     * AWS Config generates a remediation exception when a problem occurs executing a remediation action to a specific
     * resource. Remediation exceptions blocks auto-remediation until the exception is cleared.
     * </p>
     * </note>
     * 
     * @param putRemediationExceptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRemediationExceptions operation returned by the service.
     * @sample AmazonConfigAsyncHandler.PutRemediationExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutRemediationExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRemediationExceptionsResult> putRemediationExceptionsAsync(PutRemediationExceptionsRequest putRemediationExceptionsRequest,
            com.amazonaws.handlers.AsyncHandler<PutRemediationExceptionsRequest, PutRemediationExceptionsResult> asyncHandler);

    /**
     * <p>
     * Records the configuration state for the resource provided in the request. The configuration state of a resource
     * is represented in AWS Config as Configuration Items. Once this API records the configuration item, you can
     * retrieve the list of configuration items for the custom resource type using existing AWS Config APIs.
     * </p>
     * <note>
     * <p>
     * The custom resource type must be registered with AWS CloudFormation. This API accepts the configuration item
     * registered with AWS CloudFormation.
     * </p>
     * <p>
     * When you call this API, AWS Config only stores configuration state of the resource provided in the request. This
     * API does not change or remediate the configuration of the resource.
     * </p>
     * <p>
     * Write-only schema properites are not recorded as part of the published configuration item.
     * </p>
     * </note>
     * 
     * @param putResourceConfigRequest
     * @return A Java Future containing the result of the PutResourceConfig operation returned by the service.
     * @sample AmazonConfigAsync.PutResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutResourceConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutResourceConfigResult> putResourceConfigAsync(PutResourceConfigRequest putResourceConfigRequest);

    /**
     * <p>
     * Records the configuration state for the resource provided in the request. The configuration state of a resource
     * is represented in AWS Config as Configuration Items. Once this API records the configuration item, you can
     * retrieve the list of configuration items for the custom resource type using existing AWS Config APIs.
     * </p>
     * <note>
     * <p>
     * The custom resource type must be registered with AWS CloudFormation. This API accepts the configuration item
     * registered with AWS CloudFormation.
     * </p>
     * <p>
     * When you call this API, AWS Config only stores configuration state of the resource provided in the request. This
     * API does not change or remediate the configuration of the resource.
     * </p>
     * <p>
     * Write-only schema properites are not recorded as part of the published configuration item.
     * </p>
     * </note>
     * 
     * @param putResourceConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutResourceConfig operation returned by the service.
     * @sample AmazonConfigAsyncHandler.PutResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutResourceConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutResourceConfigResult> putResourceConfigAsync(PutResourceConfigRequest putResourceConfigRequest,
            com.amazonaws.handlers.AsyncHandler<PutResourceConfigRequest, PutResourceConfigResult> asyncHandler);

    /**
     * <p>
     * Creates and updates the retention configuration with details about retention period (number of days) that AWS
     * Config stores your historical information. The API creates the <code>RetentionConfiguration</code> object and
     * names the object as <b>default</b>. When you have a <code>RetentionConfiguration</code> object named
     * <b>default</b>, calling the API modifies the default object.
     * </p>
     * <note>
     * <p>
     * Currently, AWS Config supports only one retention configuration per region in your account.
     * </p>
     * </note>
     * 
     * @param putRetentionConfigurationRequest
     * @return A Java Future containing the result of the PutRetentionConfiguration operation returned by the service.
     * @sample AmazonConfigAsync.PutRetentionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutRetentionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRetentionConfigurationResult> putRetentionConfigurationAsync(
            PutRetentionConfigurationRequest putRetentionConfigurationRequest);

    /**
     * <p>
     * Creates and updates the retention configuration with details about retention period (number of days) that AWS
     * Config stores your historical information. The API creates the <code>RetentionConfiguration</code> object and
     * names the object as <b>default</b>. When you have a <code>RetentionConfiguration</code> object named
     * <b>default</b>, calling the API modifies the default object.
     * </p>
     * <note>
     * <p>
     * Currently, AWS Config supports only one retention configuration per region in your account.
     * </p>
     * </note>
     * 
     * @param putRetentionConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRetentionConfiguration operation returned by the service.
     * @sample AmazonConfigAsyncHandler.PutRetentionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutRetentionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRetentionConfigurationResult> putRetentionConfigurationAsync(
            PutRetentionConfigurationRequest putRetentionConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutRetentionConfigurationRequest, PutRetentionConfigurationResult> asyncHandler);

    /**
     * <p>
     * Saves a new query or updates an existing saved query. The <code>QueryName</code> must be unique for a single AWS
     * account and a single AWS Region. You can create upto 300 queries in a single AWS account and a single AWS Region.
     * </p>
     * 
     * @param putStoredQueryRequest
     * @return A Java Future containing the result of the PutStoredQuery operation returned by the service.
     * @sample AmazonConfigAsync.PutStoredQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutStoredQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutStoredQueryResult> putStoredQueryAsync(PutStoredQueryRequest putStoredQueryRequest);

    /**
     * <p>
     * Saves a new query or updates an existing saved query. The <code>QueryName</code> must be unique for a single AWS
     * account and a single AWS Region. You can create upto 300 queries in a single AWS account and a single AWS Region.
     * </p>
     * 
     * @param putStoredQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutStoredQuery operation returned by the service.
     * @sample AmazonConfigAsyncHandler.PutStoredQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutStoredQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutStoredQueryResult> putStoredQueryAsync(PutStoredQueryRequest putStoredQueryRequest,
            com.amazonaws.handlers.AsyncHandler<PutStoredQueryRequest, PutStoredQueryResult> asyncHandler);

    /**
     * <p>
     * Accepts a structured query language (SQL) SELECT command and an aggregator to query configuration state of AWS
     * resources across multiple accounts and regions, performs the corresponding search, and returns resource
     * configurations matching the properties.
     * </p>
     * <p>
     * For more information about query components, see the <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/query-components.html"> <b>Query Components</b>
     * </a> section in the AWS Config Developer Guide.
     * </p>
     * 
     * @param selectAggregateResourceConfigRequest
     * @return A Java Future containing the result of the SelectAggregateResourceConfig operation returned by the
     *         service.
     * @sample AmazonConfigAsync.SelectAggregateResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/SelectAggregateResourceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SelectAggregateResourceConfigResult> selectAggregateResourceConfigAsync(
            SelectAggregateResourceConfigRequest selectAggregateResourceConfigRequest);

    /**
     * <p>
     * Accepts a structured query language (SQL) SELECT command and an aggregator to query configuration state of AWS
     * resources across multiple accounts and regions, performs the corresponding search, and returns resource
     * configurations matching the properties.
     * </p>
     * <p>
     * For more information about query components, see the <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/query-components.html"> <b>Query Components</b>
     * </a> section in the AWS Config Developer Guide.
     * </p>
     * 
     * @param selectAggregateResourceConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SelectAggregateResourceConfig operation returned by the
     *         service.
     * @sample AmazonConfigAsyncHandler.SelectAggregateResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/SelectAggregateResourceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SelectAggregateResourceConfigResult> selectAggregateResourceConfigAsync(
            SelectAggregateResourceConfigRequest selectAggregateResourceConfigRequest,
            com.amazonaws.handlers.AsyncHandler<SelectAggregateResourceConfigRequest, SelectAggregateResourceConfigResult> asyncHandler);

    /**
     * <p>
     * Accepts a structured query language (SQL) <code>SELECT</code> command, performs the corresponding search, and
     * returns resource configurations matching the properties.
     * </p>
     * <p>
     * For more information about query components, see the <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/query-components.html"> <b>Query Components</b>
     * </a> section in the AWS Config Developer Guide.
     * </p>
     * 
     * @param selectResourceConfigRequest
     * @return A Java Future containing the result of the SelectResourceConfig operation returned by the service.
     * @sample AmazonConfigAsync.SelectResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/SelectResourceConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SelectResourceConfigResult> selectResourceConfigAsync(SelectResourceConfigRequest selectResourceConfigRequest);

    /**
     * <p>
     * Accepts a structured query language (SQL) <code>SELECT</code> command, performs the corresponding search, and
     * returns resource configurations matching the properties.
     * </p>
     * <p>
     * For more information about query components, see the <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/query-components.html"> <b>Query Components</b>
     * </a> section in the AWS Config Developer Guide.
     * </p>
     * 
     * @param selectResourceConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SelectResourceConfig operation returned by the service.
     * @sample AmazonConfigAsyncHandler.SelectResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/SelectResourceConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SelectResourceConfigResult> selectResourceConfigAsync(SelectResourceConfigRequest selectResourceConfigRequest,
            com.amazonaws.handlers.AsyncHandler<SelectResourceConfigRequest, SelectResourceConfigResult> asyncHandler);

    /**
     * <p>
     * Runs an on-demand evaluation for the specified AWS Config rules against the last known configuration state of the
     * resources. Use <code>StartConfigRulesEvaluation</code> when you want to test that a rule you updated is working
     * as expected. <code>StartConfigRulesEvaluation</code> does not re-record the latest configuration state for your
     * resources. It re-runs an evaluation against the last known state of your resources.
     * </p>
     * <p>
     * You can specify up to 25 AWS Config rules per request.
     * </p>
     * <p>
     * An existing <code>StartConfigRulesEvaluation</code> call for the specified rules must complete before you can
     * call the API again. If you chose to have AWS Config stream to an Amazon SNS topic, you will receive a
     * <code>ConfigRuleEvaluationStarted</code> notification when the evaluation starts.
     * </p>
     * <note>
     * <p>
     * You don't need to call the <code>StartConfigRulesEvaluation</code> API to run an evaluation for a new rule. When
     * you create a rule, AWS Config evaluates your resources against the rule automatically.
     * </p>
     * </note>
     * <p>
     * The <code>StartConfigRulesEvaluation</code> API is useful if you want to run on-demand evaluations, such as the
     * following example:
     * </p>
     * <ol>
     * <li>
     * <p>
     * You have a custom rule that evaluates your IAM resources every 24 hours.
     * </p>
     * </li>
     * <li>
     * <p>
     * You update your Lambda function to add additional conditions to your rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * Instead of waiting for the next periodic evaluation, you call the <code>StartConfigRulesEvaluation</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Config invokes your Lambda function and evaluates your IAM resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your custom rule will still run periodic evaluations every 24 hours.
     * </p>
     * </li>
     * </ol>
     * 
     * @param startConfigRulesEvaluationRequest
     * @return A Java Future containing the result of the StartConfigRulesEvaluation operation returned by the service.
     * @sample AmazonConfigAsync.StartConfigRulesEvaluation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StartConfigRulesEvaluation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartConfigRulesEvaluationResult> startConfigRulesEvaluationAsync(
            StartConfigRulesEvaluationRequest startConfigRulesEvaluationRequest);

    /**
     * <p>
     * Runs an on-demand evaluation for the specified AWS Config rules against the last known configuration state of the
     * resources. Use <code>StartConfigRulesEvaluation</code> when you want to test that a rule you updated is working
     * as expected. <code>StartConfigRulesEvaluation</code> does not re-record the latest configuration state for your
     * resources. It re-runs an evaluation against the last known state of your resources.
     * </p>
     * <p>
     * You can specify up to 25 AWS Config rules per request.
     * </p>
     * <p>
     * An existing <code>StartConfigRulesEvaluation</code> call for the specified rules must complete before you can
     * call the API again. If you chose to have AWS Config stream to an Amazon SNS topic, you will receive a
     * <code>ConfigRuleEvaluationStarted</code> notification when the evaluation starts.
     * </p>
     * <note>
     * <p>
     * You don't need to call the <code>StartConfigRulesEvaluation</code> API to run an evaluation for a new rule. When
     * you create a rule, AWS Config evaluates your resources against the rule automatically.
     * </p>
     * </note>
     * <p>
     * The <code>StartConfigRulesEvaluation</code> API is useful if you want to run on-demand evaluations, such as the
     * following example:
     * </p>
     * <ol>
     * <li>
     * <p>
     * You have a custom rule that evaluates your IAM resources every 24 hours.
     * </p>
     * </li>
     * <li>
     * <p>
     * You update your Lambda function to add additional conditions to your rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * Instead of waiting for the next periodic evaluation, you call the <code>StartConfigRulesEvaluation</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Config invokes your Lambda function and evaluates your IAM resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your custom rule will still run periodic evaluations every 24 hours.
     * </p>
     * </li>
     * </ol>
     * 
     * @param startConfigRulesEvaluationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartConfigRulesEvaluation operation returned by the service.
     * @sample AmazonConfigAsyncHandler.StartConfigRulesEvaluation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StartConfigRulesEvaluation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartConfigRulesEvaluationResult> startConfigRulesEvaluationAsync(
            StartConfigRulesEvaluationRequest startConfigRulesEvaluationRequest,
            com.amazonaws.handlers.AsyncHandler<StartConfigRulesEvaluationRequest, StartConfigRulesEvaluationResult> asyncHandler);

    /**
     * <p>
     * Starts recording configurations of the AWS resources you have selected to record in your AWS account.
     * </p>
     * <p>
     * You must have created at least one delivery channel to successfully start the configuration recorder.
     * </p>
     * 
     * @param startConfigurationRecorderRequest
     *        The input for the <a>StartConfigurationRecorder</a> action.
     * @return A Java Future containing the result of the StartConfigurationRecorder operation returned by the service.
     * @sample AmazonConfigAsync.StartConfigurationRecorder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StartConfigurationRecorder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartConfigurationRecorderResult> startConfigurationRecorderAsync(
            StartConfigurationRecorderRequest startConfigurationRecorderRequest);

    /**
     * <p>
     * Starts recording configurations of the AWS resources you have selected to record in your AWS account.
     * </p>
     * <p>
     * You must have created at least one delivery channel to successfully start the configuration recorder.
     * </p>
     * 
     * @param startConfigurationRecorderRequest
     *        The input for the <a>StartConfigurationRecorder</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartConfigurationRecorder operation returned by the service.
     * @sample AmazonConfigAsyncHandler.StartConfigurationRecorder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StartConfigurationRecorder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartConfigurationRecorderResult> startConfigurationRecorderAsync(
            StartConfigurationRecorderRequest startConfigurationRecorderRequest,
            com.amazonaws.handlers.AsyncHandler<StartConfigurationRecorderRequest, StartConfigurationRecorderResult> asyncHandler);

    /**
     * <p>
     * Runs an on-demand remediation for the specified AWS Config rules against the last known remediation
     * configuration. It runs an execution against the current state of your resources. Remediation execution is
     * asynchronous.
     * </p>
     * <p>
     * You can specify up to 100 resource keys per request. An existing StartRemediationExecution call for the specified
     * resource keys must complete before you can call the API again.
     * </p>
     * 
     * @param startRemediationExecutionRequest
     * @return A Java Future containing the result of the StartRemediationExecution operation returned by the service.
     * @sample AmazonConfigAsync.StartRemediationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StartRemediationExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartRemediationExecutionResult> startRemediationExecutionAsync(
            StartRemediationExecutionRequest startRemediationExecutionRequest);

    /**
     * <p>
     * Runs an on-demand remediation for the specified AWS Config rules against the last known remediation
     * configuration. It runs an execution against the current state of your resources. Remediation execution is
     * asynchronous.
     * </p>
     * <p>
     * You can specify up to 100 resource keys per request. An existing StartRemediationExecution call for the specified
     * resource keys must complete before you can call the API again.
     * </p>
     * 
     * @param startRemediationExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartRemediationExecution operation returned by the service.
     * @sample AmazonConfigAsyncHandler.StartRemediationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StartRemediationExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartRemediationExecutionResult> startRemediationExecutionAsync(
            StartRemediationExecutionRequest startRemediationExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StartRemediationExecutionRequest, StartRemediationExecutionResult> asyncHandler);

    /**
     * <p>
     * Stops recording configurations of the AWS resources you have selected to record in your AWS account.
     * </p>
     * 
     * @param stopConfigurationRecorderRequest
     *        The input for the <a>StopConfigurationRecorder</a> action.
     * @return A Java Future containing the result of the StopConfigurationRecorder operation returned by the service.
     * @sample AmazonConfigAsync.StopConfigurationRecorder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StopConfigurationRecorder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopConfigurationRecorderResult> stopConfigurationRecorderAsync(
            StopConfigurationRecorderRequest stopConfigurationRecorderRequest);

    /**
     * <p>
     * Stops recording configurations of the AWS resources you have selected to record in your AWS account.
     * </p>
     * 
     * @param stopConfigurationRecorderRequest
     *        The input for the <a>StopConfigurationRecorder</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopConfigurationRecorder operation returned by the service.
     * @sample AmazonConfigAsyncHandler.StopConfigurationRecorder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StopConfigurationRecorder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopConfigurationRecorderResult> stopConfigurationRecorderAsync(
            StopConfigurationRecorderRequest stopConfigurationRecorderRequest,
            com.amazonaws.handlers.AsyncHandler<StopConfigurationRecorderRequest, StopConfigurationRecorderResult> asyncHandler);

    /**
     * <p>
     * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are
     * not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated
     * with that resource are deleted as well.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonConfigAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are
     * not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated
     * with that resource are deleted as well.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonConfigAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonConfigAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonConfigAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
