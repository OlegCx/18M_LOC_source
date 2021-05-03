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
package com.amazonaws.services.codepipeline;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.codepipeline.AWSCodePipelineClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.services.codepipeline.model.transform.*;

/**
 * Client for accessing CodePipeline. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <fullname>AWS CodePipeline</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the AWS CodePipeline API Reference. This guide provides descriptions of the actions and data types for AWS
 * CodePipeline. Some functionality for your pipeline can only be configured through the API. For more information, see
 * the <a href="https://docs.aws.amazon.com/codepipeline/latest/userguide/welcome.html">AWS CodePipeline User Guide</a>.
 * </p>
 * <p>
 * You can use the AWS CodePipeline API to work with pipelines, stages, actions, and transitions.
 * </p>
 * <p>
 * <i>Pipelines</i> are models of automated release processes. Each pipeline is uniquely named, and consists of stages,
 * actions, and transitions.
 * </p>
 * <p>
 * You can work with pipelines by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreatePipeline</a>, which creates a uniquely named pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeletePipeline</a>, which deletes the specified pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPipeline</a>, which returns information about the pipeline structure and pipeline metadata, including the
 * pipeline Amazon Resource Name (ARN).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPipelineExecution</a>, which returns information about a specific execution of a pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPipelineState</a>, which returns information about the current state of the stages and actions of a pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListActionExecutions</a>, which returns action-level details for past executions. The details include full stage
 * and action-level details, including individual action duration, status, any errors that occurred during the
 * execution, and input and output artifact location details.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListPipelines</a>, which gets a summary of all of the pipelines associated with your account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListPipelineExecutions</a>, which gets a summary of the most recent executions for a pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StartPipelineExecution</a>, which runs the most recent revision of an artifact through the pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StopPipelineExecution</a>, which stops the specified pipeline execution from continuing through the pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePipeline</a>, which updates a pipeline with edits or changes to the structure of the pipeline.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Pipelines include <i>stages</i>. Each stage contains one or more actions that must complete before the next stage
 * begins. A stage results in success or failure. If a stage fails, the pipeline stops at that stage and remains stopped
 * until either a new version of an artifact appears in the source location, or a user takes action to rerun the most
 * recent artifact through the pipeline. You can call <a>GetPipelineState</a>, which displays the status of a pipeline,
 * including the status of stages in the pipeline, or <a>GetPipeline</a>, which returns the entire structure of the
 * pipeline, including the stages of that pipeline. For more information about the structure of stages and actions, see
 * <a href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-structure.html">AWS CodePipeline Pipeline
 * Structure Reference</a>.
 * </p>
 * <p>
 * Pipeline stages include <i>actions</i> that are categorized into categories such as source or build actions performed
 * in a stage of a pipeline. For example, you can use a source action to import artifacts into a pipeline from a source
 * such as Amazon S3. Like stages, you do not work with actions directly in most cases, but you do define and interact
 * with actions when working with pipeline operations such as <a>CreatePipeline</a> and <a>GetPipelineState</a>. Valid
 * action categories are:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Source
 * </p>
 * </li>
 * <li>
 * <p>
 * Build
 * </p>
 * </li>
 * <li>
 * <p>
 * Test
 * </p>
 * </li>
 * <li>
 * <p>
 * Deploy
 * </p>
 * </li>
 * <li>
 * <p>
 * Approval
 * </p>
 * </li>
 * <li>
 * <p>
 * Invoke
 * </p>
 * </li>
 * </ul>
 * <p>
 * Pipelines also include <i>transitions</i>, which allow the transition of artifacts from one stage to the next in a
 * pipeline after the actions in one stage complete.
 * </p>
 * <p>
 * You can work with transitions by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DisableStageTransition</a>, which prevents artifacts from transitioning to the next stage in a pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>EnableStageTransition</a>, which enables transition of artifacts between stages in a pipeline.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Using the API to integrate with AWS CodePipeline</b>
 * </p>
 * <p>
 * For third-party integrators or developers who want to create their own integrations with AWS CodePipeline, the
 * expected sequence varies from the standard API user. To integrate with AWS CodePipeline, developers need to work with
 * the following items:
 * </p>
 * <p>
 * <b>Jobs</b>, which are instances of an action. For example, a job for a source action might import a revision of an
 * artifact from a source.
 * </p>
 * <p>
 * You can work with jobs by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>AcknowledgeJob</a>, which confirms whether a job worker has received the specified job.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetJobDetails</a>, which returns the details of a job.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PollForJobs</a>, which determines whether there are any jobs to act on.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutJobFailureResult</a>, which provides details of a job failure.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutJobSuccessResult</a>, which provides details of a job success.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Third party jobs</b>, which are instances of an action created by a partner action and integrated into AWS
 * CodePipeline. Partner actions are created by members of the AWS Partner Network.
 * </p>
 * <p>
 * You can work with third party jobs by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>AcknowledgeThirdPartyJob</a>, which confirms whether a job worker has received the specified job.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetThirdPartyJobDetails</a>, which requests the details of a job for a partner action.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PollForThirdPartyJobs</a>, which determines whether there are any jobs to act on.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutThirdPartyJobFailureResult</a>, which provides details of a job failure.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutThirdPartyJobSuccessResult</a>, which provides details of a job success.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCodePipelineClient extends AmazonWebServiceClient implements AWSCodePipeline {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCodePipeline.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "codepipeline";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.ConcurrentModificationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidWebhookAuthenticationParametersException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.InvalidWebhookAuthenticationParametersExceptionUnmarshaller
                                            .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidActionDeclarationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.InvalidActionDeclarationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArnException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.InvalidArnExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PipelineExecutionNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.PipelineExecutionNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PipelineNameInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.PipelineNameInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.InvalidNextTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidJobException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.InvalidJobExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ActionTypeNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.ActionTypeNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StageNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.StageNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicatedStopRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.DuplicatedStopRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.InvalidTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ActionNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.ActionNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidStageDeclarationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.InvalidStageDeclarationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotLatestPipelineExecutionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.NotLatestPipelineExecutionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestFailedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.RequestFailedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidClientTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.InvalidClientTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidJobStateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.InvalidJobStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PipelineVersionNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.PipelineVersionNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidWebhookFilterPatternException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.InvalidWebhookFilterPatternExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OutputVariablesSizeExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.OutputVariablesSizeExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WebhookNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.WebhookNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidApprovalTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.InvalidApprovalTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ApprovalAlreadyCompletedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.ApprovalAlreadyCompletedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PipelineNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.PipelineNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StageNotRetryableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.StageNotRetryableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidStructureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.InvalidStructureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidBlockerDeclarationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.InvalidBlockerDeclarationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNonceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.InvalidNonceExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("JobNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.JobNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PipelineExecutionNotStoppableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codepipeline.model.transform.PipelineExecutionNotStoppableExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.codepipeline.model.AWSCodePipelineException.class));

    /**
     * Constructs a new client to invoke service methods on CodePipeline. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSCodePipelineClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSCodePipelineClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CodePipeline (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSCodePipelineClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCodePipelineClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSCodePipelineClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSCodePipelineClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSCodePipelineClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CodePipeline (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSCodePipelineClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodePipelineClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCodePipelineClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSCodePipelineClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSCodePipelineClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CodePipeline (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSCodePipelineClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodePipelineClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCodePipelineClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CodePipeline (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSCodePipelineClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodePipelineClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSCodePipelineClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSCodePipelineClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSCodePipelineClientBuilder builder() {
        return AWSCodePipelineClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCodePipelineClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on CodePipeline using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCodePipelineClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://codepipeline.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/codepipeline/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/codepipeline/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Returns information about a specified job and whether that job has been received by the job worker. Used for
     * custom actions only.
     * </p>
     * 
     * @param acknowledgeJobRequest
     *        Represents the input of an AcknowledgeJob action.
     * @return Result of the AcknowledgeJob operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidNonceException
     *         The nonce was specified in an invalid format.
     * @throws JobNotFoundException
     *         The job was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.AcknowledgeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/AcknowledgeJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AcknowledgeJobResult acknowledgeJob(AcknowledgeJobRequest request) {
        request = beforeClientExecution(request);
        return executeAcknowledgeJob(request);
    }

    @SdkInternalApi
    final AcknowledgeJobResult executeAcknowledgeJob(AcknowledgeJobRequest acknowledgeJobRequest) {

        ExecutionContext executionContext = createExecutionContext(acknowledgeJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcknowledgeJobRequest> request = null;
        Response<AcknowledgeJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcknowledgeJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(acknowledgeJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcknowledgeJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcknowledgeJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AcknowledgeJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Confirms a job worker has received the specified job. Used for partner actions only.
     * </p>
     * 
     * @param acknowledgeThirdPartyJobRequest
     *        Represents the input of an AcknowledgeThirdPartyJob action.
     * @return Result of the AcknowledgeThirdPartyJob operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidNonceException
     *         The nonce was specified in an invalid format.
     * @throws JobNotFoundException
     *         The job was specified in an invalid format or cannot be found.
     * @throws InvalidClientTokenException
     *         The client token was specified in an invalid format
     * @sample AWSCodePipeline.AcknowledgeThirdPartyJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/AcknowledgeThirdPartyJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AcknowledgeThirdPartyJobResult acknowledgeThirdPartyJob(AcknowledgeThirdPartyJobRequest request) {
        request = beforeClientExecution(request);
        return executeAcknowledgeThirdPartyJob(request);
    }

    @SdkInternalApi
    final AcknowledgeThirdPartyJobResult executeAcknowledgeThirdPartyJob(AcknowledgeThirdPartyJobRequest acknowledgeThirdPartyJobRequest) {

        ExecutionContext executionContext = createExecutionContext(acknowledgeThirdPartyJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcknowledgeThirdPartyJobRequest> request = null;
        Response<AcknowledgeThirdPartyJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcknowledgeThirdPartyJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(acknowledgeThirdPartyJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcknowledgeThirdPartyJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcknowledgeThirdPartyJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AcknowledgeThirdPartyJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new custom action that can be used in all pipelines associated with the AWS account. Only used for
     * custom actions.
     * </p>
     * 
     * @param createCustomActionTypeRequest
     *        Represents the input of a CreateCustomActionType operation.
     * @return Result of the CreateCustomActionType operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws LimitExceededException
     *         The number of pipelines associated with the AWS account has exceeded the limit allowed for the account.
     * @throws TooManyTagsException
     *         The tags limit for a resource has been exceeded.
     * @throws InvalidTagsException
     *         The specified resource tags are invalid.
     * @throws ConcurrentModificationException
     *         Unable to modify the tag due to a simultaneous update request.
     * @sample AWSCodePipeline.CreateCustomActionType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/CreateCustomActionType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCustomActionTypeResult createCustomActionType(CreateCustomActionTypeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCustomActionType(request);
    }

    @SdkInternalApi
    final CreateCustomActionTypeResult executeCreateCustomActionType(CreateCustomActionTypeRequest createCustomActionTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(createCustomActionTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCustomActionTypeRequest> request = null;
        Response<CreateCustomActionTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCustomActionTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCustomActionTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCustomActionType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCustomActionTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateCustomActionTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a pipeline.
     * </p>
     * <note>
     * <p>
     * In the pipeline structure, you must include either <code>artifactStore</code> or <code>artifactStores</code> in
     * your pipeline, but you cannot use both. If you create a cross-region action in your pipeline, you must use
     * <code>artifactStores</code>.
     * </p>
     * </note>
     * 
     * @param createPipelineRequest
     *        Represents the input of a <code>CreatePipeline</code> action.
     * @return Result of the CreatePipeline operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNameInUseException
     *         The specified pipeline name is already in use.
     * @throws InvalidStageDeclarationException
     *         The stage declaration was specified in an invalid format.
     * @throws InvalidActionDeclarationException
     *         The action declaration was specified in an invalid format.
     * @throws InvalidBlockerDeclarationException
     *         Reserved for future use.
     * @throws InvalidStructureException
     *         The structure was specified in an invalid format.
     * @throws LimitExceededException
     *         The number of pipelines associated with the AWS account has exceeded the limit allowed for the account.
     * @throws TooManyTagsException
     *         The tags limit for a resource has been exceeded.
     * @throws InvalidTagsException
     *         The specified resource tags are invalid.
     * @throws ConcurrentModificationException
     *         Unable to modify the tag due to a simultaneous update request.
     * @sample AWSCodePipeline.CreatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/CreatePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreatePipelineResult createPipeline(CreatePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePipeline(request);
    }

    @SdkInternalApi
    final CreatePipelineResult executeCreatePipeline(CreatePipelineRequest createPipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(createPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePipelineRequest> request = null;
        Response<CreatePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Marks a custom action as deleted. <code>PollForJobs</code> for the custom action fails after the action is marked
     * for deletion. Used for custom actions only.
     * </p>
     * <important>
     * <p>
     * To re-create a custom action after it has been deleted you must use a string in the version field that has never
     * been used before. This string can be an incremented version number, for example. To restore a deleted custom
     * action, use a JSON file that is identical to the deleted action, including the original string in the version
     * field.
     * </p>
     * </important>
     * 
     * @param deleteCustomActionTypeRequest
     *        Represents the input of a <code>DeleteCustomActionType</code> operation. The custom action will be marked
     *        as deleted.
     * @return Result of the DeleteCustomActionType operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws ConcurrentModificationException
     *         Unable to modify the tag due to a simultaneous update request.
     * @sample AWSCodePipeline.DeleteCustomActionType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/DeleteCustomActionType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCustomActionTypeResult deleteCustomActionType(DeleteCustomActionTypeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCustomActionType(request);
    }

    @SdkInternalApi
    final DeleteCustomActionTypeResult executeDeleteCustomActionType(DeleteCustomActionTypeRequest deleteCustomActionTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCustomActionTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCustomActionTypeRequest> request = null;
        Response<DeleteCustomActionTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCustomActionTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCustomActionTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCustomActionType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCustomActionTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteCustomActionTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified pipeline.
     * </p>
     * 
     * @param deletePipelineRequest
     *        Represents the input of a <code>DeletePipeline</code> action.
     * @return Result of the DeletePipeline operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws ConcurrentModificationException
     *         Unable to modify the tag due to a simultaneous update request.
     * @sample AWSCodePipeline.DeletePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/DeletePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeletePipelineResult deletePipeline(DeletePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePipeline(request);
    }

    @SdkInternalApi
    final DeletePipelineResult executeDeletePipeline(DeletePipelineRequest deletePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePipelineRequest> request = null;
        Response<DeletePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a previously created webhook by name. Deleting the webhook stops AWS CodePipeline from starting a
     * pipeline every time an external event occurs. The API returns successfully when trying to delete a webhook that
     * is already deleted. If a deleted webhook is re-created by calling PutWebhook with the same name, it will have a
     * different URL.
     * </p>
     * 
     * @param deleteWebhookRequest
     * @return Result of the DeleteWebhook operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws ConcurrentModificationException
     *         Unable to modify the tag due to a simultaneous update request.
     * @sample AWSCodePipeline.DeleteWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/DeleteWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteWebhookResult deleteWebhook(DeleteWebhookRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWebhook(request);
    }

    @SdkInternalApi
    final DeleteWebhookResult executeDeleteWebhook(DeleteWebhookRequest deleteWebhookRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWebhookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWebhookRequest> request = null;
        Response<DeleteWebhookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWebhookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWebhookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWebhook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWebhookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWebhookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the connection between the webhook that was created by CodePipeline and the external tool with events to
     * be detected. Currently supported only for webhooks that target an action type of GitHub.
     * </p>
     * 
     * @param deregisterWebhookWithThirdPartyRequest
     * @return Result of the DeregisterWebhookWithThirdParty operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws WebhookNotFoundException
     *         The specified webhook was entered in an invalid format or cannot be found.
     * @sample AWSCodePipeline.DeregisterWebhookWithThirdParty
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/DeregisterWebhookWithThirdParty"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterWebhookWithThirdPartyResult deregisterWebhookWithThirdParty(DeregisterWebhookWithThirdPartyRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterWebhookWithThirdParty(request);
    }

    @SdkInternalApi
    final DeregisterWebhookWithThirdPartyResult executeDeregisterWebhookWithThirdParty(
            DeregisterWebhookWithThirdPartyRequest deregisterWebhookWithThirdPartyRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterWebhookWithThirdPartyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterWebhookWithThirdPartyRequest> request = null;
        Response<DeregisterWebhookWithThirdPartyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterWebhookWithThirdPartyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterWebhookWithThirdPartyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterWebhookWithThirdParty");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterWebhookWithThirdPartyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterWebhookWithThirdPartyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Prevents artifacts in a pipeline from transitioning to the next stage in the pipeline.
     * </p>
     * 
     * @param disableStageTransitionRequest
     *        Represents the input of a <code>DisableStageTransition</code> action.
     * @return Result of the DisableStageTransition operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The pipeline was specified in an invalid format or cannot be found.
     * @throws StageNotFoundException
     *         The stage was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.DisableStageTransition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/DisableStageTransition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisableStageTransitionResult disableStageTransition(DisableStageTransitionRequest request) {
        request = beforeClientExecution(request);
        return executeDisableStageTransition(request);
    }

    @SdkInternalApi
    final DisableStageTransitionResult executeDisableStageTransition(DisableStageTransitionRequest disableStageTransitionRequest) {

        ExecutionContext executionContext = createExecutionContext(disableStageTransitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableStageTransitionRequest> request = null;
        Response<DisableStageTransitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableStageTransitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableStageTransitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableStageTransition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableStageTransitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisableStageTransitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables artifacts in a pipeline to transition to a stage in a pipeline.
     * </p>
     * 
     * @param enableStageTransitionRequest
     *        Represents the input of an <code>EnableStageTransition</code> action.
     * @return Result of the EnableStageTransition operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The pipeline was specified in an invalid format or cannot be found.
     * @throws StageNotFoundException
     *         The stage was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.EnableStageTransition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/EnableStageTransition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EnableStageTransitionResult enableStageTransition(EnableStageTransitionRequest request) {
        request = beforeClientExecution(request);
        return executeEnableStageTransition(request);
    }

    @SdkInternalApi
    final EnableStageTransitionResult executeEnableStageTransition(EnableStageTransitionRequest enableStageTransitionRequest) {

        ExecutionContext executionContext = createExecutionContext(enableStageTransitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableStageTransitionRequest> request = null;
        Response<EnableStageTransitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableStageTransitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableStageTransitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableStageTransition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableStageTransitionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new EnableStageTransitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about an action type created for an external provider, where the action is to be used by
     * customers of the external provider. The action can be created with any supported integration model.
     * </p>
     * 
     * @param getActionTypeRequest
     * @return Result of the GetActionType operation returned by the service.
     * @throws ActionTypeNotFoundException
     *         The specified action type cannot be found.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.GetActionType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GetActionType" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetActionTypeResult getActionType(GetActionTypeRequest request) {
        request = beforeClientExecution(request);
        return executeGetActionType(request);
    }

    @SdkInternalApi
    final GetActionTypeResult executeGetActionType(GetActionTypeRequest getActionTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(getActionTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetActionTypeRequest> request = null;
        Response<GetActionTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetActionTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getActionTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetActionType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetActionTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetActionTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a job. Used for custom actions only.
     * </p>
     * <important>
     * <p>
     * When this API is called, AWS CodePipeline returns temporary credentials for the S3 bucket used to store artifacts
     * for the pipeline, if the action requires access to that S3 bucket for input or output artifacts. This API also
     * returns any secret values defined for the action.
     * </p>
     * </important>
     * 
     * @param getJobDetailsRequest
     *        Represents the input of a <code>GetJobDetails</code> action.
     * @return Result of the GetJobDetails operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The job was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.GetJobDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GetJobDetails" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetJobDetailsResult getJobDetails(GetJobDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetJobDetails(request);
    }

    @SdkInternalApi
    final GetJobDetailsResult executeGetJobDetails(GetJobDetailsRequest getJobDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getJobDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobDetailsRequest> request = null;
        Response<GetJobDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobDetailsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJobDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetJobDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJobDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the metadata, structure, stages, and actions of a pipeline. Can be used to return the entire structure of
     * a pipeline in JSON format, which can then be modified and used to update the pipeline structure with
     * <a>UpdatePipeline</a>.
     * </p>
     * 
     * @param getPipelineRequest
     *        Represents the input of a <code>GetPipeline</code> action.
     * @return Result of the GetPipeline operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The pipeline was specified in an invalid format or cannot be found.
     * @throws PipelineVersionNotFoundException
     *         The pipeline version was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.GetPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GetPipeline" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPipelineResult getPipeline(GetPipelineRequest request) {
        request = beforeClientExecution(request);
        return executeGetPipeline(request);
    }

    @SdkInternalApi
    final GetPipelineResult executeGetPipeline(GetPipelineRequest getPipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(getPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPipelineRequest> request = null;
        Response<GetPipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about an execution of a pipeline, including details about artifacts, the pipeline execution
     * ID, and the name, version, and status of the pipeline.
     * </p>
     * 
     * @param getPipelineExecutionRequest
     *        Represents the input of a <code>GetPipelineExecution</code> action.
     * @return Result of the GetPipelineExecution operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The pipeline was specified in an invalid format or cannot be found.
     * @throws PipelineExecutionNotFoundException
     *         The pipeline execution was specified in an invalid format or cannot be found, or an execution ID does not
     *         belong to the specified pipeline.
     * @sample AWSCodePipeline.GetPipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GetPipelineExecution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPipelineExecutionResult getPipelineExecution(GetPipelineExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeGetPipelineExecution(request);
    }

    @SdkInternalApi
    final GetPipelineExecutionResult executeGetPipelineExecution(GetPipelineExecutionRequest getPipelineExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(getPipelineExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPipelineExecutionRequest> request = null;
        Response<GetPipelineExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPipelineExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPipelineExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPipelineExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPipelineExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPipelineExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the state of a pipeline, including the stages and actions.
     * </p>
     * <note>
     * <p>
     * Values returned in the <code>revisionId</code> and <code>revisionUrl</code> fields indicate the source revision
     * information, such as the commit ID, for the current state.
     * </p>
     * </note>
     * 
     * @param getPipelineStateRequest
     *        Represents the input of a <code>GetPipelineState</code> action.
     * @return Result of the GetPipelineState operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The pipeline was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.GetPipelineState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GetPipelineState" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetPipelineStateResult getPipelineState(GetPipelineStateRequest request) {
        request = beforeClientExecution(request);
        return executeGetPipelineState(request);
    }

    @SdkInternalApi
    final GetPipelineStateResult executeGetPipelineState(GetPipelineStateRequest getPipelineStateRequest) {

        ExecutionContext executionContext = createExecutionContext(getPipelineStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPipelineStateRequest> request = null;
        Response<GetPipelineStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPipelineStateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPipelineStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPipelineState");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPipelineStateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPipelineStateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests the details of a job for a third party action. Used for partner actions only.
     * </p>
     * <important>
     * <p>
     * When this API is called, AWS CodePipeline returns temporary credentials for the S3 bucket used to store artifacts
     * for the pipeline, if the action requires access to that S3 bucket for input or output artifacts. This API also
     * returns any secret values defined for the action.
     * </p>
     * </important>
     * 
     * @param getThirdPartyJobDetailsRequest
     *        Represents the input of a <code>GetThirdPartyJobDetails</code> action.
     * @return Result of the GetThirdPartyJobDetails operation returned by the service.
     * @throws JobNotFoundException
     *         The job was specified in an invalid format or cannot be found.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidClientTokenException
     *         The client token was specified in an invalid format
     * @throws InvalidJobException
     *         The job was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.GetThirdPartyJobDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GetThirdPartyJobDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetThirdPartyJobDetailsResult getThirdPartyJobDetails(GetThirdPartyJobDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetThirdPartyJobDetails(request);
    }

    @SdkInternalApi
    final GetThirdPartyJobDetailsResult executeGetThirdPartyJobDetails(GetThirdPartyJobDetailsRequest getThirdPartyJobDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getThirdPartyJobDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetThirdPartyJobDetailsRequest> request = null;
        Response<GetThirdPartyJobDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetThirdPartyJobDetailsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getThirdPartyJobDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetThirdPartyJobDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetThirdPartyJobDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetThirdPartyJobDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the action executions that have occurred in a pipeline.
     * </p>
     * 
     * @param listActionExecutionsRequest
     * @return Result of the ListActionExecutions operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The pipeline was specified in an invalid format or cannot be found.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format. Make sure that the next token you provide is the token
     *         returned by a previous call.
     * @throws PipelineExecutionNotFoundException
     *         The pipeline execution was specified in an invalid format or cannot be found, or an execution ID does not
     *         belong to the specified pipeline.
     * @sample AWSCodePipeline.ListActionExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListActionExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListActionExecutionsResult listActionExecutions(ListActionExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeListActionExecutions(request);
    }

    @SdkInternalApi
    final ListActionExecutionsResult executeListActionExecutions(ListActionExecutionsRequest listActionExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listActionExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListActionExecutionsRequest> request = null;
        Response<ListActionExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListActionExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listActionExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListActionExecutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListActionExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListActionExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a summary of all AWS CodePipeline action types associated with your account.
     * </p>
     * 
     * @param listActionTypesRequest
     *        Represents the input of a <code>ListActionTypes</code> action.
     * @return Result of the ListActionTypes operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format. Make sure that the next token you provide is the token
     *         returned by a previous call.
     * @sample AWSCodePipeline.ListActionTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListActionTypes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListActionTypesResult listActionTypes(ListActionTypesRequest request) {
        request = beforeClientExecution(request);
        return executeListActionTypes(request);
    }

    @SdkInternalApi
    final ListActionTypesResult executeListActionTypes(ListActionTypesRequest listActionTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(listActionTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListActionTypesRequest> request = null;
        Response<ListActionTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListActionTypesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listActionTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListActionTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListActionTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListActionTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a summary of the most recent executions for a pipeline.
     * </p>
     * 
     * @param listPipelineExecutionsRequest
     *        Represents the input of a <code>ListPipelineExecutions</code> action.
     * @return Result of the ListPipelineExecutions operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The pipeline was specified in an invalid format or cannot be found.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format. Make sure that the next token you provide is the token
     *         returned by a previous call.
     * @sample AWSCodePipeline.ListPipelineExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListPipelineExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPipelineExecutionsResult listPipelineExecutions(ListPipelineExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeListPipelineExecutions(request);
    }

    @SdkInternalApi
    final ListPipelineExecutionsResult executeListPipelineExecutions(ListPipelineExecutionsRequest listPipelineExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPipelineExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPipelineExecutionsRequest> request = null;
        Response<ListPipelineExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPipelineExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPipelineExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPipelineExecutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPipelineExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPipelineExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a summary of all of the pipelines associated with your account.
     * </p>
     * 
     * @param listPipelinesRequest
     *        Represents the input of a <code>ListPipelines</code> action.
     * @return Result of the ListPipelines operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format. Make sure that the next token you provide is the token
     *         returned by a previous call.
     * @sample AWSCodePipeline.ListPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListPipelines" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPipelinesResult listPipelines(ListPipelinesRequest request) {
        request = beforeClientExecution(request);
        return executeListPipelines(request);
    }

    @SdkInternalApi
    final ListPipelinesResult executeListPipelines(ListPipelinesRequest listPipelinesRequest) {

        ExecutionContext executionContext = createExecutionContext(listPipelinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPipelinesRequest> request = null;
        Response<ListPipelinesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPipelinesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPipelinesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPipelines");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPipelinesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPipelinesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the set of key-value pairs (metadata) that are used to manage the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws ResourceNotFoundException
     *         The resource was specified in an invalid format.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format. Make sure that the next token you provide is the token
     *         returned by a previous call.
     * @throws InvalidArnException
     *         The specified resource ARN is invalid.
     * @sample AWSCodePipeline.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a listing of all the webhooks in this AWS Region for this account. The output lists all webhooks and
     * includes the webhook URL and ARN and the configuration for each webhook.
     * </p>
     * 
     * @param listWebhooksRequest
     * @return Result of the ListWebhooks operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format. Make sure that the next token you provide is the token
     *         returned by a previous call.
     * @sample AWSCodePipeline.ListWebhooks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListWebhooks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListWebhooksResult listWebhooks(ListWebhooksRequest request) {
        request = beforeClientExecution(request);
        return executeListWebhooks(request);
    }

    @SdkInternalApi
    final ListWebhooksResult executeListWebhooks(ListWebhooksRequest listWebhooksRequest) {

        ExecutionContext executionContext = createExecutionContext(listWebhooksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWebhooksRequest> request = null;
        Response<ListWebhooksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWebhooksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWebhooksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWebhooks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWebhooksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWebhooksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about any jobs for AWS CodePipeline to act on. <code>PollForJobs</code> is valid only for
     * action types with "Custom" in the owner field. If the action type contains "AWS" or "ThirdParty" in the owner
     * field, the <code>PollForJobs</code> action returns an error.
     * </p>
     * <important>
     * <p>
     * When this API is called, AWS CodePipeline returns temporary credentials for the S3 bucket used to store artifacts
     * for the pipeline, if the action requires access to that S3 bucket for input or output artifacts. This API also
     * returns any secret values defined for the action.
     * </p>
     * </important>
     * 
     * @param pollForJobsRequest
     *        Represents the input of a <code>PollForJobs</code> action.
     * @return Result of the PollForJobs operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws ActionTypeNotFoundException
     *         The specified action type cannot be found.
     * @sample AWSCodePipeline.PollForJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PollForJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PollForJobsResult pollForJobs(PollForJobsRequest request) {
        request = beforeClientExecution(request);
        return executePollForJobs(request);
    }

    @SdkInternalApi
    final PollForJobsResult executePollForJobs(PollForJobsRequest pollForJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(pollForJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PollForJobsRequest> request = null;
        Response<PollForJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PollForJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(pollForJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PollForJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PollForJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PollForJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Determines whether there are any third party jobs for a job worker to act on. Used for partner actions only.
     * </p>
     * <important>
     * <p>
     * When this API is called, AWS CodePipeline returns temporary credentials for the S3 bucket used to store artifacts
     * for the pipeline, if the action requires access to that S3 bucket for input or output artifacts.
     * </p>
     * </important>
     * 
     * @param pollForThirdPartyJobsRequest
     *        Represents the input of a <code>PollForThirdPartyJobs</code> action.
     * @return Result of the PollForThirdPartyJobs operation returned by the service.
     * @throws ActionTypeNotFoundException
     *         The specified action type cannot be found.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.PollForThirdPartyJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PollForThirdPartyJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PollForThirdPartyJobsResult pollForThirdPartyJobs(PollForThirdPartyJobsRequest request) {
        request = beforeClientExecution(request);
        return executePollForThirdPartyJobs(request);
    }

    @SdkInternalApi
    final PollForThirdPartyJobsResult executePollForThirdPartyJobs(PollForThirdPartyJobsRequest pollForThirdPartyJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(pollForThirdPartyJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PollForThirdPartyJobsRequest> request = null;
        Response<PollForThirdPartyJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PollForThirdPartyJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(pollForThirdPartyJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PollForThirdPartyJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PollForThirdPartyJobsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PollForThirdPartyJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information to AWS CodePipeline about new revisions to a source.
     * </p>
     * 
     * @param putActionRevisionRequest
     *        Represents the input of a <code>PutActionRevision</code> action.
     * @return Result of the PutActionRevision operation returned by the service.
     * @throws PipelineNotFoundException
     *         The pipeline was specified in an invalid format or cannot be found.
     * @throws StageNotFoundException
     *         The stage was specified in an invalid format or cannot be found.
     * @throws ActionNotFoundException
     *         The specified action cannot be found.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.PutActionRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutActionRevision" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutActionRevisionResult putActionRevision(PutActionRevisionRequest request) {
        request = beforeClientExecution(request);
        return executePutActionRevision(request);
    }

    @SdkInternalApi
    final PutActionRevisionResult executePutActionRevision(PutActionRevisionRequest putActionRevisionRequest) {

        ExecutionContext executionContext = createExecutionContext(putActionRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutActionRevisionRequest> request = null;
        Response<PutActionRevisionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutActionRevisionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putActionRevisionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutActionRevision");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutActionRevisionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutActionRevisionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides the response to a manual approval request to AWS CodePipeline. Valid responses include Approved and
     * Rejected.
     * </p>
     * 
     * @param putApprovalResultRequest
     *        Represents the input of a <code>PutApprovalResult</code> action.
     * @return Result of the PutApprovalResult operation returned by the service.
     * @throws InvalidApprovalTokenException
     *         The approval request already received a response or has expired.
     * @throws ApprovalAlreadyCompletedException
     *         The approval action has already been approved or rejected.
     * @throws PipelineNotFoundException
     *         The pipeline was specified in an invalid format or cannot be found.
     * @throws StageNotFoundException
     *         The stage was specified in an invalid format or cannot be found.
     * @throws ActionNotFoundException
     *         The specified action cannot be found.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.PutApprovalResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutApprovalResult" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutApprovalResultResult putApprovalResult(PutApprovalResultRequest request) {
        request = beforeClientExecution(request);
        return executePutApprovalResult(request);
    }

    @SdkInternalApi
    final PutApprovalResultResult executePutApprovalResult(PutApprovalResultRequest putApprovalResultRequest) {

        ExecutionContext executionContext = createExecutionContext(putApprovalResultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutApprovalResultRequest> request = null;
        Response<PutApprovalResultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutApprovalResultRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putApprovalResultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutApprovalResult");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutApprovalResultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutApprovalResultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents the failure of a job as returned to the pipeline by a job worker. Used for custom actions only.
     * </p>
     * 
     * @param putJobFailureResultRequest
     *        Represents the input of a <code>PutJobFailureResult</code> action.
     * @return Result of the PutJobFailureResult operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The job was specified in an invalid format or cannot be found.
     * @throws InvalidJobStateException
     *         The job state was specified in an invalid format.
     * @sample AWSCodePipeline.PutJobFailureResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutJobFailureResult"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutJobFailureResultResult putJobFailureResult(PutJobFailureResultRequest request) {
        request = beforeClientExecution(request);
        return executePutJobFailureResult(request);
    }

    @SdkInternalApi
    final PutJobFailureResultResult executePutJobFailureResult(PutJobFailureResultRequest putJobFailureResultRequest) {

        ExecutionContext executionContext = createExecutionContext(putJobFailureResultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutJobFailureResultRequest> request = null;
        Response<PutJobFailureResultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutJobFailureResultRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putJobFailureResultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutJobFailureResult");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutJobFailureResultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutJobFailureResultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents the success of a job as returned to the pipeline by a job worker. Used for custom actions only.
     * </p>
     * 
     * @param putJobSuccessResultRequest
     *        Represents the input of a <code>PutJobSuccessResult</code> action.
     * @return Result of the PutJobSuccessResult operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The job was specified in an invalid format or cannot be found.
     * @throws InvalidJobStateException
     *         The job state was specified in an invalid format.
     * @throws OutputVariablesSizeExceededException
     *         Exceeded the total size limit for all variables in the pipeline.
     * @sample AWSCodePipeline.PutJobSuccessResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutJobSuccessResult"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutJobSuccessResultResult putJobSuccessResult(PutJobSuccessResultRequest request) {
        request = beforeClientExecution(request);
        return executePutJobSuccessResult(request);
    }

    @SdkInternalApi
    final PutJobSuccessResultResult executePutJobSuccessResult(PutJobSuccessResultRequest putJobSuccessResultRequest) {

        ExecutionContext executionContext = createExecutionContext(putJobSuccessResultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutJobSuccessResultRequest> request = null;
        Response<PutJobSuccessResultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutJobSuccessResultRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putJobSuccessResultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutJobSuccessResult");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutJobSuccessResultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutJobSuccessResultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents the failure of a third party job as returned to the pipeline by a job worker. Used for partner actions
     * only.
     * </p>
     * 
     * @param putThirdPartyJobFailureResultRequest
     *        Represents the input of a <code>PutThirdPartyJobFailureResult</code> action.
     * @return Result of the PutThirdPartyJobFailureResult operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The job was specified in an invalid format or cannot be found.
     * @throws InvalidJobStateException
     *         The job state was specified in an invalid format.
     * @throws InvalidClientTokenException
     *         The client token was specified in an invalid format
     * @sample AWSCodePipeline.PutThirdPartyJobFailureResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutThirdPartyJobFailureResult"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutThirdPartyJobFailureResultResult putThirdPartyJobFailureResult(PutThirdPartyJobFailureResultRequest request) {
        request = beforeClientExecution(request);
        return executePutThirdPartyJobFailureResult(request);
    }

    @SdkInternalApi
    final PutThirdPartyJobFailureResultResult executePutThirdPartyJobFailureResult(PutThirdPartyJobFailureResultRequest putThirdPartyJobFailureResultRequest) {

        ExecutionContext executionContext = createExecutionContext(putThirdPartyJobFailureResultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutThirdPartyJobFailureResultRequest> request = null;
        Response<PutThirdPartyJobFailureResultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutThirdPartyJobFailureResultRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putThirdPartyJobFailureResultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutThirdPartyJobFailureResult");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutThirdPartyJobFailureResultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutThirdPartyJobFailureResultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents the success of a third party job as returned to the pipeline by a job worker. Used for partner actions
     * only.
     * </p>
     * 
     * @param putThirdPartyJobSuccessResultRequest
     *        Represents the input of a <code>PutThirdPartyJobSuccessResult</code> action.
     * @return Result of the PutThirdPartyJobSuccessResult operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The job was specified in an invalid format or cannot be found.
     * @throws InvalidJobStateException
     *         The job state was specified in an invalid format.
     * @throws InvalidClientTokenException
     *         The client token was specified in an invalid format
     * @sample AWSCodePipeline.PutThirdPartyJobSuccessResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutThirdPartyJobSuccessResult"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutThirdPartyJobSuccessResultResult putThirdPartyJobSuccessResult(PutThirdPartyJobSuccessResultRequest request) {
        request = beforeClientExecution(request);
        return executePutThirdPartyJobSuccessResult(request);
    }

    @SdkInternalApi
    final PutThirdPartyJobSuccessResultResult executePutThirdPartyJobSuccessResult(PutThirdPartyJobSuccessResultRequest putThirdPartyJobSuccessResultRequest) {

        ExecutionContext executionContext = createExecutionContext(putThirdPartyJobSuccessResultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutThirdPartyJobSuccessResultRequest> request = null;
        Response<PutThirdPartyJobSuccessResultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutThirdPartyJobSuccessResultRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putThirdPartyJobSuccessResultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutThirdPartyJobSuccessResult");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutThirdPartyJobSuccessResultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutThirdPartyJobSuccessResultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Defines a webhook and returns a unique webhook URL generated by CodePipeline. This URL can be supplied to third
     * party source hosting providers to call every time there's a code change. When CodePipeline receives a POST
     * request on this URL, the pipeline defined in the webhook is started as long as the POST request satisfied the
     * authentication and filtering requirements supplied when defining the webhook. RegisterWebhookWithThirdParty and
     * DeregisterWebhookWithThirdParty APIs can be used to automatically configure supported third parties to call the
     * generated webhook URL.
     * </p>
     * 
     * @param putWebhookRequest
     * @return Result of the PutWebhook operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws LimitExceededException
     *         The number of pipelines associated with the AWS account has exceeded the limit allowed for the account.
     * @throws InvalidWebhookFilterPatternException
     *         The specified event filter rule is in an invalid format.
     * @throws InvalidWebhookAuthenticationParametersException
     *         The specified authentication type is in an invalid format.
     * @throws PipelineNotFoundException
     *         The pipeline was specified in an invalid format or cannot be found.
     * @throws TooManyTagsException
     *         The tags limit for a resource has been exceeded.
     * @throws InvalidTagsException
     *         The specified resource tags are invalid.
     * @throws ConcurrentModificationException
     *         Unable to modify the tag due to a simultaneous update request.
     * @sample AWSCodePipeline.PutWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutWebhookResult putWebhook(PutWebhookRequest request) {
        request = beforeClientExecution(request);
        return executePutWebhook(request);
    }

    @SdkInternalApi
    final PutWebhookResult executePutWebhook(PutWebhookRequest putWebhookRequest) {

        ExecutionContext executionContext = createExecutionContext(putWebhookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutWebhookRequest> request = null;
        Response<PutWebhookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutWebhookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putWebhookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutWebhook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutWebhookResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutWebhookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configures a connection between the webhook that was created and the external tool with events to be detected.
     * </p>
     * 
     * @param registerWebhookWithThirdPartyRequest
     * @return Result of the RegisterWebhookWithThirdParty operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws WebhookNotFoundException
     *         The specified webhook was entered in an invalid format or cannot be found.
     * @sample AWSCodePipeline.RegisterWebhookWithThirdParty
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/RegisterWebhookWithThirdParty"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterWebhookWithThirdPartyResult registerWebhookWithThirdParty(RegisterWebhookWithThirdPartyRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterWebhookWithThirdParty(request);
    }

    @SdkInternalApi
    final RegisterWebhookWithThirdPartyResult executeRegisterWebhookWithThirdParty(RegisterWebhookWithThirdPartyRequest registerWebhookWithThirdPartyRequest) {

        ExecutionContext executionContext = createExecutionContext(registerWebhookWithThirdPartyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterWebhookWithThirdPartyRequest> request = null;
        Response<RegisterWebhookWithThirdPartyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterWebhookWithThirdPartyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(registerWebhookWithThirdPartyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterWebhookWithThirdParty");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterWebhookWithThirdPartyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterWebhookWithThirdPartyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resumes the pipeline execution by retrying the last failed actions in a stage. You can retry a stage immediately
     * if any of the actions in the stage fail. When you retry, all actions that are still in progress continue working,
     * and failed actions are triggered again.
     * </p>
     * 
     * @param retryStageExecutionRequest
     *        Represents the input of a <code>RetryStageExecution</code> action.
     * @return Result of the RetryStageExecution operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws ConflictException
     *         Your request cannot be handled because the pipeline is busy handling ongoing activities. Try again later.
     * @throws PipelineNotFoundException
     *         The pipeline was specified in an invalid format or cannot be found.
     * @throws StageNotFoundException
     *         The stage was specified in an invalid format or cannot be found.
     * @throws StageNotRetryableException
     *         Unable to retry. The pipeline structure or stage state might have changed while actions awaited retry, or
     *         the stage contains no failed actions.
     * @throws NotLatestPipelineExecutionException
     *         The stage has failed in a later run of the pipeline and the pipelineExecutionId associated with the
     *         request is out of date.
     * @sample AWSCodePipeline.RetryStageExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/RetryStageExecution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RetryStageExecutionResult retryStageExecution(RetryStageExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeRetryStageExecution(request);
    }

    @SdkInternalApi
    final RetryStageExecutionResult executeRetryStageExecution(RetryStageExecutionRequest retryStageExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(retryStageExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetryStageExecutionRequest> request = null;
        Response<RetryStageExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetryStageExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(retryStageExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RetryStageExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RetryStageExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RetryStageExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the specified pipeline. Specifically, it begins processing the latest commit to the source location
     * specified as part of the pipeline.
     * </p>
     * 
     * @param startPipelineExecutionRequest
     *        Represents the input of a <code>StartPipelineExecution</code> action.
     * @return Result of the StartPipelineExecution operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws ConflictException
     *         Your request cannot be handled because the pipeline is busy handling ongoing activities. Try again later.
     * @throws PipelineNotFoundException
     *         The pipeline was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.StartPipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/StartPipelineExecution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartPipelineExecutionResult startPipelineExecution(StartPipelineExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeStartPipelineExecution(request);
    }

    @SdkInternalApi
    final StartPipelineExecutionResult executeStartPipelineExecution(StartPipelineExecutionRequest startPipelineExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(startPipelineExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartPipelineExecutionRequest> request = null;
        Response<StartPipelineExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartPipelineExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startPipelineExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartPipelineExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartPipelineExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartPipelineExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops the specified pipeline execution. You choose to either stop the pipeline execution by completing
     * in-progress actions without starting subsequent actions, or by abandoning in-progress actions. While completing
     * or abandoning in-progress actions, the pipeline execution is in a <code>Stopping</code> state. After all
     * in-progress actions are completed or abandoned, the pipeline execution is in a <code>Stopped</code> state.
     * </p>
     * 
     * @param stopPipelineExecutionRequest
     * @return Result of the StopPipelineExecution operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws ConflictException
     *         Your request cannot be handled because the pipeline is busy handling ongoing activities. Try again later.
     * @throws PipelineNotFoundException
     *         The pipeline was specified in an invalid format or cannot be found.
     * @throws PipelineExecutionNotStoppableException
     *         Unable to stop the pipeline execution. The execution might already be in a <code>Stopped</code> state, or
     *         it might no longer be in progress.
     * @throws DuplicatedStopRequestException
     *         The pipeline execution is already in a <code>Stopping</code> state. If you already chose to stop and
     *         wait, you cannot make that request again. You can choose to stop and abandon now, but be aware that this
     *         option can lead to failed tasks or out of sequence tasks. If you already chose to stop and abandon, you
     *         cannot make that request again.
     * @sample AWSCodePipeline.StopPipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/StopPipelineExecution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopPipelineExecutionResult stopPipelineExecution(StopPipelineExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeStopPipelineExecution(request);
    }

    @SdkInternalApi
    final StopPipelineExecutionResult executeStopPipelineExecution(StopPipelineExecutionRequest stopPipelineExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(stopPipelineExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopPipelineExecutionRequest> request = null;
        Response<StopPipelineExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopPipelineExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopPipelineExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopPipelineExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopPipelineExecutionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StopPipelineExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws ResourceNotFoundException
     *         The resource was specified in an invalid format.
     * @throws InvalidArnException
     *         The specified resource ARN is invalid.
     * @throws TooManyTagsException
     *         The tags limit for a resource has been exceeded.
     * @throws InvalidTagsException
     *         The specified resource tags are invalid.
     * @throws ConcurrentModificationException
     *         Unable to modify the tag due to a simultaneous update request.
     * @sample AWSCodePipeline.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes tags from an AWS resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws ResourceNotFoundException
     *         The resource was specified in an invalid format.
     * @throws InvalidArnException
     *         The specified resource ARN is invalid.
     * @throws InvalidTagsException
     *         The specified resource tags are invalid.
     * @throws ConcurrentModificationException
     *         Unable to modify the tag due to a simultaneous update request.
     * @sample AWSCodePipeline.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an action type that was created with any supported integration model, where the action type is to be used
     * by customers of the action type provider. Use a JSON file with the action definition and
     * <code>UpdateActionType</code> to provide the full structure.
     * </p>
     * 
     * @param updateActionTypeRequest
     * @return Result of the UpdateActionType operation returned by the service.
     * @throws RequestFailedException
     *         The request failed because of an unknown error, exception, or failure.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws ActionTypeNotFoundException
     *         The specified action type cannot be found.
     * @sample AWSCodePipeline.UpdateActionType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/UpdateActionType" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateActionTypeResult updateActionType(UpdateActionTypeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateActionType(request);
    }

    @SdkInternalApi
    final UpdateActionTypeResult executeUpdateActionType(UpdateActionTypeRequest updateActionTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateActionTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateActionTypeRequest> request = null;
        Response<UpdateActionTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateActionTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateActionTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateActionType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateActionTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateActionTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a specified pipeline with edits or changes to its structure. Use a JSON file with the pipeline structure
     * and <code>UpdatePipeline</code> to provide the full structure of the pipeline. Updating the pipeline increases
     * the version number of the pipeline by 1.
     * </p>
     * 
     * @param updatePipelineRequest
     *        Represents the input of an <code>UpdatePipeline</code> action.
     * @return Result of the UpdatePipeline operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidStageDeclarationException
     *         The stage declaration was specified in an invalid format.
     * @throws InvalidActionDeclarationException
     *         The action declaration was specified in an invalid format.
     * @throws InvalidBlockerDeclarationException
     *         Reserved for future use.
     * @throws InvalidStructureException
     *         The structure was specified in an invalid format.
     * @throws LimitExceededException
     *         The number of pipelines associated with the AWS account has exceeded the limit allowed for the account.
     * @sample AWSCodePipeline.UpdatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/UpdatePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdatePipelineResult updatePipeline(UpdatePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePipeline(request);
    }

    @SdkInternalApi
    final UpdatePipelineResult executeUpdatePipeline(UpdatePipelineRequest updatePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePipelineRequest> request = null;
        Response<UpdatePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodePipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
