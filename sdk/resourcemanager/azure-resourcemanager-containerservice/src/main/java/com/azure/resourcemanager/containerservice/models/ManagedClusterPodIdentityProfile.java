// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ManagedClusterPodIdentityProfile model. */
@Fluent
public final class ManagedClusterPodIdentityProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedClusterPodIdentityProfile.class);

    /*
     * Whether the pod identity addon is enabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Customer consent for enabling AAD pod identity addon in cluster using
     * Kubenet network plugin.
     */
    @JsonProperty(value = "allowNetworkPluginKubenet")
    private Boolean allowNetworkPluginKubenet;

    /*
     * User assigned pod identity settings.
     */
    @JsonProperty(value = "userAssignedIdentities")
    private List<ManagedClusterPodIdentity> userAssignedIdentities;

    /*
     * User assigned pod identity exception settings.
     */
    @JsonProperty(value = "userAssignedIdentityExceptions")
    private List<ManagedClusterPodIdentityException> userAssignedIdentityExceptions;

    /**
     * Get the enabled property: Whether the pod identity addon is enabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether the pod identity addon is enabled.
     *
     * @param enabled the enabled value to set.
     * @return the ManagedClusterPodIdentityProfile object itself.
     */
    public ManagedClusterPodIdentityProfile withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the allowNetworkPluginKubenet property: Customer consent for enabling AAD pod identity addon in cluster using
     * Kubenet network plugin.
     *
     * @return the allowNetworkPluginKubenet value.
     */
    public Boolean allowNetworkPluginKubenet() {
        return this.allowNetworkPluginKubenet;
    }

    /**
     * Set the allowNetworkPluginKubenet property: Customer consent for enabling AAD pod identity addon in cluster using
     * Kubenet network plugin.
     *
     * @param allowNetworkPluginKubenet the allowNetworkPluginKubenet value to set.
     * @return the ManagedClusterPodIdentityProfile object itself.
     */
    public ManagedClusterPodIdentityProfile withAllowNetworkPluginKubenet(Boolean allowNetworkPluginKubenet) {
        this.allowNetworkPluginKubenet = allowNetworkPluginKubenet;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: User assigned pod identity settings.
     *
     * @return the userAssignedIdentities value.
     */
    public List<ManagedClusterPodIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: User assigned pod identity settings.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the ManagedClusterPodIdentityProfile object itself.
     */
    public ManagedClusterPodIdentityProfile withUserAssignedIdentities(
        List<ManagedClusterPodIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Get the userAssignedIdentityExceptions property: User assigned pod identity exception settings.
     *
     * @return the userAssignedIdentityExceptions value.
     */
    public List<ManagedClusterPodIdentityException> userAssignedIdentityExceptions() {
        return this.userAssignedIdentityExceptions;
    }

    /**
     * Set the userAssignedIdentityExceptions property: User assigned pod identity exception settings.
     *
     * @param userAssignedIdentityExceptions the userAssignedIdentityExceptions value to set.
     * @return the ManagedClusterPodIdentityProfile object itself.
     */
    public ManagedClusterPodIdentityProfile withUserAssignedIdentityExceptions(
        List<ManagedClusterPodIdentityException> userAssignedIdentityExceptions) {
        this.userAssignedIdentityExceptions = userAssignedIdentityExceptions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userAssignedIdentities() != null) {
            userAssignedIdentities().forEach(e -> e.validate());
        }
        if (userAssignedIdentityExceptions() != null) {
            userAssignedIdentityExceptions().forEach(e -> e.validate());
        }
    }
}