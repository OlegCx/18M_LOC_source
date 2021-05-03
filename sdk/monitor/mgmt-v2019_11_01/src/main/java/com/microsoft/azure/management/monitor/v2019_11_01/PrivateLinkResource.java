/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.monitor.v2019_11_01.implementation.PrivateLinkResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.monitor.v2019_11_01.implementation.MonitorManager;
import java.util.List;

/**
 * Type representing PrivateLinkResource.
 */
public interface PrivateLinkResource extends HasInner<PrivateLinkResourceInner>, Indexable, Refreshable<PrivateLinkResource>, HasManager<MonitorManager> {
    /**
     * @return the groupId value.
     */
    String groupId();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the requiredMembers value.
     */
    List<String> requiredMembers();

    /**
     * @return the type value.
     */
    String type();

}