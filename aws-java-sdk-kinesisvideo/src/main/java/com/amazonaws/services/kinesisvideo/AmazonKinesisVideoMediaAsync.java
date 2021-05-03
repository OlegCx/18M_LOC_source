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
package com.amazonaws.services.kinesisvideo;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisvideo.model.*;

/**
 * Interface for accessing Kinesis Video Media asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideoMediaAsync} instead.
 * </p>
 * <p>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonKinesisVideoMediaAsync extends AmazonKinesisVideoMedia {

    /**
     * <p>
     * Use this API to retrieve media content from a Kinesis video stream. In the request, you identify the stream name
     * or stream Amazon Resource Name (ARN), and the starting chunk. Kinesis Video Streams then returns a stream of
     * chunks in order by fragment number.
     * </p>
     * <note>
     * <p>
     * You must first call the <code>GetDataEndpoint</code> API to get an endpoint. Then send the <code>GetMedia</code>
     * requests to this endpoint using the <a href="https://docs.aws.amazon.com/cli/latest/reference/">--endpoint-url
     * parameter</a>.
     * </p>
     * </note>
     * <p>
     * When you put media data (fragments) on a stream, Kinesis Video Streams stores each incoming fragment and related
     * metadata in what is called a "chunk." For more information, see <a
     * href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_dataplane_PutMedia.html">PutMedia</a>. The
     * <code>GetMedia</code> API returns a stream of these chunks starting from the chunk that you specify in the
     * request.
     * </p>
     * <p>
     * The following limits apply when using the <code>GetMedia</code> API:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A client can call <code>GetMedia</code> up to five times per second per stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * Kinesis Video Streams sends media data at a rate of up to 25 megabytes per second (or 200 megabits per second)
     * during a <code>GetMedia</code> session.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If an error is thrown after invoking a Kinesis Video Streams media API, in addition to the HTTP status code and
     * the response body, it includes the following pieces of information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-ErrorType</code> HTTP header – contains a more specific error type in addition to what the HTTP
     * status code provides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-RequestId</code> HTTP header – if you want to report an issue to AWS, the support team can better
     * diagnose the problem if given the Request Id.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Both the HTTP status code and the ErrorType header can be utilized to make programmatic decisions about whether
     * errors are retry-able and under what conditions, as well as provide information on what actions the client
     * programmer might need to take in order to successfully try again.
     * </p>
     * <p>
     * For more information, see the <b>Errors</b> section at the bottom of this topic, as well as <a
     * href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/CommonErrors.html">Common Errors</a>.
     * </p>
     * </note>
     * 
     * @param getMediaRequest
     * @return A Java Future containing the result of the GetMedia operation returned by the service.
     * @sample AmazonKinesisVideoMediaAsync.GetMedia
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-media-2017-09-30/GetMedia" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaResult> getMediaAsync(GetMediaRequest getMediaRequest);

    /**
     * <p>
     * Use this API to retrieve media content from a Kinesis video stream. In the request, you identify the stream name
     * or stream Amazon Resource Name (ARN), and the starting chunk. Kinesis Video Streams then returns a stream of
     * chunks in order by fragment number.
     * </p>
     * <note>
     * <p>
     * You must first call the <code>GetDataEndpoint</code> API to get an endpoint. Then send the <code>GetMedia</code>
     * requests to this endpoint using the <a href="https://docs.aws.amazon.com/cli/latest/reference/">--endpoint-url
     * parameter</a>.
     * </p>
     * </note>
     * <p>
     * When you put media data (fragments) on a stream, Kinesis Video Streams stores each incoming fragment and related
     * metadata in what is called a "chunk." For more information, see <a
     * href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_dataplane_PutMedia.html">PutMedia</a>. The
     * <code>GetMedia</code> API returns a stream of these chunks starting from the chunk that you specify in the
     * request.
     * </p>
     * <p>
     * The following limits apply when using the <code>GetMedia</code> API:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A client can call <code>GetMedia</code> up to five times per second per stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * Kinesis Video Streams sends media data at a rate of up to 25 megabytes per second (or 200 megabits per second)
     * during a <code>GetMedia</code> session.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If an error is thrown after invoking a Kinesis Video Streams media API, in addition to the HTTP status code and
     * the response body, it includes the following pieces of information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-ErrorType</code> HTTP header – contains a more specific error type in addition to what the HTTP
     * status code provides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-RequestId</code> HTTP header – if you want to report an issue to AWS, the support team can better
     * diagnose the problem if given the Request Id.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Both the HTTP status code and the ErrorType header can be utilized to make programmatic decisions about whether
     * errors are retry-able and under what conditions, as well as provide information on what actions the client
     * programmer might need to take in order to successfully try again.
     * </p>
     * <p>
     * For more information, see the <b>Errors</b> section at the bottom of this topic, as well as <a
     * href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/CommonErrors.html">Common Errors</a>.
     * </p>
     * </note>
     * 
     * @param getMediaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMedia operation returned by the service.
     * @sample AmazonKinesisVideoMediaAsyncHandler.GetMedia
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-media-2017-09-30/GetMedia" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaResult> getMediaAsync(GetMediaRequest getMediaRequest,
            com.amazonaws.handlers.AsyncHandler<GetMediaRequest, GetMediaResult> asyncHandler);

}
