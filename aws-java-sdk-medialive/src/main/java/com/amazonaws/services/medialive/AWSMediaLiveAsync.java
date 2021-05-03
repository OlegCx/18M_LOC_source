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
package com.amazonaws.services.medialive;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;

/**
 * Interface for accessing MediaLive asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.medialive.AbstractAWSMediaLiveAsync} instead.
 * </p>
 * <p>
 * API for AWS Elemental MediaLive
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaLiveAsync extends AWSMediaLive {

    /**
     * Accept an incoming input device transfer. The ownership of the device will transfer to your AWS account.
     * 
     * @param acceptInputDeviceTransferRequest
     *        Placeholder documentation for AcceptInputDeviceTransferRequest
     * @return A Java Future containing the result of the AcceptInputDeviceTransfer operation returned by the service.
     * @sample AWSMediaLiveAsync.AcceptInputDeviceTransfer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AcceptInputDeviceTransfer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptInputDeviceTransferResult> acceptInputDeviceTransferAsync(
            AcceptInputDeviceTransferRequest acceptInputDeviceTransferRequest);

    /**
     * Accept an incoming input device transfer. The ownership of the device will transfer to your AWS account.
     * 
     * @param acceptInputDeviceTransferRequest
     *        Placeholder documentation for AcceptInputDeviceTransferRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptInputDeviceTransfer operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.AcceptInputDeviceTransfer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AcceptInputDeviceTransfer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptInputDeviceTransferResult> acceptInputDeviceTransferAsync(
            AcceptInputDeviceTransferRequest acceptInputDeviceTransferRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptInputDeviceTransferRequest, AcceptInputDeviceTransferResult> asyncHandler);

    /**
     * Starts delete of resources.
     * 
     * @param batchDeleteRequest
     *        A request to delete resources
     * @return A Java Future containing the result of the BatchDelete operation returned by the service.
     * @sample AWSMediaLiveAsync.BatchDelete
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchDelete" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteResult> batchDeleteAsync(BatchDeleteRequest batchDeleteRequest);

    /**
     * Starts delete of resources.
     * 
     * @param batchDeleteRequest
     *        A request to delete resources
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDelete operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.BatchDelete
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchDelete" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteResult> batchDeleteAsync(BatchDeleteRequest batchDeleteRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteRequest, BatchDeleteResult> asyncHandler);

    /**
     * Starts existing resources
     * 
     * @param batchStartRequest
     *        A request to start resources
     * @return A Java Future containing the result of the BatchStart operation returned by the service.
     * @sample AWSMediaLiveAsync.BatchStart
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchStart" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchStartResult> batchStartAsync(BatchStartRequest batchStartRequest);

    /**
     * Starts existing resources
     * 
     * @param batchStartRequest
     *        A request to start resources
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchStart operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.BatchStart
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchStart" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchStartResult> batchStartAsync(BatchStartRequest batchStartRequest,
            com.amazonaws.handlers.AsyncHandler<BatchStartRequest, BatchStartResult> asyncHandler);

    /**
     * Stops running resources
     * 
     * @param batchStopRequest
     *        A request to stop resources
     * @return A Java Future containing the result of the BatchStop operation returned by the service.
     * @sample AWSMediaLiveAsync.BatchStop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchStop" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchStopResult> batchStopAsync(BatchStopRequest batchStopRequest);

    /**
     * Stops running resources
     * 
     * @param batchStopRequest
     *        A request to stop resources
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchStop operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.BatchStop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchStop" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchStopResult> batchStopAsync(BatchStopRequest batchStopRequest,
            com.amazonaws.handlers.AsyncHandler<BatchStopRequest, BatchStopResult> asyncHandler);

    /**
     * Update a channel schedule
     * 
     * @param batchUpdateScheduleRequest
     *        List of actions to create and list of actions to delete.
     * @return A Java Future containing the result of the BatchUpdateSchedule operation returned by the service.
     * @sample AWSMediaLiveAsync.BatchUpdateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchUpdateSchedule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateScheduleResult> batchUpdateScheduleAsync(BatchUpdateScheduleRequest batchUpdateScheduleRequest);

    /**
     * Update a channel schedule
     * 
     * @param batchUpdateScheduleRequest
     *        List of actions to create and list of actions to delete.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchUpdateSchedule operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.BatchUpdateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchUpdateSchedule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateScheduleResult> batchUpdateScheduleAsync(BatchUpdateScheduleRequest batchUpdateScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateScheduleRequest, BatchUpdateScheduleResult> asyncHandler);

    /**
     * Cancel an input device transfer that you have requested.
     * 
     * @param cancelInputDeviceTransferRequest
     *        Placeholder documentation for CancelInputDeviceTransferRequest
     * @return A Java Future containing the result of the CancelInputDeviceTransfer operation returned by the service.
     * @sample AWSMediaLiveAsync.CancelInputDeviceTransfer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CancelInputDeviceTransfer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelInputDeviceTransferResult> cancelInputDeviceTransferAsync(
            CancelInputDeviceTransferRequest cancelInputDeviceTransferRequest);

    /**
     * Cancel an input device transfer that you have requested.
     * 
     * @param cancelInputDeviceTransferRequest
     *        Placeholder documentation for CancelInputDeviceTransferRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelInputDeviceTransfer operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.CancelInputDeviceTransfer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CancelInputDeviceTransfer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelInputDeviceTransferResult> cancelInputDeviceTransferAsync(
            CancelInputDeviceTransferRequest cancelInputDeviceTransferRequest,
            com.amazonaws.handlers.AsyncHandler<CancelInputDeviceTransferRequest, CancelInputDeviceTransferResult> asyncHandler);

    /**
     * Creates a new channel
     * 
     * @param createChannelRequest
     *        A request to create a channel
     * @return A Java Future containing the result of the CreateChannel operation returned by the service.
     * @sample AWSMediaLiveAsync.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest createChannelRequest);

    /**
     * Creates a new channel
     * 
     * @param createChannelRequest
     *        A request to create a channel
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChannel operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest createChannelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChannelRequest, CreateChannelResult> asyncHandler);

    /**
     * Create an input
     * 
     * @param createInputRequest
     *        The name of the input
     * @return A Java Future containing the result of the CreateInput operation returned by the service.
     * @sample AWSMediaLiveAsync.CreateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInputResult> createInputAsync(CreateInputRequest createInputRequest);

    /**
     * Create an input
     * 
     * @param createInputRequest
     *        The name of the input
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInput operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.CreateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInputResult> createInputAsync(CreateInputRequest createInputRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInputRequest, CreateInputResult> asyncHandler);

    /**
     * Creates a Input Security Group
     * 
     * @param createInputSecurityGroupRequest
     *        The IPv4 CIDRs to whitelist for this Input Security Group
     * @return A Java Future containing the result of the CreateInputSecurityGroup operation returned by the service.
     * @sample AWSMediaLiveAsync.CreateInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInputSecurityGroupResult> createInputSecurityGroupAsync(CreateInputSecurityGroupRequest createInputSecurityGroupRequest);

    /**
     * Creates a Input Security Group
     * 
     * @param createInputSecurityGroupRequest
     *        The IPv4 CIDRs to whitelist for this Input Security Group
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInputSecurityGroup operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.CreateInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInputSecurityGroupResult> createInputSecurityGroupAsync(CreateInputSecurityGroupRequest createInputSecurityGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInputSecurityGroupRequest, CreateInputSecurityGroupResult> asyncHandler);

    /**
     * Create a new multiplex.
     * 
     * @param createMultiplexRequest
     *        A request to create a multiplex.
     * @return A Java Future containing the result of the CreateMultiplex operation returned by the service.
     * @sample AWSMediaLiveAsync.CreateMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMultiplexResult> createMultiplexAsync(CreateMultiplexRequest createMultiplexRequest);

    /**
     * Create a new multiplex.
     * 
     * @param createMultiplexRequest
     *        A request to create a multiplex.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMultiplex operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.CreateMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMultiplexResult> createMultiplexAsync(CreateMultiplexRequest createMultiplexRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMultiplexRequest, CreateMultiplexResult> asyncHandler);

    /**
     * Create a new program in the multiplex.
     * 
     * @param createMultiplexProgramRequest
     *        A request to create a program in a multiplex.
     * @return A Java Future containing the result of the CreateMultiplexProgram operation returned by the service.
     * @sample AWSMediaLiveAsync.CreateMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMultiplexProgramResult> createMultiplexProgramAsync(CreateMultiplexProgramRequest createMultiplexProgramRequest);

    /**
     * Create a new program in the multiplex.
     * 
     * @param createMultiplexProgramRequest
     *        A request to create a program in a multiplex.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMultiplexProgram operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.CreateMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMultiplexProgramResult> createMultiplexProgramAsync(CreateMultiplexProgramRequest createMultiplexProgramRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMultiplexProgramRequest, CreateMultiplexProgramResult> asyncHandler);

    /**
     * Create a partner input
     * 
     * @param createPartnerInputRequest
     *        A request to create a partner input
     * @return A Java Future containing the result of the CreatePartnerInput operation returned by the service.
     * @sample AWSMediaLiveAsync.CreatePartnerInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreatePartnerInput" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePartnerInputResult> createPartnerInputAsync(CreatePartnerInputRequest createPartnerInputRequest);

    /**
     * Create a partner input
     * 
     * @param createPartnerInputRequest
     *        A request to create a partner input
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePartnerInput operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.CreatePartnerInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreatePartnerInput" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePartnerInputResult> createPartnerInputAsync(CreatePartnerInputRequest createPartnerInputRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePartnerInputRequest, CreatePartnerInputResult> asyncHandler);

    /**
     * Create tags for a resource
     * 
     * @param createTagsRequest
     *        Placeholder documentation for CreateTagsRequest
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AWSMediaLiveAsync.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest);

    /**
     * Create tags for a resource
     * 
     * @param createTagsRequest
     *        Placeholder documentation for CreateTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler);

    /**
     * Starts deletion of channel. The associated outputs are also deleted.
     * 
     * @param deleteChannelRequest
     *        Placeholder documentation for DeleteChannelRequest
     * @return A Java Future containing the result of the DeleteChannel operation returned by the service.
     * @sample AWSMediaLiveAsync.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest deleteChannelRequest);

    /**
     * Starts deletion of channel. The associated outputs are also deleted.
     * 
     * @param deleteChannelRequest
     *        Placeholder documentation for DeleteChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChannel operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest deleteChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelRequest, DeleteChannelResult> asyncHandler);

    /**
     * Deletes the input end point
     * 
     * @param deleteInputRequest
     *        Placeholder documentation for DeleteInputRequest
     * @return A Java Future containing the result of the DeleteInput operation returned by the service.
     * @sample AWSMediaLiveAsync.DeleteInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInputResult> deleteInputAsync(DeleteInputRequest deleteInputRequest);

    /**
     * Deletes the input end point
     * 
     * @param deleteInputRequest
     *        Placeholder documentation for DeleteInputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInput operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DeleteInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInputResult> deleteInputAsync(DeleteInputRequest deleteInputRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInputRequest, DeleteInputResult> asyncHandler);

    /**
     * Deletes an Input Security Group
     * 
     * @param deleteInputSecurityGroupRequest
     *        Placeholder documentation for DeleteInputSecurityGroupRequest
     * @return A Java Future containing the result of the DeleteInputSecurityGroup operation returned by the service.
     * @sample AWSMediaLiveAsync.DeleteInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInputSecurityGroupResult> deleteInputSecurityGroupAsync(DeleteInputSecurityGroupRequest deleteInputSecurityGroupRequest);

    /**
     * Deletes an Input Security Group
     * 
     * @param deleteInputSecurityGroupRequest
     *        Placeholder documentation for DeleteInputSecurityGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInputSecurityGroup operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DeleteInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInputSecurityGroupResult> deleteInputSecurityGroupAsync(DeleteInputSecurityGroupRequest deleteInputSecurityGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInputSecurityGroupRequest, DeleteInputSecurityGroupResult> asyncHandler);

    /**
     * Delete a multiplex. The multiplex must be idle.
     * 
     * @param deleteMultiplexRequest
     *        Placeholder documentation for DeleteMultiplexRequest
     * @return A Java Future containing the result of the DeleteMultiplex operation returned by the service.
     * @sample AWSMediaLiveAsync.DeleteMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMultiplexResult> deleteMultiplexAsync(DeleteMultiplexRequest deleteMultiplexRequest);

    /**
     * Delete a multiplex. The multiplex must be idle.
     * 
     * @param deleteMultiplexRequest
     *        Placeholder documentation for DeleteMultiplexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMultiplex operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DeleteMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMultiplexResult> deleteMultiplexAsync(DeleteMultiplexRequest deleteMultiplexRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMultiplexRequest, DeleteMultiplexResult> asyncHandler);

    /**
     * Delete a program from a multiplex.
     * 
     * @param deleteMultiplexProgramRequest
     *        Placeholder documentation for DeleteMultiplexProgramRequest
     * @return A Java Future containing the result of the DeleteMultiplexProgram operation returned by the service.
     * @sample AWSMediaLiveAsync.DeleteMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMultiplexProgramResult> deleteMultiplexProgramAsync(DeleteMultiplexProgramRequest deleteMultiplexProgramRequest);

    /**
     * Delete a program from a multiplex.
     * 
     * @param deleteMultiplexProgramRequest
     *        Placeholder documentation for DeleteMultiplexProgramRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMultiplexProgram operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DeleteMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMultiplexProgramResult> deleteMultiplexProgramAsync(DeleteMultiplexProgramRequest deleteMultiplexProgramRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMultiplexProgramRequest, DeleteMultiplexProgramResult> asyncHandler);

    /**
     * Delete an expired reservation.
     * 
     * @param deleteReservationRequest
     *        Placeholder documentation for DeleteReservationRequest
     * @return A Java Future containing the result of the DeleteReservation operation returned by the service.
     * @sample AWSMediaLiveAsync.DeleteReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteReservation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReservationResult> deleteReservationAsync(DeleteReservationRequest deleteReservationRequest);

    /**
     * Delete an expired reservation.
     * 
     * @param deleteReservationRequest
     *        Placeholder documentation for DeleteReservationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReservation operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DeleteReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteReservation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReservationResult> deleteReservationAsync(DeleteReservationRequest deleteReservationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReservationRequest, DeleteReservationResult> asyncHandler);

    /**
     * Delete all schedule actions on a channel.
     * 
     * @param deleteScheduleRequest
     *        Placeholder documentation for DeleteScheduleRequest
     * @return A Java Future containing the result of the DeleteSchedule operation returned by the service.
     * @sample AWSMediaLiveAsync.DeleteSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteScheduleResult> deleteScheduleAsync(DeleteScheduleRequest deleteScheduleRequest);

    /**
     * Delete all schedule actions on a channel.
     * 
     * @param deleteScheduleRequest
     *        Placeholder documentation for DeleteScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSchedule operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DeleteSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteScheduleResult> deleteScheduleAsync(DeleteScheduleRequest deleteScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScheduleRequest, DeleteScheduleResult> asyncHandler);

    /**
     * Removes tags for a resource
     * 
     * @param deleteTagsRequest
     *        Placeholder documentation for DeleteTagsRequest
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AWSMediaLiveAsync.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest);

    /**
     * Removes tags for a resource
     * 
     * @param deleteTagsRequest
     *        Placeholder documentation for DeleteTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler);

    /**
     * Gets details about a channel
     * 
     * @param describeChannelRequest
     *        Placeholder documentation for DescribeChannelRequest
     * @return A Java Future containing the result of the DescribeChannel operation returned by the service.
     * @sample AWSMediaLiveAsync.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(DescribeChannelRequest describeChannelRequest);

    /**
     * Gets details about a channel
     * 
     * @param describeChannelRequest
     *        Placeholder documentation for DescribeChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeChannel operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(DescribeChannelRequest describeChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChannelRequest, DescribeChannelResult> asyncHandler);

    /**
     * Produces details about an input
     * 
     * @param describeInputRequest
     *        Placeholder documentation for DescribeInputRequest
     * @return A Java Future containing the result of the DescribeInput operation returned by the service.
     * @sample AWSMediaLiveAsync.DescribeInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInputResult> describeInputAsync(DescribeInputRequest describeInputRequest);

    /**
     * Produces details about an input
     * 
     * @param describeInputRequest
     *        Placeholder documentation for DescribeInputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInput operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DescribeInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInputResult> describeInputAsync(DescribeInputRequest describeInputRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInputRequest, DescribeInputResult> asyncHandler);

    /**
     * Gets the details for the input device
     * 
     * @param describeInputDeviceRequest
     *        Placeholder documentation for DescribeInputDeviceRequest
     * @return A Java Future containing the result of the DescribeInputDevice operation returned by the service.
     * @sample AWSMediaLiveAsync.DescribeInputDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInputDeviceResult> describeInputDeviceAsync(DescribeInputDeviceRequest describeInputDeviceRequest);

    /**
     * Gets the details for the input device
     * 
     * @param describeInputDeviceRequest
     *        Placeholder documentation for DescribeInputDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInputDevice operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DescribeInputDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInputDeviceResult> describeInputDeviceAsync(DescribeInputDeviceRequest describeInputDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInputDeviceRequest, DescribeInputDeviceResult> asyncHandler);

    /**
     * Get the latest thumbnail data for the input device.
     * 
     * @param describeInputDeviceThumbnailRequest
     *        Placeholder documentation for DescribeInputDeviceThumbnailRequest
     * @return A Java Future containing the result of the DescribeInputDeviceThumbnail operation returned by the
     *         service.
     * @sample AWSMediaLiveAsync.DescribeInputDeviceThumbnail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputDeviceThumbnail"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInputDeviceThumbnailResult> describeInputDeviceThumbnailAsync(
            DescribeInputDeviceThumbnailRequest describeInputDeviceThumbnailRequest);

    /**
     * Get the latest thumbnail data for the input device.
     * 
     * @param describeInputDeviceThumbnailRequest
     *        Placeholder documentation for DescribeInputDeviceThumbnailRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInputDeviceThumbnail operation returned by the
     *         service.
     * @sample AWSMediaLiveAsyncHandler.DescribeInputDeviceThumbnail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputDeviceThumbnail"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInputDeviceThumbnailResult> describeInputDeviceThumbnailAsync(
            DescribeInputDeviceThumbnailRequest describeInputDeviceThumbnailRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInputDeviceThumbnailRequest, DescribeInputDeviceThumbnailResult> asyncHandler);

    /**
     * Produces a summary of an Input Security Group
     * 
     * @param describeInputSecurityGroupRequest
     *        Placeholder documentation for DescribeInputSecurityGroupRequest
     * @return A Java Future containing the result of the DescribeInputSecurityGroup operation returned by the service.
     * @sample AWSMediaLiveAsync.DescribeInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInputSecurityGroupResult> describeInputSecurityGroupAsync(
            DescribeInputSecurityGroupRequest describeInputSecurityGroupRequest);

    /**
     * Produces a summary of an Input Security Group
     * 
     * @param describeInputSecurityGroupRequest
     *        Placeholder documentation for DescribeInputSecurityGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInputSecurityGroup operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DescribeInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInputSecurityGroupResult> describeInputSecurityGroupAsync(
            DescribeInputSecurityGroupRequest describeInputSecurityGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInputSecurityGroupRequest, DescribeInputSecurityGroupResult> asyncHandler);

    /**
     * Gets details about a multiplex.
     * 
     * @param describeMultiplexRequest
     *        Placeholder documentation for DescribeMultiplexRequest
     * @return A Java Future containing the result of the DescribeMultiplex operation returned by the service.
     * @sample AWSMediaLiveAsync.DescribeMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeMultiplex" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMultiplexResult> describeMultiplexAsync(DescribeMultiplexRequest describeMultiplexRequest);

    /**
     * Gets details about a multiplex.
     * 
     * @param describeMultiplexRequest
     *        Placeholder documentation for DescribeMultiplexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMultiplex operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DescribeMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeMultiplex" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMultiplexResult> describeMultiplexAsync(DescribeMultiplexRequest describeMultiplexRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMultiplexRequest, DescribeMultiplexResult> asyncHandler);

    /**
     * Get the details for a program in a multiplex.
     * 
     * @param describeMultiplexProgramRequest
     *        Placeholder documentation for DescribeMultiplexProgramRequest
     * @return A Java Future containing the result of the DescribeMultiplexProgram operation returned by the service.
     * @sample AWSMediaLiveAsync.DescribeMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMultiplexProgramResult> describeMultiplexProgramAsync(DescribeMultiplexProgramRequest describeMultiplexProgramRequest);

    /**
     * Get the details for a program in a multiplex.
     * 
     * @param describeMultiplexProgramRequest
     *        Placeholder documentation for DescribeMultiplexProgramRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMultiplexProgram operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DescribeMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMultiplexProgramResult> describeMultiplexProgramAsync(DescribeMultiplexProgramRequest describeMultiplexProgramRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMultiplexProgramRequest, DescribeMultiplexProgramResult> asyncHandler);

    /**
     * Get details for an offering.
     * 
     * @param describeOfferingRequest
     *        Placeholder documentation for DescribeOfferingRequest
     * @return A Java Future containing the result of the DescribeOffering operation returned by the service.
     * @sample AWSMediaLiveAsync.DescribeOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeOffering" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeOfferingResult> describeOfferingAsync(DescribeOfferingRequest describeOfferingRequest);

    /**
     * Get details for an offering.
     * 
     * @param describeOfferingRequest
     *        Placeholder documentation for DescribeOfferingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOffering operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DescribeOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeOffering" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeOfferingResult> describeOfferingAsync(DescribeOfferingRequest describeOfferingRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOfferingRequest, DescribeOfferingResult> asyncHandler);

    /**
     * Get details for a reservation.
     * 
     * @param describeReservationRequest
     *        Placeholder documentation for DescribeReservationRequest
     * @return A Java Future containing the result of the DescribeReservation operation returned by the service.
     * @sample AWSMediaLiveAsync.DescribeReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeReservation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservationResult> describeReservationAsync(DescribeReservationRequest describeReservationRequest);

    /**
     * Get details for a reservation.
     * 
     * @param describeReservationRequest
     *        Placeholder documentation for DescribeReservationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReservation operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DescribeReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeReservation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservationResult> describeReservationAsync(DescribeReservationRequest describeReservationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservationRequest, DescribeReservationResult> asyncHandler);

    /**
     * Get a channel schedule
     * 
     * @param describeScheduleRequest
     *        Placeholder documentation for DescribeScheduleRequest
     * @return A Java Future containing the result of the DescribeSchedule operation returned by the service.
     * @sample AWSMediaLiveAsync.DescribeSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeScheduleResult> describeScheduleAsync(DescribeScheduleRequest describeScheduleRequest);

    /**
     * Get a channel schedule
     * 
     * @param describeScheduleRequest
     *        Placeholder documentation for DescribeScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSchedule operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DescribeSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeScheduleResult> describeScheduleAsync(DescribeScheduleRequest describeScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScheduleRequest, DescribeScheduleResult> asyncHandler);

    /**
     * Produces list of channels that have been created
     * 
     * @param listChannelsRequest
     *        Placeholder documentation for ListChannelsRequest
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AWSMediaLiveAsync.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest);

    /**
     * Produces list of channels that have been created
     * 
     * @param listChannelsRequest
     *        Placeholder documentation for ListChannelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelsRequest, ListChannelsResult> asyncHandler);

    /**
     * List input devices that are currently being transferred. List input devices that you are transferring from your
     * AWS account or input devices that another AWS account is transferring to you.
     * 
     * @param listInputDeviceTransfersRequest
     *        Placeholder documentation for ListInputDeviceTransfersRequest
     * @return A Java Future containing the result of the ListInputDeviceTransfers operation returned by the service.
     * @sample AWSMediaLiveAsync.ListInputDeviceTransfers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputDeviceTransfers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInputDeviceTransfersResult> listInputDeviceTransfersAsync(ListInputDeviceTransfersRequest listInputDeviceTransfersRequest);

    /**
     * List input devices that are currently being transferred. List input devices that you are transferring from your
     * AWS account or input devices that another AWS account is transferring to you.
     * 
     * @param listInputDeviceTransfersRequest
     *        Placeholder documentation for ListInputDeviceTransfersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInputDeviceTransfers operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.ListInputDeviceTransfers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputDeviceTransfers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInputDeviceTransfersResult> listInputDeviceTransfersAsync(ListInputDeviceTransfersRequest listInputDeviceTransfersRequest,
            com.amazonaws.handlers.AsyncHandler<ListInputDeviceTransfersRequest, ListInputDeviceTransfersResult> asyncHandler);

    /**
     * List input devices
     * 
     * @param listInputDevicesRequest
     *        Placeholder documentation for ListInputDevicesRequest
     * @return A Java Future containing the result of the ListInputDevices operation returned by the service.
     * @sample AWSMediaLiveAsync.ListInputDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInputDevicesResult> listInputDevicesAsync(ListInputDevicesRequest listInputDevicesRequest);

    /**
     * List input devices
     * 
     * @param listInputDevicesRequest
     *        Placeholder documentation for ListInputDevicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInputDevices operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.ListInputDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInputDevicesResult> listInputDevicesAsync(ListInputDevicesRequest listInputDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListInputDevicesRequest, ListInputDevicesResult> asyncHandler);

    /**
     * Produces a list of Input Security Groups for an account
     * 
     * @param listInputSecurityGroupsRequest
     *        Placeholder documentation for ListInputSecurityGroupsRequest
     * @return A Java Future containing the result of the ListInputSecurityGroups operation returned by the service.
     * @sample AWSMediaLiveAsync.ListInputSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInputSecurityGroupsResult> listInputSecurityGroupsAsync(ListInputSecurityGroupsRequest listInputSecurityGroupsRequest);

    /**
     * Produces a list of Input Security Groups for an account
     * 
     * @param listInputSecurityGroupsRequest
     *        Placeholder documentation for ListInputSecurityGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInputSecurityGroups operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.ListInputSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInputSecurityGroupsResult> listInputSecurityGroupsAsync(ListInputSecurityGroupsRequest listInputSecurityGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInputSecurityGroupsRequest, ListInputSecurityGroupsResult> asyncHandler);

    /**
     * Produces list of inputs that have been created
     * 
     * @param listInputsRequest
     *        Placeholder documentation for ListInputsRequest
     * @return A Java Future containing the result of the ListInputs operation returned by the service.
     * @sample AWSMediaLiveAsync.ListInputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInputsResult> listInputsAsync(ListInputsRequest listInputsRequest);

    /**
     * Produces list of inputs that have been created
     * 
     * @param listInputsRequest
     *        Placeholder documentation for ListInputsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInputs operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.ListInputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInputsResult> listInputsAsync(ListInputsRequest listInputsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInputsRequest, ListInputsResult> asyncHandler);

    /**
     * List the programs that currently exist for a specific multiplex.
     * 
     * @param listMultiplexProgramsRequest
     *        Placeholder documentation for ListMultiplexProgramsRequest
     * @return A Java Future containing the result of the ListMultiplexPrograms operation returned by the service.
     * @sample AWSMediaLiveAsync.ListMultiplexPrograms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListMultiplexPrograms"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMultiplexProgramsResult> listMultiplexProgramsAsync(ListMultiplexProgramsRequest listMultiplexProgramsRequest);

    /**
     * List the programs that currently exist for a specific multiplex.
     * 
     * @param listMultiplexProgramsRequest
     *        Placeholder documentation for ListMultiplexProgramsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMultiplexPrograms operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.ListMultiplexPrograms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListMultiplexPrograms"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMultiplexProgramsResult> listMultiplexProgramsAsync(ListMultiplexProgramsRequest listMultiplexProgramsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMultiplexProgramsRequest, ListMultiplexProgramsResult> asyncHandler);

    /**
     * Retrieve a list of the existing multiplexes.
     * 
     * @param listMultiplexesRequest
     *        Placeholder documentation for ListMultiplexesRequest
     * @return A Java Future containing the result of the ListMultiplexes operation returned by the service.
     * @sample AWSMediaLiveAsync.ListMultiplexes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListMultiplexes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMultiplexesResult> listMultiplexesAsync(ListMultiplexesRequest listMultiplexesRequest);

    /**
     * Retrieve a list of the existing multiplexes.
     * 
     * @param listMultiplexesRequest
     *        Placeholder documentation for ListMultiplexesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMultiplexes operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.ListMultiplexes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListMultiplexes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMultiplexesResult> listMultiplexesAsync(ListMultiplexesRequest listMultiplexesRequest,
            com.amazonaws.handlers.AsyncHandler<ListMultiplexesRequest, ListMultiplexesResult> asyncHandler);

    /**
     * List offerings available for purchase.
     * 
     * @param listOfferingsRequest
     *        Placeholder documentation for ListOfferingsRequest
     * @return A Java Future containing the result of the ListOfferings operation returned by the service.
     * @sample AWSMediaLiveAsync.ListOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListOfferings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOfferingsResult> listOfferingsAsync(ListOfferingsRequest listOfferingsRequest);

    /**
     * List offerings available for purchase.
     * 
     * @param listOfferingsRequest
     *        Placeholder documentation for ListOfferingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOfferings operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.ListOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListOfferings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOfferingsResult> listOfferingsAsync(ListOfferingsRequest listOfferingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOfferingsRequest, ListOfferingsResult> asyncHandler);

    /**
     * List purchased reservations.
     * 
     * @param listReservationsRequest
     *        Placeholder documentation for ListReservationsRequest
     * @return A Java Future containing the result of the ListReservations operation returned by the service.
     * @sample AWSMediaLiveAsync.ListReservations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListReservations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListReservationsResult> listReservationsAsync(ListReservationsRequest listReservationsRequest);

    /**
     * List purchased reservations.
     * 
     * @param listReservationsRequest
     *        Placeholder documentation for ListReservationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReservations operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.ListReservations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListReservations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListReservationsResult> listReservationsAsync(ListReservationsRequest listReservationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListReservationsRequest, ListReservationsResult> asyncHandler);

    /**
     * Produces list of tags that have been created for a resource
     * 
     * @param listTagsForResourceRequest
     *        Placeholder documentation for ListTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMediaLiveAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * Produces list of tags that have been created for a resource
     * 
     * @param listTagsForResourceRequest
     *        Placeholder documentation for ListTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * Purchase an offering and create a reservation.
     * 
     * @param purchaseOfferingRequest
     *        Placeholder documentation for PurchaseOfferingRequest
     * @return A Java Future containing the result of the PurchaseOffering operation returned by the service.
     * @sample AWSMediaLiveAsync.PurchaseOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/PurchaseOffering" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PurchaseOfferingResult> purchaseOfferingAsync(PurchaseOfferingRequest purchaseOfferingRequest);

    /**
     * Purchase an offering and create a reservation.
     * 
     * @param purchaseOfferingRequest
     *        Placeholder documentation for PurchaseOfferingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PurchaseOffering operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.PurchaseOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/PurchaseOffering" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PurchaseOfferingResult> purchaseOfferingAsync(PurchaseOfferingRequest purchaseOfferingRequest,
            com.amazonaws.handlers.AsyncHandler<PurchaseOfferingRequest, PurchaseOfferingResult> asyncHandler);

    /**
     * Reject the transfer of the specified input device to your AWS account.
     * 
     * @param rejectInputDeviceTransferRequest
     *        Placeholder documentation for RejectInputDeviceTransferRequest
     * @return A Java Future containing the result of the RejectInputDeviceTransfer operation returned by the service.
     * @sample AWSMediaLiveAsync.RejectInputDeviceTransfer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/RejectInputDeviceTransfer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RejectInputDeviceTransferResult> rejectInputDeviceTransferAsync(
            RejectInputDeviceTransferRequest rejectInputDeviceTransferRequest);

    /**
     * Reject the transfer of the specified input device to your AWS account.
     * 
     * @param rejectInputDeviceTransferRequest
     *        Placeholder documentation for RejectInputDeviceTransferRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RejectInputDeviceTransfer operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.RejectInputDeviceTransfer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/RejectInputDeviceTransfer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RejectInputDeviceTransferResult> rejectInputDeviceTransferAsync(
            RejectInputDeviceTransferRequest rejectInputDeviceTransferRequest,
            com.amazonaws.handlers.AsyncHandler<RejectInputDeviceTransferRequest, RejectInputDeviceTransferResult> asyncHandler);

    /**
     * Starts an existing channel
     * 
     * @param startChannelRequest
     *        Placeholder documentation for StartChannelRequest
     * @return A Java Future containing the result of the StartChannel operation returned by the service.
     * @sample AWSMediaLiveAsync.StartChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartChannelResult> startChannelAsync(StartChannelRequest startChannelRequest);

    /**
     * Starts an existing channel
     * 
     * @param startChannelRequest
     *        Placeholder documentation for StartChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartChannel operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.StartChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartChannelResult> startChannelAsync(StartChannelRequest startChannelRequest,
            com.amazonaws.handlers.AsyncHandler<StartChannelRequest, StartChannelResult> asyncHandler);

    /**
     * Start (run) the multiplex. Starting the multiplex does not start the channels. You must explicitly start each
     * channel.
     * 
     * @param startMultiplexRequest
     *        Placeholder documentation for StartMultiplexRequest
     * @return A Java Future containing the result of the StartMultiplex operation returned by the service.
     * @sample AWSMediaLiveAsync.StartMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartMultiplexResult> startMultiplexAsync(StartMultiplexRequest startMultiplexRequest);

    /**
     * Start (run) the multiplex. Starting the multiplex does not start the channels. You must explicitly start each
     * channel.
     * 
     * @param startMultiplexRequest
     *        Placeholder documentation for StartMultiplexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMultiplex operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.StartMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartMultiplexResult> startMultiplexAsync(StartMultiplexRequest startMultiplexRequest,
            com.amazonaws.handlers.AsyncHandler<StartMultiplexRequest, StartMultiplexResult> asyncHandler);

    /**
     * Stops a running channel
     * 
     * @param stopChannelRequest
     *        Placeholder documentation for StopChannelRequest
     * @return A Java Future containing the result of the StopChannel operation returned by the service.
     * @sample AWSMediaLiveAsync.StopChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StopChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopChannelResult> stopChannelAsync(StopChannelRequest stopChannelRequest);

    /**
     * Stops a running channel
     * 
     * @param stopChannelRequest
     *        Placeholder documentation for StopChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopChannel operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.StopChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StopChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopChannelResult> stopChannelAsync(StopChannelRequest stopChannelRequest,
            com.amazonaws.handlers.AsyncHandler<StopChannelRequest, StopChannelResult> asyncHandler);

    /**
     * Stops a running multiplex. If the multiplex isn't running, this action has no effect.
     * 
     * @param stopMultiplexRequest
     *        Placeholder documentation for StopMultiplexRequest
     * @return A Java Future containing the result of the StopMultiplex operation returned by the service.
     * @sample AWSMediaLiveAsync.StopMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StopMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopMultiplexResult> stopMultiplexAsync(StopMultiplexRequest stopMultiplexRequest);

    /**
     * Stops a running multiplex. If the multiplex isn't running, this action has no effect.
     * 
     * @param stopMultiplexRequest
     *        Placeholder documentation for StopMultiplexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopMultiplex operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.StopMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StopMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopMultiplexResult> stopMultiplexAsync(StopMultiplexRequest stopMultiplexRequest,
            com.amazonaws.handlers.AsyncHandler<StopMultiplexRequest, StopMultiplexResult> asyncHandler);

    /**
     * Start an input device transfer to another AWS account. After you make the request, the other account must accept
     * or reject the transfer.
     * 
     * @param transferInputDeviceRequest
     *        A request to transfer an input device.
     * @return A Java Future containing the result of the TransferInputDevice operation returned by the service.
     * @sample AWSMediaLiveAsync.TransferInputDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/TransferInputDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TransferInputDeviceResult> transferInputDeviceAsync(TransferInputDeviceRequest transferInputDeviceRequest);

    /**
     * Start an input device transfer to another AWS account. After you make the request, the other account must accept
     * or reject the transfer.
     * 
     * @param transferInputDeviceRequest
     *        A request to transfer an input device.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TransferInputDevice operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.TransferInputDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/TransferInputDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TransferInputDeviceResult> transferInputDeviceAsync(TransferInputDeviceRequest transferInputDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<TransferInputDeviceRequest, TransferInputDeviceResult> asyncHandler);

    /**
     * Updates a channel.
     * 
     * @param updateChannelRequest
     *        A request to update a channel.
     * @return A Java Future containing the result of the UpdateChannel operation returned by the service.
     * @sample AWSMediaLiveAsync.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest updateChannelRequest);

    /**
     * Updates a channel.
     * 
     * @param updateChannelRequest
     *        A request to update a channel.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateChannel operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest updateChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChannelRequest, UpdateChannelResult> asyncHandler);

    /**
     * Changes the class of the channel.
     * 
     * @param updateChannelClassRequest
     *        Channel class that the channel should be updated to.
     * @return A Java Future containing the result of the UpdateChannelClass operation returned by the service.
     * @sample AWSMediaLiveAsync.UpdateChannelClass
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateChannelClass" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelClassResult> updateChannelClassAsync(UpdateChannelClassRequest updateChannelClassRequest);

    /**
     * Changes the class of the channel.
     * 
     * @param updateChannelClassRequest
     *        Channel class that the channel should be updated to.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateChannelClass operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.UpdateChannelClass
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateChannelClass" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelClassResult> updateChannelClassAsync(UpdateChannelClassRequest updateChannelClassRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChannelClassRequest, UpdateChannelClassResult> asyncHandler);

    /**
     * Updates an input.
     * 
     * @param updateInputRequest
     *        A request to update an input.
     * @return A Java Future containing the result of the UpdateInput operation returned by the service.
     * @sample AWSMediaLiveAsync.UpdateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateInputResult> updateInputAsync(UpdateInputRequest updateInputRequest);

    /**
     * Updates an input.
     * 
     * @param updateInputRequest
     *        A request to update an input.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateInput operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.UpdateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateInputResult> updateInputAsync(UpdateInputRequest updateInputRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateInputRequest, UpdateInputResult> asyncHandler);

    /**
     * Updates the parameters for the input device.
     * 
     * @param updateInputDeviceRequest
     *        A request to update an input device.
     * @return A Java Future containing the result of the UpdateInputDevice operation returned by the service.
     * @sample AWSMediaLiveAsync.UpdateInputDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateInputDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateInputDeviceResult> updateInputDeviceAsync(UpdateInputDeviceRequest updateInputDeviceRequest);

    /**
     * Updates the parameters for the input device.
     * 
     * @param updateInputDeviceRequest
     *        A request to update an input device.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateInputDevice operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.UpdateInputDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateInputDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateInputDeviceResult> updateInputDeviceAsync(UpdateInputDeviceRequest updateInputDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateInputDeviceRequest, UpdateInputDeviceResult> asyncHandler);

    /**
     * Update an Input Security Group's Whilelists.
     * 
     * @param updateInputSecurityGroupRequest
     *        The request to update some combination of the Input Security Group name and the IPv4 CIDRs the Input
     *        Security Group should allow.
     * @return A Java Future containing the result of the UpdateInputSecurityGroup operation returned by the service.
     * @sample AWSMediaLiveAsync.UpdateInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateInputSecurityGroupResult> updateInputSecurityGroupAsync(UpdateInputSecurityGroupRequest updateInputSecurityGroupRequest);

    /**
     * Update an Input Security Group's Whilelists.
     * 
     * @param updateInputSecurityGroupRequest
     *        The request to update some combination of the Input Security Group name and the IPv4 CIDRs the Input
     *        Security Group should allow.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateInputSecurityGroup operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.UpdateInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateInputSecurityGroupResult> updateInputSecurityGroupAsync(UpdateInputSecurityGroupRequest updateInputSecurityGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateInputSecurityGroupRequest, UpdateInputSecurityGroupResult> asyncHandler);

    /**
     * Updates a multiplex.
     * 
     * @param updateMultiplexRequest
     *        A request to update a multiplex.
     * @return A Java Future containing the result of the UpdateMultiplex operation returned by the service.
     * @sample AWSMediaLiveAsync.UpdateMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateMultiplexResult> updateMultiplexAsync(UpdateMultiplexRequest updateMultiplexRequest);

    /**
     * Updates a multiplex.
     * 
     * @param updateMultiplexRequest
     *        A request to update a multiplex.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMultiplex operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.UpdateMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateMultiplexResult> updateMultiplexAsync(UpdateMultiplexRequest updateMultiplexRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMultiplexRequest, UpdateMultiplexResult> asyncHandler);

    /**
     * Update a program in a multiplex.
     * 
     * @param updateMultiplexProgramRequest
     *        A request to update a program in a multiplex.
     * @return A Java Future containing the result of the UpdateMultiplexProgram operation returned by the service.
     * @sample AWSMediaLiveAsync.UpdateMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMultiplexProgramResult> updateMultiplexProgramAsync(UpdateMultiplexProgramRequest updateMultiplexProgramRequest);

    /**
     * Update a program in a multiplex.
     * 
     * @param updateMultiplexProgramRequest
     *        A request to update a program in a multiplex.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMultiplexProgram operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.UpdateMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMultiplexProgramResult> updateMultiplexProgramAsync(UpdateMultiplexProgramRequest updateMultiplexProgramRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMultiplexProgramRequest, UpdateMultiplexProgramResult> asyncHandler);

    /**
     * Update reservation.
     * 
     * @param updateReservationRequest
     *        Request to update a reservation
     * @return A Java Future containing the result of the UpdateReservation operation returned by the service.
     * @sample AWSMediaLiveAsync.UpdateReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateReservation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReservationResult> updateReservationAsync(UpdateReservationRequest updateReservationRequest);

    /**
     * Update reservation.
     * 
     * @param updateReservationRequest
     *        Request to update a reservation
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateReservation operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.UpdateReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateReservation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReservationResult> updateReservationAsync(UpdateReservationRequest updateReservationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateReservationRequest, UpdateReservationResult> asyncHandler);

}
