// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.deploymentmanager.fluent.models.ServiceUnitResourceInner;
import java.util.Map;

/** An immutable client-side representation of ServiceUnitResource. */
public interface ServiceUnitResource {
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
     * Gets the targetResourceGroup property: The Azure Resource Group to which the resources in the service unit belong
     * to or should be deployed to.
     *
     * @return the targetResourceGroup value.
     */
    String targetResourceGroup();

    /**
     * Gets the deploymentMode property: Describes the type of ARM deployment to be performed on the resource.
     *
     * @return the deploymentMode value.
     */
    DeploymentMode deploymentMode();

    /**
     * Gets the artifacts property: The artifacts for the service unit.
     *
     * @return the artifacts value.
     */
    ServiceUnitArtifacts artifacts();

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
     * Gets the inner com.azure.resourcemanager.deploymentmanager.fluent.models.ServiceUnitResourceInner object.
     *
     * @return the inner object.
     */
    ServiceUnitResourceInner innerModel();

    /** The entirety of the ServiceUnitResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithTargetResourceGroup,
            DefinitionStages.WithDeploymentMode,
            DefinitionStages.WithCreate {
    }
    /** The ServiceUnitResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the ServiceUnitResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ServiceUnitResource definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the ServiceUnitResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serviceTopologyName, serviceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param serviceTopologyName The name of the service topology .
             * @param serviceName The name of the service resource.
             * @return the next definition stage.
             */
            WithTargetResourceGroup withExistingService(
                String resourceGroupName, String serviceTopologyName, String serviceName);
        }
        /** The stage of the ServiceUnitResource definition allowing to specify targetResourceGroup. */
        interface WithTargetResourceGroup {
            /**
             * Specifies the targetResourceGroup property: The Azure Resource Group to which the resources in the
             * service unit belong to or should be deployed to..
             *
             * @param targetResourceGroup The Azure Resource Group to which the resources in the service unit belong to
             *     or should be deployed to.
             * @return the next definition stage.
             */
            WithDeploymentMode withTargetResourceGroup(String targetResourceGroup);
        }
        /** The stage of the ServiceUnitResource definition allowing to specify deploymentMode. */
        interface WithDeploymentMode {
            /**
             * Specifies the deploymentMode property: Describes the type of ARM deployment to be performed on the
             * resource..
             *
             * @param deploymentMode Describes the type of ARM deployment to be performed on the resource.
             * @return the next definition stage.
             */
            WithCreate withDeploymentMode(DeploymentMode deploymentMode);
        }
        /**
         * The stage of the ServiceUnitResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithArtifacts {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ServiceUnitResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ServiceUnitResource create(Context context);
        }
        /** The stage of the ServiceUnitResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ServiceUnitResource definition allowing to specify artifacts. */
        interface WithArtifacts {
            /**
             * Specifies the artifacts property: The artifacts for the service unit..
             *
             * @param artifacts The artifacts for the service unit.
             * @return the next definition stage.
             */
            WithCreate withArtifacts(ServiceUnitArtifacts artifacts);
        }
    }
    /**
     * Begins update for the ServiceUnitResource resource.
     *
     * @return the stage of resource update.
     */
    ServiceUnitResource.Update update();

    /** The template for ServiceUnitResource update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithTargetResourceGroup,
            UpdateStages.WithDeploymentMode,
            UpdateStages.WithArtifacts {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ServiceUnitResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ServiceUnitResource apply(Context context);
    }
    /** The ServiceUnitResource update stages. */
    interface UpdateStages {
        /** The stage of the ServiceUnitResource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the ServiceUnitResource update allowing to specify targetResourceGroup. */
        interface WithTargetResourceGroup {
            /**
             * Specifies the targetResourceGroup property: The Azure Resource Group to which the resources in the
             * service unit belong to or should be deployed to..
             *
             * @param targetResourceGroup The Azure Resource Group to which the resources in the service unit belong to
             *     or should be deployed to.
             * @return the next definition stage.
             */
            Update withTargetResourceGroup(String targetResourceGroup);
        }
        /** The stage of the ServiceUnitResource update allowing to specify deploymentMode. */
        interface WithDeploymentMode {
            /**
             * Specifies the deploymentMode property: Describes the type of ARM deployment to be performed on the
             * resource..
             *
             * @param deploymentMode Describes the type of ARM deployment to be performed on the resource.
             * @return the next definition stage.
             */
            Update withDeploymentMode(DeploymentMode deploymentMode);
        }
        /** The stage of the ServiceUnitResource update allowing to specify artifacts. */
        interface WithArtifacts {
            /**
             * Specifies the artifacts property: The artifacts for the service unit..
             *
             * @param artifacts The artifacts for the service unit.
             * @return the next definition stage.
             */
            Update withArtifacts(ServiceUnitArtifacts artifacts);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ServiceUnitResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ServiceUnitResource refresh(Context context);
}