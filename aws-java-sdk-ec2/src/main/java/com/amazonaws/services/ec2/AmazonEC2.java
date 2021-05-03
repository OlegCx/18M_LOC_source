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
package com.amazonaws.services.ec2;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.services.ec2.waiters.AmazonEC2Waiters;

/**
 * Interface for accessing Amazon EC2.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ec2.AbstractAmazonEC2} instead.
 * </p>
 * <p>
 * <fullname>Amazon Elastic Compute Cloud</fullname>
 * <p>
 * Amazon Elastic Compute Cloud (Amazon EC2) provides secure and resizable computing capacity in the AWS Cloud. Using
 * Amazon EC2 eliminates the need to invest in hardware up front, so you can develop and deploy applications faster.
 * Amazon Virtual Private Cloud (Amazon VPC) enables you to provision a logically isolated section of the AWS Cloud
 * where you can launch AWS resources in a virtual network that you've defined. Amazon Elastic Block Store (Amazon EBS)
 * provides block level storage volumes for use with EC2 instances. EBS volumes are highly available and reliable
 * storage volumes that can be attached to any running instance and used like a hard drive.
 * </p>
 * <p>
 * To learn more, see the following resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Amazon EC2: <a href="http://aws.amazon.com/ec2">AmazonEC2 product page</a>, <a
 * href="http://aws.amazon.com/documentation/ec2">Amazon EC2 documentation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EBS: <a href="http://aws.amazon.com/ebs">Amazon EBS product page</a>, <a
 * href="http://aws.amazon.com/documentation/ebs">Amazon EBS documentation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon VPC: <a href="http://aws.amazon.com/vpc">Amazon VPC product page</a>, <a
 * href="http://aws.amazon.com/documentation/vpc">Amazon VPC documentation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS VPN: <a href="http://aws.amazon.com/vpn">AWS VPN product page</a>, <a
 * href="http://aws.amazon.com/documentation/vpn">AWS VPN documentation</a>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonEC2 {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "ec2";

    /**
     * Overrides the default endpoint for this client ("https://ec2.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ec2.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://ec2.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from
     * this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "ec2.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://ec2.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonEC2#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See
     *        {@link com.amazonaws.regions.Region#getRegion(com.amazonaws.regions.Regions)} for accessing a given
     *        region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see com.amazonaws.regions.Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(com.amazonaws.regions.Region region);

    /**
     * <p>
     * Accepts the Convertible Reserved Instance exchange quote described in the
     * <a>GetReservedInstancesExchangeQuote</a> call.
     * </p>
     * 
     * @param acceptReservedInstancesExchangeQuoteRequest
     *        Contains the parameters for accepting the quote.
     * @return Result of the AcceptReservedInstancesExchangeQuote operation returned by the service.
     * @sample AmazonEC2.AcceptReservedInstancesExchangeQuote
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AcceptReservedInstancesExchangeQuote"
     *      target="_top">AWS API Documentation</a>
     */
    AcceptReservedInstancesExchangeQuoteResult acceptReservedInstancesExchangeQuote(
            AcceptReservedInstancesExchangeQuoteRequest acceptReservedInstancesExchangeQuoteRequest);

    /**
     * <p>
     * Accepts a request to associate subnets with a transit gateway multicast domain.
     * </p>
     * 
     * @param acceptTransitGatewayMulticastDomainAssociationsRequest
     * @return Result of the AcceptTransitGatewayMulticastDomainAssociations operation returned by the service.
     * @sample AmazonEC2.AcceptTransitGatewayMulticastDomainAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AcceptTransitGatewayMulticastDomainAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    AcceptTransitGatewayMulticastDomainAssociationsResult acceptTransitGatewayMulticastDomainAssociations(
            AcceptTransitGatewayMulticastDomainAssociationsRequest acceptTransitGatewayMulticastDomainAssociationsRequest);

    /**
     * <p>
     * Accepts a transit gateway peering attachment request. The peering attachment must be in the
     * <code>pendingAcceptance</code> state.
     * </p>
     * 
     * @param acceptTransitGatewayPeeringAttachmentRequest
     * @return Result of the AcceptTransitGatewayPeeringAttachment operation returned by the service.
     * @sample AmazonEC2.AcceptTransitGatewayPeeringAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AcceptTransitGatewayPeeringAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    AcceptTransitGatewayPeeringAttachmentResult acceptTransitGatewayPeeringAttachment(
            AcceptTransitGatewayPeeringAttachmentRequest acceptTransitGatewayPeeringAttachmentRequest);

    /**
     * <p>
     * Accepts a request to attach a VPC to a transit gateway.
     * </p>
     * <p>
     * The VPC attachment must be in the <code>pendingAcceptance</code> state. Use
     * <a>DescribeTransitGatewayVpcAttachments</a> to view your pending VPC attachment requests. Use
     * <a>RejectTransitGatewayVpcAttachment</a> to reject a VPC attachment request.
     * </p>
     * 
     * @param acceptTransitGatewayVpcAttachmentRequest
     * @return Result of the AcceptTransitGatewayVpcAttachment operation returned by the service.
     * @sample AmazonEC2.AcceptTransitGatewayVpcAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AcceptTransitGatewayVpcAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    AcceptTransitGatewayVpcAttachmentResult acceptTransitGatewayVpcAttachment(AcceptTransitGatewayVpcAttachmentRequest acceptTransitGatewayVpcAttachmentRequest);

    /**
     * <p>
     * Accepts one or more interface VPC endpoint connection requests to your VPC endpoint service.
     * </p>
     * 
     * @param acceptVpcEndpointConnectionsRequest
     * @return Result of the AcceptVpcEndpointConnections operation returned by the service.
     * @sample AmazonEC2.AcceptVpcEndpointConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AcceptVpcEndpointConnections"
     *      target="_top">AWS API Documentation</a>
     */
    AcceptVpcEndpointConnectionsResult acceptVpcEndpointConnections(AcceptVpcEndpointConnectionsRequest acceptVpcEndpointConnectionsRequest);

    /**
     * <p>
     * Accept a VPC peering connection request. To accept a request, the VPC peering connection must be in the
     * <code>pending-acceptance</code> state, and you must be the owner of the peer VPC. Use
     * <a>DescribeVpcPeeringConnections</a> to view your outstanding VPC peering connection requests.
     * </p>
     * <p>
     * For an inter-Region VPC peering connection request, you must accept the VPC peering connection in the Region of
     * the accepter VPC.
     * </p>
     * 
     * @param acceptVpcPeeringConnectionRequest
     * @return Result of the AcceptVpcPeeringConnection operation returned by the service.
     * @sample AmazonEC2.AcceptVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AcceptVpcPeeringConnection" target="_top">AWS
     *      API Documentation</a>
     */
    AcceptVpcPeeringConnectionResult acceptVpcPeeringConnection(AcceptVpcPeeringConnectionRequest acceptVpcPeeringConnectionRequest);

    /**
     * Simplified method form for invoking the AcceptVpcPeeringConnection operation.
     *
     * @see #acceptVpcPeeringConnection(AcceptVpcPeeringConnectionRequest)
     */
    AcceptVpcPeeringConnectionResult acceptVpcPeeringConnection();

    /**
     * <p>
     * Advertises an IPv4 or IPv6 address range that is provisioned for use with your AWS resources through bring your
     * own IP addresses (BYOIP).
     * </p>
     * <p>
     * You can perform this operation at most once every 10 seconds, even if you specify different address ranges each
     * time.
     * </p>
     * <p>
     * We recommend that you stop advertising the BYOIP CIDR from other locations when you advertise it from AWS. To
     * minimize down time, you can configure your AWS resources to use an address from a BYOIP CIDR before it is
     * advertised, and then simultaneously stop advertising it from the current location and start advertising it
     * through AWS.
     * </p>
     * <p>
     * It can take a few minutes before traffic to the specified addresses starts routing to AWS because of BGP
     * propagation delays.
     * </p>
     * <p>
     * To stop advertising the BYOIP CIDR, use <a>WithdrawByoipCidr</a>.
     * </p>
     * 
     * @param advertiseByoipCidrRequest
     * @return Result of the AdvertiseByoipCidr operation returned by the service.
     * @sample AmazonEC2.AdvertiseByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AdvertiseByoipCidr" target="_top">AWS API
     *      Documentation</a>
     */
    AdvertiseByoipCidrResult advertiseByoipCidr(AdvertiseByoipCidrRequest advertiseByoipCidrRequest);

    /**
     * <p>
     * Allocates an Elastic IP address to your AWS account. After you allocate the Elastic IP address you can associate
     * it with an instance or network interface. After you release an Elastic IP address, it is released to the IP
     * address pool and can be allocated to a different AWS account.
     * </p>
     * <p>
     * You can allocate an Elastic IP address from an address pool owned by AWS or from an address pool created from a
     * public IPv4 address range that you have brought to AWS for use with your AWS resources using bring your own IP
     * addresses (BYOIP). For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html">Bring Your Own IP Addresses (BYOIP)</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * [EC2-VPC] If you release an Elastic IP address, you might be able to recover it. You cannot recover an Elastic IP
     * address that you released after it is allocated to another AWS account. You cannot recover an Elastic IP address
     * for EC2-Classic. To attempt to recover an Elastic IP address that you released, specify it in this operation.
     * </p>
     * <p>
     * An Elastic IP address is for use either in the EC2-Classic platform or in a VPC. By default, you can allocate 5
     * Elastic IP addresses for EC2-Classic per Region and 5 Elastic IP addresses for EC2-VPC per Region.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP Addresses</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * You can allocate a carrier IP address which is a public IP address from a telecommunication carrier, to a network
     * interface which resides in a subnet in a Wavelength Zone (for example an EC2 instance).
     * </p>
     * 
     * @param allocateAddressRequest
     * @return Result of the AllocateAddress operation returned by the service.
     * @sample AmazonEC2.AllocateAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AllocateAddress" target="_top">AWS API
     *      Documentation</a>
     */
    AllocateAddressResult allocateAddress(AllocateAddressRequest allocateAddressRequest);

    /**
     * Simplified method form for invoking the AllocateAddress operation.
     *
     * @see #allocateAddress(AllocateAddressRequest)
     */
    AllocateAddressResult allocateAddress();

    /**
     * <p>
     * Allocates a Dedicated Host to your account. At a minimum, specify the supported instance type or instance family,
     * the Availability Zone in which to allocate the host, and the number of hosts to allocate.
     * </p>
     * 
     * @param allocateHostsRequest
     * @return Result of the AllocateHosts operation returned by the service.
     * @sample AmazonEC2.AllocateHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AllocateHosts" target="_top">AWS API
     *      Documentation</a>
     */
    AllocateHostsResult allocateHosts(AllocateHostsRequest allocateHostsRequest);

    /**
     * <p>
     * Applies a security group to the association between the target network and the Client VPN endpoint. This action
     * replaces the existing security groups with the specified security groups.
     * </p>
     * 
     * @param applySecurityGroupsToClientVpnTargetNetworkRequest
     * @return Result of the ApplySecurityGroupsToClientVpnTargetNetwork operation returned by the service.
     * @sample AmazonEC2.ApplySecurityGroupsToClientVpnTargetNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ApplySecurityGroupsToClientVpnTargetNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    ApplySecurityGroupsToClientVpnTargetNetworkResult applySecurityGroupsToClientVpnTargetNetwork(
            ApplySecurityGroupsToClientVpnTargetNetworkRequest applySecurityGroupsToClientVpnTargetNetworkRequest);

    /**
     * <p>
     * Assigns one or more IPv6 addresses to the specified network interface. You can specify one or more specific IPv6
     * addresses, or you can specify the number of IPv6 addresses to be automatically assigned from within the subnet's
     * IPv6 CIDR block range. You can assign as many IPv6 addresses to a network interface as you can assign private
     * IPv4 addresses, and the limit varies per instance type. For information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI">IP Addresses Per
     * Network Interface Per Instance Type</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * You must specify either the IPv6 addresses or the IPv6 address count in the request.
     * </p>
     * 
     * @param assignIpv6AddressesRequest
     * @return Result of the AssignIpv6Addresses operation returned by the service.
     * @sample AmazonEC2.AssignIpv6Addresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssignIpv6Addresses" target="_top">AWS API
     *      Documentation</a>
     */
    AssignIpv6AddressesResult assignIpv6Addresses(AssignIpv6AddressesRequest assignIpv6AddressesRequest);

    /**
     * <p>
     * Assigns one or more secondary private IP addresses to the specified network interface.
     * </p>
     * <p>
     * You can specify one or more specific secondary IP addresses, or you can specify the number of secondary IP
     * addresses to be automatically assigned within the subnet's CIDR block range. The number of secondary IP addresses
     * that you can assign to an instance varies by instance type. For information about instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>. For more information about Elastic IP addresses, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP Addresses</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * When you move a secondary private IP address to another network interface, any Elastic IP address that is
     * associated with the IP address is also moved.
     * </p>
     * <p>
     * Remapping an IP address is an asynchronous operation. When you move an IP address from one network interface to
     * another, check <code>network/interfaces/macs/mac/local-ipv4s</code> in the instance metadata to confirm that the
     * remapping is complete.
     * </p>
     * <p>
     * You must specify either the IP addresses or the IP address count in the request.
     * </p>
     * 
     * @param assignPrivateIpAddressesRequest
     *        Contains the parameters for AssignPrivateIpAddresses.
     * @return Result of the AssignPrivateIpAddresses operation returned by the service.
     * @sample AmazonEC2.AssignPrivateIpAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssignPrivateIpAddresses" target="_top">AWS
     *      API Documentation</a>
     */
    AssignPrivateIpAddressesResult assignPrivateIpAddresses(AssignPrivateIpAddressesRequest assignPrivateIpAddressesRequest);

    /**
     * <p>
     * Associates an Elastic IP address, or carrier IP address (for instances that are in subnets in Wavelength Zones)
     * with an instance or a network interface. Before you can use an Elastic IP address, you must allocate it to your
     * account.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP Addresses</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * [EC2-Classic, VPC in an EC2-VPC-only account] If the Elastic IP address is already associated with a different
     * instance, it is disassociated from that instance and associated with the specified instance. If you associate an
     * Elastic IP address with an instance that has an existing Elastic IP address, the existing address is
     * disassociated from the instance, but remains allocated to your account.
     * </p>
     * <p>
     * [VPC in an EC2-Classic account] If you don't specify a private IP address, the Elastic IP address is associated
     * with the primary IP address. If the Elastic IP address is already associated with a different instance or a
     * network interface, you get an error unless you allow reassociation. You cannot associate an Elastic IP address
     * with an instance or network interface that has an existing Elastic IP address.
     * </p>
     * <p>
     * [Subnets in Wavelength Zones] You can associate an IP address from the telecommunication carrier to the instance
     * or network interface.
     * </p>
     * <p>
     * You cannot associate an Elastic IP address with an interface in a different network border group.
     * </p>
     * <important>
     * <p>
     * This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error,
     * and you may be charged for each time the Elastic IP address is remapped to the same instance. For more
     * information, see the <i>Elastic IP Addresses</i> section of <a href="http://aws.amazon.com/ec2/pricing/">Amazon
     * EC2 Pricing</a>.
     * </p>
     * </important>
     * 
     * @param associateAddressRequest
     * @return Result of the AssociateAddress operation returned by the service.
     * @sample AmazonEC2.AssociateAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateAddress" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateAddressResult associateAddress(AssociateAddressRequest associateAddressRequest);

    /**
     * <p>
     * Associates a target network with a Client VPN endpoint. A target network is a subnet in a VPC. You can associate
     * multiple subnets from the same VPC with a Client VPN endpoint. You can associate only one subnet in each
     * Availability Zone. We recommend that you associate at least two subnets to provide Availability Zone redundancy.
     * </p>
     * <p>
     * If you specified a VPC when you created the Client VPN endpoint or if you have previous subnet associations, the
     * specified subnet must be in the same VPC. To specify a subnet that's in a different VPC, you must first modify
     * the Client VPN endpoint (<a>ModifyClientVpnEndpoint</a>) and change the VPC that's associated with it.
     * </p>
     * 
     * @param associateClientVpnTargetNetworkRequest
     * @return Result of the AssociateClientVpnTargetNetwork operation returned by the service.
     * @sample AmazonEC2.AssociateClientVpnTargetNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateClientVpnTargetNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateClientVpnTargetNetworkResult associateClientVpnTargetNetwork(AssociateClientVpnTargetNetworkRequest associateClientVpnTargetNetworkRequest);

    /**
     * <p>
     * Associates a set of DHCP options (that you've previously created) with the specified VPC, or associates no DHCP
     * options with the VPC.
     * </p>
     * <p>
     * After you associate the options with the VPC, any existing instances and all new instances that you launch in
     * that VPC use the options. You don't need to restart or relaunch the instances. They automatically pick up the
     * changes within a few hours, depending on how frequently the instance renews its DHCP lease. You can explicitly
     * renew the lease using the operating system on the instance.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_DHCP_Options.html">DHCP
     * Options Sets</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param associateDhcpOptionsRequest
     * @return Result of the AssociateDhcpOptions operation returned by the service.
     * @sample AmazonEC2.AssociateDhcpOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateDhcpOptions" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateDhcpOptionsResult associateDhcpOptions(AssociateDhcpOptionsRequest associateDhcpOptionsRequest);

    /**
     * <p>
     * Associates an AWS Identity and Access Management (IAM) role with an AWS Certificate Manager (ACM) certificate.
     * This enables the certificate to be used by the ACM for Nitro Enclaves application inside an enclave. For more
     * information, see <a href="https://docs.aws.amazon.com/enclaves/latest/user/nitro-enclave-refapp.html">AWS
     * Certificate Manager for Nitro Enclaves</a> in the <i>AWS Nitro Enclaves User Guide</i>.
     * </p>
     * <p>
     * When the IAM role is associated with the ACM certificate, the certificate, certificate chain, and encrypted
     * private key are placed in an Amazon S3 bucket that only the associated IAM role can access. The private key of
     * the certificate is encrypted with an AWS-managed KMS customer master (CMK) that has an attached attestation-based
     * CMK policy.
     * </p>
     * <p>
     * To enable the IAM role to access the Amazon S3 object, you must grant it permission to call
     * <code>s3:GetObject</code> on the Amazon S3 bucket returned by the command. To enable the IAM role to access the
     * AWS KMS CMK, you must grant it permission to call <code>kms:Decrypt</code> on the AWS KMS CMK returned by the
     * command. For more information, see <a
     * href="https://docs.aws.amazon.com/enclaves/latest/user/nitro-enclave-refapp.html#add-policy"> Grant the role
     * permission to access the certificate and encryption key</a> in the <i>AWS Nitro Enclaves User Guide</i>.
     * </p>
     * 
     * @param associateEnclaveCertificateIamRoleRequest
     * @return Result of the AssociateEnclaveCertificateIamRole operation returned by the service.
     * @sample AmazonEC2.AssociateEnclaveCertificateIamRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateEnclaveCertificateIamRole"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateEnclaveCertificateIamRoleResult associateEnclaveCertificateIamRole(
            AssociateEnclaveCertificateIamRoleRequest associateEnclaveCertificateIamRoleRequest);

    /**
     * <p>
     * Associates an IAM instance profile with a running or stopped instance. You cannot associate more than one IAM
     * instance profile with an instance.
     * </p>
     * 
     * @param associateIamInstanceProfileRequest
     * @return Result of the AssociateIamInstanceProfile operation returned by the service.
     * @sample AmazonEC2.AssociateIamInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateIamInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateIamInstanceProfileResult associateIamInstanceProfile(AssociateIamInstanceProfileRequest associateIamInstanceProfileRequest);

    /**
     * <p>
     * Associates a subnet in your VPC or an internet gateway or virtual private gateway attached to your VPC with a
     * route table in your VPC. This association causes traffic from the subnet or gateway to be routed according to the
     * routes in the route table. The action returns an association ID, which you need in order to disassociate the
     * route table later. A route table can be associated with multiple subnets.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html">Route
     * Tables</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param associateRouteTableRequest
     * @return Result of the AssociateRouteTable operation returned by the service.
     * @sample AmazonEC2.AssociateRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateRouteTable" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateRouteTableResult associateRouteTable(AssociateRouteTableRequest associateRouteTableRequest);

    /**
     * <p>
     * Associates a CIDR block with your subnet. You can only associate a single IPv6 CIDR block with your subnet. An
     * IPv6 CIDR block must have a prefix length of /64.
     * </p>
     * 
     * @param associateSubnetCidrBlockRequest
     * @return Result of the AssociateSubnetCidrBlock operation returned by the service.
     * @sample AmazonEC2.AssociateSubnetCidrBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateSubnetCidrBlock" target="_top">AWS
     *      API Documentation</a>
     */
    AssociateSubnetCidrBlockResult associateSubnetCidrBlock(AssociateSubnetCidrBlockRequest associateSubnetCidrBlockRequest);

    /**
     * <p>
     * Associates the specified subnets and transit gateway attachments with the specified transit gateway multicast
     * domain.
     * </p>
     * <p>
     * The transit gateway attachment must be in the available state before you can add a resource. Use <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeTransitGatewayAttachments.html"
     * >DescribeTransitGatewayAttachments</a> to see the state of the attachment.
     * </p>
     * 
     * @param associateTransitGatewayMulticastDomainRequest
     * @return Result of the AssociateTransitGatewayMulticastDomain operation returned by the service.
     * @sample AmazonEC2.AssociateTransitGatewayMulticastDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateTransitGatewayMulticastDomain"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateTransitGatewayMulticastDomainResult associateTransitGatewayMulticastDomain(
            AssociateTransitGatewayMulticastDomainRequest associateTransitGatewayMulticastDomainRequest);

    /**
     * <p>
     * Associates the specified attachment with the specified transit gateway route table. You can associate only one
     * route table with an attachment.
     * </p>
     * 
     * @param associateTransitGatewayRouteTableRequest
     * @return Result of the AssociateTransitGatewayRouteTable operation returned by the service.
     * @sample AmazonEC2.AssociateTransitGatewayRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateTransitGatewayRouteTable"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateTransitGatewayRouteTableResult associateTransitGatewayRouteTable(AssociateTransitGatewayRouteTableRequest associateTransitGatewayRouteTableRequest);

    /**
     * <p>
     * Associates a CIDR block with your VPC. You can associate a secondary IPv4 CIDR block, an Amazon-provided IPv6
     * CIDR block, or an IPv6 CIDR block from an IPv6 address pool that you provisioned through bring your own IP
     * addresses (<a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html">BYOIP</a>). The IPv6 CIDR
     * block size is fixed at /56.
     * </p>
     * <p>
     * You must specify one of the following in the request: an IPv4 CIDR block, an IPv6 pool, or an Amazon-provided
     * IPv6 CIDR block.
     * </p>
     * <p>
     * For more information about associating CIDR blocks with your VPC and applicable restrictions, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html#VPC_Sizing">VPC and Subnet Sizing</a> in
     * the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param associateVpcCidrBlockRequest
     * @return Result of the AssociateVpcCidrBlock operation returned by the service.
     * @sample AmazonEC2.AssociateVpcCidrBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AssociateVpcCidrBlock" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateVpcCidrBlockResult associateVpcCidrBlock(AssociateVpcCidrBlockRequest associateVpcCidrBlockRequest);

    /**
     * <p>
     * Links an EC2-Classic instance to a ClassicLink-enabled VPC through one or more of the VPC's security groups. You
     * cannot link an EC2-Classic instance to more than one VPC at a time. You can only link an instance that's in the
     * <code>running</code> state. An instance is automatically unlinked from a VPC when it's stopped - you can link it
     * to the VPC again when you restart it.
     * </p>
     * <p>
     * After you've linked an instance, you cannot change the VPC security groups that are associated with it. To change
     * the security groups, you must first unlink the instance, and then link it again.
     * </p>
     * <p>
     * Linking your instance to a VPC is sometimes referred to as <i>attaching</i> your instance.
     * </p>
     * 
     * @param attachClassicLinkVpcRequest
     * @return Result of the AttachClassicLinkVpc operation returned by the service.
     * @sample AmazonEC2.AttachClassicLinkVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachClassicLinkVpc" target="_top">AWS API
     *      Documentation</a>
     */
    AttachClassicLinkVpcResult attachClassicLinkVpc(AttachClassicLinkVpcRequest attachClassicLinkVpcRequest);

    /**
     * <p>
     * Attaches an internet gateway or a virtual private gateway to a VPC, enabling connectivity between the internet
     * and the VPC. For more information about your VPC and internet gateway, see the <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/">Amazon Virtual Private Cloud User Guide</a>.
     * </p>
     * 
     * @param attachInternetGatewayRequest
     * @return Result of the AttachInternetGateway operation returned by the service.
     * @sample AmazonEC2.AttachInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachInternetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    AttachInternetGatewayResult attachInternetGateway(AttachInternetGatewayRequest attachInternetGatewayRequest);

    /**
     * <p>
     * Attaches a network interface to an instance.
     * </p>
     * 
     * @param attachNetworkInterfaceRequest
     *        Contains the parameters for AttachNetworkInterface.
     * @return Result of the AttachNetworkInterface operation returned by the service.
     * @sample AmazonEC2.AttachNetworkInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachNetworkInterface" target="_top">AWS API
     *      Documentation</a>
     */
    AttachNetworkInterfaceResult attachNetworkInterface(AttachNetworkInterfaceRequest attachNetworkInterfaceRequest);

    /**
     * <p>
     * Attaches an EBS volume to a running or stopped instance and exposes it to the instance with the specified device
     * name.
     * </p>
     * <p>
     * Encrypted EBS volumes must be attached to instances that support Amazon EBS encryption. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * After you attach an EBS volume, you must make it available. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-using-volumes.html">Making an EBS volume available
     * for use</a>.
     * </p>
     * <p>
     * If a volume has an AWS Marketplace product code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The volume can be attached only to a stopped instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Marketplace product codes are copied from the volume to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must be subscribed to the product.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance type and operating system of the instance must support the product. For example, you can't detach a
     * volume from a Windows instance and attach it to a Linux instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-attaching-volume.html">Attaching Amazon EBS
     * volumes</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param attachVolumeRequest
     * @return Result of the AttachVolume operation returned by the service.
     * @sample AmazonEC2.AttachVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachVolume" target="_top">AWS API
     *      Documentation</a>
     */
    AttachVolumeResult attachVolume(AttachVolumeRequest attachVolumeRequest);

    /**
     * <p>
     * Attaches a virtual private gateway to a VPC. You can attach one virtual private gateway to one VPC at a time.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS Site-to-Site
     * VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * 
     * @param attachVpnGatewayRequest
     *        Contains the parameters for AttachVpnGateway.
     * @return Result of the AttachVpnGateway operation returned by the service.
     * @sample AmazonEC2.AttachVpnGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AttachVpnGateway" target="_top">AWS API
     *      Documentation</a>
     */
    AttachVpnGatewayResult attachVpnGateway(AttachVpnGatewayRequest attachVpnGatewayRequest);

    /**
     * <p>
     * Adds an ingress authorization rule to a Client VPN endpoint. Ingress authorization rules act as firewall rules
     * that grant access to networks. You must configure ingress authorization rules to enable clients to access
     * resources in AWS or on-premises networks.
     * </p>
     * 
     * @param authorizeClientVpnIngressRequest
     * @return Result of the AuthorizeClientVpnIngress operation returned by the service.
     * @sample AmazonEC2.AuthorizeClientVpnIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AuthorizeClientVpnIngress" target="_top">AWS
     *      API Documentation</a>
     */
    AuthorizeClientVpnIngressResult authorizeClientVpnIngress(AuthorizeClientVpnIngressRequest authorizeClientVpnIngressRequest);

    /**
     * <p>
     * [VPC only] Adds the specified egress rules to a security group for use with a VPC.
     * </p>
     * <p>
     * An outbound rule permits instances to send traffic to the specified IPv4 or IPv6 CIDR address ranges, or to the
     * instances associated with the specified destination security groups.
     * </p>
     * <p>
     * You specify a protocol for each rule (for example, TCP). For the TCP and UDP protocols, you must also specify the
     * destination port or port range. For the ICMP protocol, you must also specify the ICMP type and code. You can use
     * -1 for the type or code to mean all types or all codes.
     * </p>
     * <p>
     * Rule changes are propagated to affected instances as quickly as possible. However, a small delay might occur.
     * </p>
     * <p>
     * For more information about VPC security group limits, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html">Amazon VPC Limits</a>.
     * </p>
     * 
     * @param authorizeSecurityGroupEgressRequest
     * @return Result of the AuthorizeSecurityGroupEgress operation returned by the service.
     * @sample AmazonEC2.AuthorizeSecurityGroupEgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AuthorizeSecurityGroupEgress"
     *      target="_top">AWS API Documentation</a>
     */
    AuthorizeSecurityGroupEgressResult authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest authorizeSecurityGroupEgressRequest);

    /**
     * <p>
     * Adds the specified ingress rules to a security group.
     * </p>
     * <p>
     * An inbound rule permits instances to receive traffic from the specified IPv4 or IPv6 CIDR address ranges, or from
     * the instances associated with the specified destination security groups.
     * </p>
     * <p>
     * You specify a protocol for each rule (for example, TCP). For TCP and UDP, you must also specify the destination
     * port or port range. For ICMP/ICMPv6, you must also specify the ICMP/ICMPv6 type and code. You can use -1 to mean
     * all types or all codes.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay
     * might occur.
     * </p>
     * <p>
     * For more information about VPC security group limits, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html">Amazon VPC Limits</a>.
     * </p>
     * 
     * @param authorizeSecurityGroupIngressRequest
     * @return Result of the AuthorizeSecurityGroupIngress operation returned by the service.
     * @sample AmazonEC2.AuthorizeSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AuthorizeSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    AuthorizeSecurityGroupIngressResult authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest authorizeSecurityGroupIngressRequest);

    /**
     * <p>
     * Bundles an Amazon instance store-backed Windows instance.
     * </p>
     * <p>
     * During bundling, only the root device volume (C:\) is bundled. Data on other instance store volumes is not
     * preserved.
     * </p>
     * <note>
     * <p>
     * This action is not applicable for Linux/Unix instances or Windows instances that are backed by Amazon EBS.
     * </p>
     * </note>
     * 
     * @param bundleInstanceRequest
     *        Contains the parameters for BundleInstance.
     * @return Result of the BundleInstance operation returned by the service.
     * @sample AmazonEC2.BundleInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/BundleInstance" target="_top">AWS API
     *      Documentation</a>
     */
    BundleInstanceResult bundleInstance(BundleInstanceRequest bundleInstanceRequest);

    /**
     * <p>
     * Cancels a bundling operation for an instance store-backed Windows instance.
     * </p>
     * 
     * @param cancelBundleTaskRequest
     *        Contains the parameters for CancelBundleTask.
     * @return Result of the CancelBundleTask operation returned by the service.
     * @sample AmazonEC2.CancelBundleTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelBundleTask" target="_top">AWS API
     *      Documentation</a>
     */
    CancelBundleTaskResult cancelBundleTask(CancelBundleTaskRequest cancelBundleTaskRequest);

    /**
     * <p>
     * Cancels the specified Capacity Reservation, releases the reserved capacity, and changes the Capacity
     * Reservation's state to <code>cancelled</code>.
     * </p>
     * <p>
     * Instances running in the reserved capacity continue running until you stop them. Stopped instances that target
     * the Capacity Reservation can no longer launch. Modify these instances to either target a different Capacity
     * Reservation, launch On-Demand Instance capacity, or run in any open Capacity Reservation that has matching
     * attributes and sufficient capacity.
     * </p>
     * 
     * @param cancelCapacityReservationRequest
     * @return Result of the CancelCapacityReservation operation returned by the service.
     * @sample AmazonEC2.CancelCapacityReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelCapacityReservation" target="_top">AWS
     *      API Documentation</a>
     */
    CancelCapacityReservationResult cancelCapacityReservation(CancelCapacityReservationRequest cancelCapacityReservationRequest);

    /**
     * <p>
     * Cancels an active conversion task. The task can be the import of an instance or volume. The action removes all
     * artifacts of the conversion, including a partially uploaded volume or instance. If the conversion is complete or
     * is in the process of transferring the final disk image, the command fails and returns an exception.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/CommandLineReference/ec2-cli-vmimport-export.html">Importing a
     * Virtual Machine Using the Amazon EC2 CLI</a>.
     * </p>
     * 
     * @param cancelConversionTaskRequest
     * @return Result of the CancelConversionTask operation returned by the service.
     * @sample AmazonEC2.CancelConversionTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelConversionTask" target="_top">AWS API
     *      Documentation</a>
     */
    CancelConversionTaskResult cancelConversionTask(CancelConversionTaskRequest cancelConversionTaskRequest);

    /**
     * <p>
     * Cancels an active export task. The request removes all artifacts of the export, including any partially-created
     * Amazon S3 objects. If the export task is complete or is in the process of transferring the final disk image, the
     * command fails and returns an error.
     * </p>
     * 
     * @param cancelExportTaskRequest
     * @return Result of the CancelExportTask operation returned by the service.
     * @sample AmazonEC2.CancelExportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelExportTask" target="_top">AWS API
     *      Documentation</a>
     */
    CancelExportTaskResult cancelExportTask(CancelExportTaskRequest cancelExportTaskRequest);

    /**
     * <p>
     * Cancels an in-process import virtual machine or import snapshot task.
     * </p>
     * 
     * @param cancelImportTaskRequest
     * @return Result of the CancelImportTask operation returned by the service.
     * @sample AmazonEC2.CancelImportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelImportTask" target="_top">AWS API
     *      Documentation</a>
     */
    CancelImportTaskResult cancelImportTask(CancelImportTaskRequest cancelImportTaskRequest);

    /**
     * Simplified method form for invoking the CancelImportTask operation.
     *
     * @see #cancelImportTask(CancelImportTaskRequest)
     */
    CancelImportTaskResult cancelImportTask();

    /**
     * <p>
     * Cancels the specified Reserved Instance listing in the Reserved Instance Marketplace.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html">Reserved Instance
     * Marketplace</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param cancelReservedInstancesListingRequest
     *        Contains the parameters for CancelReservedInstancesListing.
     * @return Result of the CancelReservedInstancesListing operation returned by the service.
     * @sample AmazonEC2.CancelReservedInstancesListing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelReservedInstancesListing"
     *      target="_top">AWS API Documentation</a>
     */
    CancelReservedInstancesListingResult cancelReservedInstancesListing(CancelReservedInstancesListingRequest cancelReservedInstancesListingRequest);

    /**
     * <p>
     * Cancels the specified Spot Fleet requests.
     * </p>
     * <p>
     * After you cancel a Spot Fleet request, the Spot Fleet launches no new Spot Instances. You must specify whether
     * the Spot Fleet should also terminate its Spot Instances. If you terminate the instances, the Spot Fleet request
     * enters the <code>cancelled_terminating</code> state. Otherwise, the Spot Fleet request enters the
     * <code>cancelled_running</code> state and the instances continue to run until they are interrupted or you
     * terminate them manually.
     * </p>
     * 
     * @param cancelSpotFleetRequestsRequest
     *        Contains the parameters for CancelSpotFleetRequests.
     * @return Result of the CancelSpotFleetRequests operation returned by the service.
     * @sample AmazonEC2.CancelSpotFleetRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelSpotFleetRequests" target="_top">AWS
     *      API Documentation</a>
     */
    CancelSpotFleetRequestsResult cancelSpotFleetRequests(CancelSpotFleetRequestsRequest cancelSpotFleetRequestsRequest);

    /**
     * <p>
     * Cancels one or more Spot Instance requests.
     * </p>
     * <important>
     * <p>
     * Canceling a Spot Instance request does not terminate running Spot Instances associated with the request.
     * </p>
     * </important>
     * 
     * @param cancelSpotInstanceRequestsRequest
     *        Contains the parameters for CancelSpotInstanceRequests.
     * @return Result of the CancelSpotInstanceRequests operation returned by the service.
     * @sample AmazonEC2.CancelSpotInstanceRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelSpotInstanceRequests" target="_top">AWS
     *      API Documentation</a>
     */
    CancelSpotInstanceRequestsResult cancelSpotInstanceRequests(CancelSpotInstanceRequestsRequest cancelSpotInstanceRequestsRequest);

    /**
     * <p>
     * Determines whether a product code is associated with an instance. This action can only be used by the owner of
     * the product code. It is useful when a product code owner must verify whether another user's instance is eligible
     * for support.
     * </p>
     * 
     * @param confirmProductInstanceRequest
     * @return Result of the ConfirmProductInstance operation returned by the service.
     * @sample AmazonEC2.ConfirmProductInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ConfirmProductInstance" target="_top">AWS API
     *      Documentation</a>
     */
    ConfirmProductInstanceResult confirmProductInstance(ConfirmProductInstanceRequest confirmProductInstanceRequest);

    /**
     * <p>
     * Copies the specified Amazon FPGA Image (AFI) to the current Region.
     * </p>
     * 
     * @param copyFpgaImageRequest
     * @return Result of the CopyFpgaImage operation returned by the service.
     * @sample AmazonEC2.CopyFpgaImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CopyFpgaImage" target="_top">AWS API
     *      Documentation</a>
     */
    CopyFpgaImageResult copyFpgaImage(CopyFpgaImageRequest copyFpgaImageRequest);

    /**
     * <p>
     * Initiates the copy of an AMI. You can copy an AMI from one Region to another, or from a Region to an AWS Outpost.
     * You can't copy an AMI from an Outpost to a Region, from one Outpost to another, or within the same Outpost. To
     * copy an AMI to another partition, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateStoreImageTask.html"
     * >CreateStoreImageTask</a>.
     * </p>
     * <p>
     * To copy an AMI from one Region to another, specify the source Region using the <b>SourceRegion</b> parameter, and
     * specify the destination Region using its endpoint. Copies of encrypted backing snapshots for the AMI are
     * encrypted. Copies of unencrypted backing snapshots remain unencrypted, unless you set <code>Encrypted</code>
     * during the copy operation. You cannot create an unencrypted copy of an encrypted backing snapshot.
     * </p>
     * <p>
     * To copy an AMI from a Region to an Outpost, specify the source Region using the <b>SourceRegion</b> parameter,
     * and specify the ARN of the destination Outpost using <b>DestinationOutpostArn</b>. Backing snapshots copied to an
     * Outpost are encrypted by default using the default encryption key for the Region, or a different key that you
     * specify in the request using <b>KmsKeyId</b>. Outposts do not support unencrypted snapshots. For more
     * information, <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#ami"> Amazon
     * EBS local snapshots on Outposts</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * For more information about the prerequisites and limits when copying an AMI, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/CopyingAMIs.html">Copying an AMI</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param copyImageRequest
     *        Contains the parameters for CopyImage.
     * @return Result of the CopyImage operation returned by the service.
     * @sample AmazonEC2.CopyImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CopyImage" target="_top">AWS API
     *      Documentation</a>
     */
    CopyImageResult copyImage(CopyImageRequest copyImageRequest);

    /**
     * <p>
     * Copies a point-in-time snapshot of an EBS volume and stores it in Amazon S3. You can copy a snapshot within the
     * same Region, from one Region to another, or from a Region to an Outpost. You can't copy a snapshot from an
     * Outpost to a Region, from one Outpost to another, or within the same Outpost.
     * </p>
     * <p>
     * You can use the snapshot to create EBS volumes or Amazon Machine Images (AMIs).
     * </p>
     * <p>
     * When copying snapshots to a Region, copies of encrypted EBS snapshots remain encrypted. Copies of unencrypted
     * snapshots remain unencrypted, unless you enable encryption for the snapshot copy operation. By default, encrypted
     * snapshot copies use the default AWS Key Management Service (AWS KMS) customer master key (CMK); however, you can
     * specify a different CMK. To copy an encrypted snapshot that has been shared from another account, you must have
     * permissions for the CMK used to encrypt the snapshot.
     * </p>
     * <p>
     * Snapshots copied to an Outpost are encrypted by default using the default encryption key for the Region, or a
     * different key that you specify in the request using <b>KmsKeyId</b>. Outposts do not support unencrypted
     * snapshots. For more information, <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#ami"> Amazon EBS local
     * snapshots on Outposts</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Snapshots created by copying another snapshot have an arbitrary volume ID that should not be used for any
     * purpose.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-copy-snapshot.html">Copying an Amazon EBS
     * snapshot</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param copySnapshotRequest
     * @return Result of the CopySnapshot operation returned by the service.
     * @sample AmazonEC2.CopySnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CopySnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    CopySnapshotResult copySnapshot(CopySnapshotRequest copySnapshotRequest);

    /**
     * <p>
     * Creates a new Capacity Reservation with the specified attributes.
     * </p>
     * <p>
     * Capacity Reservations enable you to reserve capacity for your Amazon EC2 instances in a specific Availability
     * Zone for any duration. This gives you the flexibility to selectively add capacity reservations and still get the
     * Regional RI discounts for that usage. By creating Capacity Reservations, you ensure that you always have access
     * to Amazon EC2 capacity when you need it, for as long as you need it. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-capacity-reservations.html">Capacity
     * Reservations</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * Your request to create a Capacity Reservation could fail if Amazon EC2 does not have sufficient capacity to
     * fulfill the request. If your request fails due to Amazon EC2 capacity constraints, either try again at a later
     * time, try in a different Availability Zone, or request a smaller capacity reservation. If your application is
     * flexible across instance types and sizes, try to create a Capacity Reservation with different instance
     * attributes.
     * </p>
     * <p>
     * Your request could also fail if the requested quantity exceeds your On-Demand Instance limit for the selected
     * instance type. If your request fails due to limit constraints, increase your On-Demand Instance limit for the
     * required instance type and try again. For more information about increasing your instance limits, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html">Amazon EC2 Service Quotas</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param createCapacityReservationRequest
     * @return Result of the CreateCapacityReservation operation returned by the service.
     * @sample AmazonEC2.CreateCapacityReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateCapacityReservation" target="_top">AWS
     *      API Documentation</a>
     */
    CreateCapacityReservationResult createCapacityReservation(CreateCapacityReservationRequest createCapacityReservationRequest);

    /**
     * <p>
     * Creates a carrier gateway. For more information about carrier gateways, see <a href=
     * "https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#wavelength-carrier-gateway"
     * >Carrier gateways</a> in the <i>AWS Wavelength Developer Guide</i>.
     * </p>
     * 
     * @param createCarrierGatewayRequest
     * @return Result of the CreateCarrierGateway operation returned by the service.
     * @sample AmazonEC2.CreateCarrierGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateCarrierGateway" target="_top">AWS API
     *      Documentation</a>
     */
    CreateCarrierGatewayResult createCarrierGateway(CreateCarrierGatewayRequest createCarrierGatewayRequest);

    /**
     * <p>
     * Creates a Client VPN endpoint. A Client VPN endpoint is the resource you create and configure to enable and
     * manage client VPN sessions. It is the destination endpoint at which all client VPN sessions are terminated.
     * </p>
     * 
     * @param createClientVpnEndpointRequest
     * @return Result of the CreateClientVpnEndpoint operation returned by the service.
     * @sample AmazonEC2.CreateClientVpnEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateClientVpnEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    CreateClientVpnEndpointResult createClientVpnEndpoint(CreateClientVpnEndpointRequest createClientVpnEndpointRequest);

    /**
     * <p>
     * Adds a route to a network to a Client VPN endpoint. Each Client VPN endpoint has a route table that describes the
     * available destination network routes. Each route in the route table specifies the path for traﬃc to speciﬁc
     * resources or networks.
     * </p>
     * 
     * @param createClientVpnRouteRequest
     * @return Result of the CreateClientVpnRoute operation returned by the service.
     * @sample AmazonEC2.CreateClientVpnRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateClientVpnRoute" target="_top">AWS API
     *      Documentation</a>
     */
    CreateClientVpnRouteResult createClientVpnRoute(CreateClientVpnRouteRequest createClientVpnRouteRequest);

    /**
     * <p>
     * Provides information to AWS about your VPN customer gateway device. The customer gateway is the appliance at your
     * end of the VPN connection. (The device on the AWS side of the VPN connection is the virtual private gateway.) You
     * must provide the internet-routable IP address of the customer gateway's external interface. The IP address must
     * be static and can be behind a device performing network address translation (NAT).
     * </p>
     * <p>
     * For devices that use Border Gateway Protocol (BGP), you can also provide the device's BGP Autonomous System
     * Number (ASN). You can use an existing ASN assigned to your network. If you don't have an ASN already, you can use
     * a private ASN (in the 64512 - 65534 range).
     * </p>
     * <note>
     * <p>
     * Amazon EC2 supports all 4-byte ASN numbers in the range of 1 - 2147483647, with the exception of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 7224 - reserved in the <code>us-east-1</code> Region
     * </p>
     * </li>
     * <li>
     * <p>
     * 9059 - reserved in the <code>eu-west-1</code> Region
     * </p>
     * </li>
     * <li>
     * <p>
     * 17943 - reserved in the <code>ap-southeast-1</code> Region
     * </p>
     * </li>
     * <li>
     * <p>
     * 10124 - reserved in the <code>ap-northeast-1</code> Region
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS Site-to-Site
     * VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * <important>
     * <p>
     * To create more than one customer gateway with the same VPN type, IP address, and BGP ASN, specify a unique device
     * name for each customer gateway. Identical requests return information about the existing customer gateway and do
     * not create new customer gateways.
     * </p>
     * </important>
     * 
     * @param createCustomerGatewayRequest
     *        Contains the parameters for CreateCustomerGateway.
     * @return Result of the CreateCustomerGateway operation returned by the service.
     * @sample AmazonEC2.CreateCustomerGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateCustomerGateway" target="_top">AWS API
     *      Documentation</a>
     */
    CreateCustomerGatewayResult createCustomerGateway(CreateCustomerGatewayRequest createCustomerGatewayRequest);

    /**
     * <p>
     * Creates a default subnet with a size <code>/20</code> IPv4 CIDR block in the specified Availability Zone in your
     * default VPC. You can have only one default subnet per Availability Zone. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/default-vpc.html#create-default-subnet">Creating a Default
     * Subnet</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createDefaultSubnetRequest
     * @return Result of the CreateDefaultSubnet operation returned by the service.
     * @sample AmazonEC2.CreateDefaultSubnet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateDefaultSubnet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDefaultSubnetResult createDefaultSubnet(CreateDefaultSubnetRequest createDefaultSubnetRequest);

    /**
     * <p>
     * Creates a default VPC with a size <code>/16</code> IPv4 CIDR block and a default subnet in each Availability
     * Zone. For more information about the components of a default VPC, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/default-vpc.html">Default VPC and Default Subnets</a> in
     * the <i>Amazon Virtual Private Cloud User Guide</i>. You cannot specify the components of the default VPC
     * yourself.
     * </p>
     * <p>
     * If you deleted your previous default VPC, you can create a default VPC. You cannot have more than one default VPC
     * per Region.
     * </p>
     * <p>
     * If your account supports EC2-Classic, you cannot use this action to create a default VPC in a Region that
     * supports EC2-Classic. If you want a default VPC in a Region that supports EC2-Classic, see
     * "I really want a default VPC for my existing EC2 account. Is that possible?" in the <a
     * href="http://aws.amazon.com/vpc/faqs/#Default_VPCs">Default VPCs FAQ</a>.
     * </p>
     * 
     * @param createDefaultVpcRequest
     * @return Result of the CreateDefaultVpc operation returned by the service.
     * @sample AmazonEC2.CreateDefaultVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateDefaultVpc" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDefaultVpcResult createDefaultVpc(CreateDefaultVpcRequest createDefaultVpcRequest);

    /**
     * <p>
     * Creates a set of DHCP options for your VPC. After creating the set, you must associate it with the VPC, causing
     * all existing and new instances that you launch in the VPC to use this set of DHCP options. The following are the
     * individual DHCP options you can specify. For more information about the options, see <a
     * href="http://www.ietf.org/rfc/rfc2132.txt">RFC 2132</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>domain-name-servers</code> - The IP addresses of up to four domain name servers, or AmazonProvidedDNS. The
     * default DHCP option set specifies AmazonProvidedDNS. If specifying more than one domain name server, specify the
     * IP addresses in a single parameter, separated by commas. To have your instance receive a custom DNS hostname as
     * specified in <code>domain-name</code>, you must set <code>domain-name-servers</code> to a custom DNS server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>domain-name</code> - If you're using AmazonProvidedDNS in <code>us-east-1</code>, specify
     * <code>ec2.internal</code>. If you're using AmazonProvidedDNS in another Region, specify
     * <code>region.compute.internal</code> (for example, <code>ap-northeast-1.compute.internal</code>). Otherwise,
     * specify a domain name (for example, <code>ExampleCompany.com</code>). This value is used to complete unqualified
     * DNS hostnames. <b>Important</b>: Some Linux operating systems accept multiple domain names separated by spaces.
     * However, Windows and other Linux operating systems treat the value as a single domain, which results in
     * unexpected behavior. If your DHCP options set is associated with a VPC that has instances with multiple operating
     * systems, specify only one domain name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ntp-servers</code> - The IP addresses of up to four Network Time Protocol (NTP) servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>netbios-name-servers</code> - The IP addresses of up to four NetBIOS name servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>netbios-node-type</code> - The NetBIOS node type (1, 2, 4, or 8). We recommend that you specify 2
     * (broadcast and multicast are not currently supported). For more information about these node types, see <a
     * href="http://www.ietf.org/rfc/rfc2132.txt">RFC 2132</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Your VPC automatically starts out with a set of DHCP options that includes only a DNS server that we provide
     * (AmazonProvidedDNS). If you create a set of options, and if your VPC has an internet gateway, make sure to set
     * the <code>domain-name-servers</code> option either to <code>AmazonProvidedDNS</code> or to a domain name server
     * of your choice. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_DHCP_Options.html">DHCP Options Sets</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createDhcpOptionsRequest
     * @return Result of the CreateDhcpOptions operation returned by the service.
     * @sample AmazonEC2.CreateDhcpOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateDhcpOptions" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDhcpOptionsResult createDhcpOptions(CreateDhcpOptionsRequest createDhcpOptionsRequest);

    /**
     * <p>
     * [IPv6 only] Creates an egress-only internet gateway for your VPC. An egress-only internet gateway is used to
     * enable outbound communication over IPv6 from instances in your VPC to the internet, and prevents hosts outside of
     * your VPC from initiating an IPv6 connection with your instance.
     * </p>
     * 
     * @param createEgressOnlyInternetGatewayRequest
     * @return Result of the CreateEgressOnlyInternetGateway operation returned by the service.
     * @sample AmazonEC2.CreateEgressOnlyInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateEgressOnlyInternetGateway"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEgressOnlyInternetGatewayResult createEgressOnlyInternetGateway(CreateEgressOnlyInternetGatewayRequest createEgressOnlyInternetGatewayRequest);

    /**
     * <p>
     * Launches an EC2 Fleet.
     * </p>
     * <p>
     * You can create a single EC2 Fleet that includes multiple launch specifications that vary by instance type, AMI,
     * Availability Zone, or subnet.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet.html">Launching
     * an EC2 Fleet</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param createFleetRequest
     * @return Result of the CreateFleet operation returned by the service.
     * @sample AmazonEC2.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFleetResult createFleet(CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * Creates one or more flow logs to capture information about IP traffic for a specific network interface, subnet,
     * or VPC.
     * </p>
     * <p>
     * Flow log data for a monitored network interface is recorded as flow log records, which are log events consisting
     * of fields that describe the traffic flow. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records">Flow Log Records</a> in
     * the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * When publishing to CloudWatch Logs, flow log records are published to a log group, and each network interface has
     * a unique log stream in the log group. When publishing to Amazon S3, flow log records for all of the monitored
     * network interfaces are published to a single log file object that is stored in the specified bucket.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html">VPC Flow
     * Logs</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createFlowLogsRequest
     * @return Result of the CreateFlowLogs operation returned by the service.
     * @sample AmazonEC2.CreateFlowLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateFlowLogs" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFlowLogsResult createFlowLogs(CreateFlowLogsRequest createFlowLogsRequest);

    /**
     * <p>
     * Creates an Amazon FPGA Image (AFI) from the specified design checkpoint (DCP).
     * </p>
     * <p>
     * The create operation is asynchronous. To verify that the AFI is ready for use, check the output logs.
     * </p>
     * <p>
     * An AFI contains the FPGA bitstream that is ready to download to an FPGA. You can securely deploy an AFI on
     * multiple FPGA-accelerated instances. For more information, see the <a href="https://github.com/aws/aws-fpga/">AWS
     * FPGA Hardware Development Kit</a>.
     * </p>
     * 
     * @param createFpgaImageRequest
     * @return Result of the CreateFpgaImage operation returned by the service.
     * @sample AmazonEC2.CreateFpgaImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateFpgaImage" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFpgaImageResult createFpgaImage(CreateFpgaImageRequest createFpgaImageRequest);

    /**
     * <p>
     * Creates an Amazon EBS-backed AMI from an Amazon EBS-backed instance that is either running or stopped.
     * </p>
     * <p>
     * If you customized your instance with instance store volumes or EBS volumes in addition to the root device volume,
     * the new AMI contains block device mapping information for those volumes. When you launch an instance from this
     * new AMI, the instance automatically launches with those additional volumes.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html">Creating Amazon EBS-Backed
     * Linux AMIs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createImageRequest
     * @return Result of the CreateImage operation returned by the service.
     * @sample AmazonEC2.CreateImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateImage" target="_top">AWS API
     *      Documentation</a>
     */
    CreateImageResult createImage(CreateImageRequest createImageRequest);

    /**
     * <p>
     * Exports a running or stopped instance to an Amazon S3 bucket.
     * </p>
     * <p>
     * For information about the supported operating systems, image formats, and known limitations for the types of
     * instances you can export, see <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmexport.html">Exporting an instance as a VM Using
     * VM Import/Export</a> in the <i>VM Import/Export User Guide</i>.
     * </p>
     * 
     * @param createInstanceExportTaskRequest
     * @return Result of the CreateInstanceExportTask operation returned by the service.
     * @sample AmazonEC2.CreateInstanceExportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateInstanceExportTask" target="_top">AWS
     *      API Documentation</a>
     */
    CreateInstanceExportTaskResult createInstanceExportTask(CreateInstanceExportTaskRequest createInstanceExportTaskRequest);

    /**
     * <p>
     * Creates an internet gateway for use with a VPC. After creating the internet gateway, you attach it to a VPC using
     * <a>AttachInternetGateway</a>.
     * </p>
     * <p>
     * For more information about your VPC and internet gateway, see the <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/">Amazon Virtual Private Cloud User Guide</a>.
     * </p>
     * 
     * @param createInternetGatewayRequest
     * @return Result of the CreateInternetGateway operation returned by the service.
     * @sample AmazonEC2.CreateInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateInternetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    CreateInternetGatewayResult createInternetGateway(CreateInternetGatewayRequest createInternetGatewayRequest);

    /**
     * Simplified method form for invoking the CreateInternetGateway operation.
     *
     * @see #createInternetGateway(CreateInternetGatewayRequest)
     */
    CreateInternetGatewayResult createInternetGateway();

    /**
     * <p>
     * Creates a 2048-bit RSA key pair with the specified name. Amazon EC2 stores the public key and displays the
     * private key for you to save to a file. The private key is returned as an unencrypted PEM encoded PKCS#1 private
     * key. If a key with the specified name already exists, Amazon EC2 returns an error.
     * </p>
     * <p>
     * You can have up to five thousand key pairs per Region.
     * </p>
     * <p>
     * The key pair returned to you is available only in the Region in which you create it. If you prefer, you can
     * create your own key pair using a third-party tool and upload it to any Region using <a>ImportKeyPair</a>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Key
     * Pairs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createKeyPairRequest
     * @return Result of the CreateKeyPair operation returned by the service.
     * @sample AmazonEC2.CreateKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    CreateKeyPairResult createKeyPair(CreateKeyPairRequest createKeyPairRequest);

    /**
     * <p>
     * Creates a launch template. A launch template contains the parameters to launch an instance. When you launch an
     * instance using <a>RunInstances</a>, you can specify a launch template instead of providing the launch parameters
     * in the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html">Launching an instance from a
     * launch template</a>in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createLaunchTemplateRequest
     * @return Result of the CreateLaunchTemplate operation returned by the service.
     * @sample AmazonEC2.CreateLaunchTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateLaunchTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLaunchTemplateResult createLaunchTemplate(CreateLaunchTemplateRequest createLaunchTemplateRequest);

    /**
     * <p>
     * Creates a new version for a launch template. You can specify an existing version of launch template from which to
     * base the new version.
     * </p>
     * <p>
     * Launch template versions are numbered in the order in which they are created. You cannot specify, change, or
     * replace the numbering of launch template versions.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#manage-launch-template-versions"
     * >Managing launch template versions</a>in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createLaunchTemplateVersionRequest
     * @return Result of the CreateLaunchTemplateVersion operation returned by the service.
     * @sample AmazonEC2.CreateLaunchTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateLaunchTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLaunchTemplateVersionResult createLaunchTemplateVersion(CreateLaunchTemplateVersionRequest createLaunchTemplateVersionRequest);

    /**
     * <p>
     * Creates a static route for the specified local gateway route table.
     * </p>
     * 
     * @param createLocalGatewayRouteRequest
     * @return Result of the CreateLocalGatewayRoute operation returned by the service.
     * @sample AmazonEC2.CreateLocalGatewayRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateLocalGatewayRoute" target="_top">AWS
     *      API Documentation</a>
     */
    CreateLocalGatewayRouteResult createLocalGatewayRoute(CreateLocalGatewayRouteRequest createLocalGatewayRouteRequest);

    /**
     * <p>
     * Associates the specified VPC with the specified local gateway route table.
     * </p>
     * 
     * @param createLocalGatewayRouteTableVpcAssociationRequest
     * @return Result of the CreateLocalGatewayRouteTableVpcAssociation operation returned by the service.
     * @sample AmazonEC2.CreateLocalGatewayRouteTableVpcAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateLocalGatewayRouteTableVpcAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLocalGatewayRouteTableVpcAssociationResult createLocalGatewayRouteTableVpcAssociation(
            CreateLocalGatewayRouteTableVpcAssociationRequest createLocalGatewayRouteTableVpcAssociationRequest);

    /**
     * <p>
     * Creates a managed prefix list. You can specify one or more entries for the prefix list. Each entry consists of a
     * CIDR block and an optional description.
     * </p>
     * <p>
     * You must specify the maximum number of entries for the prefix list. The maximum number of entries cannot be
     * changed later.
     * </p>
     * 
     * @param createManagedPrefixListRequest
     * @return Result of the CreateManagedPrefixList operation returned by the service.
     * @sample AmazonEC2.CreateManagedPrefixList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateManagedPrefixList" target="_top">AWS
     *      API Documentation</a>
     */
    CreateManagedPrefixListResult createManagedPrefixList(CreateManagedPrefixListRequest createManagedPrefixListRequest);

    /**
     * <p>
     * Creates a NAT gateway in the specified public subnet. This action creates a network interface in the specified
     * subnet with a private IP address from the IP address range of the subnet. Internet-bound traffic from a private
     * subnet can be routed to the NAT gateway, therefore enabling instances in the private subnet to connect to the
     * internet. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html">NAT Gateways</a> in the <i>Amazon
     * Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createNatGatewayRequest
     * @return Result of the CreateNatGateway operation returned by the service.
     * @sample AmazonEC2.CreateNatGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNatGateway" target="_top">AWS API
     *      Documentation</a>
     */
    CreateNatGatewayResult createNatGateway(CreateNatGatewayRequest createNatGatewayRequest);

    /**
     * <p>
     * Creates a network ACL in a VPC. Network ACLs provide an optional layer of security (in addition to security
     * groups) for the instances in your VPC.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_ACLs.html">Network
     * ACLs</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createNetworkAclRequest
     * @return Result of the CreateNetworkAcl operation returned by the service.
     * @sample AmazonEC2.CreateNetworkAcl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNetworkAcl" target="_top">AWS API
     *      Documentation</a>
     */
    CreateNetworkAclResult createNetworkAcl(CreateNetworkAclRequest createNetworkAclRequest);

    /**
     * <p>
     * Creates an entry (a rule) in a network ACL with the specified rule number. Each network ACL has a set of numbered
     * ingress rules and a separate set of numbered egress rules. When determining whether a packet should be allowed in
     * or out of a subnet associated with the ACL, we process the entries in the ACL according to the rule numbers, in
     * ascending order. Each network ACL has a set of ingress rules and a separate set of egress rules.
     * </p>
     * <p>
     * We recommend that you leave room between the rule numbers (for example, 100, 110, 120, ...), and not number them
     * one right after the other (for example, 101, 102, 103, ...). This makes it easier to add a rule between existing
     * ones without having to renumber the rules.
     * </p>
     * <p>
     * After you add an entry, you can't modify it; you must either replace it, or create an entry and delete the old
     * one.
     * </p>
     * <p>
     * For more information about network ACLs, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_ACLs.html">Network ACLs</a> in the <i>Amazon Virtual
     * Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createNetworkAclEntryRequest
     * @return Result of the CreateNetworkAclEntry operation returned by the service.
     * @sample AmazonEC2.CreateNetworkAclEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNetworkAclEntry" target="_top">AWS API
     *      Documentation</a>
     */
    CreateNetworkAclEntryResult createNetworkAclEntry(CreateNetworkAclEntryRequest createNetworkAclEntryRequest);

    /**
     * <p>
     * Creates a path to analyze for reachability.
     * </p>
     * <p>
     * Reachability Analyzer enables you to analyze and debug network reachability between two resources in your virtual
     * private cloud (VPC). For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/reachability/">What is Reachability Analyzer</a>.
     * </p>
     * 
     * @param createNetworkInsightsPathRequest
     * @return Result of the CreateNetworkInsightsPath operation returned by the service.
     * @sample AmazonEC2.CreateNetworkInsightsPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNetworkInsightsPath" target="_top">AWS
     *      API Documentation</a>
     */
    CreateNetworkInsightsPathResult createNetworkInsightsPath(CreateNetworkInsightsPathRequest createNetworkInsightsPathRequest);

    /**
     * <p>
     * Creates a network interface in the specified subnet.
     * </p>
     * <p>
     * For more information about network interfaces, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network Interfaces</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createNetworkInterfaceRequest
     *        Contains the parameters for CreateNetworkInterface.
     * @return Result of the CreateNetworkInterface operation returned by the service.
     * @sample AmazonEC2.CreateNetworkInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNetworkInterface" target="_top">AWS API
     *      Documentation</a>
     */
    CreateNetworkInterfaceResult createNetworkInterface(CreateNetworkInterfaceRequest createNetworkInterfaceRequest);

    /**
     * <p>
     * Grants an AWS-authorized account permission to attach the specified network interface to an instance in their
     * account.
     * </p>
     * <p>
     * You can grant permission to a single AWS account only, and only one account at a time.
     * </p>
     * 
     * @param createNetworkInterfacePermissionRequest
     *        Contains the parameters for CreateNetworkInterfacePermission.
     * @return Result of the CreateNetworkInterfacePermission operation returned by the service.
     * @sample AmazonEC2.CreateNetworkInterfacePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateNetworkInterfacePermission"
     *      target="_top">AWS API Documentation</a>
     */
    CreateNetworkInterfacePermissionResult createNetworkInterfacePermission(CreateNetworkInterfacePermissionRequest createNetworkInterfacePermissionRequest);

    /**
     * <p>
     * Creates a placement group in which to launch instances. The strategy of the placement group determines how the
     * instances are organized within the group.
     * </p>
     * <p>
     * A <code>cluster</code> placement group is a logical grouping of instances within a single Availability Zone that
     * benefit from low network latency, high network throughput. A <code>spread</code> placement group places instances
     * on distinct hardware. A <code>partition</code> placement group places groups of instances in different
     * partitions, where instances in one partition do not share the same hardware with instances in another partition.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement groups</a> in the
     * <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param createPlacementGroupRequest
     * @return Result of the CreatePlacementGroup operation returned by the service.
     * @sample AmazonEC2.CreatePlacementGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreatePlacementGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePlacementGroupResult createPlacementGroup(CreatePlacementGroupRequest createPlacementGroupRequest);

    /**
     * <p>
     * Creates a root volume replacement task for an Amazon EC2 instance. The root volume can either be restored to its
     * initial launch state, or it can be restored using a specific snapshot.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/">Replace a root volume</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createReplaceRootVolumeTaskRequest
     * @return Result of the CreateReplaceRootVolumeTask operation returned by the service.
     * @sample AmazonEC2.CreateReplaceRootVolumeTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateReplaceRootVolumeTask"
     *      target="_top">AWS API Documentation</a>
     */
    CreateReplaceRootVolumeTaskResult createReplaceRootVolumeTask(CreateReplaceRootVolumeTaskRequest createReplaceRootVolumeTaskRequest);

    /**
     * <p>
     * Creates a listing for Amazon EC2 Standard Reserved Instances to be sold in the Reserved Instance Marketplace. You
     * can submit one Standard Reserved Instance listing at a time. To get a list of your Standard Reserved Instances,
     * you can use the <a>DescribeReservedInstances</a> operation.
     * </p>
     * <note>
     * <p>
     * Only Standard Reserved Instances can be sold in the Reserved Instance Marketplace. Convertible Reserved Instances
     * cannot be sold.
     * </p>
     * </note>
     * <p>
     * The Reserved Instance Marketplace matches sellers who want to resell Standard Reserved Instance capacity that
     * they no longer need with buyers who want to purchase additional capacity. Reserved Instances bought and sold
     * through the Reserved Instance Marketplace work like any other Reserved Instances.
     * </p>
     * <p>
     * To sell your Standard Reserved Instances, you must first register as a seller in the Reserved Instance
     * Marketplace. After completing the registration process, you can create a Reserved Instance Marketplace listing of
     * some or all of your Standard Reserved Instances, and specify the upfront price to receive for them. Your Standard
     * Reserved Instance listings then become available for purchase. To view the details of your Standard Reserved
     * Instance listing, you can use the <a>DescribeReservedInstancesListings</a> operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html">Reserved Instance
     * Marketplace</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param createReservedInstancesListingRequest
     *        Contains the parameters for CreateReservedInstancesListing.
     * @return Result of the CreateReservedInstancesListing operation returned by the service.
     * @sample AmazonEC2.CreateReservedInstancesListing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateReservedInstancesListing"
     *      target="_top">AWS API Documentation</a>
     */
    CreateReservedInstancesListingResult createReservedInstancesListing(CreateReservedInstancesListingRequest createReservedInstancesListingRequest);

    /**
     * <p>
     * Starts a task that restores an AMI from an S3 object that was previously created by using <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateStoreImageTask.html"
     * >CreateStoreImageTask</a>.
     * </p>
     * <p>
     * To use this API, you must have the required permissions. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-store-restore.html#ami-s3-permissions">Permissions
     * for storing and restoring AMIs using S3</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-store-restore.html">Store and restore an AMI using
     * S3</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createRestoreImageTaskRequest
     * @return Result of the CreateRestoreImageTask operation returned by the service.
     * @sample AmazonEC2.CreateRestoreImageTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateRestoreImageTask" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRestoreImageTaskResult createRestoreImageTask(CreateRestoreImageTaskRequest createRestoreImageTaskRequest);

    /**
     * <p>
     * Creates a route in a route table within a VPC.
     * </p>
     * <p>
     * You must specify one of the following targets: internet gateway or virtual private gateway, NAT instance, NAT
     * gateway, VPC peering connection, network interface, egress-only internet gateway, or transit gateway.
     * </p>
     * <p>
     * When determining how to route traffic, we use the route with the most specific match. For example, traffic is
     * destined for the IPv4 address <code>192.0.2.3</code>, and the route table includes the following two IPv4 routes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>192.0.2.0/24</code> (goes to some target A)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>192.0.2.0/28</code> (goes to some target B)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Both routes apply to the traffic destined for <code>192.0.2.3</code>. However, the second route in the list
     * covers a smaller number of IP addresses and is therefore more specific, so we use that route to determine where
     * to target the traffic.
     * </p>
     * <p>
     * For more information about route tables, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html">Route Tables</a> in the <i>Amazon
     * Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createRouteRequest
     * @return Result of the CreateRoute operation returned by the service.
     * @sample AmazonEC2.CreateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateRoute" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRouteResult createRoute(CreateRouteRequest createRouteRequest);

    /**
     * <p>
     * Creates a route table for the specified VPC. After you create a route table, you can add routes and associate the
     * table with a subnet.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html">Route
     * Tables</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createRouteTableRequest
     * @return Result of the CreateRouteTable operation returned by the service.
     * @sample AmazonEC2.CreateRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateRouteTable" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRouteTableResult createRouteTable(CreateRouteTableRequest createRouteTableRequest);

    /**
     * <p>
     * Creates a security group.
     * </p>
     * <p>
     * A security group acts as a virtual firewall for your instance to control inbound and outbound traffic. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon
     * EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for Your
     * VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * When you create a security group, you specify a friendly name of your choice. You can have a security group for
     * use in EC2-Classic with the same name as a security group for use in a VPC. However, you can't have two security
     * groups for use in EC2-Classic with the same name or two security groups for use in a VPC with the same name.
     * </p>
     * <p>
     * You have a default security group for use in EC2-Classic and a default security group for use in your VPC. If you
     * don't specify a security group when you launch an instance, the instance is launched into the appropriate default
     * security group. A default security group includes a default rule that grants instances unrestricted network
     * access to each other.
     * </p>
     * <p>
     * You can add or remove rules from your security groups using <a>AuthorizeSecurityGroupIngress</a>,
     * <a>AuthorizeSecurityGroupEgress</a>, <a>RevokeSecurityGroupIngress</a>, and <a>RevokeSecurityGroupEgress</a>.
     * </p>
     * <p>
     * For more information about VPC security group limits, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html">Amazon VPC Limits</a>.
     * </p>
     * 
     * @param createSecurityGroupRequest
     * @return Result of the CreateSecurityGroup operation returned by the service.
     * @sample AmazonEC2.CreateSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateSecurityGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSecurityGroupResult createSecurityGroup(CreateSecurityGroupRequest createSecurityGroupRequest);

    /**
     * <p>
     * Creates a snapshot of an EBS volume and stores it in Amazon S3. You can use snapshots for backups, to make copies
     * of EBS volumes, and to save data before shutting down an instance.
     * </p>
     * <p>
     * You can create snapshots of volumes in a Region and volumes on an Outpost. If you create a snapshot of a volume
     * in a Region, the snapshot must be stored in the same Region as the volume. If you create a snapshot of a volume
     * on an Outpost, the snapshot can be stored on the same Outpost as the volume, or in the Region for that Outpost.
     * </p>
     * <p>
     * When a snapshot is created, any AWS Marketplace product codes that are associated with the source volume are
     * propagated to the snapshot.
     * </p>
     * <p>
     * You can take a snapshot of an attached volume that is in use. However, snapshots only capture data that has been
     * written to your EBS volume at the time the snapshot command is issued; this might exclude any data that has been
     * cached by any applications or the operating system. If you can pause any file systems on the volume long enough
     * to take a snapshot, your snapshot should be complete. However, if you cannot pause all file writes to the volume,
     * you should unmount the volume from within the instance, issue the snapshot command, and then remount the volume
     * to ensure a consistent and complete snapshot. You may remount and use your volume while the snapshot status is
     * <code>pending</code>.
     * </p>
     * <p>
     * To create a snapshot for EBS volumes that serve as root devices, you should stop the instance before taking the
     * snapshot.
     * </p>
     * <p>
     * Snapshots that are taken from encrypted volumes are automatically encrypted. Volumes that are created from
     * encrypted snapshots are also automatically encrypted. Your encrypted volumes and any associated snapshots always
     * remain protected.
     * </p>
     * <p>
     * You can tag your snapshots during creation. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging your Amazon EC2 resources</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AmazonEBS.html">Amazon
     * Elastic Block Store</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createSnapshotRequest
     * @return Result of the CreateSnapshot operation returned by the service.
     * @sample AmazonEC2.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest);

    /**
     * <p>
     * Creates crash-consistent snapshots of multiple EBS volumes and stores the data in S3. Volumes are chosen by
     * specifying an instance. Any attached volumes will produce one snapshot each that is crash-consistent across the
     * instance. Boot volumes can be excluded by changing the parameters.
     * </p>
     * <p>
     * You can create multi-volume snapshots of instances in a Region and instances on an Outpost. If you create
     * snapshots from an instance in a Region, the snapshots must be stored in the same Region as the instance. If you
     * create snapshots from an instance on an Outpost, the snapshots can be stored on the same Outpost as the instance,
     * or in the Region for that Outpost.
     * </p>
     * 
     * @param createSnapshotsRequest
     * @return Result of the CreateSnapshots operation returned by the service.
     * @sample AmazonEC2.CreateSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSnapshotsResult createSnapshots(CreateSnapshotsRequest createSnapshotsRequest);

    /**
     * <p>
     * Creates a data feed for Spot Instances, enabling you to view Spot Instance usage logs. You can create one data
     * feed per AWS account. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-data-feeds.html">Spot Instance data feed</a> in
     * the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param createSpotDatafeedSubscriptionRequest
     *        Contains the parameters for CreateSpotDatafeedSubscription.
     * @return Result of the CreateSpotDatafeedSubscription operation returned by the service.
     * @sample AmazonEC2.CreateSpotDatafeedSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateSpotDatafeedSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSpotDatafeedSubscriptionResult createSpotDatafeedSubscription(CreateSpotDatafeedSubscriptionRequest createSpotDatafeedSubscriptionRequest);

    /**
     * <p>
     * Stores an AMI as a single object in an S3 bucket.
     * </p>
     * <p>
     * To use this API, you must have the required permissions. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-store-restore.html#ami-s3-permissions">Permissions
     * for storing and restoring AMIs using S3</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-store-restore.html">Store and restore an AMI using
     * S3</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createStoreImageTaskRequest
     * @return Result of the CreateStoreImageTask operation returned by the service.
     * @sample AmazonEC2.CreateStoreImageTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateStoreImageTask" target="_top">AWS API
     *      Documentation</a>
     */
    CreateStoreImageTaskResult createStoreImageTask(CreateStoreImageTaskRequest createStoreImageTaskRequest);

    /**
     * <p>
     * Creates a subnet in a specified VPC.
     * </p>
     * <p>
     * You must specify an IPv4 CIDR block for the subnet. After you create a subnet, you can't change its CIDR block.
     * The allowed block size is between a /16 netmask (65,536 IP addresses) and /28 netmask (16 IP addresses). The CIDR
     * block must not overlap with the CIDR block of an existing subnet in the VPC.
     * </p>
     * <p>
     * If you've associated an IPv6 CIDR block with your VPC, you can create a subnet with an IPv6 CIDR block that uses
     * a /64 prefix length.
     * </p>
     * <important>
     * <p>
     * AWS reserves both the first four and the last IPv4 address in each subnet's CIDR block. They're not available for
     * use.
     * </p>
     * </important>
     * <p>
     * If you add more than one subnet to a VPC, they're set up in a star topology with a logical router in the middle.
     * </p>
     * <p>
     * When you stop an instance in a subnet, it retains its private IPv4 address. It's therefore possible to have a
     * subnet with no running instances (they're all stopped), but no remaining IP addresses available.
     * </p>
     * <p>
     * For more information about subnets, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">Your VPC and Subnets</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createSubnetRequest
     * @return Result of the CreateSubnet operation returned by the service.
     * @sample AmazonEC2.CreateSubnet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateSubnet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSubnetResult createSubnet(CreateSubnetRequest createSubnetRequest);

    /**
     * <p>
     * Adds or overwrites only the specified tags for the specified Amazon EC2 resource or resources. When you specify
     * an existing tag key, the value is overwritten with the new value. Each resource can have a maximum of 50 tags.
     * Each tag consists of a key and optional value. Tag keys must be unique per resource.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Resources</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>. For more information about creating IAM policies that control
     * users' access to resources based on tags, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-iam-actions-resources.html">Supported
     * Resource-Level Permissions for Amazon EC2 API Actions</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createTagsRequest
     * @return Result of the CreateTags operation returned by the service.
     * @sample AmazonEC2.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTagsResult createTags(CreateTagsRequest createTagsRequest);

    /**
     * <p>
     * Creates a Traffic Mirror filter.
     * </p>
     * <p>
     * A Traffic Mirror filter is a set of rules that defines the traffic to mirror.
     * </p>
     * <p>
     * By default, no traffic is mirrored. To mirror traffic, use <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTrafficMirrorFilterRule.htm"
     * >CreateTrafficMirrorFilterRule</a> to add Traffic Mirror rules to the filter. The rules you add define what
     * traffic gets mirrored. You can also use <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyTrafficMirrorFilterNetworkServices.html"
     * >ModifyTrafficMirrorFilterNetworkServices</a> to mirror supported network services.
     * </p>
     * 
     * @param createTrafficMirrorFilterRequest
     * @return Result of the CreateTrafficMirrorFilter operation returned by the service.
     * @sample AmazonEC2.CreateTrafficMirrorFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateTrafficMirrorFilter" target="_top">AWS
     *      API Documentation</a>
     */
    CreateTrafficMirrorFilterResult createTrafficMirrorFilter(CreateTrafficMirrorFilterRequest createTrafficMirrorFilterRequest);

    /**
     * <p>
     * Creates a Traffic Mirror filter rule.
     * </p>
     * <p>
     * A Traffic Mirror rule defines the Traffic Mirror source traffic to mirror.
     * </p>
     * <p>
     * You need the Traffic Mirror filter ID when you create the rule.
     * </p>
     * 
     * @param createTrafficMirrorFilterRuleRequest
     * @return Result of the CreateTrafficMirrorFilterRule operation returned by the service.
     * @sample AmazonEC2.CreateTrafficMirrorFilterRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateTrafficMirrorFilterRule"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTrafficMirrorFilterRuleResult createTrafficMirrorFilterRule(CreateTrafficMirrorFilterRuleRequest createTrafficMirrorFilterRuleRequest);

    /**
     * <p>
     * Creates a Traffic Mirror session.
     * </p>
     * <p>
     * A Traffic Mirror session actively copies packets from a Traffic Mirror source to a Traffic Mirror target. Create
     * a filter, and then assign it to the session to define a subset of the traffic to mirror, for example all TCP
     * traffic.
     * </p>
     * <p>
     * The Traffic Mirror source and the Traffic Mirror target (monitoring appliances) can be in the same VPC, or in a
     * different VPC connected via VPC peering or a transit gateway.
     * </p>
     * <p>
     * By default, no traffic is mirrored. Use <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTrafficMirrorFilter.htm"
     * >CreateTrafficMirrorFilter</a> to create filter rules that specify the traffic to mirror.
     * </p>
     * 
     * @param createTrafficMirrorSessionRequest
     * @return Result of the CreateTrafficMirrorSession operation returned by the service.
     * @sample AmazonEC2.CreateTrafficMirrorSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateTrafficMirrorSession" target="_top">AWS
     *      API Documentation</a>
     */
    CreateTrafficMirrorSessionResult createTrafficMirrorSession(CreateTrafficMirrorSessionRequest createTrafficMirrorSessionRequest);

    /**
     * <p>
     * Creates a target for your Traffic Mirror session.
     * </p>
     * <p>
     * A Traffic Mirror target is the destination for mirrored traffic. The Traffic Mirror source and the Traffic Mirror
     * target (monitoring appliances) can be in the same VPC, or in different VPCs connected via VPC peering or a
     * transit gateway.
     * </p>
     * <p>
     * A Traffic Mirror target can be a network interface, or a Network Load Balancer.
     * </p>
     * <p>
     * To use the target in a Traffic Mirror session, use <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTrafficMirrorSession.htm"
     * >CreateTrafficMirrorSession</a>.
     * </p>
     * 
     * @param createTrafficMirrorTargetRequest
     * @return Result of the CreateTrafficMirrorTarget operation returned by the service.
     * @sample AmazonEC2.CreateTrafficMirrorTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateTrafficMirrorTarget" target="_top">AWS
     *      API Documentation</a>
     */
    CreateTrafficMirrorTargetResult createTrafficMirrorTarget(CreateTrafficMirrorTargetRequest createTrafficMirrorTargetRequest);

    /**
     * <p>
     * Creates a transit gateway.
     * </p>
     * <p>
     * You can use a transit gateway to interconnect your virtual private clouds (VPC) and on-premises networks. After
     * the transit gateway enters the <code>available</code> state, you can attach your VPCs and VPN connections to the
     * transit gateway.
     * </p>
     * <p>
     * To attach your VPCs, use <a>CreateTransitGatewayVpcAttachment</a>.
     * </p>
     * <p>
     * To attach a VPN connection, use <a>CreateCustomerGateway</a> to create a customer gateway and specify the ID of
     * the customer gateway and the ID of the transit gateway in a call to <a>CreateVpnConnection</a>.
     * </p>
     * <p>
     * When you create a transit gateway, we create a default transit gateway route table and use it as the default
     * association route table and the default propagation route table. You can use
     * <a>CreateTransitGatewayRouteTable</a> to create additional transit gateway route tables. If you disable automatic
     * route propagation, we do not create a default transit gateway route table. You can use
     * <a>EnableTransitGatewayRouteTablePropagation</a> to propagate routes from a resource attachment to a transit
     * gateway route table. If you disable automatic associations, you can use <a>AssociateTransitGatewayRouteTable</a>
     * to associate a resource attachment with a transit gateway route table.
     * </p>
     * 
     * @param createTransitGatewayRequest
     * @return Result of the CreateTransitGateway operation returned by the service.
     * @sample AmazonEC2.CreateTransitGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateTransitGateway" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTransitGatewayResult createTransitGateway(CreateTransitGatewayRequest createTransitGatewayRequest);

    /**
     * <p>
     * Creates a Connect attachment from a specified transit gateway attachment. A Connect attachment is a GRE-based
     * tunnel attachment that you can use to establish a connection between a transit gateway and an appliance.
     * </p>
     * <p>
     * A Connect attachment uses an existing VPC or AWS Direct Connect attachment as the underlying transport mechanism.
     * </p>
     * 
     * @param createTransitGatewayConnectRequest
     * @return Result of the CreateTransitGatewayConnect operation returned by the service.
     * @sample AmazonEC2.CreateTransitGatewayConnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateTransitGatewayConnect"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTransitGatewayConnectResult createTransitGatewayConnect(CreateTransitGatewayConnectRequest createTransitGatewayConnectRequest);

    /**
     * <p>
     * Creates a Connect peer for a specified transit gateway Connect attachment between a transit gateway and an
     * appliance.
     * </p>
     * <p>
     * The peer address and transit gateway address must be the same IP address family (IPv4 or IPv6).
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/tgw/tgw-connect.html#tgw-connect-peer">Connect peers</a> in the
     * <i>Transit Gateways Guide</i>.
     * </p>
     * 
     * @param createTransitGatewayConnectPeerRequest
     * @return Result of the CreateTransitGatewayConnectPeer operation returned by the service.
     * @sample AmazonEC2.CreateTransitGatewayConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateTransitGatewayConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTransitGatewayConnectPeerResult createTransitGatewayConnectPeer(CreateTransitGatewayConnectPeerRequest createTransitGatewayConnectPeerRequest);

    /**
     * <p>
     * Creates a multicast domain using the specified transit gateway.
     * </p>
     * <p>
     * The transit gateway must be in the available state before you create a domain. Use <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeTransitGateways.html"
     * >DescribeTransitGateways</a> to see the state of transit gateway.
     * </p>
     * 
     * @param createTransitGatewayMulticastDomainRequest
     * @return Result of the CreateTransitGatewayMulticastDomain operation returned by the service.
     * @sample AmazonEC2.CreateTransitGatewayMulticastDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateTransitGatewayMulticastDomain"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTransitGatewayMulticastDomainResult createTransitGatewayMulticastDomain(
            CreateTransitGatewayMulticastDomainRequest createTransitGatewayMulticastDomainRequest);

    /**
     * <p>
     * Requests a transit gateway peering attachment between the specified transit gateway (requester) and a peer
     * transit gateway (accepter). The transit gateways must be in different Regions. The peer transit gateway can be in
     * your account or a different AWS account.
     * </p>
     * <p>
     * After you create the peering attachment, the owner of the accepter transit gateway must accept the attachment
     * request.
     * </p>
     * 
     * @param createTransitGatewayPeeringAttachmentRequest
     * @return Result of the CreateTransitGatewayPeeringAttachment operation returned by the service.
     * @sample AmazonEC2.CreateTransitGatewayPeeringAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateTransitGatewayPeeringAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTransitGatewayPeeringAttachmentResult createTransitGatewayPeeringAttachment(
            CreateTransitGatewayPeeringAttachmentRequest createTransitGatewayPeeringAttachmentRequest);

    /**
     * <p>
     * Creates a reference (route) to a prefix list in a specified transit gateway route table.
     * </p>
     * 
     * @param createTransitGatewayPrefixListReferenceRequest
     * @return Result of the CreateTransitGatewayPrefixListReference operation returned by the service.
     * @sample AmazonEC2.CreateTransitGatewayPrefixListReference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateTransitGatewayPrefixListReference"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTransitGatewayPrefixListReferenceResult createTransitGatewayPrefixListReference(
            CreateTransitGatewayPrefixListReferenceRequest createTransitGatewayPrefixListReferenceRequest);

    /**
     * <p>
     * Creates a static route for the specified transit gateway route table.
     * </p>
     * 
     * @param createTransitGatewayRouteRequest
     * @return Result of the CreateTransitGatewayRoute operation returned by the service.
     * @sample AmazonEC2.CreateTransitGatewayRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateTransitGatewayRoute" target="_top">AWS
     *      API Documentation</a>
     */
    CreateTransitGatewayRouteResult createTransitGatewayRoute(CreateTransitGatewayRouteRequest createTransitGatewayRouteRequest);

    /**
     * <p>
     * Creates a route table for the specified transit gateway.
     * </p>
     * 
     * @param createTransitGatewayRouteTableRequest
     * @return Result of the CreateTransitGatewayRouteTable operation returned by the service.
     * @sample AmazonEC2.CreateTransitGatewayRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateTransitGatewayRouteTable"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTransitGatewayRouteTableResult createTransitGatewayRouteTable(CreateTransitGatewayRouteTableRequest createTransitGatewayRouteTableRequest);

    /**
     * <p>
     * Attaches the specified VPC to the specified transit gateway.
     * </p>
     * <p>
     * If you attach a VPC with a CIDR range that overlaps the CIDR range of a VPC that is already attached, the new VPC
     * CIDR range is not propagated to the default propagation route table.
     * </p>
     * <p>
     * To send VPC traffic to an attached transit gateway, add a route to the VPC route table using <a>CreateRoute</a>.
     * </p>
     * 
     * @param createTransitGatewayVpcAttachmentRequest
     * @return Result of the CreateTransitGatewayVpcAttachment operation returned by the service.
     * @sample AmazonEC2.CreateTransitGatewayVpcAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateTransitGatewayVpcAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTransitGatewayVpcAttachmentResult createTransitGatewayVpcAttachment(CreateTransitGatewayVpcAttachmentRequest createTransitGatewayVpcAttachmentRequest);

    /**
     * <p>
     * Creates an EBS volume that can be attached to an instance in the same Availability Zone.
     * </p>
     * <p>
     * You can create a new empty volume or restore a volume from an EBS snapshot. Any AWS Marketplace product codes
     * from the snapshot are propagated to the volume.
     * </p>
     * <p>
     * You can create encrypted volumes. Encrypted volumes must be attached to instances that support Amazon EBS
     * encryption. Volumes that are created from encrypted snapshots are also automatically encrypted. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS
     * encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * You can tag your volumes during creation. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging your Amazon EC2 resources</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-creating-volume.html">Creating an Amazon EBS
     * volume</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createVolumeRequest
     * @return Result of the CreateVolume operation returned by the service.
     * @sample AmazonEC2.CreateVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVolume" target="_top">AWS API
     *      Documentation</a>
     */
    CreateVolumeResult createVolume(CreateVolumeRequest createVolumeRequest);

    /**
     * <p>
     * Creates a VPC with the specified IPv4 CIDR block. The smallest VPC you can create uses a /28 netmask (16 IPv4
     * addresses), and the largest uses a /16 netmask (65,536 IPv4 addresses). For more information about how large to
     * make your VPC, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">Your VPC and
     * Subnets</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * You can optionally request an IPv6 CIDR block for the VPC. You can request an Amazon-provided IPv6 CIDR block
     * from Amazon's pool of IPv6 addresses, or an IPv6 CIDR block from an IPv6 address pool that you provisioned
     * through bring your own IP addresses (<a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html">BYOIP</a>).
     * </p>
     * <p>
     * By default, each instance you launch in the VPC has the default DHCP options, which include only a default DNS
     * server that we provide (AmazonProvidedDNS). For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_DHCP_Options.html">DHCP Options Sets</a> in the
     * <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * You can specify the instance tenancy value for the VPC when you create it. You can't change this value for the
     * VPC after you create it. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-instance.html">Dedicated Instances</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createVpcRequest
     * @return Result of the CreateVpc operation returned by the service.
     * @sample AmazonEC2.CreateVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpc" target="_top">AWS API
     *      Documentation</a>
     */
    CreateVpcResult createVpc(CreateVpcRequest createVpcRequest);

    /**
     * <p>
     * Creates a VPC endpoint for a specified service. An endpoint enables you to create a private connection between
     * your VPC and the service. The service may be provided by AWS, an AWS Marketplace Partner, or another AWS account.
     * For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints.html">VPC
     * Endpoints</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * A <code>gateway</code> endpoint serves as a target for a route in your route table for traffic destined for the
     * AWS service. You can specify an endpoint policy to attach to the endpoint, which will control access to the
     * service from your VPC. You can also specify the VPC route tables that use the endpoint.
     * </p>
     * <p>
     * An <code>interface</code> endpoint is a network interface in your subnet that serves as an endpoint for
     * communicating with the specified service. You can specify the subnets in which to create an endpoint, and the
     * security groups to associate with the endpoint network interface.
     * </p>
     * <p>
     * A <code>GatewayLoadBalancer</code> endpoint is a network interface in your subnet that serves an endpoint for
     * communicating with a Gateway Load Balancer that you've configured as a VPC endpoint service.
     * </p>
     * <p>
     * Use <a>DescribeVpcEndpointServices</a> to get a list of supported services.
     * </p>
     * 
     * @param createVpcEndpointRequest
     *        Contains the parameters for CreateVpcEndpoint.
     * @return Result of the CreateVpcEndpoint operation returned by the service.
     * @sample AmazonEC2.CreateVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpcEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    CreateVpcEndpointResult createVpcEndpoint(CreateVpcEndpointRequest createVpcEndpointRequest);

    /**
     * <p>
     * Creates a connection notification for a specified VPC endpoint or VPC endpoint service. A connection notification
     * notifies you of specific endpoint events. You must create an SNS topic to receive notifications. For more
     * information, see <a href="https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Create a Topic</a> in the
     * <i>Amazon Simple Notification Service Developer Guide</i>.
     * </p>
     * <p>
     * You can create a connection notification for interface endpoints only.
     * </p>
     * 
     * @param createVpcEndpointConnectionNotificationRequest
     * @return Result of the CreateVpcEndpointConnectionNotification operation returned by the service.
     * @sample AmazonEC2.CreateVpcEndpointConnectionNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpcEndpointConnectionNotification"
     *      target="_top">AWS API Documentation</a>
     */
    CreateVpcEndpointConnectionNotificationResult createVpcEndpointConnectionNotification(
            CreateVpcEndpointConnectionNotificationRequest createVpcEndpointConnectionNotificationRequest);

    /**
     * <p>
     * Creates a VPC endpoint service configuration to which service consumers (AWS accounts, IAM users, and IAM roles)
     * can connect.
     * </p>
     * <p>
     * To create an endpoint service configuration, you must first create one of the following for your service:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/introduction.html">Network Load
     * Balancer</a>. Service consumers connect to your service using an interface endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <a href="https://docs.aws.amazon.com/elasticloadbalancing/latest/gateway/introduction.html">Gateway Load
     * Balancer</a>. Service consumers connect to your service using a Gateway Load Balancer endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-service.html">VPC
     * Endpoint Services</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * If you set the private DNS name, you must prove that you own the private DNS domain name. For more information,
     * see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-services-dns-validation.html">VPC Endpoint
     * Service Private DNS Name Verification</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createVpcEndpointServiceConfigurationRequest
     * @return Result of the CreateVpcEndpointServiceConfiguration operation returned by the service.
     * @sample AmazonEC2.CreateVpcEndpointServiceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpcEndpointServiceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateVpcEndpointServiceConfigurationResult createVpcEndpointServiceConfiguration(
            CreateVpcEndpointServiceConfigurationRequest createVpcEndpointServiceConfigurationRequest);

    /**
     * <p>
     * Requests a VPC peering connection between two VPCs: a requester VPC that you own and an accepter VPC with which
     * to create the connection. The accepter VPC can belong to another AWS account and can be in a different Region to
     * the requester VPC. The requester VPC and accepter VPC cannot have overlapping CIDR blocks.
     * </p>
     * <note>
     * <p>
     * Limitations and rules apply to a VPC peering connection. For more information, see the <a
     * href="https://docs.aws.amazon.com/vpc/latest/peering/vpc-peering-basics.html#vpc-peering-limitations"
     * >limitations</a> section in the <i>VPC Peering Guide</i>.
     * </p>
     * </note>
     * <p>
     * The owner of the accepter VPC must accept the peering request to activate the peering connection. The VPC peering
     * connection request expires after 7 days, after which it cannot be accepted or rejected.
     * </p>
     * <p>
     * If you create a VPC peering connection request between VPCs with overlapping CIDR blocks, the VPC peering
     * connection has a status of <code>failed</code>.
     * </p>
     * 
     * @param createVpcPeeringConnectionRequest
     * @return Result of the CreateVpcPeeringConnection operation returned by the service.
     * @sample AmazonEC2.CreateVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpcPeeringConnection" target="_top">AWS
     *      API Documentation</a>
     */
    CreateVpcPeeringConnectionResult createVpcPeeringConnection(CreateVpcPeeringConnectionRequest createVpcPeeringConnectionRequest);

    /**
     * Simplified method form for invoking the CreateVpcPeeringConnection operation.
     *
     * @see #createVpcPeeringConnection(CreateVpcPeeringConnectionRequest)
     */
    CreateVpcPeeringConnectionResult createVpcPeeringConnection();

    /**
     * <p>
     * Creates a VPN connection between an existing virtual private gateway or transit gateway and a customer gateway.
     * The supported connection type is <code>ipsec.1</code>.
     * </p>
     * <p>
     * The response includes information that you need to give to your network administrator to configure your customer
     * gateway.
     * </p>
     * <important>
     * <p>
     * We strongly recommend that you use HTTPS when calling this operation because the response contains sensitive
     * cryptographic information for configuring your customer gateway device.
     * </p>
     * </important>
     * <p>
     * If you decide to shut down your VPN connection for any reason and later create a new VPN connection, you must
     * reconfigure your customer gateway with the new information returned from this call.
     * </p>
     * <p>
     * This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS Site-to-Site
     * VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * 
     * @param createVpnConnectionRequest
     *        Contains the parameters for CreateVpnConnection.
     * @return Result of the CreateVpnConnection operation returned by the service.
     * @sample AmazonEC2.CreateVpnConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpnConnection" target="_top">AWS API
     *      Documentation</a>
     */
    CreateVpnConnectionResult createVpnConnection(CreateVpnConnectionRequest createVpnConnectionRequest);

    /**
     * <p>
     * Creates a static route associated with a VPN connection between an existing virtual private gateway and a VPN
     * customer gateway. The static route allows traffic to be routed from the virtual private gateway to the VPN
     * customer gateway.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS Site-to-Site
     * VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * 
     * @param createVpnConnectionRouteRequest
     *        Contains the parameters for CreateVpnConnectionRoute.
     * @return Result of the CreateVpnConnectionRoute operation returned by the service.
     * @sample AmazonEC2.CreateVpnConnectionRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpnConnectionRoute" target="_top">AWS
     *      API Documentation</a>
     */
    CreateVpnConnectionRouteResult createVpnConnectionRoute(CreateVpnConnectionRouteRequest createVpnConnectionRouteRequest);

    /**
     * <p>
     * Creates a virtual private gateway. A virtual private gateway is the endpoint on the VPC side of your VPN
     * connection. You can create a virtual private gateway before creating the VPC itself.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS Site-to-Site
     * VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * 
     * @param createVpnGatewayRequest
     *        Contains the parameters for CreateVpnGateway.
     * @return Result of the CreateVpnGateway operation returned by the service.
     * @sample AmazonEC2.CreateVpnGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVpnGateway" target="_top">AWS API
     *      Documentation</a>
     */
    CreateVpnGatewayResult createVpnGateway(CreateVpnGatewayRequest createVpnGatewayRequest);

    /**
     * <p>
     * Deletes a carrier gateway.
     * </p>
     * <important>
     * <p>
     * If you do not delete the route that contains the carrier gateway as the Target, the route is a blackhole route.
     * For information about how to delete a route, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteRoute.html">DeleteRoute</a>.
     * </p>
     * </important>
     * 
     * @param deleteCarrierGatewayRequest
     * @return Result of the DeleteCarrierGateway operation returned by the service.
     * @sample AmazonEC2.DeleteCarrierGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteCarrierGateway" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteCarrierGatewayResult deleteCarrierGateway(DeleteCarrierGatewayRequest deleteCarrierGatewayRequest);

    /**
     * <p>
     * Deletes the specified Client VPN endpoint. You must disassociate all target networks before you can delete a
     * Client VPN endpoint.
     * </p>
     * 
     * @param deleteClientVpnEndpointRequest
     * @return Result of the DeleteClientVpnEndpoint operation returned by the service.
     * @sample AmazonEC2.DeleteClientVpnEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteClientVpnEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteClientVpnEndpointResult deleteClientVpnEndpoint(DeleteClientVpnEndpointRequest deleteClientVpnEndpointRequest);

    /**
     * <p>
     * Deletes a route from a Client VPN endpoint. You can only delete routes that you manually added using the
     * <b>CreateClientVpnRoute</b> action. You cannot delete routes that were automatically added when associating a
     * subnet. To remove routes that have been automatically added, disassociate the target subnet from the Client VPN
     * endpoint.
     * </p>
     * 
     * @param deleteClientVpnRouteRequest
     * @return Result of the DeleteClientVpnRoute operation returned by the service.
     * @sample AmazonEC2.DeleteClientVpnRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteClientVpnRoute" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteClientVpnRouteResult deleteClientVpnRoute(DeleteClientVpnRouteRequest deleteClientVpnRouteRequest);

    /**
     * <p>
     * Deletes the specified customer gateway. You must delete the VPN connection before you can delete the customer
     * gateway.
     * </p>
     * 
     * @param deleteCustomerGatewayRequest
     *        Contains the parameters for DeleteCustomerGateway.
     * @return Result of the DeleteCustomerGateway operation returned by the service.
     * @sample AmazonEC2.DeleteCustomerGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteCustomerGateway" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteCustomerGatewayResult deleteCustomerGateway(DeleteCustomerGatewayRequest deleteCustomerGatewayRequest);

    /**
     * <p>
     * Deletes the specified set of DHCP options. You must disassociate the set of DHCP options before you can delete
     * it. You can disassociate the set of DHCP options by associating either a new set of options or the default set of
     * options with the VPC.
     * </p>
     * 
     * @param deleteDhcpOptionsRequest
     * @return Result of the DeleteDhcpOptions operation returned by the service.
     * @sample AmazonEC2.DeleteDhcpOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteDhcpOptions" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDhcpOptionsResult deleteDhcpOptions(DeleteDhcpOptionsRequest deleteDhcpOptionsRequest);

    /**
     * <p>
     * Deletes an egress-only internet gateway.
     * </p>
     * 
     * @param deleteEgressOnlyInternetGatewayRequest
     * @return Result of the DeleteEgressOnlyInternetGateway operation returned by the service.
     * @sample AmazonEC2.DeleteEgressOnlyInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteEgressOnlyInternetGateway"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEgressOnlyInternetGatewayResult deleteEgressOnlyInternetGateway(DeleteEgressOnlyInternetGatewayRequest deleteEgressOnlyInternetGatewayRequest);

    /**
     * <p>
     * Deletes the specified EC2 Fleet.
     * </p>
     * <p>
     * After you delete an EC2 Fleet, it launches no new instances.
     * </p>
     * <p>
     * You must specify whether a deleted EC2 Fleet should also terminate its instances. If you choose to terminate the
     * instances, the EC2 Fleet enters the <code>deleted_terminating</code> state. Otherwise, the EC2 Fleet enters the
     * <code>deleted_running</code> state, and the instances continue to run until they are interrupted or you terminate
     * them manually.
     * </p>
     * <p>
     * For <code>instant</code> fleets, EC2 Fleet must terminate the instances when the fleet is deleted. A deleted
     * <code>instant</code> fleet with running instances is not supported.
     * </p>
     * <p class="title">
     * <b>Restrictions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can delete up to 25 <code>instant</code> fleets in a single request. If you exceed this number, no
     * <code>instant</code> fleets are deleted and an error is returned. There is no restriction on the number of fleets
     * of type <code>maintain</code> or <code>request</code> that can be deleted in a single request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Up to 1000 instances can be terminated in a single request to delete <code>instant</code> fleets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/manage-ec2-fleet.html#delete-fleet">Deleting an EC2
     * Fleet</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param deleteFleetsRequest
     * @return Result of the DeleteFleets operation returned by the service.
     * @sample AmazonEC2.DeleteFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteFleets" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFleetsResult deleteFleets(DeleteFleetsRequest deleteFleetsRequest);

    /**
     * <p>
     * Deletes one or more flow logs.
     * </p>
     * 
     * @param deleteFlowLogsRequest
     * @return Result of the DeleteFlowLogs operation returned by the service.
     * @sample AmazonEC2.DeleteFlowLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteFlowLogs" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFlowLogsResult deleteFlowLogs(DeleteFlowLogsRequest deleteFlowLogsRequest);

    /**
     * <p>
     * Deletes the specified Amazon FPGA Image (AFI).
     * </p>
     * 
     * @param deleteFpgaImageRequest
     * @return Result of the DeleteFpgaImage operation returned by the service.
     * @sample AmazonEC2.DeleteFpgaImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteFpgaImage" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFpgaImageResult deleteFpgaImage(DeleteFpgaImageRequest deleteFpgaImageRequest);

    /**
     * <p>
     * Deletes the specified internet gateway. You must detach the internet gateway from the VPC before you can delete
     * it.
     * </p>
     * 
     * @param deleteInternetGatewayRequest
     * @return Result of the DeleteInternetGateway operation returned by the service.
     * @sample AmazonEC2.DeleteInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteInternetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteInternetGatewayResult deleteInternetGateway(DeleteInternetGatewayRequest deleteInternetGatewayRequest);

    /**
     * <p>
     * Deletes the specified key pair, by removing the public key from Amazon EC2.
     * </p>
     * 
     * @param deleteKeyPairRequest
     * @return Result of the DeleteKeyPair operation returned by the service.
     * @sample AmazonEC2.DeleteKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteKeyPairResult deleteKeyPair(DeleteKeyPairRequest deleteKeyPairRequest);

    /**
     * <p>
     * Deletes a launch template. Deleting a launch template deletes all of its versions.
     * </p>
     * 
     * @param deleteLaunchTemplateRequest
     * @return Result of the DeleteLaunchTemplate operation returned by the service.
     * @sample AmazonEC2.DeleteLaunchTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteLaunchTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteLaunchTemplateResult deleteLaunchTemplate(DeleteLaunchTemplateRequest deleteLaunchTemplateRequest);

    /**
     * <p>
     * Deletes one or more versions of a launch template. You cannot delete the default version of a launch template;
     * you must first assign a different version as the default. If the default version is the only version for the
     * launch template, you must delete the entire launch template using <a>DeleteLaunchTemplate</a>.
     * </p>
     * 
     * @param deleteLaunchTemplateVersionsRequest
     * @return Result of the DeleteLaunchTemplateVersions operation returned by the service.
     * @sample AmazonEC2.DeleteLaunchTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteLaunchTemplateVersions"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteLaunchTemplateVersionsResult deleteLaunchTemplateVersions(DeleteLaunchTemplateVersionsRequest deleteLaunchTemplateVersionsRequest);

    /**
     * <p>
     * Deletes the specified route from the specified local gateway route table.
     * </p>
     * 
     * @param deleteLocalGatewayRouteRequest
     * @return Result of the DeleteLocalGatewayRoute operation returned by the service.
     * @sample AmazonEC2.DeleteLocalGatewayRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteLocalGatewayRoute" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteLocalGatewayRouteResult deleteLocalGatewayRoute(DeleteLocalGatewayRouteRequest deleteLocalGatewayRouteRequest);

    /**
     * <p>
     * Deletes the specified association between a VPC and local gateway route table.
     * </p>
     * 
     * @param deleteLocalGatewayRouteTableVpcAssociationRequest
     * @return Result of the DeleteLocalGatewayRouteTableVpcAssociation operation returned by the service.
     * @sample AmazonEC2.DeleteLocalGatewayRouteTableVpcAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteLocalGatewayRouteTableVpcAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteLocalGatewayRouteTableVpcAssociationResult deleteLocalGatewayRouteTableVpcAssociation(
            DeleteLocalGatewayRouteTableVpcAssociationRequest deleteLocalGatewayRouteTableVpcAssociationRequest);

    /**
     * <p>
     * Deletes the specified managed prefix list. You must first remove all references to the prefix list in your
     * resources.
     * </p>
     * 
     * @param deleteManagedPrefixListRequest
     * @return Result of the DeleteManagedPrefixList operation returned by the service.
     * @sample AmazonEC2.DeleteManagedPrefixList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteManagedPrefixList" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteManagedPrefixListResult deleteManagedPrefixList(DeleteManagedPrefixListRequest deleteManagedPrefixListRequest);

    /**
     * <p>
     * Deletes the specified NAT gateway. Deleting a NAT gateway disassociates its Elastic IP address, but does not
     * release the address from your account. Deleting a NAT gateway does not delete any NAT gateway routes in your
     * route tables.
     * </p>
     * 
     * @param deleteNatGatewayRequest
     * @return Result of the DeleteNatGateway operation returned by the service.
     * @sample AmazonEC2.DeleteNatGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNatGateway" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteNatGatewayResult deleteNatGateway(DeleteNatGatewayRequest deleteNatGatewayRequest);

    /**
     * <p>
     * Deletes the specified network ACL. You can't delete the ACL if it's associated with any subnets. You can't delete
     * the default network ACL.
     * </p>
     * 
     * @param deleteNetworkAclRequest
     * @return Result of the DeleteNetworkAcl operation returned by the service.
     * @sample AmazonEC2.DeleteNetworkAcl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNetworkAcl" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteNetworkAclResult deleteNetworkAcl(DeleteNetworkAclRequest deleteNetworkAclRequest);

    /**
     * <p>
     * Deletes the specified ingress or egress entry (rule) from the specified network ACL.
     * </p>
     * 
     * @param deleteNetworkAclEntryRequest
     * @return Result of the DeleteNetworkAclEntry operation returned by the service.
     * @sample AmazonEC2.DeleteNetworkAclEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNetworkAclEntry" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteNetworkAclEntryResult deleteNetworkAclEntry(DeleteNetworkAclEntryRequest deleteNetworkAclEntryRequest);

    /**
     * <p>
     * Deletes the specified network insights analysis.
     * </p>
     * 
     * @param deleteNetworkInsightsAnalysisRequest
     * @return Result of the DeleteNetworkInsightsAnalysis operation returned by the service.
     * @sample AmazonEC2.DeleteNetworkInsightsAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNetworkInsightsAnalysis"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteNetworkInsightsAnalysisResult deleteNetworkInsightsAnalysis(DeleteNetworkInsightsAnalysisRequest deleteNetworkInsightsAnalysisRequest);

    /**
     * <p>
     * Deletes the specified path.
     * </p>
     * 
     * @param deleteNetworkInsightsPathRequest
     * @return Result of the DeleteNetworkInsightsPath operation returned by the service.
     * @sample AmazonEC2.DeleteNetworkInsightsPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNetworkInsightsPath" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteNetworkInsightsPathResult deleteNetworkInsightsPath(DeleteNetworkInsightsPathRequest deleteNetworkInsightsPathRequest);

    /**
     * <p>
     * Deletes the specified network interface. You must detach the network interface before you can delete it.
     * </p>
     * 
     * @param deleteNetworkInterfaceRequest
     *        Contains the parameters for DeleteNetworkInterface.
     * @return Result of the DeleteNetworkInterface operation returned by the service.
     * @sample AmazonEC2.DeleteNetworkInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNetworkInterface" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteNetworkInterfaceResult deleteNetworkInterface(DeleteNetworkInterfaceRequest deleteNetworkInterfaceRequest);

    /**
     * <p>
     * Deletes a permission for a network interface. By default, you cannot delete the permission if the account for
     * which you're removing the permission has attached the network interface to an instance. However, you can force
     * delete the permission, regardless of any attachment.
     * </p>
     * 
     * @param deleteNetworkInterfacePermissionRequest
     *        Contains the parameters for DeleteNetworkInterfacePermission.
     * @return Result of the DeleteNetworkInterfacePermission operation returned by the service.
     * @sample AmazonEC2.DeleteNetworkInterfacePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteNetworkInterfacePermission"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteNetworkInterfacePermissionResult deleteNetworkInterfacePermission(DeleteNetworkInterfacePermissionRequest deleteNetworkInterfacePermissionRequest);

    /**
     * <p>
     * Deletes the specified placement group. You must terminate all instances in the placement group before you can
     * delete the placement group. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement groups</a> in the
     * <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param deletePlacementGroupRequest
     * @return Result of the DeletePlacementGroup operation returned by the service.
     * @sample AmazonEC2.DeletePlacementGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeletePlacementGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePlacementGroupResult deletePlacementGroup(DeletePlacementGroupRequest deletePlacementGroupRequest);

    /**
     * <p>
     * Deletes the queued purchases for the specified Reserved Instances.
     * </p>
     * 
     * @param deleteQueuedReservedInstancesRequest
     * @return Result of the DeleteQueuedReservedInstances operation returned by the service.
     * @sample AmazonEC2.DeleteQueuedReservedInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteQueuedReservedInstances"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteQueuedReservedInstancesResult deleteQueuedReservedInstances(DeleteQueuedReservedInstancesRequest deleteQueuedReservedInstancesRequest);

    /**
     * <p>
     * Deletes the specified route from the specified route table.
     * </p>
     * 
     * @param deleteRouteRequest
     * @return Result of the DeleteRoute operation returned by the service.
     * @sample AmazonEC2.DeleteRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteRoute" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRouteResult deleteRoute(DeleteRouteRequest deleteRouteRequest);

    /**
     * <p>
     * Deletes the specified route table. You must disassociate the route table from any subnets before you can delete
     * it. You can't delete the main route table.
     * </p>
     * 
     * @param deleteRouteTableRequest
     * @return Result of the DeleteRouteTable operation returned by the service.
     * @sample AmazonEC2.DeleteRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteRouteTable" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRouteTableResult deleteRouteTable(DeleteRouteTableRequest deleteRouteTableRequest);

    /**
     * <p>
     * Deletes a security group.
     * </p>
     * <p>
     * If you attempt to delete a security group that is associated with an instance, or is referenced by another
     * security group, the operation fails with <code>InvalidGroup.InUse</code> in EC2-Classic or
     * <code>DependencyViolation</code> in EC2-VPC.
     * </p>
     * 
     * @param deleteSecurityGroupRequest
     * @return Result of the DeleteSecurityGroup operation returned by the service.
     * @sample AmazonEC2.DeleteSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteSecurityGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSecurityGroupResult deleteSecurityGroup(DeleteSecurityGroupRequest deleteSecurityGroupRequest);

    /**
     * <p>
     * Deletes the specified snapshot.
     * </p>
     * <p>
     * When you make periodic snapshots of a volume, the snapshots are incremental, and only the blocks on the device
     * that have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the
     * data not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all
     * active snapshots will have access to all the information needed to restore the volume.
     * </p>
     * <p>
     * You cannot delete a snapshot of the root device of an EBS volume used by a registered AMI. You must first
     * de-register the AMI before you can delete the snapshot.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-deleting-snapshot.html">Deleting an Amazon EBS
     * snapshot</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param deleteSnapshotRequest
     * @return Result of the DeleteSnapshot operation returned by the service.
     * @sample AmazonEC2.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSnapshotResult deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest);

    /**
     * <p>
     * Deletes the data feed for Spot Instances.
     * </p>
     * 
     * @param deleteSpotDatafeedSubscriptionRequest
     *        Contains the parameters for DeleteSpotDatafeedSubscription.
     * @return Result of the DeleteSpotDatafeedSubscription operation returned by the service.
     * @sample AmazonEC2.DeleteSpotDatafeedSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteSpotDatafeedSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSpotDatafeedSubscriptionResult deleteSpotDatafeedSubscription(DeleteSpotDatafeedSubscriptionRequest deleteSpotDatafeedSubscriptionRequest);

    /**
     * Simplified method form for invoking the DeleteSpotDatafeedSubscription operation.
     *
     * @see #deleteSpotDatafeedSubscription(DeleteSpotDatafeedSubscriptionRequest)
     */
    DeleteSpotDatafeedSubscriptionResult deleteSpotDatafeedSubscription();

    /**
     * <p>
     * Deletes the specified subnet. You must terminate all running instances in the subnet before you can delete the
     * subnet.
     * </p>
     * 
     * @param deleteSubnetRequest
     * @return Result of the DeleteSubnet operation returned by the service.
     * @sample AmazonEC2.DeleteSubnet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteSubnet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSubnetResult deleteSubnet(DeleteSubnetRequest deleteSubnetRequest);

    /**
     * <p>
     * Deletes the specified set of tags from the specified set of resources.
     * </p>
     * <p>
     * To list the current tags, use <a>DescribeTags</a>. For more information about tags, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Resources</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @sample AmazonEC2.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTagsResult deleteTags(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Deletes the specified Traffic Mirror filter.
     * </p>
     * <p>
     * You cannot delete a Traffic Mirror filter that is in use by a Traffic Mirror session.
     * </p>
     * 
     * @param deleteTrafficMirrorFilterRequest
     * @return Result of the DeleteTrafficMirrorFilter operation returned by the service.
     * @sample AmazonEC2.DeleteTrafficMirrorFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteTrafficMirrorFilter" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteTrafficMirrorFilterResult deleteTrafficMirrorFilter(DeleteTrafficMirrorFilterRequest deleteTrafficMirrorFilterRequest);

    /**
     * <p>
     * Deletes the specified Traffic Mirror rule.
     * </p>
     * 
     * @param deleteTrafficMirrorFilterRuleRequest
     * @return Result of the DeleteTrafficMirrorFilterRule operation returned by the service.
     * @sample AmazonEC2.DeleteTrafficMirrorFilterRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteTrafficMirrorFilterRule"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTrafficMirrorFilterRuleResult deleteTrafficMirrorFilterRule(DeleteTrafficMirrorFilterRuleRequest deleteTrafficMirrorFilterRuleRequest);

    /**
     * <p>
     * Deletes the specified Traffic Mirror session.
     * </p>
     * 
     * @param deleteTrafficMirrorSessionRequest
     * @return Result of the DeleteTrafficMirrorSession operation returned by the service.
     * @sample AmazonEC2.DeleteTrafficMirrorSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteTrafficMirrorSession" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteTrafficMirrorSessionResult deleteTrafficMirrorSession(DeleteTrafficMirrorSessionRequest deleteTrafficMirrorSessionRequest);

    /**
     * <p>
     * Deletes the specified Traffic Mirror target.
     * </p>
     * <p>
     * You cannot delete a Traffic Mirror target that is in use by a Traffic Mirror session.
     * </p>
     * 
     * @param deleteTrafficMirrorTargetRequest
     * @return Result of the DeleteTrafficMirrorTarget operation returned by the service.
     * @sample AmazonEC2.DeleteTrafficMirrorTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteTrafficMirrorTarget" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteTrafficMirrorTargetResult deleteTrafficMirrorTarget(DeleteTrafficMirrorTargetRequest deleteTrafficMirrorTargetRequest);

    /**
     * <p>
     * Deletes the specified transit gateway.
     * </p>
     * 
     * @param deleteTransitGatewayRequest
     * @return Result of the DeleteTransitGateway operation returned by the service.
     * @sample AmazonEC2.DeleteTransitGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteTransitGateway" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTransitGatewayResult deleteTransitGateway(DeleteTransitGatewayRequest deleteTransitGatewayRequest);

    /**
     * <p>
     * Deletes the specified Connect attachment. You must first delete any Connect peers for the attachment.
     * </p>
     * 
     * @param deleteTransitGatewayConnectRequest
     * @return Result of the DeleteTransitGatewayConnect operation returned by the service.
     * @sample AmazonEC2.DeleteTransitGatewayConnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteTransitGatewayConnect"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTransitGatewayConnectResult deleteTransitGatewayConnect(DeleteTransitGatewayConnectRequest deleteTransitGatewayConnectRequest);

    /**
     * <p>
     * Deletes the specified Connect peer.
     * </p>
     * 
     * @param deleteTransitGatewayConnectPeerRequest
     * @return Result of the DeleteTransitGatewayConnectPeer operation returned by the service.
     * @sample AmazonEC2.DeleteTransitGatewayConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteTransitGatewayConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTransitGatewayConnectPeerResult deleteTransitGatewayConnectPeer(DeleteTransitGatewayConnectPeerRequest deleteTransitGatewayConnectPeerRequest);

    /**
     * <p>
     * Deletes the specified transit gateway multicast domain.
     * </p>
     * 
     * @param deleteTransitGatewayMulticastDomainRequest
     * @return Result of the DeleteTransitGatewayMulticastDomain operation returned by the service.
     * @sample AmazonEC2.DeleteTransitGatewayMulticastDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteTransitGatewayMulticastDomain"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTransitGatewayMulticastDomainResult deleteTransitGatewayMulticastDomain(
            DeleteTransitGatewayMulticastDomainRequest deleteTransitGatewayMulticastDomainRequest);

    /**
     * <p>
     * Deletes a transit gateway peering attachment.
     * </p>
     * 
     * @param deleteTransitGatewayPeeringAttachmentRequest
     * @return Result of the DeleteTransitGatewayPeeringAttachment operation returned by the service.
     * @sample AmazonEC2.DeleteTransitGatewayPeeringAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteTransitGatewayPeeringAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTransitGatewayPeeringAttachmentResult deleteTransitGatewayPeeringAttachment(
            DeleteTransitGatewayPeeringAttachmentRequest deleteTransitGatewayPeeringAttachmentRequest);

    /**
     * <p>
     * Deletes a reference (route) to a prefix list in a specified transit gateway route table.
     * </p>
     * 
     * @param deleteTransitGatewayPrefixListReferenceRequest
     * @return Result of the DeleteTransitGatewayPrefixListReference operation returned by the service.
     * @sample AmazonEC2.DeleteTransitGatewayPrefixListReference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteTransitGatewayPrefixListReference"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTransitGatewayPrefixListReferenceResult deleteTransitGatewayPrefixListReference(
            DeleteTransitGatewayPrefixListReferenceRequest deleteTransitGatewayPrefixListReferenceRequest);

    /**
     * <p>
     * Deletes the specified route from the specified transit gateway route table.
     * </p>
     * 
     * @param deleteTransitGatewayRouteRequest
     * @return Result of the DeleteTransitGatewayRoute operation returned by the service.
     * @sample AmazonEC2.DeleteTransitGatewayRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteTransitGatewayRoute" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteTransitGatewayRouteResult deleteTransitGatewayRoute(DeleteTransitGatewayRouteRequest deleteTransitGatewayRouteRequest);

    /**
     * <p>
     * Deletes the specified transit gateway route table. You must disassociate the route table from any transit gateway
     * route tables before you can delete it.
     * </p>
     * 
     * @param deleteTransitGatewayRouteTableRequest
     * @return Result of the DeleteTransitGatewayRouteTable operation returned by the service.
     * @sample AmazonEC2.DeleteTransitGatewayRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteTransitGatewayRouteTable"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTransitGatewayRouteTableResult deleteTransitGatewayRouteTable(DeleteTransitGatewayRouteTableRequest deleteTransitGatewayRouteTableRequest);

    /**
     * <p>
     * Deletes the specified VPC attachment.
     * </p>
     * 
     * @param deleteTransitGatewayVpcAttachmentRequest
     * @return Result of the DeleteTransitGatewayVpcAttachment operation returned by the service.
     * @sample AmazonEC2.DeleteTransitGatewayVpcAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteTransitGatewayVpcAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTransitGatewayVpcAttachmentResult deleteTransitGatewayVpcAttachment(DeleteTransitGatewayVpcAttachmentRequest deleteTransitGatewayVpcAttachmentRequest);

    /**
     * <p>
     * Deletes the specified EBS volume. The volume must be in the <code>available</code> state (not attached to an
     * instance).
     * </p>
     * <p>
     * The volume can remain in the <code>deleting</code> state for several minutes.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-deleting-volume.html">Deleting an Amazon EBS
     * volume</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param deleteVolumeRequest
     * @return Result of the DeleteVolume operation returned by the service.
     * @sample AmazonEC2.DeleteVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVolume" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteVolumeResult deleteVolume(DeleteVolumeRequest deleteVolumeRequest);

    /**
     * <p>
     * Deletes the specified VPC. You must detach or delete all gateways and resources that are associated with the VPC
     * before you can delete it. For example, you must terminate all instances running in the VPC, delete all security
     * groups associated with the VPC (except the default one), delete all route tables associated with the VPC (except
     * the default one), and so on.
     * </p>
     * 
     * @param deleteVpcRequest
     * @return Result of the DeleteVpc operation returned by the service.
     * @sample AmazonEC2.DeleteVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpc" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteVpcResult deleteVpc(DeleteVpcRequest deleteVpcRequest);

    /**
     * <p>
     * Deletes one or more VPC endpoint connection notifications.
     * </p>
     * 
     * @param deleteVpcEndpointConnectionNotificationsRequest
     * @return Result of the DeleteVpcEndpointConnectionNotifications operation returned by the service.
     * @sample AmazonEC2.DeleteVpcEndpointConnectionNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpcEndpointConnectionNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVpcEndpointConnectionNotificationsResult deleteVpcEndpointConnectionNotifications(
            DeleteVpcEndpointConnectionNotificationsRequest deleteVpcEndpointConnectionNotificationsRequest);

    /**
     * <p>
     * Deletes one or more VPC endpoint service configurations in your account. Before you delete the endpoint service
     * configuration, you must reject any <code>Available</code> or <code>PendingAcceptance</code> interface endpoint
     * connections that are attached to the service.
     * </p>
     * 
     * @param deleteVpcEndpointServiceConfigurationsRequest
     * @return Result of the DeleteVpcEndpointServiceConfigurations operation returned by the service.
     * @sample AmazonEC2.DeleteVpcEndpointServiceConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpcEndpointServiceConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVpcEndpointServiceConfigurationsResult deleteVpcEndpointServiceConfigurations(
            DeleteVpcEndpointServiceConfigurationsRequest deleteVpcEndpointServiceConfigurationsRequest);

    /**
     * <p>
     * Deletes one or more specified VPC endpoints. You can delete any of the following types of VPC endpoints.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Gateway endpoint,
     * </p>
     * </li>
     * <li>
     * <p>
     * Gateway Load Balancer endpoint,
     * </p>
     * </li>
     * <li>
     * <p>
     * Interface endpoint
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following rules apply when you delete a VPC endpoint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you delete a gateway endpoint, we delete the endpoint routes in the route tables that are associated with
     * the endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you delete a Gateway Load Balancer endpoint, we delete the endpoint network interfaces.
     * </p>
     * <p>
     * You can only delete Gateway Load Balancer endpoints when the routes that are associated with the endpoint are
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you delete an interface endpoint, we delete the endpoint network interfaces.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteVpcEndpointsRequest
     *        Contains the parameters for DeleteVpcEndpoints.
     * @return Result of the DeleteVpcEndpoints operation returned by the service.
     * @sample AmazonEC2.DeleteVpcEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpcEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteVpcEndpointsResult deleteVpcEndpoints(DeleteVpcEndpointsRequest deleteVpcEndpointsRequest);

    /**
     * <p>
     * Deletes a VPC peering connection. Either the owner of the requester VPC or the owner of the accepter VPC can
     * delete the VPC peering connection if it's in the <code>active</code> state. The owner of the requester VPC can
     * delete a VPC peering connection in the <code>pending-acceptance</code> state. You cannot delete a VPC peering
     * connection that's in the <code>failed</code> state.
     * </p>
     * 
     * @param deleteVpcPeeringConnectionRequest
     * @return Result of the DeleteVpcPeeringConnection operation returned by the service.
     * @sample AmazonEC2.DeleteVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpcPeeringConnection" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteVpcPeeringConnectionResult deleteVpcPeeringConnection(DeleteVpcPeeringConnectionRequest deleteVpcPeeringConnectionRequest);

    /**
     * <p>
     * Deletes the specified VPN connection.
     * </p>
     * <p>
     * If you're deleting the VPC and its associated components, we recommend that you detach the virtual private
     * gateway from the VPC and delete the VPC before deleting the VPN connection. If you believe that the tunnel
     * credentials for your VPN connection have been compromised, you can delete the VPN connection and create a new one
     * that has new keys, without needing to delete the VPC or virtual private gateway. If you create a new VPN
     * connection, you must reconfigure the customer gateway device using the new configuration information returned
     * with the new VPN connection ID.
     * </p>
     * <p>
     * For certificate-based authentication, delete all AWS Certificate Manager (ACM) private certificates used for the
     * AWS-side tunnel endpoints for the VPN connection before deleting the VPN connection.
     * </p>
     * 
     * @param deleteVpnConnectionRequest
     *        Contains the parameters for DeleteVpnConnection.
     * @return Result of the DeleteVpnConnection operation returned by the service.
     * @sample AmazonEC2.DeleteVpnConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpnConnection" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteVpnConnectionResult deleteVpnConnection(DeleteVpnConnectionRequest deleteVpnConnectionRequest);

    /**
     * <p>
     * Deletes the specified static route associated with a VPN connection between an existing virtual private gateway
     * and a VPN customer gateway. The static route allows traffic to be routed from the virtual private gateway to the
     * VPN customer gateway.
     * </p>
     * 
     * @param deleteVpnConnectionRouteRequest
     *        Contains the parameters for DeleteVpnConnectionRoute.
     * @return Result of the DeleteVpnConnectionRoute operation returned by the service.
     * @sample AmazonEC2.DeleteVpnConnectionRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpnConnectionRoute" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteVpnConnectionRouteResult deleteVpnConnectionRoute(DeleteVpnConnectionRouteRequest deleteVpnConnectionRouteRequest);

    /**
     * <p>
     * Deletes the specified virtual private gateway. You must first detach the virtual private gateway from the VPC.
     * Note that you don't need to delete the virtual private gateway if you plan to delete and recreate the VPN
     * connection between your VPC and your network.
     * </p>
     * 
     * @param deleteVpnGatewayRequest
     *        Contains the parameters for DeleteVpnGateway.
     * @return Result of the DeleteVpnGateway operation returned by the service.
     * @sample AmazonEC2.DeleteVpnGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteVpnGateway" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteVpnGatewayResult deleteVpnGateway(DeleteVpnGatewayRequest deleteVpnGatewayRequest);

    /**
     * <p>
     * Releases the specified address range that you provisioned for use with your AWS resources through bring your own
     * IP addresses (BYOIP) and deletes the corresponding address pool.
     * </p>
     * <p>
     * Before you can release an address range, you must stop advertising it using <a>WithdrawByoipCidr</a> and you must
     * not have any IP addresses allocated from its address range.
     * </p>
     * 
     * @param deprovisionByoipCidrRequest
     * @return Result of the DeprovisionByoipCidr operation returned by the service.
     * @sample AmazonEC2.DeprovisionByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeprovisionByoipCidr" target="_top">AWS API
     *      Documentation</a>
     */
    DeprovisionByoipCidrResult deprovisionByoipCidr(DeprovisionByoipCidrRequest deprovisionByoipCidrRequest);

    /**
     * <p>
     * Deregisters the specified AMI. After you deregister an AMI, it can't be used to launch new instances; however, it
     * doesn't affect any instances that you've already launched from the AMI. You'll continue to incur usage costs for
     * those instances until you terminate them.
     * </p>
     * <p>
     * When you deregister an Amazon EBS-backed AMI, it doesn't affect the snapshot that was created for the root volume
     * of the instance during the AMI creation process. When you deregister an instance store-backed AMI, it doesn't
     * affect the files that you uploaded to Amazon S3 when you created the AMI.
     * </p>
     * 
     * @param deregisterImageRequest
     *        Contains the parameters for DeregisterImage.
     * @return Result of the DeregisterImage operation returned by the service.
     * @sample AmazonEC2.DeregisterImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeregisterImage" target="_top">AWS API
     *      Documentation</a>
     */
    DeregisterImageResult deregisterImage(DeregisterImageRequest deregisterImageRequest);

    /**
     * <p>
     * Deregisters tag keys to prevent tags that have the specified tag keys from being included in scheduled event
     * notifications for resources in the Region.
     * </p>
     * 
     * @param deregisterInstanceEventNotificationAttributesRequest
     * @return Result of the DeregisterInstanceEventNotificationAttributes operation returned by the service.
     * @sample AmazonEC2.DeregisterInstanceEventNotificationAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeregisterInstanceEventNotificationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterInstanceEventNotificationAttributesResult deregisterInstanceEventNotificationAttributes(
            DeregisterInstanceEventNotificationAttributesRequest deregisterInstanceEventNotificationAttributesRequest);

    /**
     * <p>
     * Deregisters the specified members (network interfaces) from the transit gateway multicast group.
     * </p>
     * 
     * @param deregisterTransitGatewayMulticastGroupMembersRequest
     * @return Result of the DeregisterTransitGatewayMulticastGroupMembers operation returned by the service.
     * @sample AmazonEC2.DeregisterTransitGatewayMulticastGroupMembers
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeregisterTransitGatewayMulticastGroupMembers"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterTransitGatewayMulticastGroupMembersResult deregisterTransitGatewayMulticastGroupMembers(
            DeregisterTransitGatewayMulticastGroupMembersRequest deregisterTransitGatewayMulticastGroupMembersRequest);

    /**
     * <p>
     * Deregisters the specified sources (network interfaces) from the transit gateway multicast group.
     * </p>
     * 
     * @param deregisterTransitGatewayMulticastGroupSourcesRequest
     * @return Result of the DeregisterTransitGatewayMulticastGroupSources operation returned by the service.
     * @sample AmazonEC2.DeregisterTransitGatewayMulticastGroupSources
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeregisterTransitGatewayMulticastGroupSources"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterTransitGatewayMulticastGroupSourcesResult deregisterTransitGatewayMulticastGroupSources(
            DeregisterTransitGatewayMulticastGroupSourcesRequest deregisterTransitGatewayMulticastGroupSourcesRequest);

    /**
     * <p>
     * Describes attributes of your AWS account. The following are the supported account attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>supported-platforms</code>: Indicates whether your account can launch instances into EC2-Classic and
     * EC2-VPC, or only into EC2-VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-vpc</code>: The ID of the default VPC for your account, or <code>none</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>max-instances</code>: This attribute is no longer supported. The returned value does not reflect your
     * actual vCPU limit for running On-Demand Instances. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-on-demand-instances.html#ec2-on-demand-instances-limits"
     * >On-Demand Instance Limits</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-max-security-groups-per-interface</code>: The maximum number of security groups that you can assign to
     * a network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>max-elastic-ips</code>: The maximum number of Elastic IP addresses that you can allocate for use with
     * EC2-Classic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-max-elastic-ips</code>: The maximum number of Elastic IP addresses that you can allocate for use with
     * EC2-VPC.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeAccountAttributesRequest
     * @return Result of the DescribeAccountAttributes operation returned by the service.
     * @sample AmazonEC2.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeAccountAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest describeAccountAttributesRequest);

    /**
     * Simplified method form for invoking the DescribeAccountAttributes operation.
     *
     * @see #describeAccountAttributes(DescribeAccountAttributesRequest)
     */
    DescribeAccountAttributesResult describeAccountAttributes();

    /**
     * <p>
     * Describes the specified Elastic IP addresses or all of your Elastic IP addresses.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP Addresses</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeAddressesRequest
     * @return Result of the DescribeAddresses operation returned by the service.
     * @sample AmazonEC2.DescribeAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeAddresses" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAddressesResult describeAddresses(DescribeAddressesRequest describeAddressesRequest);

    /**
     * Simplified method form for invoking the DescribeAddresses operation.
     *
     * @see #describeAddresses(DescribeAddressesRequest)
     */
    DescribeAddressesResult describeAddresses();

    /**
     * <p>
     * Describes the attributes of the specified Elastic IP addresses. For requirements, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html#Using_Elastic_Addressing_Reverse_DNS"
     * >Using reverse DNS for email applications</a>.
     * </p>
     * 
     * @param describeAddressesAttributeRequest
     * @return Result of the DescribeAddressesAttribute operation returned by the service.
     * @sample AmazonEC2.DescribeAddressesAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeAddressesAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAddressesAttributeResult describeAddressesAttribute(DescribeAddressesAttributeRequest describeAddressesAttributeRequest);

    /**
     * <p>
     * Describes the longer ID format settings for all resource types in a specific Region. This request is useful for
     * performing a quick audit to determine whether a specific Region is fully opted in for longer IDs (17-character
     * IDs).
     * </p>
     * <p>
     * This request only returns information about resource types that support longer IDs.
     * </p>
     * <p>
     * The following resource types support longer IDs: <code>bundle</code> | <code>conversion-task</code> |
     * <code>customer-gateway</code> | <code>dhcp-options</code> | <code>elastic-ip-allocation</code> |
     * <code>elastic-ip-association</code> | <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
     * <code>import-task</code> | <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> | <code>network-interface-attachment</code>
     * | <code>prefix-list</code> | <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> | <code>snapshot</code> | <code>subnet</code>
     * | <code>subnet-cidr-block-association</code> | <code>volume</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>.
     * </p>
     * 
     * @param describeAggregateIdFormatRequest
     * @return Result of the DescribeAggregateIdFormat operation returned by the service.
     * @sample AmazonEC2.DescribeAggregateIdFormat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeAggregateIdFormat" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAggregateIdFormatResult describeAggregateIdFormat(DescribeAggregateIdFormatRequest describeAggregateIdFormatRequest);

    /**
     * <p>
     * Describes the Availability Zones, Local Zones, and Wavelength Zones that are available to you. If there is an
     * event impacting a zone, you can use this request to view the state and any provided messages for that zone.
     * </p>
     * <p>
     * For more information about Availability Zones, Local Zones, and Wavelength Zones, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html">Regions, Zones
     * and Outposts</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeAvailabilityZonesRequest
     * @return Result of the DescribeAvailabilityZones operation returned by the service.
     * @sample AmazonEC2.DescribeAvailabilityZones
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeAvailabilityZones" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAvailabilityZonesResult describeAvailabilityZones(DescribeAvailabilityZonesRequest describeAvailabilityZonesRequest);

    /**
     * Simplified method form for invoking the DescribeAvailabilityZones operation.
     *
     * @see #describeAvailabilityZones(DescribeAvailabilityZonesRequest)
     */
    DescribeAvailabilityZonesResult describeAvailabilityZones();

    /**
     * <p>
     * Describes the specified bundle tasks or all of your bundle tasks.
     * </p>
     * <note>
     * <p>
     * Completed bundle tasks are listed for only a limited time. If your bundle task is no longer in the list, you can
     * still register an AMI from it. Just use <code>RegisterImage</code> with the Amazon S3 bucket name and image
     * manifest name you provided to the bundle task.
     * </p>
     * </note>
     * 
     * @param describeBundleTasksRequest
     * @return Result of the DescribeBundleTasks operation returned by the service.
     * @sample AmazonEC2.DescribeBundleTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeBundleTasks" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeBundleTasksResult describeBundleTasks(DescribeBundleTasksRequest describeBundleTasksRequest);

    /**
     * Simplified method form for invoking the DescribeBundleTasks operation.
     *
     * @see #describeBundleTasks(DescribeBundleTasksRequest)
     */
    DescribeBundleTasksResult describeBundleTasks();

    /**
     * <p>
     * Describes the IP address ranges that were specified in calls to <a>ProvisionByoipCidr</a>.
     * </p>
     * <p>
     * To describe the address pools that were created when you provisioned the address ranges, use
     * <a>DescribePublicIpv4Pools</a> or <a>DescribeIpv6Pools</a>.
     * </p>
     * 
     * @param describeByoipCidrsRequest
     * @return Result of the DescribeByoipCidrs operation returned by the service.
     * @sample AmazonEC2.DescribeByoipCidrs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeByoipCidrs" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeByoipCidrsResult describeByoipCidrs(DescribeByoipCidrsRequest describeByoipCidrsRequest);

    /**
     * <p>
     * Describes one or more of your Capacity Reservations. The results describe only the Capacity Reservations in the
     * AWS Region that you're currently using.
     * </p>
     * 
     * @param describeCapacityReservationsRequest
     * @return Result of the DescribeCapacityReservations operation returned by the service.
     * @sample AmazonEC2.DescribeCapacityReservations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeCapacityReservations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCapacityReservationsResult describeCapacityReservations(DescribeCapacityReservationsRequest describeCapacityReservationsRequest);

    /**
     * <p>
     * Describes one or more of your carrier gateways.
     * </p>
     * 
     * @param describeCarrierGatewaysRequest
     * @return Result of the DescribeCarrierGateways operation returned by the service.
     * @sample AmazonEC2.DescribeCarrierGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeCarrierGateways" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeCarrierGatewaysResult describeCarrierGateways(DescribeCarrierGatewaysRequest describeCarrierGatewaysRequest);

    /**
     * <p>
     * Describes one or more of your linked EC2-Classic instances. This request only returns information about
     * EC2-Classic instances linked to a VPC through ClassicLink. You cannot use this request to return information
     * about other instances.
     * </p>
     * 
     * @param describeClassicLinkInstancesRequest
     * @return Result of the DescribeClassicLinkInstances operation returned by the service.
     * @sample AmazonEC2.DescribeClassicLinkInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeClassicLinkInstances"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeClassicLinkInstancesResult describeClassicLinkInstances(DescribeClassicLinkInstancesRequest describeClassicLinkInstancesRequest);

    /**
     * Simplified method form for invoking the DescribeClassicLinkInstances operation.
     *
     * @see #describeClassicLinkInstances(DescribeClassicLinkInstancesRequest)
     */
    DescribeClassicLinkInstancesResult describeClassicLinkInstances();

    /**
     * <p>
     * Describes the authorization rules for a specified Client VPN endpoint.
     * </p>
     * 
     * @param describeClientVpnAuthorizationRulesRequest
     * @return Result of the DescribeClientVpnAuthorizationRules operation returned by the service.
     * @sample AmazonEC2.DescribeClientVpnAuthorizationRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeClientVpnAuthorizationRules"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeClientVpnAuthorizationRulesResult describeClientVpnAuthorizationRules(
            DescribeClientVpnAuthorizationRulesRequest describeClientVpnAuthorizationRulesRequest);

    /**
     * <p>
     * Describes active client connections and connections that have been terminated within the last 60 minutes for the
     * specified Client VPN endpoint.
     * </p>
     * 
     * @param describeClientVpnConnectionsRequest
     * @return Result of the DescribeClientVpnConnections operation returned by the service.
     * @sample AmazonEC2.DescribeClientVpnConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeClientVpnConnections"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeClientVpnConnectionsResult describeClientVpnConnections(DescribeClientVpnConnectionsRequest describeClientVpnConnectionsRequest);

    /**
     * <p>
     * Describes one or more Client VPN endpoints in the account.
     * </p>
     * 
     * @param describeClientVpnEndpointsRequest
     * @return Result of the DescribeClientVpnEndpoints operation returned by the service.
     * @sample AmazonEC2.DescribeClientVpnEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeClientVpnEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeClientVpnEndpointsResult describeClientVpnEndpoints(DescribeClientVpnEndpointsRequest describeClientVpnEndpointsRequest);

    /**
     * <p>
     * Describes the routes for the specified Client VPN endpoint.
     * </p>
     * 
     * @param describeClientVpnRoutesRequest
     * @return Result of the DescribeClientVpnRoutes operation returned by the service.
     * @sample AmazonEC2.DescribeClientVpnRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeClientVpnRoutes" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeClientVpnRoutesResult describeClientVpnRoutes(DescribeClientVpnRoutesRequest describeClientVpnRoutesRequest);

    /**
     * <p>
     * Describes the target networks associated with the specified Client VPN endpoint.
     * </p>
     * 
     * @param describeClientVpnTargetNetworksRequest
     * @return Result of the DescribeClientVpnTargetNetworks operation returned by the service.
     * @sample AmazonEC2.DescribeClientVpnTargetNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeClientVpnTargetNetworks"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeClientVpnTargetNetworksResult describeClientVpnTargetNetworks(DescribeClientVpnTargetNetworksRequest describeClientVpnTargetNetworksRequest);

    /**
     * <p>
     * Describes the specified customer-owned address pools or all of your customer-owned address pools.
     * </p>
     * 
     * @param describeCoipPoolsRequest
     * @return Result of the DescribeCoipPools operation returned by the service.
     * @sample AmazonEC2.DescribeCoipPools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeCoipPools" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeCoipPoolsResult describeCoipPools(DescribeCoipPoolsRequest describeCoipPoolsRequest);

    /**
     * <p>
     * Describes the specified conversion tasks or all your conversion tasks. For more information, see the <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/">VM Import/Export User Guide</a>.
     * </p>
     * <p>
     * For information about the import manifest referenced by this API action, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM Import Manifest</a>.
     * </p>
     * 
     * @param describeConversionTasksRequest
     * @return Result of the DescribeConversionTasks operation returned by the service.
     * @sample AmazonEC2.DescribeConversionTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeConversionTasks" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeConversionTasksResult describeConversionTasks(DescribeConversionTasksRequest describeConversionTasksRequest);

    /**
     * Simplified method form for invoking the DescribeConversionTasks operation.
     *
     * @see #describeConversionTasks(DescribeConversionTasksRequest)
     */
    DescribeConversionTasksResult describeConversionTasks();

    /**
     * <p>
     * Describes one or more of your VPN customer gateways.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS Site-to-Site
     * VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * 
     * @param describeCustomerGatewaysRequest
     *        Contains the parameters for DescribeCustomerGateways.
     * @return Result of the DescribeCustomerGateways operation returned by the service.
     * @sample AmazonEC2.DescribeCustomerGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeCustomerGateways" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeCustomerGatewaysResult describeCustomerGateways(DescribeCustomerGatewaysRequest describeCustomerGatewaysRequest);

    /**
     * Simplified method form for invoking the DescribeCustomerGateways operation.
     *
     * @see #describeCustomerGateways(DescribeCustomerGatewaysRequest)
     */
    DescribeCustomerGatewaysResult describeCustomerGateways();

    /**
     * <p>
     * Describes one or more of your DHCP options sets.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_DHCP_Options.html">DHCP
     * Options Sets</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeDhcpOptionsRequest
     * @return Result of the DescribeDhcpOptions operation returned by the service.
     * @sample AmazonEC2.DescribeDhcpOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeDhcpOptions" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDhcpOptionsResult describeDhcpOptions(DescribeDhcpOptionsRequest describeDhcpOptionsRequest);

    /**
     * Simplified method form for invoking the DescribeDhcpOptions operation.
     *
     * @see #describeDhcpOptions(DescribeDhcpOptionsRequest)
     */
    DescribeDhcpOptionsResult describeDhcpOptions();

    /**
     * <p>
     * Describes one or more of your egress-only internet gateways.
     * </p>
     * 
     * @param describeEgressOnlyInternetGatewaysRequest
     * @return Result of the DescribeEgressOnlyInternetGateways operation returned by the service.
     * @sample AmazonEC2.DescribeEgressOnlyInternetGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeEgressOnlyInternetGateways"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEgressOnlyInternetGatewaysResult describeEgressOnlyInternetGateways(
            DescribeEgressOnlyInternetGatewaysRequest describeEgressOnlyInternetGatewaysRequest);

    /**
     * <p>
     * Describes the Elastic Graphics accelerator associated with your instances. For more information about Elastic
     * Graphics, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html">Amazon
     * Elastic Graphics</a>.
     * </p>
     * 
     * @param describeElasticGpusRequest
     * @return Result of the DescribeElasticGpus operation returned by the service.
     * @sample AmazonEC2.DescribeElasticGpus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeElasticGpus" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeElasticGpusResult describeElasticGpus(DescribeElasticGpusRequest describeElasticGpusRequest);

    /**
     * <p>
     * Describes the specified export image tasks or all of your export image tasks.
     * </p>
     * 
     * @param describeExportImageTasksRequest
     * @return Result of the DescribeExportImageTasks operation returned by the service.
     * @sample AmazonEC2.DescribeExportImageTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeExportImageTasks" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeExportImageTasksResult describeExportImageTasks(DescribeExportImageTasksRequest describeExportImageTasksRequest);

    /**
     * <p>
     * Describes the specified export instance tasks or all of your export instance tasks.
     * </p>
     * 
     * @param describeExportTasksRequest
     * @return Result of the DescribeExportTasks operation returned by the service.
     * @sample AmazonEC2.DescribeExportTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeExportTasks" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeExportTasksResult describeExportTasks(DescribeExportTasksRequest describeExportTasksRequest);

    /**
     * Simplified method form for invoking the DescribeExportTasks operation.
     *
     * @see #describeExportTasks(DescribeExportTasksRequest)
     */
    DescribeExportTasksResult describeExportTasks();

    /**
     * <p>
     * Describes the state of fast snapshot restores for your snapshots.
     * </p>
     * 
     * @param describeFastSnapshotRestoresRequest
     * @return Result of the DescribeFastSnapshotRestores operation returned by the service.
     * @sample AmazonEC2.DescribeFastSnapshotRestores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeFastSnapshotRestores"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeFastSnapshotRestoresResult describeFastSnapshotRestores(DescribeFastSnapshotRestoresRequest describeFastSnapshotRestoresRequest);

    /**
     * <p>
     * Describes the events for the specified EC2 Fleet during the specified time.
     * </p>
     * <p>
     * EC2 Fleet events are delayed by up to 30 seconds before they can be described. This ensures that you can query by
     * the last evaluated time and not miss a recorded event. EC2 Fleet events are available for 48 hours.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet.html#monitor-ec2-fleet">Monitoring your EC2
     * Fleet</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param describeFleetHistoryRequest
     * @return Result of the DescribeFleetHistory operation returned by the service.
     * @sample AmazonEC2.DescribeFleetHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeFleetHistory" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeFleetHistoryResult describeFleetHistory(DescribeFleetHistoryRequest describeFleetHistoryRequest);

    /**
     * <p>
     * Describes the running instances for the specified EC2 Fleet.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet.html#monitor-ec2-fleet">Monitoring your EC2
     * Fleet</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param describeFleetInstancesRequest
     * @return Result of the DescribeFleetInstances operation returned by the service.
     * @sample AmazonEC2.DescribeFleetInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeFleetInstances" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeFleetInstancesResult describeFleetInstances(DescribeFleetInstancesRequest describeFleetInstancesRequest);

    /**
     * <p>
     * Describes the specified EC2 Fleets or all of your EC2 Fleets.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet.html#monitor-ec2-fleet">Monitoring your EC2
     * Fleet</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param describeFleetsRequest
     * @return Result of the DescribeFleets operation returned by the service.
     * @sample AmazonEC2.DescribeFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeFleets" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeFleetsResult describeFleets(DescribeFleetsRequest describeFleetsRequest);

    /**
     * <p>
     * Describes one or more flow logs. To view the information in your flow logs (the log streams for the network
     * interfaces), you must use the CloudWatch Logs console or the CloudWatch Logs API.
     * </p>
     * 
     * @param describeFlowLogsRequest
     * @return Result of the DescribeFlowLogs operation returned by the service.
     * @sample AmazonEC2.DescribeFlowLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeFlowLogs" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeFlowLogsResult describeFlowLogs(DescribeFlowLogsRequest describeFlowLogsRequest);

    /**
     * Simplified method form for invoking the DescribeFlowLogs operation.
     *
     * @see #describeFlowLogs(DescribeFlowLogsRequest)
     */
    DescribeFlowLogsResult describeFlowLogs();

    /**
     * <p>
     * Describes the specified attribute of the specified Amazon FPGA Image (AFI).
     * </p>
     * 
     * @param describeFpgaImageAttributeRequest
     * @return Result of the DescribeFpgaImageAttribute operation returned by the service.
     * @sample AmazonEC2.DescribeFpgaImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeFpgaImageAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeFpgaImageAttributeResult describeFpgaImageAttribute(DescribeFpgaImageAttributeRequest describeFpgaImageAttributeRequest);

    /**
     * <p>
     * Describes the Amazon FPGA Images (AFIs) available to you. These include public AFIs, private AFIs that you own,
     * and AFIs owned by other AWS accounts for which you have load permissions.
     * </p>
     * 
     * @param describeFpgaImagesRequest
     * @return Result of the DescribeFpgaImages operation returned by the service.
     * @sample AmazonEC2.DescribeFpgaImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeFpgaImages" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeFpgaImagesResult describeFpgaImages(DescribeFpgaImagesRequest describeFpgaImagesRequest);

    /**
     * <p>
     * Describes the Dedicated Host reservations that are available to purchase.
     * </p>
     * <p>
     * The results describe all of the Dedicated Host reservation offerings, including offerings that might not match
     * the instance family and Region of your Dedicated Hosts. When purchasing an offering, ensure that the instance
     * family and Region of the offering matches that of the Dedicated Hosts with which it is to be associated. For more
     * information about supported instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-overview.html">Dedicated Hosts</a> in
     * the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param describeHostReservationOfferingsRequest
     * @return Result of the DescribeHostReservationOfferings operation returned by the service.
     * @sample AmazonEC2.DescribeHostReservationOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeHostReservationOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeHostReservationOfferingsResult describeHostReservationOfferings(DescribeHostReservationOfferingsRequest describeHostReservationOfferingsRequest);

    /**
     * <p>
     * Describes reservations that are associated with Dedicated Hosts in your account.
     * </p>
     * 
     * @param describeHostReservationsRequest
     * @return Result of the DescribeHostReservations operation returned by the service.
     * @sample AmazonEC2.DescribeHostReservations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeHostReservations" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeHostReservationsResult describeHostReservations(DescribeHostReservationsRequest describeHostReservationsRequest);

    /**
     * <p>
     * Describes the specified Dedicated Hosts or all your Dedicated Hosts.
     * </p>
     * <p>
     * The results describe only the Dedicated Hosts in the Region you're currently using. All listed instances consume
     * capacity on your Dedicated Host. Dedicated Hosts that have recently been released are listed with the state
     * <code>released</code>.
     * </p>
     * 
     * @param describeHostsRequest
     * @return Result of the DescribeHosts operation returned by the service.
     * @sample AmazonEC2.DescribeHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeHosts" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeHostsResult describeHosts(DescribeHostsRequest describeHostsRequest);

    /**
     * Simplified method form for invoking the DescribeHosts operation.
     *
     * @see #describeHosts(DescribeHostsRequest)
     */
    DescribeHostsResult describeHosts();

    /**
     * <p>
     * Describes your IAM instance profile associations.
     * </p>
     * 
     * @param describeIamInstanceProfileAssociationsRequest
     * @return Result of the DescribeIamInstanceProfileAssociations operation returned by the service.
     * @sample AmazonEC2.DescribeIamInstanceProfileAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeIamInstanceProfileAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeIamInstanceProfileAssociationsResult describeIamInstanceProfileAssociations(
            DescribeIamInstanceProfileAssociationsRequest describeIamInstanceProfileAssociationsRequest);

    /**
     * <p>
     * Describes the ID format settings for your resources on a per-Region basis, for example, to view which resource
     * types are enabled for longer IDs. This request only returns information about resource types whose ID formats can
     * be modified; it does not return information about other resource types.
     * </p>
     * <p>
     * The following resource types support longer IDs: <code>bundle</code> | <code>conversion-task</code> |
     * <code>customer-gateway</code> | <code>dhcp-options</code> | <code>elastic-ip-allocation</code> |
     * <code>elastic-ip-association</code> | <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
     * <code>import-task</code> | <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> | <code>network-interface-attachment</code>
     * | <code>prefix-list</code> | <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> | <code>snapshot</code> | <code>subnet</code>
     * | <code>subnet-cidr-block-association</code> | <code>volume</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>.
     * </p>
     * <p>
     * These settings apply to the IAM user who makes the request; they do not apply to the entire AWS account. By
     * default, an IAM user defaults to the same settings as the root user, unless they explicitly override the settings
     * by running the <a>ModifyIdFormat</a> command. Resources created with longer IDs are visible to all IAM users,
     * regardless of these settings and provided that they have permission to use the relevant <code>Describe</code>
     * command for the resource type.
     * </p>
     * 
     * @param describeIdFormatRequest
     * @return Result of the DescribeIdFormat operation returned by the service.
     * @sample AmazonEC2.DescribeIdFormat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeIdFormat" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeIdFormatResult describeIdFormat(DescribeIdFormatRequest describeIdFormatRequest);

    /**
     * Simplified method form for invoking the DescribeIdFormat operation.
     *
     * @see #describeIdFormat(DescribeIdFormatRequest)
     */
    DescribeIdFormatResult describeIdFormat();

    /**
     * <p>
     * Describes the ID format settings for resources for the specified IAM user, IAM role, or root user. For example,
     * you can view the resource types that are enabled for longer IDs. This request only returns information about
     * resource types whose ID formats can be modified; it does not return information about other resource types. For
     * more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/resource-ids.html">Resource
     * IDs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * The following resource types support longer IDs: <code>bundle</code> | <code>conversion-task</code> |
     * <code>customer-gateway</code> | <code>dhcp-options</code> | <code>elastic-ip-allocation</code> |
     * <code>elastic-ip-association</code> | <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
     * <code>import-task</code> | <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> | <code>network-interface-attachment</code>
     * | <code>prefix-list</code> | <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> | <code>snapshot</code> | <code>subnet</code>
     * | <code>subnet-cidr-block-association</code> | <code>volume</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>.
     * </p>
     * <p>
     * These settings apply to the principal specified in the request. They do not apply to the principal that makes the
     * request.
     * </p>
     * 
     * @param describeIdentityIdFormatRequest
     * @return Result of the DescribeIdentityIdFormat operation returned by the service.
     * @sample AmazonEC2.DescribeIdentityIdFormat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeIdentityIdFormat" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeIdentityIdFormatResult describeIdentityIdFormat(DescribeIdentityIdFormatRequest describeIdentityIdFormatRequest);

    /**
     * <p>
     * Describes the specified attribute of the specified AMI. You can specify only one attribute at a time.
     * </p>
     * 
     * @param describeImageAttributeRequest
     *        Contains the parameters for DescribeImageAttribute.
     * @return Result of the DescribeImageAttribute operation returned by the service.
     * @sample AmazonEC2.DescribeImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeImageAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeImageAttributeResult describeImageAttribute(DescribeImageAttributeRequest describeImageAttributeRequest);

    /**
     * <p>
     * Describes the specified images (AMIs, AKIs, and ARIs) available to you or all of the images available to you.
     * </p>
     * <p>
     * The images available to you include public images, private images that you own, and private images owned by other
     * AWS accounts for which you have explicit launch permissions.
     * </p>
     * <p>
     * Recently deregistered images appear in the returned results for a short interval and then return empty results.
     * After all instances that reference a deregistered AMI are terminated, specifying the ID of the image results in
     * an error indicating that the AMI ID cannot be found.
     * </p>
     * 
     * @param describeImagesRequest
     * @return Result of the DescribeImages operation returned by the service.
     * @sample AmazonEC2.DescribeImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeImages" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeImagesResult describeImages(DescribeImagesRequest describeImagesRequest);

    /**
     * Simplified method form for invoking the DescribeImages operation.
     *
     * @see #describeImages(DescribeImagesRequest)
     */
    DescribeImagesResult describeImages();

    /**
     * <p>
     * Displays details about an import virtual machine or import snapshot tasks that are already created.
     * </p>
     * 
     * @param describeImportImageTasksRequest
     * @return Result of the DescribeImportImageTasks operation returned by the service.
     * @sample AmazonEC2.DescribeImportImageTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeImportImageTasks" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeImportImageTasksResult describeImportImageTasks(DescribeImportImageTasksRequest describeImportImageTasksRequest);

    /**
     * Simplified method form for invoking the DescribeImportImageTasks operation.
     *
     * @see #describeImportImageTasks(DescribeImportImageTasksRequest)
     */
    DescribeImportImageTasksResult describeImportImageTasks();

    /**
     * <p>
     * Describes your import snapshot tasks.
     * </p>
     * 
     * @param describeImportSnapshotTasksRequest
     * @return Result of the DescribeImportSnapshotTasks operation returned by the service.
     * @sample AmazonEC2.DescribeImportSnapshotTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeImportSnapshotTasks"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeImportSnapshotTasksResult describeImportSnapshotTasks(DescribeImportSnapshotTasksRequest describeImportSnapshotTasksRequest);

    /**
     * Simplified method form for invoking the DescribeImportSnapshotTasks operation.
     *
     * @see #describeImportSnapshotTasks(DescribeImportSnapshotTasksRequest)
     */
    DescribeImportSnapshotTasksResult describeImportSnapshotTasks();

    /**
     * <p>
     * Describes the specified attribute of the specified instance. You can specify only one attribute at a time. Valid
     * attribute values are: <code>instanceType</code> | <code>kernel</code> | <code>ramdisk</code> |
     * <code>userData</code> | <code>disableApiTermination</code> | <code>instanceInitiatedShutdownBehavior</code> |
     * <code>rootDeviceName</code> | <code>blockDeviceMapping</code> | <code>productCodes</code> |
     * <code>sourceDestCheck</code> | <code>groupSet</code> | <code>ebsOptimized</code> | <code>sriovNetSupport</code>
     * </p>
     * 
     * @param describeInstanceAttributeRequest
     * @return Result of the DescribeInstanceAttribute operation returned by the service.
     * @sample AmazonEC2.DescribeInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInstanceAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeInstanceAttributeResult describeInstanceAttribute(DescribeInstanceAttributeRequest describeInstanceAttributeRequest);

    /**
     * <p>
     * Describes the credit option for CPU usage of the specified burstable performance instances. The credit options
     * are <code>standard</code> and <code>unlimited</code>.
     * </p>
     * <p>
     * If you do not specify an instance ID, Amazon EC2 returns burstable performance instances with the
     * <code>unlimited</code> credit option, as well as instances that were previously configured as T2, T3, and T3a
     * with the <code>unlimited</code> credit option. For example, if you resize a T2 instance, while it is configured
     * as <code>unlimited</code>, to an M4 instance, Amazon EC2 returns the M4 instance.
     * </p>
     * <p>
     * If you specify one or more instance IDs, Amazon EC2 returns the credit option (<code>standard</code> or
     * <code>unlimited</code>) of those instances. If you specify an instance ID that is not valid, such as an instance
     * that is not a burstable performance instance, an error is returned.
     * </p>
     * <p>
     * Recently terminated instances might appear in the returned results. This interval is usually less than one hour.
     * </p>
     * <p>
     * If an Availability Zone is experiencing a service disruption and you specify instance IDs in the affected zone,
     * or do not specify any instance IDs at all, the call fails. If you specify only instance IDs in an unaffected
     * zone, the call works normally.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * performance instances</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param describeInstanceCreditSpecificationsRequest
     * @return Result of the DescribeInstanceCreditSpecifications operation returned by the service.
     * @sample AmazonEC2.DescribeInstanceCreditSpecifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInstanceCreditSpecifications"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInstanceCreditSpecificationsResult describeInstanceCreditSpecifications(
            DescribeInstanceCreditSpecificationsRequest describeInstanceCreditSpecificationsRequest);

    /**
     * <p>
     * Describes the tag keys that are registered to appear in scheduled event notifications for resources in the
     * current Region.
     * </p>
     * 
     * @param describeInstanceEventNotificationAttributesRequest
     * @return Result of the DescribeInstanceEventNotificationAttributes operation returned by the service.
     * @sample AmazonEC2.DescribeInstanceEventNotificationAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInstanceEventNotificationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInstanceEventNotificationAttributesResult describeInstanceEventNotificationAttributes(
            DescribeInstanceEventNotificationAttributesRequest describeInstanceEventNotificationAttributesRequest);

    /**
     * <p>
     * Describes the status of the specified instances or all of your instances. By default, only running instances are
     * described, unless you specifically indicate to return the status of all instances.
     * </p>
     * <p>
     * Instance status includes the following components:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Status checks</b> - Amazon EC2 performs status checks on running EC2 instances to identify hardware and
     * software issues. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-system-instance-status-check.html">Status
     * checks for your instances</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstances.html">Troubleshooting
     * instances with failed status checks</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Scheduled events</b> - Amazon EC2 can schedule events (such as reboot, stop, or terminate) for your instances
     * related to hardware issues, software updates, or system maintenance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-instances-status-check_sched.html">Scheduled
     * events for your instances</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Instance state</b> - You can manage your instances from the moment you launch them through their termination.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html">Instance lifecycle</a> in
     * the <i>Amazon EC2 User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeInstanceStatusRequest
     * @return Result of the DescribeInstanceStatus operation returned by the service.
     * @sample AmazonEC2.DescribeInstanceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInstanceStatus" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeInstanceStatusResult describeInstanceStatus(DescribeInstanceStatusRequest describeInstanceStatusRequest);

    /**
     * Simplified method form for invoking the DescribeInstanceStatus operation.
     *
     * @see #describeInstanceStatus(DescribeInstanceStatusRequest)
     */
    DescribeInstanceStatusResult describeInstanceStatus();

    /**
     * <p>
     * Returns a list of all instance types offered. The results can be filtered by location (Region or Availability
     * Zone). If no location is specified, the instance types offered in the current Region are returned.
     * </p>
     * 
     * @param describeInstanceTypeOfferingsRequest
     * @return Result of the DescribeInstanceTypeOfferings operation returned by the service.
     * @sample AmazonEC2.DescribeInstanceTypeOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInstanceTypeOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInstanceTypeOfferingsResult describeInstanceTypeOfferings(DescribeInstanceTypeOfferingsRequest describeInstanceTypeOfferingsRequest);

    /**
     * <p>
     * Describes the details of the instance types that are offered in a location. The results can be filtered by the
     * attributes of the instance types.
     * </p>
     * 
     * @param describeInstanceTypesRequest
     * @return Result of the DescribeInstanceTypes operation returned by the service.
     * @sample AmazonEC2.DescribeInstanceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInstanceTypes" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeInstanceTypesResult describeInstanceTypes(DescribeInstanceTypesRequest describeInstanceTypesRequest);

    /**
     * <p>
     * Describes the specified instances or all instances.
     * </p>
     * <p>
     * If you specify instance IDs, the output includes information for only the specified instances. If you specify
     * filters, the output includes information for only those instances that meet the filter criteria. If you do not
     * specify instance IDs or filters, the output includes information for all instances, which can affect performance.
     * We recommend that you use pagination to ensure that the operation returns quickly and successfully.
     * </p>
     * <p>
     * If you specify an instance ID that is not valid, an error is returned. If you specify an instance that you do not
     * own, it is not included in the output.
     * </p>
     * <p>
     * Recently terminated instances might appear in the returned results. This interval is usually less than one hour.
     * </p>
     * <p>
     * If you describe instances in the rare case where an Availability Zone is experiencing a service disruption and
     * you specify instance IDs that are in the affected zone, or do not specify any instance IDs at all, the call
     * fails. If you describe instances and specify only instance IDs that are in an unaffected zone, the call works
     * normally.
     * </p>
     * 
     * @param describeInstancesRequest
     * @return Result of the DescribeInstances operation returned by the service.
     * @sample AmazonEC2.DescribeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInstances" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeInstancesResult describeInstances(DescribeInstancesRequest describeInstancesRequest);

    /**
     * Simplified method form for invoking the DescribeInstances operation.
     *
     * @see #describeInstances(DescribeInstancesRequest)
     */
    DescribeInstancesResult describeInstances();

    /**
     * <p>
     * Describes one or more of your internet gateways.
     * </p>
     * 
     * @param describeInternetGatewaysRequest
     * @return Result of the DescribeInternetGateways operation returned by the service.
     * @sample AmazonEC2.DescribeInternetGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeInternetGateways" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeInternetGatewaysResult describeInternetGateways(DescribeInternetGatewaysRequest describeInternetGatewaysRequest);

    /**
     * Simplified method form for invoking the DescribeInternetGateways operation.
     *
     * @see #describeInternetGateways(DescribeInternetGatewaysRequest)
     */
    DescribeInternetGatewaysResult describeInternetGateways();

    /**
     * <p>
     * Describes your IPv6 address pools.
     * </p>
     * 
     * @param describeIpv6PoolsRequest
     * @return Result of the DescribeIpv6Pools operation returned by the service.
     * @sample AmazonEC2.DescribeIpv6Pools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeIpv6Pools" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeIpv6PoolsResult describeIpv6Pools(DescribeIpv6PoolsRequest describeIpv6PoolsRequest);

    /**
     * <p>
     * Describes the specified key pairs or all of your key pairs.
     * </p>
     * <p>
     * For more information about key pairs, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Key Pairs</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeKeyPairsRequest
     * @return Result of the DescribeKeyPairs operation returned by the service.
     * @sample AmazonEC2.DescribeKeyPairs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeKeyPairs" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeKeyPairsResult describeKeyPairs(DescribeKeyPairsRequest describeKeyPairsRequest);

    /**
     * Simplified method form for invoking the DescribeKeyPairs operation.
     *
     * @see #describeKeyPairs(DescribeKeyPairsRequest)
     */
    DescribeKeyPairsResult describeKeyPairs();

    /**
     * <p>
     * Describes one or more versions of a specified launch template. You can describe all versions, individual
     * versions, or a range of versions. You can also describe all the latest versions or all the default versions of
     * all the launch templates in your account.
     * </p>
     * 
     * @param describeLaunchTemplateVersionsRequest
     * @return Result of the DescribeLaunchTemplateVersions operation returned by the service.
     * @sample AmazonEC2.DescribeLaunchTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeLaunchTemplateVersions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLaunchTemplateVersionsResult describeLaunchTemplateVersions(DescribeLaunchTemplateVersionsRequest describeLaunchTemplateVersionsRequest);

    /**
     * <p>
     * Describes one or more launch templates.
     * </p>
     * 
     * @param describeLaunchTemplatesRequest
     * @return Result of the DescribeLaunchTemplates operation returned by the service.
     * @sample AmazonEC2.DescribeLaunchTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeLaunchTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeLaunchTemplatesResult describeLaunchTemplates(DescribeLaunchTemplatesRequest describeLaunchTemplatesRequest);

    /**
     * <p>
     * Describes the associations between virtual interface groups and local gateway route tables.
     * </p>
     * 
     * @param describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest
     * @return Result of the DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociations operation returned by the
     *         service.
     * @sample AmazonEC2.DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult describeLocalGatewayRouteTableVirtualInterfaceGroupAssociations(
            DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest);

    /**
     * <p>
     * Describes the specified associations between VPCs and local gateway route tables.
     * </p>
     * 
     * @param describeLocalGatewayRouteTableVpcAssociationsRequest
     * @return Result of the DescribeLocalGatewayRouteTableVpcAssociations operation returned by the service.
     * @sample AmazonEC2.DescribeLocalGatewayRouteTableVpcAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeLocalGatewayRouteTableVpcAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLocalGatewayRouteTableVpcAssociationsResult describeLocalGatewayRouteTableVpcAssociations(
            DescribeLocalGatewayRouteTableVpcAssociationsRequest describeLocalGatewayRouteTableVpcAssociationsRequest);

    /**
     * <p>
     * Describes one or more local gateway route tables. By default, all local gateway route tables are described.
     * Alternatively, you can filter the results.
     * </p>
     * 
     * @param describeLocalGatewayRouteTablesRequest
     * @return Result of the DescribeLocalGatewayRouteTables operation returned by the service.
     * @sample AmazonEC2.DescribeLocalGatewayRouteTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeLocalGatewayRouteTables"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLocalGatewayRouteTablesResult describeLocalGatewayRouteTables(DescribeLocalGatewayRouteTablesRequest describeLocalGatewayRouteTablesRequest);

    /**
     * <p>
     * Describes the specified local gateway virtual interface groups.
     * </p>
     * 
     * @param describeLocalGatewayVirtualInterfaceGroupsRequest
     * @return Result of the DescribeLocalGatewayVirtualInterfaceGroups operation returned by the service.
     * @sample AmazonEC2.DescribeLocalGatewayVirtualInterfaceGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeLocalGatewayVirtualInterfaceGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLocalGatewayVirtualInterfaceGroupsResult describeLocalGatewayVirtualInterfaceGroups(
            DescribeLocalGatewayVirtualInterfaceGroupsRequest describeLocalGatewayVirtualInterfaceGroupsRequest);

    /**
     * <p>
     * Describes the specified local gateway virtual interfaces.
     * </p>
     * 
     * @param describeLocalGatewayVirtualInterfacesRequest
     * @return Result of the DescribeLocalGatewayVirtualInterfaces operation returned by the service.
     * @sample AmazonEC2.DescribeLocalGatewayVirtualInterfaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeLocalGatewayVirtualInterfaces"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLocalGatewayVirtualInterfacesResult describeLocalGatewayVirtualInterfaces(
            DescribeLocalGatewayVirtualInterfacesRequest describeLocalGatewayVirtualInterfacesRequest);

    /**
     * <p>
     * Describes one or more local gateways. By default, all local gateways are described. Alternatively, you can filter
     * the results.
     * </p>
     * 
     * @param describeLocalGatewaysRequest
     * @return Result of the DescribeLocalGateways operation returned by the service.
     * @sample AmazonEC2.DescribeLocalGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeLocalGateways" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeLocalGatewaysResult describeLocalGateways(DescribeLocalGatewaysRequest describeLocalGatewaysRequest);

    /**
     * <p>
     * Describes your managed prefix lists and any AWS-managed prefix lists.
     * </p>
     * <p>
     * To view the entries for your prefix list, use <a>GetManagedPrefixListEntries</a>.
     * </p>
     * 
     * @param describeManagedPrefixListsRequest
     * @return Result of the DescribeManagedPrefixLists operation returned by the service.
     * @sample AmazonEC2.DescribeManagedPrefixLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeManagedPrefixLists" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeManagedPrefixListsResult describeManagedPrefixLists(DescribeManagedPrefixListsRequest describeManagedPrefixListsRequest);

    /**
     * <p>
     * Describes your Elastic IP addresses that are being moved to the EC2-VPC platform, or that are being restored to
     * the EC2-Classic platform. This request does not return information about any other Elastic IP addresses in your
     * account.
     * </p>
     * 
     * @param describeMovingAddressesRequest
     * @return Result of the DescribeMovingAddresses operation returned by the service.
     * @sample AmazonEC2.DescribeMovingAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeMovingAddresses" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeMovingAddressesResult describeMovingAddresses(DescribeMovingAddressesRequest describeMovingAddressesRequest);

    /**
     * Simplified method form for invoking the DescribeMovingAddresses operation.
     *
     * @see #describeMovingAddresses(DescribeMovingAddressesRequest)
     */
    DescribeMovingAddressesResult describeMovingAddresses();

    /**
     * <p>
     * Describes one or more of your NAT gateways.
     * </p>
     * 
     * @param describeNatGatewaysRequest
     * @return Result of the DescribeNatGateways operation returned by the service.
     * @sample AmazonEC2.DescribeNatGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNatGateways" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeNatGatewaysResult describeNatGateways(DescribeNatGatewaysRequest describeNatGatewaysRequest);

    /**
     * <p>
     * Describes one or more of your network ACLs.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_ACLs.html">Network
     * ACLs</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeNetworkAclsRequest
     * @return Result of the DescribeNetworkAcls operation returned by the service.
     * @sample AmazonEC2.DescribeNetworkAcls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNetworkAcls" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeNetworkAclsResult describeNetworkAcls(DescribeNetworkAclsRequest describeNetworkAclsRequest);

    /**
     * Simplified method form for invoking the DescribeNetworkAcls operation.
     *
     * @see #describeNetworkAcls(DescribeNetworkAclsRequest)
     */
    DescribeNetworkAclsResult describeNetworkAcls();

    /**
     * <p>
     * Describes one or more of your network insights analyses.
     * </p>
     * 
     * @param describeNetworkInsightsAnalysesRequest
     * @return Result of the DescribeNetworkInsightsAnalyses operation returned by the service.
     * @sample AmazonEC2.DescribeNetworkInsightsAnalyses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNetworkInsightsAnalyses"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeNetworkInsightsAnalysesResult describeNetworkInsightsAnalyses(DescribeNetworkInsightsAnalysesRequest describeNetworkInsightsAnalysesRequest);

    /**
     * <p>
     * Describes one or more of your paths.
     * </p>
     * 
     * @param describeNetworkInsightsPathsRequest
     * @return Result of the DescribeNetworkInsightsPaths operation returned by the service.
     * @sample AmazonEC2.DescribeNetworkInsightsPaths
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNetworkInsightsPaths"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeNetworkInsightsPathsResult describeNetworkInsightsPaths(DescribeNetworkInsightsPathsRequest describeNetworkInsightsPathsRequest);

    /**
     * <p>
     * Describes a network interface attribute. You can specify only one attribute at a time.
     * </p>
     * 
     * @param describeNetworkInterfaceAttributeRequest
     *        Contains the parameters for DescribeNetworkInterfaceAttribute.
     * @return Result of the DescribeNetworkInterfaceAttribute operation returned by the service.
     * @sample AmazonEC2.DescribeNetworkInterfaceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNetworkInterfaceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeNetworkInterfaceAttributeResult describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest describeNetworkInterfaceAttributeRequest);

    /**
     * <p>
     * Describes the permissions for your network interfaces.
     * </p>
     * 
     * @param describeNetworkInterfacePermissionsRequest
     *        Contains the parameters for DescribeNetworkInterfacePermissions.
     * @return Result of the DescribeNetworkInterfacePermissions operation returned by the service.
     * @sample AmazonEC2.DescribeNetworkInterfacePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNetworkInterfacePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeNetworkInterfacePermissionsResult describeNetworkInterfacePermissions(
            DescribeNetworkInterfacePermissionsRequest describeNetworkInterfacePermissionsRequest);

    /**
     * <p>
     * Describes one or more of your network interfaces.
     * </p>
     * 
     * @param describeNetworkInterfacesRequest
     *        Contains the parameters for DescribeNetworkInterfaces.
     * @return Result of the DescribeNetworkInterfaces operation returned by the service.
     * @sample AmazonEC2.DescribeNetworkInterfaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeNetworkInterfaces" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeNetworkInterfacesResult describeNetworkInterfaces(DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest);

    /**
     * Simplified method form for invoking the DescribeNetworkInterfaces operation.
     *
     * @see #describeNetworkInterfaces(DescribeNetworkInterfacesRequest)
     */
    DescribeNetworkInterfacesResult describeNetworkInterfaces();

    /**
     * <p>
     * Describes the specified placement groups or all of your placement groups. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement groups</a> in the
     * <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param describePlacementGroupsRequest
     * @return Result of the DescribePlacementGroups operation returned by the service.
     * @sample AmazonEC2.DescribePlacementGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribePlacementGroups" target="_top">AWS
     *      API Documentation</a>
     */
    DescribePlacementGroupsResult describePlacementGroups(DescribePlacementGroupsRequest describePlacementGroupsRequest);

    /**
     * Simplified method form for invoking the DescribePlacementGroups operation.
     *
     * @see #describePlacementGroups(DescribePlacementGroupsRequest)
     */
    DescribePlacementGroupsResult describePlacementGroups();

    /**
     * <p>
     * Describes available AWS services in a prefix list format, which includes the prefix list name and prefix list ID
     * of the service and the IP address range for the service.
     * </p>
     * <p>
     * We recommend that you use <a>DescribeManagedPrefixLists</a> instead.
     * </p>
     * 
     * @param describePrefixListsRequest
     * @return Result of the DescribePrefixLists operation returned by the service.
     * @sample AmazonEC2.DescribePrefixLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribePrefixLists" target="_top">AWS API
     *      Documentation</a>
     */
    DescribePrefixListsResult describePrefixLists(DescribePrefixListsRequest describePrefixListsRequest);

    /**
     * Simplified method form for invoking the DescribePrefixLists operation.
     *
     * @see #describePrefixLists(DescribePrefixListsRequest)
     */
    DescribePrefixListsResult describePrefixLists();

    /**
     * <p>
     * Describes the ID format settings for the root user and all IAM roles and IAM users that have explicitly specified
     * a longer ID (17-character ID) preference.
     * </p>
     * <p>
     * By default, all IAM roles and IAM users default to the same ID settings as the root user, unless they explicitly
     * override the settings. This request is useful for identifying those IAM users and IAM roles that have overridden
     * the default ID settings.
     * </p>
     * <p>
     * The following resource types support longer IDs: <code>bundle</code> | <code>conversion-task</code> |
     * <code>customer-gateway</code> | <code>dhcp-options</code> | <code>elastic-ip-allocation</code> |
     * <code>elastic-ip-association</code> | <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
     * <code>import-task</code> | <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> | <code>network-interface-attachment</code>
     * | <code>prefix-list</code> | <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> | <code>snapshot</code> | <code>subnet</code>
     * | <code>subnet-cidr-block-association</code> | <code>volume</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>.
     * </p>
     * 
     * @param describePrincipalIdFormatRequest
     * @return Result of the DescribePrincipalIdFormat operation returned by the service.
     * @sample AmazonEC2.DescribePrincipalIdFormat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribePrincipalIdFormat" target="_top">AWS
     *      API Documentation</a>
     */
    DescribePrincipalIdFormatResult describePrincipalIdFormat(DescribePrincipalIdFormatRequest describePrincipalIdFormatRequest);

    /**
     * <p>
     * Describes the specified IPv4 address pools.
     * </p>
     * 
     * @param describePublicIpv4PoolsRequest
     * @return Result of the DescribePublicIpv4Pools operation returned by the service.
     * @sample AmazonEC2.DescribePublicIpv4Pools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribePublicIpv4Pools" target="_top">AWS
     *      API Documentation</a>
     */
    DescribePublicIpv4PoolsResult describePublicIpv4Pools(DescribePublicIpv4PoolsRequest describePublicIpv4PoolsRequest);

    /**
     * <p>
     * Describes the Regions that are enabled for your account, or all Regions.
     * </p>
     * <p>
     * For a list of the Regions supported by Amazon EC2, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#ec2_region"> Regions and Endpoints</a>.
     * </p>
     * <p>
     * For information about enabling and disabling Regions for your account, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html">Managing AWS Regions</a> in the <i>AWS
     * General Reference</i>.
     * </p>
     * 
     * @param describeRegionsRequest
     * @return Result of the DescribeRegions operation returned by the service.
     * @sample AmazonEC2.DescribeRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeRegions" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeRegionsResult describeRegions(DescribeRegionsRequest describeRegionsRequest);

    /**
     * Simplified method form for invoking the DescribeRegions operation.
     *
     * @see #describeRegions(DescribeRegionsRequest)
     */
    DescribeRegionsResult describeRegions();

    /**
     * <p>
     * Describes a root volume replacement task. For more information, see <a
     * href="https://docs.aws.amazon.com/">Replace a root volume</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param describeReplaceRootVolumeTasksRequest
     * @return Result of the DescribeReplaceRootVolumeTasks operation returned by the service.
     * @sample AmazonEC2.DescribeReplaceRootVolumeTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeReplaceRootVolumeTasks"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReplaceRootVolumeTasksResult describeReplaceRootVolumeTasks(DescribeReplaceRootVolumeTasksRequest describeReplaceRootVolumeTasksRequest);

    /**
     * <p>
     * Describes one or more of the Reserved Instances that you purchased.
     * </p>
     * <p>
     * For more information about Reserved Instances, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts-on-demand-reserved-instances.html">Reserved
     * Instances</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param describeReservedInstancesRequest
     *        Contains the parameters for DescribeReservedInstances.
     * @return Result of the DescribeReservedInstances operation returned by the service.
     * @sample AmazonEC2.DescribeReservedInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeReservedInstances" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeReservedInstancesResult describeReservedInstances(DescribeReservedInstancesRequest describeReservedInstancesRequest);

    /**
     * Simplified method form for invoking the DescribeReservedInstances operation.
     *
     * @see #describeReservedInstances(DescribeReservedInstancesRequest)
     */
    DescribeReservedInstancesResult describeReservedInstances();

    /**
     * <p>
     * Describes your account's Reserved Instance listings in the Reserved Instance Marketplace.
     * </p>
     * <p>
     * The Reserved Instance Marketplace matches sellers who want to resell Reserved Instance capacity that they no
     * longer need with buyers who want to purchase additional capacity. Reserved Instances bought and sold through the
     * Reserved Instance Marketplace work like any other Reserved Instances.
     * </p>
     * <p>
     * As a seller, you choose to list some or all of your Reserved Instances, and you specify the upfront price to
     * receive for them. Your Reserved Instances are then listed in the Reserved Instance Marketplace and are available
     * for purchase.
     * </p>
     * <p>
     * As a buyer, you specify the configuration of the Reserved Instance to purchase, and the Marketplace matches what
     * you're searching for with what's available. The Marketplace first sells the lowest priced Reserved Instances to
     * you, and continues to sell available Reserved Instance listings to you until your demand is met. You are charged
     * based on the total price of all of the listings that you purchase.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html">Reserved Instance
     * Marketplace</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param describeReservedInstancesListingsRequest
     *        Contains the parameters for DescribeReservedInstancesListings.
     * @return Result of the DescribeReservedInstancesListings operation returned by the service.
     * @sample AmazonEC2.DescribeReservedInstancesListings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeReservedInstancesListings"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReservedInstancesListingsResult describeReservedInstancesListings(DescribeReservedInstancesListingsRequest describeReservedInstancesListingsRequest);

    /**
     * Simplified method form for invoking the DescribeReservedInstancesListings operation.
     *
     * @see #describeReservedInstancesListings(DescribeReservedInstancesListingsRequest)
     */
    DescribeReservedInstancesListingsResult describeReservedInstancesListings();

    /**
     * <p>
     * Describes the modifications made to your Reserved Instances. If no parameter is specified, information about all
     * your Reserved Instances modification requests is returned. If a modification ID is specified, only information
     * about the specific modification is returned.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-modifying.html">Modifying Reserved Instances</a> in
     * the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param describeReservedInstancesModificationsRequest
     *        Contains the parameters for DescribeReservedInstancesModifications.
     * @return Result of the DescribeReservedInstancesModifications operation returned by the service.
     * @sample AmazonEC2.DescribeReservedInstancesModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeReservedInstancesModifications"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReservedInstancesModificationsResult describeReservedInstancesModifications(
            DescribeReservedInstancesModificationsRequest describeReservedInstancesModificationsRequest);

    /**
     * Simplified method form for invoking the DescribeReservedInstancesModifications operation.
     *
     * @see #describeReservedInstancesModifications(DescribeReservedInstancesModificationsRequest)
     */
    DescribeReservedInstancesModificationsResult describeReservedInstancesModifications();

    /**
     * <p>
     * Describes Reserved Instance offerings that are available for purchase. With Reserved Instances, you purchase the
     * right to launch instances for a period of time. During that time period, you do not receive insufficient capacity
     * errors, and you pay a lower usage rate than the rate charged for On-Demand instances for the actual time used.
     * </p>
     * <p>
     * If you have listed your own Reserved Instances for sale in the Reserved Instance Marketplace, they will be
     * excluded from these results. This is to ensure that you do not purchase your own Reserved Instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html">Reserved Instance
     * Marketplace</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param describeReservedInstancesOfferingsRequest
     *        Contains the parameters for DescribeReservedInstancesOfferings.
     * @return Result of the DescribeReservedInstancesOfferings operation returned by the service.
     * @sample AmazonEC2.DescribeReservedInstancesOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeReservedInstancesOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReservedInstancesOfferingsResult describeReservedInstancesOfferings(
            DescribeReservedInstancesOfferingsRequest describeReservedInstancesOfferingsRequest);

    /**
     * Simplified method form for invoking the DescribeReservedInstancesOfferings operation.
     *
     * @see #describeReservedInstancesOfferings(DescribeReservedInstancesOfferingsRequest)
     */
    DescribeReservedInstancesOfferingsResult describeReservedInstancesOfferings();

    /**
     * <p>
     * Describes one or more of your route tables.
     * </p>
     * <p>
     * Each subnet in your VPC must be associated with a route table. If a subnet is not explicitly associated with any
     * route table, it is implicitly associated with the main route table. This command does not return the subnet ID
     * for implicit associations.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html">Route
     * Tables</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeRouteTablesRequest
     * @return Result of the DescribeRouteTables operation returned by the service.
     * @sample AmazonEC2.DescribeRouteTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeRouteTables" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeRouteTablesResult describeRouteTables(DescribeRouteTablesRequest describeRouteTablesRequest);

    /**
     * Simplified method form for invoking the DescribeRouteTables operation.
     *
     * @see #describeRouteTables(DescribeRouteTablesRequest)
     */
    DescribeRouteTablesResult describeRouteTables();

    /**
     * <p>
     * Finds available schedules that meet the specified criteria.
     * </p>
     * <p>
     * You can search for an available schedule no more than 3 months in advance. You must meet the minimum required
     * duration of 1,200 hours per year. For example, the minimum daily schedule is 4 hours, the minimum weekly schedule
     * is 24 hours, and the minimum monthly schedule is 100 hours.
     * </p>
     * <p>
     * After you find a schedule that meets your needs, call <a>PurchaseScheduledInstances</a> to purchase Scheduled
     * Instances with that schedule.
     * </p>
     * 
     * @param describeScheduledInstanceAvailabilityRequest
     *        Contains the parameters for DescribeScheduledInstanceAvailability.
     * @return Result of the DescribeScheduledInstanceAvailability operation returned by the service.
     * @sample AmazonEC2.DescribeScheduledInstanceAvailability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeScheduledInstanceAvailability"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeScheduledInstanceAvailabilityResult describeScheduledInstanceAvailability(
            DescribeScheduledInstanceAvailabilityRequest describeScheduledInstanceAvailabilityRequest);

    /**
     * <p>
     * Describes the specified Scheduled Instances or all your Scheduled Instances.
     * </p>
     * 
     * @param describeScheduledInstancesRequest
     *        Contains the parameters for DescribeScheduledInstances.
     * @return Result of the DescribeScheduledInstances operation returned by the service.
     * @sample AmazonEC2.DescribeScheduledInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeScheduledInstances" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeScheduledInstancesResult describeScheduledInstances(DescribeScheduledInstancesRequest describeScheduledInstancesRequest);

    /**
     * <p>
     * [VPC only] Describes the VPCs on the other side of a VPC peering connection that are referencing the security
     * groups you've specified in this request.
     * </p>
     * 
     * @param describeSecurityGroupReferencesRequest
     * @return Result of the DescribeSecurityGroupReferences operation returned by the service.
     * @sample AmazonEC2.DescribeSecurityGroupReferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSecurityGroupReferences"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSecurityGroupReferencesResult describeSecurityGroupReferences(DescribeSecurityGroupReferencesRequest describeSecurityGroupReferencesRequest);

    /**
     * <p>
     * Describes the specified security groups or all of your security groups.
     * </p>
     * <p>
     * A security group is for use with instances either in the EC2-Classic platform or in a specific VPC. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon
     * EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security Groups for Your
     * VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeSecurityGroupsRequest
     * @return Result of the DescribeSecurityGroups operation returned by the service.
     * @sample AmazonEC2.DescribeSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSecurityGroups" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSecurityGroupsResult describeSecurityGroups(DescribeSecurityGroupsRequest describeSecurityGroupsRequest);

    /**
     * Simplified method form for invoking the DescribeSecurityGroups operation.
     *
     * @see #describeSecurityGroups(DescribeSecurityGroupsRequest)
     */
    DescribeSecurityGroupsResult describeSecurityGroups();

    /**
     * <p>
     * Describes the specified attribute of the specified snapshot. You can specify only one attribute at a time.
     * </p>
     * <p>
     * For more information about EBS snapshots, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html">Amazon EBS snapshots</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeSnapshotAttributeRequest
     * @return Result of the DescribeSnapshotAttribute operation returned by the service.
     * @sample AmazonEC2.DescribeSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSnapshotAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeSnapshotAttributeResult describeSnapshotAttribute(DescribeSnapshotAttributeRequest describeSnapshotAttributeRequest);

    /**
     * <p>
     * Describes the specified EBS snapshots available to you or all of the EBS snapshots available to you.
     * </p>
     * <p>
     * The snapshots available to you include public snapshots, private snapshots that you own, and private snapshots
     * owned by other AWS accounts for which you have explicit create volume permissions.
     * </p>
     * <p>
     * The create volume permissions fall into the following categories:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>public</i>: The owner of the snapshot granted create volume permissions for the snapshot to the
     * <code>all</code> group. All AWS accounts have create volume permissions for these snapshots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>explicit</i>: The owner of the snapshot granted create volume permissions to a specific AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>implicit</i>: An AWS account has implicit create volume permissions for all snapshots it owns.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The list of snapshots returned can be filtered by specifying snapshot IDs, snapshot owners, or AWS accounts with
     * create volume permissions. If no options are specified, Amazon EC2 returns all snapshots for which you have
     * create volume permissions.
     * </p>
     * <p>
     * If you specify one or more snapshot IDs, only snapshots that have the specified IDs are returned. If you specify
     * an invalid snapshot ID, an error is returned. If you specify a snapshot ID for which you do not have access, it
     * is not included in the returned results.
     * </p>
     * <p>
     * If you specify one or more snapshot owners using the <code>OwnerIds</code> option, only snapshots from the
     * specified owners and for which you have access are returned. The results can include the AWS account IDs of the
     * specified owners, <code>amazon</code> for snapshots owned by Amazon, or <code>self</code> for snapshots that you
     * own.
     * </p>
     * <p>
     * If you specify a list of restorable users, only snapshots with create snapshot permissions for those users are
     * returned. You can specify AWS account IDs (if you own the snapshots), <code>self</code> for snapshots for which
     * you own or have explicit permissions, or <code>all</code> for public snapshots.
     * </p>
     * <p>
     * If you are describing a long list of snapshots, we recommend that you paginate the output to make the list more
     * manageable. The <code>MaxResults</code> parameter sets the maximum number of results returned in a single page.
     * If the list of results exceeds your <code>MaxResults</code> value, then that number of results is returned along
     * with a <code>NextToken</code> value that can be passed to a subsequent <code>DescribeSnapshots</code> request to
     * retrieve the remaining results.
     * </p>
     * <p>
     * To get the state of fast snapshot restores for a snapshot, use <a>DescribeFastSnapshotRestores</a>.
     * </p>
     * <p>
     * For more information about EBS snapshots, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html">Amazon EBS snapshots</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeSnapshotsRequest
     * @return Result of the DescribeSnapshots operation returned by the service.
     * @sample AmazonEC2.DescribeSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest);

    /**
     * Simplified method form for invoking the DescribeSnapshots operation.
     *
     * @see #describeSnapshots(DescribeSnapshotsRequest)
     */
    DescribeSnapshotsResult describeSnapshots();

    /**
     * <p>
     * Describes the data feed for Spot Instances. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-data-feeds.html">Spot Instance data feed</a> in
     * the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param describeSpotDatafeedSubscriptionRequest
     *        Contains the parameters for DescribeSpotDatafeedSubscription.
     * @return Result of the DescribeSpotDatafeedSubscription operation returned by the service.
     * @sample AmazonEC2.DescribeSpotDatafeedSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotDatafeedSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSpotDatafeedSubscriptionResult describeSpotDatafeedSubscription(DescribeSpotDatafeedSubscriptionRequest describeSpotDatafeedSubscriptionRequest);

    /**
     * Simplified method form for invoking the DescribeSpotDatafeedSubscription operation.
     *
     * @see #describeSpotDatafeedSubscription(DescribeSpotDatafeedSubscriptionRequest)
     */
    DescribeSpotDatafeedSubscriptionResult describeSpotDatafeedSubscription();

    /**
     * <p>
     * Describes the running instances for the specified Spot Fleet.
     * </p>
     * 
     * @param describeSpotFleetInstancesRequest
     *        Contains the parameters for DescribeSpotFleetInstances.
     * @return Result of the DescribeSpotFleetInstances operation returned by the service.
     * @sample AmazonEC2.DescribeSpotFleetInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotFleetInstances" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeSpotFleetInstancesResult describeSpotFleetInstances(DescribeSpotFleetInstancesRequest describeSpotFleetInstancesRequest);

    /**
     * <p>
     * Describes the events for the specified Spot Fleet request during the specified time.
     * </p>
     * <p>
     * Spot Fleet events are delayed by up to 30 seconds before they can be described. This ensures that you can query
     * by the last evaluated time and not miss a recorded event. Spot Fleet events are available for 48 hours.
     * </p>
     * 
     * @param describeSpotFleetRequestHistoryRequest
     *        Contains the parameters for DescribeSpotFleetRequestHistory.
     * @return Result of the DescribeSpotFleetRequestHistory operation returned by the service.
     * @sample AmazonEC2.DescribeSpotFleetRequestHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotFleetRequestHistory"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSpotFleetRequestHistoryResult describeSpotFleetRequestHistory(DescribeSpotFleetRequestHistoryRequest describeSpotFleetRequestHistoryRequest);

    /**
     * <p>
     * Describes your Spot Fleet requests.
     * </p>
     * <p>
     * Spot Fleet requests are deleted 48 hours after they are canceled and their instances are terminated.
     * </p>
     * 
     * @param describeSpotFleetRequestsRequest
     *        Contains the parameters for DescribeSpotFleetRequests.
     * @return Result of the DescribeSpotFleetRequests operation returned by the service.
     * @sample AmazonEC2.DescribeSpotFleetRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotFleetRequests" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeSpotFleetRequestsResult describeSpotFleetRequests(DescribeSpotFleetRequestsRequest describeSpotFleetRequestsRequest);

    /**
     * Simplified method form for invoking the DescribeSpotFleetRequests operation.
     *
     * @see #describeSpotFleetRequests(DescribeSpotFleetRequestsRequest)
     */
    DescribeSpotFleetRequestsResult describeSpotFleetRequests();

    /**
     * <p>
     * Describes the specified Spot Instance requests.
     * </p>
     * <p>
     * You can use <code>DescribeSpotInstanceRequests</code> to find a running Spot Instance by examining the response.
     * If the status of the Spot Instance is <code>fulfilled</code>, the instance ID appears in the response and
     * contains the identifier of the instance. Alternatively, you can use <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances">DescribeInstances</a> with a
     * filter to look for instances where the instance lifecycle is <code>spot</code>.
     * </p>
     * <p>
     * We recommend that you set <code>MaxResults</code> to a value between 5 and 1000 to limit the number of results
     * returned. This paginates the output, which makes the list more manageable and returns the results faster. If the
     * list of results exceeds your <code>MaxResults</code> value, then that number of results is returned along with a
     * <code>NextToken</code> value that can be passed to a subsequent <code>DescribeSpotInstanceRequests</code> request
     * to retrieve the remaining results.
     * </p>
     * <p>
     * Spot Instance requests are deleted four hours after they are canceled and their instances are terminated.
     * </p>
     * 
     * @param describeSpotInstanceRequestsRequest
     *        Contains the parameters for DescribeSpotInstanceRequests.
     * @return Result of the DescribeSpotInstanceRequests operation returned by the service.
     * @sample AmazonEC2.DescribeSpotInstanceRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotInstanceRequests"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSpotInstanceRequestsResult describeSpotInstanceRequests(DescribeSpotInstanceRequestsRequest describeSpotInstanceRequestsRequest);

    /**
     * Simplified method form for invoking the DescribeSpotInstanceRequests operation.
     *
     * @see #describeSpotInstanceRequests(DescribeSpotInstanceRequestsRequest)
     */
    DescribeSpotInstanceRequestsResult describeSpotInstanceRequests();

    /**
     * <p>
     * Describes the Spot price history. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances-history.html">Spot Instance
     * pricing history</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * When you specify a start and end time, the operation returns the prices of the instance types within that time
     * range. It also returns the last price change before the start time, which is the effective price as of the start
     * time.
     * </p>
     * 
     * @param describeSpotPriceHistoryRequest
     *        Contains the parameters for DescribeSpotPriceHistory.
     * @return Result of the DescribeSpotPriceHistory operation returned by the service.
     * @sample AmazonEC2.DescribeSpotPriceHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSpotPriceHistory" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeSpotPriceHistoryResult describeSpotPriceHistory(DescribeSpotPriceHistoryRequest describeSpotPriceHistoryRequest);

    /**
     * Simplified method form for invoking the DescribeSpotPriceHistory operation.
     *
     * @see #describeSpotPriceHistory(DescribeSpotPriceHistoryRequest)
     */
    DescribeSpotPriceHistoryResult describeSpotPriceHistory();

    /**
     * <p>
     * [VPC only] Describes the stale security group rules for security groups in a specified VPC. Rules are stale when
     * they reference a deleted security group in a peer VPC, or a security group in a peer VPC for which the VPC
     * peering connection has been deleted.
     * </p>
     * 
     * @param describeStaleSecurityGroupsRequest
     * @return Result of the DescribeStaleSecurityGroups operation returned by the service.
     * @sample AmazonEC2.DescribeStaleSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeStaleSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeStaleSecurityGroupsResult describeStaleSecurityGroups(DescribeStaleSecurityGroupsRequest describeStaleSecurityGroupsRequest);

    /**
     * <p>
     * Describes the progress of the AMI store tasks. You can describe the store tasks for specified AMIs. If you don't
     * specify the AMIs, you get a paginated list of store tasks from the last 31 days.
     * </p>
     * <p>
     * For each AMI task, the response indicates if the task is <code>InProgress</code>, <code>Completed</code>, or
     * <code>Failed</code>. For tasks <code>InProgress</code>, the response shows the estimated progress as a
     * percentage.
     * </p>
     * <p>
     * Tasks are listed in reverse chronological order. Currently, only tasks from the past 31 days can be viewed.
     * </p>
     * <p>
     * To use this API, you must have the required permissions. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-store-restore.html#ami-s3-permissions">Permissions
     * for storing and restoring AMIs using S3</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-store-restore.html">Store and restore an AMI using
     * S3</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeStoreImageTasksRequest
     * @return Result of the DescribeStoreImageTasks operation returned by the service.
     * @sample AmazonEC2.DescribeStoreImageTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeStoreImageTasks" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeStoreImageTasksResult describeStoreImageTasks(DescribeStoreImageTasksRequest describeStoreImageTasksRequest);

    /**
     * <p>
     * Describes one or more of your subnets.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">Your VPC
     * and Subnets</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeSubnetsRequest
     * @return Result of the DescribeSubnets operation returned by the service.
     * @sample AmazonEC2.DescribeSubnets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeSubnets" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSubnetsResult describeSubnets(DescribeSubnetsRequest describeSubnetsRequest);

    /**
     * Simplified method form for invoking the DescribeSubnets operation.
     *
     * @see #describeSubnets(DescribeSubnetsRequest)
     */
    DescribeSubnetsResult describeSubnets();

    /**
     * <p>
     * Describes the specified tags for your EC2 resources.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Resources</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeTagsRequest
     * @return Result of the DescribeTags operation returned by the service.
     * @sample AmazonEC2.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest);

    /**
     * Simplified method form for invoking the DescribeTags operation.
     *
     * @see #describeTags(DescribeTagsRequest)
     */
    DescribeTagsResult describeTags();

    /**
     * <p>
     * Describes one or more Traffic Mirror filters.
     * </p>
     * 
     * @param describeTrafficMirrorFiltersRequest
     * @return Result of the DescribeTrafficMirrorFilters operation returned by the service.
     * @sample AmazonEC2.DescribeTrafficMirrorFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeTrafficMirrorFilters"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTrafficMirrorFiltersResult describeTrafficMirrorFilters(DescribeTrafficMirrorFiltersRequest describeTrafficMirrorFiltersRequest);

    /**
     * <p>
     * Describes one or more Traffic Mirror sessions. By default, all Traffic Mirror sessions are described.
     * Alternatively, you can filter the results.
     * </p>
     * 
     * @param describeTrafficMirrorSessionsRequest
     * @return Result of the DescribeTrafficMirrorSessions operation returned by the service.
     * @sample AmazonEC2.DescribeTrafficMirrorSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeTrafficMirrorSessions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTrafficMirrorSessionsResult describeTrafficMirrorSessions(DescribeTrafficMirrorSessionsRequest describeTrafficMirrorSessionsRequest);

    /**
     * <p>
     * Information about one or more Traffic Mirror targets.
     * </p>
     * 
     * @param describeTrafficMirrorTargetsRequest
     * @return Result of the DescribeTrafficMirrorTargets operation returned by the service.
     * @sample AmazonEC2.DescribeTrafficMirrorTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeTrafficMirrorTargets"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTrafficMirrorTargetsResult describeTrafficMirrorTargets(DescribeTrafficMirrorTargetsRequest describeTrafficMirrorTargetsRequest);

    /**
     * <p>
     * Describes one or more attachments between resources and transit gateways. By default, all attachments are
     * described. Alternatively, you can filter the results by attachment ID, attachment state, resource ID, or resource
     * owner.
     * </p>
     * 
     * @param describeTransitGatewayAttachmentsRequest
     * @return Result of the DescribeTransitGatewayAttachments operation returned by the service.
     * @sample AmazonEC2.DescribeTransitGatewayAttachments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeTransitGatewayAttachments"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTransitGatewayAttachmentsResult describeTransitGatewayAttachments(DescribeTransitGatewayAttachmentsRequest describeTransitGatewayAttachmentsRequest);

    /**
     * <p>
     * Describes one or more Connect peers.
     * </p>
     * 
     * @param describeTransitGatewayConnectPeersRequest
     * @return Result of the DescribeTransitGatewayConnectPeers operation returned by the service.
     * @sample AmazonEC2.DescribeTransitGatewayConnectPeers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeTransitGatewayConnectPeers"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTransitGatewayConnectPeersResult describeTransitGatewayConnectPeers(
            DescribeTransitGatewayConnectPeersRequest describeTransitGatewayConnectPeersRequest);

    /**
     * <p>
     * Describes one or more Connect attachments.
     * </p>
     * 
     * @param describeTransitGatewayConnectsRequest
     * @return Result of the DescribeTransitGatewayConnects operation returned by the service.
     * @sample AmazonEC2.DescribeTransitGatewayConnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeTransitGatewayConnects"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTransitGatewayConnectsResult describeTransitGatewayConnects(DescribeTransitGatewayConnectsRequest describeTransitGatewayConnectsRequest);

    /**
     * <p>
     * Describes one or more transit gateway multicast domains.
     * </p>
     * 
     * @param describeTransitGatewayMulticastDomainsRequest
     * @return Result of the DescribeTransitGatewayMulticastDomains operation returned by the service.
     * @sample AmazonEC2.DescribeTransitGatewayMulticastDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeTransitGatewayMulticastDomains"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTransitGatewayMulticastDomainsResult describeTransitGatewayMulticastDomains(
            DescribeTransitGatewayMulticastDomainsRequest describeTransitGatewayMulticastDomainsRequest);

    /**
     * <p>
     * Describes your transit gateway peering attachments.
     * </p>
     * 
     * @param describeTransitGatewayPeeringAttachmentsRequest
     * @return Result of the DescribeTransitGatewayPeeringAttachments operation returned by the service.
     * @sample AmazonEC2.DescribeTransitGatewayPeeringAttachments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeTransitGatewayPeeringAttachments"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTransitGatewayPeeringAttachmentsResult describeTransitGatewayPeeringAttachments(
            DescribeTransitGatewayPeeringAttachmentsRequest describeTransitGatewayPeeringAttachmentsRequest);

    /**
     * <p>
     * Describes one or more transit gateway route tables. By default, all transit gateway route tables are described.
     * Alternatively, you can filter the results.
     * </p>
     * 
     * @param describeTransitGatewayRouteTablesRequest
     * @return Result of the DescribeTransitGatewayRouteTables operation returned by the service.
     * @sample AmazonEC2.DescribeTransitGatewayRouteTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeTransitGatewayRouteTables"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTransitGatewayRouteTablesResult describeTransitGatewayRouteTables(DescribeTransitGatewayRouteTablesRequest describeTransitGatewayRouteTablesRequest);

    /**
     * <p>
     * Describes one or more VPC attachments. By default, all VPC attachments are described. Alternatively, you can
     * filter the results.
     * </p>
     * 
     * @param describeTransitGatewayVpcAttachmentsRequest
     * @return Result of the DescribeTransitGatewayVpcAttachments operation returned by the service.
     * @sample AmazonEC2.DescribeTransitGatewayVpcAttachments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeTransitGatewayVpcAttachments"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTransitGatewayVpcAttachmentsResult describeTransitGatewayVpcAttachments(
            DescribeTransitGatewayVpcAttachmentsRequest describeTransitGatewayVpcAttachmentsRequest);

    /**
     * <p>
     * Describes one or more transit gateways. By default, all transit gateways are described. Alternatively, you can
     * filter the results.
     * </p>
     * 
     * @param describeTransitGatewaysRequest
     * @return Result of the DescribeTransitGateways operation returned by the service.
     * @sample AmazonEC2.DescribeTransitGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeTransitGateways" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeTransitGatewaysResult describeTransitGateways(DescribeTransitGatewaysRequest describeTransitGatewaysRequest);

    /**
     * <p>
     * Describes the specified attribute of the specified volume. You can specify only one attribute at a time.
     * </p>
     * <p>
     * For more information about EBS volumes, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumes.html">Amazon EBS volumes</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeVolumeAttributeRequest
     * @return Result of the DescribeVolumeAttribute operation returned by the service.
     * @sample AmazonEC2.DescribeVolumeAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVolumeAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeVolumeAttributeResult describeVolumeAttribute(DescribeVolumeAttributeRequest describeVolumeAttributeRequest);

    /**
     * <p>
     * Describes the status of the specified volumes. Volume status provides the result of the checks performed on your
     * volumes to determine events that can impair the performance of your volumes. The performance of a volume can be
     * affected if an issue occurs on the volume's underlying host. If the volume's underlying host experiences a power
     * outage or system issue, after the system is restored, there could be data inconsistencies on the volume. Volume
     * events notify you if this occurs. Volume actions notify you if any action needs to be taken in response to the
     * event.
     * </p>
     * <p>
     * The <code>DescribeVolumeStatus</code> operation provides the following information about the specified volumes:
     * </p>
     * <p>
     * <i>Status</i>: Reflects the current status of the volume. The possible values are <code>ok</code>,
     * <code>impaired</code> , <code>warning</code>, or <code>insufficient-data</code>. If all checks pass, the overall
     * status of the volume is <code>ok</code>. If the check fails, the overall status is <code>impaired</code>. If the
     * status is <code>insufficient-data</code>, then the checks might still be taking place on your volume at the time.
     * We recommend that you retry the request. For more information about volume status, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-volume-status.html">Monitoring the status of
     * your volumes</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * <i>Events</i>: Reflect the cause of a volume status and might require you to take action. For example, if your
     * volume returns an <code>impaired</code> status, then the volume event might be
     * <code>potential-data-inconsistency</code>. This means that your volume has been affected by an issue with the
     * underlying host, has all I/O operations disabled, and might have inconsistent data.
     * </p>
     * <p>
     * <i>Actions</i>: Reflect the actions you might have to take in response to an event. For example, if the status of
     * the volume is <code>impaired</code> and the volume event shows <code>potential-data-inconsistency</code>, then
     * the action shows <code>enable-volume-io</code>. This means that you may want to enable the I/O operations for the
     * volume by calling the <a>EnableVolumeIO</a> action and then check the volume for data consistency.
     * </p>
     * <p>
     * Volume status is based on the volume status checks, and does not reflect the volume state. Therefore, volume
     * status does not indicate volumes in the <code>error</code> state (for example, when a volume is incapable of
     * accepting I/O.)
     * </p>
     * 
     * @param describeVolumeStatusRequest
     * @return Result of the DescribeVolumeStatus operation returned by the service.
     * @sample AmazonEC2.DescribeVolumeStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVolumeStatus" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeVolumeStatusResult describeVolumeStatus(DescribeVolumeStatusRequest describeVolumeStatusRequest);

    /**
     * Simplified method form for invoking the DescribeVolumeStatus operation.
     *
     * @see #describeVolumeStatus(DescribeVolumeStatusRequest)
     */
    DescribeVolumeStatusResult describeVolumeStatus();

    /**
     * <p>
     * Describes the specified EBS volumes or all of your EBS volumes.
     * </p>
     * <p>
     * If you are describing a long list of volumes, we recommend that you paginate the output to make the list more
     * manageable. The <code>MaxResults</code> parameter sets the maximum number of results returned in a single page.
     * If the list of results exceeds your <code>MaxResults</code> value, then that number of results is returned along
     * with a <code>NextToken</code> value that can be passed to a subsequent <code>DescribeVolumes</code> request to
     * retrieve the remaining results.
     * </p>
     * <p>
     * For more information about EBS volumes, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumes.html">Amazon EBS volumes</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeVolumesRequest
     * @return Result of the DescribeVolumes operation returned by the service.
     * @sample AmazonEC2.DescribeVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVolumes" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeVolumesResult describeVolumes(DescribeVolumesRequest describeVolumesRequest);

    /**
     * Simplified method form for invoking the DescribeVolumes operation.
     *
     * @see #describeVolumes(DescribeVolumesRequest)
     */
    DescribeVolumesResult describeVolumes();

    /**
     * <p>
     * Describes the most recent volume modification request for the specified EBS volumes.
     * </p>
     * <p>
     * If a volume has never been modified, some information in the output will be null. If a volume has been modified
     * more than once, the output includes only the most recent modification request.
     * </p>
     * <p>
     * You can also use CloudWatch Events to check the status of a modification to an EBS volume. For information about
     * CloudWatch Events, see the <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/">Amazon
     * CloudWatch Events User Guide</a>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-expand-volume.html#monitoring_mods">Monitoring
     * volume modifications</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeVolumesModificationsRequest
     * @return Result of the DescribeVolumesModifications operation returned by the service.
     * @sample AmazonEC2.DescribeVolumesModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVolumesModifications"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeVolumesModificationsResult describeVolumesModifications(DescribeVolumesModificationsRequest describeVolumesModificationsRequest);

    /**
     * <p>
     * Describes the specified attribute of the specified VPC. You can specify only one attribute at a time.
     * </p>
     * 
     * @param describeVpcAttributeRequest
     * @return Result of the DescribeVpcAttribute operation returned by the service.
     * @sample AmazonEC2.DescribeVpcAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeVpcAttributeResult describeVpcAttribute(DescribeVpcAttributeRequest describeVpcAttributeRequest);

    /**
     * <p>
     * Describes the ClassicLink status of one or more VPCs.
     * </p>
     * 
     * @param describeVpcClassicLinkRequest
     * @return Result of the DescribeVpcClassicLink operation returned by the service.
     * @sample AmazonEC2.DescribeVpcClassicLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcClassicLink" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeVpcClassicLinkResult describeVpcClassicLink(DescribeVpcClassicLinkRequest describeVpcClassicLinkRequest);

    /**
     * Simplified method form for invoking the DescribeVpcClassicLink operation.
     *
     * @see #describeVpcClassicLink(DescribeVpcClassicLinkRequest)
     */
    DescribeVpcClassicLinkResult describeVpcClassicLink();

    /**
     * <p>
     * Describes the ClassicLink DNS support status of one or more VPCs. If enabled, the DNS hostname of a linked
     * EC2-Classic instance resolves to its private IP address when addressed from an instance in the VPC to which it's
     * linked. Similarly, the DNS hostname of an instance in a VPC resolves to its private IP address when addressed
     * from a linked EC2-Classic instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeVpcClassicLinkDnsSupportRequest
     * @return Result of the DescribeVpcClassicLinkDnsSupport operation returned by the service.
     * @sample AmazonEC2.DescribeVpcClassicLinkDnsSupport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcClassicLinkDnsSupport"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeVpcClassicLinkDnsSupportResult describeVpcClassicLinkDnsSupport(DescribeVpcClassicLinkDnsSupportRequest describeVpcClassicLinkDnsSupportRequest);

    /**
     * <p>
     * Describes the connection notifications for VPC endpoints and VPC endpoint services.
     * </p>
     * 
     * @param describeVpcEndpointConnectionNotificationsRequest
     * @return Result of the DescribeVpcEndpointConnectionNotifications operation returned by the service.
     * @sample AmazonEC2.DescribeVpcEndpointConnectionNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpointConnectionNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeVpcEndpointConnectionNotificationsResult describeVpcEndpointConnectionNotifications(
            DescribeVpcEndpointConnectionNotificationsRequest describeVpcEndpointConnectionNotificationsRequest);

    /**
     * <p>
     * Describes the VPC endpoint connections to your VPC endpoint services, including any endpoints that are pending
     * your acceptance.
     * </p>
     * 
     * @param describeVpcEndpointConnectionsRequest
     * @return Result of the DescribeVpcEndpointConnections operation returned by the service.
     * @sample AmazonEC2.DescribeVpcEndpointConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpointConnections"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeVpcEndpointConnectionsResult describeVpcEndpointConnections(DescribeVpcEndpointConnectionsRequest describeVpcEndpointConnectionsRequest);

    /**
     * <p>
     * Describes the VPC endpoint service configurations in your account (your services).
     * </p>
     * 
     * @param describeVpcEndpointServiceConfigurationsRequest
     * @return Result of the DescribeVpcEndpointServiceConfigurations operation returned by the service.
     * @sample AmazonEC2.DescribeVpcEndpointServiceConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpointServiceConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeVpcEndpointServiceConfigurationsResult describeVpcEndpointServiceConfigurations(
            DescribeVpcEndpointServiceConfigurationsRequest describeVpcEndpointServiceConfigurationsRequest);

    /**
     * <p>
     * Describes the principals (service consumers) that are permitted to discover your VPC endpoint service.
     * </p>
     * 
     * @param describeVpcEndpointServicePermissionsRequest
     * @return Result of the DescribeVpcEndpointServicePermissions operation returned by the service.
     * @sample AmazonEC2.DescribeVpcEndpointServicePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpointServicePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeVpcEndpointServicePermissionsResult describeVpcEndpointServicePermissions(
            DescribeVpcEndpointServicePermissionsRequest describeVpcEndpointServicePermissionsRequest);

    /**
     * <p>
     * Describes available services to which you can create a VPC endpoint.
     * </p>
     * <p>
     * When the service provider and the consumer have different accounts in multiple Availability Zones, and the
     * consumer views the VPC endpoint service information, the response only includes the common Availability Zones.
     * For example, when the service provider account uses <code>us-east-1a</code> and <code>us-east-1c</code> and the
     * consumer uses <code>us-east-1a</code> and <code>us-east-1b</code>, the response includes the VPC endpoint
     * services in the common Availability Zone, <code>us-east-1a</code>.
     * </p>
     * 
     * @param describeVpcEndpointServicesRequest
     *        Contains the parameters for DescribeVpcEndpointServices.
     * @return Result of the DescribeVpcEndpointServices operation returned by the service.
     * @sample AmazonEC2.DescribeVpcEndpointServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpointServices"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeVpcEndpointServicesResult describeVpcEndpointServices(DescribeVpcEndpointServicesRequest describeVpcEndpointServicesRequest);

    /**
     * Simplified method form for invoking the DescribeVpcEndpointServices operation.
     *
     * @see #describeVpcEndpointServices(DescribeVpcEndpointServicesRequest)
     */
    DescribeVpcEndpointServicesResult describeVpcEndpointServices();

    /**
     * <p>
     * Describes one or more of your VPC endpoints.
     * </p>
     * 
     * @param describeVpcEndpointsRequest
     *        Contains the parameters for DescribeVpcEndpoints.
     * @return Result of the DescribeVpcEndpoints operation returned by the service.
     * @sample AmazonEC2.DescribeVpcEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeVpcEndpointsResult describeVpcEndpoints(DescribeVpcEndpointsRequest describeVpcEndpointsRequest);

    /**
     * Simplified method form for invoking the DescribeVpcEndpoints operation.
     *
     * @see #describeVpcEndpoints(DescribeVpcEndpointsRequest)
     */
    DescribeVpcEndpointsResult describeVpcEndpoints();

    /**
     * <p>
     * Describes one or more of your VPC peering connections.
     * </p>
     * 
     * @param describeVpcPeeringConnectionsRequest
     * @return Result of the DescribeVpcPeeringConnections operation returned by the service.
     * @sample AmazonEC2.DescribeVpcPeeringConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcPeeringConnections"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections(DescribeVpcPeeringConnectionsRequest describeVpcPeeringConnectionsRequest);

    /**
     * Simplified method form for invoking the DescribeVpcPeeringConnections operation.
     *
     * @see #describeVpcPeeringConnections(DescribeVpcPeeringConnectionsRequest)
     */
    DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections();

    /**
     * <p>
     * Describes one or more of your VPCs.
     * </p>
     * 
     * @param describeVpcsRequest
     * @return Result of the DescribeVpcs operation returned by the service.
     * @sample AmazonEC2.DescribeVpcs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpcs" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeVpcsResult describeVpcs(DescribeVpcsRequest describeVpcsRequest);

    /**
     * Simplified method form for invoking the DescribeVpcs operation.
     *
     * @see #describeVpcs(DescribeVpcsRequest)
     */
    DescribeVpcsResult describeVpcs();

    /**
     * <p>
     * Describes one or more of your VPN connections.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS Site-to-Site
     * VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * 
     * @param describeVpnConnectionsRequest
     *        Contains the parameters for DescribeVpnConnections.
     * @return Result of the DescribeVpnConnections operation returned by the service.
     * @sample AmazonEC2.DescribeVpnConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpnConnections" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeVpnConnectionsResult describeVpnConnections(DescribeVpnConnectionsRequest describeVpnConnectionsRequest);

    /**
     * Simplified method form for invoking the DescribeVpnConnections operation.
     *
     * @see #describeVpnConnections(DescribeVpnConnectionsRequest)
     */
    DescribeVpnConnectionsResult describeVpnConnections();

    /**
     * <p>
     * Describes one or more of your virtual private gateways.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS Site-to-Site
     * VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * 
     * @param describeVpnGatewaysRequest
     *        Contains the parameters for DescribeVpnGateways.
     * @return Result of the DescribeVpnGateways operation returned by the service.
     * @sample AmazonEC2.DescribeVpnGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DescribeVpnGateways" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeVpnGatewaysResult describeVpnGateways(DescribeVpnGatewaysRequest describeVpnGatewaysRequest);

    /**
     * Simplified method form for invoking the DescribeVpnGateways operation.
     *
     * @see #describeVpnGateways(DescribeVpnGatewaysRequest)
     */
    DescribeVpnGatewaysResult describeVpnGateways();

    /**
     * <p>
     * Unlinks (detaches) a linked EC2-Classic instance from a VPC. After the instance has been unlinked, the VPC
     * security groups are no longer associated with it. An instance is automatically unlinked from a VPC when it's
     * stopped.
     * </p>
     * 
     * @param detachClassicLinkVpcRequest
     * @return Result of the DetachClassicLinkVpc operation returned by the service.
     * @sample AmazonEC2.DetachClassicLinkVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachClassicLinkVpc" target="_top">AWS API
     *      Documentation</a>
     */
    DetachClassicLinkVpcResult detachClassicLinkVpc(DetachClassicLinkVpcRequest detachClassicLinkVpcRequest);

    /**
     * <p>
     * Detaches an internet gateway from a VPC, disabling connectivity between the internet and the VPC. The VPC must
     * not contain any running instances with Elastic IP addresses or public IPv4 addresses.
     * </p>
     * 
     * @param detachInternetGatewayRequest
     * @return Result of the DetachInternetGateway operation returned by the service.
     * @sample AmazonEC2.DetachInternetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachInternetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    DetachInternetGatewayResult detachInternetGateway(DetachInternetGatewayRequest detachInternetGatewayRequest);

    /**
     * <p>
     * Detaches a network interface from an instance.
     * </p>
     * 
     * @param detachNetworkInterfaceRequest
     *        Contains the parameters for DetachNetworkInterface.
     * @return Result of the DetachNetworkInterface operation returned by the service.
     * @sample AmazonEC2.DetachNetworkInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachNetworkInterface" target="_top">AWS API
     *      Documentation</a>
     */
    DetachNetworkInterfaceResult detachNetworkInterface(DetachNetworkInterfaceRequest detachNetworkInterfaceRequest);

    /**
     * <p>
     * Detaches an EBS volume from an instance. Make sure to unmount any file systems on the device within your
     * operating system before detaching the volume. Failure to do so can result in the volume becoming stuck in the
     * <code>busy</code> state while detaching. If this happens, detachment can be delayed indefinitely until you
     * unmount the volume, force detachment, reboot the instance, or all three. If an EBS volume is the root device of
     * an instance, it can't be detached while the instance is running. To detach the root volume, stop the instance
     * first.
     * </p>
     * <p>
     * When a volume with an AWS Marketplace product code is detached from an instance, the product code is no longer
     * associated with the instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html">Detaching an Amazon EBS
     * volume</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param detachVolumeRequest
     * @return Result of the DetachVolume operation returned by the service.
     * @sample AmazonEC2.DetachVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachVolume" target="_top">AWS API
     *      Documentation</a>
     */
    DetachVolumeResult detachVolume(DetachVolumeRequest detachVolumeRequest);

    /**
     * <p>
     * Detaches a virtual private gateway from a VPC. You do this if you're planning to turn off the VPC and not use it
     * anymore. You can confirm a virtual private gateway has been completely detached from a VPC by describing the
     * virtual private gateway (any attachments to the virtual private gateway are also described).
     * </p>
     * <p>
     * You must wait for the attachment's state to switch to <code>detached</code> before you can delete the VPC or
     * attach a different VPC to the virtual private gateway.
     * </p>
     * 
     * @param detachVpnGatewayRequest
     *        Contains the parameters for DetachVpnGateway.
     * @return Result of the DetachVpnGateway operation returned by the service.
     * @sample AmazonEC2.DetachVpnGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DetachVpnGateway" target="_top">AWS API
     *      Documentation</a>
     */
    DetachVpnGatewayResult detachVpnGateway(DetachVpnGatewayRequest detachVpnGatewayRequest);

    /**
     * <p>
     * Disables EBS encryption by default for your account in the current Region.
     * </p>
     * <p>
     * After you disable encryption by default, you can still create encrypted volumes by enabling encryption when you
     * create each volume.
     * </p>
     * <p>
     * Disabling encryption by default does not change the encryption status of your existing volumes.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param disableEbsEncryptionByDefaultRequest
     * @return Result of the DisableEbsEncryptionByDefault operation returned by the service.
     * @sample AmazonEC2.DisableEbsEncryptionByDefault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisableEbsEncryptionByDefault"
     *      target="_top">AWS API Documentation</a>
     */
    DisableEbsEncryptionByDefaultResult disableEbsEncryptionByDefault(DisableEbsEncryptionByDefaultRequest disableEbsEncryptionByDefaultRequest);

    /**
     * <p>
     * Disables fast snapshot restores for the specified snapshots in the specified Availability Zones.
     * </p>
     * 
     * @param disableFastSnapshotRestoresRequest
     * @return Result of the DisableFastSnapshotRestores operation returned by the service.
     * @sample AmazonEC2.DisableFastSnapshotRestores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisableFastSnapshotRestores"
     *      target="_top">AWS API Documentation</a>
     */
    DisableFastSnapshotRestoresResult disableFastSnapshotRestores(DisableFastSnapshotRestoresRequest disableFastSnapshotRestoresRequest);

    /**
     * <p>
     * Disables access to the EC2 serial console of all instances for your account. By default, access to the EC2 serial
     * console is disabled for your account. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configure-access-to-serial-console.html#serial-console-account-access"
     * >Manage account access to the EC2 serial console</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param disableSerialConsoleAccessRequest
     * @return Result of the DisableSerialConsoleAccess operation returned by the service.
     * @sample AmazonEC2.DisableSerialConsoleAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisableSerialConsoleAccess" target="_top">AWS
     *      API Documentation</a>
     */
    DisableSerialConsoleAccessResult disableSerialConsoleAccess(DisableSerialConsoleAccessRequest disableSerialConsoleAccessRequest);

    /**
     * <p>
     * Disables the specified resource attachment from propagating routes to the specified propagation route table.
     * </p>
     * 
     * @param disableTransitGatewayRouteTablePropagationRequest
     * @return Result of the DisableTransitGatewayRouteTablePropagation operation returned by the service.
     * @sample AmazonEC2.DisableTransitGatewayRouteTablePropagation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisableTransitGatewayRouteTablePropagation"
     *      target="_top">AWS API Documentation</a>
     */
    DisableTransitGatewayRouteTablePropagationResult disableTransitGatewayRouteTablePropagation(
            DisableTransitGatewayRouteTablePropagationRequest disableTransitGatewayRouteTablePropagationRequest);

    /**
     * <p>
     * Disables a virtual private gateway (VGW) from propagating routes to a specified route table of a VPC.
     * </p>
     * 
     * @param disableVgwRoutePropagationRequest
     *        Contains the parameters for DisableVgwRoutePropagation.
     * @return Result of the DisableVgwRoutePropagation operation returned by the service.
     * @sample AmazonEC2.DisableVgwRoutePropagation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisableVgwRoutePropagation" target="_top">AWS
     *      API Documentation</a>
     */
    DisableVgwRoutePropagationResult disableVgwRoutePropagation(DisableVgwRoutePropagationRequest disableVgwRoutePropagationRequest);

    /**
     * <p>
     * Disables ClassicLink for a VPC. You cannot disable ClassicLink for a VPC that has EC2-Classic instances linked to
     * it.
     * </p>
     * 
     * @param disableVpcClassicLinkRequest
     * @return Result of the DisableVpcClassicLink operation returned by the service.
     * @sample AmazonEC2.DisableVpcClassicLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisableVpcClassicLink" target="_top">AWS API
     *      Documentation</a>
     */
    DisableVpcClassicLinkResult disableVpcClassicLink(DisableVpcClassicLinkRequest disableVpcClassicLinkRequest);

    /**
     * <p>
     * Disables ClassicLink DNS support for a VPC. If disabled, DNS hostnames resolve to public IP addresses when
     * addressed between a linked EC2-Classic instance and instances in the VPC to which it's linked. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * You must specify a VPC ID in the request.
     * </p>
     * 
     * @param disableVpcClassicLinkDnsSupportRequest
     * @return Result of the DisableVpcClassicLinkDnsSupport operation returned by the service.
     * @sample AmazonEC2.DisableVpcClassicLinkDnsSupport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisableVpcClassicLinkDnsSupport"
     *      target="_top">AWS API Documentation</a>
     */
    DisableVpcClassicLinkDnsSupportResult disableVpcClassicLinkDnsSupport(DisableVpcClassicLinkDnsSupportRequest disableVpcClassicLinkDnsSupportRequest);

    /**
     * <p>
     * Disassociates an Elastic IP address from the instance or network interface it's associated with.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP Addresses</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error.
     * </p>
     * 
     * @param disassociateAddressRequest
     * @return Result of the DisassociateAddress operation returned by the service.
     * @sample AmazonEC2.DisassociateAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateAddress" target="_top">AWS API
     *      Documentation</a>
     */
    DisassociateAddressResult disassociateAddress(DisassociateAddressRequest disassociateAddressRequest);

    /**
     * <p>
     * Disassociates a target network from the specified Client VPN endpoint. When you disassociate the last target
     * network from a Client VPN, the following happens:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The route that was automatically added for the VPC is deleted
     * </p>
     * </li>
     * <li>
     * <p>
     * All active client connections are terminated
     * </p>
     * </li>
     * <li>
     * <p>
     * New client connections are disallowed
     * </p>
     * </li>
     * <li>
     * <p>
     * The Client VPN endpoint's status changes to <code>pending-associate</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param disassociateClientVpnTargetNetworkRequest
     * @return Result of the DisassociateClientVpnTargetNetwork operation returned by the service.
     * @sample AmazonEC2.DisassociateClientVpnTargetNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateClientVpnTargetNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateClientVpnTargetNetworkResult disassociateClientVpnTargetNetwork(
            DisassociateClientVpnTargetNetworkRequest disassociateClientVpnTargetNetworkRequest);

    /**
     * <p>
     * Disassociates an IAM role from an AWS Certificate Manager (ACM) certificate. Disassociating an IAM role from an
     * ACM certificate removes the Amazon S3 object that contains the certificate, certificate chain, and encrypted
     * private key from the Amazon S3 bucket. It also revokes the IAM role's permission to use the AWS Key Management
     * Service (KMS) customer master key (CMK) used to encrypt the private key. This effectively revokes the role's
     * permission to use the certificate.
     * </p>
     * 
     * @param disassociateEnclaveCertificateIamRoleRequest
     * @return Result of the DisassociateEnclaveCertificateIamRole operation returned by the service.
     * @sample AmazonEC2.DisassociateEnclaveCertificateIamRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateEnclaveCertificateIamRole"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateEnclaveCertificateIamRoleResult disassociateEnclaveCertificateIamRole(
            DisassociateEnclaveCertificateIamRoleRequest disassociateEnclaveCertificateIamRoleRequest);

    /**
     * <p>
     * Disassociates an IAM instance profile from a running or stopped instance.
     * </p>
     * <p>
     * Use <a>DescribeIamInstanceProfileAssociations</a> to get the association ID.
     * </p>
     * 
     * @param disassociateIamInstanceProfileRequest
     * @return Result of the DisassociateIamInstanceProfile operation returned by the service.
     * @sample AmazonEC2.DisassociateIamInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateIamInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateIamInstanceProfileResult disassociateIamInstanceProfile(DisassociateIamInstanceProfileRequest disassociateIamInstanceProfileRequest);

    /**
     * <p>
     * Disassociates a subnet or gateway from a route table.
     * </p>
     * <p>
     * After you perform this action, the subnet no longer uses the routes in the route table. Instead, it uses the
     * routes in the VPC's main route table. For more information about route tables, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html">Route Tables</a> in the <i>Amazon
     * Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param disassociateRouteTableRequest
     * @return Result of the DisassociateRouteTable operation returned by the service.
     * @sample AmazonEC2.DisassociateRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateRouteTable" target="_top">AWS API
     *      Documentation</a>
     */
    DisassociateRouteTableResult disassociateRouteTable(DisassociateRouteTableRequest disassociateRouteTableRequest);

    /**
     * <p>
     * Disassociates a CIDR block from a subnet. Currently, you can disassociate an IPv6 CIDR block only. You must
     * detach or delete all gateways and resources that are associated with the CIDR block before you can disassociate
     * it.
     * </p>
     * 
     * @param disassociateSubnetCidrBlockRequest
     * @return Result of the DisassociateSubnetCidrBlock operation returned by the service.
     * @sample AmazonEC2.DisassociateSubnetCidrBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateSubnetCidrBlock"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateSubnetCidrBlockResult disassociateSubnetCidrBlock(DisassociateSubnetCidrBlockRequest disassociateSubnetCidrBlockRequest);

    /**
     * <p>
     * Disassociates the specified subnets from the transit gateway multicast domain.
     * </p>
     * 
     * @param disassociateTransitGatewayMulticastDomainRequest
     * @return Result of the DisassociateTransitGatewayMulticastDomain operation returned by the service.
     * @sample AmazonEC2.DisassociateTransitGatewayMulticastDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateTransitGatewayMulticastDomain"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateTransitGatewayMulticastDomainResult disassociateTransitGatewayMulticastDomain(
            DisassociateTransitGatewayMulticastDomainRequest disassociateTransitGatewayMulticastDomainRequest);

    /**
     * <p>
     * Disassociates a resource attachment from a transit gateway route table.
     * </p>
     * 
     * @param disassociateTransitGatewayRouteTableRequest
     * @return Result of the DisassociateTransitGatewayRouteTable operation returned by the service.
     * @sample AmazonEC2.DisassociateTransitGatewayRouteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateTransitGatewayRouteTable"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateTransitGatewayRouteTableResult disassociateTransitGatewayRouteTable(
            DisassociateTransitGatewayRouteTableRequest disassociateTransitGatewayRouteTableRequest);

    /**
     * <p>
     * Disassociates a CIDR block from a VPC. To disassociate the CIDR block, you must specify its association ID. You
     * can get the association ID by using <a>DescribeVpcs</a>. You must detach or delete all gateways and resources
     * that are associated with the CIDR block before you can disassociate it.
     * </p>
     * <p>
     * You cannot disassociate the CIDR block with which you originally created the VPC (the primary CIDR block).
     * </p>
     * 
     * @param disassociateVpcCidrBlockRequest
     * @return Result of the DisassociateVpcCidrBlock operation returned by the service.
     * @sample AmazonEC2.DisassociateVpcCidrBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisassociateVpcCidrBlock" target="_top">AWS
     *      API Documentation</a>
     */
    DisassociateVpcCidrBlockResult disassociateVpcCidrBlock(DisassociateVpcCidrBlockRequest disassociateVpcCidrBlockRequest);

    /**
     * <p>
     * Enables EBS encryption by default for your account in the current Region.
     * </p>
     * <p>
     * After you enable encryption by default, the EBS volumes that you create are always encrypted, either using the
     * default CMK or the CMK that you specified when you created each volume. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * You can specify the default CMK for encryption by default using <a>ModifyEbsDefaultKmsKeyId</a> or
     * <a>ResetEbsDefaultKmsKeyId</a>.
     * </p>
     * <p>
     * Enabling encryption by default has no effect on the encryption status of your existing volumes.
     * </p>
     * <p>
     * After you enable encryption by default, you can no longer launch instances using instance types that do not
     * support encryption. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported instance types</a>.
     * </p>
     * 
     * @param enableEbsEncryptionByDefaultRequest
     * @return Result of the EnableEbsEncryptionByDefault operation returned by the service.
     * @sample AmazonEC2.EnableEbsEncryptionByDefault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableEbsEncryptionByDefault"
     *      target="_top">AWS API Documentation</a>
     */
    EnableEbsEncryptionByDefaultResult enableEbsEncryptionByDefault(EnableEbsEncryptionByDefaultRequest enableEbsEncryptionByDefaultRequest);

    /**
     * <p>
     * Enables fast snapshot restores for the specified snapshots in the specified Availability Zones.
     * </p>
     * <p>
     * You get the full benefit of fast snapshot restores after they enter the <code>enabled</code> state. To get the
     * current state of fast snapshot restores, use <a>DescribeFastSnapshotRestores</a>. To disable fast snapshot
     * restores, use <a>DisableFastSnapshotRestores</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-fast-snapshot-restore.html">Amazon EBS fast
     * snapshot restore</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param enableFastSnapshotRestoresRequest
     * @return Result of the EnableFastSnapshotRestores operation returned by the service.
     * @sample AmazonEC2.EnableFastSnapshotRestores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableFastSnapshotRestores" target="_top">AWS
     *      API Documentation</a>
     */
    EnableFastSnapshotRestoresResult enableFastSnapshotRestores(EnableFastSnapshotRestoresRequest enableFastSnapshotRestoresRequest);

    /**
     * <p>
     * Enables access to the EC2 serial console of all instances for your account. By default, access to the EC2 serial
     * console is disabled for your account. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configure-access-to-serial-console.html#serial-console-account-access"
     * >Manage account access to the EC2 serial console</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param enableSerialConsoleAccessRequest
     * @return Result of the EnableSerialConsoleAccess operation returned by the service.
     * @sample AmazonEC2.EnableSerialConsoleAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableSerialConsoleAccess" target="_top">AWS
     *      API Documentation</a>
     */
    EnableSerialConsoleAccessResult enableSerialConsoleAccess(EnableSerialConsoleAccessRequest enableSerialConsoleAccessRequest);

    /**
     * <p>
     * Enables the specified attachment to propagate routes to the specified propagation route table.
     * </p>
     * 
     * @param enableTransitGatewayRouteTablePropagationRequest
     * @return Result of the EnableTransitGatewayRouteTablePropagation operation returned by the service.
     * @sample AmazonEC2.EnableTransitGatewayRouteTablePropagation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableTransitGatewayRouteTablePropagation"
     *      target="_top">AWS API Documentation</a>
     */
    EnableTransitGatewayRouteTablePropagationResult enableTransitGatewayRouteTablePropagation(
            EnableTransitGatewayRouteTablePropagationRequest enableTransitGatewayRouteTablePropagationRequest);

    /**
     * <p>
     * Enables a virtual private gateway (VGW) to propagate routes to the specified route table of a VPC.
     * </p>
     * 
     * @param enableVgwRoutePropagationRequest
     *        Contains the parameters for EnableVgwRoutePropagation.
     * @return Result of the EnableVgwRoutePropagation operation returned by the service.
     * @sample AmazonEC2.EnableVgwRoutePropagation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableVgwRoutePropagation" target="_top">AWS
     *      API Documentation</a>
     */
    EnableVgwRoutePropagationResult enableVgwRoutePropagation(EnableVgwRoutePropagationRequest enableVgwRoutePropagationRequest);

    /**
     * <p>
     * Enables I/O operations for a volume that had I/O operations disabled because the data on the volume was
     * potentially inconsistent.
     * </p>
     * 
     * @param enableVolumeIORequest
     * @return Result of the EnableVolumeIO operation returned by the service.
     * @sample AmazonEC2.EnableVolumeIO
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableVolumeIO" target="_top">AWS API
     *      Documentation</a>
     */
    EnableVolumeIOResult enableVolumeIO(EnableVolumeIORequest enableVolumeIORequest);

    /**
     * <p>
     * Enables a VPC for ClassicLink. You can then link EC2-Classic instances to your ClassicLink-enabled VPC to allow
     * communication over private IP addresses. You cannot enable your VPC for ClassicLink if any of your VPC route
     * tables have existing routes for address ranges within the <code>10.0.0.0/8</code> IP address range, excluding
     * local routes for VPCs in the <code>10.0.0.0/16</code> and <code>10.1.0.0/16</code> IP address ranges. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param enableVpcClassicLinkRequest
     * @return Result of the EnableVpcClassicLink operation returned by the service.
     * @sample AmazonEC2.EnableVpcClassicLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableVpcClassicLink" target="_top">AWS API
     *      Documentation</a>
     */
    EnableVpcClassicLinkResult enableVpcClassicLink(EnableVpcClassicLinkRequest enableVpcClassicLinkRequest);

    /**
     * <p>
     * Enables a VPC to support DNS hostname resolution for ClassicLink. If enabled, the DNS hostname of a linked
     * EC2-Classic instance resolves to its private IP address when addressed from an instance in the VPC to which it's
     * linked. Similarly, the DNS hostname of an instance in a VPC resolves to its private IP address when addressed
     * from a linked EC2-Classic instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * You must specify a VPC ID in the request.
     * </p>
     * 
     * @param enableVpcClassicLinkDnsSupportRequest
     * @return Result of the EnableVpcClassicLinkDnsSupport operation returned by the service.
     * @sample AmazonEC2.EnableVpcClassicLinkDnsSupport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableVpcClassicLinkDnsSupport"
     *      target="_top">AWS API Documentation</a>
     */
    EnableVpcClassicLinkDnsSupportResult enableVpcClassicLinkDnsSupport(EnableVpcClassicLinkDnsSupportRequest enableVpcClassicLinkDnsSupportRequest);

    /**
     * <p>
     * Downloads the client certificate revocation list for the specified Client VPN endpoint.
     * </p>
     * 
     * @param exportClientVpnClientCertificateRevocationListRequest
     * @return Result of the ExportClientVpnClientCertificateRevocationList operation returned by the service.
     * @sample AmazonEC2.ExportClientVpnClientCertificateRevocationList
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ExportClientVpnClientCertificateRevocationList"
     *      target="_top">AWS API Documentation</a>
     */
    ExportClientVpnClientCertificateRevocationListResult exportClientVpnClientCertificateRevocationList(
            ExportClientVpnClientCertificateRevocationListRequest exportClientVpnClientCertificateRevocationListRequest);

    /**
     * <p>
     * Downloads the contents of the Client VPN endpoint configuration file for the specified Client VPN endpoint. The
     * Client VPN endpoint configuration file includes the Client VPN endpoint and certificate information clients need
     * to establish a connection with the Client VPN endpoint.
     * </p>
     * 
     * @param exportClientVpnClientConfigurationRequest
     * @return Result of the ExportClientVpnClientConfiguration operation returned by the service.
     * @sample AmazonEC2.ExportClientVpnClientConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ExportClientVpnClientConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    ExportClientVpnClientConfigurationResult exportClientVpnClientConfiguration(
            ExportClientVpnClientConfigurationRequest exportClientVpnClientConfigurationRequest);

    /**
     * <p>
     * Exports an Amazon Machine Image (AMI) to a VM file. For more information, see <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmexport_image.html">Exporting a VM directly from an
     * Amazon Machine Image (AMI)</a> in the <i>VM Import/Export User Guide</i>.
     * </p>
     * 
     * @param exportImageRequest
     * @return Result of the ExportImage operation returned by the service.
     * @sample AmazonEC2.ExportImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ExportImage" target="_top">AWS API
     *      Documentation</a>
     */
    ExportImageResult exportImage(ExportImageRequest exportImageRequest);

    /**
     * <p>
     * Exports routes from the specified transit gateway route table to the specified S3 bucket. By default, all routes
     * are exported. Alternatively, you can filter by CIDR range.
     * </p>
     * <p>
     * The routes are saved to the specified bucket in a JSON file. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/tgw/tgw-route-tables.html#tgw-export-route-tables">Export Route
     * Tables to Amazon S3</a> in <i>Transit Gateways</i>.
     * </p>
     * 
     * @param exportTransitGatewayRoutesRequest
     * @return Result of the ExportTransitGatewayRoutes operation returned by the service.
     * @sample AmazonEC2.ExportTransitGatewayRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ExportTransitGatewayRoutes" target="_top">AWS
     *      API Documentation</a>
     */
    ExportTransitGatewayRoutesResult exportTransitGatewayRoutes(ExportTransitGatewayRoutesRequest exportTransitGatewayRoutesRequest);

    /**
     * <p>
     * Returns the IAM roles that are associated with the specified AWS Certificate Manager (ACM) certificate. It also
     * returns the name of the Amazon S3 bucket and the Amazon S3 object key where the certificate, certificate chain,
     * and encrypted private key bundle are stored, and the ARN of the AWS Key Management Service (KMS) customer master
     * key (CMK) that's used to encrypt the private key.
     * </p>
     * 
     * @param getAssociatedEnclaveCertificateIamRolesRequest
     * @return Result of the GetAssociatedEnclaveCertificateIamRoles operation returned by the service.
     * @sample AmazonEC2.GetAssociatedEnclaveCertificateIamRoles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetAssociatedEnclaveCertificateIamRoles"
     *      target="_top">AWS API Documentation</a>
     */
    GetAssociatedEnclaveCertificateIamRolesResult getAssociatedEnclaveCertificateIamRoles(
            GetAssociatedEnclaveCertificateIamRolesRequest getAssociatedEnclaveCertificateIamRolesRequest);

    /**
     * <p>
     * Gets information about the IPv6 CIDR block associations for a specified IPv6 address pool.
     * </p>
     * 
     * @param getAssociatedIpv6PoolCidrsRequest
     * @return Result of the GetAssociatedIpv6PoolCidrs operation returned by the service.
     * @sample AmazonEC2.GetAssociatedIpv6PoolCidrs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetAssociatedIpv6PoolCidrs" target="_top">AWS
     *      API Documentation</a>
     */
    GetAssociatedIpv6PoolCidrsResult getAssociatedIpv6PoolCidrs(GetAssociatedIpv6PoolCidrsRequest getAssociatedIpv6PoolCidrsRequest);

    /**
     * <p>
     * Gets usage information about a Capacity Reservation. If the Capacity Reservation is shared, it shows usage
     * information for the Capacity Reservation owner and each AWS account that is currently using the shared capacity.
     * If the Capacity Reservation is not shared, it shows only the Capacity Reservation owner's usage.
     * </p>
     * 
     * @param getCapacityReservationUsageRequest
     * @return Result of the GetCapacityReservationUsage operation returned by the service.
     * @sample AmazonEC2.GetCapacityReservationUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetCapacityReservationUsage"
     *      target="_top">AWS API Documentation</a>
     */
    GetCapacityReservationUsageResult getCapacityReservationUsage(GetCapacityReservationUsageRequest getCapacityReservationUsageRequest);

    /**
     * <p>
     * Describes the allocations from the specified customer-owned address pool.
     * </p>
     * 
     * @param getCoipPoolUsageRequest
     * @return Result of the GetCoipPoolUsage operation returned by the service.
     * @sample AmazonEC2.GetCoipPoolUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetCoipPoolUsage" target="_top">AWS API
     *      Documentation</a>
     */
    GetCoipPoolUsageResult getCoipPoolUsage(GetCoipPoolUsageRequest getCoipPoolUsageRequest);

    /**
     * <p>
     * Gets the console output for the specified instance. For Linux instances, the instance console output displays the
     * exact console output that would normally be displayed on a physical monitor attached to a computer. For Windows
     * instances, the instance console output includes the last three system event log errors.
     * </p>
     * <p>
     * By default, the console output returns buffered information that was posted shortly after an instance transition
     * state (start, stop, reboot, or terminate). This information is available for at least one hour after the most
     * recent post. Only the most recent 64 KB of console output is available.
     * </p>
     * <p>
     * You can optionally retrieve the latest serial console output at any time during the instance lifecycle. This
     * option is supported on instance types that use the Nitro hypervisor.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-console.html#instance-console-console-output"
     * >Instance console output</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param getConsoleOutputRequest
     * @return Result of the GetConsoleOutput operation returned by the service.
     * @sample AmazonEC2.GetConsoleOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetConsoleOutput" target="_top">AWS API
     *      Documentation</a>
     */
    GetConsoleOutputResult getConsoleOutput(GetConsoleOutputRequest getConsoleOutputRequest);

    /**
     * <p>
     * Retrieve a JPG-format screenshot of a running instance to help with troubleshooting.
     * </p>
     * <p>
     * The returned content is Base64-encoded.
     * </p>
     * 
     * @param getConsoleScreenshotRequest
     * @return Result of the GetConsoleScreenshot operation returned by the service.
     * @sample AmazonEC2.GetConsoleScreenshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetConsoleScreenshot" target="_top">AWS API
     *      Documentation</a>
     */
    GetConsoleScreenshotResult getConsoleScreenshot(GetConsoleScreenshotRequest getConsoleScreenshotRequest);

    /**
     * <p>
     * Describes the default credit option for CPU usage of a burstable performance instance family.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * performance instances</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param getDefaultCreditSpecificationRequest
     * @return Result of the GetDefaultCreditSpecification operation returned by the service.
     * @sample AmazonEC2.GetDefaultCreditSpecification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetDefaultCreditSpecification"
     *      target="_top">AWS API Documentation</a>
     */
    GetDefaultCreditSpecificationResult getDefaultCreditSpecification(GetDefaultCreditSpecificationRequest getDefaultCreditSpecificationRequest);

    /**
     * <p>
     * Describes the default customer master key (CMK) for EBS encryption by default for your account in this Region.
     * You can change the default CMK for encryption by default using <a>ModifyEbsDefaultKmsKeyId</a> or
     * <a>ResetEbsDefaultKmsKeyId</a>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param getEbsDefaultKmsKeyIdRequest
     * @return Result of the GetEbsDefaultKmsKeyId operation returned by the service.
     * @sample AmazonEC2.GetEbsDefaultKmsKeyId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetEbsDefaultKmsKeyId" target="_top">AWS API
     *      Documentation</a>
     */
    GetEbsDefaultKmsKeyIdResult getEbsDefaultKmsKeyId(GetEbsDefaultKmsKeyIdRequest getEbsDefaultKmsKeyIdRequest);

    /**
     * <p>
     * Describes whether EBS encryption by default is enabled for your account in the current Region.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param getEbsEncryptionByDefaultRequest
     * @return Result of the GetEbsEncryptionByDefault operation returned by the service.
     * @sample AmazonEC2.GetEbsEncryptionByDefault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetEbsEncryptionByDefault" target="_top">AWS
     *      API Documentation</a>
     */
    GetEbsEncryptionByDefaultResult getEbsEncryptionByDefault(GetEbsEncryptionByDefaultRequest getEbsEncryptionByDefaultRequest);

    /**
     * <p>
     * Generates a CloudFormation template that streamlines and automates the integration of VPC flow logs with Amazon
     * Athena. This make it easier for you to query and gain insights from VPC flow logs data. Based on the information
     * that you provide, we configure resources in the template to do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Create a table in Athena that maps fields to a custom log format
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a Lambda function that updates the table with new partitions on a daily, weekly, or monthly basis
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a table partitioned between two timestamps in the past
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a set of named queries in Athena that you can use to get started quickly
     * </p>
     * </li>
     * </ul>
     * 
     * @param getFlowLogsIntegrationTemplateRequest
     * @return Result of the GetFlowLogsIntegrationTemplate operation returned by the service.
     * @sample AmazonEC2.GetFlowLogsIntegrationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetFlowLogsIntegrationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    GetFlowLogsIntegrationTemplateResult getFlowLogsIntegrationTemplate(GetFlowLogsIntegrationTemplateRequest getFlowLogsIntegrationTemplateRequest);

    /**
     * <p>
     * Lists the resource groups to which a Capacity Reservation has been added.
     * </p>
     * 
     * @param getGroupsForCapacityReservationRequest
     * @return Result of the GetGroupsForCapacityReservation operation returned by the service.
     * @sample AmazonEC2.GetGroupsForCapacityReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetGroupsForCapacityReservation"
     *      target="_top">AWS API Documentation</a>
     */
    GetGroupsForCapacityReservationResult getGroupsForCapacityReservation(GetGroupsForCapacityReservationRequest getGroupsForCapacityReservationRequest);

    /**
     * <p>
     * Preview a reservation purchase with configurations that match those of your Dedicated Host. You must have active
     * Dedicated Hosts in your account before you purchase a reservation.
     * </p>
     * <p>
     * This is a preview of the <a>PurchaseHostReservation</a> action and does not result in the offering being
     * purchased.
     * </p>
     * 
     * @param getHostReservationPurchasePreviewRequest
     * @return Result of the GetHostReservationPurchasePreview operation returned by the service.
     * @sample AmazonEC2.GetHostReservationPurchasePreview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetHostReservationPurchasePreview"
     *      target="_top">AWS API Documentation</a>
     */
    GetHostReservationPurchasePreviewResult getHostReservationPurchasePreview(GetHostReservationPurchasePreviewRequest getHostReservationPurchasePreviewRequest);

    /**
     * <p>
     * Retrieves the configuration data of the specified instance. You can use this data to create a launch template.
     * </p>
     * <p>
     * This action calls on other describe actions to get instance information. Depending on your instance
     * configuration, you may need to allow the following actions in your IAM policy: DescribeSpotInstanceRequests,
     * DescribeInstanceCreditSpecifications, DescribeVolumes, DescribeInstanceAttribute, and DescribeElasticGpus. Or,
     * you can allow <code>describe*</code> depending on your instance requirements.
     * </p>
     * 
     * @param getLaunchTemplateDataRequest
     * @return Result of the GetLaunchTemplateData operation returned by the service.
     * @sample AmazonEC2.GetLaunchTemplateData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetLaunchTemplateData" target="_top">AWS API
     *      Documentation</a>
     */
    GetLaunchTemplateDataResult getLaunchTemplateData(GetLaunchTemplateDataRequest getLaunchTemplateDataRequest);

    /**
     * <p>
     * Gets information about the resources that are associated with the specified managed prefix list.
     * </p>
     * 
     * @param getManagedPrefixListAssociationsRequest
     * @return Result of the GetManagedPrefixListAssociations operation returned by the service.
     * @sample AmazonEC2.GetManagedPrefixListAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetManagedPrefixListAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    GetManagedPrefixListAssociationsResult getManagedPrefixListAssociations(GetManagedPrefixListAssociationsRequest getManagedPrefixListAssociationsRequest);

    /**
     * <p>
     * Gets information about the entries for a specified managed prefix list.
     * </p>
     * 
     * @param getManagedPrefixListEntriesRequest
     * @return Result of the GetManagedPrefixListEntries operation returned by the service.
     * @sample AmazonEC2.GetManagedPrefixListEntries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetManagedPrefixListEntries"
     *      target="_top">AWS API Documentation</a>
     */
    GetManagedPrefixListEntriesResult getManagedPrefixListEntries(GetManagedPrefixListEntriesRequest getManagedPrefixListEntriesRequest);

    /**
     * <p>
     * Retrieves the encrypted administrator password for a running Windows instance.
     * </p>
     * <p>
     * The Windows password is generated at boot by the <code>EC2Config</code> service or <code>EC2Launch</code> scripts
     * (Windows Server 2016 and later). This usually only happens the first time an instance is launched. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/UsingConfig_WinAMI.html">EC2Config</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2launch.html">EC2Launch</a> in the <i>Amazon EC2
     * User Guide</i>.
     * </p>
     * <p>
     * For the <code>EC2Config</code> service, the password is not generated for rebundled AMIs unless
     * <code>Ec2SetPassword</code> is enabled before bundling.
     * </p>
     * <p>
     * The password is encrypted using the key pair that you specified when you launched the instance. You must provide
     * the corresponding key pair file.
     * </p>
     * <p>
     * When you launch an instance, password generation and encryption may take a few minutes. If you try to retrieve
     * the password before it's available, the output returns an empty string. We recommend that you wait up to 15
     * minutes after launching an instance before trying to retrieve the generated password.
     * </p>
     * 
     * @param getPasswordDataRequest
     * @return Result of the GetPasswordData operation returned by the service.
     * @sample AmazonEC2.GetPasswordData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetPasswordData" target="_top">AWS API
     *      Documentation</a>
     */
    GetPasswordDataResult getPasswordData(GetPasswordDataRequest getPasswordDataRequest);

    /**
     * <p>
     * Returns a quote and exchange information for exchanging one or more specified Convertible Reserved Instances for
     * a new Convertible Reserved Instance. If the exchange cannot be performed, the reason is returned in the response.
     * Use <a>AcceptReservedInstancesExchangeQuote</a> to perform the exchange.
     * </p>
     * 
     * @param getReservedInstancesExchangeQuoteRequest
     *        Contains the parameters for GetReservedInstanceExchangeQuote.
     * @return Result of the GetReservedInstancesExchangeQuote operation returned by the service.
     * @sample AmazonEC2.GetReservedInstancesExchangeQuote
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetReservedInstancesExchangeQuote"
     *      target="_top">AWS API Documentation</a>
     */
    GetReservedInstancesExchangeQuoteResult getReservedInstancesExchangeQuote(GetReservedInstancesExchangeQuoteRequest getReservedInstancesExchangeQuoteRequest);

    /**
     * <p>
     * Retrieves the access status of your account to the EC2 serial console of all instances. By default, access to the
     * EC2 serial console is disabled for your account. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configure-access-to-serial-console.html#serial-console-account-access"
     * >Manage account access to the EC2 serial console</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param getSerialConsoleAccessStatusRequest
     * @return Result of the GetSerialConsoleAccessStatus operation returned by the service.
     * @sample AmazonEC2.GetSerialConsoleAccessStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetSerialConsoleAccessStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetSerialConsoleAccessStatusResult getSerialConsoleAccessStatus(GetSerialConsoleAccessStatusRequest getSerialConsoleAccessStatusRequest);

    /**
     * <p>
     * Lists the route tables to which the specified resource attachment propagates routes.
     * </p>
     * 
     * @param getTransitGatewayAttachmentPropagationsRequest
     * @return Result of the GetTransitGatewayAttachmentPropagations operation returned by the service.
     * @sample AmazonEC2.GetTransitGatewayAttachmentPropagations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetTransitGatewayAttachmentPropagations"
     *      target="_top">AWS API Documentation</a>
     */
    GetTransitGatewayAttachmentPropagationsResult getTransitGatewayAttachmentPropagations(
            GetTransitGatewayAttachmentPropagationsRequest getTransitGatewayAttachmentPropagationsRequest);

    /**
     * <p>
     * Gets information about the associations for the transit gateway multicast domain.
     * </p>
     * 
     * @param getTransitGatewayMulticastDomainAssociationsRequest
     * @return Result of the GetTransitGatewayMulticastDomainAssociations operation returned by the service.
     * @sample AmazonEC2.GetTransitGatewayMulticastDomainAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetTransitGatewayMulticastDomainAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    GetTransitGatewayMulticastDomainAssociationsResult getTransitGatewayMulticastDomainAssociations(
            GetTransitGatewayMulticastDomainAssociationsRequest getTransitGatewayMulticastDomainAssociationsRequest);

    /**
     * <p>
     * Gets information about the prefix list references in a specified transit gateway route table.
     * </p>
     * 
     * @param getTransitGatewayPrefixListReferencesRequest
     * @return Result of the GetTransitGatewayPrefixListReferences operation returned by the service.
     * @sample AmazonEC2.GetTransitGatewayPrefixListReferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetTransitGatewayPrefixListReferences"
     *      target="_top">AWS API Documentation</a>
     */
    GetTransitGatewayPrefixListReferencesResult getTransitGatewayPrefixListReferences(
            GetTransitGatewayPrefixListReferencesRequest getTransitGatewayPrefixListReferencesRequest);

    /**
     * <p>
     * Gets information about the associations for the specified transit gateway route table.
     * </p>
     * 
     * @param getTransitGatewayRouteTableAssociationsRequest
     * @return Result of the GetTransitGatewayRouteTableAssociations operation returned by the service.
     * @sample AmazonEC2.GetTransitGatewayRouteTableAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetTransitGatewayRouteTableAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    GetTransitGatewayRouteTableAssociationsResult getTransitGatewayRouteTableAssociations(
            GetTransitGatewayRouteTableAssociationsRequest getTransitGatewayRouteTableAssociationsRequest);

    /**
     * <p>
     * Gets information about the route table propagations for the specified transit gateway route table.
     * </p>
     * 
     * @param getTransitGatewayRouteTablePropagationsRequest
     * @return Result of the GetTransitGatewayRouteTablePropagations operation returned by the service.
     * @sample AmazonEC2.GetTransitGatewayRouteTablePropagations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GetTransitGatewayRouteTablePropagations"
     *      target="_top">AWS API Documentation</a>
     */
    GetTransitGatewayRouteTablePropagationsResult getTransitGatewayRouteTablePropagations(
            GetTransitGatewayRouteTablePropagationsRequest getTransitGatewayRouteTablePropagationsRequest);

    /**
     * <p>
     * Uploads a client certificate revocation list to the specified Client VPN endpoint. Uploading a client certificate
     * revocation list overwrites the existing client certificate revocation list.
     * </p>
     * <p>
     * Uploading a client certificate revocation list resets existing client connections.
     * </p>
     * 
     * @param importClientVpnClientCertificateRevocationListRequest
     * @return Result of the ImportClientVpnClientCertificateRevocationList operation returned by the service.
     * @sample AmazonEC2.ImportClientVpnClientCertificateRevocationList
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportClientVpnClientCertificateRevocationList"
     *      target="_top">AWS API Documentation</a>
     */
    ImportClientVpnClientCertificateRevocationListResult importClientVpnClientCertificateRevocationList(
            ImportClientVpnClientCertificateRevocationListRequest importClientVpnClientCertificateRevocationListRequest);

    /**
     * <p>
     * Import single or multi-volume disk images or EBS snapshots into an Amazon Machine Image (AMI).
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html">Importing a VM as an
     * image using VM Import/Export</a> in the <i>VM Import/Export User Guide</i>.
     * </p>
     * 
     * @param importImageRequest
     * @return Result of the ImportImage operation returned by the service.
     * @sample AmazonEC2.ImportImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportImage" target="_top">AWS API
     *      Documentation</a>
     */
    ImportImageResult importImage(ImportImageRequest importImageRequest);

    /**
     * Simplified method form for invoking the ImportImage operation.
     *
     * @see #importImage(ImportImageRequest)
     */
    ImportImageResult importImage();

    /**
     * <p>
     * Creates an import instance task using metadata from the specified disk image.
     * </p>
     * <p>
     * This API action supports only single-volume VMs. To import multi-volume VMs, use <a>ImportImage</a> instead.
     * </p>
     * <p>
     * This API action is not supported by the AWS Command Line Interface (AWS CLI). For information about using the
     * Amazon EC2 CLI, which is deprecated, see <a
     * href="https://awsdocs.s3.amazonaws.com/EC2/ec2-clt.pdf#UsingVirtualMachinesinAmazonEC2">Importing a VM to Amazon
     * EC2</a> in the <i>Amazon EC2 CLI Reference</i> PDF file.
     * </p>
     * <p>
     * For information about the import manifest referenced by this API action, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM Import Manifest</a>.
     * </p>
     * 
     * @param importInstanceRequest
     * @return Result of the ImportInstance operation returned by the service.
     * @sample AmazonEC2.ImportInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportInstance" target="_top">AWS API
     *      Documentation</a>
     */
    ImportInstanceResult importInstance(ImportInstanceRequest importInstanceRequest);

    /**
     * <p>
     * Imports the public key from an RSA key pair that you created with a third-party tool. Compare this with
     * <a>CreateKeyPair</a>, in which AWS creates the key pair and gives the keys to you (AWS keeps a copy of the public
     * key). With ImportKeyPair, you create the key pair and give AWS just the public key. The private key is never
     * transferred between you and AWS.
     * </p>
     * <p>
     * For more information about key pairs, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Key Pairs</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param importKeyPairRequest
     * @return Result of the ImportKeyPair operation returned by the service.
     * @sample AmazonEC2.ImportKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    ImportKeyPairResult importKeyPair(ImportKeyPairRequest importKeyPairRequest);

    /**
     * <p>
     * Imports a disk into an EBS snapshot.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-import-snapshot.html">Importing a disk as a
     * snapshot using VM Import/Export</a> in the <i>VM Import/Export User Guide</i>.
     * </p>
     * 
     * @param importSnapshotRequest
     * @return Result of the ImportSnapshot operation returned by the service.
     * @sample AmazonEC2.ImportSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    ImportSnapshotResult importSnapshot(ImportSnapshotRequest importSnapshotRequest);

    /**
     * Simplified method form for invoking the ImportSnapshot operation.
     *
     * @see #importSnapshot(ImportSnapshotRequest)
     */
    ImportSnapshotResult importSnapshot();

    /**
     * <p>
     * Creates an import volume task using metadata from the specified disk image.
     * </p>
     * <p>
     * This API action supports only single-volume VMs. To import multi-volume VMs, use <a>ImportImage</a> instead. To
     * import a disk to a snapshot, use <a>ImportSnapshot</a> instead.
     * </p>
     * <p>
     * This API action is not supported by the AWS Command Line Interface (AWS CLI). For information about using the
     * Amazon EC2 CLI, which is deprecated, see <a
     * href="https://awsdocs.s3.amazonaws.com/EC2/ec2-clt.pdf#importing-your-volumes-into-amazon-ebs">Importing Disks to
     * Amazon EBS</a> in the <i>Amazon EC2 CLI Reference</i> PDF file.
     * </p>
     * <p>
     * For information about the import manifest referenced by this API action, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM Import Manifest</a>.
     * </p>
     * 
     * @param importVolumeRequest
     * @return Result of the ImportVolume operation returned by the service.
     * @sample AmazonEC2.ImportVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportVolume" target="_top">AWS API
     *      Documentation</a>
     */
    ImportVolumeResult importVolume(ImportVolumeRequest importVolumeRequest);

    /**
     * <p>
     * Modifies an attribute of the specified Elastic IP address. For requirements, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html#Using_Elastic_Addressing_Reverse_DNS"
     * >Using reverse DNS for email applications</a>.
     * </p>
     * 
     * @param modifyAddressAttributeRequest
     * @return Result of the ModifyAddressAttribute operation returned by the service.
     * @sample AmazonEC2.ModifyAddressAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyAddressAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyAddressAttributeResult modifyAddressAttribute(ModifyAddressAttributeRequest modifyAddressAttributeRequest);

    /**
     * <p>
     * Changes the opt-in status of the Local Zone and Wavelength Zone group for your account.
     * </p>
     * <p>
     * Use <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html">
     * DescribeAvailabilityZones</a> to view the value for <code>GroupName</code>.
     * </p>
     * 
     * @param modifyAvailabilityZoneGroupRequest
     * @return Result of the ModifyAvailabilityZoneGroup operation returned by the service.
     * @sample AmazonEC2.ModifyAvailabilityZoneGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyAvailabilityZoneGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyAvailabilityZoneGroupResult modifyAvailabilityZoneGroup(ModifyAvailabilityZoneGroupRequest modifyAvailabilityZoneGroupRequest);

    /**
     * <p>
     * Modifies a Capacity Reservation's capacity and the conditions under which it is to be released. You cannot change
     * a Capacity Reservation's instance type, EBS optimization, instance store settings, platform, Availability Zone,
     * or instance eligibility. If you need to modify any of these attributes, we recommend that you cancel the Capacity
     * Reservation, and then create a new one with the required attributes.
     * </p>
     * 
     * @param modifyCapacityReservationRequest
     * @return Result of the ModifyCapacityReservation operation returned by the service.
     * @sample AmazonEC2.ModifyCapacityReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyCapacityReservation" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyCapacityReservationResult modifyCapacityReservation(ModifyCapacityReservationRequest modifyCapacityReservationRequest);

    /**
     * <p>
     * Modifies the specified Client VPN endpoint. Modifying the DNS server resets existing client connections.
     * </p>
     * 
     * @param modifyClientVpnEndpointRequest
     * @return Result of the ModifyClientVpnEndpoint operation returned by the service.
     * @sample AmazonEC2.ModifyClientVpnEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyClientVpnEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyClientVpnEndpointResult modifyClientVpnEndpoint(ModifyClientVpnEndpointRequest modifyClientVpnEndpointRequest);

    /**
     * <p>
     * Modifies the default credit option for CPU usage of burstable performance instances. The default credit option is
     * set at the account level per AWS Region, and is specified per instance family. All new burstable performance
     * instances in the account launch using the default credit option.
     * </p>
     * <p>
     * <code>ModifyDefaultCreditSpecification</code> is an asynchronous operation, which works at an AWS Region level
     * and modifies the credit option for each Availability Zone. All zones in a Region are updated within five minutes.
     * But if instances are launched during this operation, they might not get the new credit option until the zone is
     * updated. To verify whether the update has occurred, you can call <code>GetDefaultCreditSpecification</code> and
     * check <code>DefaultCreditSpecification</code> for updates.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * performance instances</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param modifyDefaultCreditSpecificationRequest
     * @return Result of the ModifyDefaultCreditSpecification operation returned by the service.
     * @sample AmazonEC2.ModifyDefaultCreditSpecification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyDefaultCreditSpecification"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyDefaultCreditSpecificationResult modifyDefaultCreditSpecification(ModifyDefaultCreditSpecificationRequest modifyDefaultCreditSpecificationRequest);

    /**
     * <p>
     * Changes the default customer master key (CMK) for EBS encryption by default for your account in this Region.
     * </p>
     * <p>
     * AWS creates a unique AWS managed CMK in each Region for use with encryption by default. If you change the default
     * CMK to a symmetric customer managed CMK, it is used instead of the AWS managed CMK. To reset the default CMK to
     * the AWS managed CMK for EBS, use <a>ResetEbsDefaultKmsKeyId</a>. Amazon EBS does not support asymmetric CMKs.
     * </p>
     * <p>
     * If you delete or disable the customer managed CMK that you specified for use with encryption by default, your
     * instances will fail to launch.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param modifyEbsDefaultKmsKeyIdRequest
     * @return Result of the ModifyEbsDefaultKmsKeyId operation returned by the service.
     * @sample AmazonEC2.ModifyEbsDefaultKmsKeyId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyEbsDefaultKmsKeyId" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyEbsDefaultKmsKeyIdResult modifyEbsDefaultKmsKeyId(ModifyEbsDefaultKmsKeyIdRequest modifyEbsDefaultKmsKeyIdRequest);

    /**
     * <p>
     * Modifies the specified EC2 Fleet.
     * </p>
     * <p>
     * You can only modify an EC2 Fleet request of type <code>maintain</code>.
     * </p>
     * <p>
     * While the EC2 Fleet is being modified, it is in the <code>modifying</code> state.
     * </p>
     * <p>
     * To scale up your EC2 Fleet, increase its target capacity. The EC2 Fleet launches the additional Spot Instances
     * according to the allocation strategy for the EC2 Fleet request. If the allocation strategy is
     * <code>lowest-price</code>, the EC2 Fleet launches instances using the Spot Instance pool with the lowest price.
     * If the allocation strategy is <code>diversified</code>, the EC2 Fleet distributes the instances across the Spot
     * Instance pools. If the allocation strategy is <code>capacity-optimized</code>, EC2 Fleet launches instances from
     * Spot Instance pools with optimal capacity for the number of instances that are launching.
     * </p>
     * <p>
     * To scale down your EC2 Fleet, decrease its target capacity. First, the EC2 Fleet cancels any open requests that
     * exceed the new target capacity. You can request that the EC2 Fleet terminate Spot Instances until the size of the
     * fleet no longer exceeds the new target capacity. If the allocation strategy is <code>lowest-price</code>, the EC2
     * Fleet terminates the instances with the highest price per unit. If the allocation strategy is
     * <code>capacity-optimized</code>, the EC2 Fleet terminates the instances in the Spot Instance pools that have the
     * least available Spot Instance capacity. If the allocation strategy is <code>diversified</code>, the EC2 Fleet
     * terminates instances across the Spot Instance pools. Alternatively, you can request that the EC2 Fleet keep the
     * fleet at its current size, but not replace any Spot Instances that are interrupted or that you terminate
     * manually.
     * </p>
     * <p>
     * If you are finished with your EC2 Fleet for now, but will use it again later, you can set the target capacity to
     * 0.
     * </p>
     * 
     * @param modifyFleetRequest
     * @return Result of the ModifyFleet operation returned by the service.
     * @sample AmazonEC2.ModifyFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyFleet" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyFleetResult modifyFleet(ModifyFleetRequest modifyFleetRequest);

    /**
     * <p>
     * Modifies the specified attribute of the specified Amazon FPGA Image (AFI).
     * </p>
     * 
     * @param modifyFpgaImageAttributeRequest
     * @return Result of the ModifyFpgaImageAttribute operation returned by the service.
     * @sample AmazonEC2.ModifyFpgaImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyFpgaImageAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyFpgaImageAttributeResult modifyFpgaImageAttribute(ModifyFpgaImageAttributeRequest modifyFpgaImageAttributeRequest);

    /**
     * <p>
     * Modify the auto-placement setting of a Dedicated Host. When auto-placement is enabled, any instances that you
     * launch with a tenancy of <code>host</code> but without a specific host ID are placed onto any available Dedicated
     * Host in your account that has auto-placement enabled. When auto-placement is disabled, you need to provide a host
     * ID to have the instance launch onto a specific host. If no host ID is provided, the instance is launched onto a
     * suitable host with auto-placement enabled.
     * </p>
     * <p>
     * You can also use this API action to modify a Dedicated Host to support either multiple instance types in an
     * instance family, or to support a specific instance type only.
     * </p>
     * 
     * @param modifyHostsRequest
     * @return Result of the ModifyHosts operation returned by the service.
     * @sample AmazonEC2.ModifyHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyHosts" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyHostsResult modifyHosts(ModifyHostsRequest modifyHostsRequest);

    /**
     * <p>
     * Modifies the ID format for the specified resource on a per-Region basis. You can specify that resources should
     * receive longer IDs (17-character IDs) when they are created.
     * </p>
     * <p>
     * This request can only be used to modify longer ID settings for resource types that are within the opt-in period.
     * Resources currently in their opt-in period include: <code>bundle</code> | <code>conversion-task</code> |
     * <code>customer-gateway</code> | <code>dhcp-options</code> | <code>elastic-ip-allocation</code> |
     * <code>elastic-ip-association</code> | <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
     * <code>import-task</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> | <code>network-interface-attachment</code>
     * | <code>prefix-list</code> | <code>route-table</code> | <code>route-table-association</code> |
     * <code>security-group</code> | <code>subnet</code> | <code>subnet-cidr-block-association</code> | <code>vpc</code>
     * | <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>.
     * </p>
     * <p>
     * This setting applies to the IAM user who makes the request; it does not apply to the entire AWS account. By
     * default, an IAM user defaults to the same settings as the root user. If you're using this action as the root
     * user, then these settings apply to the entire account, unless an IAM user explicitly overrides these settings for
     * themselves. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/resource-ids.html">Resource IDs</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Resources created with longer IDs are visible to all IAM roles and users, regardless of these settings and
     * provided that they have permission to use the relevant <code>Describe</code> command for the resource type.
     * </p>
     * 
     * @param modifyIdFormatRequest
     * @return Result of the ModifyIdFormat operation returned by the service.
     * @sample AmazonEC2.ModifyIdFormat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyIdFormat" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyIdFormatResult modifyIdFormat(ModifyIdFormatRequest modifyIdFormatRequest);

    /**
     * <p>
     * Modifies the ID format of a resource for a specified IAM user, IAM role, or the root user for an account; or all
     * IAM users, IAM roles, and the root user for an account. You can specify that resources should receive longer IDs
     * (17-character IDs) when they are created.
     * </p>
     * <p>
     * This request can only be used to modify longer ID settings for resource types that are within the opt-in period.
     * Resources currently in their opt-in period include: <code>bundle</code> | <code>conversion-task</code> |
     * <code>customer-gateway</code> | <code>dhcp-options</code> | <code>elastic-ip-allocation</code> |
     * <code>elastic-ip-association</code> | <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
     * <code>import-task</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> | <code>network-interface-attachment</code>
     * | <code>prefix-list</code> | <code>route-table</code> | <code>route-table-association</code> |
     * <code>security-group</code> | <code>subnet</code> | <code>subnet-cidr-block-association</code> | <code>vpc</code>
     * | <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/resource-ids.html">Resource IDs</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * This setting applies to the principal specified in the request; it does not apply to the principal that makes the
     * request.
     * </p>
     * <p>
     * Resources created with longer IDs are visible to all IAM roles and users, regardless of these settings and
     * provided that they have permission to use the relevant <code>Describe</code> command for the resource type.
     * </p>
     * 
     * @param modifyIdentityIdFormatRequest
     * @return Result of the ModifyIdentityIdFormat operation returned by the service.
     * @sample AmazonEC2.ModifyIdentityIdFormat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyIdentityIdFormat" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyIdentityIdFormatResult modifyIdentityIdFormat(ModifyIdentityIdFormatRequest modifyIdentityIdFormatRequest);

    /**
     * <p>
     * Modifies the specified attribute of the specified AMI. You can specify only one attribute at a time. You can use
     * the <code>Attribute</code> parameter to specify the attribute or one of the following parameters:
     * <code>Description</code>, <code>LaunchPermission</code>, or <code>ProductCode</code>.
     * </p>
     * <p>
     * AWS Marketplace product codes cannot be modified. Images with an AWS Marketplace product code cannot be made
     * public.
     * </p>
     * <p>
     * To enable the SriovNetSupport enhanced networking attribute of an image, enable SriovNetSupport on an instance
     * and create an AMI from the instance.
     * </p>
     * 
     * @param modifyImageAttributeRequest
     *        Contains the parameters for ModifyImageAttribute.
     * @return Result of the ModifyImageAttribute operation returned by the service.
     * @sample AmazonEC2.ModifyImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyImageAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyImageAttributeResult modifyImageAttribute(ModifyImageAttributeRequest modifyImageAttributeRequest);

    /**
     * <p>
     * Modifies the specified attribute of the specified instance. You can specify only one attribute at a time.
     * </p>
     * <p>
     * <b>Note: </b>Using this action to change the security groups associated with an elastic network interface (ENI)
     * attached to an instance in a VPC can result in an error if the instance has more than one ENI. To change the
     * security groups associated with an ENI attached to an instance that has multiple ENIs, we recommend that you use
     * the <a>ModifyNetworkInterfaceAttribute</a> action.
     * </p>
     * <p>
     * To modify some attributes, the instance must be stopped. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_ChangingAttributesWhileInstanceStopped.html"
     * >Modifying attributes of a stopped instance</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param modifyInstanceAttributeRequest
     * @return Result of the ModifyInstanceAttribute operation returned by the service.
     * @sample AmazonEC2.ModifyInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyInstanceAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyInstanceAttributeResult modifyInstanceAttribute(ModifyInstanceAttributeRequest modifyInstanceAttributeRequest);

    /**
     * <p>
     * Modifies the Capacity Reservation settings for a stopped instance. Use this action to configure an instance to
     * target a specific Capacity Reservation, run in any <code>open</code> Capacity Reservation with matching
     * attributes, or run On-Demand Instance capacity.
     * </p>
     * 
     * @param modifyInstanceCapacityReservationAttributesRequest
     * @return Result of the ModifyInstanceCapacityReservationAttributes operation returned by the service.
     * @sample AmazonEC2.ModifyInstanceCapacityReservationAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyInstanceCapacityReservationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyInstanceCapacityReservationAttributesResult modifyInstanceCapacityReservationAttributes(
            ModifyInstanceCapacityReservationAttributesRequest modifyInstanceCapacityReservationAttributesRequest);

    /**
     * <p>
     * Modifies the credit option for CPU usage on a running or stopped burstable performance instance. The credit
     * options are <code>standard</code> and <code>unlimited</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * performance instances</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param modifyInstanceCreditSpecificationRequest
     * @return Result of the ModifyInstanceCreditSpecification operation returned by the service.
     * @sample AmazonEC2.ModifyInstanceCreditSpecification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyInstanceCreditSpecification"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyInstanceCreditSpecificationResult modifyInstanceCreditSpecification(ModifyInstanceCreditSpecificationRequest modifyInstanceCreditSpecificationRequest);

    /**
     * <p>
     * Modifies the start time for a scheduled Amazon EC2 instance event.
     * </p>
     * 
     * @param modifyInstanceEventStartTimeRequest
     * @return Result of the ModifyInstanceEventStartTime operation returned by the service.
     * @sample AmazonEC2.ModifyInstanceEventStartTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyInstanceEventStartTime"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyInstanceEventStartTimeResult modifyInstanceEventStartTime(ModifyInstanceEventStartTimeRequest modifyInstanceEventStartTimeRequest);

    /**
     * <p>
     * Modify the instance metadata parameters on a running or stopped instance. When you modify the parameters on a
     * stopped instance, they are applied when the instance is started. When you modify the parameters on a running
     * instance, the API responds with a state of “pending”. After the parameter modifications are successfully applied
     * to the instance, the state of the modifications changes from “pending” to “applied” in subsequent
     * describe-instances API calls. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance metadata and user
     * data</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param modifyInstanceMetadataOptionsRequest
     * @return Result of the ModifyInstanceMetadataOptions operation returned by the service.
     * @sample AmazonEC2.ModifyInstanceMetadataOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyInstanceMetadataOptions"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyInstanceMetadataOptionsResult modifyInstanceMetadataOptions(ModifyInstanceMetadataOptionsRequest modifyInstanceMetadataOptionsRequest);

    /**
     * <p>
     * Modifies the placement attributes for a specified instance. You can do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Modify the affinity between an instance and a <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-overview.html">Dedicated Host</a>. When
     * affinity is set to <code>host</code> and the instance is not associated with a specific Dedicated Host, the next
     * time the instance is launched, it is automatically associated with the host on which it lands. If the instance is
     * restarted or rebooted, this relationship persists.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change the Dedicated Host with which an instance is associated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change the instance tenancy of an instance from <code>host</code> to <code>dedicated</code>, or from
     * <code>dedicated</code> to <code>host</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Move an instance to or from a <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">placement group</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * At least one attribute for affinity, host ID, tenancy, or placement group name must be specified in the request.
     * Affinity and tenancy can be modified in the same request.
     * </p>
     * <p>
     * To modify the host ID, tenancy, placement group, or partition for an instance, the instance must be in the
     * <code>stopped</code> state.
     * </p>
     * 
     * @param modifyInstancePlacementRequest
     * @return Result of the ModifyInstancePlacement operation returned by the service.
     * @sample AmazonEC2.ModifyInstancePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyInstancePlacement" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyInstancePlacementResult modifyInstancePlacement(ModifyInstancePlacementRequest modifyInstancePlacementRequest);

    /**
     * <p>
     * Modifies a launch template. You can specify which version of the launch template to set as the default version.
     * When launching an instance, the default version applies when a launch template version is not specified.
     * </p>
     * 
     * @param modifyLaunchTemplateRequest
     * @return Result of the ModifyLaunchTemplate operation returned by the service.
     * @sample AmazonEC2.ModifyLaunchTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyLaunchTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyLaunchTemplateResult modifyLaunchTemplate(ModifyLaunchTemplateRequest modifyLaunchTemplateRequest);

    /**
     * <p>
     * Modifies the specified managed prefix list.
     * </p>
     * <p>
     * Adding or removing entries in a prefix list creates a new version of the prefix list. Changing the name of the
     * prefix list does not affect the version.
     * </p>
     * <p>
     * If you specify a current version number that does not match the true current version number, the request fails.
     * </p>
     * 
     * @param modifyManagedPrefixListRequest
     * @return Result of the ModifyManagedPrefixList operation returned by the service.
     * @sample AmazonEC2.ModifyManagedPrefixList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyManagedPrefixList" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyManagedPrefixListResult modifyManagedPrefixList(ModifyManagedPrefixListRequest modifyManagedPrefixListRequest);

    /**
     * <p>
     * Modifies the specified network interface attribute. You can specify only one attribute at a time. You can use
     * this action to attach and detach security groups from an existing EC2 instance.
     * </p>
     * 
     * @param modifyNetworkInterfaceAttributeRequest
     *        Contains the parameters for ModifyNetworkInterfaceAttribute.
     * @return Result of the ModifyNetworkInterfaceAttribute operation returned by the service.
     * @sample AmazonEC2.ModifyNetworkInterfaceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyNetworkInterfaceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyNetworkInterfaceAttributeResult modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest);

    /**
     * <p>
     * Modifies the Availability Zone, instance count, instance type, or network platform (EC2-Classic or EC2-VPC) of
     * your Reserved Instances. The Reserved Instances to be modified must be identical, except for Availability Zone,
     * network platform, and instance type.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-modifying.html">Modifying Reserved Instances</a> in
     * the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param modifyReservedInstancesRequest
     *        Contains the parameters for ModifyReservedInstances.
     * @return Result of the ModifyReservedInstances operation returned by the service.
     * @sample AmazonEC2.ModifyReservedInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyReservedInstances" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyReservedInstancesResult modifyReservedInstances(ModifyReservedInstancesRequest modifyReservedInstancesRequest);

    /**
     * <p>
     * Adds or removes permission settings for the specified snapshot. You may add or remove specified AWS account IDs
     * from a snapshot's list of create volume permissions, but you cannot do both in a single operation. If you need to
     * both add and remove account IDs for a snapshot, you must use multiple operations. You can make up to 500
     * modifications to a snapshot in a single operation.
     * </p>
     * <p>
     * Encrypted snapshots and snapshots with AWS Marketplace product codes cannot be made public. Snapshots encrypted
     * with your default CMK cannot be shared with other accounts.
     * </p>
     * <p>
     * For more information about modifying snapshot permissions, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-modifying-snapshot-permissions.html">Sharing
     * snapshots</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param modifySnapshotAttributeRequest
     * @return Result of the ModifySnapshotAttribute operation returned by the service.
     * @sample AmazonEC2.ModifySnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifySnapshotAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    ModifySnapshotAttributeResult modifySnapshotAttribute(ModifySnapshotAttributeRequest modifySnapshotAttributeRequest);

    /**
     * <p>
     * Modifies the specified Spot Fleet request.
     * </p>
     * <p>
     * You can only modify a Spot Fleet request of type <code>maintain</code>.
     * </p>
     * <p>
     * While the Spot Fleet request is being modified, it is in the <code>modifying</code> state.
     * </p>
     * <p>
     * To scale up your Spot Fleet, increase its target capacity. The Spot Fleet launches the additional Spot Instances
     * according to the allocation strategy for the Spot Fleet request. If the allocation strategy is
     * <code>lowestPrice</code>, the Spot Fleet launches instances using the Spot Instance pool with the lowest price.
     * If the allocation strategy is <code>diversified</code>, the Spot Fleet distributes the instances across the Spot
     * Instance pools. If the allocation strategy is <code>capacityOptimized</code>, Spot Fleet launches instances from
     * Spot Instance pools with optimal capacity for the number of instances that are launching.
     * </p>
     * <p>
     * To scale down your Spot Fleet, decrease its target capacity. First, the Spot Fleet cancels any open requests that
     * exceed the new target capacity. You can request that the Spot Fleet terminate Spot Instances until the size of
     * the fleet no longer exceeds the new target capacity. If the allocation strategy is <code>lowestPrice</code>, the
     * Spot Fleet terminates the instances with the highest price per unit. If the allocation strategy is
     * <code>capacityOptimized</code>, the Spot Fleet terminates the instances in the Spot Instance pools that have the
     * least available Spot Instance capacity. If the allocation strategy is <code>diversified</code>, the Spot Fleet
     * terminates instances across the Spot Instance pools. Alternatively, you can request that the Spot Fleet keep the
     * fleet at its current size, but not replace any Spot Instances that are interrupted or that you terminate
     * manually.
     * </p>
     * <p>
     * If you are finished with your Spot Fleet for now, but will use it again later, you can set the target capacity to
     * 0.
     * </p>
     * 
     * @param modifySpotFleetRequestRequest
     *        Contains the parameters for ModifySpotFleetRequest.
     * @return Result of the ModifySpotFleetRequest operation returned by the service.
     * @sample AmazonEC2.ModifySpotFleetRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifySpotFleetRequest" target="_top">AWS API
     *      Documentation</a>
     */
    ModifySpotFleetRequestResult modifySpotFleetRequest(ModifySpotFleetRequestRequest modifySpotFleetRequestRequest);

    /**
     * <p>
     * Modifies a subnet attribute. You can only modify one attribute at a time.
     * </p>
     * 
     * @param modifySubnetAttributeRequest
     * @return Result of the ModifySubnetAttribute operation returned by the service.
     * @sample AmazonEC2.ModifySubnetAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifySubnetAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    ModifySubnetAttributeResult modifySubnetAttribute(ModifySubnetAttributeRequest modifySubnetAttributeRequest);

    /**
     * <p>
     * Allows or restricts mirroring network services.
     * </p>
     * <p>
     * By default, Amazon DNS network services are not eligible for Traffic Mirror. Use <code>AddNetworkServices</code>
     * to add network services to a Traffic Mirror filter. When a network service is added to the Traffic Mirror filter,
     * all traffic related to that network service will be mirrored. When you no longer want to mirror network services,
     * use <code>RemoveNetworkServices</code> to remove the network services from the Traffic Mirror filter.
     * </p>
     * <p>
     * For information about filter rule properties, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/mirroring/traffic-mirroring-considerations.html">Network
     * Services</a> in the <i>Traffic Mirroring User Guide </i>.
     * </p>
     * 
     * @param modifyTrafficMirrorFilterNetworkServicesRequest
     * @return Result of the ModifyTrafficMirrorFilterNetworkServices operation returned by the service.
     * @sample AmazonEC2.ModifyTrafficMirrorFilterNetworkServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyTrafficMirrorFilterNetworkServices"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyTrafficMirrorFilterNetworkServicesResult modifyTrafficMirrorFilterNetworkServices(
            ModifyTrafficMirrorFilterNetworkServicesRequest modifyTrafficMirrorFilterNetworkServicesRequest);

    /**
     * <p>
     * Modifies the specified Traffic Mirror rule.
     * </p>
     * <p>
     * <code>DestinationCidrBlock</code> and <code>SourceCidrBlock</code> must both be an IPv4 range or an IPv6 range.
     * </p>
     * 
     * @param modifyTrafficMirrorFilterRuleRequest
     * @return Result of the ModifyTrafficMirrorFilterRule operation returned by the service.
     * @sample AmazonEC2.ModifyTrafficMirrorFilterRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyTrafficMirrorFilterRule"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyTrafficMirrorFilterRuleResult modifyTrafficMirrorFilterRule(ModifyTrafficMirrorFilterRuleRequest modifyTrafficMirrorFilterRuleRequest);

    /**
     * <p>
     * Modifies a Traffic Mirror session.
     * </p>
     * 
     * @param modifyTrafficMirrorSessionRequest
     * @return Result of the ModifyTrafficMirrorSession operation returned by the service.
     * @sample AmazonEC2.ModifyTrafficMirrorSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyTrafficMirrorSession" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyTrafficMirrorSessionResult modifyTrafficMirrorSession(ModifyTrafficMirrorSessionRequest modifyTrafficMirrorSessionRequest);

    /**
     * <p>
     * Modifies the specified transit gateway. When you modify a transit gateway, the modified options are applied to
     * new transit gateway attachments only. Your existing transit gateway attachments are not modified.
     * </p>
     * 
     * @param modifyTransitGatewayRequest
     * @return Result of the ModifyTransitGateway operation returned by the service.
     * @sample AmazonEC2.ModifyTransitGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyTransitGateway" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyTransitGatewayResult modifyTransitGateway(ModifyTransitGatewayRequest modifyTransitGatewayRequest);

    /**
     * <p>
     * Modifies a reference (route) to a prefix list in a specified transit gateway route table.
     * </p>
     * 
     * @param modifyTransitGatewayPrefixListReferenceRequest
     * @return Result of the ModifyTransitGatewayPrefixListReference operation returned by the service.
     * @sample AmazonEC2.ModifyTransitGatewayPrefixListReference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyTransitGatewayPrefixListReference"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyTransitGatewayPrefixListReferenceResult modifyTransitGatewayPrefixListReference(
            ModifyTransitGatewayPrefixListReferenceRequest modifyTransitGatewayPrefixListReferenceRequest);

    /**
     * <p>
     * Modifies the specified VPC attachment.
     * </p>
     * 
     * @param modifyTransitGatewayVpcAttachmentRequest
     * @return Result of the ModifyTransitGatewayVpcAttachment operation returned by the service.
     * @sample AmazonEC2.ModifyTransitGatewayVpcAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyTransitGatewayVpcAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyTransitGatewayVpcAttachmentResult modifyTransitGatewayVpcAttachment(ModifyTransitGatewayVpcAttachmentRequest modifyTransitGatewayVpcAttachmentRequest);

    /**
     * <p>
     * You can modify several parameters of an existing EBS volume, including volume size, volume type, and IOPS
     * capacity. If your EBS volume is attached to a current-generation EC2 instance type, you might be able to apply
     * these changes without stopping the instance or detaching the volume from it. For more information about modifying
     * an EBS volume running Linux, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-expand-volume.html">Modifying the size, IOPS, or
     * type of an EBS volume on Linux</a>. For more information about modifying an EBS volume running Windows, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ebs-expand-volume.html">Modifying the size, IOPS, or
     * type of an EBS volume on Windows</a>.
     * </p>
     * <p>
     * When you complete a resize operation on your volume, you need to extend the volume's file-system size to take
     * advantage of the new storage capacity. For information about extending a Linux file system, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-expand-volume.html#recognize-expanded-volume-linux"
     * >Extending a Linux file system</a>. For information about extending a Windows file system, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ebs-expand-volume.html#recognize-expanded-volume-windows"
     * >Extending a Windows file system</a>.
     * </p>
     * <p>
     * You can use CloudWatch Events to check the status of a modification to an EBS volume. For information about
     * CloudWatch Events, see the <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/">Amazon
     * CloudWatch Events User Guide</a>. You can also track the status of a modification using
     * <a>DescribeVolumesModifications</a>. For information about tracking status changes using either method, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-expand-volume.html#monitoring_mods">Monitoring
     * volume modifications</a>.
     * </p>
     * <p>
     * With previous-generation instance types, resizing an EBS volume might require detaching and reattaching the
     * volume or stopping and restarting the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-modify-volume.html">Amazon EBS Elastic Volumes</a>
     * (Linux) or <a href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ebs-modify-volume.html">Amazon EBS
     * Elastic Volumes</a> (Windows).
     * </p>
     * <p>
     * If you reach the maximum volume modification rate per volume limit, you will need to wait at least six hours
     * before applying further modifications to the affected EBS volume.
     * </p>
     * 
     * @param modifyVolumeRequest
     * @return Result of the ModifyVolume operation returned by the service.
     * @sample AmazonEC2.ModifyVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVolume" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyVolumeResult modifyVolume(ModifyVolumeRequest modifyVolumeRequest);

    /**
     * <p>
     * Modifies a volume attribute.
     * </p>
     * <p>
     * By default, all I/O operations for the volume are suspended when the data on the volume is determined to be
     * potentially inconsistent, to prevent undetectable, latent data corruption. The I/O access to the volume can be
     * resumed by first enabling I/O access and then checking the data consistency on your volume.
     * </p>
     * <p>
     * You can change the default behavior to resume I/O operations. We recommend that you change this only for boot
     * volumes or for volumes that are stateless or disposable.
     * </p>
     * 
     * @param modifyVolumeAttributeRequest
     * @return Result of the ModifyVolumeAttribute operation returned by the service.
     * @sample AmazonEC2.ModifyVolumeAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVolumeAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyVolumeAttributeResult modifyVolumeAttribute(ModifyVolumeAttributeRequest modifyVolumeAttributeRequest);

    /**
     * <p>
     * Modifies the specified attribute of the specified VPC.
     * </p>
     * 
     * @param modifyVpcAttributeRequest
     * @return Result of the ModifyVpcAttribute operation returned by the service.
     * @sample AmazonEC2.ModifyVpcAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyVpcAttributeResult modifyVpcAttribute(ModifyVpcAttributeRequest modifyVpcAttributeRequest);

    /**
     * <p>
     * Modifies attributes of a specified VPC endpoint. The attributes that you can modify depend on the type of VPC
     * endpoint (interface, gateway, or Gateway Load Balancer). For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints.html">VPC Endpoints</a> in the <i>Amazon
     * Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param modifyVpcEndpointRequest
     *        Contains the parameters for ModifyVpcEndpoint.
     * @return Result of the ModifyVpcEndpoint operation returned by the service.
     * @sample AmazonEC2.ModifyVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyVpcEndpointResult modifyVpcEndpoint(ModifyVpcEndpointRequest modifyVpcEndpointRequest);

    /**
     * <p>
     * Modifies a connection notification for VPC endpoint or VPC endpoint service. You can change the SNS topic for the
     * notification, or the events for which to be notified.
     * </p>
     * 
     * @param modifyVpcEndpointConnectionNotificationRequest
     * @return Result of the ModifyVpcEndpointConnectionNotification operation returned by the service.
     * @sample AmazonEC2.ModifyVpcEndpointConnectionNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcEndpointConnectionNotification"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyVpcEndpointConnectionNotificationResult modifyVpcEndpointConnectionNotification(
            ModifyVpcEndpointConnectionNotificationRequest modifyVpcEndpointConnectionNotificationRequest);

    /**
     * <p>
     * Modifies the attributes of your VPC endpoint service configuration. You can change the Network Load Balancers or
     * Gateway Load Balancers for your service, and you can specify whether acceptance is required for requests to
     * connect to your endpoint service through an interface VPC endpoint.
     * </p>
     * <p>
     * If you set or modify the private DNS name, you must prove that you own the private DNS domain name. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-services-dns-validation.html">VPC Endpoint
     * Service Private DNS Name Verification</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param modifyVpcEndpointServiceConfigurationRequest
     * @return Result of the ModifyVpcEndpointServiceConfiguration operation returned by the service.
     * @sample AmazonEC2.ModifyVpcEndpointServiceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcEndpointServiceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyVpcEndpointServiceConfigurationResult modifyVpcEndpointServiceConfiguration(
            ModifyVpcEndpointServiceConfigurationRequest modifyVpcEndpointServiceConfigurationRequest);

    /**
     * <p>
     * Modifies the permissions for your <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-service.html">VPC endpoint service</a>. You can
     * add or remove permissions for service consumers (IAM users, IAM roles, and AWS accounts) to connect to your
     * endpoint service.
     * </p>
     * <p>
     * If you grant permissions to all principals, the service is public. Any users who know the name of a public
     * service can send a request to attach an endpoint. If the service does not require manual approval, attachments
     * are automatically approved.
     * </p>
     * 
     * @param modifyVpcEndpointServicePermissionsRequest
     * @return Result of the ModifyVpcEndpointServicePermissions operation returned by the service.
     * @sample AmazonEC2.ModifyVpcEndpointServicePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcEndpointServicePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyVpcEndpointServicePermissionsResult modifyVpcEndpointServicePermissions(
            ModifyVpcEndpointServicePermissionsRequest modifyVpcEndpointServicePermissionsRequest);

    /**
     * <p>
     * Modifies the VPC peering connection options on one side of a VPC peering connection. You can do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enable/disable communication over the peering connection between an EC2-Classic instance that's linked to your
     * VPC (using ClassicLink) and instances in the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Enable/disable communication over the peering connection between instances in your VPC and an EC2-Classic
     * instance that's linked to the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Enable/disable the ability to resolve public DNS hostnames to private IP addresses when queried from instances in
     * the peer VPC.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the peered VPCs are in the same AWS account, you can enable DNS resolution for queries from the local VPC.
     * This ensures that queries from the local VPC resolve to private IP addresses in the peer VPC. This option is not
     * available if the peered VPCs are in different AWS accounts or different Regions. For peered VPCs in different AWS
     * accounts, each AWS account owner must initiate a separate request to modify the peering connection options. For
     * inter-region peering connections, you must use the Region for the requester VPC to modify the requester VPC
     * peering options and the Region for the accepter VPC to modify the accepter VPC peering options. To verify which
     * VPCs are the accepter and the requester for a VPC peering connection, use the
     * <a>DescribeVpcPeeringConnections</a> command.
     * </p>
     * 
     * @param modifyVpcPeeringConnectionOptionsRequest
     * @return Result of the ModifyVpcPeeringConnectionOptions operation returned by the service.
     * @sample AmazonEC2.ModifyVpcPeeringConnectionOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcPeeringConnectionOptions"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyVpcPeeringConnectionOptionsResult modifyVpcPeeringConnectionOptions(ModifyVpcPeeringConnectionOptionsRequest modifyVpcPeeringConnectionOptionsRequest);

    /**
     * <p>
     * Modifies the instance tenancy attribute of the specified VPC. You can change the instance tenancy attribute of a
     * VPC to <code>default</code> only. You cannot change the instance tenancy attribute to <code>dedicated</code>.
     * </p>
     * <p>
     * After you modify the tenancy of the VPC, any new instances that you launch into the VPC have a tenancy of
     * <code>default</code>, unless you specify otherwise during launch. The tenancy of any existing instances in the
     * VPC is not affected.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-instance.html">Dedicated Instances</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param modifyVpcTenancyRequest
     * @return Result of the ModifyVpcTenancy operation returned by the service.
     * @sample AmazonEC2.ModifyVpcTenancy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpcTenancy" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyVpcTenancyResult modifyVpcTenancy(ModifyVpcTenancyRequest modifyVpcTenancyRequest);

    /**
     * <p>
     * Modifies the customer gateway or the target gateway of an AWS Site-to-Site VPN connection. To modify the target
     * gateway, the following migration options are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An existing virtual private gateway to a new virtual private gateway
     * </p>
     * </li>
     * <li>
     * <p>
     * An existing virtual private gateway to a transit gateway
     * </p>
     * </li>
     * <li>
     * <p>
     * An existing transit gateway to a new transit gateway
     * </p>
     * </li>
     * <li>
     * <p>
     * An existing transit gateway to a virtual private gateway
     * </p>
     * </li>
     * </ul>
     * <p>
     * Before you perform the migration to the new gateway, you must configure the new gateway. Use
     * <a>CreateVpnGateway</a> to create a virtual private gateway, or <a>CreateTransitGateway</a> to create a transit
     * gateway.
     * </p>
     * <p>
     * This step is required when you migrate from a virtual private gateway with static routes to a transit gateway.
     * </p>
     * <p>
     * You must delete the static routes before you migrate to the new gateway.
     * </p>
     * <p>
     * Keep a copy of the static route before you delete it. You will need to add back these routes to the transit
     * gateway after the VPN connection migration is complete.
     * </p>
     * <p>
     * After you migrate to the new gateway, you might need to modify your VPC route table. Use <a>CreateRoute</a> and
     * <a>DeleteRoute</a> to make the changes described in <a
     * href="https://docs.aws.amazon.com/vpn/latest/s2svpn/modify-vpn-target.html#step-update-routing">VPN Gateway
     * Target Modification Required VPC Route Table Updates</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * <p>
     * When the new gateway is a transit gateway, modify the transit gateway route table to allow traffic between the
     * VPC and the AWS Site-to-Site VPN connection. Use <a>CreateTransitGatewayRoute</a> to add the routes.
     * </p>
     * <p>
     * If you deleted VPN static routes, you must add the static routes to the transit gateway route table.
     * </p>
     * <p>
     * After you perform this operation, the AWS VPN endpoint's IP addresses on the AWS side and the tunnel options
     * remain intact. Your AWS Site-to-Site VPN connection will be temporarily unavailable for a brief period while we
     * provision the new endpoints.
     * </p>
     * 
     * @param modifyVpnConnectionRequest
     * @return Result of the ModifyVpnConnection operation returned by the service.
     * @sample AmazonEC2.ModifyVpnConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpnConnection" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyVpnConnectionResult modifyVpnConnection(ModifyVpnConnectionRequest modifyVpnConnectionRequest);

    /**
     * <p>
     * Modifies the connection options for your Site-to-Site VPN connection.
     * </p>
     * <p>
     * When you modify the VPN connection options, the VPN endpoint IP addresses on the AWS side do not change, and the
     * tunnel options do not change. Your VPN connection will be temporarily unavailable for a brief period while the
     * VPN connection is updated.
     * </p>
     * 
     * @param modifyVpnConnectionOptionsRequest
     * @return Result of the ModifyVpnConnectionOptions operation returned by the service.
     * @sample AmazonEC2.ModifyVpnConnectionOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpnConnectionOptions" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyVpnConnectionOptionsResult modifyVpnConnectionOptions(ModifyVpnConnectionOptionsRequest modifyVpnConnectionOptionsRequest);

    /**
     * <p>
     * Modifies the VPN tunnel endpoint certificate.
     * </p>
     * 
     * @param modifyVpnTunnelCertificateRequest
     * @return Result of the ModifyVpnTunnelCertificate operation returned by the service.
     * @sample AmazonEC2.ModifyVpnTunnelCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpnTunnelCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyVpnTunnelCertificateResult modifyVpnTunnelCertificate(ModifyVpnTunnelCertificateRequest modifyVpnTunnelCertificateRequest);

    /**
     * <p>
     * Modifies the options for a VPN tunnel in an AWS Site-to-Site VPN connection. You can modify multiple options for
     * a tunnel in a single request, but you can only modify one tunnel at a time. For more information, see <a
     * href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPNTunnels.html">Site-to-Site VPN Tunnel Options for Your
     * Site-to-Site VPN Connection</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * 
     * @param modifyVpnTunnelOptionsRequest
     * @return Result of the ModifyVpnTunnelOptions operation returned by the service.
     * @sample AmazonEC2.ModifyVpnTunnelOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpnTunnelOptions" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyVpnTunnelOptionsResult modifyVpnTunnelOptions(ModifyVpnTunnelOptionsRequest modifyVpnTunnelOptionsRequest);

    /**
     * <p>
     * Enables detailed monitoring for a running instance. Otherwise, basic monitoring is enabled. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch.html">Monitoring your instances
     * and volumes</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * To disable detailed monitoring, see .
     * </p>
     * 
     * @param monitorInstancesRequest
     * @return Result of the MonitorInstances operation returned by the service.
     * @sample AmazonEC2.MonitorInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/MonitorInstances" target="_top">AWS API
     *      Documentation</a>
     */
    MonitorInstancesResult monitorInstances(MonitorInstancesRequest monitorInstancesRequest);

    /**
     * <p>
     * Moves an Elastic IP address from the EC2-Classic platform to the EC2-VPC platform. The Elastic IP address must be
     * allocated to your account for more than 24 hours, and it must not be associated with an instance. After the
     * Elastic IP address is moved, it is no longer available for use in the EC2-Classic platform, unless you move it
     * back using the <a>RestoreAddressToClassic</a> request. You cannot move an Elastic IP address that was originally
     * allocated for use in the EC2-VPC platform to the EC2-Classic platform.
     * </p>
     * 
     * @param moveAddressToVpcRequest
     * @return Result of the MoveAddressToVpc operation returned by the service.
     * @sample AmazonEC2.MoveAddressToVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/MoveAddressToVpc" target="_top">AWS API
     *      Documentation</a>
     */
    MoveAddressToVpcResult moveAddressToVpc(MoveAddressToVpcRequest moveAddressToVpcRequest);

    /**
     * <p>
     * Provisions an IPv4 or IPv6 address range for use with your AWS resources through bring your own IP addresses
     * (BYOIP) and creates a corresponding address pool. After the address range is provisioned, it is ready to be
     * advertised using <a>AdvertiseByoipCidr</a>.
     * </p>
     * <p>
     * AWS verifies that you own the address range and are authorized to advertise it. You must ensure that the address
     * range is registered to you and that you created an RPKI ROA to authorize Amazon ASNs 16509 and 14618 to advertise
     * the address range. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html">Bring Your Own IP Addresses (BYOIP)</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Provisioning an address range is an asynchronous operation, so the call returns immediately, but the address
     * range is not ready to use until its status changes from <code>pending-provision</code> to
     * <code>provisioned</code>. To monitor the status of an address range, use <a>DescribeByoipCidrs</a>. To allocate
     * an Elastic IP address from your IPv4 address pool, use <a>AllocateAddress</a> with either the specific address
     * from the address pool or the ID of the address pool.
     * </p>
     * 
     * @param provisionByoipCidrRequest
     * @return Result of the ProvisionByoipCidr operation returned by the service.
     * @sample AmazonEC2.ProvisionByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ProvisionByoipCidr" target="_top">AWS API
     *      Documentation</a>
     */
    ProvisionByoipCidrResult provisionByoipCidr(ProvisionByoipCidrRequest provisionByoipCidrRequest);

    /**
     * <p>
     * Purchase a reservation with configurations that match those of your Dedicated Host. You must have active
     * Dedicated Hosts in your account before you purchase a reservation. This action results in the specified
     * reservation being purchased and charged to your account.
     * </p>
     * 
     * @param purchaseHostReservationRequest
     * @return Result of the PurchaseHostReservation operation returned by the service.
     * @sample AmazonEC2.PurchaseHostReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PurchaseHostReservation" target="_top">AWS
     *      API Documentation</a>
     */
    PurchaseHostReservationResult purchaseHostReservation(PurchaseHostReservationRequest purchaseHostReservationRequest);

    /**
     * <p>
     * Purchases a Reserved Instance for use with your account. With Reserved Instances, you pay a lower hourly rate
     * compared to On-Demand instance pricing.
     * </p>
     * <p>
     * Use <a>DescribeReservedInstancesOfferings</a> to get a list of Reserved Instance offerings that match your
     * specifications. After you've purchased a Reserved Instance, you can check for your new Reserved Instance with
     * <a>DescribeReservedInstances</a>.
     * </p>
     * <p>
     * To queue a purchase for a future date and time, specify a purchase time. If you do not specify a purchase time,
     * the default is the current time.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts-on-demand-reserved-instances.html">Reserved
     * Instances</a> and <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html">Reserved
     * Instance Marketplace</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param purchaseReservedInstancesOfferingRequest
     *        Contains the parameters for PurchaseReservedInstancesOffering.
     * @return Result of the PurchaseReservedInstancesOffering operation returned by the service.
     * @sample AmazonEC2.PurchaseReservedInstancesOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PurchaseReservedInstancesOffering"
     *      target="_top">AWS API Documentation</a>
     */
    PurchaseReservedInstancesOfferingResult purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest purchaseReservedInstancesOfferingRequest);

    /**
     * <p>
     * Purchases the Scheduled Instances with the specified schedule.
     * </p>
     * <p>
     * Scheduled Instances enable you to purchase Amazon EC2 compute capacity by the hour for a one-year term. Before
     * you can purchase a Scheduled Instance, you must call <a>DescribeScheduledInstanceAvailability</a> to check for
     * available schedules and obtain a purchase token. After you purchase a Scheduled Instance, you must call
     * <a>RunScheduledInstances</a> during each scheduled time period.
     * </p>
     * <p>
     * After you purchase a Scheduled Instance, you can't cancel, modify, or resell your purchase.
     * </p>
     * 
     * @param purchaseScheduledInstancesRequest
     *        Contains the parameters for PurchaseScheduledInstances.
     * @return Result of the PurchaseScheduledInstances operation returned by the service.
     * @sample AmazonEC2.PurchaseScheduledInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PurchaseScheduledInstances" target="_top">AWS
     *      API Documentation</a>
     */
    PurchaseScheduledInstancesResult purchaseScheduledInstances(PurchaseScheduledInstancesRequest purchaseScheduledInstancesRequest);

    /**
     * <p>
     * Requests a reboot of the specified instances. This operation is asynchronous; it only queues a request to reboot
     * the specified instances. The operation succeeds if the instances are valid and belong to you. Requests to reboot
     * terminated instances are ignored.
     * </p>
     * <p>
     * If an instance does not cleanly shut down within a few minutes, Amazon EC2 performs a hard reboot.
     * </p>
     * <p>
     * For more information about troubleshooting, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-console.html">Getting console output and
     * rebooting instances</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param rebootInstancesRequest
     * @return Result of the RebootInstances operation returned by the service.
     * @sample AmazonEC2.RebootInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RebootInstances" target="_top">AWS API
     *      Documentation</a>
     */
    RebootInstancesResult rebootInstances(RebootInstancesRequest rebootInstancesRequest);

    /**
     * <p>
     * Registers an AMI. When you're creating an AMI, this is the final step you must complete before you can launch an
     * instance from the AMI. For more information about creating AMIs, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami.html">Creating your own AMIs</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <note>
     * <p>
     * For Amazon EBS-backed instances, <a>CreateImage</a> creates and registers the AMI in a single request, so you
     * don't have to register the AMI yourself.
     * </p>
     * </note>
     * <p>
     * If needed, you can deregister an AMI at any time. Any modifications you make to an AMI backed by an instance
     * store volume invalidates its registration. If you make changes to an image, deregister the previous image and
     * register the new image.
     * </p>
     * <p>
     * <b>Register a snapshot of a root device volume</b>
     * </p>
     * <p>
     * You can use <code>RegisterImage</code> to create an Amazon EBS-backed Linux AMI from a snapshot of a root device
     * volume. You specify the snapshot using a block device mapping. You can't set the encryption state of the volume
     * using the block device mapping. If the snapshot is encrypted, or encryption by default is enabled, the root
     * volume of an instance launched from the AMI is encrypted.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html#creating-launching-ami-from-snapshot"
     * >Create a Linux AMI from a snapshot</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AMIEncryption.html">Use encryption with EBS-backed
     * AMIs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * <b>AWS Marketplace product codes</b>
     * </p>
     * <p>
     * If any snapshots have AWS Marketplace product codes, they are copied to the new AMI.
     * </p>
     * <p>
     * Windows and some Linux distributions, such as Red Hat Enterprise Linux (RHEL) and SUSE Linux Enterprise Server
     * (SLES), use the EC2 billing product code associated with an AMI to verify the subscription status for package
     * updates. To create a new AMI for operating systems that require a billing product code, instead of registering
     * the AMI, do the following to preserve the billing product code association:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Launch an instance from an existing AMI with that billing product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * Customize the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create an AMI from the instance using <a>CreateImage</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you purchase a Reserved Instance to apply to an On-Demand Instance that was launched from an AMI with a
     * billing product code, make sure that the Reserved Instance has the matching billing product code. If you purchase
     * a Reserved Instance without the matching billing product code, the Reserved Instance will not be applied to the
     * On-Demand Instance. For information about how to obtain the platform details and billing information of an AMI,
     * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-billing-info.html">Obtaining billing
     * information</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param registerImageRequest
     *        Contains the parameters for RegisterImage.
     * @return Result of the RegisterImage operation returned by the service.
     * @sample AmazonEC2.RegisterImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RegisterImage" target="_top">AWS API
     *      Documentation</a>
     */
    RegisterImageResult registerImage(RegisterImageRequest registerImageRequest);

    /**
     * <p>
     * Registers a set of tag keys to include in scheduled event notifications for your resources.
     * </p>
     * <p>
     * To remove tags, use .
     * </p>
     * 
     * @param registerInstanceEventNotificationAttributesRequest
     * @return Result of the RegisterInstanceEventNotificationAttributes operation returned by the service.
     * @sample AmazonEC2.RegisterInstanceEventNotificationAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RegisterInstanceEventNotificationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterInstanceEventNotificationAttributesResult registerInstanceEventNotificationAttributes(
            RegisterInstanceEventNotificationAttributesRequest registerInstanceEventNotificationAttributesRequest);

    /**
     * <p>
     * Registers members (network interfaces) with the transit gateway multicast group. A member is a network interface
     * associated with a supported EC2 instance that receives multicast traffic. For information about supported
     * instances, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/tgw/transit-gateway-limits.html#multicast-limits">Multicast
     * Consideration</a> in <i>Amazon VPC Transit Gateways</i>.
     * </p>
     * <p>
     * After you add the members, use <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SearchTransitGatewayMulticastGroups.html"
     * >SearchTransitGatewayMulticastGroups</a> to verify that the members were added to the transit gateway multicast
     * group.
     * </p>
     * 
     * @param registerTransitGatewayMulticastGroupMembersRequest
     * @return Result of the RegisterTransitGatewayMulticastGroupMembers operation returned by the service.
     * @sample AmazonEC2.RegisterTransitGatewayMulticastGroupMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RegisterTransitGatewayMulticastGroupMembers"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterTransitGatewayMulticastGroupMembersResult registerTransitGatewayMulticastGroupMembers(
            RegisterTransitGatewayMulticastGroupMembersRequest registerTransitGatewayMulticastGroupMembersRequest);

    /**
     * <p>
     * Registers sources (network interfaces) with the specified transit gateway multicast group.
     * </p>
     * <p>
     * A multicast source is a network interface attached to a supported instance that sends multicast traffic. For
     * information about supported instances, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/tgw/transit-gateway-limits.html#multicast-limits">Multicast
     * Considerations</a> in <i>Amazon VPC Transit Gateways</i>.
     * </p>
     * <p>
     * After you add the source, use <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SearchTransitGatewayMulticastGroups.html"
     * >SearchTransitGatewayMulticastGroups</a> to verify that the source was added to the multicast group.
     * </p>
     * 
     * @param registerTransitGatewayMulticastGroupSourcesRequest
     * @return Result of the RegisterTransitGatewayMulticastGroupSources operation returned by the service.
     * @sample AmazonEC2.RegisterTransitGatewayMulticastGroupSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RegisterTransitGatewayMulticastGroupSources"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterTransitGatewayMulticastGroupSourcesResult registerTransitGatewayMulticastGroupSources(
            RegisterTransitGatewayMulticastGroupSourcesRequest registerTransitGatewayMulticastGroupSourcesRequest);

    /**
     * <p>
     * Rejects a request to associate cross-account subnets with a transit gateway multicast domain.
     * </p>
     * 
     * @param rejectTransitGatewayMulticastDomainAssociationsRequest
     * @return Result of the RejectTransitGatewayMulticastDomainAssociations operation returned by the service.
     * @sample AmazonEC2.RejectTransitGatewayMulticastDomainAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RejectTransitGatewayMulticastDomainAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    RejectTransitGatewayMulticastDomainAssociationsResult rejectTransitGatewayMulticastDomainAssociations(
            RejectTransitGatewayMulticastDomainAssociationsRequest rejectTransitGatewayMulticastDomainAssociationsRequest);

    /**
     * <p>
     * Rejects a transit gateway peering attachment request.
     * </p>
     * 
     * @param rejectTransitGatewayPeeringAttachmentRequest
     * @return Result of the RejectTransitGatewayPeeringAttachment operation returned by the service.
     * @sample AmazonEC2.RejectTransitGatewayPeeringAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RejectTransitGatewayPeeringAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    RejectTransitGatewayPeeringAttachmentResult rejectTransitGatewayPeeringAttachment(
            RejectTransitGatewayPeeringAttachmentRequest rejectTransitGatewayPeeringAttachmentRequest);

    /**
     * <p>
     * Rejects a request to attach a VPC to a transit gateway.
     * </p>
     * <p>
     * The VPC attachment must be in the <code>pendingAcceptance</code> state. Use
     * <a>DescribeTransitGatewayVpcAttachments</a> to view your pending VPC attachment requests. Use
     * <a>AcceptTransitGatewayVpcAttachment</a> to accept a VPC attachment request.
     * </p>
     * 
     * @param rejectTransitGatewayVpcAttachmentRequest
     * @return Result of the RejectTransitGatewayVpcAttachment operation returned by the service.
     * @sample AmazonEC2.RejectTransitGatewayVpcAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RejectTransitGatewayVpcAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    RejectTransitGatewayVpcAttachmentResult rejectTransitGatewayVpcAttachment(RejectTransitGatewayVpcAttachmentRequest rejectTransitGatewayVpcAttachmentRequest);

    /**
     * <p>
     * Rejects one or more VPC endpoint connection requests to your VPC endpoint service.
     * </p>
     * 
     * @param rejectVpcEndpointConnectionsRequest
     * @return Result of the RejectVpcEndpointConnections operation returned by the service.
     * @sample AmazonEC2.RejectVpcEndpointConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RejectVpcEndpointConnections"
     *      target="_top">AWS API Documentation</a>
     */
    RejectVpcEndpointConnectionsResult rejectVpcEndpointConnections(RejectVpcEndpointConnectionsRequest rejectVpcEndpointConnectionsRequest);

    /**
     * <p>
     * Rejects a VPC peering connection request. The VPC peering connection must be in the
     * <code>pending-acceptance</code> state. Use the <a>DescribeVpcPeeringConnections</a> request to view your
     * outstanding VPC peering connection requests. To delete an active VPC peering connection, or to delete a VPC
     * peering connection request that you initiated, use <a>DeleteVpcPeeringConnection</a>.
     * </p>
     * 
     * @param rejectVpcPeeringConnectionRequest
     * @return Result of the RejectVpcPeeringConnection operation returned by the service.
     * @sample AmazonEC2.RejectVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RejectVpcPeeringConnection" target="_top">AWS
     *      API Documentation</a>
     */
    RejectVpcPeeringConnectionResult rejectVpcPeeringConnection(RejectVpcPeeringConnectionRequest rejectVpcPeeringConnectionRequest);

    /**
     * <p>
     * Releases the specified Elastic IP address.
     * </p>
     * <p>
     * [EC2-Classic, default VPC] Releasing an Elastic IP address automatically disassociates it from any instance that
     * it's associated with. To disassociate an Elastic IP address without releasing it, use <a>DisassociateAddress</a>.
     * </p>
     * <p>
     * [Nondefault VPC] You must use <a>DisassociateAddress</a> to disassociate the Elastic IP address before you can
     * release it. Otherwise, Amazon EC2 returns an error (<code>InvalidIPAddress.InUse</code>).
     * </p>
     * <p>
     * After releasing an Elastic IP address, it is released to the IP address pool. Be sure to update your DNS records
     * and any servers or devices that communicate with the address. If you attempt to release an Elastic IP address
     * that you already released, you'll get an <code>AuthFailure</code> error if the address is already allocated to
     * another AWS account.
     * </p>
     * <p>
     * [EC2-VPC] After you release an Elastic IP address for use in a VPC, you might be able to recover it. For more
     * information, see <a>AllocateAddress</a>.
     * </p>
     * 
     * @param releaseAddressRequest
     * @return Result of the ReleaseAddress operation returned by the service.
     * @sample AmazonEC2.ReleaseAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReleaseAddress" target="_top">AWS API
     *      Documentation</a>
     */
    ReleaseAddressResult releaseAddress(ReleaseAddressRequest releaseAddressRequest);

    /**
     * <p>
     * When you no longer want to use an On-Demand Dedicated Host it can be released. On-Demand billing is stopped and
     * the host goes into <code>released</code> state. The host ID of Dedicated Hosts that have been released can no
     * longer be specified in another request, for example, to modify the host. You must stop or terminate all instances
     * on a host before it can be released.
     * </p>
     * <p>
     * When Dedicated Hosts are released, it may take some time for them to stop counting toward your limit and you may
     * receive capacity errors when trying to allocate new Dedicated Hosts. Wait a few minutes and then try again.
     * </p>
     * <p>
     * Released hosts still appear in a <a>DescribeHosts</a> response.
     * </p>
     * 
     * @param releaseHostsRequest
     * @return Result of the ReleaseHosts operation returned by the service.
     * @sample AmazonEC2.ReleaseHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReleaseHosts" target="_top">AWS API
     *      Documentation</a>
     */
    ReleaseHostsResult releaseHosts(ReleaseHostsRequest releaseHostsRequest);

    /**
     * <p>
     * Replaces an IAM instance profile for the specified running instance. You can use this action to change the IAM
     * instance profile that's associated with an instance without having to disassociate the existing IAM instance
     * profile first.
     * </p>
     * <p>
     * Use <a>DescribeIamInstanceProfileAssociations</a> to get the association ID.
     * </p>
     * 
     * @param replaceIamInstanceProfileAssociationRequest
     * @return Result of the ReplaceIamInstanceProfileAssociation operation returned by the service.
     * @sample AmazonEC2.ReplaceIamInstanceProfileAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceIamInstanceProfileAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    ReplaceIamInstanceProfileAssociationResult replaceIamInstanceProfileAssociation(
            ReplaceIamInstanceProfileAssociationRequest replaceIamInstanceProfileAssociationRequest);

    /**
     * <p>
     * Changes which network ACL a subnet is associated with. By default when you create a subnet, it's automatically
     * associated with the default network ACL. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_ACLs.html">Network ACLs</a> in the <i>Amazon Virtual
     * Private Cloud User Guide</i>.
     * </p>
     * <p>
     * This is an idempotent operation.
     * </p>
     * 
     * @param replaceNetworkAclAssociationRequest
     * @return Result of the ReplaceNetworkAclAssociation operation returned by the service.
     * @sample AmazonEC2.ReplaceNetworkAclAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceNetworkAclAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    ReplaceNetworkAclAssociationResult replaceNetworkAclAssociation(ReplaceNetworkAclAssociationRequest replaceNetworkAclAssociationRequest);

    /**
     * <p>
     * Replaces an entry (rule) in a network ACL. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_ACLs.html">Network ACLs</a> in the <i>Amazon Virtual
     * Private Cloud User Guide</i>.
     * </p>
     * 
     * @param replaceNetworkAclEntryRequest
     * @return Result of the ReplaceNetworkAclEntry operation returned by the service.
     * @sample AmazonEC2.ReplaceNetworkAclEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceNetworkAclEntry" target="_top">AWS API
     *      Documentation</a>
     */
    ReplaceNetworkAclEntryResult replaceNetworkAclEntry(ReplaceNetworkAclEntryRequest replaceNetworkAclEntryRequest);

    /**
     * <p>
     * Replaces an existing route within a route table in a VPC. You must provide only one of the following: internet
     * gateway, virtual private gateway, NAT instance, NAT gateway, VPC peering connection, network interface,
     * egress-only internet gateway, or transit gateway.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html">Route
     * Tables</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param replaceRouteRequest
     * @return Result of the ReplaceRoute operation returned by the service.
     * @sample AmazonEC2.ReplaceRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceRoute" target="_top">AWS API
     *      Documentation</a>
     */
    ReplaceRouteResult replaceRoute(ReplaceRouteRequest replaceRouteRequest);

    /**
     * <p>
     * Changes the route table associated with a given subnet, internet gateway, or virtual private gateway in a VPC.
     * After the operation completes, the subnet or gateway uses the routes in the new route table. For more information
     * about route tables, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html">Route
     * Tables</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * You can also use this operation to change which table is the main route table in the VPC. Specify the main route
     * table's association ID and the route table ID of the new main route table.
     * </p>
     * 
     * @param replaceRouteTableAssociationRequest
     * @return Result of the ReplaceRouteTableAssociation operation returned by the service.
     * @sample AmazonEC2.ReplaceRouteTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceRouteTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    ReplaceRouteTableAssociationResult replaceRouteTableAssociation(ReplaceRouteTableAssociationRequest replaceRouteTableAssociationRequest);

    /**
     * <p>
     * Replaces the specified route in the specified transit gateway route table.
     * </p>
     * 
     * @param replaceTransitGatewayRouteRequest
     * @return Result of the ReplaceTransitGatewayRoute operation returned by the service.
     * @sample AmazonEC2.ReplaceTransitGatewayRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReplaceTransitGatewayRoute" target="_top">AWS
     *      API Documentation</a>
     */
    ReplaceTransitGatewayRouteResult replaceTransitGatewayRoute(ReplaceTransitGatewayRouteRequest replaceTransitGatewayRouteRequest);

    /**
     * <p>
     * Submits feedback about the status of an instance. The instance must be in the <code>running</code> state. If your
     * experience with the instance differs from the instance status returned by <a>DescribeInstanceStatus</a>, use
     * <a>ReportInstanceStatus</a> to report your experience with the instance. Amazon EC2 collects this information to
     * improve the accuracy of status checks.
     * </p>
     * <p>
     * Use of this action does not change the value returned by <a>DescribeInstanceStatus</a>.
     * </p>
     * 
     * @param reportInstanceStatusRequest
     * @return Result of the ReportInstanceStatus operation returned by the service.
     * @sample AmazonEC2.ReportInstanceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReportInstanceStatus" target="_top">AWS API
     *      Documentation</a>
     */
    ReportInstanceStatusResult reportInstanceStatus(ReportInstanceStatusRequest reportInstanceStatusRequest);

    /**
     * <p>
     * Creates a Spot Fleet request.
     * </p>
     * <p>
     * The Spot Fleet request specifies the total target capacity and the On-Demand target capacity. Amazon EC2
     * calculates the difference between the total capacity and On-Demand capacity, and launches the difference as Spot
     * capacity.
     * </p>
     * <p>
     * You can submit a single request that includes multiple launch specifications that vary by instance type, AMI,
     * Availability Zone, or subnet.
     * </p>
     * <p>
     * By default, the Spot Fleet requests Spot Instances in the Spot Instance pool where the price per unit is the
     * lowest. Each launch specification can include its own instance weighting that reflects the value of the instance
     * type to your application workload.
     * </p>
     * <p>
     * Alternatively, you can specify that the Spot Fleet distribute the target capacity across the Spot pools included
     * in its launch specifications. By ensuring that the Spot Instances in your Spot Fleet are in different Spot pools,
     * you can improve the availability of your fleet.
     * </p>
     * <p>
     * You can specify tags for the Spot Fleet request and instances launched by the fleet. You cannot tag other
     * resource types in a Spot Fleet request because only the <code>spot-fleet-request</code> and <code>instance</code>
     * resource types are supported.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html">Spot Fleet requests</a> in
     * the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param requestSpotFleetRequest
     *        Contains the parameters for RequestSpotFleet.
     * @return Result of the RequestSpotFleet operation returned by the service.
     * @sample AmazonEC2.RequestSpotFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RequestSpotFleet" target="_top">AWS API
     *      Documentation</a>
     */
    RequestSpotFleetResult requestSpotFleet(RequestSpotFleetRequest requestSpotFleetRequest);

    /**
     * <p>
     * Creates a Spot Instance request.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html">Spot
     * Instance requests</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param requestSpotInstancesRequest
     *        Contains the parameters for RequestSpotInstances.
     * @return Result of the RequestSpotInstances operation returned by the service.
     * @sample AmazonEC2.RequestSpotInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RequestSpotInstances" target="_top">AWS API
     *      Documentation</a>
     */
    RequestSpotInstancesResult requestSpotInstances(RequestSpotInstancesRequest requestSpotInstancesRequest);

    /**
     * <p>
     * Resets the attribute of the specified IP address. For requirements, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html#Using_Elastic_Addressing_Reverse_DNS"
     * >Using reverse DNS for email applications</a>.
     * </p>
     * 
     * @param resetAddressAttributeRequest
     * @return Result of the ResetAddressAttribute operation returned by the service.
     * @sample AmazonEC2.ResetAddressAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetAddressAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    ResetAddressAttributeResult resetAddressAttribute(ResetAddressAttributeRequest resetAddressAttributeRequest);

    /**
     * <p>
     * Resets the default customer master key (CMK) for EBS encryption for your account in this Region to the AWS
     * managed CMK for EBS.
     * </p>
     * <p>
     * After resetting the default CMK to the AWS managed CMK, you can continue to encrypt by a customer managed CMK by
     * specifying it when you create the volume. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS encryption</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param resetEbsDefaultKmsKeyIdRequest
     * @return Result of the ResetEbsDefaultKmsKeyId operation returned by the service.
     * @sample AmazonEC2.ResetEbsDefaultKmsKeyId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetEbsDefaultKmsKeyId" target="_top">AWS
     *      API Documentation</a>
     */
    ResetEbsDefaultKmsKeyIdResult resetEbsDefaultKmsKeyId(ResetEbsDefaultKmsKeyIdRequest resetEbsDefaultKmsKeyIdRequest);

    /**
     * <p>
     * Resets the specified attribute of the specified Amazon FPGA Image (AFI) to its default value. You can only reset
     * the load permission attribute.
     * </p>
     * 
     * @param resetFpgaImageAttributeRequest
     * @return Result of the ResetFpgaImageAttribute operation returned by the service.
     * @sample AmazonEC2.ResetFpgaImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetFpgaImageAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    ResetFpgaImageAttributeResult resetFpgaImageAttribute(ResetFpgaImageAttributeRequest resetFpgaImageAttributeRequest);

    /**
     * <p>
     * Resets an attribute of an AMI to its default value.
     * </p>
     * <note>
     * <p>
     * The productCodes attribute can't be reset.
     * </p>
     * </note>
     * 
     * @param resetImageAttributeRequest
     *        Contains the parameters for ResetImageAttribute.
     * @return Result of the ResetImageAttribute operation returned by the service.
     * @sample AmazonEC2.ResetImageAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetImageAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    ResetImageAttributeResult resetImageAttribute(ResetImageAttributeRequest resetImageAttributeRequest);

    /**
     * <p>
     * Resets an attribute of an instance to its default value. To reset the <code>kernel</code> or <code>ramdisk</code>
     * , the instance must be in a stopped state. To reset the <code>sourceDestCheck</code>, the instance can be either
     * running or stopped.
     * </p>
     * <p>
     * The <code>sourceDestCheck</code> attribute controls whether source/destination checking is enabled. The default
     * value is <code>true</code>, which means checking is enabled. This value must be <code>false</code> for a NAT
     * instance to perform NAT. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT Instances</a> in the
     * <i>Amazon VPC User Guide</i>.
     * </p>
     * 
     * @param resetInstanceAttributeRequest
     * @return Result of the ResetInstanceAttribute operation returned by the service.
     * @sample AmazonEC2.ResetInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetInstanceAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    ResetInstanceAttributeResult resetInstanceAttribute(ResetInstanceAttributeRequest resetInstanceAttributeRequest);

    /**
     * <p>
     * Resets a network interface attribute. You can specify only one attribute at a time.
     * </p>
     * 
     * @param resetNetworkInterfaceAttributeRequest
     *        Contains the parameters for ResetNetworkInterfaceAttribute.
     * @return Result of the ResetNetworkInterfaceAttribute operation returned by the service.
     * @sample AmazonEC2.ResetNetworkInterfaceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetNetworkInterfaceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    ResetNetworkInterfaceAttributeResult resetNetworkInterfaceAttribute(ResetNetworkInterfaceAttributeRequest resetNetworkInterfaceAttributeRequest);

    /**
     * <p>
     * Resets permission settings for the specified snapshot.
     * </p>
     * <p>
     * For more information about modifying snapshot permissions, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-modifying-snapshot-permissions.html">Sharing
     * snapshots</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param resetSnapshotAttributeRequest
     * @return Result of the ResetSnapshotAttribute operation returned by the service.
     * @sample AmazonEC2.ResetSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResetSnapshotAttribute" target="_top">AWS API
     *      Documentation</a>
     */
    ResetSnapshotAttributeResult resetSnapshotAttribute(ResetSnapshotAttributeRequest resetSnapshotAttributeRequest);

    /**
     * <p>
     * Restores an Elastic IP address that was previously moved to the EC2-VPC platform back to the EC2-Classic
     * platform. You cannot move an Elastic IP address that was originally allocated for use in EC2-VPC. The Elastic IP
     * address must not be associated with an instance or network interface.
     * </p>
     * 
     * @param restoreAddressToClassicRequest
     * @return Result of the RestoreAddressToClassic operation returned by the service.
     * @sample AmazonEC2.RestoreAddressToClassic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RestoreAddressToClassic" target="_top">AWS
     *      API Documentation</a>
     */
    RestoreAddressToClassicResult restoreAddressToClassic(RestoreAddressToClassicRequest restoreAddressToClassicRequest);

    /**
     * <p>
     * Restores the entries from a previous version of a managed prefix list to a new version of the prefix list.
     * </p>
     * 
     * @param restoreManagedPrefixListVersionRequest
     * @return Result of the RestoreManagedPrefixListVersion operation returned by the service.
     * @sample AmazonEC2.RestoreManagedPrefixListVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RestoreManagedPrefixListVersion"
     *      target="_top">AWS API Documentation</a>
     */
    RestoreManagedPrefixListVersionResult restoreManagedPrefixListVersion(RestoreManagedPrefixListVersionRequest restoreManagedPrefixListVersionRequest);

    /**
     * <p>
     * Removes an ingress authorization rule from a Client VPN endpoint.
     * </p>
     * 
     * @param revokeClientVpnIngressRequest
     * @return Result of the RevokeClientVpnIngress operation returned by the service.
     * @sample AmazonEC2.RevokeClientVpnIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RevokeClientVpnIngress" target="_top">AWS API
     *      Documentation</a>
     */
    RevokeClientVpnIngressResult revokeClientVpnIngress(RevokeClientVpnIngressRequest revokeClientVpnIngressRequest);

    /**
     * <p>
     * [VPC only] Removes the specified egress rules from a security group for EC2-VPC. This action does not apply to
     * security groups for use in EC2-Classic. To remove a rule, the values that you specify (for example, ports) must
     * match the existing rule's values exactly.
     * </p>
     * <note>
     * <p>
     * [Default VPC] If the values you specify do not match the existing rule's values, no error is returned, and the
     * output describes the security group rules that were not revoked.
     * </p>
     * <p>
     * AWS recommends that you use <a>DescribeSecurityGroups</a> to verify that the rule has been removed.
     * </p>
     * </note>
     * <p>
     * Each rule consists of the protocol and the IPv4 or IPv6 CIDR range or source security group. For the TCP and UDP
     * protocols, you must also specify the destination port or range of ports. For the ICMP protocol, you must also
     * specify the ICMP type and code. If the security group rule has a description, you do not have to specify the
     * description to revoke the rule.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay
     * might occur.
     * </p>
     * 
     * @param revokeSecurityGroupEgressRequest
     * @return Result of the RevokeSecurityGroupEgress operation returned by the service.
     * @sample AmazonEC2.RevokeSecurityGroupEgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RevokeSecurityGroupEgress" target="_top">AWS
     *      API Documentation</a>
     */
    RevokeSecurityGroupEgressResult revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest revokeSecurityGroupEgressRequest);

    /**
     * <p>
     * Removes the specified ingress rules from a security group. To remove a rule, the values that you specify (for
     * example, ports) must match the existing rule's values exactly.
     * </p>
     * <note>
     * <p>
     * [EC2-Classic , default VPC] If the values you specify do not match the existing rule's values, no error is
     * returned, and the output describes the security group rules that were not revoked.
     * </p>
     * <p>
     * AWS recommends that you use <a>DescribeSecurityGroups</a> to verify that the rule has been removed.
     * </p>
     * </note>
     * <p>
     * Each rule consists of the protocol and the CIDR range or source security group. For the TCP and UDP protocols,
     * you must also specify the destination port or range of ports. For the ICMP protocol, you must also specify the
     * ICMP type and code. If the security group rule has a description, you do not have to specify the description to
     * revoke the rule.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay
     * might occur.
     * </p>
     * 
     * @param revokeSecurityGroupIngressRequest
     * @return Result of the RevokeSecurityGroupIngress operation returned by the service.
     * @sample AmazonEC2.RevokeSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RevokeSecurityGroupIngress" target="_top">AWS
     *      API Documentation</a>
     */
    RevokeSecurityGroupIngressResult revokeSecurityGroupIngress(RevokeSecurityGroupIngressRequest revokeSecurityGroupIngressRequest);

    /**
     * Simplified method form for invoking the RevokeSecurityGroupIngress operation.
     *
     * @see #revokeSecurityGroupIngress(RevokeSecurityGroupIngressRequest)
     */
    @Deprecated
    RevokeSecurityGroupIngressResult revokeSecurityGroupIngress();

    /**
     * <p>
     * Launches the specified number of instances using an AMI for which you have permissions.
     * </p>
     * <p>
     * You can specify a number of options, or leave the default options. The following rules apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * [EC2-VPC] If you don't specify a subnet ID, we choose a default subnet from your default VPC for you. If you
     * don't have a default VPC, you must specify a subnet ID in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * [EC2-Classic] If don't specify an Availability Zone, we choose one for you.
     * </p>
     * </li>
     * <li>
     * <p>
     * Some instance types must be launched into a VPC. If you do not have a default VPC, or if you do not specify a
     * subnet ID, the request fails. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-vpc.html#vpc-only-instance-types">Instance types
     * available only in a VPC</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * [EC2-VPC] All instances have a network interface with a primary private IPv4 address. If you don't specify this
     * address, we choose one from the IPv4 range of your subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not all instance types support IPv6 addresses. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify a security group ID, we use the default security group. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Security groups</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If any of the AMIs have a product code attached for which the user has not subscribed, the request fails.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can create a <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html">launch
     * template</a>, which is a resource that contains the parameters to launch an instance. When you launch an instance
     * using <a>RunInstances</a>, you can specify the launch template instead of specifying the launch parameters.
     * </p>
     * <p>
     * To ensure faster instance launches, break up large requests into smaller batches. For example, create five
     * separate launch requests for 100 instances each instead of one launch request for 500 instances.
     * </p>
     * <p>
     * An instance is ready for you to use when it's in the <code>running</code> state. You can check the state of your
     * instance using <a>DescribeInstances</a>. You can tag instances and EBS volumes during launch, after launch, or
     * both. For more information, see <a>CreateTags</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging your Amazon EC2 resources</a>.
     * </p>
     * <p>
     * Linux instances have access to the public key of the key pair at boot. You can use this key to provide secure
     * access to the instance. Amazon EC2 public images use this feature to provide secure access without passwords. For
     * more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Key
     * pairs</a>.
     * </p>
     * <p>
     * For troubleshooting, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_InstanceStraightToTerminated.html">What to do if
     * an instance immediately terminates</a>, and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstancesConnecting.html"
     * >Troubleshooting connecting to your instance</a>.
     * </p>
     * 
     * @param runInstancesRequest
     * @return Result of the RunInstances operation returned by the service.
     * @sample AmazonEC2.RunInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RunInstances" target="_top">AWS API
     *      Documentation</a>
     */
    RunInstancesResult runInstances(RunInstancesRequest runInstancesRequest);

    /**
     * <p>
     * Launches the specified Scheduled Instances.
     * </p>
     * <p>
     * Before you can launch a Scheduled Instance, you must purchase it and obtain an identifier using
     * <a>PurchaseScheduledInstances</a>.
     * </p>
     * <p>
     * You must launch a Scheduled Instance during its scheduled time period. You can't stop or reboot a Scheduled
     * Instance, but you can terminate it as needed. If you terminate a Scheduled Instance before the current scheduled
     * time period ends, you can launch it again after a few minutes. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-scheduled-instances.html">Scheduled Instances</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param runScheduledInstancesRequest
     *        Contains the parameters for RunScheduledInstances.
     * @return Result of the RunScheduledInstances operation returned by the service.
     * @sample AmazonEC2.RunScheduledInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RunScheduledInstances" target="_top">AWS API
     *      Documentation</a>
     */
    RunScheduledInstancesResult runScheduledInstances(RunScheduledInstancesRequest runScheduledInstancesRequest);

    /**
     * <p>
     * Searches for routes in the specified local gateway route table.
     * </p>
     * 
     * @param searchLocalGatewayRoutesRequest
     * @return Result of the SearchLocalGatewayRoutes operation returned by the service.
     * @sample AmazonEC2.SearchLocalGatewayRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SearchLocalGatewayRoutes" target="_top">AWS
     *      API Documentation</a>
     */
    SearchLocalGatewayRoutesResult searchLocalGatewayRoutes(SearchLocalGatewayRoutesRequest searchLocalGatewayRoutesRequest);

    /**
     * <p>
     * Searches one or more transit gateway multicast groups and returns the group membership information.
     * </p>
     * 
     * @param searchTransitGatewayMulticastGroupsRequest
     * @return Result of the SearchTransitGatewayMulticastGroups operation returned by the service.
     * @sample AmazonEC2.SearchTransitGatewayMulticastGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SearchTransitGatewayMulticastGroups"
     *      target="_top">AWS API Documentation</a>
     */
    SearchTransitGatewayMulticastGroupsResult searchTransitGatewayMulticastGroups(
            SearchTransitGatewayMulticastGroupsRequest searchTransitGatewayMulticastGroupsRequest);

    /**
     * <p>
     * Searches for routes in the specified transit gateway route table.
     * </p>
     * 
     * @param searchTransitGatewayRoutesRequest
     * @return Result of the SearchTransitGatewayRoutes operation returned by the service.
     * @sample AmazonEC2.SearchTransitGatewayRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SearchTransitGatewayRoutes" target="_top">AWS
     *      API Documentation</a>
     */
    SearchTransitGatewayRoutesResult searchTransitGatewayRoutes(SearchTransitGatewayRoutesRequest searchTransitGatewayRoutesRequest);

    /**
     * <p>
     * Sends a diagnostic interrupt to the specified Amazon EC2 instance to trigger a <i>kernel panic</i> (on Linux
     * instances), or a <i>blue screen</i>/<i>stop error</i> (on Windows instances). For instances based on Intel and
     * AMD processors, the interrupt is received as a <i>non-maskable interrupt</i> (NMI).
     * </p>
     * <p>
     * In general, the operating system crashes and reboots when a kernel panic or stop error is triggered. The
     * operating system can also be configured to perform diagnostic tasks, such as generating a memory dump file,
     * loading a secondary kernel, or obtaining a call trace.
     * </p>
     * <p>
     * Before sending a diagnostic interrupt to your instance, ensure that its operating system is configured to perform
     * the required diagnostic tasks.
     * </p>
     * <p>
     * For more information about configuring your operating system to generate a crash dump when a kernel panic or stop
     * error occurs, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/diagnostic-interrupt.html">Send a
     * diagnostic interrupt</a> (Linux instances) or <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/diagnostic-interrupt.html">Send a Diagnostic
     * Interrupt</a> (Windows instances).
     * </p>
     * 
     * @param sendDiagnosticInterruptRequest
     * @return Result of the SendDiagnosticInterrupt operation returned by the service.
     * @sample AmazonEC2.SendDiagnosticInterrupt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SendDiagnosticInterrupt" target="_top">AWS
     *      API Documentation</a>
     */
    SendDiagnosticInterruptResult sendDiagnosticInterrupt(SendDiagnosticInterruptRequest sendDiagnosticInterruptRequest);

    /**
     * <p>
     * Starts an Amazon EBS-backed instance that you've previously stopped.
     * </p>
     * <p>
     * Instances that use Amazon EBS volumes as their root devices can be quickly stopped and started. When an instance
     * is stopped, the compute resources are released and you are not billed for instance usage. However, your root
     * partition Amazon EBS volume remains and continues to persist your data, and you are charged for Amazon EBS volume
     * usage. You can restart your instance at any time. Every time you start your Windows instance, Amazon EC2 charges
     * you for a full instance hour. If you stop and restart your Windows instance, a new instance hour begins and
     * Amazon EC2 charges you for another full instance hour even if you are still within the same 60-minute period when
     * it was stopped. Every time you start your Linux instance, Amazon EC2 charges a one-minute minimum for instance
     * usage, and thereafter charges per second for instance usage.
     * </p>
     * <p>
     * Before stopping an instance, make sure it is in a state from which it can be restarted. Stopping an instance does
     * not preserve data stored in RAM.
     * </p>
     * <p>
     * Performing this operation on an instance that uses an instance store as its root device returns an error.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html">Stopping
     * instances</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param startInstancesRequest
     * @return Result of the StartInstances operation returned by the service.
     * @sample AmazonEC2.StartInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/StartInstances" target="_top">AWS API
     *      Documentation</a>
     */
    StartInstancesResult startInstances(StartInstancesRequest startInstancesRequest);

    /**
     * <p>
     * Starts analyzing the specified path. If the path is reachable, the operation returns the shortest feasible path.
     * </p>
     * 
     * @param startNetworkInsightsAnalysisRequest
     * @return Result of the StartNetworkInsightsAnalysis operation returned by the service.
     * @sample AmazonEC2.StartNetworkInsightsAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/StartNetworkInsightsAnalysis"
     *      target="_top">AWS API Documentation</a>
     */
    StartNetworkInsightsAnalysisResult startNetworkInsightsAnalysis(StartNetworkInsightsAnalysisRequest startNetworkInsightsAnalysisRequest);

    /**
     * <p>
     * Initiates the verification process to prove that the service provider owns the private DNS name domain for the
     * endpoint service.
     * </p>
     * <p>
     * The service provider must successfully perform the verification before the consumer can use the name to access
     * the service.
     * </p>
     * <p>
     * Before the service provider runs this command, they must add a record to the DNS server. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-services-dns-validation.html#add-dns-txt-record"
     * >Adding a TXT Record to Your Domain's DNS Server </a> in the <i>Amazon VPC User Guide</i>.
     * </p>
     * 
     * @param startVpcEndpointServicePrivateDnsVerificationRequest
     * @return Result of the StartVpcEndpointServicePrivateDnsVerification operation returned by the service.
     * @sample AmazonEC2.StartVpcEndpointServicePrivateDnsVerification
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/StartVpcEndpointServicePrivateDnsVerification"
     *      target="_top">AWS API Documentation</a>
     */
    StartVpcEndpointServicePrivateDnsVerificationResult startVpcEndpointServicePrivateDnsVerification(
            StartVpcEndpointServicePrivateDnsVerificationRequest startVpcEndpointServicePrivateDnsVerificationRequest);

    /**
     * <p>
     * Stops an Amazon EBS-backed instance.
     * </p>
     * <p>
     * You can use the Stop action to hibernate an instance if the instance is <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#enabling-hibernation">enabled for
     * hibernation</a> and it meets the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites">hibernation
     * prerequisites</a>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate your instance</a> in the
     * <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * We don't charge usage for a stopped instance, or data transfer fees; however, your root partition Amazon EBS
     * volume remains and continues to persist your data, and you are charged for Amazon EBS volume usage. Every time
     * you start your Windows instance, Amazon EC2 charges you for a full instance hour. If you stop and restart your
     * Windows instance, a new instance hour begins and Amazon EC2 charges you for another full instance hour even if
     * you are still within the same 60-minute period when it was stopped. Every time you start your Linux instance,
     * Amazon EC2 charges a one-minute minimum for instance usage, and thereafter charges per second for instance usage.
     * </p>
     * <p>
     * You can't stop or hibernate instance store-backed instances. You can't use the Stop action to hibernate Spot
     * Instances, but you can specify that Amazon EC2 should hibernate Spot Instances when they are interrupted. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-interruptions.html#hibernate-spot-instances"
     * >Hibernating interrupted Spot Instances</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * When you stop or hibernate an instance, we shut it down. You can restart your instance at any time. Before
     * stopping or hibernating an instance, make sure it is in a state from which it can be restarted. Stopping an
     * instance does not preserve data stored in RAM, but hibernating an instance does preserve data stored in RAM. If
     * an instance cannot hibernate successfully, a normal shutdown occurs.
     * </p>
     * <p>
     * Stopping and hibernating an instance is different to rebooting or terminating it. For example, when you stop or
     * hibernate an instance, the root device and any other devices attached to the instance persist. When you terminate
     * an instance, the root device and any other devices attached during the instance launch are automatically deleted.
     * For more information about the differences between rebooting, stopping, hibernating, and terminating instances,
     * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html">Instance
     * lifecycle</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * When you stop an instance, we attempt to shut it down forcibly after a short while. If your instance appears
     * stuck in the stopping state after a period of time, there may be an issue with the underlying host computer. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstancesStopping.html">Troubleshooting
     * stopping your instance</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param stopInstancesRequest
     * @return Result of the StopInstances operation returned by the service.
     * @sample AmazonEC2.StopInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/StopInstances" target="_top">AWS API
     *      Documentation</a>
     */
    StopInstancesResult stopInstances(StopInstancesRequest stopInstancesRequest);

    /**
     * <p>
     * Terminates active Client VPN endpoint connections. This action can be used to terminate a specific client
     * connection, or up to five connections established by a specific user.
     * </p>
     * 
     * @param terminateClientVpnConnectionsRequest
     * @return Result of the TerminateClientVpnConnections operation returned by the service.
     * @sample AmazonEC2.TerminateClientVpnConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TerminateClientVpnConnections"
     *      target="_top">AWS API Documentation</a>
     */
    TerminateClientVpnConnectionsResult terminateClientVpnConnections(TerminateClientVpnConnectionsRequest terminateClientVpnConnectionsRequest);

    /**
     * <p>
     * Shuts down the specified instances. This operation is idempotent; if you terminate an instance more than once,
     * each call succeeds.
     * </p>
     * <p>
     * If you specify multiple instances and the request fails (for example, because of a single incorrect instance ID),
     * none of the instances are terminated.
     * </p>
     * <p>
     * Terminated instances remain visible after termination (for approximately one hour).
     * </p>
     * <p>
     * By default, Amazon EC2 deletes all EBS volumes that were attached when the instance launched. Volumes attached
     * after instance launch continue running.
     * </p>
     * <p>
     * You can stop, start, and terminate EBS-backed instances. You can only terminate instance store-backed instances.
     * What happens to an instance differs if you stop it or terminate it. For example, when you stop an instance, the
     * root device and any other devices attached to the instance persist. When you terminate an instance, any attached
     * EBS volumes with the <code>DeleteOnTermination</code> block device mapping parameter set to <code>true</code> are
     * automatically deleted. For more information about the differences between stopping and terminating instances, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html">Instance lifecycle</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * For more information about troubleshooting, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstancesShuttingDown.html"
     * >Troubleshooting terminating your instance</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param terminateInstancesRequest
     * @return Result of the TerminateInstances operation returned by the service.
     * @sample AmazonEC2.TerminateInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TerminateInstances" target="_top">AWS API
     *      Documentation</a>
     */
    TerminateInstancesResult terminateInstances(TerminateInstancesRequest terminateInstancesRequest);

    /**
     * <p>
     * Unassigns one or more IPv6 addresses from a network interface.
     * </p>
     * 
     * @param unassignIpv6AddressesRequest
     * @return Result of the UnassignIpv6Addresses operation returned by the service.
     * @sample AmazonEC2.UnassignIpv6Addresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UnassignIpv6Addresses" target="_top">AWS API
     *      Documentation</a>
     */
    UnassignIpv6AddressesResult unassignIpv6Addresses(UnassignIpv6AddressesRequest unassignIpv6AddressesRequest);

    /**
     * <p>
     * Unassigns one or more secondary private IP addresses from a network interface.
     * </p>
     * 
     * @param unassignPrivateIpAddressesRequest
     *        Contains the parameters for UnassignPrivateIpAddresses.
     * @return Result of the UnassignPrivateIpAddresses operation returned by the service.
     * @sample AmazonEC2.UnassignPrivateIpAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UnassignPrivateIpAddresses" target="_top">AWS
     *      API Documentation</a>
     */
    UnassignPrivateIpAddressesResult unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest unassignPrivateIpAddressesRequest);

    /**
     * <p>
     * Disables detailed monitoring for a running instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch.html">Monitoring your instances and
     * volumes</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param unmonitorInstancesRequest
     * @return Result of the UnmonitorInstances operation returned by the service.
     * @sample AmazonEC2.UnmonitorInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UnmonitorInstances" target="_top">AWS API
     *      Documentation</a>
     */
    UnmonitorInstancesResult unmonitorInstances(UnmonitorInstancesRequest unmonitorInstancesRequest);

    /**
     * <p>
     * [VPC only] Updates the description of an egress (outbound) security group rule. You can replace an existing
     * description, or add a description to a rule that did not have one previously.
     * </p>
     * <p>
     * You specify the description as part of the IP permissions structure. You can remove a description for a security
     * group rule by omitting the description parameter in the request.
     * </p>
     * 
     * @param updateSecurityGroupRuleDescriptionsEgressRequest
     * @return Result of the UpdateSecurityGroupRuleDescriptionsEgress operation returned by the service.
     * @sample AmazonEC2.UpdateSecurityGroupRuleDescriptionsEgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UpdateSecurityGroupRuleDescriptionsEgress"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSecurityGroupRuleDescriptionsEgressResult updateSecurityGroupRuleDescriptionsEgress(
            UpdateSecurityGroupRuleDescriptionsEgressRequest updateSecurityGroupRuleDescriptionsEgressRequest);

    /**
     * <p>
     * Updates the description of an ingress (inbound) security group rule. You can replace an existing description, or
     * add a description to a rule that did not have one previously.
     * </p>
     * <p>
     * You specify the description as part of the IP permissions structure. You can remove a description for a security
     * group rule by omitting the description parameter in the request.
     * </p>
     * 
     * @param updateSecurityGroupRuleDescriptionsIngressRequest
     * @return Result of the UpdateSecurityGroupRuleDescriptionsIngress operation returned by the service.
     * @sample AmazonEC2.UpdateSecurityGroupRuleDescriptionsIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/UpdateSecurityGroupRuleDescriptionsIngress"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSecurityGroupRuleDescriptionsIngressResult updateSecurityGroupRuleDescriptionsIngress(
            UpdateSecurityGroupRuleDescriptionsIngressRequest updateSecurityGroupRuleDescriptionsIngressRequest);

    /**
     * <p>
     * Stops advertising an address range that is provisioned as an address pool.
     * </p>
     * <p>
     * You can perform this operation at most once every 10 seconds, even if you specify different address ranges each
     * time.
     * </p>
     * <p>
     * It can take a few minutes before traffic to the specified addresses stops routing to AWS because of BGP
     * propagation delays.
     * </p>
     * 
     * @param withdrawByoipCidrRequest
     * @return Result of the WithdrawByoipCidr operation returned by the service.
     * @sample AmazonEC2.WithdrawByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/WithdrawByoipCidr" target="_top">AWS API
     *      Documentation</a>
     */
    WithdrawByoipCidrResult withdrawByoipCidr(WithdrawByoipCidrRequest withdrawByoipCidrRequest);

    /**
     * Checks whether you have the required permissions for the provided Amazon EC2 operation, without actually running
     * it. The returned DryRunResult object contains the information of whether the dry-run was successful. This method
     * will throw exception when the service response does not clearly indicate whether you have the permission.
     *
     * @param request
     *        The request object for any Amazon EC2 operation supported with dry-run.
     *
     * @return A DryRunResult object that contains the information of whether the dry-run was successful.
     *
     * @throws AmazonClientException
     *         If any internal errors are encountered inside the client while attempting to make the request or handle
     *         the response. Or if the service response does not clearly indicate whether you have the permission.
     * @throws AmazonServiceException
     *         If an error response is returned by Amazon EC2 indicating either a problem with the data in the request,
     *         or a server side issue.
     */
    <X extends AmazonWebServiceRequest> DryRunResult<X> dryRun(DryRunSupportedRequest<X> request) throws AmazonServiceException, AmazonClientException;

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

    AmazonEC2Waiters waiters();

}
