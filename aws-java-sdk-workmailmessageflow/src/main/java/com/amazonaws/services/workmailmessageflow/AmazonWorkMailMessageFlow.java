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
package com.amazonaws.services.workmailmessageflow;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.workmailmessageflow.model.*;

/**
 * Interface for accessing Amazon WorkMail Message Flow.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.workmailmessageflow.AbstractAmazonWorkMailMessageFlow} instead.
 * </p>
 * <p>
 * <p>
 * The WorkMail Message Flow API provides access to email messages as they are being sent and received by a WorkMail
 * organization.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonWorkMailMessageFlow {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "workmailmessageflow";

    /**
     * <p>
     * Retrieves the raw content of an in-transit email message, in MIME format.
     * </p>
     * 
     * @param getRawMessageContentRequest
     * @return Result of the GetRawMessageContent operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested email message is not found.
     * @sample AmazonWorkMailMessageFlow.GetRawMessageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmailmessageflow-2019-05-01/GetRawMessageContent"
     *      target="_top">AWS API Documentation</a>
     */
    GetRawMessageContentResult getRawMessageContent(GetRawMessageContentRequest getRawMessageContentRequest);

    /**
     * <p>
     * Updates the raw content of an in-transit email message, in MIME format.
     * </p>
     * <p>
     * This example describes how to update in-transit email message. For more information and examples for using this
     * API, see <a href="https://docs.aws.amazon.com/workmail/latest/adminguide/update-with-lambda.html"> Updating
     * message content with AWS Lambda</a>.
     * </p>
     * <note>
     * <p>
     * Updates to an in-transit message only appear when you call <code>PutRawMessageContent</code> from an AWS Lambda
     * function configured with a synchronous <a
     * href="https://docs.aws.amazon.com/workmail/latest/adminguide/lambda.html#synchronous-rules"> Run Lambda</a> rule.
     * If you call <code>PutRawMessageContent</code> on a delivered or sent message, the message remains unchanged, even
     * though <a
     * href="https://docs.aws.amazon.com/workmail/latest/APIReference/API_messageflow_GetRawMessageContent.html"
     * >GetRawMessageContent</a> returns an updated message.
     * </p>
     * </note>
     * 
     * @param putRawMessageContentRequest
     * @return Result of the PutRawMessageContent operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested email message is not found.
     * @throws InvalidContentLocationException
     *         WorkMail could not access the updated email content. Possible reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You made the request in a region other than your S3 bucket region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-owner-condition.html">S3 bucket
     *         owner</a> is not the same as the calling AWS account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You have an incomplete or missing S3 bucket policy. For more information about policies, see <a
     *         href="https://docs.aws.amazon.com/workmail/latest/adminguide/update-with-lambda.html"> Updating message
     *         content with AWS Lambda </a> in the <i>WorkMail Administrator Guide</i>.
     *         </p>
     *         </li>
     * @throws MessageRejectedException
     *         The requested email could not be updated due to an error in the MIME content. Check the error message for
     *         more information about what caused the error.
     * @throws MessageFrozenException
     *         The requested email is not eligible for update. This is usually the case for a redirected email.
     * @sample AmazonWorkMailMessageFlow.PutRawMessageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmailmessageflow-2019-05-01/PutRawMessageContent"
     *      target="_top">AWS API Documentation</a>
     */
    PutRawMessageContentResult putRawMessageContent(PutRawMessageContentRequest putRawMessageContentRequest);

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
