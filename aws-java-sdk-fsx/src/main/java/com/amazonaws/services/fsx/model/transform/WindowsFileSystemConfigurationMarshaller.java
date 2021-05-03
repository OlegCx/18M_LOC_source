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
package com.amazonaws.services.fsx.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fsx.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WindowsFileSystemConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WindowsFileSystemConfigurationMarshaller {

    private static final MarshallingInfo<String> ACTIVEDIRECTORYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActiveDirectoryId").build();
    private static final MarshallingInfo<StructuredPojo> SELFMANAGEDACTIVEDIRECTORYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelfManagedActiveDirectoryConfiguration").build();
    private static final MarshallingInfo<String> DEPLOYMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentType").build();
    private static final MarshallingInfo<String> REMOTEADMINISTRATIONENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RemoteAdministrationEndpoint").build();
    private static final MarshallingInfo<String> PREFERREDSUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreferredSubnetId").build();
    private static final MarshallingInfo<String> PREFERREDFILESERVERIP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreferredFileServerIp").build();
    private static final MarshallingInfo<Integer> THROUGHPUTCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThroughputCapacity").build();
    private static final MarshallingInfo<List> MAINTENANCEOPERATIONSINPROGRESS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaintenanceOperationsInProgress").build();
    private static final MarshallingInfo<String> WEEKLYMAINTENANCESTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WeeklyMaintenanceStartTime").build();
    private static final MarshallingInfo<String> DAILYAUTOMATICBACKUPSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DailyAutomaticBackupStartTime").build();
    private static final MarshallingInfo<Integer> AUTOMATICBACKUPRETENTIONDAYS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutomaticBackupRetentionDays").build();
    private static final MarshallingInfo<Boolean> COPYTAGSTOBACKUPS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CopyTagsToBackups").build();
    private static final MarshallingInfo<List> ALIASES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Aliases").build();

    private static final WindowsFileSystemConfigurationMarshaller instance = new WindowsFileSystemConfigurationMarshaller();

    public static WindowsFileSystemConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WindowsFileSystemConfiguration windowsFileSystemConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (windowsFileSystemConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(windowsFileSystemConfiguration.getActiveDirectoryId(), ACTIVEDIRECTORYID_BINDING);
            protocolMarshaller.marshall(windowsFileSystemConfiguration.getSelfManagedActiveDirectoryConfiguration(),
                    SELFMANAGEDACTIVEDIRECTORYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(windowsFileSystemConfiguration.getDeploymentType(), DEPLOYMENTTYPE_BINDING);
            protocolMarshaller.marshall(windowsFileSystemConfiguration.getRemoteAdministrationEndpoint(), REMOTEADMINISTRATIONENDPOINT_BINDING);
            protocolMarshaller.marshall(windowsFileSystemConfiguration.getPreferredSubnetId(), PREFERREDSUBNETID_BINDING);
            protocolMarshaller.marshall(windowsFileSystemConfiguration.getPreferredFileServerIp(), PREFERREDFILESERVERIP_BINDING);
            protocolMarshaller.marshall(windowsFileSystemConfiguration.getThroughputCapacity(), THROUGHPUTCAPACITY_BINDING);
            protocolMarshaller.marshall(windowsFileSystemConfiguration.getMaintenanceOperationsInProgress(), MAINTENANCEOPERATIONSINPROGRESS_BINDING);
            protocolMarshaller.marshall(windowsFileSystemConfiguration.getWeeklyMaintenanceStartTime(), WEEKLYMAINTENANCESTARTTIME_BINDING);
            protocolMarshaller.marshall(windowsFileSystemConfiguration.getDailyAutomaticBackupStartTime(), DAILYAUTOMATICBACKUPSTARTTIME_BINDING);
            protocolMarshaller.marshall(windowsFileSystemConfiguration.getAutomaticBackupRetentionDays(), AUTOMATICBACKUPRETENTIONDAYS_BINDING);
            protocolMarshaller.marshall(windowsFileSystemConfiguration.getCopyTagsToBackups(), COPYTAGSTOBACKUPS_BINDING);
            protocolMarshaller.marshall(windowsFileSystemConfiguration.getAliases(), ALIASES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
