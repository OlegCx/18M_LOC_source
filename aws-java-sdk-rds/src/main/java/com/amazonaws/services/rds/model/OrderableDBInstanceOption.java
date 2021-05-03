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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains a list of available options for a DB instance.
 * </p>
 * <p>
 * This data type is used as a response element in the <code>DescribeOrderableDBInstanceOptions</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/OrderableDBInstanceOption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrderableDBInstanceOption implements Serializable, Cloneable {

    /**
     * <p>
     * The engine type of a DB instance.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The engine version of a DB instance.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The DB instance class for a DB instance.
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * The license model for a DB instance.
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * The Availability Zone group for a DB instance.
     * </p>
     */
    private String availabilityZoneGroup;
    /**
     * <p>
     * A list of Availability Zones for a DB instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AvailabilityZone> availabilityZones;
    /**
     * <p>
     * Indicates whether a DB instance is Multi-AZ capable.
     * </p>
     */
    private Boolean multiAZCapable;
    /**
     * <p>
     * Indicates whether a DB instance can have a read replica.
     * </p>
     */
    private Boolean readReplicaCapable;
    /**
     * <p>
     * Indicates whether a DB instance is in a VPC.
     * </p>
     */
    private Boolean vpc;
    /**
     * <p>
     * Indicates whether a DB instance supports encrypted storage.
     * </p>
     */
    private Boolean supportsStorageEncryption;
    /**
     * <p>
     * Indicates the storage type for a DB instance.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * Indicates whether a DB instance supports provisioned IOPS.
     * </p>
     */
    private Boolean supportsIops;
    /**
     * <p>
     * Indicates whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
     * </p>
     */
    private Boolean supportsEnhancedMonitoring;
    /**
     * <p>
     * Indicates whether a DB instance supports IAM database authentication.
     * </p>
     */
    private Boolean supportsIAMDatabaseAuthentication;
    /**
     * <p>
     * True if a DB instance supports Performance Insights, otherwise false.
     * </p>
     */
    private Boolean supportsPerformanceInsights;
    /**
     * <p>
     * Minimum storage size for a DB instance.
     * </p>
     */
    private Integer minStorageSize;
    /**
     * <p>
     * Maximum storage size for a DB instance.
     * </p>
     */
    private Integer maxStorageSize;
    /**
     * <p>
     * Minimum total provisioned IOPS for a DB instance.
     * </p>
     */
    private Integer minIopsPerDbInstance;
    /**
     * <p>
     * Maximum total provisioned IOPS for a DB instance.
     * </p>
     */
    private Integer maxIopsPerDbInstance;
    /**
     * <p>
     * Minimum provisioned IOPS per GiB for a DB instance.
     * </p>
     */
    private Double minIopsPerGib;
    /**
     * <p>
     * Maximum provisioned IOPS per GiB for a DB instance.
     * </p>
     */
    private Double maxIopsPerGib;
    /**
     * <p>
     * A list of the available processor features for the DB instance class of a DB instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AvailableProcessorFeature> availableProcessorFeatures;
    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedEngineModes;
    /**
     * <p>
     * Whether Amazon RDS can automatically scale storage for DB instances that use the specified DB instance class.
     * </p>
     */
    private Boolean supportsStorageAutoscaling;
    /**
     * <p>
     * Whether a DB instance supports Kerberos Authentication.
     * </p>
     */
    private Boolean supportsKerberosAuthentication;
    /**
     * <p>
     * Whether a DB instance supports RDS on Outposts.
     * </p>
     * <p>
     * For more information about RDS on Outposts, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Amazon RDS on AWS Outposts</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private Boolean outpostCapable;
    /**
     * <p>
     * A value that indicates whether you can use Aurora global databases with a specific combination of other DB engine
     * attributes.
     * </p>
     */
    private Boolean supportsGlobalDatabases;

    /**
     * <p>
     * The engine type of a DB instance.
     * </p>
     * 
     * @param engine
     *        The engine type of a DB instance.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The engine type of a DB instance.
     * </p>
     * 
     * @return The engine type of a DB instance.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The engine type of a DB instance.
     * </p>
     * 
     * @param engine
     *        The engine type of a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The engine version of a DB instance.
     * </p>
     * 
     * @param engineVersion
     *        The engine version of a DB instance.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version of a DB instance.
     * </p>
     * 
     * @return The engine version of a DB instance.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The engine version of a DB instance.
     * </p>
     * 
     * @param engineVersion
     *        The engine version of a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The DB instance class for a DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The DB instance class for a DB instance.
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class for a DB instance.
     * </p>
     * 
     * @return The DB instance class for a DB instance.
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class for a DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The DB instance class for a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * The license model for a DB instance.
     * </p>
     * 
     * @param licenseModel
     *        The license model for a DB instance.
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * The license model for a DB instance.
     * </p>
     * 
     * @return The license model for a DB instance.
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * The license model for a DB instance.
     * </p>
     * 
     * @param licenseModel
     *        The license model for a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * The Availability Zone group for a DB instance.
     * </p>
     * 
     * @param availabilityZoneGroup
     *        The Availability Zone group for a DB instance.
     */

    public void setAvailabilityZoneGroup(String availabilityZoneGroup) {
        this.availabilityZoneGroup = availabilityZoneGroup;
    }

    /**
     * <p>
     * The Availability Zone group for a DB instance.
     * </p>
     * 
     * @return The Availability Zone group for a DB instance.
     */

    public String getAvailabilityZoneGroup() {
        return this.availabilityZoneGroup;
    }

    /**
     * <p>
     * The Availability Zone group for a DB instance.
     * </p>
     * 
     * @param availabilityZoneGroup
     *        The Availability Zone group for a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withAvailabilityZoneGroup(String availabilityZoneGroup) {
        setAvailabilityZoneGroup(availabilityZoneGroup);
        return this;
    }

    /**
     * <p>
     * A list of Availability Zones for a DB instance.
     * </p>
     * 
     * @return A list of Availability Zones for a DB instance.
     */

    public java.util.List<AvailabilityZone> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<AvailabilityZone>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * A list of Availability Zones for a DB instance.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones for a DB instance.
     */

    public void setAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<AvailabilityZone>(availabilityZones);
    }

    /**
     * <p>
     * A list of Availability Zones for a DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones for a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withAvailabilityZones(AvailabilityZone... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<AvailabilityZone>(availabilityZones.length));
        }
        for (AvailabilityZone ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Availability Zones for a DB instance.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones for a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * Indicates whether a DB instance is Multi-AZ capable.
     * </p>
     * 
     * @param multiAZCapable
     *        Indicates whether a DB instance is Multi-AZ capable.
     */

    public void setMultiAZCapable(Boolean multiAZCapable) {
        this.multiAZCapable = multiAZCapable;
    }

    /**
     * <p>
     * Indicates whether a DB instance is Multi-AZ capable.
     * </p>
     * 
     * @return Indicates whether a DB instance is Multi-AZ capable.
     */

    public Boolean getMultiAZCapable() {
        return this.multiAZCapable;
    }

    /**
     * <p>
     * Indicates whether a DB instance is Multi-AZ capable.
     * </p>
     * 
     * @param multiAZCapable
     *        Indicates whether a DB instance is Multi-AZ capable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withMultiAZCapable(Boolean multiAZCapable) {
        setMultiAZCapable(multiAZCapable);
        return this;
    }

    /**
     * <p>
     * Indicates whether a DB instance is Multi-AZ capable.
     * </p>
     * 
     * @return Indicates whether a DB instance is Multi-AZ capable.
     */

    public Boolean isMultiAZCapable() {
        return this.multiAZCapable;
    }

    /**
     * <p>
     * Indicates whether a DB instance can have a read replica.
     * </p>
     * 
     * @param readReplicaCapable
     *        Indicates whether a DB instance can have a read replica.
     */

    public void setReadReplicaCapable(Boolean readReplicaCapable) {
        this.readReplicaCapable = readReplicaCapable;
    }

    /**
     * <p>
     * Indicates whether a DB instance can have a read replica.
     * </p>
     * 
     * @return Indicates whether a DB instance can have a read replica.
     */

    public Boolean getReadReplicaCapable() {
        return this.readReplicaCapable;
    }

    /**
     * <p>
     * Indicates whether a DB instance can have a read replica.
     * </p>
     * 
     * @param readReplicaCapable
     *        Indicates whether a DB instance can have a read replica.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withReadReplicaCapable(Boolean readReplicaCapable) {
        setReadReplicaCapable(readReplicaCapable);
        return this;
    }

    /**
     * <p>
     * Indicates whether a DB instance can have a read replica.
     * </p>
     * 
     * @return Indicates whether a DB instance can have a read replica.
     */

    public Boolean isReadReplicaCapable() {
        return this.readReplicaCapable;
    }

    /**
     * <p>
     * Indicates whether a DB instance is in a VPC.
     * </p>
     * 
     * @param vpc
     *        Indicates whether a DB instance is in a VPC.
     */

    public void setVpc(Boolean vpc) {
        this.vpc = vpc;
    }

    /**
     * <p>
     * Indicates whether a DB instance is in a VPC.
     * </p>
     * 
     * @return Indicates whether a DB instance is in a VPC.
     */

    public Boolean getVpc() {
        return this.vpc;
    }

    /**
     * <p>
     * Indicates whether a DB instance is in a VPC.
     * </p>
     * 
     * @param vpc
     *        Indicates whether a DB instance is in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withVpc(Boolean vpc) {
        setVpc(vpc);
        return this;
    }

    /**
     * <p>
     * Indicates whether a DB instance is in a VPC.
     * </p>
     * 
     * @return Indicates whether a DB instance is in a VPC.
     */

    public Boolean isVpc() {
        return this.vpc;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports encrypted storage.
     * </p>
     * 
     * @param supportsStorageEncryption
     *        Indicates whether a DB instance supports encrypted storage.
     */

    public void setSupportsStorageEncryption(Boolean supportsStorageEncryption) {
        this.supportsStorageEncryption = supportsStorageEncryption;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports encrypted storage.
     * </p>
     * 
     * @return Indicates whether a DB instance supports encrypted storage.
     */

    public Boolean getSupportsStorageEncryption() {
        return this.supportsStorageEncryption;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports encrypted storage.
     * </p>
     * 
     * @param supportsStorageEncryption
     *        Indicates whether a DB instance supports encrypted storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withSupportsStorageEncryption(Boolean supportsStorageEncryption) {
        setSupportsStorageEncryption(supportsStorageEncryption);
        return this;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports encrypted storage.
     * </p>
     * 
     * @return Indicates whether a DB instance supports encrypted storage.
     */

    public Boolean isSupportsStorageEncryption() {
        return this.supportsStorageEncryption;
    }

    /**
     * <p>
     * Indicates the storage type for a DB instance.
     * </p>
     * 
     * @param storageType
     *        Indicates the storage type for a DB instance.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Indicates the storage type for a DB instance.
     * </p>
     * 
     * @return Indicates the storage type for a DB instance.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Indicates the storage type for a DB instance.
     * </p>
     * 
     * @param storageType
     *        Indicates the storage type for a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports provisioned IOPS.
     * </p>
     * 
     * @param supportsIops
     *        Indicates whether a DB instance supports provisioned IOPS.
     */

    public void setSupportsIops(Boolean supportsIops) {
        this.supportsIops = supportsIops;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports provisioned IOPS.
     * </p>
     * 
     * @return Indicates whether a DB instance supports provisioned IOPS.
     */

    public Boolean getSupportsIops() {
        return this.supportsIops;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports provisioned IOPS.
     * </p>
     * 
     * @param supportsIops
     *        Indicates whether a DB instance supports provisioned IOPS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withSupportsIops(Boolean supportsIops) {
        setSupportsIops(supportsIops);
        return this;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports provisioned IOPS.
     * </p>
     * 
     * @return Indicates whether a DB instance supports provisioned IOPS.
     */

    public Boolean isSupportsIops() {
        return this.supportsIops;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
     * </p>
     * 
     * @param supportsEnhancedMonitoring
     *        Indicates whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
     */

    public void setSupportsEnhancedMonitoring(Boolean supportsEnhancedMonitoring) {
        this.supportsEnhancedMonitoring = supportsEnhancedMonitoring;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
     * </p>
     * 
     * @return Indicates whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
     */

    public Boolean getSupportsEnhancedMonitoring() {
        return this.supportsEnhancedMonitoring;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
     * </p>
     * 
     * @param supportsEnhancedMonitoring
     *        Indicates whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withSupportsEnhancedMonitoring(Boolean supportsEnhancedMonitoring) {
        setSupportsEnhancedMonitoring(supportsEnhancedMonitoring);
        return this;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
     * </p>
     * 
     * @return Indicates whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
     */

    public Boolean isSupportsEnhancedMonitoring() {
        return this.supportsEnhancedMonitoring;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports IAM database authentication.
     * </p>
     * 
     * @param supportsIAMDatabaseAuthentication
     *        Indicates whether a DB instance supports IAM database authentication.
     */

    public void setSupportsIAMDatabaseAuthentication(Boolean supportsIAMDatabaseAuthentication) {
        this.supportsIAMDatabaseAuthentication = supportsIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports IAM database authentication.
     * </p>
     * 
     * @return Indicates whether a DB instance supports IAM database authentication.
     */

    public Boolean getSupportsIAMDatabaseAuthentication() {
        return this.supportsIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports IAM database authentication.
     * </p>
     * 
     * @param supportsIAMDatabaseAuthentication
     *        Indicates whether a DB instance supports IAM database authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withSupportsIAMDatabaseAuthentication(Boolean supportsIAMDatabaseAuthentication) {
        setSupportsIAMDatabaseAuthentication(supportsIAMDatabaseAuthentication);
        return this;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports IAM database authentication.
     * </p>
     * 
     * @return Indicates whether a DB instance supports IAM database authentication.
     */

    public Boolean isSupportsIAMDatabaseAuthentication() {
        return this.supportsIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * True if a DB instance supports Performance Insights, otherwise false.
     * </p>
     * 
     * @param supportsPerformanceInsights
     *        True if a DB instance supports Performance Insights, otherwise false.
     */

    public void setSupportsPerformanceInsights(Boolean supportsPerformanceInsights) {
        this.supportsPerformanceInsights = supportsPerformanceInsights;
    }

    /**
     * <p>
     * True if a DB instance supports Performance Insights, otherwise false.
     * </p>
     * 
     * @return True if a DB instance supports Performance Insights, otherwise false.
     */

    public Boolean getSupportsPerformanceInsights() {
        return this.supportsPerformanceInsights;
    }

    /**
     * <p>
     * True if a DB instance supports Performance Insights, otherwise false.
     * </p>
     * 
     * @param supportsPerformanceInsights
     *        True if a DB instance supports Performance Insights, otherwise false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withSupportsPerformanceInsights(Boolean supportsPerformanceInsights) {
        setSupportsPerformanceInsights(supportsPerformanceInsights);
        return this;
    }

    /**
     * <p>
     * True if a DB instance supports Performance Insights, otherwise false.
     * </p>
     * 
     * @return True if a DB instance supports Performance Insights, otherwise false.
     */

    public Boolean isSupportsPerformanceInsights() {
        return this.supportsPerformanceInsights;
    }

    /**
     * <p>
     * Minimum storage size for a DB instance.
     * </p>
     * 
     * @param minStorageSize
     *        Minimum storage size for a DB instance.
     */

    public void setMinStorageSize(Integer minStorageSize) {
        this.minStorageSize = minStorageSize;
    }

    /**
     * <p>
     * Minimum storage size for a DB instance.
     * </p>
     * 
     * @return Minimum storage size for a DB instance.
     */

    public Integer getMinStorageSize() {
        return this.minStorageSize;
    }

    /**
     * <p>
     * Minimum storage size for a DB instance.
     * </p>
     * 
     * @param minStorageSize
     *        Minimum storage size for a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withMinStorageSize(Integer minStorageSize) {
        setMinStorageSize(minStorageSize);
        return this;
    }

    /**
     * <p>
     * Maximum storage size for a DB instance.
     * </p>
     * 
     * @param maxStorageSize
     *        Maximum storage size for a DB instance.
     */

    public void setMaxStorageSize(Integer maxStorageSize) {
        this.maxStorageSize = maxStorageSize;
    }

    /**
     * <p>
     * Maximum storage size for a DB instance.
     * </p>
     * 
     * @return Maximum storage size for a DB instance.
     */

    public Integer getMaxStorageSize() {
        return this.maxStorageSize;
    }

    /**
     * <p>
     * Maximum storage size for a DB instance.
     * </p>
     * 
     * @param maxStorageSize
     *        Maximum storage size for a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withMaxStorageSize(Integer maxStorageSize) {
        setMaxStorageSize(maxStorageSize);
        return this;
    }

    /**
     * <p>
     * Minimum total provisioned IOPS for a DB instance.
     * </p>
     * 
     * @param minIopsPerDbInstance
     *        Minimum total provisioned IOPS for a DB instance.
     */

    public void setMinIopsPerDbInstance(Integer minIopsPerDbInstance) {
        this.minIopsPerDbInstance = minIopsPerDbInstance;
    }

    /**
     * <p>
     * Minimum total provisioned IOPS for a DB instance.
     * </p>
     * 
     * @return Minimum total provisioned IOPS for a DB instance.
     */

    public Integer getMinIopsPerDbInstance() {
        return this.minIopsPerDbInstance;
    }

    /**
     * <p>
     * Minimum total provisioned IOPS for a DB instance.
     * </p>
     * 
     * @param minIopsPerDbInstance
     *        Minimum total provisioned IOPS for a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withMinIopsPerDbInstance(Integer minIopsPerDbInstance) {
        setMinIopsPerDbInstance(minIopsPerDbInstance);
        return this;
    }

    /**
     * <p>
     * Maximum total provisioned IOPS for a DB instance.
     * </p>
     * 
     * @param maxIopsPerDbInstance
     *        Maximum total provisioned IOPS for a DB instance.
     */

    public void setMaxIopsPerDbInstance(Integer maxIopsPerDbInstance) {
        this.maxIopsPerDbInstance = maxIopsPerDbInstance;
    }

    /**
     * <p>
     * Maximum total provisioned IOPS for a DB instance.
     * </p>
     * 
     * @return Maximum total provisioned IOPS for a DB instance.
     */

    public Integer getMaxIopsPerDbInstance() {
        return this.maxIopsPerDbInstance;
    }

    /**
     * <p>
     * Maximum total provisioned IOPS for a DB instance.
     * </p>
     * 
     * @param maxIopsPerDbInstance
     *        Maximum total provisioned IOPS for a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withMaxIopsPerDbInstance(Integer maxIopsPerDbInstance) {
        setMaxIopsPerDbInstance(maxIopsPerDbInstance);
        return this;
    }

    /**
     * <p>
     * Minimum provisioned IOPS per GiB for a DB instance.
     * </p>
     * 
     * @param minIopsPerGib
     *        Minimum provisioned IOPS per GiB for a DB instance.
     */

    public void setMinIopsPerGib(Double minIopsPerGib) {
        this.minIopsPerGib = minIopsPerGib;
    }

    /**
     * <p>
     * Minimum provisioned IOPS per GiB for a DB instance.
     * </p>
     * 
     * @return Minimum provisioned IOPS per GiB for a DB instance.
     */

    public Double getMinIopsPerGib() {
        return this.minIopsPerGib;
    }

    /**
     * <p>
     * Minimum provisioned IOPS per GiB for a DB instance.
     * </p>
     * 
     * @param minIopsPerGib
     *        Minimum provisioned IOPS per GiB for a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withMinIopsPerGib(Double minIopsPerGib) {
        setMinIopsPerGib(minIopsPerGib);
        return this;
    }

    /**
     * <p>
     * Maximum provisioned IOPS per GiB for a DB instance.
     * </p>
     * 
     * @param maxIopsPerGib
     *        Maximum provisioned IOPS per GiB for a DB instance.
     */

    public void setMaxIopsPerGib(Double maxIopsPerGib) {
        this.maxIopsPerGib = maxIopsPerGib;
    }

    /**
     * <p>
     * Maximum provisioned IOPS per GiB for a DB instance.
     * </p>
     * 
     * @return Maximum provisioned IOPS per GiB for a DB instance.
     */

    public Double getMaxIopsPerGib() {
        return this.maxIopsPerGib;
    }

    /**
     * <p>
     * Maximum provisioned IOPS per GiB for a DB instance.
     * </p>
     * 
     * @param maxIopsPerGib
     *        Maximum provisioned IOPS per GiB for a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withMaxIopsPerGib(Double maxIopsPerGib) {
        setMaxIopsPerGib(maxIopsPerGib);
        return this;
    }

    /**
     * <p>
     * A list of the available processor features for the DB instance class of a DB instance.
     * </p>
     * 
     * @return A list of the available processor features for the DB instance class of a DB instance.
     */

    public java.util.List<AvailableProcessorFeature> getAvailableProcessorFeatures() {
        if (availableProcessorFeatures == null) {
            availableProcessorFeatures = new com.amazonaws.internal.SdkInternalList<AvailableProcessorFeature>();
        }
        return availableProcessorFeatures;
    }

    /**
     * <p>
     * A list of the available processor features for the DB instance class of a DB instance.
     * </p>
     * 
     * @param availableProcessorFeatures
     *        A list of the available processor features for the DB instance class of a DB instance.
     */

    public void setAvailableProcessorFeatures(java.util.Collection<AvailableProcessorFeature> availableProcessorFeatures) {
        if (availableProcessorFeatures == null) {
            this.availableProcessorFeatures = null;
            return;
        }

        this.availableProcessorFeatures = new com.amazonaws.internal.SdkInternalList<AvailableProcessorFeature>(availableProcessorFeatures);
    }

    /**
     * <p>
     * A list of the available processor features for the DB instance class of a DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailableProcessorFeatures(java.util.Collection)} or
     * {@link #withAvailableProcessorFeatures(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param availableProcessorFeatures
     *        A list of the available processor features for the DB instance class of a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withAvailableProcessorFeatures(AvailableProcessorFeature... availableProcessorFeatures) {
        if (this.availableProcessorFeatures == null) {
            setAvailableProcessorFeatures(new com.amazonaws.internal.SdkInternalList<AvailableProcessorFeature>(availableProcessorFeatures.length));
        }
        for (AvailableProcessorFeature ele : availableProcessorFeatures) {
            this.availableProcessorFeatures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the available processor features for the DB instance class of a DB instance.
     * </p>
     * 
     * @param availableProcessorFeatures
     *        A list of the available processor features for the DB instance class of a DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withAvailableProcessorFeatures(java.util.Collection<AvailableProcessorFeature> availableProcessorFeatures) {
        setAvailableProcessorFeatures(availableProcessorFeatures);
        return this;
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * 
     * @return A list of the supported DB engine modes.
     */

    public java.util.List<String> getSupportedEngineModes() {
        if (supportedEngineModes == null) {
            supportedEngineModes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedEngineModes;
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * 
     * @param supportedEngineModes
     *        A list of the supported DB engine modes.
     */

    public void setSupportedEngineModes(java.util.Collection<String> supportedEngineModes) {
        if (supportedEngineModes == null) {
            this.supportedEngineModes = null;
            return;
        }

        this.supportedEngineModes = new com.amazonaws.internal.SdkInternalList<String>(supportedEngineModes);
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedEngineModes(java.util.Collection)} or {@link #withSupportedEngineModes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param supportedEngineModes
     *        A list of the supported DB engine modes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withSupportedEngineModes(String... supportedEngineModes) {
        if (this.supportedEngineModes == null) {
            setSupportedEngineModes(new com.amazonaws.internal.SdkInternalList<String>(supportedEngineModes.length));
        }
        for (String ele : supportedEngineModes) {
            this.supportedEngineModes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * 
     * @param supportedEngineModes
     *        A list of the supported DB engine modes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withSupportedEngineModes(java.util.Collection<String> supportedEngineModes) {
        setSupportedEngineModes(supportedEngineModes);
        return this;
    }

    /**
     * <p>
     * Whether Amazon RDS can automatically scale storage for DB instances that use the specified DB instance class.
     * </p>
     * 
     * @param supportsStorageAutoscaling
     *        Whether Amazon RDS can automatically scale storage for DB instances that use the specified DB instance
     *        class.
     */

    public void setSupportsStorageAutoscaling(Boolean supportsStorageAutoscaling) {
        this.supportsStorageAutoscaling = supportsStorageAutoscaling;
    }

    /**
     * <p>
     * Whether Amazon RDS can automatically scale storage for DB instances that use the specified DB instance class.
     * </p>
     * 
     * @return Whether Amazon RDS can automatically scale storage for DB instances that use the specified DB instance
     *         class.
     */

    public Boolean getSupportsStorageAutoscaling() {
        return this.supportsStorageAutoscaling;
    }

    /**
     * <p>
     * Whether Amazon RDS can automatically scale storage for DB instances that use the specified DB instance class.
     * </p>
     * 
     * @param supportsStorageAutoscaling
     *        Whether Amazon RDS can automatically scale storage for DB instances that use the specified DB instance
     *        class.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withSupportsStorageAutoscaling(Boolean supportsStorageAutoscaling) {
        setSupportsStorageAutoscaling(supportsStorageAutoscaling);
        return this;
    }

    /**
     * <p>
     * Whether Amazon RDS can automatically scale storage for DB instances that use the specified DB instance class.
     * </p>
     * 
     * @return Whether Amazon RDS can automatically scale storage for DB instances that use the specified DB instance
     *         class.
     */

    public Boolean isSupportsStorageAutoscaling() {
        return this.supportsStorageAutoscaling;
    }

    /**
     * <p>
     * Whether a DB instance supports Kerberos Authentication.
     * </p>
     * 
     * @param supportsKerberosAuthentication
     *        Whether a DB instance supports Kerberos Authentication.
     */

    public void setSupportsKerberosAuthentication(Boolean supportsKerberosAuthentication) {
        this.supportsKerberosAuthentication = supportsKerberosAuthentication;
    }

    /**
     * <p>
     * Whether a DB instance supports Kerberos Authentication.
     * </p>
     * 
     * @return Whether a DB instance supports Kerberos Authentication.
     */

    public Boolean getSupportsKerberosAuthentication() {
        return this.supportsKerberosAuthentication;
    }

    /**
     * <p>
     * Whether a DB instance supports Kerberos Authentication.
     * </p>
     * 
     * @param supportsKerberosAuthentication
     *        Whether a DB instance supports Kerberos Authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withSupportsKerberosAuthentication(Boolean supportsKerberosAuthentication) {
        setSupportsKerberosAuthentication(supportsKerberosAuthentication);
        return this;
    }

    /**
     * <p>
     * Whether a DB instance supports Kerberos Authentication.
     * </p>
     * 
     * @return Whether a DB instance supports Kerberos Authentication.
     */

    public Boolean isSupportsKerberosAuthentication() {
        return this.supportsKerberosAuthentication;
    }

    /**
     * <p>
     * Whether a DB instance supports RDS on Outposts.
     * </p>
     * <p>
     * For more information about RDS on Outposts, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Amazon RDS on AWS Outposts</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param outpostCapable
     *        Whether a DB instance supports RDS on Outposts.</p>
     *        <p>
     *        For more information about RDS on Outposts, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Amazon RDS on AWS
     *        Outposts</a> in the <i>Amazon RDS User Guide.</i>
     */

    public void setOutpostCapable(Boolean outpostCapable) {
        this.outpostCapable = outpostCapable;
    }

    /**
     * <p>
     * Whether a DB instance supports RDS on Outposts.
     * </p>
     * <p>
     * For more information about RDS on Outposts, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Amazon RDS on AWS Outposts</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @return Whether a DB instance supports RDS on Outposts.</p>
     *         <p>
     *         For more information about RDS on Outposts, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Amazon RDS on AWS
     *         Outposts</a> in the <i>Amazon RDS User Guide.</i>
     */

    public Boolean getOutpostCapable() {
        return this.outpostCapable;
    }

    /**
     * <p>
     * Whether a DB instance supports RDS on Outposts.
     * </p>
     * <p>
     * For more information about RDS on Outposts, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Amazon RDS on AWS Outposts</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param outpostCapable
     *        Whether a DB instance supports RDS on Outposts.</p>
     *        <p>
     *        For more information about RDS on Outposts, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Amazon RDS on AWS
     *        Outposts</a> in the <i>Amazon RDS User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withOutpostCapable(Boolean outpostCapable) {
        setOutpostCapable(outpostCapable);
        return this;
    }

    /**
     * <p>
     * Whether a DB instance supports RDS on Outposts.
     * </p>
     * <p>
     * For more information about RDS on Outposts, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Amazon RDS on AWS Outposts</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @return Whether a DB instance supports RDS on Outposts.</p>
     *         <p>
     *         For more information about RDS on Outposts, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Amazon RDS on AWS
     *         Outposts</a> in the <i>Amazon RDS User Guide.</i>
     */

    public Boolean isOutpostCapable() {
        return this.outpostCapable;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora global databases with a specific combination of other DB engine
     * attributes.
     * </p>
     * 
     * @param supportsGlobalDatabases
     *        A value that indicates whether you can use Aurora global databases with a specific combination of other DB
     *        engine attributes.
     */

    public void setSupportsGlobalDatabases(Boolean supportsGlobalDatabases) {
        this.supportsGlobalDatabases = supportsGlobalDatabases;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora global databases with a specific combination of other DB engine
     * attributes.
     * </p>
     * 
     * @return A value that indicates whether you can use Aurora global databases with a specific combination of other
     *         DB engine attributes.
     */

    public Boolean getSupportsGlobalDatabases() {
        return this.supportsGlobalDatabases;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora global databases with a specific combination of other DB engine
     * attributes.
     * </p>
     * 
     * @param supportsGlobalDatabases
     *        A value that indicates whether you can use Aurora global databases with a specific combination of other DB
     *        engine attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withSupportsGlobalDatabases(Boolean supportsGlobalDatabases) {
        setSupportsGlobalDatabases(supportsGlobalDatabases);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether you can use Aurora global databases with a specific combination of other DB engine
     * attributes.
     * </p>
     * 
     * @return A value that indicates whether you can use Aurora global databases with a specific combination of other
     *         DB engine attributes.
     */

    public Boolean isSupportsGlobalDatabases() {
        return this.supportsGlobalDatabases;
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
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: ").append(getDBInstanceClass()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getAvailabilityZoneGroup() != null)
            sb.append("AvailabilityZoneGroup: ").append(getAvailabilityZoneGroup()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getMultiAZCapable() != null)
            sb.append("MultiAZCapable: ").append(getMultiAZCapable()).append(",");
        if (getReadReplicaCapable() != null)
            sb.append("ReadReplicaCapable: ").append(getReadReplicaCapable()).append(",");
        if (getVpc() != null)
            sb.append("Vpc: ").append(getVpc()).append(",");
        if (getSupportsStorageEncryption() != null)
            sb.append("SupportsStorageEncryption: ").append(getSupportsStorageEncryption()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getSupportsIops() != null)
            sb.append("SupportsIops: ").append(getSupportsIops()).append(",");
        if (getSupportsEnhancedMonitoring() != null)
            sb.append("SupportsEnhancedMonitoring: ").append(getSupportsEnhancedMonitoring()).append(",");
        if (getSupportsIAMDatabaseAuthentication() != null)
            sb.append("SupportsIAMDatabaseAuthentication: ").append(getSupportsIAMDatabaseAuthentication()).append(",");
        if (getSupportsPerformanceInsights() != null)
            sb.append("SupportsPerformanceInsights: ").append(getSupportsPerformanceInsights()).append(",");
        if (getMinStorageSize() != null)
            sb.append("MinStorageSize: ").append(getMinStorageSize()).append(",");
        if (getMaxStorageSize() != null)
            sb.append("MaxStorageSize: ").append(getMaxStorageSize()).append(",");
        if (getMinIopsPerDbInstance() != null)
            sb.append("MinIopsPerDbInstance: ").append(getMinIopsPerDbInstance()).append(",");
        if (getMaxIopsPerDbInstance() != null)
            sb.append("MaxIopsPerDbInstance: ").append(getMaxIopsPerDbInstance()).append(",");
        if (getMinIopsPerGib() != null)
            sb.append("MinIopsPerGib: ").append(getMinIopsPerGib()).append(",");
        if (getMaxIopsPerGib() != null)
            sb.append("MaxIopsPerGib: ").append(getMaxIopsPerGib()).append(",");
        if (getAvailableProcessorFeatures() != null)
            sb.append("AvailableProcessorFeatures: ").append(getAvailableProcessorFeatures()).append(",");
        if (getSupportedEngineModes() != null)
            sb.append("SupportedEngineModes: ").append(getSupportedEngineModes()).append(",");
        if (getSupportsStorageAutoscaling() != null)
            sb.append("SupportsStorageAutoscaling: ").append(getSupportsStorageAutoscaling()).append(",");
        if (getSupportsKerberosAuthentication() != null)
            sb.append("SupportsKerberosAuthentication: ").append(getSupportsKerberosAuthentication()).append(",");
        if (getOutpostCapable() != null)
            sb.append("OutpostCapable: ").append(getOutpostCapable()).append(",");
        if (getSupportsGlobalDatabases() != null)
            sb.append("SupportsGlobalDatabases: ").append(getSupportsGlobalDatabases());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrderableDBInstanceOption == false)
            return false;
        OrderableDBInstanceOption other = (OrderableDBInstanceOption) obj;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getAvailabilityZoneGroup() == null ^ this.getAvailabilityZoneGroup() == null)
            return false;
        if (other.getAvailabilityZoneGroup() != null && other.getAvailabilityZoneGroup().equals(this.getAvailabilityZoneGroup()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getMultiAZCapable() == null ^ this.getMultiAZCapable() == null)
            return false;
        if (other.getMultiAZCapable() != null && other.getMultiAZCapable().equals(this.getMultiAZCapable()) == false)
            return false;
        if (other.getReadReplicaCapable() == null ^ this.getReadReplicaCapable() == null)
            return false;
        if (other.getReadReplicaCapable() != null && other.getReadReplicaCapable().equals(this.getReadReplicaCapable()) == false)
            return false;
        if (other.getVpc() == null ^ this.getVpc() == null)
            return false;
        if (other.getVpc() != null && other.getVpc().equals(this.getVpc()) == false)
            return false;
        if (other.getSupportsStorageEncryption() == null ^ this.getSupportsStorageEncryption() == null)
            return false;
        if (other.getSupportsStorageEncryption() != null && other.getSupportsStorageEncryption().equals(this.getSupportsStorageEncryption()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getSupportsIops() == null ^ this.getSupportsIops() == null)
            return false;
        if (other.getSupportsIops() != null && other.getSupportsIops().equals(this.getSupportsIops()) == false)
            return false;
        if (other.getSupportsEnhancedMonitoring() == null ^ this.getSupportsEnhancedMonitoring() == null)
            return false;
        if (other.getSupportsEnhancedMonitoring() != null && other.getSupportsEnhancedMonitoring().equals(this.getSupportsEnhancedMonitoring()) == false)
            return false;
        if (other.getSupportsIAMDatabaseAuthentication() == null ^ this.getSupportsIAMDatabaseAuthentication() == null)
            return false;
        if (other.getSupportsIAMDatabaseAuthentication() != null
                && other.getSupportsIAMDatabaseAuthentication().equals(this.getSupportsIAMDatabaseAuthentication()) == false)
            return false;
        if (other.getSupportsPerformanceInsights() == null ^ this.getSupportsPerformanceInsights() == null)
            return false;
        if (other.getSupportsPerformanceInsights() != null && other.getSupportsPerformanceInsights().equals(this.getSupportsPerformanceInsights()) == false)
            return false;
        if (other.getMinStorageSize() == null ^ this.getMinStorageSize() == null)
            return false;
        if (other.getMinStorageSize() != null && other.getMinStorageSize().equals(this.getMinStorageSize()) == false)
            return false;
        if (other.getMaxStorageSize() == null ^ this.getMaxStorageSize() == null)
            return false;
        if (other.getMaxStorageSize() != null && other.getMaxStorageSize().equals(this.getMaxStorageSize()) == false)
            return false;
        if (other.getMinIopsPerDbInstance() == null ^ this.getMinIopsPerDbInstance() == null)
            return false;
        if (other.getMinIopsPerDbInstance() != null && other.getMinIopsPerDbInstance().equals(this.getMinIopsPerDbInstance()) == false)
            return false;
        if (other.getMaxIopsPerDbInstance() == null ^ this.getMaxIopsPerDbInstance() == null)
            return false;
        if (other.getMaxIopsPerDbInstance() != null && other.getMaxIopsPerDbInstance().equals(this.getMaxIopsPerDbInstance()) == false)
            return false;
        if (other.getMinIopsPerGib() == null ^ this.getMinIopsPerGib() == null)
            return false;
        if (other.getMinIopsPerGib() != null && other.getMinIopsPerGib().equals(this.getMinIopsPerGib()) == false)
            return false;
        if (other.getMaxIopsPerGib() == null ^ this.getMaxIopsPerGib() == null)
            return false;
        if (other.getMaxIopsPerGib() != null && other.getMaxIopsPerGib().equals(this.getMaxIopsPerGib()) == false)
            return false;
        if (other.getAvailableProcessorFeatures() == null ^ this.getAvailableProcessorFeatures() == null)
            return false;
        if (other.getAvailableProcessorFeatures() != null && other.getAvailableProcessorFeatures().equals(this.getAvailableProcessorFeatures()) == false)
            return false;
        if (other.getSupportedEngineModes() == null ^ this.getSupportedEngineModes() == null)
            return false;
        if (other.getSupportedEngineModes() != null && other.getSupportedEngineModes().equals(this.getSupportedEngineModes()) == false)
            return false;
        if (other.getSupportsStorageAutoscaling() == null ^ this.getSupportsStorageAutoscaling() == null)
            return false;
        if (other.getSupportsStorageAutoscaling() != null && other.getSupportsStorageAutoscaling().equals(this.getSupportsStorageAutoscaling()) == false)
            return false;
        if (other.getSupportsKerberosAuthentication() == null ^ this.getSupportsKerberosAuthentication() == null)
            return false;
        if (other.getSupportsKerberosAuthentication() != null
                && other.getSupportsKerberosAuthentication().equals(this.getSupportsKerberosAuthentication()) == false)
            return false;
        if (other.getOutpostCapable() == null ^ this.getOutpostCapable() == null)
            return false;
        if (other.getOutpostCapable() != null && other.getOutpostCapable().equals(this.getOutpostCapable()) == false)
            return false;
        if (other.getSupportsGlobalDatabases() == null ^ this.getSupportsGlobalDatabases() == null)
            return false;
        if (other.getSupportsGlobalDatabases() != null && other.getSupportsGlobalDatabases().equals(this.getSupportsGlobalDatabases()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneGroup() == null) ? 0 : getAvailabilityZoneGroup().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getMultiAZCapable() == null) ? 0 : getMultiAZCapable().hashCode());
        hashCode = prime * hashCode + ((getReadReplicaCapable() == null) ? 0 : getReadReplicaCapable().hashCode());
        hashCode = prime * hashCode + ((getVpc() == null) ? 0 : getVpc().hashCode());
        hashCode = prime * hashCode + ((getSupportsStorageEncryption() == null) ? 0 : getSupportsStorageEncryption().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getSupportsIops() == null) ? 0 : getSupportsIops().hashCode());
        hashCode = prime * hashCode + ((getSupportsEnhancedMonitoring() == null) ? 0 : getSupportsEnhancedMonitoring().hashCode());
        hashCode = prime * hashCode + ((getSupportsIAMDatabaseAuthentication() == null) ? 0 : getSupportsIAMDatabaseAuthentication().hashCode());
        hashCode = prime * hashCode + ((getSupportsPerformanceInsights() == null) ? 0 : getSupportsPerformanceInsights().hashCode());
        hashCode = prime * hashCode + ((getMinStorageSize() == null) ? 0 : getMinStorageSize().hashCode());
        hashCode = prime * hashCode + ((getMaxStorageSize() == null) ? 0 : getMaxStorageSize().hashCode());
        hashCode = prime * hashCode + ((getMinIopsPerDbInstance() == null) ? 0 : getMinIopsPerDbInstance().hashCode());
        hashCode = prime * hashCode + ((getMaxIopsPerDbInstance() == null) ? 0 : getMaxIopsPerDbInstance().hashCode());
        hashCode = prime * hashCode + ((getMinIopsPerGib() == null) ? 0 : getMinIopsPerGib().hashCode());
        hashCode = prime * hashCode + ((getMaxIopsPerGib() == null) ? 0 : getMaxIopsPerGib().hashCode());
        hashCode = prime * hashCode + ((getAvailableProcessorFeatures() == null) ? 0 : getAvailableProcessorFeatures().hashCode());
        hashCode = prime * hashCode + ((getSupportedEngineModes() == null) ? 0 : getSupportedEngineModes().hashCode());
        hashCode = prime * hashCode + ((getSupportsStorageAutoscaling() == null) ? 0 : getSupportsStorageAutoscaling().hashCode());
        hashCode = prime * hashCode + ((getSupportsKerberosAuthentication() == null) ? 0 : getSupportsKerberosAuthentication().hashCode());
        hashCode = prime * hashCode + ((getOutpostCapable() == null) ? 0 : getOutpostCapable().hashCode());
        hashCode = prime * hashCode + ((getSupportsGlobalDatabases() == null) ? 0 : getSupportsGlobalDatabases().hashCode());
        return hashCode;
    }

    @Override
    public OrderableDBInstanceOption clone() {
        try {
            return (OrderableDBInstanceOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
