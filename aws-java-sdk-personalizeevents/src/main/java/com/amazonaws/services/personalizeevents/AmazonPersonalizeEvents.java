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
package com.amazonaws.services.personalizeevents;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.personalizeevents.model.*;

/**
 * Interface for accessing Amazon Personalize Events.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.personalizeevents.AbstractAmazonPersonalizeEvents} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Personalize can consume real-time user event data, such as <i>stream</i> or <i>click</i> data, and use it for
 * model training either alone or combined with historical data. For more information see <a
 * href="https://docs.aws.amazon.com/personalize/latest/dg/recording-events.html">Recording Events</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPersonalizeEvents {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "personalize-events";

    /**
     * <p>
     * Records user interaction event data. For more information see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/recording-events.html">Recording Events</a>.
     * </p>
     * 
     * @param putEventsRequest
     * @return Result of the PutEvents operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @sample AmazonPersonalizeEvents.PutEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/PutEvents" target="_top">AWS
     *      API Documentation</a>
     */
    PutEventsResult putEvents(PutEventsRequest putEventsRequest);

    /**
     * <p>
     * Adds one or more items to an Items dataset. For more information see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/importing-items.html">Importing Items Incrementally</a>.
     * </p>
     * 
     * @param putItemsRequest
     * @return Result of the PutItems operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalizeEvents.PutItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/PutItems" target="_top">AWS
     *      API Documentation</a>
     */
    PutItemsResult putItems(PutItemsRequest putItemsRequest);

    /**
     * <p>
     * Adds one or more users to a Users dataset. For more information see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/importing-users.html">Importing Users Incrementally</a>.
     * </p>
     * 
     * @param putUsersRequest
     * @return Result of the PutUsers operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalizeEvents.PutUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/PutUsers" target="_top">AWS
     *      API Documentation</a>
     */
    PutUsersResult putUsers(PutUsersRequest putUsersRequest);

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
