/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.monitor.v2019_11_01.implementation.ScopedResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.monitor.v2019_11_01.implementation.MonitorManager;

/**
 * Type representing ScopedResource.
 */
public interface ScopedResource extends HasInner<ScopedResourceInner>, Indexable, Refreshable<ScopedResource>, Updatable<ScopedResource.Update>, HasManager<MonitorManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the linkedResourceId value.
     */
    String linkedResourceId();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ScopedResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithPrivateLinkScope, DefinitionStages.WithLinkedResourceId, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ScopedResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ScopedResource definition.
         */
        interface Blank extends WithPrivateLinkScope {
        }

        /**
         * The stage of the scopedresource definition allowing to specify PrivateLinkScope.
         */
        interface WithPrivateLinkScope {
           /**
            * Specifies resourceGroupName, scopeName.
            * @param resourceGroupName The name of the resource group
            * @param scopeName The name of the Azure Monitor PrivateLinkScope resource
            * @return the next definition stage
            */
            WithLinkedResourceId withExistingPrivateLinkScope(String resourceGroupName, String scopeName);
        }

        /**
         * The stage of the scopedresource definition allowing to specify LinkedResourceId.
         */
        interface WithLinkedResourceId {
           /**
            * Specifies linkedResourceId.
            * @param linkedResourceId The resource id of the scoped Azure monitor resource
            * @return the next definition stage
            */
            WithCreate withLinkedResourceId(String linkedResourceId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ScopedResource> {
        }
    }
    /**
     * The template for a ScopedResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ScopedResource>, UpdateStages.WithLinkedResourceId {
    }

    /**
     * Grouping of ScopedResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the scopedresource update allowing to specify LinkedResourceId.
         */
        interface WithLinkedResourceId {
            /**
             * Specifies linkedResourceId.
             * @param linkedResourceId The resource id of the scoped Azure monitor resource
             * @return the next update stage
             */
            Update withLinkedResourceId(String linkedResourceId);
        }

    }
}