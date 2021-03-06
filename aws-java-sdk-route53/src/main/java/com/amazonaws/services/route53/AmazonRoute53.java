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
package com.amazonaws.services.route53;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.route53.model.*;
import com.amazonaws.services.route53.waiters.AmazonRoute53Waiters;

/**
 * Interface for accessing Route 53.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53.AbstractAmazonRoute53} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Route 53 is a highly available and scalable Domain Name System (DNS) web service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonRoute53 {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "route53";

    /**
     * Overrides the default endpoint for this client ("https://route53.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "route53.amazonaws.com") or a full URL, including the protocol (ex:
     * "https://route53.amazonaws.com"). If the protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "route53.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://route53.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonRoute53#setEndpoint(String)}, sets the regional endpoint for this client's service
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
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Activates a key-signing key (KSK) so that it can be used for signing by DNSSEC. This operation changes the KSK
     * status to <code>ACTIVE</code>.
     * </p>
     * 
     * @param activateKeySigningKeyRequest
     * @return Result of the ActivateKeySigningKey operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to create, update, or delete the object at the same time that you did.
     *         Retry the request.
     * @throws NoSuchKeySigningKeyException
     *         The specified key-signing key (KSK) doesn't exist.
     * @throws InvalidKeySigningKeyStatusException
     *         The key-signing key (KSK) status isn't valid or another KSK has the status <code>INTERNAL_FAILURE</code>.
     * @throws InvalidSigningStatusException
     *         Your hosted zone status isn't valid for this operation. In the hosted zone, change the status to enable
     *         <code>DNSSEC</code> or disable <code>DNSSEC</code>.
     * @throws InvalidKMSArnException
     *         The KeyManagementServiceArn that you specified isn't valid to use with DNSSEC signing.
     * @sample AmazonRoute53.ActivateKeySigningKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ActivateKeySigningKey" target="_top">AWS
     *      API Documentation</a>
     */
    ActivateKeySigningKeyResult activateKeySigningKey(ActivateKeySigningKeyRequest activateKeySigningKeyRequest);

    /**
     * <p>
     * Associates an Amazon VPC with a private hosted zone.
     * </p>
     * <important>
     * <p>
     * To perform the association, the VPC and the private hosted zone must already exist. You can't convert a public
     * hosted zone into a private hosted zone.
     * </p>
     * </important> <note>
     * <p>
     * If you want to associate a VPC that was created by using one AWS account with a private hosted zone that was
     * created by using a different account, the AWS account that created the private hosted zone must first submit a
     * <code>CreateVPCAssociationAuthorization</code> request. Then the account that created the VPC must submit an
     * <code>AssociateVPCWithHostedZone</code> request.
     * </p>
     * </note>
     * 
     * @param associateVPCWithHostedZoneRequest
     *        A complex type that contains information about the request to associate a VPC with a private hosted zone.
     * @return Result of the AssociateVPCWithHostedZone operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws NotAuthorizedException
     *         Associating the specified VPC with the specified hosted zone has not been authorized.
     * @throws InvalidVPCIdException
     *         The VPC ID that you specified either isn't a valid ID or the current account is not authorized to access
     *         this VPC.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws PublicZoneVPCAssociationException
     *         You're trying to associate a VPC with a public hosted zone. Amazon Route 53 doesn't support associating a
     *         VPC with a public hosted zone.
     * @throws ConflictingDomainExistsException
     *         The cause of this error depends on the operation that you're performing:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Create a public hosted zone:</b> Two hosted zones that have the same name or that have a parent/child
     *         relationship (example.com and test.example.com) can't have any common name servers. You tried to create a
     *         hosted zone that has the same name as an existing hosted zone or that's the parent or child of an
     *         existing hosted zone, and you specified a delegation set that shares one or more name servers with the
     *         existing hosted zone. For more information, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateReusableDelegationSet.html"
     *         >CreateReusableDelegationSet</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Create a private hosted zone:</b> A hosted zone with the specified name already exists and is already
     *         associated with the Amazon VPC that you specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Associate VPCs with a private hosted zone:</b> The VPC that you specified is already associated with
     *         another hosted zone that has the same name.
     *         </p>
     *         </li>
     * @throws LimitsExceededException
     *         This operation can't be completed either because the current account has reached the limit on reusable
     *         delegation sets that it can create or because you've reached the limit on the number of Amazon VPCs that
     *         you can associate with a private hosted zone. To get the current limit on the number of reusable
     *         delegation sets, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetAccountLimit.html"
     *         >GetAccountLimit</a>. To get the current limit on the number of Amazon VPCs that you can associate with a
     *         private hosted zone, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetHostedZoneLimit.html"
     *         >GetHostedZoneLimit</a>. To request a higher limit, <a
     *         href="http://aws.amazon.com/route53-request">create a case</a> with the AWS Support Center.
     * @throws PriorRequestNotCompleteException
     *         If Amazon Route 53 can't process a request before the next request arrives, it will reject subsequent
     *         requests for the same hosted zone and return an <code>HTTP 400 error</code> (<code>Bad request</code>).
     *         If Route 53 returns this error repeatedly for the same request, we recommend that you wait, in intervals
     *         of increasing duration, before you try the request again.
     * @sample AmazonRoute53.AssociateVPCWithHostedZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/AssociateVPCWithHostedZone"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateVPCWithHostedZoneResult associateVPCWithHostedZone(AssociateVPCWithHostedZoneRequest associateVPCWithHostedZoneRequest);

    /**
     * <p>
     * Creates, changes, or deletes a resource record set, which contains authoritative DNS information for a specified
     * domain name or subdomain name. For example, you can use <code>ChangeResourceRecordSets</code> to create a
     * resource record set that routes traffic for test.example.com to a web server that has an IP address of
     * 192.0.2.44.
     * </p>
     * <p>
     * <b>Deleting Resource Record Sets</b>
     * </p>
     * <p>
     * To delete a resource record set, you must specify all the same values that you specified when you created it.
     * </p>
     * <p>
     * <b>Change Batches and Transactional Changes</b>
     * </p>
     * <p>
     * The request body must include a document with a <code>ChangeResourceRecordSetsRequest</code> element. The request
     * body contains a list of change items, known as a change batch. Change batches are considered transactional
     * changes. Route 53 validates the changes in the request and then either makes all or none of the changes in the
     * change batch request. This ensures that DNS routing isn't adversely affected by partial changes to the resource
     * record sets in a hosted zone.
     * </p>
     * <p>
     * For example, suppose a change batch request contains two changes: it deletes the <code>CNAME</code> resource
     * record set for www.example.com and creates an alias resource record set for www.example.com. If validation for
     * both records succeeds, Route 53 deletes the first resource record set and creates the second resource record set
     * in a single operation. If validation for either the <code>DELETE</code> or the <code>CREATE</code> action fails,
     * then the request is canceled, and the original <code>CNAME</code> record continues to exist.
     * </p>
     * <note>
     * <p>
     * If you try to delete the same resource record set more than once in a single change batch, Route 53 returns an
     * <code>InvalidChangeBatch</code> error.
     * </p>
     * </note>
     * <p>
     * <b>Traffic Flow</b>
     * </p>
     * <p>
     * To create resource record sets for complex routing configurations, use either the traffic flow visual editor in
     * the Route 53 console or the API actions for traffic policies and traffic policy instances. Save the configuration
     * as a traffic policy, then associate the traffic policy with one or more domain names (such as example.com) or
     * subdomain names (such as www.example.com), in the same hosted zone or in multiple hosted zones. You can roll back
     * the updates if the new configuration isn't performing as expected. For more information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/traffic-flow.html">Using Traffic Flow to Route
     * DNS Traffic</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * <b>Create, Delete, and Upsert</b>
     * </p>
     * <p>
     * Use <code>ChangeResourceRecordsSetsRequest</code> to perform the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE</code>: Creates a resource record set that has the specified values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code>: Deletes an existing resource record set that has the specified values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPSERT</code>: If a resource record set does not already exist, AWS creates it. If a resource set does
     * exist, Route 53 updates it with the values in the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Syntaxes for Creating, Updating, and Deleting Resource Record Sets</b>
     * </p>
     * <p>
     * The syntax for a request depends on the type of resource record set that you want to create, delete, or update,
     * such as weighted, alias, or failover. The XML elements in your request must appear in the order listed in the
     * syntax.
     * </p>
     * <p>
     * For an example for each type of resource record set, see "Examples."
     * </p>
     * <p>
     * Don't refer to the syntax in the "Parameter Syntax" section, which includes all of the elements for every kind of
     * resource record set that you can create, delete, or update by using <code>ChangeResourceRecordSets</code>.
     * </p>
     * <p>
     * <b>Change Propagation to Route 53 DNS Servers</b>
     * </p>
     * <p>
     * When you submit a <code>ChangeResourceRecordSets</code> request, Route 53 propagates your changes to all of the
     * Route 53 authoritative DNS servers. While your changes are propagating, <code>GetChange</code> returns a status
     * of <code>PENDING</code>. When propagation is complete, <code>GetChange</code> returns a status of
     * <code>INSYNC</code>. Changes generally propagate to all Route 53 name servers within 60 seconds. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetChange.html">GetChange</a>.
     * </p>
     * <p>
     * <b>Limits on ChangeResourceRecordSets Requests</b>
     * </p>
     * <p>
     * For information about the limits on a <code>ChangeResourceRecordSets</code> request, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html">Limits</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param changeResourceRecordSetsRequest
     *        A complex type that contains change information for the resource record set.
     * @return Result of the ChangeResourceRecordSets operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws NoSuchHealthCheckException
     *         No health check exists with the specified ID.
     * @throws InvalidChangeBatchException
     *         This exception contains a list of messages that might contain one or more error messages. Each error
     *         message indicates one error in the change batch.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws PriorRequestNotCompleteException
     *         If Amazon Route 53 can't process a request before the next request arrives, it will reject subsequent
     *         requests for the same hosted zone and return an <code>HTTP 400 error</code> (<code>Bad request</code>).
     *         If Route 53 returns this error repeatedly for the same request, we recommend that you wait, in intervals
     *         of increasing duration, before you try the request again.
     * @sample AmazonRoute53.ChangeResourceRecordSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ChangeResourceRecordSets"
     *      target="_top">AWS API Documentation</a>
     */
    ChangeResourceRecordSetsResult changeResourceRecordSets(ChangeResourceRecordSetsRequest changeResourceRecordSetsRequest);

    /**
     * <p>
     * Adds, edits, or deletes tags for a health check or a hosted zone.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param changeTagsForResourceRequest
     *        A complex type that contains information about the tags that you want to add, edit, or delete.
     * @return Result of the ChangeTagsForResource operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchHealthCheckException
     *         No health check exists with the specified ID.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws PriorRequestNotCompleteException
     *         If Amazon Route 53 can't process a request before the next request arrives, it will reject subsequent
     *         requests for the same hosted zone and return an <code>HTTP 400 error</code> (<code>Bad request</code>).
     *         If Route 53 returns this error repeatedly for the same request, we recommend that you wait, in intervals
     *         of increasing duration, before you try the request again.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonRoute53.ChangeTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ChangeTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ChangeTagsForResourceResult changeTagsForResource(ChangeTagsForResourceRequest changeTagsForResourceRequest);

    /**
     * <p>
     * Creates a new health check.
     * </p>
     * <p>
     * For information about adding health checks to resource record sets, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ResourceRecordSet.html#Route53-Type-ResourceRecordSet-HealthCheckId"
     * >HealthCheckId</a> in <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ChangeResourceRecordSets.html"
     * >ChangeResourceRecordSets</a>.
     * </p>
     * <p>
     * <b>ELB Load Balancers</b>
     * </p>
     * <p>
     * If you're registering EC2 instances with an Elastic Load Balancing (ELB) load balancer, do not create Amazon
     * Route 53 health checks for the EC2 instances. When you register an EC2 instance with a load balancer, you
     * configure settings for an ELB health check, which performs a similar function to a Route 53 health check.
     * </p>
     * <p>
     * <b>Private Hosted Zones</b>
     * </p>
     * <p>
     * You can associate health checks with failover resource record sets in a private hosted zone. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Route 53 health checkers are outside the VPC. To check the health of an endpoint within a VPC by IP address, you
     * must assign a public IP address to the instance in the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can configure a health checker to check the health of an external resource that the instance relies on, such
     * as a database server.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can create a CloudWatch metric, associate an alarm with the metric, and then create a health check that is
     * based on the state of the alarm. For example, you might create a CloudWatch metric that checks the status of the
     * Amazon EC2 <code>StatusCheckFailed</code> metric, add an alarm to the metric, and then create a health check that
     * is based on the state of the alarm. For information about creating CloudWatch metrics and alarms by using the
     * CloudWatch console, see the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/WhatIsCloudWatch.html">Amazon CloudWatch
     * User Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createHealthCheckRequest
     *        A complex type that contains the health check request information.
     * @return Result of the CreateHealthCheck operation returned by the service.
     * @throws TooManyHealthChecksException
     *         This health check can't be created because the current account has reached the limit on the number of
     *         active health checks.</p>
     *         <p>
     *         For information about default limits, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html">Limits</a> in the
     *         <i>Amazon Route 53 Developer Guide</i>.
     *         </p>
     *         <p>
     *         For information about how to get the current limit for an account, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetAccountLimit.html"
     *         >GetAccountLimit</a>. To request a higher limit, <a href="http://aws.amazon.com/route53-request">create a
     *         case</a> with the AWS Support Center.
     *         </p>
     *         <p>
     *         You have reached the maximum number of active health checks for an AWS account. To request a higher
     *         limit, <a href="http://aws.amazon.com/route53-request">create a case</a> with the AWS Support Center.
     * @throws HealthCheckAlreadyExistsException
     *         The health check you're attempting to create already exists. Amazon Route 53 returns this error when you
     *         submit a request that has the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The same value for <code>CallerReference</code> as an existing health check, and one or more values that
     *         differ from the existing health check that has the same caller reference.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The same value for <code>CallerReference</code> as a health check that you created and later deleted,
     *         regardless of the other settings in the request.
     *         </p>
     *         </li>
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.CreateHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateHealthCheck" target="_top">AWS API
     *      Documentation</a>
     */
    CreateHealthCheckResult createHealthCheck(CreateHealthCheckRequest createHealthCheckRequest);

    /**
     * <p>
     * Creates a new public or private hosted zone. You create records in a public hosted zone to define how you want to
     * route traffic on the internet for a domain, such as example.com, and its subdomains (apex.example.com,
     * acme.example.com). You create records in a private hosted zone to define how you want to route traffic for a
     * domain and its subdomains within one or more Amazon Virtual Private Clouds (Amazon VPCs).
     * </p>
     * <important>
     * <p>
     * You can't convert a public hosted zone to a private hosted zone or vice versa. Instead, you must create a new
     * hosted zone with the same name and create new resource record sets.
     * </p>
     * </important>
     * <p>
     * For more information about charges for hosted zones, see <a href="http://aws.amazon.com/route53/pricing/">Amazon
     * Route 53 Pricing</a>.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't create a hosted zone for a top-level domain (TLD) such as .com.
     * </p>
     * </li>
     * <li>
     * <p>
     * For public hosted zones, Route 53 automatically creates a default SOA record and four NS records for the zone.
     * For more information about SOA and NS records, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/SOA-NSrecords.html">NS and SOA Records that Route
     * 53 Creates for a Hosted Zone</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * If you want to use the same name servers for multiple public hosted zones, you can optionally associate a
     * reusable delegation set with the hosted zone. See the <code>DelegationSetId</code> element.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your domain is registered with a registrar other than Route 53, you must update the name servers with your
     * registrar to make Route 53 the DNS service for the domain. For more information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/MigratingDNS.html">Migrating DNS Service for an
     * Existing Domain to Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you submit a <code>CreateHostedZone</code> request, the initial status of the hosted zone is
     * <code>PENDING</code>. For public hosted zones, this means that the NS and SOA records are not yet available on
     * all Route 53 DNS servers. When the NS and SOA records are available, the status of the zone changes to
     * <code>INSYNC</code>.
     * </p>
     * <p>
     * The <code>CreateHostedZone</code> request requires the caller to have an <code>ec2:DescribeVpcs</code>
     * permission.
     * </p>
     * 
     * @param createHostedZoneRequest
     *        A complex type that contains information about the request to create a public or private hosted zone.
     * @return Result of the CreateHostedZone operation returned by the service.
     * @throws InvalidDomainNameException
     *         The specified domain name is not valid.
     * @throws HostedZoneAlreadyExistsException
     *         The hosted zone you're trying to create already exists. Amazon Route 53 returns this error when a hosted
     *         zone has already been created with the specified <code>CallerReference</code>.
     * @throws TooManyHostedZonesException
     *         This operation can't be completed either because the current account has reached the limit on the number
     *         of hosted zones or because you've reached the limit on the number of hosted zones that can be associated
     *         with a reusable delegation set.</p>
     *         <p>
     *         For information about default limits, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html">Limits</a> in the
     *         <i>Amazon Route 53 Developer Guide</i>.
     *         </p>
     *         <p>
     *         To get the current limit on hosted zones that can be created by an account, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetAccountLimit.html"
     *         >GetAccountLimit</a>.
     *         </p>
     *         <p>
     *         To get the current limit on hosted zones that can be associated with a reusable delegation set, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetReusableDelegationSetLimit.html">
     *         GetReusableDelegationSetLimit</a>.
     *         </p>
     *         <p>
     *         To request a higher limit, <a href="http://aws.amazon.com/route53-request">create a case</a> with the AWS
     *         Support Center.
     * @throws InvalidVPCIdException
     *         The VPC ID that you specified either isn't a valid ID or the current account is not authorized to access
     *         this VPC.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws DelegationSetNotAvailableException
     *         You can create a hosted zone that has the same name as an existing hosted zone (example.com is common),
     *         but there is a limit to the number of hosted zones that have the same name. If you get this error, Amazon
     *         Route 53 has reached that limit. If you own the domain name and Route 53 generates this error, contact
     *         Customer Support.
     * @throws ConflictingDomainExistsException
     *         The cause of this error depends on the operation that you're performing:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Create a public hosted zone:</b> Two hosted zones that have the same name or that have a parent/child
     *         relationship (example.com and test.example.com) can't have any common name servers. You tried to create a
     *         hosted zone that has the same name as an existing hosted zone or that's the parent or child of an
     *         existing hosted zone, and you specified a delegation set that shares one or more name servers with the
     *         existing hosted zone. For more information, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateReusableDelegationSet.html"
     *         >CreateReusableDelegationSet</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Create a private hosted zone:</b> A hosted zone with the specified name already exists and is already
     *         associated with the Amazon VPC that you specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Associate VPCs with a private hosted zone:</b> The VPC that you specified is already associated with
     *         another hosted zone that has the same name.
     *         </p>
     *         </li>
     * @throws NoSuchDelegationSetException
     *         A reusable delegation set with the specified ID does not exist.
     * @throws DelegationSetNotReusableException
     *         A reusable delegation set with the specified ID does not exist.
     * @sample AmazonRoute53.CreateHostedZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateHostedZone" target="_top">AWS API
     *      Documentation</a>
     */
    CreateHostedZoneResult createHostedZone(CreateHostedZoneRequest createHostedZoneRequest);

    /**
     * <p>
     * Creates a new key-signing key (KSK) associated with a hosted zone. You can only have two KSKs per hosted zone.
     * </p>
     * 
     * @param createKeySigningKeyRequest
     * @return Result of the CreateKeySigningKey operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidArgumentException
     *         Parameter name is not valid.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws InvalidKMSArnException
     *         The KeyManagementServiceArn that you specified isn't valid to use with DNSSEC signing.
     * @throws InvalidKeySigningKeyStatusException
     *         The key-signing key (KSK) status isn't valid or another KSK has the status <code>INTERNAL_FAILURE</code>.
     * @throws InvalidSigningStatusException
     *         Your hosted zone status isn't valid for this operation. In the hosted zone, change the status to enable
     *         <code>DNSSEC</code> or disable <code>DNSSEC</code>.
     * @throws InvalidKeySigningKeyNameException
     *         The key-signing key (KSK) name that you specified isn't a valid name.
     * @throws KeySigningKeyAlreadyExistsException
     *         You've already created a key-signing key (KSK) with this name or with the same customer managed customer
     *         master key (CMK) ARN.
     * @throws TooManyKeySigningKeysException
     *         You've reached the limit for the number of key-signing keys (KSKs). Remove at least one KSK, and then try
     *         again.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to create, update, or delete the object at the same time that you did.
     *         Retry the request.
     * @sample AmazonRoute53.CreateKeySigningKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateKeySigningKey" target="_top">AWS
     *      API Documentation</a>
     */
    CreateKeySigningKeyResult createKeySigningKey(CreateKeySigningKeyRequest createKeySigningKeyRequest);

    /**
     * <p>
     * Creates a configuration for DNS query logging. After you create a query logging configuration, Amazon Route 53
     * begins to publish log data to an Amazon CloudWatch Logs log group.
     * </p>
     * <p>
     * DNS query logs contain information about the queries that Route 53 receives for a specified public hosted zone,
     * such as the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Route 53 edge location that responded to the DNS query
     * </p>
     * </li>
     * <li>
     * <p>
     * Domain or subdomain that was requested
     * </p>
     * </li>
     * <li>
     * <p>
     * DNS record type, such as A or AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * DNS response code, such as <code>NoError</code> or <code>ServFail</code>
     * </p>
     * </li>
     * </ul>
     * <dl>
     * <dt>Log Group and Resource Policy</dt>
     * <dd>
     * <p>
     * Before you create a query logging configuration, perform the following operations.
     * </p>
     * <note>
     * <p>
     * If you create a query logging configuration using the Route 53 console, Route 53 performs these operations
     * automatically.
     * </p>
     * </note>
     * <ol>
     * <li>
     * <p>
     * Create a CloudWatch Logs log group, and make note of the ARN, which you specify when you create a query logging
     * configuration. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must create the log group in the us-east-1 region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must use the same AWS account to create the log group and the hosted zone that you want to configure query
     * logging for.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you create log groups for query logging, we recommend that you use a consistent prefix, for example:
     * </p>
     * <p>
     * <code>/aws/route53/<i>hosted zone name</i> </code>
     * </p>
     * <p>
     * In the next step, you'll create a resource policy, which controls access to one or more log groups and the
     * associated AWS resources, such as Route 53 hosted zones. There's a limit on the number of resource policies that
     * you can create, so we recommend that you use a consistent prefix so you can use the same resource policy for all
     * the log groups that you create for query logging.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Create a CloudWatch Logs resource policy, and give it the permissions that Route 53 needs to create log streams
     * and to send query logs to log streams. For the value of <code>Resource</code>, specify the ARN for the log group
     * that you created in the previous step. To use the same resource policy for all the CloudWatch Logs log groups
     * that you created for query logging configurations, replace the hosted zone name with <code>*</code>, for example:
     * </p>
     * <p>
     * <code>arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/*</code>
     * </p>
     * <note>
     * <p>
     * You can't use the CloudWatch console to create or edit a resource policy. You must use the CloudWatch API, one of
     * the AWS SDKs, or the AWS CLI.
     * </p>
     * </note></li>
     * </ol>
     * </dd>
     * <dt>Log Streams and Edge Locations</dt>
     * <dd>
     * <p>
     * When Route 53 finishes creating the configuration for DNS query logging, it does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a log stream for an edge location the first time that the edge location responds to DNS queries for the
     * specified hosted zone. That log stream is used to log all queries that Route 53 responds to for that edge
     * location.
     * </p>
     * </li>
     * <li>
     * <p>
     * Begins to send query logs to the applicable log stream.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of each log stream is in the following format:
     * </p>
     * <p>
     * <code> <i>hosted zone ID</i>/<i>edge location code</i> </code>
     * </p>
     * <p>
     * The edge location code is a three-letter code and an arbitrarily assigned number, for example, DFW3. The
     * three-letter code typically corresponds with the International Air Transport Association airport code for an
     * airport near the edge location. (These abbreviations might change in the future.) For a list of edge locations,
     * see "The Route 53 Global Network" on the <a href="http://aws.amazon.com/route53/details/">Route 53 Product
     * Details</a> page.
     * </p>
     * </dd>
     * <dt>Queries That Are Logged</dt>
     * <dd>
     * <p>
     * Query logs contain only the queries that DNS resolvers forward to Route 53. If a DNS resolver has already cached
     * the response to a query (such as the IP address for a load balancer for example.com), the resolver will continue
     * to return the cached response. It doesn't forward another query to Route 53 until the TTL for the corresponding
     * resource record set expires. Depending on how many DNS queries are submitted for a resource record set, and
     * depending on the TTL for that resource record set, query logs might contain information about only one query out
     * of every several thousand queries that are submitted to DNS. For more information about how DNS works, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/welcome-dns-service.html">Routing Internet
     * Traffic to Your Website or Web Application</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </dd>
     * <dt>Log File Format</dt>
     * <dd>
     * <p>
     * For a list of the values in each query log and the format of each value, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html">Logging DNS Queries</a> in the
     * <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </dd>
     * <dt>Pricing</dt>
     * <dd>
     * <p>
     * For information about charges for query logs, see <a href="http://aws.amazon.com/cloudwatch/pricing/">Amazon
     * CloudWatch Pricing</a>.
     * </p>
     * </dd>
     * <dt>How to Stop Logging</dt>
     * <dd>
     * <p>
     * If you want Route 53 to stop sending query logs to CloudWatch Logs, delete the query logging configuration. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteQueryLoggingConfig.html"
     * >DeleteQueryLoggingConfig</a>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param createQueryLoggingConfigRequest
     * @return Result of the CreateQueryLoggingConfig operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to create, update, or delete the object at the same time that you did.
     *         Retry the request.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws NoSuchCloudWatchLogsLogGroupException
     *         There is no CloudWatch Logs log group with the specified ARN.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws QueryLoggingConfigAlreadyExistsException
     *         You can create only one query logging configuration for a hosted zone, and a query logging configuration
     *         already exists for this hosted zone.
     * @throws InsufficientCloudWatchLogsResourcePolicyException
     *         Amazon Route 53 doesn't have the permissions required to create log streams and send query logs to log
     *         streams. Possible causes include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         There is no resource policy that specifies the log group ARN in the value for <code>Resource</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The resource policy that includes the log group ARN in the value for <code>Resource</code> doesn't have
     *         the necessary permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The resource policy hasn't finished propagating yet.
     *         </p>
     *         </li>
     * @sample AmazonRoute53.CreateQueryLoggingConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateQueryLoggingConfig"
     *      target="_top">AWS API Documentation</a>
     */
    CreateQueryLoggingConfigResult createQueryLoggingConfig(CreateQueryLoggingConfigRequest createQueryLoggingConfigRequest);

    /**
     * <p>
     * Creates a delegation set (a group of four name servers) that can be reused by multiple hosted zones that were
     * created by the same AWS account.
     * </p>
     * <p>
     * You can also create a reusable delegation set that uses the four name servers that are associated with an
     * existing hosted zone. Specify the hosted zone ID in the <code>CreateReusableDelegationSet</code> request.
     * </p>
     * <note>
     * <p>
     * You can't associate a reusable delegation set with a private hosted zone.
     * </p>
     * </note>
     * <p>
     * For information about using a reusable delegation set to configure white label name servers, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/white-label-name-servers.html">Configuring White
     * Label Name Servers</a>.
     * </p>
     * <p>
     * The process for migrating existing hosted zones to use a reusable delegation set is comparable to the process for
     * configuring white label name servers. You need to perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a reusable delegation set.
     * </p>
     * </li>
     * <li>
     * <p>
     * Recreate hosted zones, and reduce the TTL to 60 seconds or less.
     * </p>
     * </li>
     * <li>
     * <p>
     * Recreate resource record sets in the new hosted zones.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change the registrar's name servers to use the name servers for the new hosted zones.
     * </p>
     * </li>
     * <li>
     * <p>
     * Monitor traffic for the website or application.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change TTLs back to their original values.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you want to migrate existing hosted zones to use a reusable delegation set, the existing hosted zones can't
     * use any of the name servers that are assigned to the reusable delegation set. If one or more hosted zones do use
     * one or more name servers that are assigned to the reusable delegation set, you can do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For small numbers of hosted zones???up to a few hundred???it's relatively easy to create reusable delegation sets
     * until you get one that has four name servers that don't overlap with any of the name servers in your hosted
     * zones.
     * </p>
     * </li>
     * <li>
     * <p>
     * For larger numbers of hosted zones, the easiest solution is to use more than one reusable delegation set.
     * </p>
     * </li>
     * <li>
     * <p>
     * For larger numbers of hosted zones, you can also migrate hosted zones that have overlapping name servers to
     * hosted zones that don't have overlapping name servers, then migrate the hosted zones again to use the reusable
     * delegation set.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createReusableDelegationSetRequest
     * @return Result of the CreateReusableDelegationSet operation returned by the service.
     * @throws DelegationSetAlreadyCreatedException
     *         A delegation set with the same owner and caller reference combination has already been created.
     * @throws LimitsExceededException
     *         This operation can't be completed either because the current account has reached the limit on reusable
     *         delegation sets that it can create or because you've reached the limit on the number of Amazon VPCs that
     *         you can associate with a private hosted zone. To get the current limit on the number of reusable
     *         delegation sets, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetAccountLimit.html"
     *         >GetAccountLimit</a>. To get the current limit on the number of Amazon VPCs that you can associate with a
     *         private hosted zone, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetHostedZoneLimit.html"
     *         >GetHostedZoneLimit</a>. To request a higher limit, <a
     *         href="http://aws.amazon.com/route53-request">create a case</a> with the AWS Support Center.
     * @throws HostedZoneNotFoundException
     *         The specified HostedZone can't be found.
     * @throws InvalidArgumentException
     *         Parameter name is not valid.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws DelegationSetNotAvailableException
     *         You can create a hosted zone that has the same name as an existing hosted zone (example.com is common),
     *         but there is a limit to the number of hosted zones that have the same name. If you get this error, Amazon
     *         Route 53 has reached that limit. If you own the domain name and Route 53 generates this error, contact
     *         Customer Support.
     * @throws DelegationSetAlreadyReusableException
     *         The specified delegation set has already been marked as reusable.
     * @sample AmazonRoute53.CreateReusableDelegationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateReusableDelegationSet"
     *      target="_top">AWS API Documentation</a>
     */
    CreateReusableDelegationSetResult createReusableDelegationSet(CreateReusableDelegationSetRequest createReusableDelegationSetRequest);

    /**
     * <p>
     * Creates a traffic policy, which you use to create multiple DNS resource record sets for one domain name (such as
     * example.com) or one subdomain name (such as www.example.com).
     * </p>
     * 
     * @param createTrafficPolicyRequest
     *        A complex type that contains information about the traffic policy that you want to create.
     * @return Result of the CreateTrafficPolicy operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws TooManyTrafficPoliciesException
     *         This traffic policy can't be created because the current account has reached the limit on the number of
     *         traffic policies.</p>
     *         <p>
     *         For information about default limits, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html">Limits</a> in the
     *         <i>Amazon Route 53 Developer Guide</i>.
     *         </p>
     *         <p>
     *         To get the current limit for an account, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetAccountLimit.html"
     *         >GetAccountLimit</a>.
     *         </p>
     *         <p>
     *         To request a higher limit, <a href="http://aws.amazon.com/route53-request">create a case</a> with the AWS
     *         Support Center.
     * @throws TrafficPolicyAlreadyExistsException
     *         A traffic policy that has the same value for <code>Name</code> already exists.
     * @throws InvalidTrafficPolicyDocumentException
     *         The format of the traffic policy document that you specified in the <code>Document</code> element is not
     *         valid.
     * @sample AmazonRoute53.CreateTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateTrafficPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    CreateTrafficPolicyResult createTrafficPolicy(CreateTrafficPolicyRequest createTrafficPolicyRequest);

    /**
     * <p>
     * Creates resource record sets in a specified hosted zone based on the settings in a specified traffic policy
     * version. In addition, <code>CreateTrafficPolicyInstance</code> associates the resource record sets with a
     * specified domain name (such as example.com) or subdomain name (such as www.example.com). Amazon Route 53 responds
     * to DNS queries for the domain or subdomain name by using the resource record sets that
     * <code>CreateTrafficPolicyInstance</code> created.
     * </p>
     * 
     * @param createTrafficPolicyInstanceRequest
     *        A complex type that contains information about the resource record sets that you want to create based on a
     *        specified traffic policy.
     * @return Result of the CreateTrafficPolicyInstance operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws TooManyTrafficPolicyInstancesException
     *         This traffic policy instance can't be created because the current account has reached the limit on the
     *         number of traffic policy instances.</p>
     *         <p>
     *         For information about default limits, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html">Limits</a> in the
     *         <i>Amazon Route 53 Developer Guide</i>.
     *         </p>
     *         <p>
     *         For information about how to get the current limit for an account, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetAccountLimit.html"
     *         >GetAccountLimit</a>.
     *         </p>
     *         <p>
     *         To request a higher limit, <a href="http://aws.amazon.com/route53-request">create a case</a> with the AWS
     *         Support Center.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws TrafficPolicyInstanceAlreadyExistsException
     *         There is already a traffic policy instance with the specified ID.
     * @sample AmazonRoute53.CreateTrafficPolicyInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateTrafficPolicyInstance"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTrafficPolicyInstanceResult createTrafficPolicyInstance(CreateTrafficPolicyInstanceRequest createTrafficPolicyInstanceRequest);

    /**
     * <p>
     * Creates a new version of an existing traffic policy. When you create a new version of a traffic policy, you
     * specify the ID of the traffic policy that you want to update and a JSON-formatted document that describes the new
     * version. You use traffic policies to create multiple DNS resource record sets for one domain name (such as
     * example.com) or one subdomain name (such as www.example.com). You can create a maximum of 1000 versions of a
     * traffic policy. If you reach the limit and need to create another version, you'll need to start a new traffic
     * policy.
     * </p>
     * 
     * @param createTrafficPolicyVersionRequest
     *        A complex type that contains information about the traffic policy that you want to create a new version
     *        for.
     * @return Result of the CreateTrafficPolicyVersion operation returned by the service.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws TooManyTrafficPolicyVersionsForCurrentPolicyException
     *         This traffic policy version can't be created because you've reached the limit of 1000 on the number of
     *         versions that you can create for the current traffic policy.</p>
     *         <p>
     *         To create more traffic policy versions, you can use <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetTrafficPolicy.html"
     *         >GetTrafficPolicy</a> to get the traffic policy document for a specified traffic policy version, and then
     *         use <a href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateTrafficPolicy.html">
     *         CreateTrafficPolicy</a> to create a new traffic policy using the traffic policy document.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to create, update, or delete the object at the same time that you did.
     *         Retry the request.
     * @throws InvalidTrafficPolicyDocumentException
     *         The format of the traffic policy document that you specified in the <code>Document</code> element is not
     *         valid.
     * @sample AmazonRoute53.CreateTrafficPolicyVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateTrafficPolicyVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTrafficPolicyVersionResult createTrafficPolicyVersion(CreateTrafficPolicyVersionRequest createTrafficPolicyVersionRequest);

    /**
     * <p>
     * Authorizes the AWS account that created a specified VPC to submit an <code>AssociateVPCWithHostedZone</code>
     * request to associate the VPC with a specified hosted zone that was created by a different account. To submit a
     * <code>CreateVPCAssociationAuthorization</code> request, you must use the account that created the hosted zone.
     * After you authorize the association, use the account that created the VPC to submit an
     * <code>AssociateVPCWithHostedZone</code> request.
     * </p>
     * <note>
     * <p>
     * If you want to associate multiple VPCs that you created by using one account with a hosted zone that you created
     * by using a different account, you must submit one authorization request for each VPC.
     * </p>
     * </note>
     * 
     * @param createVPCAssociationAuthorizationRequest
     *        A complex type that contains information about the request to authorize associating a VPC with your
     *        private hosted zone. Authorization is only required when a private hosted zone and a VPC were created by
     *        using different accounts.
     * @return Result of the CreateVPCAssociationAuthorization operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to create, update, or delete the object at the same time that you did.
     *         Retry the request.
     * @throws TooManyVPCAssociationAuthorizationsException
     *         You've created the maximum number of authorizations that can be created for the specified hosted zone. To
     *         authorize another VPC to be associated with the hosted zone, submit a
     *         <code>DeleteVPCAssociationAuthorization</code> request to remove an existing authorization. To get a list
     *         of existing authorizations, submit a <code>ListVPCAssociationAuthorizations</code> request.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidVPCIdException
     *         The VPC ID that you specified either isn't a valid ID or the current account is not authorized to access
     *         this VPC.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.CreateVPCAssociationAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateVPCAssociationAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    CreateVPCAssociationAuthorizationResult createVPCAssociationAuthorization(CreateVPCAssociationAuthorizationRequest createVPCAssociationAuthorizationRequest);

    /**
     * <p>
     * Deactivates a key-signing key (KSK) so that it will not be used for signing by DNSSEC. This operation changes the
     * KSK status to <code>INACTIVE</code>.
     * </p>
     * 
     * @param deactivateKeySigningKeyRequest
     * @return Result of the DeactivateKeySigningKey operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to create, update, or delete the object at the same time that you did.
     *         Retry the request.
     * @throws NoSuchKeySigningKeyException
     *         The specified key-signing key (KSK) doesn't exist.
     * @throws InvalidKeySigningKeyStatusException
     *         The key-signing key (KSK) status isn't valid or another KSK has the status <code>INTERNAL_FAILURE</code>.
     * @throws InvalidSigningStatusException
     *         Your hosted zone status isn't valid for this operation. In the hosted zone, change the status to enable
     *         <code>DNSSEC</code> or disable <code>DNSSEC</code>.
     * @throws KeySigningKeyInUseException
     *         The key-signing key (KSK) that you specified can't be deactivated because it's the only KSK for a
     *         currently-enabled DNSSEC. Disable DNSSEC signing, or add or enable another KSK.
     * @throws KeySigningKeyInParentDSRecordException
     *         The key-signing key (KSK) is specified in a parent DS record.
     * @sample AmazonRoute53.DeactivateKeySigningKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeactivateKeySigningKey"
     *      target="_top">AWS API Documentation</a>
     */
    DeactivateKeySigningKeyResult deactivateKeySigningKey(DeactivateKeySigningKeyRequest deactivateKeySigningKeyRequest);

    /**
     * <p>
     * Deletes a health check.
     * </p>
     * <important>
     * <p>
     * Amazon Route 53 does not prevent you from deleting a health check even if the health check is associated with one
     * or more resource record sets. If you delete a health check and you don't update the associated resource record
     * sets, the future status of the health check can't be predicted and may change. This will affect the routing of
     * DNS queries for your DNS failover configuration. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-creating-deleting.html#health-checks-deleting.html"
     * >Replacing and Deleting Health Checks</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * If you're using AWS Cloud Map and you configured Cloud Map to create a Route 53 health check when you register an
     * instance, you can't use the Route 53 <code>DeleteHealthCheck</code> command to delete the health check. The
     * health check is deleted automatically when you deregister the instance; there can be a delay of several hours
     * before the health check is deleted from Route 53.
     * </p>
     * 
     * @param deleteHealthCheckRequest
     *        This action deletes a health check.
     * @return Result of the DeleteHealthCheck operation returned by the service.
     * @throws NoSuchHealthCheckException
     *         No health check exists with the specified ID.
     * @throws HealthCheckInUseException
     *         This error code is not in use.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.DeleteHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteHealthCheck" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteHealthCheckResult deleteHealthCheck(DeleteHealthCheckRequest deleteHealthCheckRequest);

    /**
     * <p>
     * Deletes a hosted zone.
     * </p>
     * <p>
     * If the hosted zone was created by another service, such as AWS Cloud Map, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DeleteHostedZone.html#delete-public-hosted-zone-created-by-another-service"
     * >Deleting Public Hosted Zones That Were Created by Another Service</a> in the <i>Amazon Route 53 Developer
     * Guide</i> for information about how to delete it. (The process is the same for public and private hosted zones
     * that were created by another service.)
     * </p>
     * <p>
     * If you want to keep your domain registration but you want to stop routing internet traffic to your website or web
     * application, we recommend that you delete resource record sets in the hosted zone instead of deleting the hosted
     * zone.
     * </p>
     * <important>
     * <p>
     * If you delete a hosted zone, you can't undelete it. You must create a new hosted zone and update the name servers
     * for your domain registration, which can require up to 48 hours to take effect. (If you delegated responsibility
     * for a subdomain to a hosted zone and you delete the child hosted zone, you must update the name servers in the
     * parent hosted zone.) In addition, if you delete a hosted zone, someone could hijack the domain and route traffic
     * to their own resources using your domain name.
     * </p>
     * </important>
     * <p>
     * If you want to avoid the monthly charge for the hosted zone, you can transfer DNS service for the domain to a
     * free DNS service. When you transfer DNS service, you have to update the name servers for the domain registration.
     * If the domain is registered with Route 53, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_UpdateDomainNameservers.html"
     * >UpdateDomainNameservers</a> for information about how to replace Route 53 name servers with name servers for the
     * new DNS service. If the domain is registered with another registrar, use the method provided by the registrar to
     * update name servers for the domain registration. For more information, perform an internet search on
     * "free DNS service."
     * </p>
     * <p>
     * You can delete a hosted zone only if it contains only the default SOA record and NS resource record sets. If the
     * hosted zone contains other resource record sets, you must delete them before you can delete the hosted zone. If
     * you try to delete a hosted zone that contains other resource record sets, the request fails, and Route 53 returns
     * a <code>HostedZoneNotEmpty</code> error. For information about deleting records from your hosted zone, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ChangeResourceRecordSets.html">
     * ChangeResourceRecordSets</a>.
     * </p>
     * <p>
     * To verify that the hosted zone has been deleted, do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>GetHostedZone</code> action to request information about the hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the <code>ListHostedZones</code> action to get a list of the hosted zones associated with the current AWS
     * account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteHostedZoneRequest
     *        A request to delete a hosted zone.
     * @return Result of the DeleteHostedZone operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws HostedZoneNotEmptyException
     *         The hosted zone contains resource records that are not SOA or NS records.
     * @throws PriorRequestNotCompleteException
     *         If Amazon Route 53 can't process a request before the next request arrives, it will reject subsequent
     *         requests for the same hosted zone and return an <code>HTTP 400 error</code> (<code>Bad request</code>).
     *         If Route 53 returns this error repeatedly for the same request, we recommend that you wait, in intervals
     *         of increasing duration, before you try the request again.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws InvalidDomainNameException
     *         The specified domain name is not valid.
     * @sample AmazonRoute53.DeleteHostedZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteHostedZone" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteHostedZoneResult deleteHostedZone(DeleteHostedZoneRequest deleteHostedZoneRequest);

    /**
     * <p>
     * Deletes a key-signing key (KSK). Before you can delete a KSK, you must deactivate it. The KSK must be deactivated
     * before you can delete it regardless of whether the hosted zone is enabled for DNSSEC signing.
     * </p>
     * 
     * @param deleteKeySigningKeyRequest
     * @return Result of the DeleteKeySigningKey operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to create, update, or delete the object at the same time that you did.
     *         Retry the request.
     * @throws NoSuchKeySigningKeyException
     *         The specified key-signing key (KSK) doesn't exist.
     * @throws InvalidKeySigningKeyStatusException
     *         The key-signing key (KSK) status isn't valid or another KSK has the status <code>INTERNAL_FAILURE</code>.
     * @throws InvalidSigningStatusException
     *         Your hosted zone status isn't valid for this operation. In the hosted zone, change the status to enable
     *         <code>DNSSEC</code> or disable <code>DNSSEC</code>.
     * @throws InvalidKMSArnException
     *         The KeyManagementServiceArn that you specified isn't valid to use with DNSSEC signing.
     * @sample AmazonRoute53.DeleteKeySigningKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteKeySigningKey" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteKeySigningKeyResult deleteKeySigningKey(DeleteKeySigningKeyRequest deleteKeySigningKeyRequest);

    /**
     * <p>
     * Deletes a configuration for DNS query logging. If you delete a configuration, Amazon Route 53 stops sending query
     * logs to CloudWatch Logs. Route 53 doesn't delete any logs that are already in CloudWatch Logs.
     * </p>
     * <p>
     * For more information about DNS query logs, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateQueryLoggingConfig.html"
     * >CreateQueryLoggingConfig</a>.
     * </p>
     * 
     * @param deleteQueryLoggingConfigRequest
     * @return Result of the DeleteQueryLoggingConfig operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to create, update, or delete the object at the same time that you did.
     *         Retry the request.
     * @throws NoSuchQueryLoggingConfigException
     *         There is no DNS query logging configuration with the specified ID.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.DeleteQueryLoggingConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteQueryLoggingConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteQueryLoggingConfigResult deleteQueryLoggingConfig(DeleteQueryLoggingConfigRequest deleteQueryLoggingConfigRequest);

    /**
     * <p>
     * Deletes a reusable delegation set.
     * </p>
     * <important>
     * <p>
     * You can delete a reusable delegation set only if it isn't associated with any hosted zones.
     * </p>
     * </important>
     * <p>
     * To verify that the reusable delegation set is not associated with any hosted zones, submit a <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetReusableDelegationSet.html"
     * >GetReusableDelegationSet</a> request and specify the ID of the reusable delegation set that you want to delete.
     * </p>
     * 
     * @param deleteReusableDelegationSetRequest
     *        A request to delete a reusable delegation set.
     * @return Result of the DeleteReusableDelegationSet operation returned by the service.
     * @throws NoSuchDelegationSetException
     *         A reusable delegation set with the specified ID does not exist.
     * @throws DelegationSetInUseException
     *         The specified delegation contains associated hosted zones which must be deleted before the reusable
     *         delegation set can be deleted.
     * @throws DelegationSetNotReusableException
     *         A reusable delegation set with the specified ID does not exist.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.DeleteReusableDelegationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteReusableDelegationSet"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteReusableDelegationSetResult deleteReusableDelegationSet(DeleteReusableDelegationSetRequest deleteReusableDelegationSetRequest);

    /**
     * <p>
     * Deletes a traffic policy.
     * </p>
     * <p>
     * When you delete a traffic policy, Route 53 sets a flag on the policy to indicate that it has been deleted.
     * However, Route 53 never fully deletes the traffic policy. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Deleted traffic policies aren't listed if you run <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListTrafficPolicies.html"
     * >ListTrafficPolicies</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * There's no way to get a list of deleted policies.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you retain the ID of the policy, you can get information about the policy, including the traffic policy
     * document, by running <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetTrafficPolicy.html">GetTrafficPolicy</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteTrafficPolicyRequest
     *        A request to delete a specified traffic policy version.
     * @return Result of the DeleteTrafficPolicy operation returned by the service.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws TrafficPolicyInUseException
     *         One or more traffic policy instances were created by using the specified traffic policy.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to create, update, or delete the object at the same time that you did.
     *         Retry the request.
     * @sample AmazonRoute53.DeleteTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteTrafficPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteTrafficPolicyResult deleteTrafficPolicy(DeleteTrafficPolicyRequest deleteTrafficPolicyRequest);

    /**
     * <p>
     * Deletes a traffic policy instance and all of the resource record sets that Amazon Route 53 created when you
     * created the instance.
     * </p>
     * <note>
     * <p>
     * In the Route 53 console, traffic policy instances are known as policy records.
     * </p>
     * </note>
     * 
     * @param deleteTrafficPolicyInstanceRequest
     *        A request to delete a specified traffic policy instance.
     * @return Result of the DeleteTrafficPolicyInstance operation returned by the service.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws PriorRequestNotCompleteException
     *         If Amazon Route 53 can't process a request before the next request arrives, it will reject subsequent
     *         requests for the same hosted zone and return an <code>HTTP 400 error</code> (<code>Bad request</code>).
     *         If Route 53 returns this error repeatedly for the same request, we recommend that you wait, in intervals
     *         of increasing duration, before you try the request again.
     * @sample AmazonRoute53.DeleteTrafficPolicyInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteTrafficPolicyInstance"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTrafficPolicyInstanceResult deleteTrafficPolicyInstance(DeleteTrafficPolicyInstanceRequest deleteTrafficPolicyInstanceRequest);

    /**
     * <p>
     * Removes authorization to submit an <code>AssociateVPCWithHostedZone</code> request to associate a specified VPC
     * with a hosted zone that was created by a different account. You must use the account that created the hosted zone
     * to submit a <code>DeleteVPCAssociationAuthorization</code> request.
     * </p>
     * <important>
     * <p>
     * Sending this request only prevents the AWS account that created the VPC from associating the VPC with the Amazon
     * Route 53 hosted zone in the future. If the VPC is already associated with the hosted zone,
     * <code>DeleteVPCAssociationAuthorization</code> won't disassociate the VPC from the hosted zone. If you want to
     * delete an existing association, use <code>DisassociateVPCFromHostedZone</code>.
     * </p>
     * </important>
     * 
     * @param deleteVPCAssociationAuthorizationRequest
     *        A complex type that contains information about the request to remove authorization to associate a VPC that
     *        was created by one AWS account with a hosted zone that was created with a different AWS account.
     * @return Result of the DeleteVPCAssociationAuthorization operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to create, update, or delete the object at the same time that you did.
     *         Retry the request.
     * @throws VPCAssociationAuthorizationNotFoundException
     *         The VPC that you specified is not authorized to be associated with the hosted zone.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidVPCIdException
     *         The VPC ID that you specified either isn't a valid ID or the current account is not authorized to access
     *         this VPC.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.DeleteVPCAssociationAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteVPCAssociationAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVPCAssociationAuthorizationResult deleteVPCAssociationAuthorization(DeleteVPCAssociationAuthorizationRequest deleteVPCAssociationAuthorizationRequest);

    /**
     * <p>
     * Disables DNSSEC signing in a specific hosted zone. This action does not deactivate any key-signing keys (KSKs)
     * that are active in the hosted zone.
     * </p>
     * 
     * @param disableHostedZoneDNSSECRequest
     * @return Result of the DisableHostedZoneDNSSEC operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidArgumentException
     *         Parameter name is not valid.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to create, update, or delete the object at the same time that you did.
     *         Retry the request.
     * @throws KeySigningKeyInParentDSRecordException
     *         The key-signing key (KSK) is specified in a parent DS record.
     * @throws DNSSECNotFoundException
     *         The hosted zone doesn't have any DNSSEC resources.
     * @throws InvalidKeySigningKeyStatusException
     *         The key-signing key (KSK) status isn't valid or another KSK has the status <code>INTERNAL_FAILURE</code>.
     * @throws InvalidKMSArnException
     *         The KeyManagementServiceArn that you specified isn't valid to use with DNSSEC signing.
     * @sample AmazonRoute53.DisableHostedZoneDNSSEC
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DisableHostedZoneDNSSEC"
     *      target="_top">AWS API Documentation</a>
     */
    DisableHostedZoneDNSSECResult disableHostedZoneDNSSEC(DisableHostedZoneDNSSECRequest disableHostedZoneDNSSECRequest);

    /**
     * <p>
     * Disassociates an Amazon Virtual Private Cloud (Amazon VPC) from an Amazon Route 53 private hosted zone. Note the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't disassociate the last Amazon VPC from a private hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't convert a private hosted zone into a public hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can submit a <code>DisassociateVPCFromHostedZone</code> request using either the account that created the
     * hosted zone or the account that created the Amazon VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Some services, such as AWS Cloud Map and Amazon Elastic File System (Amazon EFS) automatically create hosted
     * zones and associate VPCs with the hosted zones. A service can create a hosted zone using your account or using
     * its own account. You can disassociate a VPC from a hosted zone only if the service created the hosted zone using
     * your account.
     * </p>
     * <p>
     * When you run <a href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListHostedZonesByVPC.html">
     * DisassociateVPCFromHostedZone</a>, if the hosted zone has a value for <code>OwningAccount</code>, you can use
     * <code>DisassociateVPCFromHostedZone</code>. If the hosted zone has a value for <code>OwningService</code>, you
     * can't use <code>DisassociateVPCFromHostedZone</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param disassociateVPCFromHostedZoneRequest
     *        A complex type that contains information about the VPC that you want to disassociate from a specified
     *        private hosted zone.
     * @return Result of the DisassociateVPCFromHostedZone operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidVPCIdException
     *         The VPC ID that you specified either isn't a valid ID or the current account is not authorized to access
     *         this VPC.
     * @throws VPCAssociationNotFoundException
     *         The specified VPC and hosted zone are not currently associated.
     * @throws LastVPCAssociationException
     *         The VPC that you're trying to disassociate from the private hosted zone is the last VPC that is
     *         associated with the hosted zone. Amazon Route 53 doesn't support disassociating the last VPC from a
     *         hosted zone.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.DisassociateVPCFromHostedZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DisassociateVPCFromHostedZone"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateVPCFromHostedZoneResult disassociateVPCFromHostedZone(DisassociateVPCFromHostedZoneRequest disassociateVPCFromHostedZoneRequest);

    /**
     * <p>
     * Enables DNSSEC signing in a specific hosted zone.
     * </p>
     * 
     * @param enableHostedZoneDNSSECRequest
     * @return Result of the EnableHostedZoneDNSSEC operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidArgumentException
     *         Parameter name is not valid.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to create, update, or delete the object at the same time that you did.
     *         Retry the request.
     * @throws KeySigningKeyWithActiveStatusNotFoundException
     *         A key-signing key (KSK) with <code>ACTIVE</code> status wasn't found.
     * @throws InvalidKMSArnException
     *         The KeyManagementServiceArn that you specified isn't valid to use with DNSSEC signing.
     * @throws HostedZonePartiallyDelegatedException
     *         The hosted zone nameservers don't match the parent nameservers. The hosted zone and parent must have the
     *         same nameservers.
     * @throws DNSSECNotFoundException
     *         The hosted zone doesn't have any DNSSEC resources.
     * @throws InvalidKeySigningKeyStatusException
     *         The key-signing key (KSK) status isn't valid or another KSK has the status <code>INTERNAL_FAILURE</code>.
     * @sample AmazonRoute53.EnableHostedZoneDNSSEC
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/EnableHostedZoneDNSSEC" target="_top">AWS
     *      API Documentation</a>
     */
    EnableHostedZoneDNSSECResult enableHostedZoneDNSSEC(EnableHostedZoneDNSSECRequest enableHostedZoneDNSSECRequest);

    /**
     * <p>
     * Gets the specified limit for the current account, for example, the maximum number of health checks that you can
     * create using the account.
     * </p>
     * <p>
     * For the default limit, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html">Limits</a> in the <i>Amazon
     * Route 53 Developer Guide</i>. To request a higher limit, <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-route53"
     * >open a case</a>.
     * </p>
     * <note>
     * <p>
     * You can also view account limits in AWS Trusted Advisor. Sign in to the AWS Management Console and open the
     * Trusted Advisor console at <a
     * href="https://console.aws.amazon.com/trustedadvisor">https://console.aws.amazon.com/trustedadvisor/</a>. Then
     * choose <b>Service limits</b> in the navigation pane.
     * </p>
     * </note>
     * 
     * @param getAccountLimitRequest
     *        A complex type that contains information about the request to create a hosted zone.
     * @return Result of the GetAccountLimit operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetAccountLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetAccountLimit" target="_top">AWS API
     *      Documentation</a>
     */
    GetAccountLimitResult getAccountLimit(GetAccountLimitRequest getAccountLimitRequest);

    /**
     * <p>
     * Returns the current status of a change batch request. The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> indicates that the changes in this request have not propagated to all Amazon Route 53 DNS
     * servers. This is the initial status of all change batch requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSYNC</code> indicates that the changes have propagated to all Route 53 DNS servers.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getChangeRequest
     *        The input for a GetChange request.
     * @return Result of the GetChange operation returned by the service.
     * @throws NoSuchChangeException
     *         A change with the specified change ID does not exist.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetChange
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetChange" target="_top">AWS API
     *      Documentation</a>
     */
    GetChangeResult getChange(GetChangeRequest getChangeRequest);

    /**
     * <p>
     * Route 53 does not perform authorization for this API because it retrieves information that is already available
     * to the public.
     * </p>
     * <important>
     * <p>
     * <code>GetCheckerIpRanges</code> still works, but we recommend that you download ip-ranges.json, which includes IP
     * address ranges for all AWS services. For more information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/route-53-ip-addresses.html">IP Address Ranges of
     * Amazon Route 53 Servers</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param getCheckerIpRangesRequest
     *        Empty request.
     * @return Result of the GetCheckerIpRanges operation returned by the service.
     * @sample AmazonRoute53.GetCheckerIpRanges
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetCheckerIpRanges" target="_top">AWS API
     *      Documentation</a>
     */
    GetCheckerIpRangesResult getCheckerIpRanges(GetCheckerIpRangesRequest getCheckerIpRangesRequest);

    /**
     * Simplified method form for invoking the GetCheckerIpRanges operation.
     *
     * @see #getCheckerIpRanges(GetCheckerIpRangesRequest)
     */
    GetCheckerIpRangesResult getCheckerIpRanges();

    /**
     * <p>
     * Returns information about DNSSEC for a specific hosted zone, including the key-signing keys (KSKs) in the hosted
     * zone.
     * </p>
     * 
     * @param getDNSSECRequest
     * @return Result of the GetDNSSEC operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidArgumentException
     *         Parameter name is not valid.
     * @sample AmazonRoute53.GetDNSSEC
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetDNSSEC" target="_top">AWS API
     *      Documentation</a>
     */
    GetDNSSECResult getDNSSEC(GetDNSSECRequest getDNSSECRequest);

    /**
     * <p>
     * Gets information about whether a specified geographic location is supported for Amazon Route 53 geolocation
     * resource record sets.
     * </p>
     * <p>
     * Route 53 does not perform authorization for this API because it retrieves information that is already available
     * to the public.
     * </p>
     * <p>
     * Use the following syntax to determine whether a continent is supported for geolocation:
     * </p>
     * <p>
     * <code>GET /2013-04-01/geolocation?continentcode=<i>two-letter abbreviation for a continent</i> </code>
     * </p>
     * <p>
     * Use the following syntax to determine whether a country is supported for geolocation:
     * </p>
     * <p>
     * <code>GET /2013-04-01/geolocation?countrycode=<i>two-character country code</i> </code>
     * </p>
     * <p>
     * Use the following syntax to determine whether a subdivision of a country is supported for geolocation:
     * </p>
     * <p>
     * <code>GET /2013-04-01/geolocation?countrycode=<i>two-character country code</i>&amp;subdivisioncode=<i>subdivision code</i> </code>
     * </p>
     * 
     * @param getGeoLocationRequest
     *        A request for information about whether a specified geographic location is supported for Amazon Route 53
     *        geolocation resource record sets.
     * @return Result of the GetGeoLocation operation returned by the service.
     * @throws NoSuchGeoLocationException
     *         Amazon Route 53 doesn't support the specified geographic location. For a list of supported geolocation
     *         codes, see the <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GeoLocation.html">GeoLocation</a> data
     *         type.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetGeoLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetGeoLocation" target="_top">AWS API
     *      Documentation</a>
     */
    GetGeoLocationResult getGeoLocation(GetGeoLocationRequest getGeoLocationRequest);

    /**
     * Simplified method form for invoking the GetGeoLocation operation.
     *
     * @see #getGeoLocation(GetGeoLocationRequest)
     */
    GetGeoLocationResult getGeoLocation();

    /**
     * <p>
     * Gets information about a specified health check.
     * </p>
     * 
     * @param getHealthCheckRequest
     *        A request to get information about a specified health check.
     * @return Result of the GetHealthCheck operation returned by the service.
     * @throws NoSuchHealthCheckException
     *         No health check exists with the specified ID.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws IncompatibleVersionException
     *         The resource you're trying to access is unsupported on this Amazon Route 53 endpoint.
     * @sample AmazonRoute53.GetHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHealthCheck" target="_top">AWS API
     *      Documentation</a>
     */
    GetHealthCheckResult getHealthCheck(GetHealthCheckRequest getHealthCheckRequest);

    /**
     * <p>
     * Retrieves the number of health checks that are associated with the current AWS account.
     * </p>
     * 
     * @param getHealthCheckCountRequest
     *        A request for the number of health checks that are associated with the current AWS account.
     * @return Result of the GetHealthCheckCount operation returned by the service.
     * @sample AmazonRoute53.GetHealthCheckCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHealthCheckCount" target="_top">AWS
     *      API Documentation</a>
     */
    GetHealthCheckCountResult getHealthCheckCount(GetHealthCheckCountRequest getHealthCheckCountRequest);

    /**
     * Simplified method form for invoking the GetHealthCheckCount operation.
     *
     * @see #getHealthCheckCount(GetHealthCheckCountRequest)
     */
    GetHealthCheckCountResult getHealthCheckCount();

    /**
     * <p>
     * Gets the reason that a specified health check failed most recently.
     * </p>
     * 
     * @param getHealthCheckLastFailureReasonRequest
     *        A request for the reason that a health check failed most recently.
     * @return Result of the GetHealthCheckLastFailureReason operation returned by the service.
     * @throws NoSuchHealthCheckException
     *         No health check exists with the specified ID.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetHealthCheckLastFailureReason
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHealthCheckLastFailureReason"
     *      target="_top">AWS API Documentation</a>
     */
    GetHealthCheckLastFailureReasonResult getHealthCheckLastFailureReason(GetHealthCheckLastFailureReasonRequest getHealthCheckLastFailureReasonRequest);

    /**
     * <p>
     * Gets status of a specified health check.
     * </p>
     * 
     * @param getHealthCheckStatusRequest
     *        A request to get the status for a health check.
     * @return Result of the GetHealthCheckStatus operation returned by the service.
     * @throws NoSuchHealthCheckException
     *         No health check exists with the specified ID.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetHealthCheckStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHealthCheckStatus" target="_top">AWS
     *      API Documentation</a>
     */
    GetHealthCheckStatusResult getHealthCheckStatus(GetHealthCheckStatusRequest getHealthCheckStatusRequest);

    /**
     * <p>
     * Gets information about a specified hosted zone including the four name servers assigned to the hosted zone.
     * </p>
     * 
     * @param getHostedZoneRequest
     *        A request to get information about a specified hosted zone.
     * @return Result of the GetHostedZone operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetHostedZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHostedZone" target="_top">AWS API
     *      Documentation</a>
     */
    GetHostedZoneResult getHostedZone(GetHostedZoneRequest getHostedZoneRequest);

    /**
     * <p>
     * Retrieves the number of hosted zones that are associated with the current AWS account.
     * </p>
     * 
     * @param getHostedZoneCountRequest
     *        A request to retrieve a count of all the hosted zones that are associated with the current AWS account.
     * @return Result of the GetHostedZoneCount operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetHostedZoneCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHostedZoneCount" target="_top">AWS API
     *      Documentation</a>
     */
    GetHostedZoneCountResult getHostedZoneCount(GetHostedZoneCountRequest getHostedZoneCountRequest);

    /**
     * Simplified method form for invoking the GetHostedZoneCount operation.
     *
     * @see #getHostedZoneCount(GetHostedZoneCountRequest)
     */
    GetHostedZoneCountResult getHostedZoneCount();

    /**
     * <p>
     * Gets the specified limit for a specified hosted zone, for example, the maximum number of records that you can
     * create in the hosted zone.
     * </p>
     * <p>
     * For the default limit, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html">Limits</a> in the <i>Amazon
     * Route 53 Developer Guide</i>. To request a higher limit, <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-route53"
     * >open a case</a>.
     * </p>
     * 
     * @param getHostedZoneLimitRequest
     *        A complex type that contains information about the request to create a hosted zone.
     * @return Result of the GetHostedZoneLimit operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws HostedZoneNotPrivateException
     *         The specified hosted zone is a public hosted zone, not a private hosted zone.
     * @sample AmazonRoute53.GetHostedZoneLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHostedZoneLimit" target="_top">AWS API
     *      Documentation</a>
     */
    GetHostedZoneLimitResult getHostedZoneLimit(GetHostedZoneLimitRequest getHostedZoneLimitRequest);

    /**
     * <p>
     * Gets information about a specified configuration for DNS query logging.
     * </p>
     * <p>
     * For more information about DNS query logs, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateQueryLoggingConfig.html"
     * >CreateQueryLoggingConfig</a> and <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html">Logging DNS Queries</a>.
     * </p>
     * 
     * @param getQueryLoggingConfigRequest
     * @return Result of the GetQueryLoggingConfig operation returned by the service.
     * @throws NoSuchQueryLoggingConfigException
     *         There is no DNS query logging configuration with the specified ID.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetQueryLoggingConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetQueryLoggingConfig" target="_top">AWS
     *      API Documentation</a>
     */
    GetQueryLoggingConfigResult getQueryLoggingConfig(GetQueryLoggingConfigRequest getQueryLoggingConfigRequest);

    /**
     * <p>
     * Retrieves information about a specified reusable delegation set, including the four name servers that are
     * assigned to the delegation set.
     * </p>
     * 
     * @param getReusableDelegationSetRequest
     *        A request to get information about a specified reusable delegation set.
     * @return Result of the GetReusableDelegationSet operation returned by the service.
     * @throws NoSuchDelegationSetException
     *         A reusable delegation set with the specified ID does not exist.
     * @throws DelegationSetNotReusableException
     *         A reusable delegation set with the specified ID does not exist.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetReusableDelegationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetReusableDelegationSet"
     *      target="_top">AWS API Documentation</a>
     */
    GetReusableDelegationSetResult getReusableDelegationSet(GetReusableDelegationSetRequest getReusableDelegationSetRequest);

    /**
     * <p>
     * Gets the maximum number of hosted zones that you can associate with the specified reusable delegation set.
     * </p>
     * <p>
     * For the default limit, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html">Limits</a> in the <i>Amazon
     * Route 53 Developer Guide</i>. To request a higher limit, <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-route53"
     * >open a case</a>.
     * </p>
     * 
     * @param getReusableDelegationSetLimitRequest
     *        A complex type that contains information about the request to create a hosted zone.
     * @return Result of the GetReusableDelegationSetLimit operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchDelegationSetException
     *         A reusable delegation set with the specified ID does not exist.
     * @sample AmazonRoute53.GetReusableDelegationSetLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetReusableDelegationSetLimit"
     *      target="_top">AWS API Documentation</a>
     */
    GetReusableDelegationSetLimitResult getReusableDelegationSetLimit(GetReusableDelegationSetLimitRequest getReusableDelegationSetLimitRequest);

    /**
     * <p>
     * Gets information about a specific traffic policy version.
     * </p>
     * <p>
     * For information about how of deleting a traffic policy affects the response from <code>GetTrafficPolicy</code>,
     * see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicy.html">DeleteTrafficPolicy
     * </a>.
     * </p>
     * 
     * @param getTrafficPolicyRequest
     *        Gets information about a specific traffic policy version.
     * @return Result of the GetTrafficPolicy operation returned by the service.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetTrafficPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    GetTrafficPolicyResult getTrafficPolicy(GetTrafficPolicyRequest getTrafficPolicyRequest);

    /**
     * <p>
     * Gets information about a specified traffic policy instance.
     * </p>
     * <note>
     * <p>
     * After you submit a <code>CreateTrafficPolicyInstance</code> or an <code>UpdateTrafficPolicyInstance</code>
     * request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the
     * traffic policy definition. For more information, see the <code>State</code> response element.
     * </p>
     * </note> <note>
     * <p>
     * In the Route 53 console, traffic policy instances are known as policy records.
     * </p>
     * </note>
     * 
     * @param getTrafficPolicyInstanceRequest
     *        Gets information about a specified traffic policy instance.
     * @return Result of the GetTrafficPolicyInstance operation returned by the service.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetTrafficPolicyInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetTrafficPolicyInstance"
     *      target="_top">AWS API Documentation</a>
     */
    GetTrafficPolicyInstanceResult getTrafficPolicyInstance(GetTrafficPolicyInstanceRequest getTrafficPolicyInstanceRequest);

    /**
     * <p>
     * Gets the number of traffic policy instances that are associated with the current AWS account.
     * </p>
     * 
     * @param getTrafficPolicyInstanceCountRequest
     *        Request to get the number of traffic policy instances that are associated with the current AWS account.
     * @return Result of the GetTrafficPolicyInstanceCount operation returned by the service.
     * @sample AmazonRoute53.GetTrafficPolicyInstanceCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetTrafficPolicyInstanceCount"
     *      target="_top">AWS API Documentation</a>
     */
    GetTrafficPolicyInstanceCountResult getTrafficPolicyInstanceCount(GetTrafficPolicyInstanceCountRequest getTrafficPolicyInstanceCountRequest);

    /**
     * Simplified method form for invoking the GetTrafficPolicyInstanceCount operation.
     *
     * @see #getTrafficPolicyInstanceCount(GetTrafficPolicyInstanceCountRequest)
     */
    GetTrafficPolicyInstanceCountResult getTrafficPolicyInstanceCount();

    /**
     * <p>
     * Retrieves a list of supported geographic locations.
     * </p>
     * <p>
     * Countries are listed first, and continents are listed last. If Amazon Route 53 supports subdivisions for a
     * country (for example, states or provinces), the subdivisions for that country are listed in alphabetical order
     * immediately after the corresponding country.
     * </p>
     * <p>
     * Route 53 does not perform authorization for this API because it retrieves information that is already available
     * to the public.
     * </p>
     * <p>
     * For a list of supported geolocation codes, see the <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GeoLocation.html">GeoLocation</a> data type.
     * </p>
     * 
     * @param listGeoLocationsRequest
     *        A request to get a list of geographic locations that Amazon Route 53 supports for geolocation resource
     *        record sets.
     * @return Result of the ListGeoLocations operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.ListGeoLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListGeoLocations" target="_top">AWS API
     *      Documentation</a>
     */
    ListGeoLocationsResult listGeoLocations(ListGeoLocationsRequest listGeoLocationsRequest);

    /**
     * Simplified method form for invoking the ListGeoLocations operation.
     *
     * @see #listGeoLocations(ListGeoLocationsRequest)
     */
    ListGeoLocationsResult listGeoLocations();

    /**
     * <p>
     * Retrieve a list of the health checks that are associated with the current AWS account.
     * </p>
     * 
     * @param listHealthChecksRequest
     *        A request to retrieve a list of the health checks that are associated with the current AWS account.
     * @return Result of the ListHealthChecks operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws IncompatibleVersionException
     *         The resource you're trying to access is unsupported on this Amazon Route 53 endpoint.
     * @sample AmazonRoute53.ListHealthChecks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListHealthChecks" target="_top">AWS API
     *      Documentation</a>
     */
    ListHealthChecksResult listHealthChecks(ListHealthChecksRequest listHealthChecksRequest);

    /**
     * Simplified method form for invoking the ListHealthChecks operation.
     *
     * @see #listHealthChecks(ListHealthChecksRequest)
     */
    ListHealthChecksResult listHealthChecks();

    /**
     * <p>
     * Retrieves a list of the public and private hosted zones that are associated with the current AWS account. The
     * response includes a <code>HostedZones</code> child element for each hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of hosted zones, you can use
     * the <code>maxitems</code> parameter to list them in groups of up to 100.
     * </p>
     * 
     * @param listHostedZonesRequest
     *        A request to retrieve a list of the public and private hosted zones that are associated with the current
     *        AWS account.
     * @return Result of the ListHostedZones operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchDelegationSetException
     *         A reusable delegation set with the specified ID does not exist.
     * @throws DelegationSetNotReusableException
     *         A reusable delegation set with the specified ID does not exist.
     * @sample AmazonRoute53.ListHostedZones
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListHostedZones" target="_top">AWS API
     *      Documentation</a>
     */
    ListHostedZonesResult listHostedZones(ListHostedZonesRequest listHostedZonesRequest);

    /**
     * Simplified method form for invoking the ListHostedZones operation.
     *
     * @see #listHostedZones(ListHostedZonesRequest)
     */
    ListHostedZonesResult listHostedZones();

    /**
     * <p>
     * Retrieves a list of your hosted zones in lexicographic order. The response includes a <code>HostedZones</code>
     * child element for each hosted zone created by the current AWS account.
     * </p>
     * <p>
     * <code>ListHostedZonesByName</code> sorts hosted zones by name with the labels reversed. For example:
     * </p>
     * <p>
     * <code>com.example.www.</code>
     * </p>
     * <p>
     * Note the trailing dot, which can change the sort order in some circumstances.
     * </p>
     * <p>
     * If the domain name includes escape characters or Punycode, <code>ListHostedZonesByName</code> alphabetizes the
     * domain name using the escaped or Punycoded value, which is the format that Amazon Route 53 saves in its database.
     * For example, to create a hosted zone for ex??mple.com, you specify ex\344mple.com for the domain name.
     * <code>ListHostedZonesByName</code> alphabetizes it as:
     * </p>
     * <p>
     * <code>com.ex\344mple.</code>
     * </p>
     * <p>
     * The labels are reversed and alphabetized using the escaped value. For more information about valid domain name
     * formats, including internationalized domain names, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name Format</a>
     * in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Route 53 returns up to 100 items in each response. If you have a lot of hosted zones, use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100. The response includes values that help
     * navigate from one group of <code>MaxItems</code> hosted zones to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>DNSName</code> and <code>HostedZoneId</code> elements in the response contain the values, if any,
     * specified for the <code>dnsname</code> and <code>hostedzoneid</code> parameters in the request that produced the
     * current response.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>MaxItems</code> element in the response contains the value, if any, that you specified for the
     * <code>maxitems</code> parameter in the request that produced the current response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is true, there are more hosted zones associated with the
     * current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is false, this response includes the last hosted zone that is associated with the
     * current account. The <code>NextDNSName</code> element and <code>NextHostedZoneId</code> elements are omitted from
     * the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in the response contain the domain name
     * and the hosted zone ID of the next hosted zone that is associated with the current AWS account. If you want to
     * list more hosted zones, make another call to <code>ListHostedZonesByName</code>, and specify the value of
     * <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the <code>dnsname</code> and
     * <code>hostedzoneid</code> parameters, respectively.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listHostedZonesByNameRequest
     *        Retrieves a list of the public and private hosted zones that are associated with the current AWS account
     *        in ASCII order by domain name.
     * @return Result of the ListHostedZonesByName operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws InvalidDomainNameException
     *         The specified domain name is not valid.
     * @sample AmazonRoute53.ListHostedZonesByName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListHostedZonesByName" target="_top">AWS
     *      API Documentation</a>
     */
    ListHostedZonesByNameResult listHostedZonesByName(ListHostedZonesByNameRequest listHostedZonesByNameRequest);

    /**
     * Simplified method form for invoking the ListHostedZonesByName operation.
     *
     * @see #listHostedZonesByName(ListHostedZonesByNameRequest)
     */
    ListHostedZonesByNameResult listHostedZonesByName();

    /**
     * <p>
     * Lists all the private hosted zones that a specified VPC is associated with, regardless of which AWS account or
     * AWS service owns the hosted zones. The <code>HostedZoneOwner</code> structure in the response contains one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <code>OwningAccount</code> element, which contains the account number of either the current AWS account or
     * another AWS account. Some services, such as AWS Cloud Map, create hosted zones using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * An <code>OwningService</code> element, which identifies the AWS service that created and owns the hosted zone.
     * For example, if a hosted zone was created by Amazon Elastic File System (Amazon EFS), the value of
     * <code>Owner</code> is <code>efs.amazonaws.com</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listHostedZonesByVPCRequest
     *        Lists all the private hosted zones that a specified VPC is associated with, regardless of which AWS
     *        account created the hosted zones.
     * @return Result of the ListHostedZonesByVPC operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws InvalidPaginationTokenException
     *         The value that you specified to get the second or subsequent page of results is invalid.
     * @sample AmazonRoute53.ListHostedZonesByVPC
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListHostedZonesByVPC" target="_top">AWS
     *      API Documentation</a>
     */
    ListHostedZonesByVPCResult listHostedZonesByVPC(ListHostedZonesByVPCRequest listHostedZonesByVPCRequest);

    /**
     * <p>
     * Lists the configurations for DNS query logging that are associated with the current AWS account or the
     * configuration that is associated with a specified hosted zone.
     * </p>
     * <p>
     * For more information about DNS query logs, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateQueryLoggingConfig.html"
     * >CreateQueryLoggingConfig</a>. Additional information, including the format of DNS query logs, appears in <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html">Logging DNS Queries</a> in the
     * <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param listQueryLoggingConfigsRequest
     * @return Result of the ListQueryLoggingConfigs operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws InvalidPaginationTokenException
     *         The value that you specified to get the second or subsequent page of results is invalid.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @sample AmazonRoute53.ListQueryLoggingConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListQueryLoggingConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    ListQueryLoggingConfigsResult listQueryLoggingConfigs(ListQueryLoggingConfigsRequest listQueryLoggingConfigsRequest);

    /**
     * <p>
     * Lists the resource record sets in a specified hosted zone.
     * </p>
     * <p>
     * <code>ListResourceRecordSets</code> returns up to 300 resource record sets at a time in ASCII order, beginning at
     * a position specified by the <code>name</code> and <code>type</code> elements.
     * </p>
     * <p>
     * <b>Sort order</b>
     * </p>
     * <p>
     * <code>ListResourceRecordSets</code> sorts results first by DNS name with the labels reversed, for example:
     * </p>
     * <p>
     * <code>com.example.www.</code>
     * </p>
     * <p>
     * Note the trailing dot, which can change the sort order when the record name contains characters that appear
     * before <code>.</code> (decimal 46) in the ASCII table. These characters include the following:
     * <code>! " # $ % &amp; ' ( ) * + , -</code>
     * </p>
     * <p>
     * When multiple records have the same DNS name, <code>ListResourceRecordSets</code> sorts results by the record
     * type.
     * </p>
     * <p>
     * <b>Specifying where to start listing records</b>
     * </p>
     * <p>
     * You can use the name and type elements to specify the resource record set that the list begins with:
     * </p>
     * <dl>
     * <dt>If you do not specify Name or Type</dt>
     * <dd>
     * <p>
     * The results begin with the first resource record set that the hosted zone contains.
     * </p>
     * </dd>
     * <dt>If you specify Name but not Type</dt>
     * <dd>
     * <p>
     * The results begin with the first resource record set in the list whose name is greater than or equal to
     * <code>Name</code>.
     * </p>
     * </dd>
     * <dt>If you specify Type but not Name</dt>
     * <dd>
     * <p>
     * Amazon Route 53 returns the <code>InvalidInput</code> error.
     * </p>
     * </dd>
     * <dt>If you specify both Name and Type</dt>
     * <dd>
     * <p>
     * The results begin with the first resource record set in the list whose name is greater than or equal to
     * <code>Name</code>, and whose type is greater than or equal to <code>Type</code>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Resource record sets that are PENDING</b>
     * </p>
     * <p>
     * This action returns the most current version of the records. This includes records that are <code>PENDING</code>,
     * and that are not yet available on all Route 53 DNS servers.
     * </p>
     * <p>
     * <b>Changing resource record sets</b>
     * </p>
     * <p>
     * To ensure that you get an accurate listing of the resource record sets for a hosted zone at a point in time, do
     * not submit a <code>ChangeResourceRecordSets</code> request while you're paging through the results of a
     * <code>ListResourceRecordSets</code> request. If you do, some pages may display results without the latest changes
     * while other pages display results with the latest changes.
     * </p>
     * <p>
     * <b>Displaying the next page of results</b>
     * </p>
     * <p>
     * If a <code>ListResourceRecordSets</code> command returns more than one page of results, the value of
     * <code>IsTruncated</code> is <code>true</code>. To display the next page of results, get the values of
     * <code>NextRecordName</code>, <code>NextRecordType</code>, and <code>NextRecordIdentifier</code> (if any) from the
     * response. Then submit another <code>ListResourceRecordSets</code> request, and specify those values for
     * <code>StartRecordName</code>, <code>StartRecordType</code>, and <code>StartRecordIdentifier</code>.
     * </p>
     * 
     * @param listResourceRecordSetsRequest
     *        A request for the resource record sets that are associated with a specified hosted zone.
     * @return Result of the ListResourceRecordSets operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.ListResourceRecordSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListResourceRecordSets" target="_top">AWS
     *      API Documentation</a>
     */
    ListResourceRecordSetsResult listResourceRecordSets(ListResourceRecordSetsRequest listResourceRecordSetsRequest);

    /**
     * <p>
     * Retrieves a list of the reusable delegation sets that are associated with the current AWS account.
     * </p>
     * 
     * @param listReusableDelegationSetsRequest
     *        A request to get a list of the reusable delegation sets that are associated with the current AWS account.
     * @return Result of the ListReusableDelegationSets operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.ListReusableDelegationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListReusableDelegationSets"
     *      target="_top">AWS API Documentation</a>
     */
    ListReusableDelegationSetsResult listReusableDelegationSets(ListReusableDelegationSetsRequest listReusableDelegationSetsRequest);

    /**
     * Simplified method form for invoking the ListReusableDelegationSets operation.
     *
     * @see #listReusableDelegationSets(ListReusableDelegationSetsRequest)
     */
    ListReusableDelegationSetsResult listReusableDelegationSets();

    /**
     * <p>
     * Lists tags for one health check or hosted zone.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        A complex type containing information about a request for a list of the tags that are associated with an
     *        individual resource.
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchHealthCheckException
     *         No health check exists with the specified ID.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws PriorRequestNotCompleteException
     *         If Amazon Route 53 can't process a request before the next request arrives, it will reject subsequent
     *         requests for the same hosted zone and return an <code>HTTP 400 error</code> (<code>Bad request</code>).
     *         If Route 53 returns this error repeatedly for the same request, we recommend that you wait, in intervals
     *         of increasing duration, before you try the request again.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonRoute53.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists tags for up to 10 health checks or hosted zones.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourcesRequest
     *        A complex type that contains information about the health checks or hosted zones for which you want to
     *        list tags.
     * @return Result of the ListTagsForResources operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchHealthCheckException
     *         No health check exists with the specified ID.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws PriorRequestNotCompleteException
     *         If Amazon Route 53 can't process a request before the next request arrives, it will reject subsequent
     *         requests for the same hosted zone and return an <code>HTTP 400 error</code> (<code>Bad request</code>).
     *         If Route 53 returns this error repeatedly for the same request, we recommend that you wait, in intervals
     *         of increasing duration, before you try the request again.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonRoute53.ListTagsForResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTagsForResources" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourcesResult listTagsForResources(ListTagsForResourcesRequest listTagsForResourcesRequest);

    /**
     * <p>
     * Gets information about the latest version for every traffic policy that is associated with the current AWS
     * account. Policies are listed in the order that they were created in.
     * </p>
     * <p>
     * For information about how of deleting a traffic policy affects the response from <code>ListTrafficPolicies</code>
     * , see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicy.html">DeleteTrafficPolicy
     * </a>.
     * </p>
     * 
     * @param listTrafficPoliciesRequest
     *        A complex type that contains the information about the request to list the traffic policies that are
     *        associated with the current AWS account.
     * @return Result of the ListTrafficPolicies operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.ListTrafficPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTrafficPolicies" target="_top">AWS
     *      API Documentation</a>
     */
    ListTrafficPoliciesResult listTrafficPolicies(ListTrafficPoliciesRequest listTrafficPoliciesRequest);

    /**
     * Simplified method form for invoking the ListTrafficPolicies operation.
     *
     * @see #listTrafficPolicies(ListTrafficPoliciesRequest)
     */
    ListTrafficPoliciesResult listTrafficPolicies();

    /**
     * <p>
     * Gets information about the traffic policy instances that you created by using the current AWS account.
     * </p>
     * <note>
     * <p>
     * After you submit an <code>UpdateTrafficPolicyInstance</code> request, there's a brief delay while Amazon Route 53
     * creates the resource record sets that are specified in the traffic policy definition. For more information, see
     * the <code>State</code> response element.
     * </p>
     * </note>
     * <p>
     * Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can
     * use the <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * 
     * @param listTrafficPolicyInstancesRequest
     *        A request to get information about the traffic policy instances that you created by using the current AWS
     *        account.
     * @return Result of the ListTrafficPolicyInstances operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @sample AmazonRoute53.ListTrafficPolicyInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTrafficPolicyInstances"
     *      target="_top">AWS API Documentation</a>
     */
    ListTrafficPolicyInstancesResult listTrafficPolicyInstances(ListTrafficPolicyInstancesRequest listTrafficPolicyInstancesRequest);

    /**
     * Simplified method form for invoking the ListTrafficPolicyInstances operation.
     *
     * @see #listTrafficPolicyInstances(ListTrafficPolicyInstancesRequest)
     */
    ListTrafficPolicyInstancesResult listTrafficPolicyInstances();

    /**
     * <p>
     * Gets information about the traffic policy instances that you created in a specified hosted zone.
     * </p>
     * <note>
     * <p>
     * After you submit a <code>CreateTrafficPolicyInstance</code> or an <code>UpdateTrafficPolicyInstance</code>
     * request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the
     * traffic policy definition. For more information, see the <code>State</code> response element.
     * </p>
     * </note>
     * <p>
     * Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can
     * use the <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * 
     * @param listTrafficPolicyInstancesByHostedZoneRequest
     *        A request for the traffic policy instances that you created in a specified hosted zone.
     * @return Result of the ListTrafficPolicyInstancesByHostedZone operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @sample AmazonRoute53.ListTrafficPolicyInstancesByHostedZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTrafficPolicyInstancesByHostedZone"
     *      target="_top">AWS API Documentation</a>
     */
    ListTrafficPolicyInstancesByHostedZoneResult listTrafficPolicyInstancesByHostedZone(
            ListTrafficPolicyInstancesByHostedZoneRequest listTrafficPolicyInstancesByHostedZoneRequest);

    /**
     * <p>
     * Gets information about the traffic policy instances that you created by using a specify traffic policy version.
     * </p>
     * <note>
     * <p>
     * After you submit a <code>CreateTrafficPolicyInstance</code> or an <code>UpdateTrafficPolicyInstance</code>
     * request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the
     * traffic policy definition. For more information, see the <code>State</code> response element.
     * </p>
     * </note>
     * <p>
     * Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can
     * use the <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * 
     * @param listTrafficPolicyInstancesByPolicyRequest
     *        A complex type that contains the information about the request to list your traffic policy instances.
     * @return Result of the ListTrafficPolicyInstancesByPolicy operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @sample AmazonRoute53.ListTrafficPolicyInstancesByPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTrafficPolicyInstancesByPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    ListTrafficPolicyInstancesByPolicyResult listTrafficPolicyInstancesByPolicy(
            ListTrafficPolicyInstancesByPolicyRequest listTrafficPolicyInstancesByPolicyRequest);

    /**
     * <p>
     * Gets information about all of the versions for a specified traffic policy.
     * </p>
     * <p>
     * Traffic policy versions are listed in numerical order by <code>VersionNumber</code>.
     * </p>
     * 
     * @param listTrafficPolicyVersionsRequest
     *        A complex type that contains the information about the request to list your traffic policies.
     * @return Result of the ListTrafficPolicyVersions operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @sample AmazonRoute53.ListTrafficPolicyVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTrafficPolicyVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListTrafficPolicyVersionsResult listTrafficPolicyVersions(ListTrafficPolicyVersionsRequest listTrafficPolicyVersionsRequest);

    /**
     * <p>
     * Gets a list of the VPCs that were created by other accounts and that can be associated with a specified hosted
     * zone because you've submitted one or more <code>CreateVPCAssociationAuthorization</code> requests.
     * </p>
     * <p>
     * The response includes a <code>VPCs</code> element with a <code>VPC</code> child element for each VPC that can be
     * associated with the hosted zone.
     * </p>
     * 
     * @param listVPCAssociationAuthorizationsRequest
     *        A complex type that contains information about that can be associated with your hosted zone.
     * @return Result of the ListVPCAssociationAuthorizations operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws InvalidPaginationTokenException
     *         The value that you specified to get the second or subsequent page of results is invalid.
     * @sample AmazonRoute53.ListVPCAssociationAuthorizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListVPCAssociationAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    ListVPCAssociationAuthorizationsResult listVPCAssociationAuthorizations(ListVPCAssociationAuthorizationsRequest listVPCAssociationAuthorizationsRequest);

    /**
     * <p>
     * Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type.
     * You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and a subnet
     * mask.
     * </p>
     * <p>
     * This call only supports querying public hosted zones.
     * </p>
     * 
     * @param testDNSAnswerRequest
     *        Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and
     *        type. You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and
     *        a subnet mask.
     * @return Result of the TestDNSAnswer operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.TestDNSAnswer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/TestDNSAnswer" target="_top">AWS API
     *      Documentation</a>
     */
    TestDNSAnswerResult testDNSAnswer(TestDNSAnswerRequest testDNSAnswerRequest);

    /**
     * <p>
     * Updates an existing health check. Note that some values can't be updated.
     * </p>
     * <p>
     * For more information about updating health checks, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-creating-deleting.html">Creating,
     * Updating, and Deleting Health Checks</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param updateHealthCheckRequest
     *        A complex type that contains information about a request to update a health check.
     * @return Result of the UpdateHealthCheck operation returned by the service.
     * @throws NoSuchHealthCheckException
     *         No health check exists with the specified ID.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws HealthCheckVersionMismatchException
     *         The value of <code>HealthCheckVersion</code> in the request doesn't match the value of
     *         <code>HealthCheckVersion</code> in the health check.
     * @sample AmazonRoute53.UpdateHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/UpdateHealthCheck" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateHealthCheckResult updateHealthCheck(UpdateHealthCheckRequest updateHealthCheckRequest);

    /**
     * <p>
     * Updates the comment for a specified hosted zone.
     * </p>
     * 
     * @param updateHostedZoneCommentRequest
     *        A request to update the comment for a hosted zone.
     * @return Result of the UpdateHostedZoneComment operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.UpdateHostedZoneComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/UpdateHostedZoneComment"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateHostedZoneCommentResult updateHostedZoneComment(UpdateHostedZoneCommentRequest updateHostedZoneCommentRequest);

    /**
     * <p>
     * Updates the comment for a specified traffic policy version.
     * </p>
     * 
     * @param updateTrafficPolicyCommentRequest
     *        A complex type that contains information about the traffic policy that you want to update the comment for.
     * @return Result of the UpdateTrafficPolicyComment operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to create, update, or delete the object at the same time that you did.
     *         Retry the request.
     * @sample AmazonRoute53.UpdateTrafficPolicyComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/UpdateTrafficPolicyComment"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateTrafficPolicyCommentResult updateTrafficPolicyComment(UpdateTrafficPolicyCommentRequest updateTrafficPolicyCommentRequest);

    /**
     * <p>
     * Updates the resource record sets in a specified hosted zone that were created based on the settings in a
     * specified traffic policy version.
     * </p>
     * <p>
     * When you update a traffic policy instance, Amazon Route 53 continues to respond to DNS queries for the root
     * resource record set name (such as example.com) while it replaces one group of resource record sets with another.
     * Route 53 performs the following operations:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Route 53 creates a new group of resource record sets based on the specified traffic policy. This is true
     * regardless of how significant the differences are between the existing resource record sets and the new resource
     * record sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * When all of the new resource record sets have been created, Route 53 starts to respond to DNS queries for the
     * root resource record set name (such as example.com) by using the new resource record sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * Route 53 deletes the old group of resource record sets that are associated with the root resource record set
     * name.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateTrafficPolicyInstanceRequest
     *        A complex type that contains information about the resource record sets that you want to update based on a
     *        specified traffic policy instance.
     * @return Result of the UpdateTrafficPolicyInstance operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws PriorRequestNotCompleteException
     *         If Amazon Route 53 can't process a request before the next request arrives, it will reject subsequent
     *         requests for the same hosted zone and return an <code>HTTP 400 error</code> (<code>Bad request</code>).
     *         If Route 53 returns this error repeatedly for the same request, we recommend that you wait, in intervals
     *         of increasing duration, before you try the request again.
     * @throws ConflictingTypesException
     *         You tried to update a traffic policy instance by using a traffic policy version that has a different DNS
     *         type than the current type for the instance. You specified the type in the JSON document in the
     *         <code>CreateTrafficPolicy</code> or <code>CreateTrafficPolicyVersion</code>request.
     * @sample AmazonRoute53.UpdateTrafficPolicyInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/UpdateTrafficPolicyInstance"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateTrafficPolicyInstanceResult updateTrafficPolicyInstance(UpdateTrafficPolicyInstanceRequest updateTrafficPolicyInstanceRequest);

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

    AmazonRoute53Waiters waiters();

}
