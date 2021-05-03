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
package com.amazonaws.services.iotdata;

import javax.annotation.Generated;

import com.amazonaws.services.iotdata.model.*;

/**
 * Interface for accessing AWS IoT Data Plane asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotdata.AbstractAWSIotDataAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS IoT</fullname>
 * <p>
 * AWS IoT-Data enables secure, bi-directional communication between Internet-connected things (such as sensors,
 * actuators, embedded devices, or smart appliances) and the AWS cloud. It implements a broker for applications and
 * things to publish messages over HTTP (Publish) and retrieve, update, and delete shadows. A shadow is a persistent
 * representation of your things and their state in the AWS cloud.
 * </p>
 * <p>
 * Find the endpoint address for actions in the AWS IoT data plane by running this CLI command:
 * </p>
 * <p>
 * <code>aws iot describe-endpoint --endpoint-type iot:Data-ATS</code>
 * </p>
 * <p>
 * The service name used by <a href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">AWS
 * Signature Version 4</a> to sign requests is: <i>iotdevicegateway</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIotDataAsync extends AWSIotData {

    /**
     * <p>
     * Deletes the shadow for the specified thing.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/API_DeleteThingShadow.html">DeleteThingShadow</a> in
     * the AWS IoT Developer Guide.
     * </p>
     * 
     * @param deleteThingShadowRequest
     *        The input for the DeleteThingShadow operation.
     * @return A Java Future containing the result of the DeleteThingShadow operation returned by the service.
     * @sample AWSIotDataAsync.DeleteThingShadow
     */
    java.util.concurrent.Future<DeleteThingShadowResult> deleteThingShadowAsync(DeleteThingShadowRequest deleteThingShadowRequest);

    /**
     * <p>
     * Deletes the shadow for the specified thing.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/API_DeleteThingShadow.html">DeleteThingShadow</a> in
     * the AWS IoT Developer Guide.
     * </p>
     * 
     * @param deleteThingShadowRequest
     *        The input for the DeleteThingShadow operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteThingShadow operation returned by the service.
     * @sample AWSIotDataAsyncHandler.DeleteThingShadow
     */
    java.util.concurrent.Future<DeleteThingShadowResult> deleteThingShadowAsync(DeleteThingShadowRequest deleteThingShadowRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteThingShadowRequest, DeleteThingShadowResult> asyncHandler);

    /**
     * <p>
     * Gets the shadow for the specified thing.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/API_GetThingShadow.html">GetThingShadow</a> in the AWS
     * IoT Developer Guide.
     * </p>
     * 
     * @param getThingShadowRequest
     *        The input for the GetThingShadow operation.
     * @return A Java Future containing the result of the GetThingShadow operation returned by the service.
     * @sample AWSIotDataAsync.GetThingShadow
     */
    java.util.concurrent.Future<GetThingShadowResult> getThingShadowAsync(GetThingShadowRequest getThingShadowRequest);

    /**
     * <p>
     * Gets the shadow for the specified thing.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/API_GetThingShadow.html">GetThingShadow</a> in the AWS
     * IoT Developer Guide.
     * </p>
     * 
     * @param getThingShadowRequest
     *        The input for the GetThingShadow operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetThingShadow operation returned by the service.
     * @sample AWSIotDataAsyncHandler.GetThingShadow
     */
    java.util.concurrent.Future<GetThingShadowResult> getThingShadowAsync(GetThingShadowRequest getThingShadowRequest,
            com.amazonaws.handlers.AsyncHandler<GetThingShadowRequest, GetThingShadowResult> asyncHandler);

    /**
     * <p>
     * Lists the shadows for the specified thing.
     * </p>
     * 
     * @param listNamedShadowsForThingRequest
     * @return A Java Future containing the result of the ListNamedShadowsForThing operation returned by the service.
     * @sample AWSIotDataAsync.ListNamedShadowsForThing
     */
    java.util.concurrent.Future<ListNamedShadowsForThingResult> listNamedShadowsForThingAsync(ListNamedShadowsForThingRequest listNamedShadowsForThingRequest);

    /**
     * <p>
     * Lists the shadows for the specified thing.
     * </p>
     * 
     * @param listNamedShadowsForThingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNamedShadowsForThing operation returned by the service.
     * @sample AWSIotDataAsyncHandler.ListNamedShadowsForThing
     */
    java.util.concurrent.Future<ListNamedShadowsForThingResult> listNamedShadowsForThingAsync(ListNamedShadowsForThingRequest listNamedShadowsForThingRequest,
            com.amazonaws.handlers.AsyncHandler<ListNamedShadowsForThingRequest, ListNamedShadowsForThingResult> asyncHandler);

    /**
     * <p>
     * Publishes state information.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/iot/latest/developerguide/protocols.html#http">HTTP
     * Protocol</a> in the AWS IoT Developer Guide.
     * </p>
     * 
     * @param publishRequest
     *        The input for the Publish operation.
     * @return A Java Future containing the result of the Publish operation returned by the service.
     * @sample AWSIotDataAsync.Publish
     */
    java.util.concurrent.Future<PublishResult> publishAsync(PublishRequest publishRequest);

    /**
     * <p>
     * Publishes state information.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/iot/latest/developerguide/protocols.html#http">HTTP
     * Protocol</a> in the AWS IoT Developer Guide.
     * </p>
     * 
     * @param publishRequest
     *        The input for the Publish operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Publish operation returned by the service.
     * @sample AWSIotDataAsyncHandler.Publish
     */
    java.util.concurrent.Future<PublishResult> publishAsync(PublishRequest publishRequest,
            com.amazonaws.handlers.AsyncHandler<PublishRequest, PublishResult> asyncHandler);

    /**
     * <p>
     * Updates the shadow for the specified thing.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/API_UpdateThingShadow.html">UpdateThingShadow</a> in
     * the AWS IoT Developer Guide.
     * </p>
     * 
     * @param updateThingShadowRequest
     *        The input for the UpdateThingShadow operation.
     * @return A Java Future containing the result of the UpdateThingShadow operation returned by the service.
     * @sample AWSIotDataAsync.UpdateThingShadow
     */
    java.util.concurrent.Future<UpdateThingShadowResult> updateThingShadowAsync(UpdateThingShadowRequest updateThingShadowRequest);

    /**
     * <p>
     * Updates the shadow for the specified thing.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/API_UpdateThingShadow.html">UpdateThingShadow</a> in
     * the AWS IoT Developer Guide.
     * </p>
     * 
     * @param updateThingShadowRequest
     *        The input for the UpdateThingShadow operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateThingShadow operation returned by the service.
     * @sample AWSIotDataAsyncHandler.UpdateThingShadow
     */
    java.util.concurrent.Future<UpdateThingShadowResult> updateThingShadowAsync(UpdateThingShadowRequest updateThingShadowRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateThingShadowRequest, UpdateThingShadowResult> asyncHandler);

}
