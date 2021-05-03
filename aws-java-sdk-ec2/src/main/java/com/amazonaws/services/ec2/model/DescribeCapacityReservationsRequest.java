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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeCapacityReservationsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCapacityReservationsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeCapacityReservationsRequest> {

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> capacityReservationIds;
    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance for which the Capacity Reservation reserves capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The Availability Zone ID of the Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-platform</code> - The type of operating system for which the Capacity Reservation reserves
     * capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone ID of the Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of
     * the following tenancy settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation is created on hardware that is shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservation is created on single-tenant hardware that is dedicated to a
     * single AWS account.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The current state of the Capacity Reservation. A Capacity Reservation can be in one of the
     * following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code>- The Capacity Reservation is active and the capacity is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation expired automatically at the date and time specified in your
     * request. The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation was cancelled. The reserved capacity is no longer available for
     * your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is still
     * pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid request
     * parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>start-date</code> - The date and time at which the Capacity Reservation was started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end-date</code> - The date and time at which the Capacity Reservation expires. When a Capacity Reservation
     * expires, the reserved capacity is released and you can no longer launch instances into it. The Capacity
     * Reservation's state changes to expired when it reaches its end date and time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end-date-type</code> - Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can
     * have one of the following end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>instance-match-criteria</code> - Indicates the type of instance launches that the Capacity Reservation
     * accepts. The options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The Capacity Reservation accepts all instances that have matching attributes (instance type,
     * platform, and Availability Zone). Instances that have matching attributes launch into the Capacity Reservation
     * automatically without specifying any additional parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes (instance
     * type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This ensures that only
     * permitted instances can use the reserved capacity.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * 
     * @return The ID of the Capacity Reservation.
     */

    public java.util.List<String> getCapacityReservationIds() {
        if (capacityReservationIds == null) {
            capacityReservationIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return capacityReservationIds;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * 
     * @param capacityReservationIds
     *        The ID of the Capacity Reservation.
     */

    public void setCapacityReservationIds(java.util.Collection<String> capacityReservationIds) {
        if (capacityReservationIds == null) {
            this.capacityReservationIds = null;
            return;
        }

        this.capacityReservationIds = new com.amazonaws.internal.SdkInternalList<String>(capacityReservationIds);
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapacityReservationIds(java.util.Collection)} or
     * {@link #withCapacityReservationIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param capacityReservationIds
     *        The ID of the Capacity Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityReservationsRequest withCapacityReservationIds(String... capacityReservationIds) {
        if (this.capacityReservationIds == null) {
            setCapacityReservationIds(new com.amazonaws.internal.SdkInternalList<String>(capacityReservationIds.length));
        }
        for (String ele : capacityReservationIds) {
            this.capacityReservationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * 
     * @param capacityReservationIds
     *        The ID of the Capacity Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityReservationsRequest withCapacityReservationIds(java.util.Collection<String> capacityReservationIds) {
        setCapacityReservationIds(capacityReservationIds);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityReservationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results can be
     *        seen by sending another request with the returned <code>nextToken</code> value. This value can be between
     *        5 and 500. If <code>maxResults</code> is given a larger value than 500, you receive an error.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error.
     * </p>
     * 
     * @return The maximum number of results to return for the request in a single page. The remaining results can be
     *         seen by sending another request with the returned <code>nextToken</code> value. This value can be between
     *         5 and 500. If <code>maxResults</code> is given a larger value than 500, you receive an error.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results can be
     *        seen by sending another request with the returned <code>nextToken</code> value. This value can be between
     *        5 and 500. If <code>maxResults</code> is given a larger value than 500, you receive an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityReservationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance for which the Capacity Reservation reserves capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The Availability Zone ID of the Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-platform</code> - The type of operating system for which the Capacity Reservation reserves
     * capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone ID of the Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of
     * the following tenancy settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation is created on hardware that is shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservation is created on single-tenant hardware that is dedicated to a
     * single AWS account.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The current state of the Capacity Reservation. A Capacity Reservation can be in one of the
     * following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code>- The Capacity Reservation is active and the capacity is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation expired automatically at the date and time specified in your
     * request. The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation was cancelled. The reserved capacity is no longer available for
     * your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is still
     * pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid request
     * parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>start-date</code> - The date and time at which the Capacity Reservation was started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end-date</code> - The date and time at which the Capacity Reservation expires. When a Capacity Reservation
     * expires, the reserved capacity is released and you can no longer launch instances into it. The Capacity
     * Reservation's state changes to expired when it reaches its end date and time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end-date-type</code> - Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can
     * have one of the following end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>instance-match-criteria</code> - Indicates the type of instance launches that the Capacity Reservation
     * accepts. The options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The Capacity Reservation accepts all instances that have matching attributes (instance type,
     * platform, and Availability Zone). Instances that have matching attributes launch into the Capacity Reservation
     * automatically without specifying any additional parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes (instance
     * type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This ensures that only
     * permitted instances can use the reserved capacity.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>instance-type</code> - The type of instance for which the Capacity Reservation reserves capacity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The ID of the AWS account that owns the Capacity Reservation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone-id</code> - The Availability Zone ID of the Capacity Reservation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-platform</code> - The type of operating system for which the Capacity Reservation reserves
     *         capacity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone ID of the Capacity Reservation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tenancy</code> - Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have
     *         one of the following tenancy settings:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>default</code> - The Capacity Reservation is created on hardware that is shared with other AWS
     *         accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dedicated</code> - The Capacity Reservation is created on single-tenant hardware that is dedicated
     *         to a single AWS account.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The current state of the Capacity Reservation. A Capacity Reservation can be in one
     *         of the following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>active</code>- The Capacity Reservation is active and the capacity is available for your use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>expired</code> - The Capacity Reservation expired automatically at the date and time specified in
     *         your request. The reserved capacity is no longer available for your use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cancelled</code> - The Capacity Reservation was cancelled. The reserved capacity is no longer
     *         available for your use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is
     *         still pending.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid
     *         request parameters, capacity constraints, or instance limit constraints. Failed requests are retained for
     *         60 minutes.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>start-date</code> - The date and time at which the Capacity Reservation was started.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>end-date</code> - The date and time at which the Capacity Reservation expires. When a Capacity
     *         Reservation expires, the reserved capacity is released and you can no longer launch instances into it.
     *         The Capacity Reservation's state changes to expired when it reaches its end date and time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>end-date-type</code> - Indicates the way in which the Capacity Reservation ends. A Capacity
     *         Reservation can have one of the following end types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-match-criteria</code> - Indicates the type of instance launches that the Capacity
     *         Reservation accepts. The options include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>open</code> - The Capacity Reservation accepts all instances that have matching attributes
     *         (instance type, platform, and Availability Zone). Instances that have matching attributes launch into the
     *         Capacity Reservation automatically without specifying any additional parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes
     *         (instance type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This
     *         ensures that only permitted instances can use the reserved capacity.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance for which the Capacity Reservation reserves capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The Availability Zone ID of the Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-platform</code> - The type of operating system for which the Capacity Reservation reserves
     * capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone ID of the Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of
     * the following tenancy settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation is created on hardware that is shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservation is created on single-tenant hardware that is dedicated to a
     * single AWS account.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The current state of the Capacity Reservation. A Capacity Reservation can be in one of the
     * following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code>- The Capacity Reservation is active and the capacity is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation expired automatically at the date and time specified in your
     * request. The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation was cancelled. The reserved capacity is no longer available for
     * your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is still
     * pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid request
     * parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>start-date</code> - The date and time at which the Capacity Reservation was started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end-date</code> - The date and time at which the Capacity Reservation expires. When a Capacity Reservation
     * expires, the reserved capacity is released and you can no longer launch instances into it. The Capacity
     * Reservation's state changes to expired when it reaches its end date and time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end-date-type</code> - Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can
     * have one of the following end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>instance-match-criteria</code> - Indicates the type of instance launches that the Capacity Reservation
     * accepts. The options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The Capacity Reservation accepts all instances that have matching attributes (instance type,
     * platform, and Availability Zone). Instances that have matching attributes launch into the Capacity Reservation
     * automatically without specifying any additional parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes (instance
     * type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This ensures that only
     * permitted instances can use the reserved capacity.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The type of instance for which the Capacity Reservation reserves capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the Capacity Reservation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone-id</code> - The Availability Zone ID of the Capacity Reservation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-platform</code> - The type of operating system for which the Capacity Reservation reserves
     *        capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone ID of the Capacity Reservation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tenancy</code> - Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have
     *        one of the following tenancy settings:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>default</code> - The Capacity Reservation is created on hardware that is shared with other AWS
     *        accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dedicated</code> - The Capacity Reservation is created on single-tenant hardware that is dedicated
     *        to a single AWS account.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The current state of the Capacity Reservation. A Capacity Reservation can be in one
     *        of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code>- The Capacity Reservation is active and the capacity is available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The Capacity Reservation expired automatically at the date and time specified in
     *        your request. The reserved capacity is no longer available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled</code> - The Capacity Reservation was cancelled. The reserved capacity is no longer
     *        available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is
     *        still pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid
     *        request parameters, capacity constraints, or instance limit constraints. Failed requests are retained for
     *        60 minutes.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start-date</code> - The date and time at which the Capacity Reservation was started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>end-date</code> - The date and time at which the Capacity Reservation expires. When a Capacity
     *        Reservation expires, the reserved capacity is released and you can no longer launch instances into it. The
     *        Capacity Reservation's state changes to expired when it reaches its end date and time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>end-date-type</code> - Indicates the way in which the Capacity Reservation ends. A Capacity
     *        Reservation can have one of the following end types:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-match-criteria</code> - Indicates the type of instance launches that the Capacity
     *        Reservation accepts. The options include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>open</code> - The Capacity Reservation accepts all instances that have matching attributes (instance
     *        type, platform, and Availability Zone). Instances that have matching attributes launch into the Capacity
     *        Reservation automatically without specifying any additional parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes
     *        (instance type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This
     *        ensures that only permitted instances can use the reserved capacity.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance for which the Capacity Reservation reserves capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The Availability Zone ID of the Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-platform</code> - The type of operating system for which the Capacity Reservation reserves
     * capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone ID of the Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of
     * the following tenancy settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation is created on hardware that is shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservation is created on single-tenant hardware that is dedicated to a
     * single AWS account.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The current state of the Capacity Reservation. A Capacity Reservation can be in one of the
     * following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code>- The Capacity Reservation is active and the capacity is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation expired automatically at the date and time specified in your
     * request. The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation was cancelled. The reserved capacity is no longer available for
     * your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is still
     * pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid request
     * parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>start-date</code> - The date and time at which the Capacity Reservation was started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end-date</code> - The date and time at which the Capacity Reservation expires. When a Capacity Reservation
     * expires, the reserved capacity is released and you can no longer launch instances into it. The Capacity
     * Reservation's state changes to expired when it reaches its end date and time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end-date-type</code> - Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can
     * have one of the following end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>instance-match-criteria</code> - Indicates the type of instance launches that the Capacity Reservation
     * accepts. The options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The Capacity Reservation accepts all instances that have matching attributes (instance type,
     * platform, and Availability Zone). Instances that have matching attributes launch into the Capacity Reservation
     * automatically without specifying any additional parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes (instance
     * type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This ensures that only
     * permitted instances can use the reserved capacity.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The type of instance for which the Capacity Reservation reserves capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the Capacity Reservation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone-id</code> - The Availability Zone ID of the Capacity Reservation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-platform</code> - The type of operating system for which the Capacity Reservation reserves
     *        capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone ID of the Capacity Reservation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tenancy</code> - Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have
     *        one of the following tenancy settings:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>default</code> - The Capacity Reservation is created on hardware that is shared with other AWS
     *        accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dedicated</code> - The Capacity Reservation is created on single-tenant hardware that is dedicated
     *        to a single AWS account.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The current state of the Capacity Reservation. A Capacity Reservation can be in one
     *        of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code>- The Capacity Reservation is active and the capacity is available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The Capacity Reservation expired automatically at the date and time specified in
     *        your request. The reserved capacity is no longer available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled</code> - The Capacity Reservation was cancelled. The reserved capacity is no longer
     *        available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is
     *        still pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid
     *        request parameters, capacity constraints, or instance limit constraints. Failed requests are retained for
     *        60 minutes.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start-date</code> - The date and time at which the Capacity Reservation was started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>end-date</code> - The date and time at which the Capacity Reservation expires. When a Capacity
     *        Reservation expires, the reserved capacity is released and you can no longer launch instances into it. The
     *        Capacity Reservation's state changes to expired when it reaches its end date and time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>end-date-type</code> - Indicates the way in which the Capacity Reservation ends. A Capacity
     *        Reservation can have one of the following end types:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-match-criteria</code> - Indicates the type of instance launches that the Capacity
     *        Reservation accepts. The options include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>open</code> - The Capacity Reservation accepts all instances that have matching attributes (instance
     *        type, platform, and Availability Zone). Instances that have matching attributes launch into the Capacity
     *        Reservation automatically without specifying any additional parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes
     *        (instance type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This
     *        ensures that only permitted instances can use the reserved capacity.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityReservationsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance for which the Capacity Reservation reserves capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The Availability Zone ID of the Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-platform</code> - The type of operating system for which the Capacity Reservation reserves
     * capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone ID of the Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of
     * the following tenancy settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation is created on hardware that is shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservation is created on single-tenant hardware that is dedicated to a
     * single AWS account.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The current state of the Capacity Reservation. A Capacity Reservation can be in one of the
     * following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code>- The Capacity Reservation is active and the capacity is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation expired automatically at the date and time specified in your
     * request. The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation was cancelled. The reserved capacity is no longer available for
     * your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is still
     * pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid request
     * parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>start-date</code> - The date and time at which the Capacity Reservation was started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end-date</code> - The date and time at which the Capacity Reservation expires. When a Capacity Reservation
     * expires, the reserved capacity is released and you can no longer launch instances into it. The Capacity
     * Reservation's state changes to expired when it reaches its end date and time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end-date-type</code> - Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can
     * have one of the following end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>instance-match-criteria</code> - Indicates the type of instance launches that the Capacity Reservation
     * accepts. The options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The Capacity Reservation accepts all instances that have matching attributes (instance type,
     * platform, and Availability Zone). Instances that have matching attributes launch into the Capacity Reservation
     * automatically without specifying any additional parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes (instance
     * type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This ensures that only
     * permitted instances can use the reserved capacity.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The type of instance for which the Capacity Reservation reserves capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the Capacity Reservation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone-id</code> - The Availability Zone ID of the Capacity Reservation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-platform</code> - The type of operating system for which the Capacity Reservation reserves
     *        capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone ID of the Capacity Reservation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tenancy</code> - Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have
     *        one of the following tenancy settings:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>default</code> - The Capacity Reservation is created on hardware that is shared with other AWS
     *        accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dedicated</code> - The Capacity Reservation is created on single-tenant hardware that is dedicated
     *        to a single AWS account.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The current state of the Capacity Reservation. A Capacity Reservation can be in one
     *        of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code>- The Capacity Reservation is active and the capacity is available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The Capacity Reservation expired automatically at the date and time specified in
     *        your request. The reserved capacity is no longer available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled</code> - The Capacity Reservation was cancelled. The reserved capacity is no longer
     *        available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is
     *        still pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid
     *        request parameters, capacity constraints, or instance limit constraints. Failed requests are retained for
     *        60 minutes.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start-date</code> - The date and time at which the Capacity Reservation was started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>end-date</code> - The date and time at which the Capacity Reservation expires. When a Capacity
     *        Reservation expires, the reserved capacity is released and you can no longer launch instances into it. The
     *        Capacity Reservation's state changes to expired when it reaches its end date and time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>end-date-type</code> - Indicates the way in which the Capacity Reservation ends. A Capacity
     *        Reservation can have one of the following end types:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-match-criteria</code> - Indicates the type of instance launches that the Capacity
     *        Reservation accepts. The options include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>open</code> - The Capacity Reservation accepts all instances that have matching attributes (instance
     *        type, platform, and Availability Zone). Instances that have matching attributes launch into the Capacity
     *        Reservation automatically without specifying any additional parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes
     *        (instance type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This
     *        ensures that only permitted instances can use the reserved capacity.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityReservationsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeCapacityReservationsRequest> getDryRunRequest() {
        Request<DescribeCapacityReservationsRequest> request = new DescribeCapacityReservationsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCapacityReservationIds() != null)
            sb.append("CapacityReservationIds: ").append(getCapacityReservationIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCapacityReservationsRequest == false)
            return false;
        DescribeCapacityReservationsRequest other = (DescribeCapacityReservationsRequest) obj;
        if (other.getCapacityReservationIds() == null ^ this.getCapacityReservationIds() == null)
            return false;
        if (other.getCapacityReservationIds() != null && other.getCapacityReservationIds().equals(this.getCapacityReservationIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityReservationIds() == null) ? 0 : getCapacityReservationIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCapacityReservationsRequest clone() {
        return (DescribeCapacityReservationsRequest) super.clone();
    }
}
