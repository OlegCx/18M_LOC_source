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
package com.amazonaws.services.lambda;

import javax.annotation.Generated;

import com.amazonaws.services.lambda.model.*;

/**
 * Interface for accessing AWS Lambda asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lambda.AbstractAWSLambdaAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Lambda</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the <i>AWS Lambda API Reference</i>. The AWS Lambda Developer Guide provides additional information. For the
 * service overview, see <a href="https://docs.aws.amazon.com/lambda/latest/dg/welcome.html">What is AWS Lambda</a>, and
 * for information about how the service works, see <a
 * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a> in the
 * <b>AWS Lambda Developer Guide</b>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSLambdaAsync extends AWSLambda {

    /**
     * <p>
     * Adds permissions to the resource-based policy of a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>. Use this
     * action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS
     * accounts, or all accounts in an organization.
     * </p>
     * <p>
     * To revoke permission, call <a>RemoveLayerVersionPermission</a> with the statement ID that you specified when you
     * added it.
     * </p>
     * 
     * @param addLayerVersionPermissionRequest
     * @return A Java Future containing the result of the AddLayerVersionPermission operation returned by the service.
     * @sample AWSLambdaAsync.AddLayerVersionPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AddLayerVersionPermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddLayerVersionPermissionResult> addLayerVersionPermissionAsync(
            AddLayerVersionPermissionRequest addLayerVersionPermissionRequest);

    /**
     * <p>
     * Adds permissions to the resource-based policy of a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>. Use this
     * action to grant layer usage permission to other accounts. You can grant permission to a single account, all AWS
     * accounts, or all accounts in an organization.
     * </p>
     * <p>
     * To revoke permission, call <a>RemoveLayerVersionPermission</a> with the statement ID that you specified when you
     * added it.
     * </p>
     * 
     * @param addLayerVersionPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddLayerVersionPermission operation returned by the service.
     * @sample AWSLambdaAsyncHandler.AddLayerVersionPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AddLayerVersionPermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddLayerVersionPermissionResult> addLayerVersionPermissionAsync(
            AddLayerVersionPermissionRequest addLayerVersionPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<AddLayerVersionPermissionRequest, AddLayerVersionPermissionResult> asyncHandler);

    /**
     * <p>
     * Grants an AWS service or another account permission to use a function. You can apply the policy at the function
     * level, or specify a qualifier to restrict access to a single version or alias. If you use a qualifier, the
     * invoker must use the full Amazon Resource Name (ARN) of that version or alias to invoke the function.
     * </p>
     * <p>
     * To grant permission to another account, specify the account ID as the <code>Principal</code>. For AWS services,
     * the principal is a domain-style identifier defined by the service, like <code>s3.amazonaws.com</code> or
     * <code>sns.amazonaws.com</code>. For AWS services, you can also specify the ARN of the associated resource as the
     * <code>SourceArn</code>. If you grant permission to a service principal without specifying the source, other
     * accounts could potentially configure resources in their account to invoke your Lambda function.
     * </p>
     * <p>
     * This action adds a statement to a resource-based permissions policy for the function. For more information about
     * function policies, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/access-control-resource-based.html">Lambda Function
     * Policies</a>.
     * </p>
     * 
     * @param addPermissionRequest
     * @return A Java Future containing the result of the AddPermission operation returned by the service.
     * @sample AWSLambdaAsync.AddPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AddPermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(AddPermissionRequest addPermissionRequest);

    /**
     * <p>
     * Grants an AWS service or another account permission to use a function. You can apply the policy at the function
     * level, or specify a qualifier to restrict access to a single version or alias. If you use a qualifier, the
     * invoker must use the full Amazon Resource Name (ARN) of that version or alias to invoke the function.
     * </p>
     * <p>
     * To grant permission to another account, specify the account ID as the <code>Principal</code>. For AWS services,
     * the principal is a domain-style identifier defined by the service, like <code>s3.amazonaws.com</code> or
     * <code>sns.amazonaws.com</code>. For AWS services, you can also specify the ARN of the associated resource as the
     * <code>SourceArn</code>. If you grant permission to a service principal without specifying the source, other
     * accounts could potentially configure resources in their account to invoke your Lambda function.
     * </p>
     * <p>
     * This action adds a statement to a resource-based permissions policy for the function. For more information about
     * function policies, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/access-control-resource-based.html">Lambda Function
     * Policies</a>.
     * </p>
     * 
     * @param addPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddPermission operation returned by the service.
     * @sample AWSLambdaAsyncHandler.AddPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AddPermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(AddPermissionRequest addPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<AddPermissionRequest, AddPermissionResult> asyncHandler);

    /**
     * <p>
     * Creates an <a href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">alias</a> for a Lambda
     * function version. Use aliases to provide clients with a function identifier that you can update to invoke a
     * different version.
     * </p>
     * <p>
     * You can also map an alias to split invocation requests between two versions. Use the <code>RoutingConfig</code>
     * parameter to specify a second version and the percentage of invocation requests that it receives.
     * </p>
     * 
     * @param createAliasRequest
     * @return A Java Future containing the result of the CreateAlias operation returned by the service.
     * @sample AWSLambdaAsync.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest);

    /**
     * <p>
     * Creates an <a href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">alias</a> for a Lambda
     * function version. Use aliases to provide clients with a function identifier that you can update to invoke a
     * different version.
     * </p>
     * <p>
     * You can also map an alias to split invocation requests between two versions. Use the <code>RoutingConfig</code>
     * parameter to specify a second version and the percentage of invocation requests that it receives.
     * </p>
     * 
     * @param createAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAlias operation returned by the service.
     * @sample AWSLambdaAsyncHandler.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler);

    /**
     * <p>
     * Creates a code signing configuration. A <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-trustedcode.html">code signing configuration</a>
     * defines a list of allowed signing profiles and defines the code-signing validation policy (action to be taken if
     * deployment validation checks fail).
     * </p>
     * 
     * @param createCodeSigningConfigRequest
     * @return A Java Future containing the result of the CreateCodeSigningConfig operation returned by the service.
     * @sample AWSLambdaAsync.CreateCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateCodeSigningConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCodeSigningConfigResult> createCodeSigningConfigAsync(CreateCodeSigningConfigRequest createCodeSigningConfigRequest);

    /**
     * <p>
     * Creates a code signing configuration. A <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-trustedcode.html">code signing configuration</a>
     * defines a list of allowed signing profiles and defines the code-signing validation policy (action to be taken if
     * deployment validation checks fail).
     * </p>
     * 
     * @param createCodeSigningConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCodeSigningConfig operation returned by the service.
     * @sample AWSLambdaAsyncHandler.CreateCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateCodeSigningConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCodeSigningConfigResult> createCodeSigningConfigAsync(CreateCodeSigningConfigRequest createCodeSigningConfigRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCodeSigningConfigRequest, CreateCodeSigningConfigResult> asyncHandler);

    /**
     * <p>
     * Creates a mapping between an event source and an AWS Lambda function. Lambda reads items from the event source
     * and triggers the function.
     * </p>
     * <p>
     * For details about each event source type, see the following topics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html">Using AWS Lambda with Amazon DynamoDB</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-kinesis.html">Using AWS Lambda with Amazon Kinesis</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html">Using AWS Lambda with Amazon SQS</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-mq.html">Using AWS Lambda with Amazon MQ</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html">Using AWS Lambda with Amazon MSK</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/kafka-smaa.html">Using AWS Lambda with Self-Managed Apache
     * Kafka</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following error handling options are only available for stream sources (DynamoDB and Kinesis):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BisectBatchOnFunctionError</code> - If the function returns an error, split the batch in two and retry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationConfig</code> - Send discarded records to an Amazon SQS queue or Amazon SNS topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumRecordAgeInSeconds</code> - Discard records older than the specified age. The default value is
     * infinite (-1). When set to infinite (-1), failed records are retried until the record expires
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumRetryAttempts</code> - Discard records after the specified number of retries. The default value is
     * infinite (-1). When set to infinite (-1), failed records are retried until the record expires.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ParallelizationFactor</code> - Process multiple batches from each shard concurrently.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createEventSourceMappingRequest
     * @return A Java Future containing the result of the CreateEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsync.CreateEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEventSourceMappingResult> createEventSourceMappingAsync(CreateEventSourceMappingRequest createEventSourceMappingRequest);

    /**
     * <p>
     * Creates a mapping between an event source and an AWS Lambda function. Lambda reads items from the event source
     * and triggers the function.
     * </p>
     * <p>
     * For details about each event source type, see the following topics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html">Using AWS Lambda with Amazon DynamoDB</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-kinesis.html">Using AWS Lambda with Amazon Kinesis</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html">Using AWS Lambda with Amazon SQS</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-mq.html">Using AWS Lambda with Amazon MQ</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html">Using AWS Lambda with Amazon MSK</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/kafka-smaa.html">Using AWS Lambda with Self-Managed Apache
     * Kafka</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following error handling options are only available for stream sources (DynamoDB and Kinesis):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BisectBatchOnFunctionError</code> - If the function returns an error, split the batch in two and retry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationConfig</code> - Send discarded records to an Amazon SQS queue or Amazon SNS topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumRecordAgeInSeconds</code> - Discard records older than the specified age. The default value is
     * infinite (-1). When set to infinite (-1), failed records are retried until the record expires
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumRetryAttempts</code> - Discard records after the specified number of retries. The default value is
     * infinite (-1). When set to infinite (-1), failed records are retried until the record expires.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ParallelizationFactor</code> - Process multiple batches from each shard concurrently.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createEventSourceMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsyncHandler.CreateEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEventSourceMappingResult> createEventSourceMappingAsync(CreateEventSourceMappingRequest createEventSourceMappingRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEventSourceMappingRequest, CreateEventSourceMappingResult> asyncHandler);

    /**
     * <p>
     * Creates a Lambda function. To create a function, you need a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html">deployment package</a> and an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role">
     * execution role</a>. The deployment package is a .zip file archive or container image that contains your function
     * code. The execution role grants the function permission to use AWS services, such as Amazon CloudWatch Logs for
     * log streaming and AWS X-Ray for request tracing.
     * </p>
     * <p>
     * When you create a function, Lambda provisions an instance of the function and its supporting resources. If your
     * function connects to a VPC, this process can take a minute or so. During this time, you can't invoke or modify
     * the function. The <code>State</code>, <code>StateReason</code>, and <code>StateReasonCode</code> fields in the
     * response from <a>GetFunctionConfiguration</a> indicate when the function is ready to invoke. For more
     * information, see <a href="https://docs.aws.amazon.com/lambda/latest/dg/functions-states.html">Function
     * States</a>.
     * </p>
     * <p>
     * A function has an unpublished version, and can have published versions and aliases. The unpublished version
     * changes when you update your function's code and configuration. A published version is a snapshot of your
     * function code and configuration that can't be changed. An alias is a named resource that maps to a version, and
     * can be changed to map to a different version. Use the <code>Publish</code> parameter to create version
     * <code>1</code> of your function from its initial configuration.
     * </p>
     * <p>
     * The other parameters let you configure version-specific and function-level settings. You can modify
     * version-specific settings later with <a>UpdateFunctionConfiguration</a>. Function-level settings apply to both
     * the unpublished and published versions of the function, and include tags (<a>TagResource</a>) and per-function
     * concurrency limits (<a>PutFunctionConcurrency</a>).
     * </p>
     * <p>
     * You can use code signing if your deployment package is a .zip file archive. To enable code signing for this
     * function, specify the ARN of a code-signing configuration. When a user attempts to deploy a code package with
     * <a>UpdateFunctionCode</a>, Lambda checks that the code package has a valid signature from a trusted publisher.
     * The code-signing configuration includes set set of signing profiles, which define the trusted publishers for this
     * function.
     * </p>
     * <p>
     * If another account or an AWS service invokes your function, use <a>AddPermission</a> to grant permission by
     * creating a resource-based IAM policy. You can grant permissions at the function level, on a version, or on an
     * alias.
     * </p>
     * <p>
     * To invoke your function directly, use <a>Invoke</a>. To invoke your function in response to events in other AWS
     * services, create an event source mapping (<a>CreateEventSourceMapping</a>), or configure a function trigger in
     * the other service. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-invocation.html">Invoking Functions</a>.
     * </p>
     * 
     * @param createFunctionRequest
     * @return A Java Future containing the result of the CreateFunction operation returned by the service.
     * @sample AWSLambdaAsync.CreateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFunctionResult> createFunctionAsync(CreateFunctionRequest createFunctionRequest);

    /**
     * <p>
     * Creates a Lambda function. To create a function, you need a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html">deployment package</a> and an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role">
     * execution role</a>. The deployment package is a .zip file archive or container image that contains your function
     * code. The execution role grants the function permission to use AWS services, such as Amazon CloudWatch Logs for
     * log streaming and AWS X-Ray for request tracing.
     * </p>
     * <p>
     * When you create a function, Lambda provisions an instance of the function and its supporting resources. If your
     * function connects to a VPC, this process can take a minute or so. During this time, you can't invoke or modify
     * the function. The <code>State</code>, <code>StateReason</code>, and <code>StateReasonCode</code> fields in the
     * response from <a>GetFunctionConfiguration</a> indicate when the function is ready to invoke. For more
     * information, see <a href="https://docs.aws.amazon.com/lambda/latest/dg/functions-states.html">Function
     * States</a>.
     * </p>
     * <p>
     * A function has an unpublished version, and can have published versions and aliases. The unpublished version
     * changes when you update your function's code and configuration. A published version is a snapshot of your
     * function code and configuration that can't be changed. An alias is a named resource that maps to a version, and
     * can be changed to map to a different version. Use the <code>Publish</code> parameter to create version
     * <code>1</code> of your function from its initial configuration.
     * </p>
     * <p>
     * The other parameters let you configure version-specific and function-level settings. You can modify
     * version-specific settings later with <a>UpdateFunctionConfiguration</a>. Function-level settings apply to both
     * the unpublished and published versions of the function, and include tags (<a>TagResource</a>) and per-function
     * concurrency limits (<a>PutFunctionConcurrency</a>).
     * </p>
     * <p>
     * You can use code signing if your deployment package is a .zip file archive. To enable code signing for this
     * function, specify the ARN of a code-signing configuration. When a user attempts to deploy a code package with
     * <a>UpdateFunctionCode</a>, Lambda checks that the code package has a valid signature from a trusted publisher.
     * The code-signing configuration includes set set of signing profiles, which define the trusted publishers for this
     * function.
     * </p>
     * <p>
     * If another account or an AWS service invokes your function, use <a>AddPermission</a> to grant permission by
     * creating a resource-based IAM policy. You can grant permissions at the function level, on a version, or on an
     * alias.
     * </p>
     * <p>
     * To invoke your function directly, use <a>Invoke</a>. To invoke your function in response to events in other AWS
     * services, create an event source mapping (<a>CreateEventSourceMapping</a>), or configure a function trigger in
     * the other service. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-invocation.html">Invoking Functions</a>.
     * </p>
     * 
     * @param createFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFunction operation returned by the service.
     * @sample AWSLambdaAsyncHandler.CreateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFunctionResult> createFunctionAsync(CreateFunctionRequest createFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFunctionRequest, CreateFunctionResult> asyncHandler);

    /**
     * <p>
     * Deletes a Lambda function <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">alias</a>.
     * </p>
     * 
     * @param deleteAliasRequest
     * @return A Java Future containing the result of the DeleteAlias operation returned by the service.
     * @sample AWSLambdaAsync.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest);

    /**
     * <p>
     * Deletes a Lambda function <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">alias</a>.
     * </p>
     * 
     * @param deleteAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAlias operation returned by the service.
     * @sample AWSLambdaAsyncHandler.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler);

    /**
     * <p>
     * Deletes the code signing configuration. You can delete the code signing configuration only if no function is
     * using it.
     * </p>
     * 
     * @param deleteCodeSigningConfigRequest
     * @return A Java Future containing the result of the DeleteCodeSigningConfig operation returned by the service.
     * @sample AWSLambdaAsync.DeleteCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteCodeSigningConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCodeSigningConfigResult> deleteCodeSigningConfigAsync(DeleteCodeSigningConfigRequest deleteCodeSigningConfigRequest);

    /**
     * <p>
     * Deletes the code signing configuration. You can delete the code signing configuration only if no function is
     * using it.
     * </p>
     * 
     * @param deleteCodeSigningConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCodeSigningConfig operation returned by the service.
     * @sample AWSLambdaAsyncHandler.DeleteCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteCodeSigningConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCodeSigningConfigResult> deleteCodeSigningConfigAsync(DeleteCodeSigningConfigRequest deleteCodeSigningConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCodeSigningConfigRequest, DeleteCodeSigningConfigResult> asyncHandler);

    /**
     * <p>
     * Deletes an <a href="https://docs.aws.amazon.com/lambda/latest/dg/intro-invocation-modes.html">event source
     * mapping</a>. You can get the identifier of a mapping from the output of <a>ListEventSourceMappings</a>.
     * </p>
     * <p>
     * When you delete an event source mapping, it enters a <code>Deleting</code> state and might not be completely
     * deleted for several seconds.
     * </p>
     * 
     * @param deleteEventSourceMappingRequest
     * @return A Java Future containing the result of the DeleteEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsync.DeleteEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventSourceMappingResult> deleteEventSourceMappingAsync(DeleteEventSourceMappingRequest deleteEventSourceMappingRequest);

    /**
     * <p>
     * Deletes an <a href="https://docs.aws.amazon.com/lambda/latest/dg/intro-invocation-modes.html">event source
     * mapping</a>. You can get the identifier of a mapping from the output of <a>ListEventSourceMappings</a>.
     * </p>
     * <p>
     * When you delete an event source mapping, it enters a <code>Deleting</code> state and might not be completely
     * deleted for several seconds.
     * </p>
     * 
     * @param deleteEventSourceMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsyncHandler.DeleteEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventSourceMappingResult> deleteEventSourceMappingAsync(DeleteEventSourceMappingRequest deleteEventSourceMappingRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEventSourceMappingRequest, DeleteEventSourceMappingResult> asyncHandler);

    /**
     * <p>
     * Deletes a Lambda function. To delete a specific function version, use the <code>Qualifier</code> parameter.
     * Otherwise, all versions and aliases are deleted.
     * </p>
     * <p>
     * To delete Lambda event source mappings that invoke a function, use <a>DeleteEventSourceMapping</a>. For AWS
     * services and resources that invoke your function directly, delete the trigger in the service where you originally
     * configured it.
     * </p>
     * 
     * @param deleteFunctionRequest
     * @return A Java Future containing the result of the DeleteFunction operation returned by the service.
     * @sample AWSLambdaAsync.DeleteFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFunctionResult> deleteFunctionAsync(DeleteFunctionRequest deleteFunctionRequest);

    /**
     * <p>
     * Deletes a Lambda function. To delete a specific function version, use the <code>Qualifier</code> parameter.
     * Otherwise, all versions and aliases are deleted.
     * </p>
     * <p>
     * To delete Lambda event source mappings that invoke a function, use <a>DeleteEventSourceMapping</a>. For AWS
     * services and resources that invoke your function directly, delete the trigger in the service where you originally
     * configured it.
     * </p>
     * 
     * @param deleteFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFunction operation returned by the service.
     * @sample AWSLambdaAsyncHandler.DeleteFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFunctionResult> deleteFunctionAsync(DeleteFunctionRequest deleteFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFunctionRequest, DeleteFunctionResult> asyncHandler);

    /**
     * <p>
     * Removes the code signing configuration from the function.
     * </p>
     * 
     * @param deleteFunctionCodeSigningConfigRequest
     * @return A Java Future containing the result of the DeleteFunctionCodeSigningConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsync.DeleteFunctionCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunctionCodeSigningConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFunctionCodeSigningConfigResult> deleteFunctionCodeSigningConfigAsync(
            DeleteFunctionCodeSigningConfigRequest deleteFunctionCodeSigningConfigRequest);

    /**
     * <p>
     * Removes the code signing configuration from the function.
     * </p>
     * 
     * @param deleteFunctionCodeSigningConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFunctionCodeSigningConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsyncHandler.DeleteFunctionCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunctionCodeSigningConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFunctionCodeSigningConfigResult> deleteFunctionCodeSigningConfigAsync(
            DeleteFunctionCodeSigningConfigRequest deleteFunctionCodeSigningConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFunctionCodeSigningConfigRequest, DeleteFunctionCodeSigningConfigResult> asyncHandler);

    /**
     * <p>
     * Removes a concurrent execution limit from a function.
     * </p>
     * 
     * @param deleteFunctionConcurrencyRequest
     * @return A Java Future containing the result of the DeleteFunctionConcurrency operation returned by the service.
     * @sample AWSLambdaAsync.DeleteFunctionConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunctionConcurrency"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFunctionConcurrencyResult> deleteFunctionConcurrencyAsync(
            DeleteFunctionConcurrencyRequest deleteFunctionConcurrencyRequest);

    /**
     * <p>
     * Removes a concurrent execution limit from a function.
     * </p>
     * 
     * @param deleteFunctionConcurrencyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFunctionConcurrency operation returned by the service.
     * @sample AWSLambdaAsyncHandler.DeleteFunctionConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunctionConcurrency"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFunctionConcurrencyResult> deleteFunctionConcurrencyAsync(
            DeleteFunctionConcurrencyRequest deleteFunctionConcurrencyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFunctionConcurrencyRequest, DeleteFunctionConcurrencyResult> asyncHandler);

    /**
     * <p>
     * Deletes the configuration for asynchronous invocation for a function, version, or alias.
     * </p>
     * <p>
     * To configure options for asynchronous invocation, use <a>PutFunctionEventInvokeConfig</a>.
     * </p>
     * 
     * @param deleteFunctionEventInvokeConfigRequest
     * @return A Java Future containing the result of the DeleteFunctionEventInvokeConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsync.DeleteFunctionEventInvokeConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunctionEventInvokeConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFunctionEventInvokeConfigResult> deleteFunctionEventInvokeConfigAsync(
            DeleteFunctionEventInvokeConfigRequest deleteFunctionEventInvokeConfigRequest);

    /**
     * <p>
     * Deletes the configuration for asynchronous invocation for a function, version, or alias.
     * </p>
     * <p>
     * To configure options for asynchronous invocation, use <a>PutFunctionEventInvokeConfig</a>.
     * </p>
     * 
     * @param deleteFunctionEventInvokeConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFunctionEventInvokeConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsyncHandler.DeleteFunctionEventInvokeConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunctionEventInvokeConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFunctionEventInvokeConfigResult> deleteFunctionEventInvokeConfigAsync(
            DeleteFunctionEventInvokeConfigRequest deleteFunctionEventInvokeConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFunctionEventInvokeConfigRequest, DeleteFunctionEventInvokeConfigResult> asyncHandler);

    /**
     * <p>
     * Deletes a version of an <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS
     * Lambda layer</a>. Deleted versions can no longer be viewed or added to functions. To avoid breaking functions, a
     * copy of the version remains in Lambda until no functions refer to it.
     * </p>
     * 
     * @param deleteLayerVersionRequest
     * @return A Java Future containing the result of the DeleteLayerVersion operation returned by the service.
     * @sample AWSLambdaAsync.DeleteLayerVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteLayerVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLayerVersionResult> deleteLayerVersionAsync(DeleteLayerVersionRequest deleteLayerVersionRequest);

    /**
     * <p>
     * Deletes a version of an <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS
     * Lambda layer</a>. Deleted versions can no longer be viewed or added to functions. To avoid breaking functions, a
     * copy of the version remains in Lambda until no functions refer to it.
     * </p>
     * 
     * @param deleteLayerVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLayerVersion operation returned by the service.
     * @sample AWSLambdaAsyncHandler.DeleteLayerVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteLayerVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLayerVersionResult> deleteLayerVersionAsync(DeleteLayerVersionRequest deleteLayerVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLayerVersionRequest, DeleteLayerVersionResult> asyncHandler);

    /**
     * <p>
     * Deletes the provisioned concurrency configuration for a function.
     * </p>
     * 
     * @param deleteProvisionedConcurrencyConfigRequest
     * @return A Java Future containing the result of the DeleteProvisionedConcurrencyConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsync.DeleteProvisionedConcurrencyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteProvisionedConcurrencyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProvisionedConcurrencyConfigResult> deleteProvisionedConcurrencyConfigAsync(
            DeleteProvisionedConcurrencyConfigRequest deleteProvisionedConcurrencyConfigRequest);

    /**
     * <p>
     * Deletes the provisioned concurrency configuration for a function.
     * </p>
     * 
     * @param deleteProvisionedConcurrencyConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProvisionedConcurrencyConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsyncHandler.DeleteProvisionedConcurrencyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteProvisionedConcurrencyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProvisionedConcurrencyConfigResult> deleteProvisionedConcurrencyConfigAsync(
            DeleteProvisionedConcurrencyConfigRequest deleteProvisionedConcurrencyConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProvisionedConcurrencyConfigRequest, DeleteProvisionedConcurrencyConfigResult> asyncHandler);

    /**
     * <p>
     * Retrieves details about your account's <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">limits</a> and usage in an AWS Region.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return A Java Future containing the result of the GetAccountSettings operation returned by the service.
     * @sample AWSLambdaAsync.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetAccountSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest getAccountSettingsRequest);

    /**
     * <p>
     * Retrieves details about your account's <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">limits</a> and usage in an AWS Region.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccountSettings operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetAccountSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest getAccountSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountSettingsRequest, GetAccountSettingsResult> asyncHandler);

    /**
     * <p>
     * Returns details about a Lambda function <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">alias</a>.
     * </p>
     * 
     * @param getAliasRequest
     * @return A Java Future containing the result of the GetAlias operation returned by the service.
     * @sample AWSLambdaAsync.GetAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAliasResult> getAliasAsync(GetAliasRequest getAliasRequest);

    /**
     * <p>
     * Returns details about a Lambda function <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">alias</a>.
     * </p>
     * 
     * @param getAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAlias operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAliasResult> getAliasAsync(GetAliasRequest getAliasRequest,
            com.amazonaws.handlers.AsyncHandler<GetAliasRequest, GetAliasResult> asyncHandler);

    /**
     * <p>
     * Returns information about the specified code signing configuration.
     * </p>
     * 
     * @param getCodeSigningConfigRequest
     * @return A Java Future containing the result of the GetCodeSigningConfig operation returned by the service.
     * @sample AWSLambdaAsync.GetCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetCodeSigningConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCodeSigningConfigResult> getCodeSigningConfigAsync(GetCodeSigningConfigRequest getCodeSigningConfigRequest);

    /**
     * <p>
     * Returns information about the specified code signing configuration.
     * </p>
     * 
     * @param getCodeSigningConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCodeSigningConfig operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetCodeSigningConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCodeSigningConfigResult> getCodeSigningConfigAsync(GetCodeSigningConfigRequest getCodeSigningConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetCodeSigningConfigRequest, GetCodeSigningConfigResult> asyncHandler);

    /**
     * <p>
     * Returns details about an event source mapping. You can get the identifier of a mapping from the output of
     * <a>ListEventSourceMappings</a>.
     * </p>
     * 
     * @param getEventSourceMappingRequest
     * @return A Java Future containing the result of the GetEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsync.GetEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetEventSourceMapping" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEventSourceMappingResult> getEventSourceMappingAsync(GetEventSourceMappingRequest getEventSourceMappingRequest);

    /**
     * <p>
     * Returns details about an event source mapping. You can get the identifier of a mapping from the output of
     * <a>ListEventSourceMappings</a>.
     * </p>
     * 
     * @param getEventSourceMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetEventSourceMapping" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEventSourceMappingResult> getEventSourceMappingAsync(GetEventSourceMappingRequest getEventSourceMappingRequest,
            com.amazonaws.handlers.AsyncHandler<GetEventSourceMappingRequest, GetEventSourceMappingResult> asyncHandler);

    /**
     * <p>
     * Returns information about the function or function version, with a link to download the deployment package that's
     * valid for 10 minutes. If you specify a function version, only details that are specific to that version are
     * returned.
     * </p>
     * 
     * @param getFunctionRequest
     * @return A Java Future containing the result of the GetFunction operation returned by the service.
     * @sample AWSLambdaAsync.GetFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFunctionResult> getFunctionAsync(GetFunctionRequest getFunctionRequest);

    /**
     * <p>
     * Returns information about the function or function version, with a link to download the deployment package that's
     * valid for 10 minutes. If you specify a function version, only details that are specific to that version are
     * returned.
     * </p>
     * 
     * @param getFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFunction operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFunctionResult> getFunctionAsync(GetFunctionRequest getFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<GetFunctionRequest, GetFunctionResult> asyncHandler);

    /**
     * <p>
     * Returns the code signing configuration for the specified function.
     * </p>
     * 
     * @param getFunctionCodeSigningConfigRequest
     * @return A Java Future containing the result of the GetFunctionCodeSigningConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsync.GetFunctionCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunctionCodeSigningConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFunctionCodeSigningConfigResult> getFunctionCodeSigningConfigAsync(
            GetFunctionCodeSigningConfigRequest getFunctionCodeSigningConfigRequest);

    /**
     * <p>
     * Returns the code signing configuration for the specified function.
     * </p>
     * 
     * @param getFunctionCodeSigningConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFunctionCodeSigningConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsyncHandler.GetFunctionCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunctionCodeSigningConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFunctionCodeSigningConfigResult> getFunctionCodeSigningConfigAsync(
            GetFunctionCodeSigningConfigRequest getFunctionCodeSigningConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetFunctionCodeSigningConfigRequest, GetFunctionCodeSigningConfigResult> asyncHandler);

    /**
     * <p>
     * Returns details about the reserved concurrency configuration for a function. To set a concurrency limit for a
     * function, use <a>PutFunctionConcurrency</a>.
     * </p>
     * 
     * @param getFunctionConcurrencyRequest
     * @return A Java Future containing the result of the GetFunctionConcurrency operation returned by the service.
     * @sample AWSLambdaAsync.GetFunctionConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunctionConcurrency" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetFunctionConcurrencyResult> getFunctionConcurrencyAsync(GetFunctionConcurrencyRequest getFunctionConcurrencyRequest);

    /**
     * <p>
     * Returns details about the reserved concurrency configuration for a function. To set a concurrency limit for a
     * function, use <a>PutFunctionConcurrency</a>.
     * </p>
     * 
     * @param getFunctionConcurrencyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFunctionConcurrency operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetFunctionConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunctionConcurrency" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetFunctionConcurrencyResult> getFunctionConcurrencyAsync(GetFunctionConcurrencyRequest getFunctionConcurrencyRequest,
            com.amazonaws.handlers.AsyncHandler<GetFunctionConcurrencyRequest, GetFunctionConcurrencyResult> asyncHandler);

    /**
     * <p>
     * Returns the version-specific settings of a Lambda function or version. The output includes only options that can
     * vary between versions of a function. To modify these settings, use <a>UpdateFunctionConfiguration</a>.
     * </p>
     * <p>
     * To get all of a function's details, including function-level settings, use <a>GetFunction</a>.
     * </p>
     * 
     * @param getFunctionConfigurationRequest
     * @return A Java Future containing the result of the GetFunctionConfiguration operation returned by the service.
     * @sample AWSLambdaAsync.GetFunctionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunctionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFunctionConfigurationResult> getFunctionConfigurationAsync(GetFunctionConfigurationRequest getFunctionConfigurationRequest);

    /**
     * <p>
     * Returns the version-specific settings of a Lambda function or version. The output includes only options that can
     * vary between versions of a function. To modify these settings, use <a>UpdateFunctionConfiguration</a>.
     * </p>
     * <p>
     * To get all of a function's details, including function-level settings, use <a>GetFunction</a>.
     * </p>
     * 
     * @param getFunctionConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFunctionConfiguration operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetFunctionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunctionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFunctionConfigurationResult> getFunctionConfigurationAsync(GetFunctionConfigurationRequest getFunctionConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetFunctionConfigurationRequest, GetFunctionConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the configuration for asynchronous invocation for a function, version, or alias.
     * </p>
     * <p>
     * To configure options for asynchronous invocation, use <a>PutFunctionEventInvokeConfig</a>.
     * </p>
     * 
     * @param getFunctionEventInvokeConfigRequest
     * @return A Java Future containing the result of the GetFunctionEventInvokeConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsync.GetFunctionEventInvokeConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunctionEventInvokeConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFunctionEventInvokeConfigResult> getFunctionEventInvokeConfigAsync(
            GetFunctionEventInvokeConfigRequest getFunctionEventInvokeConfigRequest);

    /**
     * <p>
     * Retrieves the configuration for asynchronous invocation for a function, version, or alias.
     * </p>
     * <p>
     * To configure options for asynchronous invocation, use <a>PutFunctionEventInvokeConfig</a>.
     * </p>
     * 
     * @param getFunctionEventInvokeConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFunctionEventInvokeConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsyncHandler.GetFunctionEventInvokeConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunctionEventInvokeConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFunctionEventInvokeConfigResult> getFunctionEventInvokeConfigAsync(
            GetFunctionEventInvokeConfigRequest getFunctionEventInvokeConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetFunctionEventInvokeConfigRequest, GetFunctionEventInvokeConfigResult> asyncHandler);

    /**
     * <p>
     * Returns information about a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>, with a link
     * to download the layer archive that's valid for 10 minutes.
     * </p>
     * 
     * @param getLayerVersionRequest
     * @return A Java Future containing the result of the GetLayerVersion operation returned by the service.
     * @sample AWSLambdaAsync.GetLayerVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetLayerVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLayerVersionResult> getLayerVersionAsync(GetLayerVersionRequest getLayerVersionRequest);

    /**
     * <p>
     * Returns information about a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>, with a link
     * to download the layer archive that's valid for 10 minutes.
     * </p>
     * 
     * @param getLayerVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLayerVersion operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetLayerVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetLayerVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLayerVersionResult> getLayerVersionAsync(GetLayerVersionRequest getLayerVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetLayerVersionRequest, GetLayerVersionResult> asyncHandler);

    /**
     * <p>
     * Returns information about a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>, with a link
     * to download the layer archive that's valid for 10 minutes.
     * </p>
     * 
     * @param getLayerVersionByArnRequest
     * @return A Java Future containing the result of the GetLayerVersionByArn operation returned by the service.
     * @sample AWSLambdaAsync.GetLayerVersionByArn
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetLayerVersionByArn" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLayerVersionByArnResult> getLayerVersionByArnAsync(GetLayerVersionByArnRequest getLayerVersionByArnRequest);

    /**
     * <p>
     * Returns information about a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>, with a link
     * to download the layer archive that's valid for 10 minutes.
     * </p>
     * 
     * @param getLayerVersionByArnRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLayerVersionByArn operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetLayerVersionByArn
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetLayerVersionByArn" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLayerVersionByArnResult> getLayerVersionByArnAsync(GetLayerVersionByArnRequest getLayerVersionByArnRequest,
            com.amazonaws.handlers.AsyncHandler<GetLayerVersionByArnRequest, GetLayerVersionByArnResult> asyncHandler);

    /**
     * <p>
     * Returns the permission policy for a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>. For more
     * information, see <a>AddLayerVersionPermission</a>.
     * </p>
     * 
     * @param getLayerVersionPolicyRequest
     * @return A Java Future containing the result of the GetLayerVersionPolicy operation returned by the service.
     * @sample AWSLambdaAsync.GetLayerVersionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetLayerVersionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLayerVersionPolicyResult> getLayerVersionPolicyAsync(GetLayerVersionPolicyRequest getLayerVersionPolicyRequest);

    /**
     * <p>
     * Returns the permission policy for a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>. For more
     * information, see <a>AddLayerVersionPermission</a>.
     * </p>
     * 
     * @param getLayerVersionPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLayerVersionPolicy operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetLayerVersionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetLayerVersionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLayerVersionPolicyResult> getLayerVersionPolicyAsync(GetLayerVersionPolicyRequest getLayerVersionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetLayerVersionPolicyRequest, GetLayerVersionPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns the <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/access-control-resource-based.html">resource-based IAM
     * policy</a> for a function, version, or alias.
     * </p>
     * 
     * @param getPolicyRequest
     * @return A Java Future containing the result of the GetPolicy operation returned by the service.
     * @sample AWSLambdaAsync.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest getPolicyRequest);

    /**
     * <p>
     * Returns the <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/access-control-resource-based.html">resource-based IAM
     * policy</a> for a function, version, or alias.
     * </p>
     * 
     * @param getPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPolicy operation returned by the service.
     * @sample AWSLambdaAsyncHandler.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest getPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves the provisioned concurrency configuration for a function's alias or version.
     * </p>
     * 
     * @param getProvisionedConcurrencyConfigRequest
     * @return A Java Future containing the result of the GetProvisionedConcurrencyConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsync.GetProvisionedConcurrencyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetProvisionedConcurrencyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProvisionedConcurrencyConfigResult> getProvisionedConcurrencyConfigAsync(
            GetProvisionedConcurrencyConfigRequest getProvisionedConcurrencyConfigRequest);

    /**
     * <p>
     * Retrieves the provisioned concurrency configuration for a function's alias or version.
     * </p>
     * 
     * @param getProvisionedConcurrencyConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProvisionedConcurrencyConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsyncHandler.GetProvisionedConcurrencyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetProvisionedConcurrencyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProvisionedConcurrencyConfigResult> getProvisionedConcurrencyConfigAsync(
            GetProvisionedConcurrencyConfigRequest getProvisionedConcurrencyConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetProvisionedConcurrencyConfigRequest, GetProvisionedConcurrencyConfigResult> asyncHandler);

    /**
     * <p>
     * Invokes a Lambda function. You can invoke a function synchronously (and wait for the response), or
     * asynchronously. To invoke a function asynchronously, set <code>InvocationType</code> to <code>Event</code>.
     * </p>
     * <p>
     * For <a href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-sync.html">synchronous invocation</a>,
     * details about the function response, including errors, are included in the response body and headers. For either
     * invocation type, you can find more information in the <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/monitoring-functions.html">execution log</a> and <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-x-ray.html">trace</a>.
     * </p>
     * <p>
     * When an error occurs, your function may be invoked multiple times. Retry behavior varies by error type, client,
     * event source, and invocation type. For example, if you invoke a function asynchronously and it returns an error,
     * Lambda executes the function up to two more times. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/retries-on-errors.html">Retry Behavior</a>.
     * </p>
     * <p>
     * For <a href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html">asynchronous invocation</a>,
     * Lambda adds events to a queue before sending them to your function. If your function does not have enough
     * capacity to keep up with the queue, events may be lost. Occasionally, your function may receive the same event
     * multiple times, even if no error occurs. To retain events that were not processed, configure your function with a
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq">dead-letter queue</a>.
     * </p>
     * <p>
     * The status code in the API response doesn't reflect function errors. Error codes are reserved for errors that
     * prevent your function from executing, such as permissions errors, <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">limit errors</a>, or issues with your function's
     * code and configuration. For example, Lambda returns <code>TooManyRequestsException</code> if executing the
     * function would cause you to exceed a concurrency limit at either the account level (
     * <code>ConcurrentInvocationLimitExceeded</code>) or function level (
     * <code>ReservedFunctionConcurrentInvocationLimitExceeded</code>).
     * </p>
     * <p>
     * For functions with a long timeout, your client might be disconnected during synchronous invocation while it waits
     * for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long
     * connections with timeout or keep-alive settings.
     * </p>
     * <p>
     * This operation requires permission for the <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/list_awslambda.html">lambda:InvokeFunction</a> action.
     * </p>
     * 
     * @param invokeRequest
     * @return A Java Future containing the result of the Invoke operation returned by the service.
     * @sample AWSLambdaAsync.Invoke
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/Invoke" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InvokeResult> invokeAsync(InvokeRequest invokeRequest);

    /**
     * <p>
     * Invokes a Lambda function. You can invoke a function synchronously (and wait for the response), or
     * asynchronously. To invoke a function asynchronously, set <code>InvocationType</code> to <code>Event</code>.
     * </p>
     * <p>
     * For <a href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-sync.html">synchronous invocation</a>,
     * details about the function response, including errors, are included in the response body and headers. For either
     * invocation type, you can find more information in the <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/monitoring-functions.html">execution log</a> and <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-x-ray.html">trace</a>.
     * </p>
     * <p>
     * When an error occurs, your function may be invoked multiple times. Retry behavior varies by error type, client,
     * event source, and invocation type. For example, if you invoke a function asynchronously and it returns an error,
     * Lambda executes the function up to two more times. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/retries-on-errors.html">Retry Behavior</a>.
     * </p>
     * <p>
     * For <a href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html">asynchronous invocation</a>,
     * Lambda adds events to a queue before sending them to your function. If your function does not have enough
     * capacity to keep up with the queue, events may be lost. Occasionally, your function may receive the same event
     * multiple times, even if no error occurs. To retain events that were not processed, configure your function with a
     * <a href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq">dead-letter queue</a>.
     * </p>
     * <p>
     * The status code in the API response doesn't reflect function errors. Error codes are reserved for errors that
     * prevent your function from executing, such as permissions errors, <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">limit errors</a>, or issues with your function's
     * code and configuration. For example, Lambda returns <code>TooManyRequestsException</code> if executing the
     * function would cause you to exceed a concurrency limit at either the account level (
     * <code>ConcurrentInvocationLimitExceeded</code>) or function level (
     * <code>ReservedFunctionConcurrentInvocationLimitExceeded</code>).
     * </p>
     * <p>
     * For functions with a long timeout, your client might be disconnected during synchronous invocation while it waits
     * for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long
     * connections with timeout or keep-alive settings.
     * </p>
     * <p>
     * This operation requires permission for the <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/list_awslambda.html">lambda:InvokeFunction</a> action.
     * </p>
     * 
     * @param invokeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Invoke operation returned by the service.
     * @sample AWSLambdaAsyncHandler.Invoke
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/Invoke" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InvokeResult> invokeAsync(InvokeRequest invokeRequest,
            com.amazonaws.handlers.AsyncHandler<InvokeRequest, InvokeResult> asyncHandler);

    /**
     * <important>
     * <p>
     * For asynchronous function invocation, use <a>Invoke</a>.
     * </p>
     * </important>
     * <p>
     * Invokes a function asynchronously.
     * </p>
     * 
     * @param invokeAsyncRequest
     * @return A Java Future containing the result of the InvokeAsync operation returned by the service.
     * @sample AWSLambdaAsync.InvokeAsync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/InvokeAsync" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<InvokeAsyncResult> invokeAsyncAsync(InvokeAsyncRequest invokeAsyncRequest);

    /**
     * <important>
     * <p>
     * For asynchronous function invocation, use <a>Invoke</a>.
     * </p>
     * </important>
     * <p>
     * Invokes a function asynchronously.
     * </p>
     * 
     * @param invokeAsyncRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InvokeAsync operation returned by the service.
     * @sample AWSLambdaAsyncHandler.InvokeAsync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/InvokeAsync" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<InvokeAsyncResult> invokeAsyncAsync(InvokeAsyncRequest invokeAsyncRequest,
            com.amazonaws.handlers.AsyncHandler<InvokeAsyncRequest, InvokeAsyncResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">aliases</a> for
     * a Lambda function.
     * </p>
     * 
     * @param listAliasesRequest
     * @return A Java Future containing the result of the ListAliases operation returned by the service.
     * @sample AWSLambdaAsync.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest);

    /**
     * <p>
     * Returns a list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">aliases</a> for
     * a Lambda function.
     * </p>
     * 
     * @param listAliasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAliases operation returned by the service.
     * @sample AWSLambdaAsyncHandler.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuring-codesigning.html">code
     * signing configurations</a>. A request returns up to 10,000 configurations per call. You can use the
     * <code>MaxItems</code> parameter to return fewer configurations per call.
     * </p>
     * 
     * @param listCodeSigningConfigsRequest
     * @return A Java Future containing the result of the ListCodeSigningConfigs operation returned by the service.
     * @sample AWSLambdaAsync.ListCodeSigningConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListCodeSigningConfigs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCodeSigningConfigsResult> listCodeSigningConfigsAsync(ListCodeSigningConfigsRequest listCodeSigningConfigsRequest);

    /**
     * <p>
     * Returns a list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuring-codesigning.html">code
     * signing configurations</a>. A request returns up to 10,000 configurations per call. You can use the
     * <code>MaxItems</code> parameter to return fewer configurations per call.
     * </p>
     * 
     * @param listCodeSigningConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCodeSigningConfigs operation returned by the service.
     * @sample AWSLambdaAsyncHandler.ListCodeSigningConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListCodeSigningConfigs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCodeSigningConfigsResult> listCodeSigningConfigsAsync(ListCodeSigningConfigsRequest listCodeSigningConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCodeSigningConfigsRequest, ListCodeSigningConfigsResult> asyncHandler);

    /**
     * <p>
     * Lists event source mappings. Specify an <code>EventSourceArn</code> to only show event source mappings for a
     * single event source.
     * </p>
     * 
     * @param listEventSourceMappingsRequest
     * @return A Java Future containing the result of the ListEventSourceMappings operation returned by the service.
     * @sample AWSLambdaAsync.ListEventSourceMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListEventSourceMappings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(ListEventSourceMappingsRequest listEventSourceMappingsRequest);

    /**
     * <p>
     * Lists event source mappings. Specify an <code>EventSourceArn</code> to only show event source mappings for a
     * single event source.
     * </p>
     * 
     * @param listEventSourceMappingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEventSourceMappings operation returned by the service.
     * @sample AWSLambdaAsyncHandler.ListEventSourceMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListEventSourceMappings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(ListEventSourceMappingsRequest listEventSourceMappingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEventSourceMappingsRequest, ListEventSourceMappingsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListEventSourceMappings operation.
     *
     * @see #listEventSourceMappingsAsync(ListEventSourceMappingsRequest)
     */
    java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync();

    /**
     * Simplified method form for invoking the ListEventSourceMappings operation with an AsyncHandler.
     *
     * @see #listEventSourceMappingsAsync(ListEventSourceMappingsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(
            com.amazonaws.handlers.AsyncHandler<ListEventSourceMappingsRequest, ListEventSourceMappingsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of configurations for asynchronous invocation for a function.
     * </p>
     * <p>
     * To configure options for asynchronous invocation, use <a>PutFunctionEventInvokeConfig</a>.
     * </p>
     * 
     * @param listFunctionEventInvokeConfigsRequest
     * @return A Java Future containing the result of the ListFunctionEventInvokeConfigs operation returned by the
     *         service.
     * @sample AWSLambdaAsync.ListFunctionEventInvokeConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctionEventInvokeConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFunctionEventInvokeConfigsResult> listFunctionEventInvokeConfigsAsync(
            ListFunctionEventInvokeConfigsRequest listFunctionEventInvokeConfigsRequest);

    /**
     * <p>
     * Retrieves a list of configurations for asynchronous invocation for a function.
     * </p>
     * <p>
     * To configure options for asynchronous invocation, use <a>PutFunctionEventInvokeConfig</a>.
     * </p>
     * 
     * @param listFunctionEventInvokeConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFunctionEventInvokeConfigs operation returned by the
     *         service.
     * @sample AWSLambdaAsyncHandler.ListFunctionEventInvokeConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctionEventInvokeConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFunctionEventInvokeConfigsResult> listFunctionEventInvokeConfigsAsync(
            ListFunctionEventInvokeConfigsRequest listFunctionEventInvokeConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFunctionEventInvokeConfigsRequest, ListFunctionEventInvokeConfigsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of Lambda functions, with the version-specific configuration of each. Lambda returns up to 50
     * functions per call.
     * </p>
     * <p>
     * Set <code>FunctionVersion</code> to <code>ALL</code> to include all published versions of each function in
     * addition to the unpublished version.
     * </p>
     * <note>
     * <p>
     * The <code>ListFunctions</code> action returns a subset of the <a>FunctionConfiguration</a> fields. To get the
     * additional fields (State, StateReasonCode, StateReason, LastUpdateStatus, LastUpdateStatusReason,
     * LastUpdateStatusReasonCode) for a function or version, use <a>GetFunction</a>.
     * </p>
     * </note>
     * 
     * @param listFunctionsRequest
     * @return A Java Future containing the result of the ListFunctions operation returned by the service.
     * @sample AWSLambdaAsync.ListFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(ListFunctionsRequest listFunctionsRequest);

    /**
     * <p>
     * Returns a list of Lambda functions, with the version-specific configuration of each. Lambda returns up to 50
     * functions per call.
     * </p>
     * <p>
     * Set <code>FunctionVersion</code> to <code>ALL</code> to include all published versions of each function in
     * addition to the unpublished version.
     * </p>
     * <note>
     * <p>
     * The <code>ListFunctions</code> action returns a subset of the <a>FunctionConfiguration</a> fields. To get the
     * additional fields (State, StateReasonCode, StateReason, LastUpdateStatus, LastUpdateStatusReason,
     * LastUpdateStatusReasonCode) for a function or version, use <a>GetFunction</a>.
     * </p>
     * </note>
     * 
     * @param listFunctionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFunctions operation returned by the service.
     * @sample AWSLambdaAsyncHandler.ListFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(ListFunctionsRequest listFunctionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFunctionsRequest, ListFunctionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListFunctions operation.
     *
     * @see #listFunctionsAsync(ListFunctionsRequest)
     */
    java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync();

    /**
     * Simplified method form for invoking the ListFunctions operation with an AsyncHandler.
     *
     * @see #listFunctionsAsync(ListFunctionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(
            com.amazonaws.handlers.AsyncHandler<ListFunctionsRequest, ListFunctionsResult> asyncHandler);

    /**
     * <p>
     * List the functions that use the specified code signing configuration. You can use this method prior to deleting a
     * code signing configuration, to verify that no functions are using it.
     * </p>
     * 
     * @param listFunctionsByCodeSigningConfigRequest
     * @return A Java Future containing the result of the ListFunctionsByCodeSigningConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsync.ListFunctionsByCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctionsByCodeSigningConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFunctionsByCodeSigningConfigResult> listFunctionsByCodeSigningConfigAsync(
            ListFunctionsByCodeSigningConfigRequest listFunctionsByCodeSigningConfigRequest);

    /**
     * <p>
     * List the functions that use the specified code signing configuration. You can use this method prior to deleting a
     * code signing configuration, to verify that no functions are using it.
     * </p>
     * 
     * @param listFunctionsByCodeSigningConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFunctionsByCodeSigningConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsyncHandler.ListFunctionsByCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctionsByCodeSigningConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFunctionsByCodeSigningConfigResult> listFunctionsByCodeSigningConfigAsync(
            ListFunctionsByCodeSigningConfigRequest listFunctionsByCodeSigningConfigRequest,
            com.amazonaws.handlers.AsyncHandler<ListFunctionsByCodeSigningConfigRequest, ListFunctionsByCodeSigningConfigResult> asyncHandler);

    /**
     * <p>
     * Lists the versions of an <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS
     * Lambda layer</a>. Versions that have been deleted aren't listed. Specify a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime identifier</a> to list only
     * versions that indicate that they're compatible with that runtime.
     * </p>
     * 
     * @param listLayerVersionsRequest
     * @return A Java Future containing the result of the ListLayerVersions operation returned by the service.
     * @sample AWSLambdaAsync.ListLayerVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListLayerVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLayerVersionsResult> listLayerVersionsAsync(ListLayerVersionsRequest listLayerVersionsRequest);

    /**
     * <p>
     * Lists the versions of an <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS
     * Lambda layer</a>. Versions that have been deleted aren't listed. Specify a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime identifier</a> to list only
     * versions that indicate that they're compatible with that runtime.
     * </p>
     * 
     * @param listLayerVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLayerVersions operation returned by the service.
     * @sample AWSLambdaAsyncHandler.ListLayerVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListLayerVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLayerVersionsResult> listLayerVersionsAsync(ListLayerVersionsRequest listLayerVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLayerVersionsRequest, ListLayerVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layers</a> and
     * shows information about the latest version of each. Specify a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime identifier</a> to list only
     * layers that indicate that they're compatible with that runtime.
     * </p>
     * 
     * @param listLayersRequest
     * @return A Java Future containing the result of the ListLayers operation returned by the service.
     * @sample AWSLambdaAsync.ListLayers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListLayers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLayersResult> listLayersAsync(ListLayersRequest listLayersRequest);

    /**
     * <p>
     * Lists <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layers</a> and
     * shows information about the latest version of each. Specify a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime identifier</a> to list only
     * layers that indicate that they're compatible with that runtime.
     * </p>
     * 
     * @param listLayersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLayers operation returned by the service.
     * @sample AWSLambdaAsyncHandler.ListLayers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListLayers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLayersResult> listLayersAsync(ListLayersRequest listLayersRequest,
            com.amazonaws.handlers.AsyncHandler<ListLayersRequest, ListLayersResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of provisioned concurrency configurations for a function.
     * </p>
     * 
     * @param listProvisionedConcurrencyConfigsRequest
     * @return A Java Future containing the result of the ListProvisionedConcurrencyConfigs operation returned by the
     *         service.
     * @sample AWSLambdaAsync.ListProvisionedConcurrencyConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListProvisionedConcurrencyConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProvisionedConcurrencyConfigsResult> listProvisionedConcurrencyConfigsAsync(
            ListProvisionedConcurrencyConfigsRequest listProvisionedConcurrencyConfigsRequest);

    /**
     * <p>
     * Retrieves a list of provisioned concurrency configurations for a function.
     * </p>
     * 
     * @param listProvisionedConcurrencyConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProvisionedConcurrencyConfigs operation returned by the
     *         service.
     * @sample AWSLambdaAsyncHandler.ListProvisionedConcurrencyConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListProvisionedConcurrencyConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProvisionedConcurrencyConfigsResult> listProvisionedConcurrencyConfigsAsync(
            ListProvisionedConcurrencyConfigsRequest listProvisionedConcurrencyConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProvisionedConcurrencyConfigsRequest, ListProvisionedConcurrencyConfigsResult> asyncHandler);

    /**
     * <p>
     * Returns a function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a>. You can also
     * view tags with <a>GetFunction</a>.
     * </p>
     * 
     * @param listTagsRequest
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AWSLambdaAsync.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Returns a function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a>. You can also
     * view tags with <a>GetFunction</a>.
     * </p>
     * 
     * @param listTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AWSLambdaAsyncHandler.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">versions</a>,
     * with the version-specific configuration of each. Lambda returns up to 50 versions per call.
     * </p>
     * 
     * @param listVersionsByFunctionRequest
     * @return A Java Future containing the result of the ListVersionsByFunction operation returned by the service.
     * @sample AWSLambdaAsync.ListVersionsByFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListVersionsByFunction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListVersionsByFunctionResult> listVersionsByFunctionAsync(ListVersionsByFunctionRequest listVersionsByFunctionRequest);

    /**
     * <p>
     * Returns a list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">versions</a>,
     * with the version-specific configuration of each. Lambda returns up to 50 versions per call.
     * </p>
     * 
     * @param listVersionsByFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVersionsByFunction operation returned by the service.
     * @sample AWSLambdaAsyncHandler.ListVersionsByFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListVersionsByFunction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListVersionsByFunctionResult> listVersionsByFunctionAsync(ListVersionsByFunctionRequest listVersionsByFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<ListVersionsByFunctionRequest, ListVersionsByFunctionResult> asyncHandler);

    /**
     * <p>
     * Creates an <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>
     * from a ZIP archive. Each time you call <code>PublishLayerVersion</code> with the same layer name, a new version
     * is created.
     * </p>
     * <p>
     * Add layers to your function with <a>CreateFunction</a> or <a>UpdateFunctionConfiguration</a>.
     * </p>
     * 
     * @param publishLayerVersionRequest
     * @return A Java Future containing the result of the PublishLayerVersion operation returned by the service.
     * @sample AWSLambdaAsync.PublishLayerVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PublishLayerVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PublishLayerVersionResult> publishLayerVersionAsync(PublishLayerVersionRequest publishLayerVersionRequest);

    /**
     * <p>
     * Creates an <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>
     * from a ZIP archive. Each time you call <code>PublishLayerVersion</code> with the same layer name, a new version
     * is created.
     * </p>
     * <p>
     * Add layers to your function with <a>CreateFunction</a> or <a>UpdateFunctionConfiguration</a>.
     * </p>
     * 
     * @param publishLayerVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PublishLayerVersion operation returned by the service.
     * @sample AWSLambdaAsyncHandler.PublishLayerVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PublishLayerVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PublishLayerVersionResult> publishLayerVersionAsync(PublishLayerVersionRequest publishLayerVersionRequest,
            com.amazonaws.handlers.AsyncHandler<PublishLayerVersionRequest, PublishLayerVersionResult> asyncHandler);

    /**
     * <p>
     * Creates a <a href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">version</a> from the
     * current code and configuration of a function. Use versions to create a snapshot of your function code and
     * configuration that doesn't change.
     * </p>
     * <p>
     * AWS Lambda doesn't publish a version if the function's configuration and code haven't changed since the last
     * version. Use <a>UpdateFunctionCode</a> or <a>UpdateFunctionConfiguration</a> to update the function before
     * publishing a version.
     * </p>
     * <p>
     * Clients can invoke versions directly or with an alias. To create an alias, use <a>CreateAlias</a>.
     * </p>
     * 
     * @param publishVersionRequest
     * @return A Java Future containing the result of the PublishVersion operation returned by the service.
     * @sample AWSLambdaAsync.PublishVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PublishVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PublishVersionResult> publishVersionAsync(PublishVersionRequest publishVersionRequest);

    /**
     * <p>
     * Creates a <a href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">version</a> from the
     * current code and configuration of a function. Use versions to create a snapshot of your function code and
     * configuration that doesn't change.
     * </p>
     * <p>
     * AWS Lambda doesn't publish a version if the function's configuration and code haven't changed since the last
     * version. Use <a>UpdateFunctionCode</a> or <a>UpdateFunctionConfiguration</a> to update the function before
     * publishing a version.
     * </p>
     * <p>
     * Clients can invoke versions directly or with an alias. To create an alias, use <a>CreateAlias</a>.
     * </p>
     * 
     * @param publishVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PublishVersion operation returned by the service.
     * @sample AWSLambdaAsyncHandler.PublishVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PublishVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PublishVersionResult> publishVersionAsync(PublishVersionRequest publishVersionRequest,
            com.amazonaws.handlers.AsyncHandler<PublishVersionRequest, PublishVersionResult> asyncHandler);

    /**
     * <p>
     * Update the code signing configuration for the function. Changes to the code signing configuration take effect the
     * next time a user tries to deploy a code package to the function.
     * </p>
     * 
     * @param putFunctionCodeSigningConfigRequest
     * @return A Java Future containing the result of the PutFunctionCodeSigningConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsync.PutFunctionCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutFunctionCodeSigningConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutFunctionCodeSigningConfigResult> putFunctionCodeSigningConfigAsync(
            PutFunctionCodeSigningConfigRequest putFunctionCodeSigningConfigRequest);

    /**
     * <p>
     * Update the code signing configuration for the function. Changes to the code signing configuration take effect the
     * next time a user tries to deploy a code package to the function.
     * </p>
     * 
     * @param putFunctionCodeSigningConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutFunctionCodeSigningConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsyncHandler.PutFunctionCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutFunctionCodeSigningConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutFunctionCodeSigningConfigResult> putFunctionCodeSigningConfigAsync(
            PutFunctionCodeSigningConfigRequest putFunctionCodeSigningConfigRequest,
            com.amazonaws.handlers.AsyncHandler<PutFunctionCodeSigningConfigRequest, PutFunctionCodeSigningConfigResult> asyncHandler);

    /**
     * <p>
     * Sets the maximum number of simultaneous executions for a function, and reserves capacity for that concurrency
     * level.
     * </p>
     * <p>
     * Concurrency settings apply to the function as a whole, including all published versions and the unpublished
     * version. Reserving concurrency both ensures that your function has capacity to process the specified number of
     * events simultaneously, and prevents it from scaling beyond that level. Use <a>GetFunction</a> to see the current
     * setting for a function.
     * </p>
     * <p>
     * Use <a>GetAccountSettings</a> to see your Regional concurrency limit. You can reserve concurrency for as many
     * functions as you like, as long as you leave at least 100 simultaneous executions unreserved for functions that
     * aren't configured with a per-function limit. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.
     * </p>
     * 
     * @param putFunctionConcurrencyRequest
     * @return A Java Future containing the result of the PutFunctionConcurrency operation returned by the service.
     * @sample AWSLambdaAsync.PutFunctionConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutFunctionConcurrency" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutFunctionConcurrencyResult> putFunctionConcurrencyAsync(PutFunctionConcurrencyRequest putFunctionConcurrencyRequest);

    /**
     * <p>
     * Sets the maximum number of simultaneous executions for a function, and reserves capacity for that concurrency
     * level.
     * </p>
     * <p>
     * Concurrency settings apply to the function as a whole, including all published versions and the unpublished
     * version. Reserving concurrency both ensures that your function has capacity to process the specified number of
     * events simultaneously, and prevents it from scaling beyond that level. Use <a>GetFunction</a> to see the current
     * setting for a function.
     * </p>
     * <p>
     * Use <a>GetAccountSettings</a> to see your Regional concurrency limit. You can reserve concurrency for as many
     * functions as you like, as long as you leave at least 100 simultaneous executions unreserved for functions that
     * aren't configured with a per-function limit. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.
     * </p>
     * 
     * @param putFunctionConcurrencyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutFunctionConcurrency operation returned by the service.
     * @sample AWSLambdaAsyncHandler.PutFunctionConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutFunctionConcurrency" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutFunctionConcurrencyResult> putFunctionConcurrencyAsync(PutFunctionConcurrencyRequest putFunctionConcurrencyRequest,
            com.amazonaws.handlers.AsyncHandler<PutFunctionConcurrencyRequest, PutFunctionConcurrencyResult> asyncHandler);

    /**
     * <p>
     * Configures options for <a href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html">asynchronous
     * invocation</a> on a function, version, or alias. If a configuration already exists for a function, version, or
     * alias, this operation overwrites it. If you exclude any settings, they are removed. To set one option without
     * affecting existing settings for other options, use <a>UpdateFunctionEventInvokeConfig</a>.
     * </p>
     * <p>
     * By default, Lambda retries an asynchronous invocation twice if the function returns an error. It retains events
     * in a queue for up to six hours. When an event fails all processing attempts or stays in the asynchronous
     * invocation queue for too long, Lambda discards it. To retain discarded events, configure a dead-letter queue with
     * <a>UpdateFunctionConfiguration</a>.
     * </p>
     * <p>
     * To send an invocation record to a queue, topic, function, or event bus, specify a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations"
     * >destination</a>. You can configure separate destinations for successful invocations (on-success) and events that
     * fail all processing attempts (on-failure). You can configure destinations in addition to or instead of a
     * dead-letter queue.
     * </p>
     * 
     * @param putFunctionEventInvokeConfigRequest
     * @return A Java Future containing the result of the PutFunctionEventInvokeConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsync.PutFunctionEventInvokeConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutFunctionEventInvokeConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutFunctionEventInvokeConfigResult> putFunctionEventInvokeConfigAsync(
            PutFunctionEventInvokeConfigRequest putFunctionEventInvokeConfigRequest);

    /**
     * <p>
     * Configures options for <a href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html">asynchronous
     * invocation</a> on a function, version, or alias. If a configuration already exists for a function, version, or
     * alias, this operation overwrites it. If you exclude any settings, they are removed. To set one option without
     * affecting existing settings for other options, use <a>UpdateFunctionEventInvokeConfig</a>.
     * </p>
     * <p>
     * By default, Lambda retries an asynchronous invocation twice if the function returns an error. It retains events
     * in a queue for up to six hours. When an event fails all processing attempts or stays in the asynchronous
     * invocation queue for too long, Lambda discards it. To retain discarded events, configure a dead-letter queue with
     * <a>UpdateFunctionConfiguration</a>.
     * </p>
     * <p>
     * To send an invocation record to a queue, topic, function, or event bus, specify a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations"
     * >destination</a>. You can configure separate destinations for successful invocations (on-success) and events that
     * fail all processing attempts (on-failure). You can configure destinations in addition to or instead of a
     * dead-letter queue.
     * </p>
     * 
     * @param putFunctionEventInvokeConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutFunctionEventInvokeConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsyncHandler.PutFunctionEventInvokeConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutFunctionEventInvokeConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutFunctionEventInvokeConfigResult> putFunctionEventInvokeConfigAsync(
            PutFunctionEventInvokeConfigRequest putFunctionEventInvokeConfigRequest,
            com.amazonaws.handlers.AsyncHandler<PutFunctionEventInvokeConfigRequest, PutFunctionEventInvokeConfigResult> asyncHandler);

    /**
     * <p>
     * Adds a provisioned concurrency configuration to a function's alias or version.
     * </p>
     * 
     * @param putProvisionedConcurrencyConfigRequest
     * @return A Java Future containing the result of the PutProvisionedConcurrencyConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsync.PutProvisionedConcurrencyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutProvisionedConcurrencyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutProvisionedConcurrencyConfigResult> putProvisionedConcurrencyConfigAsync(
            PutProvisionedConcurrencyConfigRequest putProvisionedConcurrencyConfigRequest);

    /**
     * <p>
     * Adds a provisioned concurrency configuration to a function's alias or version.
     * </p>
     * 
     * @param putProvisionedConcurrencyConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutProvisionedConcurrencyConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsyncHandler.PutProvisionedConcurrencyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutProvisionedConcurrencyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutProvisionedConcurrencyConfigResult> putProvisionedConcurrencyConfigAsync(
            PutProvisionedConcurrencyConfigRequest putProvisionedConcurrencyConfigRequest,
            com.amazonaws.handlers.AsyncHandler<PutProvisionedConcurrencyConfigRequest, PutProvisionedConcurrencyConfigResult> asyncHandler);

    /**
     * <p>
     * Removes a statement from the permissions policy for a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>. For more
     * information, see <a>AddLayerVersionPermission</a>.
     * </p>
     * 
     * @param removeLayerVersionPermissionRequest
     * @return A Java Future containing the result of the RemoveLayerVersionPermission operation returned by the
     *         service.
     * @sample AWSLambdaAsync.RemoveLayerVersionPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/RemoveLayerVersionPermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveLayerVersionPermissionResult> removeLayerVersionPermissionAsync(
            RemoveLayerVersionPermissionRequest removeLayerVersionPermissionRequest);

    /**
     * <p>
     * Removes a statement from the permissions policy for a version of an <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>. For more
     * information, see <a>AddLayerVersionPermission</a>.
     * </p>
     * 
     * @param removeLayerVersionPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveLayerVersionPermission operation returned by the
     *         service.
     * @sample AWSLambdaAsyncHandler.RemoveLayerVersionPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/RemoveLayerVersionPermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveLayerVersionPermissionResult> removeLayerVersionPermissionAsync(
            RemoveLayerVersionPermissionRequest removeLayerVersionPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveLayerVersionPermissionRequest, RemoveLayerVersionPermissionResult> asyncHandler);

    /**
     * <p>
     * Revokes function-use permission from an AWS service or another account. You can get the ID of the statement from
     * the output of <a>GetPolicy</a>.
     * </p>
     * 
     * @param removePermissionRequest
     * @return A Java Future containing the result of the RemovePermission operation returned by the service.
     * @sample AWSLambdaAsync.RemovePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/RemovePermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest removePermissionRequest);

    /**
     * <p>
     * Revokes function-use permission from an AWS service or another account. You can get the ID of the statement from
     * the output of <a>GetPolicy</a>.
     * </p>
     * 
     * @param removePermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemovePermission operation returned by the service.
     * @sample AWSLambdaAsyncHandler.RemovePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/RemovePermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest removePermissionRequest,
            com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler);

    /**
     * <p>
     * Adds <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a> to a function.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSLambdaAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a> to a function.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSLambdaAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a> from a function.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSLambdaAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a> from a function.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSLambdaAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of a Lambda function <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">alias</a>.
     * </p>
     * 
     * @param updateAliasRequest
     * @return A Java Future containing the result of the UpdateAlias operation returned by the service.
     * @sample AWSLambdaAsync.UpdateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest updateAliasRequest);

    /**
     * <p>
     * Updates the configuration of a Lambda function <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">alias</a>.
     * </p>
     * 
     * @param updateAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAlias operation returned by the service.
     * @sample AWSLambdaAsyncHandler.UpdateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest updateAliasRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler);

    /**
     * <p>
     * Update the code signing configuration. Changes to the code signing configuration take effect the next time a user
     * tries to deploy a code package to the function.
     * </p>
     * 
     * @param updateCodeSigningConfigRequest
     * @return A Java Future containing the result of the UpdateCodeSigningConfig operation returned by the service.
     * @sample AWSLambdaAsync.UpdateCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateCodeSigningConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCodeSigningConfigResult> updateCodeSigningConfigAsync(UpdateCodeSigningConfigRequest updateCodeSigningConfigRequest);

    /**
     * <p>
     * Update the code signing configuration. Changes to the code signing configuration take effect the next time a user
     * tries to deploy a code package to the function.
     * </p>
     * 
     * @param updateCodeSigningConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCodeSigningConfig operation returned by the service.
     * @sample AWSLambdaAsyncHandler.UpdateCodeSigningConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateCodeSigningConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCodeSigningConfigResult> updateCodeSigningConfigAsync(UpdateCodeSigningConfigRequest updateCodeSigningConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCodeSigningConfigRequest, UpdateCodeSigningConfigResult> asyncHandler);

    /**
     * <p>
     * Updates an event source mapping. You can change the function that AWS Lambda invokes, or pause invocation and
     * resume later from the same location.
     * </p>
     * <p>
     * The following error handling options are only available for stream sources (DynamoDB and Kinesis):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BisectBatchOnFunctionError</code> - If the function returns an error, split the batch in two and retry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationConfig</code> - Send discarded records to an Amazon SQS queue or Amazon SNS topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumRecordAgeInSeconds</code> - Discard records older than the specified age. The default value is
     * infinite (-1). When set to infinite (-1), failed records are retried until the record expires
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumRetryAttempts</code> - Discard records after the specified number of retries. The default value is
     * infinite (-1). When set to infinite (-1), failed records are retried until the record expires.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ParallelizationFactor</code> - Process multiple batches from each shard concurrently.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateEventSourceMappingRequest
     * @return A Java Future containing the result of the UpdateEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsync.UpdateEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEventSourceMappingResult> updateEventSourceMappingAsync(UpdateEventSourceMappingRequest updateEventSourceMappingRequest);

    /**
     * <p>
     * Updates an event source mapping. You can change the function that AWS Lambda invokes, or pause invocation and
     * resume later from the same location.
     * </p>
     * <p>
     * The following error handling options are only available for stream sources (DynamoDB and Kinesis):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BisectBatchOnFunctionError</code> - If the function returns an error, split the batch in two and retry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationConfig</code> - Send discarded records to an Amazon SQS queue or Amazon SNS topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumRecordAgeInSeconds</code> - Discard records older than the specified age. The default value is
     * infinite (-1). When set to infinite (-1), failed records are retried until the record expires
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumRetryAttempts</code> - Discard records after the specified number of retries. The default value is
     * infinite (-1). When set to infinite (-1), failed records are retried until the record expires.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ParallelizationFactor</code> - Process multiple batches from each shard concurrently.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateEventSourceMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEventSourceMapping operation returned by the service.
     * @sample AWSLambdaAsyncHandler.UpdateEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEventSourceMappingResult> updateEventSourceMappingAsync(UpdateEventSourceMappingRequest updateEventSourceMappingRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEventSourceMappingRequest, UpdateEventSourceMappingResult> asyncHandler);

    /**
     * <p>
     * Updates a Lambda function's code. If code signing is enabled for the function, the code package must be signed by
     * a trusted publisher. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-trustedcode.html">Configuring code signing</a>.
     * </p>
     * <p>
     * The function's code is locked when you publish a version. You can't modify the code of a published version, only
     * the unpublished version.
     * </p>
     * <note>
     * <p>
     * For a function defined as a container image, Lambda resolves the image tag to an image digest. In Amazon ECR, if
     * you update the image tag to a new image, Lambda does not automatically update the function.
     * </p>
     * </note>
     * 
     * @param updateFunctionCodeRequest
     * @return A Java Future containing the result of the UpdateFunctionCode operation returned by the service.
     * @sample AWSLambdaAsync.UpdateFunctionCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionCode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFunctionCodeResult> updateFunctionCodeAsync(UpdateFunctionCodeRequest updateFunctionCodeRequest);

    /**
     * <p>
     * Updates a Lambda function's code. If code signing is enabled for the function, the code package must be signed by
     * a trusted publisher. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-trustedcode.html">Configuring code signing</a>.
     * </p>
     * <p>
     * The function's code is locked when you publish a version. You can't modify the code of a published version, only
     * the unpublished version.
     * </p>
     * <note>
     * <p>
     * For a function defined as a container image, Lambda resolves the image tag to an image digest. In Amazon ECR, if
     * you update the image tag to a new image, Lambda does not automatically update the function.
     * </p>
     * </note>
     * 
     * @param updateFunctionCodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFunctionCode operation returned by the service.
     * @sample AWSLambdaAsyncHandler.UpdateFunctionCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionCode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFunctionCodeResult> updateFunctionCodeAsync(UpdateFunctionCodeRequest updateFunctionCodeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFunctionCodeRequest, UpdateFunctionCodeResult> asyncHandler);

    /**
     * <p>
     * Modify the version-specific settings of a Lambda function.
     * </p>
     * <p>
     * When you update a function, Lambda provisions an instance of the function and its supporting resources. If your
     * function connects to a VPC, this process can take a minute. During this time, you can't modify the function, but
     * you can still invoke it. The <code>LastUpdateStatus</code>, <code>LastUpdateStatusReason</code>, and
     * <code>LastUpdateStatusReasonCode</code> fields in the response from <a>GetFunctionConfiguration</a> indicate when
     * the update is complete and the function is processing events with the new configuration. For more information,
     * see <a href="https://docs.aws.amazon.com/lambda/latest/dg/functions-states.html">Function States</a>.
     * </p>
     * <p>
     * These settings can vary between versions of a function and are locked when you publish a version. You can't
     * modify the configuration of a published version, only the unpublished version.
     * </p>
     * <p>
     * To configure function concurrency, use <a>PutFunctionConcurrency</a>. To grant invoke permissions to an account
     * or AWS service, use <a>AddPermission</a>.
     * </p>
     * 
     * @param updateFunctionConfigurationRequest
     * @return A Java Future containing the result of the UpdateFunctionConfiguration operation returned by the service.
     * @sample AWSLambdaAsync.UpdateFunctionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFunctionConfigurationResult> updateFunctionConfigurationAsync(
            UpdateFunctionConfigurationRequest updateFunctionConfigurationRequest);

    /**
     * <p>
     * Modify the version-specific settings of a Lambda function.
     * </p>
     * <p>
     * When you update a function, Lambda provisions an instance of the function and its supporting resources. If your
     * function connects to a VPC, this process can take a minute. During this time, you can't modify the function, but
     * you can still invoke it. The <code>LastUpdateStatus</code>, <code>LastUpdateStatusReason</code>, and
     * <code>LastUpdateStatusReasonCode</code> fields in the response from <a>GetFunctionConfiguration</a> indicate when
     * the update is complete and the function is processing events with the new configuration. For more information,
     * see <a href="https://docs.aws.amazon.com/lambda/latest/dg/functions-states.html">Function States</a>.
     * </p>
     * <p>
     * These settings can vary between versions of a function and are locked when you publish a version. You can't
     * modify the configuration of a published version, only the unpublished version.
     * </p>
     * <p>
     * To configure function concurrency, use <a>PutFunctionConcurrency</a>. To grant invoke permissions to an account
     * or AWS service, use <a>AddPermission</a>.
     * </p>
     * 
     * @param updateFunctionConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFunctionConfiguration operation returned by the service.
     * @sample AWSLambdaAsyncHandler.UpdateFunctionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFunctionConfigurationResult> updateFunctionConfigurationAsync(
            UpdateFunctionConfigurationRequest updateFunctionConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFunctionConfigurationRequest, UpdateFunctionConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration for asynchronous invocation for a function, version, or alias.
     * </p>
     * <p>
     * To configure options for asynchronous invocation, use <a>PutFunctionEventInvokeConfig</a>.
     * </p>
     * 
     * @param updateFunctionEventInvokeConfigRequest
     * @return A Java Future containing the result of the UpdateFunctionEventInvokeConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsync.UpdateFunctionEventInvokeConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionEventInvokeConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFunctionEventInvokeConfigResult> updateFunctionEventInvokeConfigAsync(
            UpdateFunctionEventInvokeConfigRequest updateFunctionEventInvokeConfigRequest);

    /**
     * <p>
     * Updates the configuration for asynchronous invocation for a function, version, or alias.
     * </p>
     * <p>
     * To configure options for asynchronous invocation, use <a>PutFunctionEventInvokeConfig</a>.
     * </p>
     * 
     * @param updateFunctionEventInvokeConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFunctionEventInvokeConfig operation returned by the
     *         service.
     * @sample AWSLambdaAsyncHandler.UpdateFunctionEventInvokeConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionEventInvokeConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFunctionEventInvokeConfigResult> updateFunctionEventInvokeConfigAsync(
            UpdateFunctionEventInvokeConfigRequest updateFunctionEventInvokeConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFunctionEventInvokeConfigRequest, UpdateFunctionEventInvokeConfigResult> asyncHandler);

}
