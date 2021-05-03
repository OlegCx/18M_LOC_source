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
package com.amazonaws.services.lightsail.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum OperationType {

    DeleteKnownHostKeys("DeleteKnownHostKeys"),
    DeleteInstance("DeleteInstance"),
    CreateInstance("CreateInstance"),
    StopInstance("StopInstance"),
    StartInstance("StartInstance"),
    RebootInstance("RebootInstance"),
    OpenInstancePublicPorts("OpenInstancePublicPorts"),
    PutInstancePublicPorts("PutInstancePublicPorts"),
    CloseInstancePublicPorts("CloseInstancePublicPorts"),
    AllocateStaticIp("AllocateStaticIp"),
    ReleaseStaticIp("ReleaseStaticIp"),
    AttachStaticIp("AttachStaticIp"),
    DetachStaticIp("DetachStaticIp"),
    UpdateDomainEntry("UpdateDomainEntry"),
    DeleteDomainEntry("DeleteDomainEntry"),
    CreateDomain("CreateDomain"),
    DeleteDomain("DeleteDomain"),
    CreateInstanceSnapshot("CreateInstanceSnapshot"),
    DeleteInstanceSnapshot("DeleteInstanceSnapshot"),
    CreateInstancesFromSnapshot("CreateInstancesFromSnapshot"),
    CreateLoadBalancer("CreateLoadBalancer"),
    DeleteLoadBalancer("DeleteLoadBalancer"),
    AttachInstancesToLoadBalancer("AttachInstancesToLoadBalancer"),
    DetachInstancesFromLoadBalancer("DetachInstancesFromLoadBalancer"),
    UpdateLoadBalancerAttribute("UpdateLoadBalancerAttribute"),
    CreateLoadBalancerTlsCertificate("CreateLoadBalancerTlsCertificate"),
    DeleteLoadBalancerTlsCertificate("DeleteLoadBalancerTlsCertificate"),
    AttachLoadBalancerTlsCertificate("AttachLoadBalancerTlsCertificate"),
    CreateDisk("CreateDisk"),
    DeleteDisk("DeleteDisk"),
    AttachDisk("AttachDisk"),
    DetachDisk("DetachDisk"),
    CreateDiskSnapshot("CreateDiskSnapshot"),
    DeleteDiskSnapshot("DeleteDiskSnapshot"),
    CreateDiskFromSnapshot("CreateDiskFromSnapshot"),
    CreateRelationalDatabase("CreateRelationalDatabase"),
    UpdateRelationalDatabase("UpdateRelationalDatabase"),
    DeleteRelationalDatabase("DeleteRelationalDatabase"),
    CreateRelationalDatabaseFromSnapshot("CreateRelationalDatabaseFromSnapshot"),
    CreateRelationalDatabaseSnapshot("CreateRelationalDatabaseSnapshot"),
    DeleteRelationalDatabaseSnapshot("DeleteRelationalDatabaseSnapshot"),
    UpdateRelationalDatabaseParameters("UpdateRelationalDatabaseParameters"),
    StartRelationalDatabase("StartRelationalDatabase"),
    RebootRelationalDatabase("RebootRelationalDatabase"),
    StopRelationalDatabase("StopRelationalDatabase"),
    EnableAddOn("EnableAddOn"),
    DisableAddOn("DisableAddOn"),
    PutAlarm("PutAlarm"),
    GetAlarms("GetAlarms"),
    DeleteAlarm("DeleteAlarm"),
    TestAlarm("TestAlarm"),
    CreateContactMethod("CreateContactMethod"),
    GetContactMethods("GetContactMethods"),
    SendContactMethodVerification("SendContactMethodVerification"),
    DeleteContactMethod("DeleteContactMethod"),
    CreateDistribution("CreateDistribution"),
    UpdateDistribution("UpdateDistribution"),
    DeleteDistribution("DeleteDistribution"),
    ResetDistributionCache("ResetDistributionCache"),
    AttachCertificateToDistribution("AttachCertificateToDistribution"),
    DetachCertificateFromDistribution("DetachCertificateFromDistribution"),
    UpdateDistributionBundle("UpdateDistributionBundle"),
    SetIpAddressType("SetIpAddressType"),
    CreateCertificate("CreateCertificate"),
    DeleteCertificate("DeleteCertificate"),
    CreateContainerService("CreateContainerService"),
    UpdateContainerService("UpdateContainerService"),
    DeleteContainerService("DeleteContainerService"),
    CreateContainerServiceDeployment("CreateContainerServiceDeployment"),
    CreateContainerServiceRegistryLogin("CreateContainerServiceRegistryLogin"),
    RegisterContainerImage("RegisterContainerImage"),
    DeleteContainerImage("DeleteContainerImage");

    private String value;

    private OperationType(String value) {
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
     * @return OperationType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static OperationType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (OperationType enumEntry : OperationType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
