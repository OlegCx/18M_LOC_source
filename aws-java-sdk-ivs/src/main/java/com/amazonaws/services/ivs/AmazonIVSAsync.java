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
package com.amazonaws.services.ivs;

import javax.annotation.Generated;

import com.amazonaws.services.ivs.model.*;

/**
 * Interface for accessing Amazon IVS asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ivs.AbstractAmazonIVSAsync} instead.
 * </p>
 * <p>
 * <p>
 * <b>Introduction</b>
 * </p>
 * <p>
 * The Amazon Interactive Video Service (IVS) API is REST compatible, using a standard HTTP API and an AWS EventBridge
 * event stream for responses. JSON is used for both requests and responses, including errors.
 * </p>
 * <p>
 * The API is an AWS regional service, currently in these regions: us-west-2, us-east-1, and eu-west-1.
 * </p>
 * <p>
 * <i> <b>All API request parameters and URLs are case sensitive. </b> </i>
 * </p>
 * <p>
 * For a summary of notable documentation changes in each release, see <a
 * href="https://docs.aws.amazon.com/ivs/latest/userguide/doc-history.html"> Document History</a>.
 * </p>
 * <p>
 * <b>Service Endpoints</b>
 * </p>
 * <p>
 * The following are the Amazon IVS service endpoints (all HTTPS):
 * </p>
 * <p>
 * Region name: US West (Oregon)
 * </p>
 * <ul>
 * <li>
 * <p>
 * Region: <code>us-west-2</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Endpoint: <code>ivs.us-west-2.amazonaws.com</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * Region name: US East (Virginia)
 * </p>
 * <ul>
 * <li>
 * <p>
 * Region: <code>us-east-1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Endpoint: <code>ivs.us-east-1.amazonaws.com</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * Region name: EU West (Dublin)
 * </p>
 * <ul>
 * <li>
 * <p>
 * Region: <code>eu-west-1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Endpoint: <code>ivs.eu-west-1.amazonaws.com</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Allowed Header Values</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code> <b>Accept:</b> </code> application/json
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <b>Accept-Encoding:</b> </code> gzip, deflate
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <b>Content-Type:</b> </code>application/json
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Resources</b>
 * </p>
 * <p>
 * The following resources contain information about your IVS live stream (see <a
 * href="https://docs.aws.amazon.com/ivs/latest/userguide/getting-started.html"> Getting Started with Amazon IVS</a>):
 * </p>
 * <ul>
 * <li>
 * <p>
 * Channel — Stores configuration data related to your live stream. You first create a channel and then use the
 * channel’s stream key to start your live stream. See the Channel endpoints for more information.
 * </p>
 * </li>
 * <li>
 * <p>
 * Stream key — An identifier assigned by Amazon IVS when you create a channel, which is then used to authorize
 * streaming. See the StreamKey endpoints for more information. <i> <b>Treat the stream key like a secret, since it
 * allows anyone to stream to the channel.</b> </i>
 * </p>
 * </li>
 * <li>
 * <p>
 * Playback key pair — Video playback may be restricted using playback-authorization tokens, which use public-key
 * encryption. A playback key pair is the public-private pair of keys used to sign and validate the
 * playback-authorization token. See the PlaybackKeyPair endpoints for more information.
 * </p>
 * </li>
 * <li>
 * <p>
 * Recording configuration — Stores configuration related to recording a live stream and where to store the recorded
 * content. Multiple channels can reference the same recording configuration. See the Recording Configuration endpoints
 * for more information.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Tagging</b>
 * </p>
 * <p>
 * A <i>tag</i> is a metadata label that you assign to an AWS resource. A tag comprises a <i>key</i> and a <i>value</i>,
 * both set by you. For example, you might set a tag as <code>topic:nature</code> to label a particular video category.
 * See <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for more
 * information, including restrictions that apply to tags.
 * </p>
 * <p>
 * Tags can help you identify and organize your AWS resources. For example, you can use the same tag for different
 * resources to indicate that they are related. You can also use tags to manage access (see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html"> Access Tags</a>).
 * </p>
 * <p>
 * The Amazon IVS API has these tag-related endpoints: <a>TagResource</a>, <a>UntagResource</a>, and
 * <a>ListTagsForResource</a>. The following resources support tagging: Channels, Stream Keys, Playback Key Pairs, and
 * Recording Configurations.
 * </p>
 * <p>
 * <b>Authentication versus Authorization</b>
 * </p>
 * <p>
 * Note the differences between these concepts:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>Authentication</i> is about verifying identity. You need to be authenticated to sign Amazon IVS API requests.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Authorization</i> is about granting permissions. You need to be authorized to view <a
 * href="https://docs.aws.amazon.com/ivs/latest/userguide/private-channels.html">Amazon IVS private channels</a>.
 * (Private channels are channels that are enabled for "playback authorization.")
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Authentication</b>
 * </p>
 * <p>
 * All Amazon IVS API requests must be authenticated with a signature. The AWS Command-Line Interface (CLI) and Amazon
 * IVS Player SDKs take care of signing the underlying API calls for you. However, if your application calls the Amazon
 * IVS API directly, it’s your responsibility to sign the requests.
 * </p>
 * <p>
 * You generate a signature using valid AWS credentials that have permission to perform the requested action. For
 * example, you must sign PutMetadata requests with a signature generated from an IAM user account that has the
 * <code>ivs:PutMetadata</code> permission.
 * </p>
 * <p>
 * For more information:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Authentication and generating signatures — See <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html">Authenticating Requests
 * (AWS Signature Version 4)</a> in the <i>AWS General Reference</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Managing Amazon IVS permissions — See <a
 * href="https://docs.aws.amazon.com/ivs/latest/userguide/security-iam.html">Identity and Access Management</a> on the
 * Security page of the <i>Amazon IVS User Guide</i>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Channel Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateChannel</a> — Creates a new channel and an associated stream key to start streaming.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetChannel</a> — Gets the channel configuration for the specified channel ARN (Amazon Resource Name).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>BatchGetChannel</a> — Performs <a>GetChannel</a> on multiple ARNs simultaneously.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListChannels</a> — Gets summary information about all channels in your account, in the AWS region where the API
 * request is processed. This list can be filtered to match a specified name or recording-configuration ARN. Filters are
 * mutually exclusive and cannot be used together. If you try to use both filters, you will get an error (409 Conflict
 * Exception).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateChannel</a> — Updates a channel's configuration. This does not affect an ongoing stream of this channel. You
 * must stop and restart the stream for the changes to take effect.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteChannel</a> — Deletes the specified channel.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>StreamKey Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateStreamKey</a> — Creates a stream key, used to initiate a stream, for the specified channel ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetStreamKey</a> — Gets stream key information for the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>BatchGetStreamKey</a> — Performs <a>GetStreamKey</a> on multiple ARNs simultaneously.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListStreamKeys</a> — Gets summary information about stream keys for the specified channel.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteStreamKey</a> — Deletes the stream key for the specified ARN, so it can no longer be used to stream.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Stream Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetStream</a> — Gets information about the active (live) stream on a specified channel.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListStreams</a> — Gets summary information about live streams in your account, in the AWS region where the API
 * request is processed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StopStream</a> — Disconnects the incoming RTMPS stream for the specified channel. Can be used in conjunction with
 * <a>DeleteStreamKey</a> to prevent further streaming to a channel.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutMetadata</a> — Inserts metadata into the active stream of the specified channel. A maximum of 5 requests per
 * second per channel is allowed, each with a maximum 1 KB payload. (If 5 TPS is not sufficient for your needs, we
 * recommend batching your data into a single PutMetadata call.)
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>PlaybackKeyPair Endpoints</b>
 * </p>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/ivs/latest/userguide/private-channels.html">Setting Up
 * Private Channels</a> in the <i>Amazon IVS User Guide</i>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ImportPlaybackKeyPair</a> — Imports the public portion of a new key pair and returns its <code>arn</code> and
 * <code>fingerprint</code>. The <code>privateKey</code> can then be used to generate viewer authorization tokens, to
 * grant viewers access to private channels (channels enabled for playback authorization).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPlaybackKeyPair</a> — Gets a specified playback authorization key pair and returns the <code>arn</code> and
 * <code>fingerprint</code>. The <code>privateKey</code> held by the caller can be used to generate viewer authorization
 * tokens, to grant viewers access to private channels.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListPlaybackKeyPairs</a> — Gets summary information about playback key pairs.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeletePlaybackKeyPair</a> — Deletes a specified authorization key pair. This invalidates future viewer tokens
 * generated using the key pair’s <code>privateKey</code>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>RecordingConfiguration Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateRecordingConfiguration</a> — Creates a new recording configuration, used to enable recording to Amazon S3.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetRecordingConfiguration</a> — Gets the recording-configuration metadata for the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListRecordingConfigurations</a> — Gets summary information about all recording configurations in your account, in
 * the AWS region where the API request is processed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteRecordingConfiguration</a> — Deletes the recording configuration for the specified ARN.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>AWS Tags Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>TagResource</a> — Adds or updates tags for the AWS resource with the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a> — Removes tags from the resource with the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListTagsForResource</a> — Gets information about AWS tags for the specified ARN.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonIVSAsync extends AmazonIVS {

    /**
     * <p>
     * Performs <a>GetChannel</a> on multiple ARNs simultaneously.
     * </p>
     * 
     * @param batchGetChannelRequest
     * @return A Java Future containing the result of the BatchGetChannel operation returned by the service.
     * @sample AmazonIVSAsync.BatchGetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/BatchGetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetChannelResult> batchGetChannelAsync(BatchGetChannelRequest batchGetChannelRequest);

    /**
     * <p>
     * Performs <a>GetChannel</a> on multiple ARNs simultaneously.
     * </p>
     * 
     * @param batchGetChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetChannel operation returned by the service.
     * @sample AmazonIVSAsyncHandler.BatchGetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/BatchGetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetChannelResult> batchGetChannelAsync(BatchGetChannelRequest batchGetChannelRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetChannelRequest, BatchGetChannelResult> asyncHandler);

    /**
     * <p>
     * Performs <a>GetStreamKey</a> on multiple ARNs simultaneously.
     * </p>
     * 
     * @param batchGetStreamKeyRequest
     * @return A Java Future containing the result of the BatchGetStreamKey operation returned by the service.
     * @sample AmazonIVSAsync.BatchGetStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/BatchGetStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetStreamKeyResult> batchGetStreamKeyAsync(BatchGetStreamKeyRequest batchGetStreamKeyRequest);

    /**
     * <p>
     * Performs <a>GetStreamKey</a> on multiple ARNs simultaneously.
     * </p>
     * 
     * @param batchGetStreamKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetStreamKey operation returned by the service.
     * @sample AmazonIVSAsyncHandler.BatchGetStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/BatchGetStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetStreamKeyResult> batchGetStreamKeyAsync(BatchGetStreamKeyRequest batchGetStreamKeyRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetStreamKeyRequest, BatchGetStreamKeyResult> asyncHandler);

    /**
     * <p>
     * Creates a new channel and an associated stream key to start streaming.
     * </p>
     * 
     * @param createChannelRequest
     * @return A Java Future containing the result of the CreateChannel operation returned by the service.
     * @sample AmazonIVSAsync.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest createChannelRequest);

    /**
     * <p>
     * Creates a new channel and an associated stream key to start streaming.
     * </p>
     * 
     * @param createChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChannel operation returned by the service.
     * @sample AmazonIVSAsyncHandler.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest createChannelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChannelRequest, CreateChannelResult> asyncHandler);

    /**
     * <p>
     * Creates a new recording configuration, used to enable recording to Amazon S3.
     * </p>
     * <p>
     * <b>Known issue:</b> In the us-east-1 region, if you use the AWS CLI to create a recording configuration, it
     * returns success even if the S3 bucket is in a different region. In this case, the <code>state</code> of the
     * recording configuration is <code>CREATE_FAILED</code> (instead of <code>ACTIVE</code>). (In other regions, the
     * CLI correctly returns failure if the bucket is in a different region.)
     * </p>
     * <p>
     * <b>Workaround:</b> Ensure that your S3 bucket is in the same region as the recording configuration. If you create
     * a recording configuration in a different region as your S3 bucket, delete that recording configuration and create
     * a new one with an S3 bucket from the correct region.
     * </p>
     * 
     * @param createRecordingConfigurationRequest
     * @return A Java Future containing the result of the CreateRecordingConfiguration operation returned by the
     *         service.
     * @sample AmazonIVSAsync.CreateRecordingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/CreateRecordingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRecordingConfigurationResult> createRecordingConfigurationAsync(
            CreateRecordingConfigurationRequest createRecordingConfigurationRequest);

    /**
     * <p>
     * Creates a new recording configuration, used to enable recording to Amazon S3.
     * </p>
     * <p>
     * <b>Known issue:</b> In the us-east-1 region, if you use the AWS CLI to create a recording configuration, it
     * returns success even if the S3 bucket is in a different region. In this case, the <code>state</code> of the
     * recording configuration is <code>CREATE_FAILED</code> (instead of <code>ACTIVE</code>). (In other regions, the
     * CLI correctly returns failure if the bucket is in a different region.)
     * </p>
     * <p>
     * <b>Workaround:</b> Ensure that your S3 bucket is in the same region as the recording configuration. If you create
     * a recording configuration in a different region as your S3 bucket, delete that recording configuration and create
     * a new one with an S3 bucket from the correct region.
     * </p>
     * 
     * @param createRecordingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRecordingConfiguration operation returned by the
     *         service.
     * @sample AmazonIVSAsyncHandler.CreateRecordingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/CreateRecordingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRecordingConfigurationResult> createRecordingConfigurationAsync(
            CreateRecordingConfigurationRequest createRecordingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRecordingConfigurationRequest, CreateRecordingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a stream key, used to initiate a stream, for the specified channel ARN.
     * </p>
     * <p>
     * Note that <a>CreateChannel</a> creates a stream key. If you subsequently use CreateStreamKey on the same channel,
     * it will fail because a stream key already exists and there is a limit of 1 stream key per channel. To reset the
     * stream key on a channel, use <a>DeleteStreamKey</a> and then CreateStreamKey.
     * </p>
     * 
     * @param createStreamKeyRequest
     * @return A Java Future containing the result of the CreateStreamKey operation returned by the service.
     * @sample AmazonIVSAsync.CreateStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/CreateStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamKeyResult> createStreamKeyAsync(CreateStreamKeyRequest createStreamKeyRequest);

    /**
     * <p>
     * Creates a stream key, used to initiate a stream, for the specified channel ARN.
     * </p>
     * <p>
     * Note that <a>CreateChannel</a> creates a stream key. If you subsequently use CreateStreamKey on the same channel,
     * it will fail because a stream key already exists and there is a limit of 1 stream key per channel. To reset the
     * stream key on a channel, use <a>DeleteStreamKey</a> and then CreateStreamKey.
     * </p>
     * 
     * @param createStreamKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStreamKey operation returned by the service.
     * @sample AmazonIVSAsyncHandler.CreateStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/CreateStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamKeyResult> createStreamKeyAsync(CreateStreamKeyRequest createStreamKeyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStreamKeyRequest, CreateStreamKeyResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified channel and its associated stream keys.
     * </p>
     * <p>
     * If you try to delete a live channel, you will get an error (409 ConflictException). To delete a channel that is
     * live, call <a>StopStream</a>, wait for the Amazon EventBridge "Stream End" event (to verify that the stream's
     * state was changed from Live to Offline), then call DeleteChannel. (See <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/eventbridge.html"> Using EventBridge with Amazon IVS</a>.)
     * </p>
     * 
     * @param deleteChannelRequest
     * @return A Java Future containing the result of the DeleteChannel operation returned by the service.
     * @sample AmazonIVSAsync.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest deleteChannelRequest);

    /**
     * <p>
     * Deletes the specified channel and its associated stream keys.
     * </p>
     * <p>
     * If you try to delete a live channel, you will get an error (409 ConflictException). To delete a channel that is
     * live, call <a>StopStream</a>, wait for the Amazon EventBridge "Stream End" event (to verify that the stream's
     * state was changed from Live to Offline), then call DeleteChannel. (See <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/eventbridge.html"> Using EventBridge with Amazon IVS</a>.)
     * </p>
     * 
     * @param deleteChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChannel operation returned by the service.
     * @sample AmazonIVSAsyncHandler.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest deleteChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelRequest, DeleteChannelResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified authorization key pair. This invalidates future viewer tokens generated using the key pair’s
     * <code>privateKey</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/private-channels.html">Setting Up Private Channels</a> in
     * the <i>Amazon IVS User Guide</i>.
     * </p>
     * 
     * @param deletePlaybackKeyPairRequest
     * @return A Java Future containing the result of the DeletePlaybackKeyPair operation returned by the service.
     * @sample AmazonIVSAsync.DeletePlaybackKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/DeletePlaybackKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePlaybackKeyPairResult> deletePlaybackKeyPairAsync(DeletePlaybackKeyPairRequest deletePlaybackKeyPairRequest);

    /**
     * <p>
     * Deletes a specified authorization key pair. This invalidates future viewer tokens generated using the key pair’s
     * <code>privateKey</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/private-channels.html">Setting Up Private Channels</a> in
     * the <i>Amazon IVS User Guide</i>.
     * </p>
     * 
     * @param deletePlaybackKeyPairRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePlaybackKeyPair operation returned by the service.
     * @sample AmazonIVSAsyncHandler.DeletePlaybackKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/DeletePlaybackKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePlaybackKeyPairResult> deletePlaybackKeyPairAsync(DeletePlaybackKeyPairRequest deletePlaybackKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePlaybackKeyPairRequest, DeletePlaybackKeyPairResult> asyncHandler);

    /**
     * <p>
     * Deletes the recording configuration for the specified ARN.
     * </p>
     * <p>
     * If you try to delete a recording configuration that is associated with a channel, you will get an error (409
     * ConflictException). To avoid this, for all channels that reference the recording configuration, first use
     * <a>UpdateChannel</a> to set the <code>recordingConfigurationArn</code> field to an empty string, then use
     * DeleteRecordingConfiguration.
     * </p>
     * 
     * @param deleteRecordingConfigurationRequest
     * @return A Java Future containing the result of the DeleteRecordingConfiguration operation returned by the
     *         service.
     * @sample AmazonIVSAsync.DeleteRecordingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/DeleteRecordingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecordingConfigurationResult> deleteRecordingConfigurationAsync(
            DeleteRecordingConfigurationRequest deleteRecordingConfigurationRequest);

    /**
     * <p>
     * Deletes the recording configuration for the specified ARN.
     * </p>
     * <p>
     * If you try to delete a recording configuration that is associated with a channel, you will get an error (409
     * ConflictException). To avoid this, for all channels that reference the recording configuration, first use
     * <a>UpdateChannel</a> to set the <code>recordingConfigurationArn</code> field to an empty string, then use
     * DeleteRecordingConfiguration.
     * </p>
     * 
     * @param deleteRecordingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRecordingConfiguration operation returned by the
     *         service.
     * @sample AmazonIVSAsyncHandler.DeleteRecordingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/DeleteRecordingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecordingConfigurationResult> deleteRecordingConfigurationAsync(
            DeleteRecordingConfigurationRequest deleteRecordingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRecordingConfigurationRequest, DeleteRecordingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the stream key for the specified ARN, so it can no longer be used to stream.
     * </p>
     * 
     * @param deleteStreamKeyRequest
     * @return A Java Future containing the result of the DeleteStreamKey operation returned by the service.
     * @sample AmazonIVSAsync.DeleteStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/DeleteStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStreamKeyResult> deleteStreamKeyAsync(DeleteStreamKeyRequest deleteStreamKeyRequest);

    /**
     * <p>
     * Deletes the stream key for the specified ARN, so it can no longer be used to stream.
     * </p>
     * 
     * @param deleteStreamKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStreamKey operation returned by the service.
     * @sample AmazonIVSAsyncHandler.DeleteStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/DeleteStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStreamKeyResult> deleteStreamKeyAsync(DeleteStreamKeyRequest deleteStreamKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamKeyRequest, DeleteStreamKeyResult> asyncHandler);

    /**
     * <p>
     * Gets the channel configuration for the specified channel ARN. See also <a>BatchGetChannel</a>.
     * </p>
     * 
     * @param getChannelRequest
     * @return A Java Future containing the result of the GetChannel operation returned by the service.
     * @sample AmazonIVSAsync.GetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChannelResult> getChannelAsync(GetChannelRequest getChannelRequest);

    /**
     * <p>
     * Gets the channel configuration for the specified channel ARN. See also <a>BatchGetChannel</a>.
     * </p>
     * 
     * @param getChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChannel operation returned by the service.
     * @sample AmazonIVSAsyncHandler.GetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChannelResult> getChannelAsync(GetChannelRequest getChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetChannelRequest, GetChannelResult> asyncHandler);

    /**
     * <p>
     * Gets a specified playback authorization key pair and returns the <code>arn</code> and <code>fingerprint</code>.
     * The <code>privateKey</code> held by the caller can be used to generate viewer authorization tokens, to grant
     * viewers access to private channels. For more information, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/private-channels.html">Setting Up Private Channels</a> in
     * the <i>Amazon IVS User Guide</i>.
     * </p>
     * 
     * @param getPlaybackKeyPairRequest
     * @return A Java Future containing the result of the GetPlaybackKeyPair operation returned by the service.
     * @sample AmazonIVSAsync.GetPlaybackKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetPlaybackKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPlaybackKeyPairResult> getPlaybackKeyPairAsync(GetPlaybackKeyPairRequest getPlaybackKeyPairRequest);

    /**
     * <p>
     * Gets a specified playback authorization key pair and returns the <code>arn</code> and <code>fingerprint</code>.
     * The <code>privateKey</code> held by the caller can be used to generate viewer authorization tokens, to grant
     * viewers access to private channels. For more information, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/private-channels.html">Setting Up Private Channels</a> in
     * the <i>Amazon IVS User Guide</i>.
     * </p>
     * 
     * @param getPlaybackKeyPairRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPlaybackKeyPair operation returned by the service.
     * @sample AmazonIVSAsyncHandler.GetPlaybackKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetPlaybackKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPlaybackKeyPairResult> getPlaybackKeyPairAsync(GetPlaybackKeyPairRequest getPlaybackKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<GetPlaybackKeyPairRequest, GetPlaybackKeyPairResult> asyncHandler);

    /**
     * <p>
     * Gets the recording configuration for the specified ARN.
     * </p>
     * 
     * @param getRecordingConfigurationRequest
     * @return A Java Future containing the result of the GetRecordingConfiguration operation returned by the service.
     * @sample AmazonIVSAsync.GetRecordingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetRecordingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetRecordingConfigurationResult> getRecordingConfigurationAsync(
            GetRecordingConfigurationRequest getRecordingConfigurationRequest);

    /**
     * <p>
     * Gets the recording configuration for the specified ARN.
     * </p>
     * 
     * @param getRecordingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecordingConfiguration operation returned by the service.
     * @sample AmazonIVSAsyncHandler.GetRecordingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetRecordingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetRecordingConfigurationResult> getRecordingConfigurationAsync(
            GetRecordingConfigurationRequest getRecordingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecordingConfigurationRequest, GetRecordingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets information about the active (live) stream on a specified channel.
     * </p>
     * 
     * @param getStreamRequest
     * @return A Java Future containing the result of the GetStream operation returned by the service.
     * @sample AmazonIVSAsync.GetStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStreamResult> getStreamAsync(GetStreamRequest getStreamRequest);

    /**
     * <p>
     * Gets information about the active (live) stream on a specified channel.
     * </p>
     * 
     * @param getStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStream operation returned by the service.
     * @sample AmazonIVSAsyncHandler.GetStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStreamResult> getStreamAsync(GetStreamRequest getStreamRequest,
            com.amazonaws.handlers.AsyncHandler<GetStreamRequest, GetStreamResult> asyncHandler);

    /**
     * <p>
     * Gets stream-key information for a specified ARN.
     * </p>
     * 
     * @param getStreamKeyRequest
     * @return A Java Future containing the result of the GetStreamKey operation returned by the service.
     * @sample AmazonIVSAsync.GetStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStreamKeyResult> getStreamKeyAsync(GetStreamKeyRequest getStreamKeyRequest);

    /**
     * <p>
     * Gets stream-key information for a specified ARN.
     * </p>
     * 
     * @param getStreamKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStreamKey operation returned by the service.
     * @sample AmazonIVSAsyncHandler.GetStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStreamKeyResult> getStreamKeyAsync(GetStreamKeyRequest getStreamKeyRequest,
            com.amazonaws.handlers.AsyncHandler<GetStreamKeyRequest, GetStreamKeyResult> asyncHandler);

    /**
     * <p>
     * Imports the public portion of a new key pair and returns its <code>arn</code> and <code>fingerprint</code>. The
     * <code>privateKey</code> can then be used to generate viewer authorization tokens, to grant viewers access to
     * private channels. For more information, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/private-channels.html">Setting Up Private Channels</a> in
     * the <i>Amazon IVS User Guide</i>.
     * </p>
     * 
     * @param importPlaybackKeyPairRequest
     * @return A Java Future containing the result of the ImportPlaybackKeyPair operation returned by the service.
     * @sample AmazonIVSAsync.ImportPlaybackKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ImportPlaybackKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportPlaybackKeyPairResult> importPlaybackKeyPairAsync(ImportPlaybackKeyPairRequest importPlaybackKeyPairRequest);

    /**
     * <p>
     * Imports the public portion of a new key pair and returns its <code>arn</code> and <code>fingerprint</code>. The
     * <code>privateKey</code> can then be used to generate viewer authorization tokens, to grant viewers access to
     * private channels. For more information, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/private-channels.html">Setting Up Private Channels</a> in
     * the <i>Amazon IVS User Guide</i>.
     * </p>
     * 
     * @param importPlaybackKeyPairRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportPlaybackKeyPair operation returned by the service.
     * @sample AmazonIVSAsyncHandler.ImportPlaybackKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ImportPlaybackKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportPlaybackKeyPairResult> importPlaybackKeyPairAsync(ImportPlaybackKeyPairRequest importPlaybackKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<ImportPlaybackKeyPairRequest, ImportPlaybackKeyPairResult> asyncHandler);

    /**
     * <p>
     * Gets summary information about all channels in your account, in the AWS region where the API request is
     * processed. This list can be filtered to match a specified name or recording-configuration ARN. Filters are
     * mutually exclusive and cannot be used together. If you try to use both filters, you will get an error (409
     * ConflictException).
     * </p>
     * 
     * @param listChannelsRequest
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AmazonIVSAsync.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest);

    /**
     * <p>
     * Gets summary information about all channels in your account, in the AWS region where the API request is
     * processed. This list can be filtered to match a specified name or recording-configuration ARN. Filters are
     * mutually exclusive and cannot be used together. If you try to use both filters, you will get an error (409
     * ConflictException).
     * </p>
     * 
     * @param listChannelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AmazonIVSAsyncHandler.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelsRequest, ListChannelsResult> asyncHandler);

    /**
     * <p>
     * Gets summary information about playback key pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/private-channels.html">Setting Up Private Channels</a> in
     * the <i>Amazon IVS User Guide</i>.
     * </p>
     * 
     * @param listPlaybackKeyPairsRequest
     * @return A Java Future containing the result of the ListPlaybackKeyPairs operation returned by the service.
     * @sample AmazonIVSAsync.ListPlaybackKeyPairs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListPlaybackKeyPairs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPlaybackKeyPairsResult> listPlaybackKeyPairsAsync(ListPlaybackKeyPairsRequest listPlaybackKeyPairsRequest);

    /**
     * <p>
     * Gets summary information about playback key pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/private-channels.html">Setting Up Private Channels</a> in
     * the <i>Amazon IVS User Guide</i>.
     * </p>
     * 
     * @param listPlaybackKeyPairsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPlaybackKeyPairs operation returned by the service.
     * @sample AmazonIVSAsyncHandler.ListPlaybackKeyPairs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListPlaybackKeyPairs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPlaybackKeyPairsResult> listPlaybackKeyPairsAsync(ListPlaybackKeyPairsRequest listPlaybackKeyPairsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPlaybackKeyPairsRequest, ListPlaybackKeyPairsResult> asyncHandler);

    /**
     * <p>
     * Gets summary information about all recording configurations in your account, in the AWS region where the API
     * request is processed.
     * </p>
     * 
     * @param listRecordingConfigurationsRequest
     * @return A Java Future containing the result of the ListRecordingConfigurations operation returned by the service.
     * @sample AmazonIVSAsync.ListRecordingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListRecordingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecordingConfigurationsResult> listRecordingConfigurationsAsync(
            ListRecordingConfigurationsRequest listRecordingConfigurationsRequest);

    /**
     * <p>
     * Gets summary information about all recording configurations in your account, in the AWS region where the API
     * request is processed.
     * </p>
     * 
     * @param listRecordingConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecordingConfigurations operation returned by the service.
     * @sample AmazonIVSAsyncHandler.ListRecordingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListRecordingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecordingConfigurationsResult> listRecordingConfigurationsAsync(
            ListRecordingConfigurationsRequest listRecordingConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecordingConfigurationsRequest, ListRecordingConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Gets summary information about stream keys for the specified channel.
     * </p>
     * 
     * @param listStreamKeysRequest
     * @return A Java Future containing the result of the ListStreamKeys operation returned by the service.
     * @sample AmazonIVSAsync.ListStreamKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListStreamKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStreamKeysResult> listStreamKeysAsync(ListStreamKeysRequest listStreamKeysRequest);

    /**
     * <p>
     * Gets summary information about stream keys for the specified channel.
     * </p>
     * 
     * @param listStreamKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStreamKeys operation returned by the service.
     * @sample AmazonIVSAsyncHandler.ListStreamKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListStreamKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStreamKeysResult> listStreamKeysAsync(ListStreamKeysRequest listStreamKeysRequest,
            com.amazonaws.handlers.AsyncHandler<ListStreamKeysRequest, ListStreamKeysResult> asyncHandler);

    /**
     * <p>
     * Gets summary information about live streams in your account, in the AWS region where the API request is
     * processed.
     * </p>
     * 
     * @param listStreamsRequest
     * @return A Java Future containing the result of the ListStreams operation returned by the service.
     * @sample AmazonIVSAsync.ListStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListStreams" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest listStreamsRequest);

    /**
     * <p>
     * Gets summary information about live streams in your account, in the AWS region where the API request is
     * processed.
     * </p>
     * 
     * @param listStreamsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStreams operation returned by the service.
     * @sample AmazonIVSAsyncHandler.ListStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListStreams" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest listStreamsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler);

    /**
     * <p>
     * Gets information about AWS tags for the specified ARN.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonIVSAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Gets information about AWS tags for the specified ARN.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonIVSAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Inserts metadata into the active stream of the specified channel. A maximum of 5 requests per second per channel
     * is allowed, each with a maximum 1 KB payload. (If 5 TPS is not sufficient for your needs, we recommend batching
     * your data into a single PutMetadata call.) Also see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/metadata.html">Embedding Metadata within a Video
     * Stream</a> in the <i>Amazon IVS User Guide</i>.
     * </p>
     * 
     * @param putMetadataRequest
     * @return A Java Future containing the result of the PutMetadata operation returned by the service.
     * @sample AmazonIVSAsync.PutMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/PutMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutMetadataResult> putMetadataAsync(PutMetadataRequest putMetadataRequest);

    /**
     * <p>
     * Inserts metadata into the active stream of the specified channel. A maximum of 5 requests per second per channel
     * is allowed, each with a maximum 1 KB payload. (If 5 TPS is not sufficient for your needs, we recommend batching
     * your data into a single PutMetadata call.) Also see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/metadata.html">Embedding Metadata within a Video
     * Stream</a> in the <i>Amazon IVS User Guide</i>.
     * </p>
     * 
     * @param putMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutMetadata operation returned by the service.
     * @sample AmazonIVSAsyncHandler.PutMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/PutMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutMetadataResult> putMetadataAsync(PutMetadataRequest putMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<PutMetadataRequest, PutMetadataResult> asyncHandler);

    /**
     * <p>
     * Disconnects the incoming RTMPS stream for the specified channel. Can be used in conjunction with
     * <a>DeleteStreamKey</a> to prevent further streaming to a channel.
     * </p>
     * <note>
     * <p>
     * Many streaming client-software libraries automatically reconnect a dropped RTMPS session, so to stop the stream
     * permanently, you may want to first revoke the <code>streamKey</code> attached to the channel.
     * </p>
     * </note>
     * 
     * @param stopStreamRequest
     * @return A Java Future containing the result of the StopStream operation returned by the service.
     * @sample AmazonIVSAsync.StopStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/StopStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopStreamResult> stopStreamAsync(StopStreamRequest stopStreamRequest);

    /**
     * <p>
     * Disconnects the incoming RTMPS stream for the specified channel. Can be used in conjunction with
     * <a>DeleteStreamKey</a> to prevent further streaming to a channel.
     * </p>
     * <note>
     * <p>
     * Many streaming client-software libraries automatically reconnect a dropped RTMPS session, so to stop the stream
     * permanently, you may want to first revoke the <code>streamKey</code> attached to the channel.
     * </p>
     * </note>
     * 
     * @param stopStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopStream operation returned by the service.
     * @sample AmazonIVSAsyncHandler.StopStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/StopStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopStreamResult> stopStreamAsync(StopStreamRequest stopStreamRequest,
            com.amazonaws.handlers.AsyncHandler<StopStreamRequest, StopStreamResult> asyncHandler);

    /**
     * <p>
     * Adds or updates tags for the AWS resource with the specified ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonIVSAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or updates tags for the AWS resource with the specified ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonIVSAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from the resource with the specified ARN.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonIVSAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from the resource with the specified ARN.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonIVSAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a channel's configuration. This does not affect an ongoing stream of this channel. You must stop and
     * restart the stream for the changes to take effect.
     * </p>
     * 
     * @param updateChannelRequest
     * @return A Java Future containing the result of the UpdateChannel operation returned by the service.
     * @sample AmazonIVSAsync.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest updateChannelRequest);

    /**
     * <p>
     * Updates a channel's configuration. This does not affect an ongoing stream of this channel. You must stop and
     * restart the stream for the changes to take effect.
     * </p>
     * 
     * @param updateChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateChannel operation returned by the service.
     * @sample AmazonIVSAsyncHandler.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest updateChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChannelRequest, UpdateChannelResult> asyncHandler);

}
