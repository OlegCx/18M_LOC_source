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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.ivs.model.*;

/**
 * Interface for accessing Amazon IVS.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ivs.AbstractAmazonIVS} instead.
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
public interface AmazonIVS {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "ivs";

    /**
     * <p>
     * Performs <a>GetChannel</a> on multiple ARNs simultaneously.
     * </p>
     * 
     * @param batchGetChannelRequest
     * @return Result of the BatchGetChannel operation returned by the service.
     * @sample AmazonIVS.BatchGetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/BatchGetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    BatchGetChannelResult batchGetChannel(BatchGetChannelRequest batchGetChannelRequest);

    /**
     * <p>
     * Performs <a>GetStreamKey</a> on multiple ARNs simultaneously.
     * </p>
     * 
     * @param batchGetStreamKeyRequest
     * @return Result of the BatchGetStreamKey operation returned by the service.
     * @sample AmazonIVS.BatchGetStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/BatchGetStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    BatchGetStreamKeyResult batchGetStreamKey(BatchGetStreamKeyRequest batchGetStreamKeyRequest);

    /**
     * <p>
     * Creates a new channel and an associated stream key to start streaming.
     * </p>
     * 
     * @param createChannelRequest
     * @return Result of the CreateChannel operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws PendingVerificationException
     * @sample AmazonIVS.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    CreateChannelResult createChannel(CreateChannelRequest createChannelRequest);

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
     * @return Result of the CreateRecordingConfiguration operation returned by the service.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws PendingVerificationException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @sample AmazonIVS.CreateRecordingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/CreateRecordingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRecordingConfigurationResult createRecordingConfiguration(CreateRecordingConfigurationRequest createRecordingConfigurationRequest);

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
     * @return Result of the CreateStreamKey operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws PendingVerificationException
     * @sample AmazonIVS.CreateStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/CreateStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    CreateStreamKeyResult createStreamKey(CreateStreamKeyRequest createStreamKeyRequest);

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
     * @return Result of the DeleteChannel operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws PendingVerificationException
     * @sample AmazonIVS.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteChannelResult deleteChannel(DeleteChannelRequest deleteChannelRequest);

    /**
     * <p>
     * Deletes a specified authorization key pair. This invalidates future viewer tokens generated using the key pair’s
     * <code>privateKey</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/private-channels.html">Setting Up Private Channels</a> in
     * the <i>Amazon IVS User Guide</i>.
     * </p>
     * 
     * @param deletePlaybackKeyPairRequest
     * @return Result of the DeletePlaybackKeyPair operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws PendingVerificationException
     * @sample AmazonIVS.DeletePlaybackKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/DeletePlaybackKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePlaybackKeyPairResult deletePlaybackKeyPair(DeletePlaybackKeyPairRequest deletePlaybackKeyPairRequest);

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
     * @return Result of the DeleteRecordingConfiguration operation returned by the service.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @sample AmazonIVS.DeleteRecordingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/DeleteRecordingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRecordingConfigurationResult deleteRecordingConfiguration(DeleteRecordingConfigurationRequest deleteRecordingConfigurationRequest);

    /**
     * <p>
     * Deletes the stream key for the specified ARN, so it can no longer be used to stream.
     * </p>
     * 
     * @param deleteStreamKeyRequest
     * @return Result of the DeleteStreamKey operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws PendingVerificationException
     * @sample AmazonIVS.DeleteStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/DeleteStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteStreamKeyResult deleteStreamKey(DeleteStreamKeyRequest deleteStreamKeyRequest);

    /**
     * <p>
     * Gets the channel configuration for the specified channel ARN. See also <a>BatchGetChannel</a>.
     * </p>
     * 
     * @param getChannelRequest
     * @return Result of the GetChannel operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @sample AmazonIVS.GetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    GetChannelResult getChannel(GetChannelRequest getChannelRequest);

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
     * @return Result of the GetPlaybackKeyPair operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @sample AmazonIVS.GetPlaybackKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetPlaybackKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    GetPlaybackKeyPairResult getPlaybackKeyPair(GetPlaybackKeyPairRequest getPlaybackKeyPairRequest);

    /**
     * <p>
     * Gets the recording configuration for the specified ARN.
     * </p>
     * 
     * @param getRecordingConfigurationRequest
     * @return Result of the GetRecordingConfiguration operation returned by the service.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @sample AmazonIVS.GetRecordingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetRecordingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    GetRecordingConfigurationResult getRecordingConfiguration(GetRecordingConfigurationRequest getRecordingConfigurationRequest);

    /**
     * <p>
     * Gets information about the active (live) stream on a specified channel.
     * </p>
     * 
     * @param getStreamRequest
     * @return Result of the GetStream operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ChannelNotBroadcastingException
     * @sample AmazonIVS.GetStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetStream" target="_top">AWS API
     *      Documentation</a>
     */
    GetStreamResult getStream(GetStreamRequest getStreamRequest);

    /**
     * <p>
     * Gets stream-key information for a specified ARN.
     * </p>
     * 
     * @param getStreamKeyRequest
     * @return Result of the GetStreamKey operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @sample AmazonIVS.GetStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    GetStreamKeyResult getStreamKey(GetStreamKeyRequest getStreamKeyRequest);

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
     * @return Result of the ImportPlaybackKeyPair operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws PendingVerificationException
     * @sample AmazonIVS.ImportPlaybackKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ImportPlaybackKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    ImportPlaybackKeyPairResult importPlaybackKeyPair(ImportPlaybackKeyPairRequest importPlaybackKeyPairRequest);

    /**
     * <p>
     * Gets summary information about all channels in your account, in the AWS region where the API request is
     * processed. This list can be filtered to match a specified name or recording-configuration ARN. Filters are
     * mutually exclusive and cannot be used together. If you try to use both filters, you will get an error (409
     * ConflictException).
     * </p>
     * 
     * @param listChannelsRequest
     * @return Result of the ListChannels operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @sample AmazonIVS.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    ListChannelsResult listChannels(ListChannelsRequest listChannelsRequest);

    /**
     * <p>
     * Gets summary information about playback key pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/private-channels.html">Setting Up Private Channels</a> in
     * the <i>Amazon IVS User Guide</i>.
     * </p>
     * 
     * @param listPlaybackKeyPairsRequest
     * @return Result of the ListPlaybackKeyPairs operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVS.ListPlaybackKeyPairs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListPlaybackKeyPairs" target="_top">AWS API
     *      Documentation</a>
     */
    ListPlaybackKeyPairsResult listPlaybackKeyPairs(ListPlaybackKeyPairsRequest listPlaybackKeyPairsRequest);

    /**
     * <p>
     * Gets summary information about all recording configurations in your account, in the AWS region where the API
     * request is processed.
     * </p>
     * 
     * @param listRecordingConfigurationsRequest
     * @return Result of the ListRecordingConfigurations operation returned by the service.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ValidationException
     * @sample AmazonIVS.ListRecordingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListRecordingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListRecordingConfigurationsResult listRecordingConfigurations(ListRecordingConfigurationsRequest listRecordingConfigurationsRequest);

    /**
     * <p>
     * Gets summary information about stream keys for the specified channel.
     * </p>
     * 
     * @param listStreamKeysRequest
     * @return Result of the ListStreamKeys operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @sample AmazonIVS.ListStreamKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListStreamKeys" target="_top">AWS API
     *      Documentation</a>
     */
    ListStreamKeysResult listStreamKeys(ListStreamKeysRequest listStreamKeysRequest);

    /**
     * <p>
     * Gets summary information about live streams in your account, in the AWS region where the API request is
     * processed.
     * </p>
     * 
     * @param listStreamsRequest
     * @return Result of the ListStreams operation returned by the service.
     * @throws AccessDeniedException
     * @sample AmazonIVS.ListStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListStreams" target="_top">AWS API
     *      Documentation</a>
     */
    ListStreamsResult listStreams(ListStreamsRequest listStreamsRequest);

    /**
     * <p>
     * Gets information about AWS tags for the specified ARN.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @sample AmazonIVS.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @return Result of the PutMetadata operation returned by the service.
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws ChannelNotBroadcastingException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVS.PutMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/PutMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    PutMetadataResult putMetadata(PutMetadataRequest putMetadataRequest);

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
     * @return Result of the StopStream operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ChannelNotBroadcastingException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws StreamUnavailableException
     * @sample AmazonIVS.StopStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/StopStream" target="_top">AWS API
     *      Documentation</a>
     */
    StopStreamResult stopStream(StopStreamRequest stopStreamRequest);

    /**
     * <p>
     * Adds or updates tags for the AWS resource with the specified ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @sample AmazonIVS.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from the resource with the specified ARN.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @sample AmazonIVS.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a channel's configuration. This does not affect an ongoing stream of this channel. You must stop and
     * restart the stream for the changes to take effect.
     * </p>
     * 
     * @param updateChannelRequest
     * @return Result of the UpdateChannel operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws PendingVerificationException
     * @sample AmazonIVS.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateChannelResult updateChannel(UpdateChannelRequest updateChannelRequest);

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
