/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.WebSiteInstanceStatusInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.AppServiceManager;
import java.util.Map;

/**
 * Type representing WebSiteInstanceStatus.
 */
public interface WebSiteInstanceStatus extends HasInner<WebSiteInstanceStatusInner>, Indexable, Refreshable<WebSiteInstanceStatus>, HasManager<AppServiceManager> {
    /**
     * @return the consoleUrl value.
     */
    String consoleUrl();

    /**
     * @return the containers value.
     */
    Map<String, ContainerInfo> containers();

    /**
     * @return the detectorUrl value.
     */
    String detectorUrl();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the state value.
     */
    SiteRuntimeState state();

    /**
     * @return the statusUrl value.
     */
    String statusUrl();

    /**
     * @return the type value.
     */
    String type();

}