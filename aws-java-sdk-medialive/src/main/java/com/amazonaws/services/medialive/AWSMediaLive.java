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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.services.medialive.waiters.AWSMediaLiveWaiters;

/**
 * Interface for accessing MediaLive.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.medialive.AbstractAWSMediaLive} instead.
 * </p>
 * <p>
 * API for AWS Elemental MediaLive
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaLive {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "medialive";

    /**
     * Accept an incoming input device transfer. The ownership of the device will transfer to your AWS account.
     * 
     * @param acceptInputDeviceTransferRequest
     *        Placeholder documentation for AcceptInputDeviceTransferRequest
     * @return Result of the AcceptInputDeviceTransfer operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Transfer operation failed, input could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to accept input device transfers.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Input device not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on transfer device calls to the input device service.
     * @throws ConflictException
     *         Input device transfer could not be accepted.
     * @sample AWSMediaLive.AcceptInputDeviceTransfer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AcceptInputDeviceTransfer"
     *      target="_top">AWS API Documentation</a>
     */
    AcceptInputDeviceTransferResult acceptInputDeviceTransfer(AcceptInputDeviceTransferRequest acceptInputDeviceTransferRequest);

    /**
     * Starts delete of resources.
     * 
     * @param batchDeleteRequest
     *        A request to delete resources
     * @return Result of the BatchDelete operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to delete the resources.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The resources you're requesting to delete do not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete resources calls.
     * @throws ConflictException
     *         The resources are unable to delete.
     * @sample AWSMediaLive.BatchDelete
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchDelete" target="_top">AWS API
     *      Documentation</a>
     */
    BatchDeleteResult batchDelete(BatchDeleteRequest batchDeleteRequest);

    /**
     * Starts existing resources
     * 
     * @param batchStartRequest
     *        A request to start resources
     * @return Result of the BatchStart operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to start the resources.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The resources you're requesting to start do not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on start resources calls to resource service.
     * @throws ConflictException
     *         The resources are unable to start.
     * @sample AWSMediaLive.BatchStart
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchStart" target="_top">AWS API
     *      Documentation</a>
     */
    BatchStartResult batchStart(BatchStartRequest batchStartRequest);

    /**
     * Stops running resources
     * 
     * @param batchStopRequest
     *        A request to stop resources
     * @return Result of the BatchStop operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to stop the resources.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The resources you're requesting to stop do not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on stop resources.
     * @throws ConflictException
     *         The resources are unable to stop.
     * @sample AWSMediaLive.BatchStop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchStop" target="_top">AWS API
     *      Documentation</a>
     */
    BatchStopResult batchStop(BatchStopRequest batchStopRequest);

    /**
     * Update a channel schedule
     * 
     * @param batchUpdateScheduleRequest
     *        List of actions to create and list of actions to delete.
     * @return Result of the BatchUpdateSchedule operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         The update schedule request failed validation.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to update the channel schedule.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The specified channel id does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on update schedule calls.
     * @sample AWSMediaLive.BatchUpdateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchUpdateSchedule" target="_top">AWS
     *      API Documentation</a>
     */
    BatchUpdateScheduleResult batchUpdateSchedule(BatchUpdateScheduleRequest batchUpdateScheduleRequest);

    /**
     * Cancel an input device transfer that you have requested.
     * 
     * @param cancelInputDeviceTransferRequest
     *        Placeholder documentation for CancelInputDeviceTransferRequest
     * @return Result of the CancelInputDeviceTransfer operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Transfer operation failed, input could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to cancel input device transfers.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Input device not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on transfer device calls to the input device service.
     * @throws ConflictException
     *         Input device transfer could not be canceled.
     * @sample AWSMediaLive.CancelInputDeviceTransfer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CancelInputDeviceTransfer"
     *      target="_top">AWS API Documentation</a>
     */
    CancelInputDeviceTransferResult cancelInputDeviceTransfer(CancelInputDeviceTransferRequest cancelInputDeviceTransferRequest);

    /**
     * Creates a new channel
     * 
     * @param createChannelRequest
     *        A request to create a channel
     * @return Result of the CreateChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         The Channel failed validation and could not be created.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to create the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on create channel calls to channel service.
     * @throws ConflictException
     *         The channel is unable to create due to an issue with channel resources.
     * @sample AWSMediaLive.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    CreateChannelResult createChannel(CreateChannelRequest createChannelRequest);

    /**
     * Create an input
     * 
     * @param createInputRequest
     *        The name of the input
     * @return Result of the CreateInput operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit exceeded
     * @sample AWSMediaLive.CreateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateInput" target="_top">AWS API
     *      Documentation</a>
     */
    CreateInputResult createInput(CreateInputRequest createInputRequest);

    /**
     * Creates a Input Security Group
     * 
     * @param createInputSecurityGroupRequest
     *        The IPv4 CIDRs to whitelist for this Input Security Group
     * @return Result of the CreateInputSecurityGroup operation returned by the service.
     * @throws BadRequestException
     *         The request to create an Input Security Group was Invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to create an Input Security Group
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit Exceeded Error
     * @sample AWSMediaLive.CreateInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateInputSecurityGroupResult createInputSecurityGroup(CreateInputSecurityGroupRequest createInputSecurityGroupRequest);

    /**
     * Create a new multiplex.
     * 
     * @param createMultiplexRequest
     *        A request to create a multiplex.
     * @return Result of the CreateMultiplex operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws UnprocessableEntityException
     *         The Multiplex failed validation and could not be created.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to create the multiplex.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on create multiplex calls to multiplex service.
     * @throws ConflictException
     *         The multiplex is unable to create due to an issue with multiplex resources.
     * @sample AWSMediaLive.CreateMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    CreateMultiplexResult createMultiplex(CreateMultiplexRequest createMultiplexRequest);

    /**
     * Create a new program in the multiplex.
     * 
     * @param createMultiplexProgramRequest
     *        A request to create a program in a multiplex.
     * @return Result of the CreateMultiplexProgram operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws UnprocessableEntityException
     *         The Multiplex program failed validation and could not be created.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to create a program.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on create multiplex program calls to multiplex service.
     * @throws ConflictException
     *         The multiplex program is unable to create due to an issue with multiplex resources.
     * @sample AWSMediaLive.CreateMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMultiplexProgramResult createMultiplexProgram(CreateMultiplexProgramRequest createMultiplexProgramRequest);

    /**
     * Create a partner input
     * 
     * @param createPartnerInputRequest
     *        A request to create a partner input
     * @return Result of the CreatePartnerInput operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit exceeded
     * @sample AWSMediaLive.CreatePartnerInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreatePartnerInput" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePartnerInputResult createPartnerInput(CreatePartnerInputRequest createPartnerInputRequest);

    /**
     * Create tags for a resource
     * 
     * @param createTagsRequest
     *        Placeholder documentation for CreateTagsRequest
     * @return Result of the CreateTags operation returned by the service.
     * @throws NotFoundException
     *         The arn was not found.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @sample AWSMediaLive.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTagsResult createTags(CreateTagsRequest createTagsRequest);

    /**
     * Starts deletion of channel. The associated outputs are also deleted.
     * 
     * @param deleteChannelRequest
     *        Placeholder documentation for DeleteChannelRequest
     * @return Result of the DeleteChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to delete the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting to delete does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete channel calls to channel service.
     * @throws ConflictException
     *         The channel is unable to delete due to an issue with channel resources.
     * @sample AWSMediaLive.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteChannelResult deleteChannel(DeleteChannelRequest deleteChannelRequest);

    /**
     * Deletes the input end point
     * 
     * @param deleteInputRequest
     *        Placeholder documentation for DeleteInputRequest
     * @return Result of the DeleteInput operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         Input not found
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit exceeded
     * @throws ConflictException
     *         Resource conflict
     * @sample AWSMediaLive.DeleteInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteInput" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteInputResult deleteInput(DeleteInputRequest deleteInputRequest);

    /**
     * Deletes an Input Security Group
     * 
     * @param deleteInputSecurityGroupRequest
     *        Placeholder documentation for DeleteInputSecurityGroupRequest
     * @return Result of the DeleteInputSecurityGroup operation returned by the service.
     * @throws BadRequestException
     *         The request to delete the Input Security Group was Invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to delete this Input Security Group
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         Input Security Group not found
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit Exceeded Error
     * @sample AWSMediaLive.DeleteInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteInputSecurityGroupResult deleteInputSecurityGroup(DeleteInputSecurityGroupRequest deleteInputSecurityGroupRequest);

    /**
     * Delete a multiplex. The multiplex must be idle.
     * 
     * @param deleteMultiplexRequest
     *        Placeholder documentation for DeleteMultiplexRequest
     * @return Result of the DeleteMultiplex operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to delete the multiplex.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The multiplex that you are trying to delete doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete multiplex calls to multiplex service.
     * @throws ConflictException
     *         The multiplex is unable to delete due to an issue with multiplex resources.
     * @sample AWSMediaLive.DeleteMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteMultiplexResult deleteMultiplex(DeleteMultiplexRequest deleteMultiplexRequest);

    /**
     * Delete a program from a multiplex.
     * 
     * @param deleteMultiplexProgramRequest
     *        Placeholder documentation for DeleteMultiplexProgramRequest
     * @return Result of the DeleteMultiplexProgram operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to delete the multiplex program.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The program that you are trying to delete doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete multiplex program calls to multiplex service.
     * @throws ConflictException
     *         The multiplex program is unable to delete due to an issue with multiplex resources.
     * @sample AWSMediaLive.DeleteMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMultiplexProgramResult deleteMultiplexProgram(DeleteMultiplexProgramRequest deleteMultiplexProgramRequest);

    /**
     * Delete an expired reservation.
     * 
     * @param deleteReservationRequest
     *        Placeholder documentation for DeleteReservationRequest
     * @return Result of the DeleteReservation operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to delete reservation
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Reservation you're attempting to delete does not exist
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete reservation request
     * @throws ConflictException
     *         The reservation could not be deleted because it is currently active.
     * @sample AWSMediaLive.DeleteReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteReservation" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteReservationResult deleteReservation(DeleteReservationRequest deleteReservationRequest);

    /**
     * Delete all schedule actions on a channel.
     * 
     * @param deleteScheduleRequest
     *        Placeholder documentation for DeleteScheduleRequest
     * @return Result of the DeleteSchedule operation returned by the service.
     * @throws BadRequestException
     *         This request to delete the schedule on this channel was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to delete the channel schedule.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The specified channel does not exist to have its schedule deleted.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on delete schedule calls.
     * @sample AWSMediaLive.DeleteSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteScheduleResult deleteSchedule(DeleteScheduleRequest deleteScheduleRequest);

    /**
     * Removes tags for a resource
     * 
     * @param deleteTagsRequest
     *        Placeholder documentation for DeleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @throws NotFoundException
     *         The arn was not found.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @sample AWSMediaLive.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTagsResult deleteTags(DeleteTagsRequest deleteTagsRequest);

    /**
     * Gets details about a channel
     * 
     * @param describeChannelRequest
     *        Placeholder documentation for DescribeChannelRequest
     * @return Result of the DescribeChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to describe the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting to describe does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe channel calls to channel service.
     * @sample AWSMediaLive.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeChannel" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeChannelResult describeChannel(DescribeChannelRequest describeChannelRequest);

    /**
     * Produces details about an input
     * 
     * @param describeInputRequest
     *        Placeholder documentation for DescribeInputRequest
     * @return Result of the DescribeInput operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         Input not found
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit exceeded
     * @sample AWSMediaLive.DescribeInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInput" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeInputResult describeInput(DescribeInputRequest describeInputRequest);

    /**
     * Gets the details for the input device
     * 
     * @param describeInputDeviceRequest
     *        Placeholder documentation for DescribeInputDeviceRequest
     * @return Result of the DescribeInputDevice operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to describe the input device.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         The input device you're requesting to describe does not exist. Check the ID.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe calls to the input device service.
     * @sample AWSMediaLive.DescribeInputDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputDevice" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeInputDeviceResult describeInputDevice(DescribeInputDeviceRequest describeInputDeviceRequest);

    /**
     * Get the latest thumbnail data for the input device.
     * 
     * @param describeInputDeviceThumbnailRequest
     *        Placeholder documentation for DescribeInputDeviceThumbnailRequest
     * @return Result of the DescribeInputDeviceThumbnail operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to describe input device thumbnail.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Input device not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on get thumbnail calls to the input device service.
     * @sample AWSMediaLive.DescribeInputDeviceThumbnail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputDeviceThumbnail"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInputDeviceThumbnailResult describeInputDeviceThumbnail(DescribeInputDeviceThumbnailRequest describeInputDeviceThumbnailRequest);

    /**
     * Produces a summary of an Input Security Group
     * 
     * @param describeInputSecurityGroupRequest
     *        Placeholder documentation for DescribeInputSecurityGroupRequest
     * @return Result of the DescribeInputSecurityGroup operation returned by the service.
     * @throws BadRequestException
     *         The request to describe an Input Security Group was Invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to describe this Input Security Group
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         Input Security Group not found
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit Exceeded Error
     * @sample AWSMediaLive.DescribeInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInputSecurityGroupResult describeInputSecurityGroup(DescribeInputSecurityGroupRequest describeInputSecurityGroupRequest);

    /**
     * Gets details about a multiplex.
     * 
     * @param describeMultiplexRequest
     *        Placeholder documentation for DescribeMultiplexRequest
     * @return Result of the DescribeMultiplex operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to describe the multiplex.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The multiplex that you are trying to describe doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe multiplex calls to multiplex service.
     * @sample AWSMediaLive.DescribeMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeMultiplex" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeMultiplexResult describeMultiplex(DescribeMultiplexRequest describeMultiplexRequest);

    /**
     * Get the details for a program in a multiplex.
     * 
     * @param describeMultiplexProgramRequest
     *        Placeholder documentation for DescribeMultiplexProgramRequest
     * @return Result of the DescribeMultiplexProgram operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to describe the multiplex program.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         MediaLive can't describe the program. The multiplex or the program that you specified doesn’t exist.
     *         Check the IDs and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe multiplex program calls to multiplex service.
     * @sample AWSMediaLive.DescribeMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMultiplexProgramResult describeMultiplexProgram(DescribeMultiplexProgramRequest describeMultiplexProgramRequest);

    /**
     * Get details for an offering.
     * 
     * @param describeOfferingRequest
     *        Placeholder documentation for DescribeOfferingRequest
     * @return Result of the DescribeOffering operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to describe offering
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Offering you're attempting to describe does not exist
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe offering request
     * @sample AWSMediaLive.DescribeOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeOffering" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeOfferingResult describeOffering(DescribeOfferingRequest describeOfferingRequest);

    /**
     * Get details for a reservation.
     * 
     * @param describeReservationRequest
     *        Placeholder documentation for DescribeReservationRequest
     * @return Result of the DescribeReservation operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to describe reservation
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Reservation you're attempting to describe does not exist
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe reservation request
     * @sample AWSMediaLive.DescribeReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeReservation" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeReservationResult describeReservation(DescribeReservationRequest describeReservationRequest);

    /**
     * Get a channel schedule
     * 
     * @param describeScheduleRequest
     *        Placeholder documentation for DescribeScheduleRequest
     * @return Result of the DescribeSchedule operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to describe the channel schedule.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting a schedule describe for does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on describe schedule calls.
     * @sample AWSMediaLive.DescribeSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeScheduleResult describeSchedule(DescribeScheduleRequest describeScheduleRequest);

    /**
     * Produces list of channels that have been created
     * 
     * @param listChannelsRequest
     *        Placeholder documentation for ListChannelsRequest
     * @return Result of the ListChannels operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to list channels.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on list channel calls to channel service.
     * @sample AWSMediaLive.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    ListChannelsResult listChannels(ListChannelsRequest listChannelsRequest);

    /**
     * List input devices that are currently being transferred. List input devices that you are transferring from your
     * AWS account or input devices that another AWS account is transferring to you.
     * 
     * @param listInputDeviceTransfersRequest
     *        Placeholder documentation for ListInputDeviceTransfersRequest
     * @return Result of the ListInputDeviceTransfers operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Transfer operation failed, input could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to list transferring devices.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on list devices calls to the input device service.
     * @sample AWSMediaLive.ListInputDeviceTransfers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputDeviceTransfers"
     *      target="_top">AWS API Documentation</a>
     */
    ListInputDeviceTransfersResult listInputDeviceTransfers(ListInputDeviceTransfersRequest listInputDeviceTransfersRequest);

    /**
     * List input devices
     * 
     * @param listInputDevicesRequest
     *        Placeholder documentation for ListInputDevicesRequest
     * @return Result of the ListInputDevices operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to list input devices.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on list devices calls to the input device service.
     * @sample AWSMediaLive.ListInputDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputDevices" target="_top">AWS API
     *      Documentation</a>
     */
    ListInputDevicesResult listInputDevices(ListInputDevicesRequest listInputDevicesRequest);

    /**
     * Produces a list of Input Security Groups for an account
     * 
     * @param listInputSecurityGroupsRequest
     *        Placeholder documentation for ListInputSecurityGroupsRequest
     * @return Result of the ListInputSecurityGroups operation returned by the service.
     * @throws BadRequestException
     *         The request to list Input Security Groups was invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to call ListInputSecurityGroups
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit Exceeded Error
     * @sample AWSMediaLive.ListInputSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListInputSecurityGroupsResult listInputSecurityGroups(ListInputSecurityGroupsRequest listInputSecurityGroupsRequest);

    /**
     * Produces list of inputs that have been created
     * 
     * @param listInputsRequest
     *        Placeholder documentation for ListInputsRequest
     * @return Result of the ListInputs operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Limit exceeded
     * @sample AWSMediaLive.ListInputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputs" target="_top">AWS API
     *      Documentation</a>
     */
    ListInputsResult listInputs(ListInputsRequest listInputsRequest);

    /**
     * List the programs that currently exist for a specific multiplex.
     * 
     * @param listMultiplexProgramsRequest
     *        Placeholder documentation for ListMultiplexProgramsRequest
     * @return Result of the ListMultiplexPrograms operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to list multiplex programs.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         MediaLive can't provide the list of programs. The multiplex that you specified doesn’t exist. Check the
     *         ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on list multiplex calls to multiplex service.
     * @sample AWSMediaLive.ListMultiplexPrograms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListMultiplexPrograms"
     *      target="_top">AWS API Documentation</a>
     */
    ListMultiplexProgramsResult listMultiplexPrograms(ListMultiplexProgramsRequest listMultiplexProgramsRequest);

    /**
     * Retrieve a list of the existing multiplexes.
     * 
     * @param listMultiplexesRequest
     *        Placeholder documentation for ListMultiplexesRequest
     * @return Result of the ListMultiplexes operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to list multiplexes.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on list multiplex calls to multiplex service.
     * @sample AWSMediaLive.ListMultiplexes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListMultiplexes" target="_top">AWS API
     *      Documentation</a>
     */
    ListMultiplexesResult listMultiplexes(ListMultiplexesRequest listMultiplexesRequest);

    /**
     * List offerings available for purchase.
     * 
     * @param listOfferingsRequest
     *        Placeholder documentation for ListOfferingsRequest
     * @return Result of the ListOfferings operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to list offerings
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on list offerings request
     * @sample AWSMediaLive.ListOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListOfferings" target="_top">AWS API
     *      Documentation</a>
     */
    ListOfferingsResult listOfferings(ListOfferingsRequest listOfferingsRequest);

    /**
     * List purchased reservations.
     * 
     * @param listReservationsRequest
     *        Placeholder documentation for ListReservationsRequest
     * @return Result of the ListReservations operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to list reservations
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on list reservations request
     * @sample AWSMediaLive.ListReservations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListReservations" target="_top">AWS API
     *      Documentation</a>
     */
    ListReservationsResult listReservations(ListReservationsRequest listReservationsRequest);

    /**
     * Produces list of tags that have been created for a resource
     * 
     * @param listTagsForResourceRequest
     *        Placeholder documentation for ListTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws NotFoundException
     *         The arn was not found
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         Access was denied
     * @sample AWSMediaLive.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * Purchase an offering and create a reservation.
     * 
     * @param purchaseOfferingRequest
     *        Placeholder documentation for PurchaseOfferingRequest
     * @return Result of the PurchaseOffering operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to purchase the offering
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Offering you're attempting to purchase does not exist
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on purchase offering request
     * @throws ConflictException
     *         Offering purchase prevented by service resource issue
     * @sample AWSMediaLive.PurchaseOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/PurchaseOffering" target="_top">AWS API
     *      Documentation</a>
     */
    PurchaseOfferingResult purchaseOffering(PurchaseOfferingRequest purchaseOfferingRequest);

    /**
     * Reject the transfer of the specified input device to your AWS account.
     * 
     * @param rejectInputDeviceTransferRequest
     *        Placeholder documentation for RejectInputDeviceTransferRequest
     * @return Result of the RejectInputDeviceTransfer operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Transfer operation failed, input could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to reject input device transfers.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Input device not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on transfer device calls to the input device service.
     * @throws ConflictException
     *         Input device transfer could not be rejected.
     * @sample AWSMediaLive.RejectInputDeviceTransfer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/RejectInputDeviceTransfer"
     *      target="_top">AWS API Documentation</a>
     */
    RejectInputDeviceTransferResult rejectInputDeviceTransfer(RejectInputDeviceTransferRequest rejectInputDeviceTransferRequest);

    /**
     * Starts an existing channel
     * 
     * @param startChannelRequest
     *        Placeholder documentation for StartChannelRequest
     * @return Result of the StartChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to start the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting to start does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on start channel calls to channel service.
     * @throws ConflictException
     *         The channel is unable to start due to an issue with channel resources.
     * @sample AWSMediaLive.StartChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartChannel" target="_top">AWS API
     *      Documentation</a>
     */
    StartChannelResult startChannel(StartChannelRequest startChannelRequest);

    /**
     * Start (run) the multiplex. Starting the multiplex does not start the channels. You must explicitly start each
     * channel.
     * 
     * @param startMultiplexRequest
     *        Placeholder documentation for StartMultiplexRequest
     * @return Result of the StartMultiplex operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to start the multiplex.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The multiplex that you are trying to start doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on start multiplex calls to multiplex service.
     * @throws ConflictException
     *         The multiplex is unable to start due to an issue with multiplex resources.
     * @sample AWSMediaLive.StartMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    StartMultiplexResult startMultiplex(StartMultiplexRequest startMultiplexRequest);

    /**
     * Stops a running channel
     * 
     * @param stopChannelRequest
     *        Placeholder documentation for StopChannelRequest
     * @return Result of the StopChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to stop the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're requesting to stop does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on stop channel calls to channel service.
     * @throws ConflictException
     *         The channel is unable to stop due to an issue with channel resources.
     * @sample AWSMediaLive.StopChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StopChannel" target="_top">AWS API
     *      Documentation</a>
     */
    StopChannelResult stopChannel(StopChannelRequest stopChannelRequest);

    /**
     * Stops a running multiplex. If the multiplex isn't running, this action has no effect.
     * 
     * @param stopMultiplexRequest
     *        Placeholder documentation for StopMultiplexRequest
     * @return Result of the StopMultiplex operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to stop the multiplex.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The multiplex that you are trying to stop doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on stop multiplex calls to multiplex service.
     * @throws ConflictException
     *         The multiplex is unable to stop due to an issue with multiplex resources.
     * @sample AWSMediaLive.StopMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StopMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    StopMultiplexResult stopMultiplex(StopMultiplexRequest stopMultiplexRequest);

    /**
     * Start an input device transfer to another AWS account. After you make the request, the other account must accept
     * or reject the transfer.
     * 
     * @param transferInputDeviceRequest
     *        A request to transfer an input device.
     * @return Result of the TransferInputDevice operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Transfer operation failed, input could not be validated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to transfer input devices.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         Input device not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on transfer device calls to the input device service.
     * @throws ConflictException
     *         Input device could not be transferred.
     * @sample AWSMediaLive.TransferInputDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/TransferInputDevice" target="_top">AWS
     *      API Documentation</a>
     */
    TransferInputDeviceResult transferInputDevice(TransferInputDeviceRequest transferInputDeviceRequest);

    /**
     * Updates a channel.
     * 
     * @param updateChannelRequest
     *        A request to update a channel.
     * @return Result of the UpdateChannel operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         The channel configuration failed validation and could not be updated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to update the channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws ConflictException
     *         The channel is unable to update due to an issue with channel resources.
     * @sample AWSMediaLive.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateChannelResult updateChannel(UpdateChannelRequest updateChannelRequest);

    /**
     * Changes the class of the channel.
     * 
     * @param updateChannelClassRequest
     *        Channel class that the channel should be updated to.
     * @return Result of the UpdateChannelClass operation returned by the service.
     * @throws BadRequestException
     *         This request to update the channel class was invalid.
     * @throws UnprocessableEntityException
     *         The channel configuration failed validation when attempting to update the channel class.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to update the class of this channel.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The channel you're trying to update the class on does not exist.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on update channel class calls.
     * @throws ConflictException
     *         The channel class cannot be updated due to an issue with channel resources.
     * @sample AWSMediaLive.UpdateChannelClass
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateChannelClass" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateChannelClassResult updateChannelClass(UpdateChannelClassRequest updateChannelClassRequest);

    /**
     * Updates an input.
     * 
     * @param updateInputRequest
     *        A request to update an input.
     * @return Result of the UpdateInput operation returned by the service.
     * @throws BadRequestException
     *         This request to update the input was invalid.
     * @throws InternalServerErrorException
     *         Internal Service Error
     * @throws ForbiddenException
     *         The requester does not have permission to update an input.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The input was not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws ConflictException
     *         The input was unable to be updated at this time due to an issue with input resources.
     * @sample AWSMediaLive.UpdateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateInput" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateInputResult updateInput(UpdateInputRequest updateInputRequest);

    /**
     * Updates the parameters for the input device.
     * 
     * @param updateInputDeviceRequest
     *        A request to update an input device.
     * @return Result of the UpdateInputDevice operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid.
     * @throws UnprocessableEntityException
     *         Input device failed validation and could not be created.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You do not have permission to update the input device.
     * @throws BadGatewayException
     *         Bad gateway error.
     * @throws NotFoundException
     *         The input device you're requesting to does not exist. Check the ID.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded on update calls to the input device service.
     * @sample AWSMediaLive.UpdateInputDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateInputDevice" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateInputDeviceResult updateInputDevice(UpdateInputDeviceRequest updateInputDeviceRequest);

    /**
     * Update an Input Security Group's Whilelists.
     * 
     * @param updateInputSecurityGroupRequest
     *        The request to update some combination of the Input Security Group name and the IPv4 CIDRs the Input
     *        Security Group should allow.
     * @return Result of the UpdateInputSecurityGroup operation returned by the service.
     * @throws BadRequestException
     *         The request to update the Input Security Group was invalid
     * @throws InternalServerErrorException
     *         Internal Server Error
     * @throws ForbiddenException
     *         The requester does not have permission to update an Input Security Group
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The Input Security Group was not found.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws ConflictException
     *         The Input Security Group was unable to be updated due to an issue with input security group resources.
     * @sample AWSMediaLive.UpdateInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateInputSecurityGroupResult updateInputSecurityGroup(UpdateInputSecurityGroupRequest updateInputSecurityGroupRequest);

    /**
     * Updates a multiplex.
     * 
     * @param updateMultiplexRequest
     *        A request to update a multiplex.
     * @return Result of the UpdateMultiplex operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws UnprocessableEntityException
     *         The multiplex configuration failed validation and could not be updated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to update the multiplex.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         The multiplex that you are trying to update doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws ConflictException
     *         The multiplex is unable to update due to an issue with multiplex resources.
     * @sample AWSMediaLive.UpdateMultiplex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateMultiplex" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateMultiplexResult updateMultiplex(UpdateMultiplexRequest updateMultiplexRequest);

    /**
     * Update a program in a multiplex.
     * 
     * @param updateMultiplexProgramRequest
     *        A request to update a program in a multiplex.
     * @return Result of the UpdateMultiplexProgram operation returned by the service.
     * @throws BadRequestException
     *         MediaLive can't process your request because of a problem in the request. Please check your request form
     *         and syntax.
     * @throws UnprocessableEntityException
     *         The multiplex program failed validation and could not be updated.
     * @throws InternalServerErrorException
     *         Unexpected internal service error.
     * @throws ForbiddenException
     *         You don't have permission to update the multiplex program.
     * @throws BadGatewayException
     *         Bad Gateway Error
     * @throws NotFoundException
     *         MediaLive can't update the program. The multiplex or the program that you specified doesn’t exist. Check
     *         the IDs and try again.
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws ConflictException
     *         The multiplex program is unable to update due to an issue with multiplex resources.
     * @sample AWSMediaLive.UpdateMultiplexProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateMultiplexProgram"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMultiplexProgramResult updateMultiplexProgram(UpdateMultiplexProgramRequest updateMultiplexProgramRequest);

    /**
     * Update reservation.
     * 
     * @param updateReservationRequest
     *        Request to update a reservation
     * @return Result of the UpdateReservation operation returned by the service.
     * @throws BadRequestException
     *         This request was invalid
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ForbiddenException
     *         You do not have permission to update reservation
     * @throws BadGatewayException
     *         Bad gateway error
     * @throws NotFoundException
     *         Reservation not found
     * @throws GatewayTimeoutException
     *         Gateway Timeout Error
     * @throws TooManyRequestsException
     *         Request limit exceeded
     * @throws ConflictException
     *         The reservation could not be updated
     * @sample AWSMediaLive.UpdateReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateReservation" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateReservationResult updateReservation(UpdateReservationRequest updateReservationRequest);

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

    AWSMediaLiveWaiters waiters();

}
