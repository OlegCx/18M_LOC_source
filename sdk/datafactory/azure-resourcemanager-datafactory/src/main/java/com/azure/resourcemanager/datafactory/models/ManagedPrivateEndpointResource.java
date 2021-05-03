// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedPrivateEndpointResourceInner;

/** An immutable client-side representation of ManagedPrivateEndpointResource. */
public interface ManagedPrivateEndpointResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the properties property: Managed private endpoint properties.
     *
     * @return the properties value.
     */
    ManagedPrivateEndpoint properties();

    /**
     * Gets the name property: The resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the etag property: Etag identifies change in the resource.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the inner com.azure.resourcemanager.datafactory.fluent.models.ManagedPrivateEndpointResourceInner object.
     *
     * @return the inner object.
     */
    ManagedPrivateEndpointResourceInner innerModel();

    /** The entirety of the ManagedPrivateEndpointResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithProperties,
            DefinitionStages.WithCreate {
    }
    /** The ManagedPrivateEndpointResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the ManagedPrivateEndpointResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ManagedPrivateEndpointResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, factoryName, managedVirtualNetworkName.
             *
             * @param resourceGroupName The resource group name.
             * @param factoryName The factory name.
             * @param managedVirtualNetworkName Managed virtual network name.
             * @return the next definition stage.
             */
            WithProperties withExistingManagedVirtualNetwork(
                String resourceGroupName, String factoryName, String managedVirtualNetworkName);
        }
        /** The stage of the ManagedPrivateEndpointResource definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Managed private endpoint properties..
             *
             * @param properties Managed private endpoint properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(ManagedPrivateEndpoint properties);
        }
        /**
         * The stage of the ManagedPrivateEndpointResource definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ManagedPrivateEndpointResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ManagedPrivateEndpointResource create(Context context);
        }
        /** The stage of the ManagedPrivateEndpointResource definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the managed private endpoint entity. Should only be specified for
             * update, for which it should match existing entity or can be * for unconditional update..
             *
             * @param ifMatch ETag of the managed private endpoint entity. Should only be specified for update, for
             *     which it should match existing entity or can be * for unconditional update.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }
    /**
     * Begins update for the ManagedPrivateEndpointResource resource.
     *
     * @return the stage of resource update.
     */
    ManagedPrivateEndpointResource.Update update();

    /** The template for ManagedPrivateEndpointResource update. */
    interface Update extends UpdateStages.WithProperties, UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ManagedPrivateEndpointResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ManagedPrivateEndpointResource apply(Context context);
    }
    /** The ManagedPrivateEndpointResource update stages. */
    interface UpdateStages {
        /** The stage of the ManagedPrivateEndpointResource update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Managed private endpoint properties..
             *
             * @param properties Managed private endpoint properties.
             * @return the next definition stage.
             */
            Update withProperties(ManagedPrivateEndpoint properties);
        }
        /** The stage of the ManagedPrivateEndpointResource update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the managed private endpoint entity. Should only be specified for
             * update, for which it should match existing entity or can be * for unconditional update..
             *
             * @param ifMatch ETag of the managed private endpoint entity. Should only be specified for update, for
             *     which it should match existing entity or can be * for unconditional update.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ManagedPrivateEndpointResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ManagedPrivateEndpointResource refresh(Context context);
}