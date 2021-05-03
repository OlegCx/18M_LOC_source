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
import com.amazonaws.services.ec2.model.transform.DescribeAvailabilityZonesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAvailabilityZonesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeAvailabilityZonesRequest> {

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-name</code> - For Availability Zones, use the Region name. For Local Zones, use the name of the group
     * associated with the Local Zone (for example, <code>us-west-2-lax-1</code>) For Wavelength Zones, use the name of
     * the group associated with the Wavelength Zone (for example, <code>us-east-1-wl1-bos-wlz-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>message</code> - The Zone message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>opt-in-status</code> - The opt-in status (<code>opted-in</code>, and <code>not-opted-in</code> |
     * <code>opt-in-not-required</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parent-zoneID</code> - The ID of the zone that handles some of the Local Zone and Wavelength Zone control
     * plane operations, such as API calls.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parent-zoneName</code> - The ID of the zone that handles some of the Local Zone and Wavelength Zone control
     * plane operations, such as API calls.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the Region for the Zone (for example, <code>us-east-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Availability Zone, the Local Zone, or the Wavelength Zone (
     * <code>available</code> | <code>information</code> | <code>impaired</code> | <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-id</code> - The ID of the Availability Zone (for example, <code>use1-az1</code>), the Local Zone (for
     * example, <code>usw2-lax1-az1</code>), or the Wavelength Zone (for example, <code>us-east-1-wl1-bos-wlz-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-type</code> - The type of zone, for example, <code>local-zone</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-name</code> - The name of the Availability Zone (for example, <code>us-east-1a</code>), the Local Zone
     * (for example, <code>us-west-2-lax-1a</code>), or the Wavelength Zone (for example,
     * <code>us-east-1-wl1-bos-wlz-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-type</code> - The type of zone, for example, <code>local-zone</code>.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The names of the Availability Zones, Local Zones, and Wavelength Zones.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> zoneNames;
    /**
     * <p>
     * The IDs of the Availability Zones, Local Zones, and Wavelength Zones.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> zoneIds;
    /**
     * <p>
     * Include all Availability Zones, Local Zones, and Wavelength Zones regardless of your opt-in status.
     * </p>
     * <p>
     * If you do not use this parameter, the results include only the zones for the Regions where you have chosen the
     * option to opt in.
     * </p>
     */
    private Boolean allAvailabilityZones;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-name</code> - For Availability Zones, use the Region name. For Local Zones, use the name of the group
     * associated with the Local Zone (for example, <code>us-west-2-lax-1</code>) For Wavelength Zones, use the name of
     * the group associated with the Wavelength Zone (for example, <code>us-east-1-wl1-bos-wlz-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>message</code> - The Zone message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>opt-in-status</code> - The opt-in status (<code>opted-in</code>, and <code>not-opted-in</code> |
     * <code>opt-in-not-required</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parent-zoneID</code> - The ID of the zone that handles some of the Local Zone and Wavelength Zone control
     * plane operations, such as API calls.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parent-zoneName</code> - The ID of the zone that handles some of the Local Zone and Wavelength Zone control
     * plane operations, such as API calls.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the Region for the Zone (for example, <code>us-east-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Availability Zone, the Local Zone, or the Wavelength Zone (
     * <code>available</code> | <code>information</code> | <code>impaired</code> | <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-id</code> - The ID of the Availability Zone (for example, <code>use1-az1</code>), the Local Zone (for
     * example, <code>usw2-lax1-az1</code>), or the Wavelength Zone (for example, <code>us-east-1-wl1-bos-wlz-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-type</code> - The type of zone, for example, <code>local-zone</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-name</code> - The name of the Availability Zone (for example, <code>us-east-1a</code>), the Local Zone
     * (for example, <code>us-west-2-lax-1a</code>), or the Wavelength Zone (for example,
     * <code>us-east-1-wl1-bos-wlz-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-type</code> - The type of zone, for example, <code>local-zone</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>group-name</code> - For Availability Zones, use the Region name. For Local Zones, use the name of
     *         the group associated with the Local Zone (for example, <code>us-west-2-lax-1</code>) For Wavelength
     *         Zones, use the name of the group associated with the Wavelength Zone (for example,
     *         <code>us-east-1-wl1-bos-wlz-1</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>message</code> - The Zone message.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>opt-in-status</code> - The opt-in status (<code>opted-in</code>, and <code>not-opted-in</code> |
     *         <code>opt-in-not-required</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>parent-zoneID</code> - The ID of the zone that handles some of the Local Zone and Wavelength Zone
     *         control plane operations, such as API calls.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>parent-zoneName</code> - The ID of the zone that handles some of the Local Zone and Wavelength Zone
     *         control plane operations, such as API calls.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>region-name</code> - The name of the Region for the Zone (for example, <code>us-east-1</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the Availability Zone, the Local Zone, or the Wavelength Zone (
     *         <code>available</code> | <code>information</code> | <code>impaired</code> | <code>unavailable</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zone-id</code> - The ID of the Availability Zone (for example, <code>use1-az1</code>), the Local
     *         Zone (for example, <code>usw2-lax1-az1</code>), or the Wavelength Zone (for example,
     *         <code>us-east-1-wl1-bos-wlz-1</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zone-type</code> - The type of zone, for example, <code>local-zone</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zone-name</code> - The name of the Availability Zone (for example, <code>us-east-1a</code>), the
     *         Local Zone (for example, <code>us-west-2-lax-1a</code>), or the Wavelength Zone (for example,
     *         <code>us-east-1-wl1-bos-wlz-1</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zone-type</code> - The type of zone, for example, <code>local-zone</code>.
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
     * <code>group-name</code> - For Availability Zones, use the Region name. For Local Zones, use the name of the group
     * associated with the Local Zone (for example, <code>us-west-2-lax-1</code>) For Wavelength Zones, use the name of
     * the group associated with the Wavelength Zone (for example, <code>us-east-1-wl1-bos-wlz-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>message</code> - The Zone message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>opt-in-status</code> - The opt-in status (<code>opted-in</code>, and <code>not-opted-in</code> |
     * <code>opt-in-not-required</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parent-zoneID</code> - The ID of the zone that handles some of the Local Zone and Wavelength Zone control
     * plane operations, such as API calls.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parent-zoneName</code> - The ID of the zone that handles some of the Local Zone and Wavelength Zone control
     * plane operations, such as API calls.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the Region for the Zone (for example, <code>us-east-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Availability Zone, the Local Zone, or the Wavelength Zone (
     * <code>available</code> | <code>information</code> | <code>impaired</code> | <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-id</code> - The ID of the Availability Zone (for example, <code>use1-az1</code>), the Local Zone (for
     * example, <code>usw2-lax1-az1</code>), or the Wavelength Zone (for example, <code>us-east-1-wl1-bos-wlz-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-type</code> - The type of zone, for example, <code>local-zone</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-name</code> - The name of the Availability Zone (for example, <code>us-east-1a</code>), the Local Zone
     * (for example, <code>us-west-2-lax-1a</code>), or the Wavelength Zone (for example,
     * <code>us-east-1-wl1-bos-wlz-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-type</code> - The type of zone, for example, <code>local-zone</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>group-name</code> - For Availability Zones, use the Region name. For Local Zones, use the name of
     *        the group associated with the Local Zone (for example, <code>us-west-2-lax-1</code>) For Wavelength Zones,
     *        use the name of the group associated with the Wavelength Zone (for example,
     *        <code>us-east-1-wl1-bos-wlz-1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>message</code> - The Zone message.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>opt-in-status</code> - The opt-in status (<code>opted-in</code>, and <code>not-opted-in</code> |
     *        <code>opt-in-not-required</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>parent-zoneID</code> - The ID of the zone that handles some of the Local Zone and Wavelength Zone
     *        control plane operations, such as API calls.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>parent-zoneName</code> - The ID of the zone that handles some of the Local Zone and Wavelength Zone
     *        control plane operations, such as API calls.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>region-name</code> - The name of the Region for the Zone (for example, <code>us-east-1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the Availability Zone, the Local Zone, or the Wavelength Zone (
     *        <code>available</code> | <code>information</code> | <code>impaired</code> | <code>unavailable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zone-id</code> - The ID of the Availability Zone (for example, <code>use1-az1</code>), the Local
     *        Zone (for example, <code>usw2-lax1-az1</code>), or the Wavelength Zone (for example,
     *        <code>us-east-1-wl1-bos-wlz-1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zone-type</code> - The type of zone, for example, <code>local-zone</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zone-name</code> - The name of the Availability Zone (for example, <code>us-east-1a</code>), the
     *        Local Zone (for example, <code>us-west-2-lax-1a</code>), or the Wavelength Zone (for example,
     *        <code>us-east-1-wl1-bos-wlz-1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zone-type</code> - The type of zone, for example, <code>local-zone</code>.
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
     * <code>group-name</code> - For Availability Zones, use the Region name. For Local Zones, use the name of the group
     * associated with the Local Zone (for example, <code>us-west-2-lax-1</code>) For Wavelength Zones, use the name of
     * the group associated with the Wavelength Zone (for example, <code>us-east-1-wl1-bos-wlz-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>message</code> - The Zone message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>opt-in-status</code> - The opt-in status (<code>opted-in</code>, and <code>not-opted-in</code> |
     * <code>opt-in-not-required</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parent-zoneID</code> - The ID of the zone that handles some of the Local Zone and Wavelength Zone control
     * plane operations, such as API calls.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parent-zoneName</code> - The ID of the zone that handles some of the Local Zone and Wavelength Zone control
     * plane operations, such as API calls.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the Region for the Zone (for example, <code>us-east-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Availability Zone, the Local Zone, or the Wavelength Zone (
     * <code>available</code> | <code>information</code> | <code>impaired</code> | <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-id</code> - The ID of the Availability Zone (for example, <code>use1-az1</code>), the Local Zone (for
     * example, <code>usw2-lax1-az1</code>), or the Wavelength Zone (for example, <code>us-east-1-wl1-bos-wlz-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-type</code> - The type of zone, for example, <code>local-zone</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-name</code> - The name of the Availability Zone (for example, <code>us-east-1a</code>), the Local Zone
     * (for example, <code>us-west-2-lax-1a</code>), or the Wavelength Zone (for example,
     * <code>us-east-1-wl1-bos-wlz-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-type</code> - The type of zone, for example, <code>local-zone</code>.
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
     *        <code>group-name</code> - For Availability Zones, use the Region name. For Local Zones, use the name of
     *        the group associated with the Local Zone (for example, <code>us-west-2-lax-1</code>) For Wavelength Zones,
     *        use the name of the group associated with the Wavelength Zone (for example,
     *        <code>us-east-1-wl1-bos-wlz-1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>message</code> - The Zone message.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>opt-in-status</code> - The opt-in status (<code>opted-in</code>, and <code>not-opted-in</code> |
     *        <code>opt-in-not-required</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>parent-zoneID</code> - The ID of the zone that handles some of the Local Zone and Wavelength Zone
     *        control plane operations, such as API calls.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>parent-zoneName</code> - The ID of the zone that handles some of the Local Zone and Wavelength Zone
     *        control plane operations, such as API calls.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>region-name</code> - The name of the Region for the Zone (for example, <code>us-east-1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the Availability Zone, the Local Zone, or the Wavelength Zone (
     *        <code>available</code> | <code>information</code> | <code>impaired</code> | <code>unavailable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zone-id</code> - The ID of the Availability Zone (for example, <code>use1-az1</code>), the Local
     *        Zone (for example, <code>usw2-lax1-az1</code>), or the Wavelength Zone (for example,
     *        <code>us-east-1-wl1-bos-wlz-1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zone-type</code> - The type of zone, for example, <code>local-zone</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zone-name</code> - The name of the Availability Zone (for example, <code>us-east-1a</code>), the
     *        Local Zone (for example, <code>us-west-2-lax-1a</code>), or the Wavelength Zone (for example,
     *        <code>us-east-1-wl1-bos-wlz-1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zone-type</code> - The type of zone, for example, <code>local-zone</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAvailabilityZonesRequest withFilters(Filter... filters) {
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
     * <code>group-name</code> - For Availability Zones, use the Region name. For Local Zones, use the name of the group
     * associated with the Local Zone (for example, <code>us-west-2-lax-1</code>) For Wavelength Zones, use the name of
     * the group associated with the Wavelength Zone (for example, <code>us-east-1-wl1-bos-wlz-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>message</code> - The Zone message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>opt-in-status</code> - The opt-in status (<code>opted-in</code>, and <code>not-opted-in</code> |
     * <code>opt-in-not-required</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parent-zoneID</code> - The ID of the zone that handles some of the Local Zone and Wavelength Zone control
     * plane operations, such as API calls.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parent-zoneName</code> - The ID of the zone that handles some of the Local Zone and Wavelength Zone control
     * plane operations, such as API calls.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the Region for the Zone (for example, <code>us-east-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Availability Zone, the Local Zone, or the Wavelength Zone (
     * <code>available</code> | <code>information</code> | <code>impaired</code> | <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-id</code> - The ID of the Availability Zone (for example, <code>use1-az1</code>), the Local Zone (for
     * example, <code>usw2-lax1-az1</code>), or the Wavelength Zone (for example, <code>us-east-1-wl1-bos-wlz-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-type</code> - The type of zone, for example, <code>local-zone</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-name</code> - The name of the Availability Zone (for example, <code>us-east-1a</code>), the Local Zone
     * (for example, <code>us-west-2-lax-1a</code>), or the Wavelength Zone (for example,
     * <code>us-east-1-wl1-bos-wlz-1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-type</code> - The type of zone, for example, <code>local-zone</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>group-name</code> - For Availability Zones, use the Region name. For Local Zones, use the name of
     *        the group associated with the Local Zone (for example, <code>us-west-2-lax-1</code>) For Wavelength Zones,
     *        use the name of the group associated with the Wavelength Zone (for example,
     *        <code>us-east-1-wl1-bos-wlz-1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>message</code> - The Zone message.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>opt-in-status</code> - The opt-in status (<code>opted-in</code>, and <code>not-opted-in</code> |
     *        <code>opt-in-not-required</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>parent-zoneID</code> - The ID of the zone that handles some of the Local Zone and Wavelength Zone
     *        control plane operations, such as API calls.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>parent-zoneName</code> - The ID of the zone that handles some of the Local Zone and Wavelength Zone
     *        control plane operations, such as API calls.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>region-name</code> - The name of the Region for the Zone (for example, <code>us-east-1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the Availability Zone, the Local Zone, or the Wavelength Zone (
     *        <code>available</code> | <code>information</code> | <code>impaired</code> | <code>unavailable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zone-id</code> - The ID of the Availability Zone (for example, <code>use1-az1</code>), the Local
     *        Zone (for example, <code>usw2-lax1-az1</code>), or the Wavelength Zone (for example,
     *        <code>us-east-1-wl1-bos-wlz-1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zone-type</code> - The type of zone, for example, <code>local-zone</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zone-name</code> - The name of the Availability Zone (for example, <code>us-east-1a</code>), the
     *        Local Zone (for example, <code>us-west-2-lax-1a</code>), or the Wavelength Zone (for example,
     *        <code>us-east-1-wl1-bos-wlz-1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zone-type</code> - The type of zone, for example, <code>local-zone</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAvailabilityZonesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The names of the Availability Zones, Local Zones, and Wavelength Zones.
     * </p>
     * 
     * @return The names of the Availability Zones, Local Zones, and Wavelength Zones.
     */

    public java.util.List<String> getZoneNames() {
        if (zoneNames == null) {
            zoneNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return zoneNames;
    }

    /**
     * <p>
     * The names of the Availability Zones, Local Zones, and Wavelength Zones.
     * </p>
     * 
     * @param zoneNames
     *        The names of the Availability Zones, Local Zones, and Wavelength Zones.
     */

    public void setZoneNames(java.util.Collection<String> zoneNames) {
        if (zoneNames == null) {
            this.zoneNames = null;
            return;
        }

        this.zoneNames = new com.amazonaws.internal.SdkInternalList<String>(zoneNames);
    }

    /**
     * <p>
     * The names of the Availability Zones, Local Zones, and Wavelength Zones.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setZoneNames(java.util.Collection)} or {@link #withZoneNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param zoneNames
     *        The names of the Availability Zones, Local Zones, and Wavelength Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAvailabilityZonesRequest withZoneNames(String... zoneNames) {
        if (this.zoneNames == null) {
            setZoneNames(new com.amazonaws.internal.SdkInternalList<String>(zoneNames.length));
        }
        for (String ele : zoneNames) {
            this.zoneNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the Availability Zones, Local Zones, and Wavelength Zones.
     * </p>
     * 
     * @param zoneNames
     *        The names of the Availability Zones, Local Zones, and Wavelength Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAvailabilityZonesRequest withZoneNames(java.util.Collection<String> zoneNames) {
        setZoneNames(zoneNames);
        return this;
    }

    /**
     * <p>
     * The IDs of the Availability Zones, Local Zones, and Wavelength Zones.
     * </p>
     * 
     * @return The IDs of the Availability Zones, Local Zones, and Wavelength Zones.
     */

    public java.util.List<String> getZoneIds() {
        if (zoneIds == null) {
            zoneIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return zoneIds;
    }

    /**
     * <p>
     * The IDs of the Availability Zones, Local Zones, and Wavelength Zones.
     * </p>
     * 
     * @param zoneIds
     *        The IDs of the Availability Zones, Local Zones, and Wavelength Zones.
     */

    public void setZoneIds(java.util.Collection<String> zoneIds) {
        if (zoneIds == null) {
            this.zoneIds = null;
            return;
        }

        this.zoneIds = new com.amazonaws.internal.SdkInternalList<String>(zoneIds);
    }

    /**
     * <p>
     * The IDs of the Availability Zones, Local Zones, and Wavelength Zones.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setZoneIds(java.util.Collection)} or {@link #withZoneIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param zoneIds
     *        The IDs of the Availability Zones, Local Zones, and Wavelength Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAvailabilityZonesRequest withZoneIds(String... zoneIds) {
        if (this.zoneIds == null) {
            setZoneIds(new com.amazonaws.internal.SdkInternalList<String>(zoneIds.length));
        }
        for (String ele : zoneIds) {
            this.zoneIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Availability Zones, Local Zones, and Wavelength Zones.
     * </p>
     * 
     * @param zoneIds
     *        The IDs of the Availability Zones, Local Zones, and Wavelength Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAvailabilityZonesRequest withZoneIds(java.util.Collection<String> zoneIds) {
        setZoneIds(zoneIds);
        return this;
    }

    /**
     * <p>
     * Include all Availability Zones, Local Zones, and Wavelength Zones regardless of your opt-in status.
     * </p>
     * <p>
     * If you do not use this parameter, the results include only the zones for the Regions where you have chosen the
     * option to opt in.
     * </p>
     * 
     * @param allAvailabilityZones
     *        Include all Availability Zones, Local Zones, and Wavelength Zones regardless of your opt-in status.</p>
     *        <p>
     *        If you do not use this parameter, the results include only the zones for the Regions where you have chosen
     *        the option to opt in.
     */

    public void setAllAvailabilityZones(Boolean allAvailabilityZones) {
        this.allAvailabilityZones = allAvailabilityZones;
    }

    /**
     * <p>
     * Include all Availability Zones, Local Zones, and Wavelength Zones regardless of your opt-in status.
     * </p>
     * <p>
     * If you do not use this parameter, the results include only the zones for the Regions where you have chosen the
     * option to opt in.
     * </p>
     * 
     * @return Include all Availability Zones, Local Zones, and Wavelength Zones regardless of your opt-in status.</p>
     *         <p>
     *         If you do not use this parameter, the results include only the zones for the Regions where you have
     *         chosen the option to opt in.
     */

    public Boolean getAllAvailabilityZones() {
        return this.allAvailabilityZones;
    }

    /**
     * <p>
     * Include all Availability Zones, Local Zones, and Wavelength Zones regardless of your opt-in status.
     * </p>
     * <p>
     * If you do not use this parameter, the results include only the zones for the Regions where you have chosen the
     * option to opt in.
     * </p>
     * 
     * @param allAvailabilityZones
     *        Include all Availability Zones, Local Zones, and Wavelength Zones regardless of your opt-in status.</p>
     *        <p>
     *        If you do not use this parameter, the results include only the zones for the Regions where you have chosen
     *        the option to opt in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAvailabilityZonesRequest withAllAvailabilityZones(Boolean allAvailabilityZones) {
        setAllAvailabilityZones(allAvailabilityZones);
        return this;
    }

    /**
     * <p>
     * Include all Availability Zones, Local Zones, and Wavelength Zones regardless of your opt-in status.
     * </p>
     * <p>
     * If you do not use this parameter, the results include only the zones for the Regions where you have chosen the
     * option to opt in.
     * </p>
     * 
     * @return Include all Availability Zones, Local Zones, and Wavelength Zones regardless of your opt-in status.</p>
     *         <p>
     *         If you do not use this parameter, the results include only the zones for the Regions where you have
     *         chosen the option to opt in.
     */

    public Boolean isAllAvailabilityZones() {
        return this.allAvailabilityZones;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeAvailabilityZonesRequest> getDryRunRequest() {
        Request<DescribeAvailabilityZonesRequest> request = new DescribeAvailabilityZonesRequestMarshaller().marshall(this);
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
        if (getZoneNames() != null)
            sb.append("ZoneNames: ").append(getZoneNames()).append(",");
        if (getZoneIds() != null)
            sb.append("ZoneIds: ").append(getZoneIds()).append(",");
        if (getAllAvailabilityZones() != null)
            sb.append("AllAvailabilityZones: ").append(getAllAvailabilityZones());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAvailabilityZonesRequest == false)
            return false;
        DescribeAvailabilityZonesRequest other = (DescribeAvailabilityZonesRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getZoneNames() == null ^ this.getZoneNames() == null)
            return false;
        if (other.getZoneNames() != null && other.getZoneNames().equals(this.getZoneNames()) == false)
            return false;
        if (other.getZoneIds() == null ^ this.getZoneIds() == null)
            return false;
        if (other.getZoneIds() != null && other.getZoneIds().equals(this.getZoneIds()) == false)
            return false;
        if (other.getAllAvailabilityZones() == null ^ this.getAllAvailabilityZones() == null)
            return false;
        if (other.getAllAvailabilityZones() != null && other.getAllAvailabilityZones().equals(this.getAllAvailabilityZones()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getZoneNames() == null) ? 0 : getZoneNames().hashCode());
        hashCode = prime * hashCode + ((getZoneIds() == null) ? 0 : getZoneIds().hashCode());
        hashCode = prime * hashCode + ((getAllAvailabilityZones() == null) ? 0 : getAllAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAvailabilityZonesRequest clone() {
        return (DescribeAvailabilityZonesRequest) super.clone();
    }
}
