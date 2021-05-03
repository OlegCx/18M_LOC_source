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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the details for an Amazon Neptune DB cluster snapshot
 * </p>
 * <p>
 * This data type is used as a response element in the <a>DescribeDBClusterSnapshots</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DBClusterSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBClusterSnapshot implements Serializable, Cloneable {

    /**
     * <p>
     * Provides the list of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
     * </p>
     */
    private java.util.List<String> availabilityZones;
    /**
     * <p>
     * Specifies the identifier for a DB cluster snapshot. Must match the identifier of an existing snapshot.
     * </p>
     * <p>
     * After you restore a DB cluster using a <code>DBClusterSnapshotIdentifier</code>, you must specify the same
     * <code>DBClusterSnapshotIdentifier</code> for any future updates to the DB cluster. When you specify this property
     * for an update, the DB cluster is not restored from the snapshot again, and the data in the database is not
     * changed.
     * </p>
     * <p>
     * However, if you don't specify the <code>DBClusterSnapshotIdentifier</code>, an empty DB cluster is created, and
     * the original DB cluster is deleted. If you specify a property that is different from the previous snapshot
     * restore property, the DB cluster is restored from the snapshot specified by the
     * <code>DBClusterSnapshotIdentifier</code>, and the original DB cluster is deleted.
     * </p>
     */
    private String dBClusterSnapshotIdentifier;
    /**
     * <p>
     * Specifies the DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * </p>
     */
    private java.util.Date snapshotCreateTime;
    /**
     * <p>
     * Specifies the name of the database engine.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * Specifies the allocated storage size in gibibytes (GiB).
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * Specifies the status of this DB cluster snapshot.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies the port that the DB cluster was listening on at the time of the snapshot.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * Provides the VPC ID associated with the DB cluster snapshot.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     */
    private java.util.Date clusterCreateTime;
    /**
     * <p>
     * Provides the master username for the DB cluster snapshot.
     * </p>
     */
    private String masterUsername;
    /**
     * <p>
     * Provides the version of the database engine for this DB cluster snapshot.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Provides the license model information for this DB cluster snapshot.
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * Provides the type of the DB cluster snapshot.
     * </p>
     */
    private String snapshotType;
    /**
     * <p>
     * Specifies the percentage of the estimated data that has been transferred.
     * </p>
     */
    private Integer percentProgress;
    /**
     * <p>
     * Specifies whether the DB cluster snapshot is encrypted.
     * </p>
     */
    private Boolean storageEncrypted;
    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster snapshot.
     * </p>
     */
    private String dBClusterSnapshotArn;
    /**
     * <p>
     * If the DB cluster snapshot was copied from a source DB cluster snapshot, the Amazon Resource Name (ARN) for the
     * source DB cluster snapshot, otherwise, a null value.
     * </p>
     */
    private String sourceDBClusterSnapshotArn;
    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     */
    private Boolean iAMDatabaseAuthenticationEnabled;

    /**
     * <p>
     * Provides the list of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
     * </p>
     * 
     * @return Provides the list of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * Provides the list of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
     * </p>
     * 
     * @param availabilityZones
     *        Provides the list of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * Provides the list of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        Provides the list of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the list of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
     * </p>
     * 
     * @param availabilityZones
     *        Provides the list of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * Specifies the identifier for a DB cluster snapshot. Must match the identifier of an existing snapshot.
     * </p>
     * <p>
     * After you restore a DB cluster using a <code>DBClusterSnapshotIdentifier</code>, you must specify the same
     * <code>DBClusterSnapshotIdentifier</code> for any future updates to the DB cluster. When you specify this property
     * for an update, the DB cluster is not restored from the snapshot again, and the data in the database is not
     * changed.
     * </p>
     * <p>
     * However, if you don't specify the <code>DBClusterSnapshotIdentifier</code>, an empty DB cluster is created, and
     * the original DB cluster is deleted. If you specify a property that is different from the previous snapshot
     * restore property, the DB cluster is restored from the snapshot specified by the
     * <code>DBClusterSnapshotIdentifier</code>, and the original DB cluster is deleted.
     * </p>
     * 
     * @param dBClusterSnapshotIdentifier
     *        Specifies the identifier for a DB cluster snapshot. Must match the identifier of an existing snapshot.</p>
     *        <p>
     *        After you restore a DB cluster using a <code>DBClusterSnapshotIdentifier</code>, you must specify the same
     *        <code>DBClusterSnapshotIdentifier</code> for any future updates to the DB cluster. When you specify this
     *        property for an update, the DB cluster is not restored from the snapshot again, and the data in the
     *        database is not changed.
     *        </p>
     *        <p>
     *        However, if you don't specify the <code>DBClusterSnapshotIdentifier</code>, an empty DB cluster is
     *        created, and the original DB cluster is deleted. If you specify a property that is different from the
     *        previous snapshot restore property, the DB cluster is restored from the snapshot specified by the
     *        <code>DBClusterSnapshotIdentifier</code>, and the original DB cluster is deleted.
     */

    public void setDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * Specifies the identifier for a DB cluster snapshot. Must match the identifier of an existing snapshot.
     * </p>
     * <p>
     * After you restore a DB cluster using a <code>DBClusterSnapshotIdentifier</code>, you must specify the same
     * <code>DBClusterSnapshotIdentifier</code> for any future updates to the DB cluster. When you specify this property
     * for an update, the DB cluster is not restored from the snapshot again, and the data in the database is not
     * changed.
     * </p>
     * <p>
     * However, if you don't specify the <code>DBClusterSnapshotIdentifier</code>, an empty DB cluster is created, and
     * the original DB cluster is deleted. If you specify a property that is different from the previous snapshot
     * restore property, the DB cluster is restored from the snapshot specified by the
     * <code>DBClusterSnapshotIdentifier</code>, and the original DB cluster is deleted.
     * </p>
     * 
     * @return Specifies the identifier for a DB cluster snapshot. Must match the identifier of an existing
     *         snapshot.</p>
     *         <p>
     *         After you restore a DB cluster using a <code>DBClusterSnapshotIdentifier</code>, you must specify the
     *         same <code>DBClusterSnapshotIdentifier</code> for any future updates to the DB cluster. When you specify
     *         this property for an update, the DB cluster is not restored from the snapshot again, and the data in the
     *         database is not changed.
     *         </p>
     *         <p>
     *         However, if you don't specify the <code>DBClusterSnapshotIdentifier</code>, an empty DB cluster is
     *         created, and the original DB cluster is deleted. If you specify a property that is different from the
     *         previous snapshot restore property, the DB cluster is restored from the snapshot specified by the
     *         <code>DBClusterSnapshotIdentifier</code>, and the original DB cluster is deleted.
     */

    public String getDBClusterSnapshotIdentifier() {
        return this.dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * Specifies the identifier for a DB cluster snapshot. Must match the identifier of an existing snapshot.
     * </p>
     * <p>
     * After you restore a DB cluster using a <code>DBClusterSnapshotIdentifier</code>, you must specify the same
     * <code>DBClusterSnapshotIdentifier</code> for any future updates to the DB cluster. When you specify this property
     * for an update, the DB cluster is not restored from the snapshot again, and the data in the database is not
     * changed.
     * </p>
     * <p>
     * However, if you don't specify the <code>DBClusterSnapshotIdentifier</code>, an empty DB cluster is created, and
     * the original DB cluster is deleted. If you specify a property that is different from the previous snapshot
     * restore property, the DB cluster is restored from the snapshot specified by the
     * <code>DBClusterSnapshotIdentifier</code>, and the original DB cluster is deleted.
     * </p>
     * 
     * @param dBClusterSnapshotIdentifier
     *        Specifies the identifier for a DB cluster snapshot. Must match the identifier of an existing snapshot.</p>
     *        <p>
     *        After you restore a DB cluster using a <code>DBClusterSnapshotIdentifier</code>, you must specify the same
     *        <code>DBClusterSnapshotIdentifier</code> for any future updates to the DB cluster. When you specify this
     *        property for an update, the DB cluster is not restored from the snapshot again, and the data in the
     *        database is not changed.
     *        </p>
     *        <p>
     *        However, if you don't specify the <code>DBClusterSnapshotIdentifier</code>, an empty DB cluster is
     *        created, and the original DB cluster is deleted. If you specify a property that is different from the
     *        previous snapshot restore property, the DB cluster is restored from the snapshot specified by the
     *        <code>DBClusterSnapshotIdentifier</code>, and the original DB cluster is deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        setDBClusterSnapshotIdentifier(dBClusterSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies the DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        Specifies the DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * Specifies the DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
     * </p>
     * 
     * @return Specifies the DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * Specifies the DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        Specifies the DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param snapshotCreateTime
     *        Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     */

    public void setSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
    }

    /**
     * <p>
     * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     */

    public java.util.Date getSnapshotCreateTime() {
        return this.snapshotCreateTime;
    }

    /**
     * <p>
     * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param snapshotCreateTime
     *        Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        setSnapshotCreateTime(snapshotCreateTime);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the database engine.
     * </p>
     * 
     * @param engine
     *        Specifies the name of the database engine.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * Specifies the name of the database engine.
     * </p>
     * 
     * @return Specifies the name of the database engine.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * Specifies the name of the database engine.
     * </p>
     * 
     * @param engine
     *        Specifies the name of the database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * Specifies the allocated storage size in gibibytes (GiB).
     * </p>
     * 
     * @param allocatedStorage
     *        Specifies the allocated storage size in gibibytes (GiB).
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * Specifies the allocated storage size in gibibytes (GiB).
     * </p>
     * 
     * @return Specifies the allocated storage size in gibibytes (GiB).
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * Specifies the allocated storage size in gibibytes (GiB).
     * </p>
     * 
     * @param allocatedStorage
     *        Specifies the allocated storage size in gibibytes (GiB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * Specifies the status of this DB cluster snapshot.
     * </p>
     * 
     * @param status
     *        Specifies the status of this DB cluster snapshot.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status of this DB cluster snapshot.
     * </p>
     * 
     * @return Specifies the status of this DB cluster snapshot.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the status of this DB cluster snapshot.
     * </p>
     * 
     * @param status
     *        Specifies the status of this DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies the port that the DB cluster was listening on at the time of the snapshot.
     * </p>
     * 
     * @param port
     *        Specifies the port that the DB cluster was listening on at the time of the snapshot.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Specifies the port that the DB cluster was listening on at the time of the snapshot.
     * </p>
     * 
     * @return Specifies the port that the DB cluster was listening on at the time of the snapshot.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * Specifies the port that the DB cluster was listening on at the time of the snapshot.
     * </p>
     * 
     * @param port
     *        Specifies the port that the DB cluster was listening on at the time of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * Provides the VPC ID associated with the DB cluster snapshot.
     * </p>
     * 
     * @param vpcId
     *        Provides the VPC ID associated with the DB cluster snapshot.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * Provides the VPC ID associated with the DB cluster snapshot.
     * </p>
     * 
     * @return Provides the VPC ID associated with the DB cluster snapshot.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * Provides the VPC ID associated with the DB cluster snapshot.
     * </p>
     * 
     * @param vpcId
     *        Provides the VPC ID associated with the DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param clusterCreateTime
     *        Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
     */

    public void setClusterCreateTime(java.util.Date clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
    }

    /**
     * <p>
     * Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
     */

    public java.util.Date getClusterCreateTime() {
        return this.clusterCreateTime;
    }

    /**
     * <p>
     * Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param clusterCreateTime
     *        Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withClusterCreateTime(java.util.Date clusterCreateTime) {
        setClusterCreateTime(clusterCreateTime);
        return this;
    }

    /**
     * <p>
     * Provides the master username for the DB cluster snapshot.
     * </p>
     * 
     * @param masterUsername
     *        Provides the master username for the DB cluster snapshot.
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * Provides the master username for the DB cluster snapshot.
     * </p>
     * 
     * @return Provides the master username for the DB cluster snapshot.
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * Provides the master username for the DB cluster snapshot.
     * </p>
     * 
     * @param masterUsername
     *        Provides the master username for the DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * Provides the version of the database engine for this DB cluster snapshot.
     * </p>
     * 
     * @param engineVersion
     *        Provides the version of the database engine for this DB cluster snapshot.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * Provides the version of the database engine for this DB cluster snapshot.
     * </p>
     * 
     * @return Provides the version of the database engine for this DB cluster snapshot.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * Provides the version of the database engine for this DB cluster snapshot.
     * </p>
     * 
     * @param engineVersion
     *        Provides the version of the database engine for this DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Provides the license model information for this DB cluster snapshot.
     * </p>
     * 
     * @param licenseModel
     *        Provides the license model information for this DB cluster snapshot.
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * Provides the license model information for this DB cluster snapshot.
     * </p>
     * 
     * @return Provides the license model information for this DB cluster snapshot.
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * Provides the license model information for this DB cluster snapshot.
     * </p>
     * 
     * @param licenseModel
     *        Provides the license model information for this DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * Provides the type of the DB cluster snapshot.
     * </p>
     * 
     * @param snapshotType
     *        Provides the type of the DB cluster snapshot.
     */

    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * Provides the type of the DB cluster snapshot.
     * </p>
     * 
     * @return Provides the type of the DB cluster snapshot.
     */

    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * <p>
     * Provides the type of the DB cluster snapshot.
     * </p>
     * 
     * @param snapshotType
     *        Provides the type of the DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withSnapshotType(String snapshotType) {
        setSnapshotType(snapshotType);
        return this;
    }

    /**
     * <p>
     * Specifies the percentage of the estimated data that has been transferred.
     * </p>
     * 
     * @param percentProgress
     *        Specifies the percentage of the estimated data that has been transferred.
     */

    public void setPercentProgress(Integer percentProgress) {
        this.percentProgress = percentProgress;
    }

    /**
     * <p>
     * Specifies the percentage of the estimated data that has been transferred.
     * </p>
     * 
     * @return Specifies the percentage of the estimated data that has been transferred.
     */

    public Integer getPercentProgress() {
        return this.percentProgress;
    }

    /**
     * <p>
     * Specifies the percentage of the estimated data that has been transferred.
     * </p>
     * 
     * @param percentProgress
     *        Specifies the percentage of the estimated data that has been transferred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withPercentProgress(Integer percentProgress) {
        setPercentProgress(percentProgress);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB cluster snapshot is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Specifies whether the DB cluster snapshot is encrypted.
     */

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB cluster snapshot is encrypted.
     * </p>
     * 
     * @return Specifies whether the DB cluster snapshot is encrypted.
     */

    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB cluster snapshot is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Specifies whether the DB cluster snapshot is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withStorageEncrypted(Boolean storageEncrypted) {
        setStorageEncrypted(storageEncrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB cluster snapshot is encrypted.
     * </p>
     * 
     * @return Specifies whether the DB cluster snapshot is encrypted.
     */

    public Boolean isStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB cluster
     *        snapshot.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
     * </p>
     * 
     * @return If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB cluster
     *         snapshot.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB cluster
     *        snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster snapshot.
     * </p>
     * 
     * @param dBClusterSnapshotArn
     *        The Amazon Resource Name (ARN) for the DB cluster snapshot.
     */

    public void setDBClusterSnapshotArn(String dBClusterSnapshotArn) {
        this.dBClusterSnapshotArn = dBClusterSnapshotArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster snapshot.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the DB cluster snapshot.
     */

    public String getDBClusterSnapshotArn() {
        return this.dBClusterSnapshotArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster snapshot.
     * </p>
     * 
     * @param dBClusterSnapshotArn
     *        The Amazon Resource Name (ARN) for the DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withDBClusterSnapshotArn(String dBClusterSnapshotArn) {
        setDBClusterSnapshotArn(dBClusterSnapshotArn);
        return this;
    }

    /**
     * <p>
     * If the DB cluster snapshot was copied from a source DB cluster snapshot, the Amazon Resource Name (ARN) for the
     * source DB cluster snapshot, otherwise, a null value.
     * </p>
     * 
     * @param sourceDBClusterSnapshotArn
     *        If the DB cluster snapshot was copied from a source DB cluster snapshot, the Amazon Resource Name (ARN)
     *        for the source DB cluster snapshot, otherwise, a null value.
     */

    public void setSourceDBClusterSnapshotArn(String sourceDBClusterSnapshotArn) {
        this.sourceDBClusterSnapshotArn = sourceDBClusterSnapshotArn;
    }

    /**
     * <p>
     * If the DB cluster snapshot was copied from a source DB cluster snapshot, the Amazon Resource Name (ARN) for the
     * source DB cluster snapshot, otherwise, a null value.
     * </p>
     * 
     * @return If the DB cluster snapshot was copied from a source DB cluster snapshot, the Amazon Resource Name (ARN)
     *         for the source DB cluster snapshot, otherwise, a null value.
     */

    public String getSourceDBClusterSnapshotArn() {
        return this.sourceDBClusterSnapshotArn;
    }

    /**
     * <p>
     * If the DB cluster snapshot was copied from a source DB cluster snapshot, the Amazon Resource Name (ARN) for the
     * source DB cluster snapshot, otherwise, a null value.
     * </p>
     * 
     * @param sourceDBClusterSnapshotArn
     *        If the DB cluster snapshot was copied from a source DB cluster snapshot, the Amazon Resource Name (ARN)
     *        for the source DB cluster snapshot, otherwise, a null value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withSourceDBClusterSnapshotArn(String sourceDBClusterSnapshotArn) {
        setSourceDBClusterSnapshotArn(sourceDBClusterSnapshotArn);
        return this;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * 
     * @param iAMDatabaseAuthenticationEnabled
     *        True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *        otherwise false.
     */

    public void setIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        this.iAMDatabaseAuthenticationEnabled = iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * 
     * @return True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *         otherwise false.
     */

    public Boolean getIAMDatabaseAuthenticationEnabled() {
        return this.iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * 
     * @param iAMDatabaseAuthenticationEnabled
     *        True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *        otherwise false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        setIAMDatabaseAuthenticationEnabled(iAMDatabaseAuthenticationEnabled);
        return this;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * 
     * @return True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *         otherwise false.
     */

    public Boolean isIAMDatabaseAuthenticationEnabled() {
        return this.iAMDatabaseAuthenticationEnabled;
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getDBClusterSnapshotIdentifier() != null)
            sb.append("DBClusterSnapshotIdentifier: ").append(getDBClusterSnapshotIdentifier()).append(",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getSnapshotCreateTime() != null)
            sb.append("SnapshotCreateTime: ").append(getSnapshotCreateTime()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getClusterCreateTime() != null)
            sb.append("ClusterCreateTime: ").append(getClusterCreateTime()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: ").append(getSnapshotType()).append(",");
        if (getPercentProgress() != null)
            sb.append("PercentProgress: ").append(getPercentProgress()).append(",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: ").append(getStorageEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getDBClusterSnapshotArn() != null)
            sb.append("DBClusterSnapshotArn: ").append(getDBClusterSnapshotArn()).append(",");
        if (getSourceDBClusterSnapshotArn() != null)
            sb.append("SourceDBClusterSnapshotArn: ").append(getSourceDBClusterSnapshotArn()).append(",");
        if (getIAMDatabaseAuthenticationEnabled() != null)
            sb.append("IAMDatabaseAuthenticationEnabled: ").append(getIAMDatabaseAuthenticationEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBClusterSnapshot == false)
            return false;
        DBClusterSnapshot other = (DBClusterSnapshot) obj;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getDBClusterSnapshotIdentifier() == null ^ this.getDBClusterSnapshotIdentifier() == null)
            return false;
        if (other.getDBClusterSnapshotIdentifier() != null && other.getDBClusterSnapshotIdentifier().equals(this.getDBClusterSnapshotIdentifier()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getSnapshotCreateTime() == null ^ this.getSnapshotCreateTime() == null)
            return false;
        if (other.getSnapshotCreateTime() != null && other.getSnapshotCreateTime().equals(this.getSnapshotCreateTime()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getClusterCreateTime() == null ^ this.getClusterCreateTime() == null)
            return false;
        if (other.getClusterCreateTime() != null && other.getClusterCreateTime().equals(this.getClusterCreateTime()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null)
            return false;
        if (other.getSnapshotType() != null && other.getSnapshotType().equals(this.getSnapshotType()) == false)
            return false;
        if (other.getPercentProgress() == null ^ this.getPercentProgress() == null)
            return false;
        if (other.getPercentProgress() != null && other.getPercentProgress().equals(this.getPercentProgress()) == false)
            return false;
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getDBClusterSnapshotArn() == null ^ this.getDBClusterSnapshotArn() == null)
            return false;
        if (other.getDBClusterSnapshotArn() != null && other.getDBClusterSnapshotArn().equals(this.getDBClusterSnapshotArn()) == false)
            return false;
        if (other.getSourceDBClusterSnapshotArn() == null ^ this.getSourceDBClusterSnapshotArn() == null)
            return false;
        if (other.getSourceDBClusterSnapshotArn() != null && other.getSourceDBClusterSnapshotArn().equals(this.getSourceDBClusterSnapshotArn()) == false)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() == null ^ this.getIAMDatabaseAuthenticationEnabled() == null)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() != null
                && other.getIAMDatabaseAuthenticationEnabled().equals(this.getIAMDatabaseAuthenticationEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getDBClusterSnapshotIdentifier() == null) ? 0 : getDBClusterSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSnapshotCreateTime() == null) ? 0 : getSnapshotCreateTime().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getClusterCreateTime() == null) ? 0 : getClusterCreateTime().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode());
        hashCode = prime * hashCode + ((getPercentProgress() == null) ? 0 : getPercentProgress().hashCode());
        hashCode = prime * hashCode + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDBClusterSnapshotArn() == null) ? 0 : getDBClusterSnapshotArn().hashCode());
        hashCode = prime * hashCode + ((getSourceDBClusterSnapshotArn() == null) ? 0 : getSourceDBClusterSnapshotArn().hashCode());
        hashCode = prime * hashCode + ((getIAMDatabaseAuthenticationEnabled() == null) ? 0 : getIAMDatabaseAuthenticationEnabled().hashCode());
        return hashCode;
    }

    @Override
    public DBClusterSnapshot clone() {
        try {
            return (DBClusterSnapshot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
