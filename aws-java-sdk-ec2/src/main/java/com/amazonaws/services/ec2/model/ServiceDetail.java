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
 * Describes a VPC endpoint service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ServiceDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * The type of service.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ServiceTypeDetail> serviceType;
    /**
     * <p>
     * The Availability Zones in which the service is available.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * The AWS account ID of the service owner.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The DNS names for the service.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> baseEndpointDnsNames;
    /**
     * <p>
     * The private DNS name for the service.
     * </p>
     */
    private String privateDnsName;
    /**
     * <p>
     * The private DNS names assigned to the VPC endpoint service.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PrivateDnsDetails> privateDnsNames;
    /**
     * <p>
     * Indicates whether the service supports endpoint policies.
     * </p>
     */
    private Boolean vpcEndpointPolicySupported;
    /**
     * <p>
     * Indicates whether VPC endpoint connection requests to the service must be accepted by the service owner.
     * </p>
     */
    private Boolean acceptanceRequired;
    /**
     * <p>
     * Indicates whether the service manages its VPC endpoints. Management of the service VPC endpoints using the VPC
     * endpoint API is restricted.
     * </p>
     */
    private Boolean managesVpcEndpoints;
    /**
     * <p>
     * Any tags assigned to the service.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The verification state of the VPC endpoint service.
     * </p>
     * <p>
     * Consumers of the endpoint service cannot use the private name when the state is not <code>verified</code>.
     * </p>
     */
    private String privateDnsNameVerificationState;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param serviceName
     *        The Amazon Resource Name (ARN) of the service.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param serviceName
     *        The Amazon Resource Name (ARN) of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDetail withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the endpoint service.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     * 
     * @return The ID of the endpoint service.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the endpoint service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDetail withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * <p>
     * The type of service.
     * </p>
     * 
     * @return The type of service.
     */

    public java.util.List<ServiceTypeDetail> getServiceType() {
        if (serviceType == null) {
            serviceType = new com.amazonaws.internal.SdkInternalList<ServiceTypeDetail>();
        }
        return serviceType;
    }

    /**
     * <p>
     * The type of service.
     * </p>
     * 
     * @param serviceType
     *        The type of service.
     */

    public void setServiceType(java.util.Collection<ServiceTypeDetail> serviceType) {
        if (serviceType == null) {
            this.serviceType = null;
            return;
        }

        this.serviceType = new com.amazonaws.internal.SdkInternalList<ServiceTypeDetail>(serviceType);
    }

    /**
     * <p>
     * The type of service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceType(java.util.Collection)} or {@link #withServiceType(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serviceType
     *        The type of service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDetail withServiceType(ServiceTypeDetail... serviceType) {
        if (this.serviceType == null) {
            setServiceType(new com.amazonaws.internal.SdkInternalList<ServiceTypeDetail>(serviceType.length));
        }
        for (ServiceTypeDetail ele : serviceType) {
            this.serviceType.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of service.
     * </p>
     * 
     * @param serviceType
     *        The type of service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDetail withServiceType(java.util.Collection<ServiceTypeDetail> serviceType) {
        setServiceType(serviceType);
        return this;
    }

    /**
     * <p>
     * The Availability Zones in which the service is available.
     * </p>
     * 
     * @return The Availability Zones in which the service is available.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * The Availability Zones in which the service is available.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones in which the service is available.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<String>(availabilityZones);
    }

    /**
     * <p>
     * The Availability Zones in which the service is available.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones in which the service is available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDetail withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Availability Zones in which the service is available.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones in which the service is available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDetail withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the service owner.
     * </p>
     * 
     * @param owner
     *        The AWS account ID of the service owner.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The AWS account ID of the service owner.
     * </p>
     * 
     * @return The AWS account ID of the service owner.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The AWS account ID of the service owner.
     * </p>
     * 
     * @param owner
     *        The AWS account ID of the service owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDetail withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The DNS names for the service.
     * </p>
     * 
     * @return The DNS names for the service.
     */

    public java.util.List<String> getBaseEndpointDnsNames() {
        if (baseEndpointDnsNames == null) {
            baseEndpointDnsNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return baseEndpointDnsNames;
    }

    /**
     * <p>
     * The DNS names for the service.
     * </p>
     * 
     * @param baseEndpointDnsNames
     *        The DNS names for the service.
     */

    public void setBaseEndpointDnsNames(java.util.Collection<String> baseEndpointDnsNames) {
        if (baseEndpointDnsNames == null) {
            this.baseEndpointDnsNames = null;
            return;
        }

        this.baseEndpointDnsNames = new com.amazonaws.internal.SdkInternalList<String>(baseEndpointDnsNames);
    }

    /**
     * <p>
     * The DNS names for the service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBaseEndpointDnsNames(java.util.Collection)} or {@link #withBaseEndpointDnsNames(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param baseEndpointDnsNames
     *        The DNS names for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDetail withBaseEndpointDnsNames(String... baseEndpointDnsNames) {
        if (this.baseEndpointDnsNames == null) {
            setBaseEndpointDnsNames(new com.amazonaws.internal.SdkInternalList<String>(baseEndpointDnsNames.length));
        }
        for (String ele : baseEndpointDnsNames) {
            this.baseEndpointDnsNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The DNS names for the service.
     * </p>
     * 
     * @param baseEndpointDnsNames
     *        The DNS names for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDetail withBaseEndpointDnsNames(java.util.Collection<String> baseEndpointDnsNames) {
        setBaseEndpointDnsNames(baseEndpointDnsNames);
        return this;
    }

    /**
     * <p>
     * The private DNS name for the service.
     * </p>
     * 
     * @param privateDnsName
     *        The private DNS name for the service.
     */

    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    /**
     * <p>
     * The private DNS name for the service.
     * </p>
     * 
     * @return The private DNS name for the service.
     */

    public String getPrivateDnsName() {
        return this.privateDnsName;
    }

    /**
     * <p>
     * The private DNS name for the service.
     * </p>
     * 
     * @param privateDnsName
     *        The private DNS name for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDetail withPrivateDnsName(String privateDnsName) {
        setPrivateDnsName(privateDnsName);
        return this;
    }

    /**
     * <p>
     * The private DNS names assigned to the VPC endpoint service.
     * </p>
     * 
     * @return The private DNS names assigned to the VPC endpoint service.
     */

    public java.util.List<PrivateDnsDetails> getPrivateDnsNames() {
        if (privateDnsNames == null) {
            privateDnsNames = new com.amazonaws.internal.SdkInternalList<PrivateDnsDetails>();
        }
        return privateDnsNames;
    }

    /**
     * <p>
     * The private DNS names assigned to the VPC endpoint service.
     * </p>
     * 
     * @param privateDnsNames
     *        The private DNS names assigned to the VPC endpoint service.
     */

    public void setPrivateDnsNames(java.util.Collection<PrivateDnsDetails> privateDnsNames) {
        if (privateDnsNames == null) {
            this.privateDnsNames = null;
            return;
        }

        this.privateDnsNames = new com.amazonaws.internal.SdkInternalList<PrivateDnsDetails>(privateDnsNames);
    }

    /**
     * <p>
     * The private DNS names assigned to the VPC endpoint service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrivateDnsNames(java.util.Collection)} or {@link #withPrivateDnsNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param privateDnsNames
     *        The private DNS names assigned to the VPC endpoint service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDetail withPrivateDnsNames(PrivateDnsDetails... privateDnsNames) {
        if (this.privateDnsNames == null) {
            setPrivateDnsNames(new com.amazonaws.internal.SdkInternalList<PrivateDnsDetails>(privateDnsNames.length));
        }
        for (PrivateDnsDetails ele : privateDnsNames) {
            this.privateDnsNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The private DNS names assigned to the VPC endpoint service.
     * </p>
     * 
     * @param privateDnsNames
     *        The private DNS names assigned to the VPC endpoint service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDetail withPrivateDnsNames(java.util.Collection<PrivateDnsDetails> privateDnsNames) {
        setPrivateDnsNames(privateDnsNames);
        return this;
    }

    /**
     * <p>
     * Indicates whether the service supports endpoint policies.
     * </p>
     * 
     * @param vpcEndpointPolicySupported
     *        Indicates whether the service supports endpoint policies.
     */

    public void setVpcEndpointPolicySupported(Boolean vpcEndpointPolicySupported) {
        this.vpcEndpointPolicySupported = vpcEndpointPolicySupported;
    }

    /**
     * <p>
     * Indicates whether the service supports endpoint policies.
     * </p>
     * 
     * @return Indicates whether the service supports endpoint policies.
     */

    public Boolean getVpcEndpointPolicySupported() {
        return this.vpcEndpointPolicySupported;
    }

    /**
     * <p>
     * Indicates whether the service supports endpoint policies.
     * </p>
     * 
     * @param vpcEndpointPolicySupported
     *        Indicates whether the service supports endpoint policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDetail withVpcEndpointPolicySupported(Boolean vpcEndpointPolicySupported) {
        setVpcEndpointPolicySupported(vpcEndpointPolicySupported);
        return this;
    }

    /**
     * <p>
     * Indicates whether the service supports endpoint policies.
     * </p>
     * 
     * @return Indicates whether the service supports endpoint policies.
     */

    public Boolean isVpcEndpointPolicySupported() {
        return this.vpcEndpointPolicySupported;
    }

    /**
     * <p>
     * Indicates whether VPC endpoint connection requests to the service must be accepted by the service owner.
     * </p>
     * 
     * @param acceptanceRequired
     *        Indicates whether VPC endpoint connection requests to the service must be accepted by the service owner.
     */

    public void setAcceptanceRequired(Boolean acceptanceRequired) {
        this.acceptanceRequired = acceptanceRequired;
    }

    /**
     * <p>
     * Indicates whether VPC endpoint connection requests to the service must be accepted by the service owner.
     * </p>
     * 
     * @return Indicates whether VPC endpoint connection requests to the service must be accepted by the service owner.
     */

    public Boolean getAcceptanceRequired() {
        return this.acceptanceRequired;
    }

    /**
     * <p>
     * Indicates whether VPC endpoint connection requests to the service must be accepted by the service owner.
     * </p>
     * 
     * @param acceptanceRequired
     *        Indicates whether VPC endpoint connection requests to the service must be accepted by the service owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDetail withAcceptanceRequired(Boolean acceptanceRequired) {
        setAcceptanceRequired(acceptanceRequired);
        return this;
    }

    /**
     * <p>
     * Indicates whether VPC endpoint connection requests to the service must be accepted by the service owner.
     * </p>
     * 
     * @return Indicates whether VPC endpoint connection requests to the service must be accepted by the service owner.
     */

    public Boolean isAcceptanceRequired() {
        return this.acceptanceRequired;
    }

    /**
     * <p>
     * Indicates whether the service manages its VPC endpoints. Management of the service VPC endpoints using the VPC
     * endpoint API is restricted.
     * </p>
     * 
     * @param managesVpcEndpoints
     *        Indicates whether the service manages its VPC endpoints. Management of the service VPC endpoints using the
     *        VPC endpoint API is restricted.
     */

    public void setManagesVpcEndpoints(Boolean managesVpcEndpoints) {
        this.managesVpcEndpoints = managesVpcEndpoints;
    }

    /**
     * <p>
     * Indicates whether the service manages its VPC endpoints. Management of the service VPC endpoints using the VPC
     * endpoint API is restricted.
     * </p>
     * 
     * @return Indicates whether the service manages its VPC endpoints. Management of the service VPC endpoints using
     *         the VPC endpoint API is restricted.
     */

    public Boolean getManagesVpcEndpoints() {
        return this.managesVpcEndpoints;
    }

    /**
     * <p>
     * Indicates whether the service manages its VPC endpoints. Management of the service VPC endpoints using the VPC
     * endpoint API is restricted.
     * </p>
     * 
     * @param managesVpcEndpoints
     *        Indicates whether the service manages its VPC endpoints. Management of the service VPC endpoints using the
     *        VPC endpoint API is restricted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDetail withManagesVpcEndpoints(Boolean managesVpcEndpoints) {
        setManagesVpcEndpoints(managesVpcEndpoints);
        return this;
    }

    /**
     * <p>
     * Indicates whether the service manages its VPC endpoints. Management of the service VPC endpoints using the VPC
     * endpoint API is restricted.
     * </p>
     * 
     * @return Indicates whether the service manages its VPC endpoints. Management of the service VPC endpoints using
     *         the VPC endpoint API is restricted.
     */

    public Boolean isManagesVpcEndpoints() {
        return this.managesVpcEndpoints;
    }

    /**
     * <p>
     * Any tags assigned to the service.
     * </p>
     * 
     * @return Any tags assigned to the service.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the service.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the service.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDetail withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the service.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDetail withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The verification state of the VPC endpoint service.
     * </p>
     * <p>
     * Consumers of the endpoint service cannot use the private name when the state is not <code>verified</code>.
     * </p>
     * 
     * @param privateDnsNameVerificationState
     *        The verification state of the VPC endpoint service.</p>
     *        <p>
     *        Consumers of the endpoint service cannot use the private name when the state is not <code>verified</code>.
     * @see DnsNameState
     */

    public void setPrivateDnsNameVerificationState(String privateDnsNameVerificationState) {
        this.privateDnsNameVerificationState = privateDnsNameVerificationState;
    }

    /**
     * <p>
     * The verification state of the VPC endpoint service.
     * </p>
     * <p>
     * Consumers of the endpoint service cannot use the private name when the state is not <code>verified</code>.
     * </p>
     * 
     * @return The verification state of the VPC endpoint service.</p>
     *         <p>
     *         Consumers of the endpoint service cannot use the private name when the state is not <code>verified</code>.
     * @see DnsNameState
     */

    public String getPrivateDnsNameVerificationState() {
        return this.privateDnsNameVerificationState;
    }

    /**
     * <p>
     * The verification state of the VPC endpoint service.
     * </p>
     * <p>
     * Consumers of the endpoint service cannot use the private name when the state is not <code>verified</code>.
     * </p>
     * 
     * @param privateDnsNameVerificationState
     *        The verification state of the VPC endpoint service.</p>
     *        <p>
     *        Consumers of the endpoint service cannot use the private name when the state is not <code>verified</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsNameState
     */

    public ServiceDetail withPrivateDnsNameVerificationState(String privateDnsNameVerificationState) {
        setPrivateDnsNameVerificationState(privateDnsNameVerificationState);
        return this;
    }

    /**
     * <p>
     * The verification state of the VPC endpoint service.
     * </p>
     * <p>
     * Consumers of the endpoint service cannot use the private name when the state is not <code>verified</code>.
     * </p>
     * 
     * @param privateDnsNameVerificationState
     *        The verification state of the VPC endpoint service.</p>
     *        <p>
     *        Consumers of the endpoint service cannot use the private name when the state is not <code>verified</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DnsNameState
     */

    public ServiceDetail withPrivateDnsNameVerificationState(DnsNameState privateDnsNameVerificationState) {
        this.privateDnsNameVerificationState = privateDnsNameVerificationState.toString();
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
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
        if (getServiceType() != null)
            sb.append("ServiceType: ").append(getServiceType()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getBaseEndpointDnsNames() != null)
            sb.append("BaseEndpointDnsNames: ").append(getBaseEndpointDnsNames()).append(",");
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: ").append(getPrivateDnsName()).append(",");
        if (getPrivateDnsNames() != null)
            sb.append("PrivateDnsNames: ").append(getPrivateDnsNames()).append(",");
        if (getVpcEndpointPolicySupported() != null)
            sb.append("VpcEndpointPolicySupported: ").append(getVpcEndpointPolicySupported()).append(",");
        if (getAcceptanceRequired() != null)
            sb.append("AcceptanceRequired: ").append(getAcceptanceRequired()).append(",");
        if (getManagesVpcEndpoints() != null)
            sb.append("ManagesVpcEndpoints: ").append(getManagesVpcEndpoints()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getPrivateDnsNameVerificationState() != null)
            sb.append("PrivateDnsNameVerificationState: ").append(getPrivateDnsNameVerificationState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceDetail == false)
            return false;
        ServiceDetail other = (ServiceDetail) obj;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getBaseEndpointDnsNames() == null ^ this.getBaseEndpointDnsNames() == null)
            return false;
        if (other.getBaseEndpointDnsNames() != null && other.getBaseEndpointDnsNames().equals(this.getBaseEndpointDnsNames()) == false)
            return false;
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null)
            return false;
        if (other.getPrivateDnsName() != null && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false)
            return false;
        if (other.getPrivateDnsNames() == null ^ this.getPrivateDnsNames() == null)
            return false;
        if (other.getPrivateDnsNames() != null && other.getPrivateDnsNames().equals(this.getPrivateDnsNames()) == false)
            return false;
        if (other.getVpcEndpointPolicySupported() == null ^ this.getVpcEndpointPolicySupported() == null)
            return false;
        if (other.getVpcEndpointPolicySupported() != null && other.getVpcEndpointPolicySupported().equals(this.getVpcEndpointPolicySupported()) == false)
            return false;
        if (other.getAcceptanceRequired() == null ^ this.getAcceptanceRequired() == null)
            return false;
        if (other.getAcceptanceRequired() != null && other.getAcceptanceRequired().equals(this.getAcceptanceRequired()) == false)
            return false;
        if (other.getManagesVpcEndpoints() == null ^ this.getManagesVpcEndpoints() == null)
            return false;
        if (other.getManagesVpcEndpoints() != null && other.getManagesVpcEndpoints().equals(this.getManagesVpcEndpoints()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPrivateDnsNameVerificationState() == null ^ this.getPrivateDnsNameVerificationState() == null)
            return false;
        if (other.getPrivateDnsNameVerificationState() != null
                && other.getPrivateDnsNameVerificationState().equals(this.getPrivateDnsNameVerificationState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getBaseEndpointDnsNames() == null) ? 0 : getBaseEndpointDnsNames().hashCode());
        hashCode = prime * hashCode + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode());
        hashCode = prime * hashCode + ((getPrivateDnsNames() == null) ? 0 : getPrivateDnsNames().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointPolicySupported() == null) ? 0 : getVpcEndpointPolicySupported().hashCode());
        hashCode = prime * hashCode + ((getAcceptanceRequired() == null) ? 0 : getAcceptanceRequired().hashCode());
        hashCode = prime * hashCode + ((getManagesVpcEndpoints() == null) ? 0 : getManagesVpcEndpoints().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getPrivateDnsNameVerificationState() == null) ? 0 : getPrivateDnsNameVerificationState().hashCode());
        return hashCode;
    }

    @Override
    public ServiceDetail clone() {
        try {
            return (ServiceDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
