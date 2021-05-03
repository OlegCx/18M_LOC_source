// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.RoutingState;
import com.azure.resourcemanager.network.models.VirtualHubRouteTable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** VirtualHub Resource. */
@JsonFlatten
@Fluent
public class VirtualHubInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualHubInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The VirtualWAN to which the VirtualHub belongs.
     */
    @JsonProperty(value = "properties.virtualWan")
    private SubResource virtualWan;

    /*
     * The VpnGateway associated with this VirtualHub.
     */
    @JsonProperty(value = "properties.vpnGateway")
    private SubResource vpnGateway;

    /*
     * The P2SVpnGateway associated with this VirtualHub.
     */
    @JsonProperty(value = "properties.p2SVpnGateway")
    private SubResource p2SVpnGateway;

    /*
     * The expressRouteGateway associated with this VirtualHub.
     */
    @JsonProperty(value = "properties.expressRouteGateway")
    private SubResource expressRouteGateway;

    /*
     * The azureFirewall associated with this VirtualHub.
     */
    @JsonProperty(value = "properties.azureFirewall")
    private SubResource azureFirewall;

    /*
     * The securityPartnerProvider associated with this VirtualHub.
     */
    @JsonProperty(value = "properties.securityPartnerProvider")
    private SubResource securityPartnerProvider;

    /*
     * Address-prefix for this VirtualHub.
     */
    @JsonProperty(value = "properties.addressPrefix")
    private String addressPrefix;

    /*
     * The routeTable associated with this virtual hub.
     */
    @JsonProperty(value = "properties.routeTable")
    private VirtualHubRouteTable routeTable;

    /*
     * The provisioning state of the virtual hub resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The Security Provider name.
     */
    @JsonProperty(value = "properties.securityProviderName")
    private String securityProviderName;

    /*
     * List of all virtual hub route table v2s associated with this VirtualHub.
     */
    @JsonProperty(value = "properties.virtualHubRouteTableV2s")
    private List<VirtualHubRouteTableV2Inner> virtualHubRouteTableV2S;

    /*
     * The sku of this VirtualHub.
     */
    @JsonProperty(value = "properties.sku")
    private String sku;

    /*
     * The routing state.
     */
    @JsonProperty(value = "properties.routingState", access = JsonProperty.Access.WRITE_ONLY)
    private RoutingState routingState;

    /*
     * List of references to Bgp Connections.
     */
    @JsonProperty(value = "properties.bgpConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> bgpConnections;

    /*
     * List of references to IpConfigurations.
     */
    @JsonProperty(value = "properties.ipConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> ipConfigurations;

    /*
     * VirtualRouter ASN.
     */
    @JsonProperty(value = "properties.virtualRouterAsn")
    private Long virtualRouterAsn;

    /*
     * VirtualRouter IPs.
     */
    @JsonProperty(value = "properties.virtualRouterIps")
    private List<String> virtualRouterIps;

    /*
     * Flag to control transit for VirtualRouter hub.
     */
    @JsonProperty(value = "properties.allowBranchToBranchTraffic")
    private Boolean allowBranchToBranchTraffic;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the virtualWan property: The VirtualWAN to which the VirtualHub belongs.
     *
     * @return the virtualWan value.
     */
    public SubResource virtualWan() {
        return this.virtualWan;
    }

    /**
     * Set the virtualWan property: The VirtualWAN to which the VirtualHub belongs.
     *
     * @param virtualWan the virtualWan value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withVirtualWan(SubResource virtualWan) {
        this.virtualWan = virtualWan;
        return this;
    }

    /**
     * Get the vpnGateway property: The VpnGateway associated with this VirtualHub.
     *
     * @return the vpnGateway value.
     */
    public SubResource vpnGateway() {
        return this.vpnGateway;
    }

    /**
     * Set the vpnGateway property: The VpnGateway associated with this VirtualHub.
     *
     * @param vpnGateway the vpnGateway value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withVpnGateway(SubResource vpnGateway) {
        this.vpnGateway = vpnGateway;
        return this;
    }

    /**
     * Get the p2SVpnGateway property: The P2SVpnGateway associated with this VirtualHub.
     *
     * @return the p2SVpnGateway value.
     */
    public SubResource p2SVpnGateway() {
        return this.p2SVpnGateway;
    }

    /**
     * Set the p2SVpnGateway property: The P2SVpnGateway associated with this VirtualHub.
     *
     * @param p2SVpnGateway the p2SVpnGateway value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withP2SVpnGateway(SubResource p2SVpnGateway) {
        this.p2SVpnGateway = p2SVpnGateway;
        return this;
    }

    /**
     * Get the expressRouteGateway property: The expressRouteGateway associated with this VirtualHub.
     *
     * @return the expressRouteGateway value.
     */
    public SubResource expressRouteGateway() {
        return this.expressRouteGateway;
    }

    /**
     * Set the expressRouteGateway property: The expressRouteGateway associated with this VirtualHub.
     *
     * @param expressRouteGateway the expressRouteGateway value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withExpressRouteGateway(SubResource expressRouteGateway) {
        this.expressRouteGateway = expressRouteGateway;
        return this;
    }

    /**
     * Get the azureFirewall property: The azureFirewall associated with this VirtualHub.
     *
     * @return the azureFirewall value.
     */
    public SubResource azureFirewall() {
        return this.azureFirewall;
    }

    /**
     * Set the azureFirewall property: The azureFirewall associated with this VirtualHub.
     *
     * @param azureFirewall the azureFirewall value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withAzureFirewall(SubResource azureFirewall) {
        this.azureFirewall = azureFirewall;
        return this;
    }

    /**
     * Get the securityPartnerProvider property: The securityPartnerProvider associated with this VirtualHub.
     *
     * @return the securityPartnerProvider value.
     */
    public SubResource securityPartnerProvider() {
        return this.securityPartnerProvider;
    }

    /**
     * Set the securityPartnerProvider property: The securityPartnerProvider associated with this VirtualHub.
     *
     * @param securityPartnerProvider the securityPartnerProvider value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withSecurityPartnerProvider(SubResource securityPartnerProvider) {
        this.securityPartnerProvider = securityPartnerProvider;
        return this;
    }

    /**
     * Get the addressPrefix property: Address-prefix for this VirtualHub.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: Address-prefix for this VirtualHub.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the routeTable property: The routeTable associated with this virtual hub.
     *
     * @return the routeTable value.
     */
    public VirtualHubRouteTable routeTable() {
        return this.routeTable;
    }

    /**
     * Set the routeTable property: The routeTable associated with this virtual hub.
     *
     * @param routeTable the routeTable value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withRouteTable(VirtualHubRouteTable routeTable) {
        this.routeTable = routeTable;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual hub resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the securityProviderName property: The Security Provider name.
     *
     * @return the securityProviderName value.
     */
    public String securityProviderName() {
        return this.securityProviderName;
    }

    /**
     * Set the securityProviderName property: The Security Provider name.
     *
     * @param securityProviderName the securityProviderName value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withSecurityProviderName(String securityProviderName) {
        this.securityProviderName = securityProviderName;
        return this;
    }

    /**
     * Get the virtualHubRouteTableV2S property: List of all virtual hub route table v2s associated with this
     * VirtualHub.
     *
     * @return the virtualHubRouteTableV2S value.
     */
    public List<VirtualHubRouteTableV2Inner> virtualHubRouteTableV2S() {
        return this.virtualHubRouteTableV2S;
    }

    /**
     * Set the virtualHubRouteTableV2S property: List of all virtual hub route table v2s associated with this
     * VirtualHub.
     *
     * @param virtualHubRouteTableV2S the virtualHubRouteTableV2S value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withVirtualHubRouteTableV2S(List<VirtualHubRouteTableV2Inner> virtualHubRouteTableV2S) {
        this.virtualHubRouteTableV2S = virtualHubRouteTableV2S;
        return this;
    }

    /**
     * Get the sku property: The sku of this VirtualHub.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku of this VirtualHub.
     *
     * @param sku the sku value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the routingState property: The routing state.
     *
     * @return the routingState value.
     */
    public RoutingState routingState() {
        return this.routingState;
    }

    /**
     * Get the bgpConnections property: List of references to Bgp Connections.
     *
     * @return the bgpConnections value.
     */
    public List<SubResource> bgpConnections() {
        return this.bgpConnections;
    }

    /**
     * Get the ipConfigurations property: List of references to IpConfigurations.
     *
     * @return the ipConfigurations value.
     */
    public List<SubResource> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Get the virtualRouterAsn property: VirtualRouter ASN.
     *
     * @return the virtualRouterAsn value.
     */
    public Long virtualRouterAsn() {
        return this.virtualRouterAsn;
    }

    /**
     * Set the virtualRouterAsn property: VirtualRouter ASN.
     *
     * @param virtualRouterAsn the virtualRouterAsn value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withVirtualRouterAsn(Long virtualRouterAsn) {
        this.virtualRouterAsn = virtualRouterAsn;
        return this;
    }

    /**
     * Get the virtualRouterIps property: VirtualRouter IPs.
     *
     * @return the virtualRouterIps value.
     */
    public List<String> virtualRouterIps() {
        return this.virtualRouterIps;
    }

    /**
     * Set the virtualRouterIps property: VirtualRouter IPs.
     *
     * @param virtualRouterIps the virtualRouterIps value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withVirtualRouterIps(List<String> virtualRouterIps) {
        this.virtualRouterIps = virtualRouterIps;
        return this;
    }

    /**
     * Get the allowBranchToBranchTraffic property: Flag to control transit for VirtualRouter hub.
     *
     * @return the allowBranchToBranchTraffic value.
     */
    public Boolean allowBranchToBranchTraffic() {
        return this.allowBranchToBranchTraffic;
    }

    /**
     * Set the allowBranchToBranchTraffic property: Flag to control transit for VirtualRouter hub.
     *
     * @param allowBranchToBranchTraffic the allowBranchToBranchTraffic value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withAllowBranchToBranchTraffic(Boolean allowBranchToBranchTraffic) {
        this.allowBranchToBranchTraffic = allowBranchToBranchTraffic;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualHubInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualHubInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (routeTable() != null) {
            routeTable().validate();
        }
        if (virtualHubRouteTableV2S() != null) {
            virtualHubRouteTableV2S().forEach(e -> e.validate());
        }
    }
}