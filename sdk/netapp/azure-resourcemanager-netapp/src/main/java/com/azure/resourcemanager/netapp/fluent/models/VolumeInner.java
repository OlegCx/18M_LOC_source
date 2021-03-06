// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.models.MountTargetProperties;
import com.azure.resourcemanager.netapp.models.SecurityStyle;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import com.azure.resourcemanager.netapp.models.VolumePropertiesDataProtection;
import com.azure.resourcemanager.netapp.models.VolumePropertiesExportPolicy;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Volume resource. */
@JsonFlatten
@Fluent
public class VolumeInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VolumeInner.class);

    /*
     * Unique FileSystem Identifier.
     */
    @JsonProperty(value = "properties.fileSystemId", access = JsonProperty.Access.WRITE_ONLY)
    private String fileSystemId;

    /*
     * A unique file path for the volume. Used when creating mount targets
     */
    @JsonProperty(value = "properties.creationToken", required = true)
    private String creationToken;

    /*
     * The service level of the file system
     */
    @JsonProperty(value = "properties.serviceLevel")
    private ServiceLevel serviceLevel;

    /*
     * Maximum storage quota allowed for a file system in bytes. This is a soft
     * quota used for alerting only. Minimum size is 100 GiB. Upper limit is
     * 100TiB. Specified in bytes.
     */
    @JsonProperty(value = "properties.usageThreshold", required = true)
    private long usageThreshold;

    /*
     * Set of export policy rules
     */
    @JsonProperty(value = "properties.exportPolicy")
    private VolumePropertiesExportPolicy exportPolicy;

    /*
     * Set of protocol types, default NFSv3, CIFS fro SMB protocol
     */
    @JsonProperty(value = "properties.protocolTypes")
    private List<String> protocolTypes;

    /*
     * Azure lifecycle management
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * UUID v4 or resource identifier used to identify the Snapshot.
     */
    @JsonProperty(value = "properties.snapshotId")
    private String snapshotId;

    /*
     * UUID v4 or resource identifier used to identify the Backup.
     */
    @JsonProperty(value = "properties.backupId")
    private String backupId;

    /*
     * Unique Baremetal Tenant Identifier.
     */
    @JsonProperty(value = "properties.baremetalTenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String baremetalTenantId;

    /*
     * The Azure Resource URI for a delegated subnet. Must have the delegation
     * Microsoft.NetApp/volumes
     */
    @JsonProperty(value = "properties.subnetId", required = true)
    private String subnetId;

    /*
     * List of mount targets
     */
    @JsonProperty(value = "properties.mountTargets", access = JsonProperty.Access.WRITE_ONLY)
    private List<MountTargetProperties> mountTargets;

    /*
     * What type of volume is this
     */
    @JsonProperty(value = "properties.volumeType")
    private String volumeType;

    /*
     * DataProtection type volumes include an object containing details of the
     * replication
     */
    @JsonProperty(value = "properties.dataProtection")
    private VolumePropertiesDataProtection dataProtection;

    /*
     * Restoring
     */
    @JsonProperty(value = "properties.isRestoring")
    private Boolean isRestoring;

    /*
     * If enabled (true) the volume will contain a read-only snapshot directory
     * which provides access to each of the volume's snapshots (default to
     * true).
     */
    @JsonProperty(value = "properties.snapshotDirectoryVisible")
    private Boolean snapshotDirectoryVisible;

    /*
     * Describe if a volume is KerberosEnabled. To be use with swagger version
     * 2020-05-01 or later
     */
    @JsonProperty(value = "properties.kerberosEnabled")
    private Boolean kerberosEnabled;

    /*
     * The security style of volume, default unix, defaults to ntfs for dual
     * protocol or CIFS protocol
     */
    @JsonProperty(value = "properties.securityStyle")
    private SecurityStyle securityStyle;

    /*
     * Enables encryption for in-flight smb3 data. Only applicable for
     * SMB/DualProtocol volume. To be used with swagger version 2020-08-01 or
     * later
     */
    @JsonProperty(value = "properties.smbEncryption")
    private Boolean smbEncryption;

    /*
     * Enables continuously available share property for smb volume. Only
     * applicable for SMB volume
     */
    @JsonProperty(value = "properties.smbContinuouslyAvailable")
    private Boolean smbContinuouslyAvailable;

    /*
     * Maximum throughput in Mibps that can be achieved by this volume
     */
    @JsonProperty(value = "properties.throughputMibps")
    private Float throughputMibps;

    /*
     * Encryption Key Source. Possible values are: 'Microsoft.NetApp'
     */
    @JsonProperty(value = "properties.encryptionKeySource")
    private String encryptionKeySource;

    /*
     * Specifies whether LDAP is enabled or not for a given NFS volume.
     */
    @JsonProperty(value = "properties.ldapEnabled")
    private Boolean ldapEnabled;

    /**
     * Get the fileSystemId property: Unique FileSystem Identifier.
     *
     * @return the fileSystemId value.
     */
    public String fileSystemId() {
        return this.fileSystemId;
    }

    /**
     * Get the creationToken property: A unique file path for the volume. Used when creating mount targets.
     *
     * @return the creationToken value.
     */
    public String creationToken() {
        return this.creationToken;
    }

    /**
     * Set the creationToken property: A unique file path for the volume. Used when creating mount targets.
     *
     * @param creationToken the creationToken value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withCreationToken(String creationToken) {
        this.creationToken = creationToken;
        return this;
    }

    /**
     * Get the serviceLevel property: The service level of the file system.
     *
     * @return the serviceLevel value.
     */
    public ServiceLevel serviceLevel() {
        return this.serviceLevel;
    }

    /**
     * Set the serviceLevel property: The service level of the file system.
     *
     * @param serviceLevel the serviceLevel value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
        return this;
    }

    /**
     * Get the usageThreshold property: Maximum storage quota allowed for a file system in bytes. This is a soft quota
     * used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     *
     * @return the usageThreshold value.
     */
    public long usageThreshold() {
        return this.usageThreshold;
    }

    /**
     * Set the usageThreshold property: Maximum storage quota allowed for a file system in bytes. This is a soft quota
     * used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     *
     * @param usageThreshold the usageThreshold value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withUsageThreshold(long usageThreshold) {
        this.usageThreshold = usageThreshold;
        return this;
    }

    /**
     * Get the exportPolicy property: Set of export policy rules.
     *
     * @return the exportPolicy value.
     */
    public VolumePropertiesExportPolicy exportPolicy() {
        return this.exportPolicy;
    }

    /**
     * Set the exportPolicy property: Set of export policy rules.
     *
     * @param exportPolicy the exportPolicy value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withExportPolicy(VolumePropertiesExportPolicy exportPolicy) {
        this.exportPolicy = exportPolicy;
        return this;
    }

    /**
     * Get the protocolTypes property: Set of protocol types, default NFSv3, CIFS fro SMB protocol.
     *
     * @return the protocolTypes value.
     */
    public List<String> protocolTypes() {
        return this.protocolTypes;
    }

    /**
     * Set the protocolTypes property: Set of protocol types, default NFSv3, CIFS fro SMB protocol.
     *
     * @param protocolTypes the protocolTypes value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withProtocolTypes(List<String> protocolTypes) {
        this.protocolTypes = protocolTypes;
        return this;
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the snapshotId property: UUID v4 or resource identifier used to identify the Snapshot.
     *
     * @return the snapshotId value.
     */
    public String snapshotId() {
        return this.snapshotId;
    }

    /**
     * Set the snapshotId property: UUID v4 or resource identifier used to identify the Snapshot.
     *
     * @param snapshotId the snapshotId value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * Get the backupId property: UUID v4 or resource identifier used to identify the Backup.
     *
     * @return the backupId value.
     */
    public String backupId() {
        return this.backupId;
    }

    /**
     * Set the backupId property: UUID v4 or resource identifier used to identify the Backup.
     *
     * @param backupId the backupId value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * Get the baremetalTenantId property: Unique Baremetal Tenant Identifier.
     *
     * @return the baremetalTenantId value.
     */
    public String baremetalTenantId() {
        return this.baremetalTenantId;
    }

    /**
     * Get the subnetId property: The Azure Resource URI for a delegated subnet. Must have the delegation
     * Microsoft.NetApp/volumes.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The Azure Resource URI for a delegated subnet. Must have the delegation
     * Microsoft.NetApp/volumes.
     *
     * @param subnetId the subnetId value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the mountTargets property: List of mount targets.
     *
     * @return the mountTargets value.
     */
    public List<MountTargetProperties> mountTargets() {
        return this.mountTargets;
    }

    /**
     * Get the volumeType property: What type of volume is this.
     *
     * @return the volumeType value.
     */
    public String volumeType() {
        return this.volumeType;
    }

    /**
     * Set the volumeType property: What type of volume is this.
     *
     * @param volumeType the volumeType value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * Get the dataProtection property: DataProtection type volumes include an object containing details of the
     * replication.
     *
     * @return the dataProtection value.
     */
    public VolumePropertiesDataProtection dataProtection() {
        return this.dataProtection;
    }

    /**
     * Set the dataProtection property: DataProtection type volumes include an object containing details of the
     * replication.
     *
     * @param dataProtection the dataProtection value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withDataProtection(VolumePropertiesDataProtection dataProtection) {
        this.dataProtection = dataProtection;
        return this;
    }

    /**
     * Get the isRestoring property: Restoring.
     *
     * @return the isRestoring value.
     */
    public Boolean isRestoring() {
        return this.isRestoring;
    }

    /**
     * Set the isRestoring property: Restoring.
     *
     * @param isRestoring the isRestoring value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withIsRestoring(Boolean isRestoring) {
        this.isRestoring = isRestoring;
        return this;
    }

    /**
     * Get the snapshotDirectoryVisible property: If enabled (true) the volume will contain a read-only snapshot
     * directory which provides access to each of the volume's snapshots (default to true).
     *
     * @return the snapshotDirectoryVisible value.
     */
    public Boolean snapshotDirectoryVisible() {
        return this.snapshotDirectoryVisible;
    }

    /**
     * Set the snapshotDirectoryVisible property: If enabled (true) the volume will contain a read-only snapshot
     * directory which provides access to each of the volume's snapshots (default to true).
     *
     * @param snapshotDirectoryVisible the snapshotDirectoryVisible value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withSnapshotDirectoryVisible(Boolean snapshotDirectoryVisible) {
        this.snapshotDirectoryVisible = snapshotDirectoryVisible;
        return this;
    }

    /**
     * Get the kerberosEnabled property: Describe if a volume is KerberosEnabled. To be use with swagger version
     * 2020-05-01 or later.
     *
     * @return the kerberosEnabled value.
     */
    public Boolean kerberosEnabled() {
        return this.kerberosEnabled;
    }

    /**
     * Set the kerberosEnabled property: Describe if a volume is KerberosEnabled. To be use with swagger version
     * 2020-05-01 or later.
     *
     * @param kerberosEnabled the kerberosEnabled value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withKerberosEnabled(Boolean kerberosEnabled) {
        this.kerberosEnabled = kerberosEnabled;
        return this;
    }

    /**
     * Get the securityStyle property: The security style of volume, default unix, defaults to ntfs for dual protocol or
     * CIFS protocol.
     *
     * @return the securityStyle value.
     */
    public SecurityStyle securityStyle() {
        return this.securityStyle;
    }

    /**
     * Set the securityStyle property: The security style of volume, default unix, defaults to ntfs for dual protocol or
     * CIFS protocol.
     *
     * @param securityStyle the securityStyle value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withSecurityStyle(SecurityStyle securityStyle) {
        this.securityStyle = securityStyle;
        return this;
    }

    /**
     * Get the smbEncryption property: Enables encryption for in-flight smb3 data. Only applicable for SMB/DualProtocol
     * volume. To be used with swagger version 2020-08-01 or later.
     *
     * @return the smbEncryption value.
     */
    public Boolean smbEncryption() {
        return this.smbEncryption;
    }

    /**
     * Set the smbEncryption property: Enables encryption for in-flight smb3 data. Only applicable for SMB/DualProtocol
     * volume. To be used with swagger version 2020-08-01 or later.
     *
     * @param smbEncryption the smbEncryption value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withSmbEncryption(Boolean smbEncryption) {
        this.smbEncryption = smbEncryption;
        return this;
    }

    /**
     * Get the smbContinuouslyAvailable property: Enables continuously available share property for smb volume. Only
     * applicable for SMB volume.
     *
     * @return the smbContinuouslyAvailable value.
     */
    public Boolean smbContinuouslyAvailable() {
        return this.smbContinuouslyAvailable;
    }

    /**
     * Set the smbContinuouslyAvailable property: Enables continuously available share property for smb volume. Only
     * applicable for SMB volume.
     *
     * @param smbContinuouslyAvailable the smbContinuouslyAvailable value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withSmbContinuouslyAvailable(Boolean smbContinuouslyAvailable) {
        this.smbContinuouslyAvailable = smbContinuouslyAvailable;
        return this;
    }

    /**
     * Get the throughputMibps property: Maximum throughput in Mibps that can be achieved by this volume.
     *
     * @return the throughputMibps value.
     */
    public Float throughputMibps() {
        return this.throughputMibps;
    }

    /**
     * Set the throughputMibps property: Maximum throughput in Mibps that can be achieved by this volume.
     *
     * @param throughputMibps the throughputMibps value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withThroughputMibps(Float throughputMibps) {
        this.throughputMibps = throughputMibps;
        return this;
    }

    /**
     * Get the encryptionKeySource property: Encryption Key Source. Possible values are: 'Microsoft.NetApp'.
     *
     * @return the encryptionKeySource value.
     */
    public String encryptionKeySource() {
        return this.encryptionKeySource;
    }

    /**
     * Set the encryptionKeySource property: Encryption Key Source. Possible values are: 'Microsoft.NetApp'.
     *
     * @param encryptionKeySource the encryptionKeySource value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withEncryptionKeySource(String encryptionKeySource) {
        this.encryptionKeySource = encryptionKeySource;
        return this;
    }

    /**
     * Get the ldapEnabled property: Specifies whether LDAP is enabled or not for a given NFS volume.
     *
     * @return the ldapEnabled value.
     */
    public Boolean ldapEnabled() {
        return this.ldapEnabled;
    }

    /**
     * Set the ldapEnabled property: Specifies whether LDAP is enabled or not for a given NFS volume.
     *
     * @param ldapEnabled the ldapEnabled value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withLdapEnabled(Boolean ldapEnabled) {
        this.ldapEnabled = ldapEnabled;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VolumeInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VolumeInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (creationToken() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property creationToken in model VolumeInner"));
        }
        if (exportPolicy() != null) {
            exportPolicy().validate();
        }
        if (subnetId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property subnetId in model VolumeInner"));
        }
        if (mountTargets() != null) {
            mountTargets().forEach(e -> e.validate());
        }
        if (dataProtection() != null) {
            dataProtection().validate();
        }
    }
}
