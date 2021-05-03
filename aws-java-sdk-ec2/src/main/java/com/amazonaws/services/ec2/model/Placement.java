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

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the placement of an instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Placement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Placement implements Serializable, Cloneable {

    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     * <p>
     * If not specified, an Availability Zone will be automatically chosen for you based on the load balancing criteria
     * for the Region.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The affinity setting for the instance on the Dedicated Host. This parameter is not supported for the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a> command.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     */
    private String affinity;
    /**
     * <p>
     * The name of the placement group the instance is in.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The number of the partition the instance is in. Valid only if the placement group strategy is set to
     * <code>partition</code>.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     */
    private Integer partitionNumber;
    /**
     * <p>
     * The ID of the Dedicated Host on which the instance resides. This parameter is not supported for the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a> command.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     */
    private String hostId;
    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a> command.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     */
    private String tenancy;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     */
    private String spreadDomain;
    /**
     * <p>
     * The ARN of the host resource group in which to launch the instances. If you specify a host resource group ARN,
     * omit the <b>Tenancy</b> parameter or set it to <code>host</code>.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     */
    private String hostResourceGroupArn;

    /**
     * Default constructor for Placement object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public Placement() {
    }

    /**
     * Constructs a new Placement object. Callers should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param availabilityZone
     *        The Availability Zone of the instance.</p>
     *        <p>
     *        If not specified, an Availability Zone will be automatically chosen for you based on the load balancing
     *        criteria for the Region.
     *        </p>
     *        <p>
     *        This parameter is not supported by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     */
    public Placement(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
    }

    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     * <p>
     * If not specified, an Availability Zone will be automatically chosen for you based on the load balancing criteria
     * for the Region.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the instance.</p>
     *        <p>
     *        If not specified, an Availability Zone will be automatically chosen for you based on the load balancing
     *        criteria for the Region.
     *        </p>
     *        <p>
     *        This parameter is not supported by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     * <p>
     * If not specified, an Availability Zone will be automatically chosen for you based on the load balancing criteria
     * for the Region.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @return The Availability Zone of the instance.</p>
     *         <p>
     *         If not specified, an Availability Zone will be automatically chosen for you based on the load balancing
     *         criteria for the Region.
     *         </p>
     *         <p>
     *         This parameter is not supported by <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     * <p>
     * If not specified, an Availability Zone will be automatically chosen for you based on the load balancing criteria
     * for the Region.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the instance.</p>
     *        <p>
     *        If not specified, an Availability Zone will be automatically chosen for you based on the load balancing
     *        criteria for the Region.
     *        </p>
     *        <p>
     *        This parameter is not supported by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Placement withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The affinity setting for the instance on the Dedicated Host. This parameter is not supported for the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a> command.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @param affinity
     *        The affinity setting for the instance on the Dedicated Host. This parameter is not supported for the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a>
     *        command.</p>
     *        <p>
     *        This parameter is not supported by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     */

    public void setAffinity(String affinity) {
        this.affinity = affinity;
    }

    /**
     * <p>
     * The affinity setting for the instance on the Dedicated Host. This parameter is not supported for the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a> command.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @return The affinity setting for the instance on the Dedicated Host. This parameter is not supported for the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a>
     *         command.</p>
     *         <p>
     *         This parameter is not supported by <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     */

    public String getAffinity() {
        return this.affinity;
    }

    /**
     * <p>
     * The affinity setting for the instance on the Dedicated Host. This parameter is not supported for the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a> command.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @param affinity
     *        The affinity setting for the instance on the Dedicated Host. This parameter is not supported for the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a>
     *        command.</p>
     *        <p>
     *        This parameter is not supported by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Placement withAffinity(String affinity) {
        setAffinity(affinity);
        return this;
    }

    /**
     * <p>
     * The name of the placement group the instance is in.
     * </p>
     * 
     * @param groupName
     *        The name of the placement group the instance is in.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the placement group the instance is in.
     * </p>
     * 
     * @return The name of the placement group the instance is in.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the placement group the instance is in.
     * </p>
     * 
     * @param groupName
     *        The name of the placement group the instance is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Placement withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The number of the partition the instance is in. Valid only if the placement group strategy is set to
     * <code>partition</code>.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @param partitionNumber
     *        The number of the partition the instance is in. Valid only if the placement group strategy is set to
     *        <code>partition</code>.</p>
     *        <p>
     *        This parameter is not supported by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     */

    public void setPartitionNumber(Integer partitionNumber) {
        this.partitionNumber = partitionNumber;
    }

    /**
     * <p>
     * The number of the partition the instance is in. Valid only if the placement group strategy is set to
     * <code>partition</code>.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @return The number of the partition the instance is in. Valid only if the placement group strategy is set to
     *         <code>partition</code>.</p>
     *         <p>
     *         This parameter is not supported by <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     */

    public Integer getPartitionNumber() {
        return this.partitionNumber;
    }

    /**
     * <p>
     * The number of the partition the instance is in. Valid only if the placement group strategy is set to
     * <code>partition</code>.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @param partitionNumber
     *        The number of the partition the instance is in. Valid only if the placement group strategy is set to
     *        <code>partition</code>.</p>
     *        <p>
     *        This parameter is not supported by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Placement withPartitionNumber(Integer partitionNumber) {
        setPartitionNumber(partitionNumber);
        return this;
    }

    /**
     * <p>
     * The ID of the Dedicated Host on which the instance resides. This parameter is not supported for the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a> command.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @param hostId
     *        The ID of the Dedicated Host on which the instance resides. This parameter is not supported for the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a>
     *        command.</p>
     *        <p>
     *        This parameter is not supported by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     */

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    /**
     * <p>
     * The ID of the Dedicated Host on which the instance resides. This parameter is not supported for the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a> command.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @return The ID of the Dedicated Host on which the instance resides. This parameter is not supported for the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a>
     *         command.</p>
     *         <p>
     *         This parameter is not supported by <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     */

    public String getHostId() {
        return this.hostId;
    }

    /**
     * <p>
     * The ID of the Dedicated Host on which the instance resides. This parameter is not supported for the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a> command.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @param hostId
     *        The ID of the Dedicated Host on which the instance resides. This parameter is not supported for the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a>
     *        command.</p>
     *        <p>
     *        This parameter is not supported by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Placement withHostId(String hostId) {
        setHostId(hostId);
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a> command.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     *        <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for
     *        the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a>
     *        command.</p>
     *        <p>
     *        This parameter is not supported by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * @see Tenancy
     */

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a> command.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @return The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     *         <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for
     *         the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a>
     *         command.</p>
     *         <p>
     *         This parameter is not supported by <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * @see Tenancy
     */

    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a> command.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     *        <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for
     *        the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a>
     *        command.</p>
     *        <p>
     *        This parameter is not supported by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tenancy
     */

    public Placement withTenancy(String tenancy) {
        setTenancy(tenancy);
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a> command.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     *        <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for
     *        the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a>
     *        command.</p>
     *        <p>
     *        This parameter is not supported by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * @see Tenancy
     */

    public void setTenancy(Tenancy tenancy) {
        withTenancy(tenancy);
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a> command.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of
     *        <code>dedicated</code> runs on single-tenant hardware. The <code>host</code> tenancy is not supported for
     *        the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html">ImportInstance</a>
     *        command.</p>
     *        <p>
     *        This parameter is not supported by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tenancy
     */

    public Placement withTenancy(Tenancy tenancy) {
        this.tenancy = tenancy.toString();
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @param spreadDomain
     *        Reserved for future use.</p>
     *        <p>
     *        This parameter is not supported by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     */

    public void setSpreadDomain(String spreadDomain) {
        this.spreadDomain = spreadDomain;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @return Reserved for future use.</p>
     *         <p>
     *         This parameter is not supported by <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     */

    public String getSpreadDomain() {
        return this.spreadDomain;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @param spreadDomain
     *        Reserved for future use.</p>
     *        <p>
     *        This parameter is not supported by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Placement withSpreadDomain(String spreadDomain) {
        setSpreadDomain(spreadDomain);
        return this;
    }

    /**
     * <p>
     * The ARN of the host resource group in which to launch the instances. If you specify a host resource group ARN,
     * omit the <b>Tenancy</b> parameter or set it to <code>host</code>.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @param hostResourceGroupArn
     *        The ARN of the host resource group in which to launch the instances. If you specify a host resource group
     *        ARN, omit the <b>Tenancy</b> parameter or set it to <code>host</code>.</p>
     *        <p>
     *        This parameter is not supported by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     */

    public void setHostResourceGroupArn(String hostResourceGroupArn) {
        this.hostResourceGroupArn = hostResourceGroupArn;
    }

    /**
     * <p>
     * The ARN of the host resource group in which to launch the instances. If you specify a host resource group ARN,
     * omit the <b>Tenancy</b> parameter or set it to <code>host</code>.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @return The ARN of the host resource group in which to launch the instances. If you specify a host resource group
     *         ARN, omit the <b>Tenancy</b> parameter or set it to <code>host</code>.</p>
     *         <p>
     *         This parameter is not supported by <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     */

    public String getHostResourceGroupArn() {
        return this.hostResourceGroupArn;
    }

    /**
     * <p>
     * The ARN of the host resource group in which to launch the instances. If you specify a host resource group ARN,
     * omit the <b>Tenancy</b> parameter or set it to <code>host</code>.
     * </p>
     * <p>
     * This parameter is not supported by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * </p>
     * 
     * @param hostResourceGroupArn
     *        The ARN of the host resource group in which to launch the instances. If you specify a host resource group
     *        ARN, omit the <b>Tenancy</b> parameter or set it to <code>host</code>.</p>
     *        <p>
     *        This parameter is not supported by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet">CreateFleet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Placement withHostResourceGroupArn(String hostResourceGroupArn) {
        setHostResourceGroupArn(hostResourceGroupArn);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getAffinity() != null)
            sb.append("Affinity: ").append(getAffinity()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getPartitionNumber() != null)
            sb.append("PartitionNumber: ").append(getPartitionNumber()).append(",");
        if (getHostId() != null)
            sb.append("HostId: ").append(getHostId()).append(",");
        if (getTenancy() != null)
            sb.append("Tenancy: ").append(getTenancy()).append(",");
        if (getSpreadDomain() != null)
            sb.append("SpreadDomain: ").append(getSpreadDomain()).append(",");
        if (getHostResourceGroupArn() != null)
            sb.append("HostResourceGroupArn: ").append(getHostResourceGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Placement == false)
            return false;
        Placement other = (Placement) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAffinity() == null ^ this.getAffinity() == null)
            return false;
        if (other.getAffinity() != null && other.getAffinity().equals(this.getAffinity()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getPartitionNumber() == null ^ this.getPartitionNumber() == null)
            return false;
        if (other.getPartitionNumber() != null && other.getPartitionNumber().equals(this.getPartitionNumber()) == false)
            return false;
        if (other.getHostId() == null ^ this.getHostId() == null)
            return false;
        if (other.getHostId() != null && other.getHostId().equals(this.getHostId()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        if (other.getSpreadDomain() == null ^ this.getSpreadDomain() == null)
            return false;
        if (other.getSpreadDomain() != null && other.getSpreadDomain().equals(this.getSpreadDomain()) == false)
            return false;
        if (other.getHostResourceGroupArn() == null ^ this.getHostResourceGroupArn() == null)
            return false;
        if (other.getHostResourceGroupArn() != null && other.getHostResourceGroupArn().equals(this.getHostResourceGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getAffinity() == null) ? 0 : getAffinity().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getPartitionNumber() == null) ? 0 : getPartitionNumber().hashCode());
        hashCode = prime * hashCode + ((getHostId() == null) ? 0 : getHostId().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        hashCode = prime * hashCode + ((getSpreadDomain() == null) ? 0 : getSpreadDomain().hashCode());
        hashCode = prime * hashCode + ((getHostResourceGroupArn() == null) ? 0 : getHostResourceGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public Placement clone() {
        try {
            return (Placement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
