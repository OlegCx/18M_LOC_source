// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.AutomationAccountInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of AutomationAccount. */
public interface AutomationAccount {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the etag property: Gets or sets the etag of the resource.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the sku property: Gets or sets the SKU of account.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the lastModifiedBy property: Gets or sets the last modified by.
     *
     * @return the lastModifiedBy value.
     */
    String lastModifiedBy();

    /**
     * Gets the state property: Gets status of account.
     *
     * @return the state value.
     */
    AutomationAccountState state();

    /**
     * Gets the creationTime property: Gets the creation time.
     *
     * @return the creationTime value.
     */
    OffsetDateTime creationTime();

    /**
     * Gets the lastModifiedTime property: Gets the last modified time.
     *
     * @return the lastModifiedTime value.
     */
    OffsetDateTime lastModifiedTime();

    /**
     * Gets the description property: Gets or sets the description.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.automation.fluent.models.AutomationAccountInner object.
     *
     * @return the inner object.
     */
    AutomationAccountInner innerModel();

    /** The entirety of the AutomationAccount definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }
    /** The AutomationAccount definition stages. */
    interface DefinitionStages {
        /** The first stage of the AutomationAccount definition. */
        interface Blank extends WithResourceGroup {
        }
        /** The stage of the AutomationAccount definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName Name of an Azure Resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the AutomationAccount definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithLocation,
                DefinitionStages.WithTags,
                DefinitionStages.WithName,
                DefinitionStages.WithSku {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AutomationAccount create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AutomationAccount create(Context context);
        }
        /** The stage of the AutomationAccount definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location Gets or sets the location of the resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location Gets or sets the location of the resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }
        /** The stage of the AutomationAccount definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Gets or sets the tags attached to the resource..
             *
             * @param tags Gets or sets the tags attached to the resource.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the AutomationAccount definition allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: Gets or sets name of the resource..
             *
             * @param name Gets or sets name of the resource.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }
        /** The stage of the AutomationAccount definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Gets or sets account SKU..
             *
             * @param sku Gets or sets account SKU.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
    }
    /**
     * Begins update for the AutomationAccount resource.
     *
     * @return the stage of resource update.
     */
    AutomationAccount.Update update();

    /** The template for AutomationAccount update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithName, UpdateStages.WithSku {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AutomationAccount apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AutomationAccount apply(Context context);
    }
    /** The AutomationAccount update stages. */
    interface UpdateStages {
        /** The stage of the AutomationAccount update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Gets or sets the tags attached to the resource..
             *
             * @param tags Gets or sets the tags attached to the resource.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the AutomationAccount update allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: Gets or sets the name of the resource..
             *
             * @param name Gets or sets the name of the resource.
             * @return the next definition stage.
             */
            Update withName(String name);
        }
        /** The stage of the AutomationAccount update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Gets or sets account SKU..
             *
             * @param sku Gets or sets account SKU.
             * @return the next definition stage.
             */
            Update withSku(Sku sku);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    AutomationAccount refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AutomationAccount refresh(Context context);
}