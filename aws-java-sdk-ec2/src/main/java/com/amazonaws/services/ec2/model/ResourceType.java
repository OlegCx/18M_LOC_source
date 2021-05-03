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

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ResourceType {

    ClientVpnEndpoint("client-vpn-endpoint"),
    CustomerGateway("customer-gateway"),
    DedicatedHost("dedicated-host"),
    DhcpOptions("dhcp-options"),
    EgressOnlyInternetGateway("egress-only-internet-gateway"),
    ElasticIp("elastic-ip"),
    ElasticGpu("elastic-gpu"),
    ExportImageTask("export-image-task"),
    ExportInstanceTask("export-instance-task"),
    Fleet("fleet"),
    FpgaImage("fpga-image"),
    HostReservation("host-reservation"),
    Image("image"),
    ImportImageTask("import-image-task"),
    ImportSnapshotTask("import-snapshot-task"),
    Instance("instance"),
    InternetGateway("internet-gateway"),
    KeyPair("key-pair"),
    LaunchTemplate("launch-template"),
    LocalGatewayRouteTableVpcAssociation("local-gateway-route-table-vpc-association"),
    Natgateway("natgateway"),
    NetworkAcl("network-acl"),
    NetworkInterface("network-interface"),
    NetworkInsightsAnalysis("network-insights-analysis"),
    NetworkInsightsPath("network-insights-path"),
    PlacementGroup("placement-group"),
    ReservedInstances("reserved-instances"),
    RouteTable("route-table"),
    SecurityGroup("security-group"),
    Snapshot("snapshot"),
    SpotFleetRequest("spot-fleet-request"),
    SpotInstancesRequest("spot-instances-request"),
    Subnet("subnet"),
    TrafficMirrorFilter("traffic-mirror-filter"),
    TrafficMirrorSession("traffic-mirror-session"),
    TrafficMirrorTarget("traffic-mirror-target"),
    TransitGateway("transit-gateway"),
    TransitGatewayAttachment("transit-gateway-attachment"),
    TransitGatewayConnectPeer("transit-gateway-connect-peer"),
    TransitGatewayMulticastDomain("transit-gateway-multicast-domain"),
    TransitGatewayRouteTable("transit-gateway-route-table"),
    Volume("volume"),
    Vpc("vpc"),
    VpcPeeringConnection("vpc-peering-connection"),
    VpnConnection("vpn-connection"),
    VpnGateway("vpn-gateway"),
    VpcFlowLog("vpc-flow-log");

    private String value;

    private ResourceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return ResourceType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ResourceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ResourceType enumEntry : ResourceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
