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
import com.amazonaws.services.ec2.model.transform.DescribeInstanceStatusRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceStatusRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeInstanceStatusRequest> {

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.code</code> - The code for the scheduled event (<code>instance-reboot</code> |
     * <code>system-reboot</code> | <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.instance-event-id</code> - The ID of the event whose date and time you are modifying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the scheduled event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the scheduled event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before-deadline</code> - The deadline for starting the event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The code for the instance state, as a 16-bit unsigned integer. The high byte
     * is used for internal purposes and should be ignored. The low byte is set based on the state represented. The
     * valid values are 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (<code>pending</code> | <code>running</code> |
     * <code>shutting-down</code> | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.reachability</code> - Filters on instance status where the name is
     * <code>reachability</code> (<code>passed</code> | <code>failed</code> | <code>initializing</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.status</code> - The status of the instance (<code>ok</code> | <code>impaired</code> |
     * <code>initializing</code> | <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.reachability</code> - Filters on system status where the name is <code>reachability</code> (
     * <code>passed</code> | <code>failed</code> | <code>initializing</code> | <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.status</code> - The system status of the instance (<code>ok</code> | <code>impaired</code> |
     * <code>initializing</code> | <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified instance IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;
    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 5 and 1000. You cannot specify this
     * parameter and the instance IDs parameter in the same call.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * When <code>true</code>, includes the health status for all instances. When <code>false</code>, includes the
     * health status for running instances only.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean includeAllInstances;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.code</code> - The code for the scheduled event (<code>instance-reboot</code> |
     * <code>system-reboot</code> | <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.instance-event-id</code> - The ID of the event whose date and time you are modifying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the scheduled event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the scheduled event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before-deadline</code> - The deadline for starting the event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The code for the instance state, as a 16-bit unsigned integer. The high byte
     * is used for internal purposes and should be ignored. The low byte is set based on the state represented. The
     * valid values are 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (<code>pending</code> | <code>running</code> |
     * <code>shutting-down</code> | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.reachability</code> - Filters on instance status where the name is
     * <code>reachability</code> (<code>passed</code> | <code>failed</code> | <code>initializing</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.status</code> - The status of the instance (<code>ok</code> | <code>impaired</code> |
     * <code>initializing</code> | <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.reachability</code> - Filters on system status where the name is <code>reachability</code> (
     * <code>passed</code> | <code>failed</code> | <code>initializing</code> | <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.status</code> - The system status of the instance (<code>ok</code> | <code>impaired</code> |
     * <code>initializing</code> | <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone of the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.code</code> - The code for the scheduled event (<code>instance-reboot</code> |
     *         <code>system-reboot</code> | <code>system-maintenance</code> | <code>instance-retirement</code> |
     *         <code>instance-stop</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.description</code> - A description of the event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.instance-event-id</code> - The ID of the event whose date and time you are modifying.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.not-after</code> - The latest end time for the scheduled event (for example,
     *         <code>2014-09-15T17:15:20.000Z</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.not-before</code> - The earliest start time for the scheduled event (for example,
     *         <code>2014-09-15T17:15:20.000Z</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.not-before-deadline</code> - The deadline for starting the event (for example,
     *         <code>2014-09-15T17:15:20.000Z</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-state-code</code> - The code for the instance state, as a 16-bit unsigned integer. The
     *         high byte is used for internal purposes and should be ignored. The low byte is set based on the state
     *         represented. The valid values are 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64
     *         (stopping), and 80 (stopped).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-state-name</code> - The state of the instance (<code>pending</code> | <code>running</code>
     *         | <code>shutting-down</code> | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-status.reachability</code> - Filters on instance status where the name is
     *         <code>reachability</code> (<code>passed</code> | <code>failed</code> | <code>initializing</code> |
     *         <code>insufficient-data</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-status.status</code> - The status of the instance (<code>ok</code> | <code>impaired</code>
     *         | <code>initializing</code> | <code>insufficient-data</code> | <code>not-applicable</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>system-status.reachability</code> - Filters on system status where the name is
     *         <code>reachability</code> (<code>passed</code> | <code>failed</code> | <code>initializing</code> |
     *         <code>insufficient-data</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>system-status.status</code> - The system status of the instance (<code>ok</code> |
     *         <code>impaired</code> | <code>initializing</code> | <code>insufficient-data</code> |
     *         <code>not-applicable</code>).
     *         </p>
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.code</code> - The code for the scheduled event (<code>instance-reboot</code> |
     * <code>system-reboot</code> | <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.instance-event-id</code> - The ID of the event whose date and time you are modifying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the scheduled event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the scheduled event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before-deadline</code> - The deadline for starting the event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The code for the instance state, as a 16-bit unsigned integer. The high byte
     * is used for internal purposes and should be ignored. The low byte is set based on the state represented. The
     * valid values are 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (<code>pending</code> | <code>running</code> |
     * <code>shutting-down</code> | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.reachability</code> - Filters on instance status where the name is
     * <code>reachability</code> (<code>passed</code> | <code>failed</code> | <code>initializing</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.status</code> - The status of the instance (<code>ok</code> | <code>impaired</code> |
     * <code>initializing</code> | <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.reachability</code> - Filters on system status where the name is <code>reachability</code> (
     * <code>passed</code> | <code>failed</code> | <code>initializing</code> | <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.status</code> - The system status of the instance (<code>ok</code> | <code>impaired</code> |
     * <code>initializing</code> | <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.code</code> - The code for the scheduled event (<code>instance-reboot</code> |
     *        <code>system-reboot</code> | <code>system-maintenance</code> | <code>instance-retirement</code> |
     *        <code>instance-stop</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.description</code> - A description of the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.instance-event-id</code> - The ID of the event whose date and time you are modifying.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.not-after</code> - The latest end time for the scheduled event (for example,
     *        <code>2014-09-15T17:15:20.000Z</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.not-before</code> - The earliest start time for the scheduled event (for example,
     *        <code>2014-09-15T17:15:20.000Z</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.not-before-deadline</code> - The deadline for starting the event (for example,
     *        <code>2014-09-15T17:15:20.000Z</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-state-code</code> - The code for the instance state, as a 16-bit unsigned integer. The high
     *        byte is used for internal purposes and should be ignored. The low byte is set based on the state
     *        represented. The valid values are 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64
     *        (stopping), and 80 (stopped).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-state-name</code> - The state of the instance (<code>pending</code> | <code>running</code>
     *        | <code>shutting-down</code> | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-status.reachability</code> - Filters on instance status where the name is
     *        <code>reachability</code> (<code>passed</code> | <code>failed</code> | <code>initializing</code> |
     *        <code>insufficient-data</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-status.status</code> - The status of the instance (<code>ok</code> | <code>impaired</code>
     *        | <code>initializing</code> | <code>insufficient-data</code> | <code>not-applicable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>system-status.reachability</code> - Filters on system status where the name is
     *        <code>reachability</code> (<code>passed</code> | <code>failed</code> | <code>initializing</code> |
     *        <code>insufficient-data</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>system-status.status</code> - The system status of the instance (<code>ok</code> |
     *        <code>impaired</code> | <code>initializing</code> | <code>insufficient-data</code> |
     *        <code>not-applicable</code>).
     *        </p>
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.code</code> - The code for the scheduled event (<code>instance-reboot</code> |
     * <code>system-reboot</code> | <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.instance-event-id</code> - The ID of the event whose date and time you are modifying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the scheduled event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the scheduled event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before-deadline</code> - The deadline for starting the event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The code for the instance state, as a 16-bit unsigned integer. The high byte
     * is used for internal purposes and should be ignored. The low byte is set based on the state represented. The
     * valid values are 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (<code>pending</code> | <code>running</code> |
     * <code>shutting-down</code> | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.reachability</code> - Filters on instance status where the name is
     * <code>reachability</code> (<code>passed</code> | <code>failed</code> | <code>initializing</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.status</code> - The status of the instance (<code>ok</code> | <code>impaired</code> |
     * <code>initializing</code> | <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.reachability</code> - Filters on system status where the name is <code>reachability</code> (
     * <code>passed</code> | <code>failed</code> | <code>initializing</code> | <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.status</code> - The system status of the instance (<code>ok</code> | <code>impaired</code> |
     * <code>initializing</code> | <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.code</code> - The code for the scheduled event (<code>instance-reboot</code> |
     *        <code>system-reboot</code> | <code>system-maintenance</code> | <code>instance-retirement</code> |
     *        <code>instance-stop</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.description</code> - A description of the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.instance-event-id</code> - The ID of the event whose date and time you are modifying.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.not-after</code> - The latest end time for the scheduled event (for example,
     *        <code>2014-09-15T17:15:20.000Z</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.not-before</code> - The earliest start time for the scheduled event (for example,
     *        <code>2014-09-15T17:15:20.000Z</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.not-before-deadline</code> - The deadline for starting the event (for example,
     *        <code>2014-09-15T17:15:20.000Z</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-state-code</code> - The code for the instance state, as a 16-bit unsigned integer. The high
     *        byte is used for internal purposes and should be ignored. The low byte is set based on the state
     *        represented. The valid values are 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64
     *        (stopping), and 80 (stopped).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-state-name</code> - The state of the instance (<code>pending</code> | <code>running</code>
     *        | <code>shutting-down</code> | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-status.reachability</code> - Filters on instance status where the name is
     *        <code>reachability</code> (<code>passed</code> | <code>failed</code> | <code>initializing</code> |
     *        <code>insufficient-data</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-status.status</code> - The status of the instance (<code>ok</code> | <code>impaired</code>
     *        | <code>initializing</code> | <code>insufficient-data</code> | <code>not-applicable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>system-status.reachability</code> - Filters on system status where the name is
     *        <code>reachability</code> (<code>passed</code> | <code>failed</code> | <code>initializing</code> |
     *        <code>insufficient-data</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>system-status.status</code> - The system status of the instance (<code>ok</code> |
     *        <code>impaired</code> | <code>initializing</code> | <code>insufficient-data</code> |
     *        <code>not-applicable</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceStatusRequest withFilters(Filter... filters) {
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.code</code> - The code for the scheduled event (<code>instance-reboot</code> |
     * <code>system-reboot</code> | <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.instance-event-id</code> - The ID of the event whose date and time you are modifying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the scheduled event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the scheduled event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before-deadline</code> - The deadline for starting the event (for example,
     * <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The code for the instance state, as a 16-bit unsigned integer. The high byte
     * is used for internal purposes and should be ignored. The low byte is set based on the state represented. The
     * valid values are 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (<code>pending</code> | <code>running</code> |
     * <code>shutting-down</code> | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.reachability</code> - Filters on instance status where the name is
     * <code>reachability</code> (<code>passed</code> | <code>failed</code> | <code>initializing</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.status</code> - The status of the instance (<code>ok</code> | <code>impaired</code> |
     * <code>initializing</code> | <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.reachability</code> - Filters on system status where the name is <code>reachability</code> (
     * <code>passed</code> | <code>failed</code> | <code>initializing</code> | <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.status</code> - The system status of the instance (<code>ok</code> | <code>impaired</code> |
     * <code>initializing</code> | <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.code</code> - The code for the scheduled event (<code>instance-reboot</code> |
     *        <code>system-reboot</code> | <code>system-maintenance</code> | <code>instance-retirement</code> |
     *        <code>instance-stop</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.description</code> - A description of the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.instance-event-id</code> - The ID of the event whose date and time you are modifying.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.not-after</code> - The latest end time for the scheduled event (for example,
     *        <code>2014-09-15T17:15:20.000Z</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.not-before</code> - The earliest start time for the scheduled event (for example,
     *        <code>2014-09-15T17:15:20.000Z</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>event.not-before-deadline</code> - The deadline for starting the event (for example,
     *        <code>2014-09-15T17:15:20.000Z</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-state-code</code> - The code for the instance state, as a 16-bit unsigned integer. The high
     *        byte is used for internal purposes and should be ignored. The low byte is set based on the state
     *        represented. The valid values are 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64
     *        (stopping), and 80 (stopped).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-state-name</code> - The state of the instance (<code>pending</code> | <code>running</code>
     *        | <code>shutting-down</code> | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-status.reachability</code> - Filters on instance status where the name is
     *        <code>reachability</code> (<code>passed</code> | <code>failed</code> | <code>initializing</code> |
     *        <code>insufficient-data</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-status.status</code> - The status of the instance (<code>ok</code> | <code>impaired</code>
     *        | <code>initializing</code> | <code>insufficient-data</code> | <code>not-applicable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>system-status.reachability</code> - Filters on system status where the name is
     *        <code>reachability</code> (<code>passed</code> | <code>failed</code> | <code>initializing</code> |
     *        <code>insufficient-data</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>system-status.status</code> - The system status of the instance (<code>ok</code> |
     *        <code>impaired</code> | <code>initializing</code> | <code>insufficient-data</code> |
     *        <code>not-applicable</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceStatusRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified instance IDs.
     * </p>
     * 
     * @return The instance IDs.</p>
     *         <p>
     *         Default: Describes all your instances.
     *         </p>
     *         <p>
     *         Constraints: Maximum 100 explicitly specified instance IDs.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified instance IDs.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs.</p>
     *        <p>
     *        Default: Describes all your instances.
     *        </p>
     *        <p>
     *        Constraints: Maximum 100 explicitly specified instance IDs.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new com.amazonaws.internal.SdkInternalList<String>(instanceIds);
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified instance IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs.</p>
     *        <p>
     *        Default: Describes all your instances.
     *        </p>
     *        <p>
     *        Constraints: Maximum 100 explicitly specified instance IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceStatusRequest withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified instance IDs.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs.</p>
     *        <p>
     *        Default: Describes all your instances.
     *        </p>
     *        <p>
     *        Constraints: Maximum 100 explicitly specified instance IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceStatusRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 5 and 1000. You cannot specify this
     * parameter and the instance IDs parameter in the same call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned <code>NextToken</code> value. This value can be between 5 and 1000. You cannot
     *        specify this parameter and the instance IDs parameter in the same call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 5 and 1000. You cannot specify this
     * parameter and the instance IDs parameter in the same call.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *         call with the returned <code>NextToken</code> value. This value can be between 5 and 1000. You cannot
     *         specify this parameter and the instance IDs parameter in the same call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 5 and 1000. You cannot specify this
     * parameter and the instance IDs parameter in the same call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned <code>NextToken</code> value. This value can be between 5 and 1000. You cannot
     *        specify this parameter and the instance IDs parameter in the same call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceStatusRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @return The token to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceStatusRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, includes the health status for all instances. When <code>false</code>, includes the
     * health status for running instances only.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param includeAllInstances
     *        When <code>true</code>, includes the health status for all instances. When <code>false</code>, includes
     *        the health status for running instances only.</p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setIncludeAllInstances(Boolean includeAllInstances) {
        this.includeAllInstances = includeAllInstances;
    }

    /**
     * <p>
     * When <code>true</code>, includes the health status for all instances. When <code>false</code>, includes the
     * health status for running instances only.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return When <code>true</code>, includes the health status for all instances. When <code>false</code>, includes
     *         the health status for running instances only.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getIncludeAllInstances() {
        return this.includeAllInstances;
    }

    /**
     * <p>
     * When <code>true</code>, includes the health status for all instances. When <code>false</code>, includes the
     * health status for running instances only.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param includeAllInstances
     *        When <code>true</code>, includes the health status for all instances. When <code>false</code>, includes
     *        the health status for running instances only.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceStatusRequest withIncludeAllInstances(Boolean includeAllInstances) {
        setIncludeAllInstances(includeAllInstances);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, includes the health status for all instances. When <code>false</code>, includes the
     * health status for running instances only.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return When <code>true</code>, includes the health status for all instances. When <code>false</code>, includes
     *         the health status for running instances only.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isIncludeAllInstances() {
        return this.includeAllInstances;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeInstanceStatusRequest> getDryRunRequest() {
        Request<DescribeInstanceStatusRequest> request = new DescribeInstanceStatusRequestMarshaller().marshall(this);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getIncludeAllInstances() != null)
            sb.append("IncludeAllInstances: ").append(getIncludeAllInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceStatusRequest == false)
            return false;
        DescribeInstanceStatusRequest other = (DescribeInstanceStatusRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getIncludeAllInstances() == null ^ this.getIncludeAllInstances() == null)
            return false;
        if (other.getIncludeAllInstances() != null && other.getIncludeAllInstances().equals(this.getIncludeAllInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getIncludeAllInstances() == null) ? 0 : getIncludeAllInstances().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceStatusRequest clone() {
        return (DescribeInstanceStatusRequest) super.clone();
    }
}
