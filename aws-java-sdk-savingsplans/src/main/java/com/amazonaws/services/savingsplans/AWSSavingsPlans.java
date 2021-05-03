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
package com.amazonaws.services.savingsplans;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.savingsplans.model.*;

/**
 * Interface for accessing AWSSavingsPlans.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.savingsplans.AbstractAWSSavingsPlans} instead.
 * </p>
 * <p>
 * <p>
 * Savings Plans are a pricing model that offer significant savings on AWS usage (for example, on Amazon EC2 instances).
 * You commit to a consistent amount of usage, in USD per hour, for a term of 1 or 3 years, and receive a lower price
 * for that usage. For more information, see the <a
 * href="https://docs.aws.amazon.com/savingsplans/latest/userguide/">AWS Savings Plans User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSavingsPlans {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "savingsplans";

    /**
     * <p>
     * Creates a Savings Plan.
     * </p>
     * 
     * @param createSavingsPlanRequest
     * @return Result of the CreateSavingsPlan operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         One of the input parameters is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws ServiceQuotaExceededException
     *         A service quota has been exceeded.
     * @sample AWSSavingsPlans.CreateSavingsPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/CreateSavingsPlan" target="_top">AWS
     *      API Documentation</a>
     */
    CreateSavingsPlanResult createSavingsPlan(CreateSavingsPlanRequest createSavingsPlanRequest);

    /**
     * <p>
     * Deletes the queued purchase for the specified Savings Plan.
     * </p>
     * 
     * @param deleteQueuedSavingsPlanRequest
     * @return Result of the DeleteQueuedSavingsPlan operation returned by the service.
     * @throws ValidationException
     *         One of the input parameters is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws ServiceQuotaExceededException
     *         A service quota has been exceeded.
     * @sample AWSSavingsPlans.DeleteQueuedSavingsPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/DeleteQueuedSavingsPlan"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteQueuedSavingsPlanResult deleteQueuedSavingsPlan(DeleteQueuedSavingsPlanRequest deleteQueuedSavingsPlanRequest);

    /**
     * <p>
     * Describes the specified Savings Plans rates.
     * </p>
     * 
     * @param describeSavingsPlanRatesRequest
     * @return Result of the DescribeSavingsPlanRates operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         One of the input parameters is not valid.
     * @sample AWSSavingsPlans.DescribeSavingsPlanRates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/DescribeSavingsPlanRates"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSavingsPlanRatesResult describeSavingsPlanRates(DescribeSavingsPlanRatesRequest describeSavingsPlanRatesRequest);

    /**
     * <p>
     * Describes the specified Savings Plans.
     * </p>
     * 
     * @param describeSavingsPlansRequest
     * @return Result of the DescribeSavingsPlans operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws ValidationException
     *         One of the input parameters is not valid.
     * @sample AWSSavingsPlans.DescribeSavingsPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/DescribeSavingsPlans"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSavingsPlansResult describeSavingsPlans(DescribeSavingsPlansRequest describeSavingsPlansRequest);

    /**
     * <p>
     * Describes the specified Savings Plans offering rates.
     * </p>
     * 
     * @param describeSavingsPlansOfferingRatesRequest
     * @return Result of the DescribeSavingsPlansOfferingRates operation returned by the service.
     * @throws ValidationException
     *         One of the input parameters is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @sample AWSSavingsPlans.DescribeSavingsPlansOfferingRates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/DescribeSavingsPlansOfferingRates"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSavingsPlansOfferingRatesResult describeSavingsPlansOfferingRates(DescribeSavingsPlansOfferingRatesRequest describeSavingsPlansOfferingRatesRequest);

    /**
     * <p>
     * Describes the specified Savings Plans offerings.
     * </p>
     * 
     * @param describeSavingsPlansOfferingsRequest
     * @return Result of the DescribeSavingsPlansOfferings operation returned by the service.
     * @throws ValidationException
     *         One of the input parameters is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @sample AWSSavingsPlans.DescribeSavingsPlansOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/DescribeSavingsPlansOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSavingsPlansOfferingsResult describeSavingsPlansOfferings(DescribeSavingsPlansOfferingsRequest describeSavingsPlansOfferingsRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         One of the input parameters is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @sample AWSSavingsPlans.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ServiceQuotaExceededException
     *         A service quota has been exceeded.
     * @throws ValidationException
     *         One of the input parameters is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @sample AWSSavingsPlans.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         One of the input parameters is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @sample AWSSavingsPlans.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
