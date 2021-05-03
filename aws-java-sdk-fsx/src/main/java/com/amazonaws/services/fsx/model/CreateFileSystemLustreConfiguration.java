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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Lustre configuration for the file system being created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystemLustreConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFileSystemLustreConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * (Optional) The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone, where
     * d is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
     * </p>
     */
    private String weeklyMaintenanceStartTime;
    /**
     * <p>
     * (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're using as the data
     * repository for your Amazon FSx for Lustre file system. The root of your FSx for Lustre file system will be mapped
     * to the root of the Amazon S3 bucket you select. An example is <code>s3://import-bucket/optional-prefix</code>. If
     * you specify a prefix after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file
     * system.
     * </p>
     */
    private String importPath;
    /**
     * <p>
     * (Optional) The path in Amazon S3 where the root of your Amazon FSx file system is exported. The path must use the
     * same Amazon S3 bucket as specified in ImportPath. You can provide an optional prefix to which new and changed
     * data is to be exported from your Amazon FSx for Lustre file system. If an <code>ExportPath</code> value is not
     * provided, Amazon FSx sets a default export path, <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>.
     * The timestamp is in UTC format, for example <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.
     * </p>
     * <p>
     * The Amazon S3 export bucket must be the same as the import bucket specified by <code>ImportPath</code>. If you
     * only specify a bucket name, such as <code>s3://import-bucket</code>, you get a 1:1 mapping of file system objects
     * to S3 bucket objects. This mapping means that the input data in S3 is overwritten on export. If you provide a
     * custom prefix in the export path, such as <code>s3://import-bucket/[custom-optional-prefix]</code>, Amazon FSx
     * exports the contents of your file system to that export prefix in the Amazon S3 bucket.
     * </p>
     */
    private String exportPath;
    /**
     * <p>
     * (Optional) For files imported from a data repository, this value determines the stripe count and maximum amount
     * of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be
     * striped across is limited by the total number of disks that make up the file system.
     * </p>
     * <p>
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a
     * maximum size of 5 TB.
     * </p>
     */
    private Integer importedFileChunkSize;
    /**
     * <p>
     * Choose <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types when you need temporary storage and
     * shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides in-transit encryption of
     * data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * Choose <code>PERSISTENT_1</code> deployment type for longer-term storage and workloads and encryption of data in
     * transit. To learn more about deployment types, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre Deployment
     * Options</a>.
     * </p>
     * <p>
     * Encryption of data in-transit is automatically enabled when you access a <code>SCRATCH_2</code> or
     * <code>PERSISTENT_1</code> file system from Amazon EC2 instances that <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html">support this feature</a>.
     * (Default = <code>SCRATCH_1</code>)
     * </p>
     * <p>
     * Encryption of data in-transit for <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types is
     * supported when accessed from supported instance types in supported AWS Regions. To learn more, <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html">Encrypting Data in
     * Transit</a>.
     * </p>
     */
    private String deploymentType;
    /**
     * <p>
     * (Optional) When you create your file system, your existing S3 objects appear as file and directory listings. Use
     * this property to choose how Amazon FSx keeps your file and directory listings up to date as you add or modify
     * objects in your linked S3 bucket. <code>AutoImportPolicy</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from the
     * linked S3 bucket when the file system is created. FSx does not update file and directory listings for any new or
     * changed objects after choosing this option.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code> - AutoImport is on. Amazon FSx automatically imports directory listings of any new objects added
     * to the linked S3 bucket that do not currently exist in the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_CHANGED</code> - AutoImport is on. Amazon FSx automatically imports file and directory listings of any
     * new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after you choose
     * this option.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import updates
     * from your S3 bucket</a>.
     * </p>
     */
    private String autoImportPolicy;
    /**
     * <p>
     * Required for the <code>PERSISTENT_1</code> deployment type, describes the amount of read and write throughput for
     * each 1 tebibyte of storage, in MB/s/TiB. File system throughput capacity is calculated by multiplying ﬁle system
     * storage capacity (TiB) by the PerUnitStorageThroughput (MB/s/TiB). For a 2.4 TiB ﬁle system, provisioning 50
     * MB/s/TiB of PerUnitStorageThroughput yields 120 MB/s of ﬁle system throughput. You pay for the amount of
     * throughput that you provision.
     * </p>
     * <p>
     * Valid values for SSD storage: 50, 100, 200. Valid values for HDD storage: 12, 40.
     * </p>
     */
    private Integer perUnitStorageThroughput;

    private String dailyAutomaticBackupStartTime;

    private Integer automaticBackupRetentionDays;
    /**
     * <p>
     * (Optional) Not available to use with file systems that are linked to a data repository. A boolean flag indicating
     * whether tags for the file system should be copied to backups. The default value is false. If it's set to true,
     * all file system tags are copied to all automatic and user-initiated backups when the user doesn't specify any
     * backup-specific tags. If this value is true, and you specify one or more backup tags, only the specified tags are
     * copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from
     * the file system, regardless of this value.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html">Working with backups</a>.
     * </p>
     */
    private Boolean copyTagsToBackups;
    /**
     * <p>
     * The type of drive cache used by PERSISTENT_1 file systems that are provisioned with HDD storage devices. This
     * parameter is required when storage type is HDD. Set to <code>READ</code>, improve the performance for frequently
     * accessed files and allows 20% of the total storage capacity of the file system to be cached.
     * </p>
     * <p>
     * This parameter is required when <code>StorageType</code> is set to HDD.
     * </p>
     */
    private String driveCacheType;

    /**
     * <p>
     * (Optional) The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone, where
     * d is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
     * </p>
     * 
     * @param weeklyMaintenanceStartTime
     *        (Optional) The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone,
     *        where d is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
     */

    public void setWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * (Optional) The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone, where
     * d is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
     * </p>
     * 
     * @return (Optional) The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time
     *         zone, where d is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
     */

    public String getWeeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * (Optional) The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone, where
     * d is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
     * </p>
     * 
     * @param weeklyMaintenanceStartTime
     *        (Optional) The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone,
     *        where d is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemLustreConfiguration withWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        setWeeklyMaintenanceStartTime(weeklyMaintenanceStartTime);
        return this;
    }

    /**
     * <p>
     * (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're using as the data
     * repository for your Amazon FSx for Lustre file system. The root of your FSx for Lustre file system will be mapped
     * to the root of the Amazon S3 bucket you select. An example is <code>s3://import-bucket/optional-prefix</code>. If
     * you specify a prefix after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file
     * system.
     * </p>
     * 
     * @param importPath
     *        (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're using as the data
     *        repository for your Amazon FSx for Lustre file system. The root of your FSx for Lustre file system will be
     *        mapped to the root of the Amazon S3 bucket you select. An example is
     *        <code>s3://import-bucket/optional-prefix</code>. If you specify a prefix after the Amazon S3 bucket name,
     *        only object keys with that prefix are loaded into the file system.
     */

    public void setImportPath(String importPath) {
        this.importPath = importPath;
    }

    /**
     * <p>
     * (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're using as the data
     * repository for your Amazon FSx for Lustre file system. The root of your FSx for Lustre file system will be mapped
     * to the root of the Amazon S3 bucket you select. An example is <code>s3://import-bucket/optional-prefix</code>. If
     * you specify a prefix after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file
     * system.
     * </p>
     * 
     * @return (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're using as the data
     *         repository for your Amazon FSx for Lustre file system. The root of your FSx for Lustre file system will
     *         be mapped to the root of the Amazon S3 bucket you select. An example is
     *         <code>s3://import-bucket/optional-prefix</code>. If you specify a prefix after the Amazon S3 bucket name,
     *         only object keys with that prefix are loaded into the file system.
     */

    public String getImportPath() {
        return this.importPath;
    }

    /**
     * <p>
     * (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're using as the data
     * repository for your Amazon FSx for Lustre file system. The root of your FSx for Lustre file system will be mapped
     * to the root of the Amazon S3 bucket you select. An example is <code>s3://import-bucket/optional-prefix</code>. If
     * you specify a prefix after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file
     * system.
     * </p>
     * 
     * @param importPath
     *        (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're using as the data
     *        repository for your Amazon FSx for Lustre file system. The root of your FSx for Lustre file system will be
     *        mapped to the root of the Amazon S3 bucket you select. An example is
     *        <code>s3://import-bucket/optional-prefix</code>. If you specify a prefix after the Amazon S3 bucket name,
     *        only object keys with that prefix are loaded into the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemLustreConfiguration withImportPath(String importPath) {
        setImportPath(importPath);
        return this;
    }

    /**
     * <p>
     * (Optional) The path in Amazon S3 where the root of your Amazon FSx file system is exported. The path must use the
     * same Amazon S3 bucket as specified in ImportPath. You can provide an optional prefix to which new and changed
     * data is to be exported from your Amazon FSx for Lustre file system. If an <code>ExportPath</code> value is not
     * provided, Amazon FSx sets a default export path, <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>.
     * The timestamp is in UTC format, for example <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.
     * </p>
     * <p>
     * The Amazon S3 export bucket must be the same as the import bucket specified by <code>ImportPath</code>. If you
     * only specify a bucket name, such as <code>s3://import-bucket</code>, you get a 1:1 mapping of file system objects
     * to S3 bucket objects. This mapping means that the input data in S3 is overwritten on export. If you provide a
     * custom prefix in the export path, such as <code>s3://import-bucket/[custom-optional-prefix]</code>, Amazon FSx
     * exports the contents of your file system to that export prefix in the Amazon S3 bucket.
     * </p>
     * 
     * @param exportPath
     *        (Optional) The path in Amazon S3 where the root of your Amazon FSx file system is exported. The path must
     *        use the same Amazon S3 bucket as specified in ImportPath. You can provide an optional prefix to which new
     *        and changed data is to be exported from your Amazon FSx for Lustre file system. If an
     *        <code>ExportPath</code> value is not provided, Amazon FSx sets a default export path,
     *        <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>. The timestamp is in UTC format, for example
     *        <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.</p>
     *        <p>
     *        The Amazon S3 export bucket must be the same as the import bucket specified by <code>ImportPath</code>. If
     *        you only specify a bucket name, such as <code>s3://import-bucket</code>, you get a 1:1 mapping of file
     *        system objects to S3 bucket objects. This mapping means that the input data in S3 is overwritten on
     *        export. If you provide a custom prefix in the export path, such as
     *        <code>s3://import-bucket/[custom-optional-prefix]</code>, Amazon FSx exports the contents of your file
     *        system to that export prefix in the Amazon S3 bucket.
     */

    public void setExportPath(String exportPath) {
        this.exportPath = exportPath;
    }

    /**
     * <p>
     * (Optional) The path in Amazon S3 where the root of your Amazon FSx file system is exported. The path must use the
     * same Amazon S3 bucket as specified in ImportPath. You can provide an optional prefix to which new and changed
     * data is to be exported from your Amazon FSx for Lustre file system. If an <code>ExportPath</code> value is not
     * provided, Amazon FSx sets a default export path, <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>.
     * The timestamp is in UTC format, for example <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.
     * </p>
     * <p>
     * The Amazon S3 export bucket must be the same as the import bucket specified by <code>ImportPath</code>. If you
     * only specify a bucket name, such as <code>s3://import-bucket</code>, you get a 1:1 mapping of file system objects
     * to S3 bucket objects. This mapping means that the input data in S3 is overwritten on export. If you provide a
     * custom prefix in the export path, such as <code>s3://import-bucket/[custom-optional-prefix]</code>, Amazon FSx
     * exports the contents of your file system to that export prefix in the Amazon S3 bucket.
     * </p>
     * 
     * @return (Optional) The path in Amazon S3 where the root of your Amazon FSx file system is exported. The path must
     *         use the same Amazon S3 bucket as specified in ImportPath. You can provide an optional prefix to which new
     *         and changed data is to be exported from your Amazon FSx for Lustre file system. If an
     *         <code>ExportPath</code> value is not provided, Amazon FSx sets a default export path,
     *         <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>. The timestamp is in UTC format, for
     *         example <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.</p>
     *         <p>
     *         The Amazon S3 export bucket must be the same as the import bucket specified by <code>ImportPath</code>.
     *         If you only specify a bucket name, such as <code>s3://import-bucket</code>, you get a 1:1 mapping of file
     *         system objects to S3 bucket objects. This mapping means that the input data in S3 is overwritten on
     *         export. If you provide a custom prefix in the export path, such as
     *         <code>s3://import-bucket/[custom-optional-prefix]</code>, Amazon FSx exports the contents of your file
     *         system to that export prefix in the Amazon S3 bucket.
     */

    public String getExportPath() {
        return this.exportPath;
    }

    /**
     * <p>
     * (Optional) The path in Amazon S3 where the root of your Amazon FSx file system is exported. The path must use the
     * same Amazon S3 bucket as specified in ImportPath. You can provide an optional prefix to which new and changed
     * data is to be exported from your Amazon FSx for Lustre file system. If an <code>ExportPath</code> value is not
     * provided, Amazon FSx sets a default export path, <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>.
     * The timestamp is in UTC format, for example <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.
     * </p>
     * <p>
     * The Amazon S3 export bucket must be the same as the import bucket specified by <code>ImportPath</code>. If you
     * only specify a bucket name, such as <code>s3://import-bucket</code>, you get a 1:1 mapping of file system objects
     * to S3 bucket objects. This mapping means that the input data in S3 is overwritten on export. If you provide a
     * custom prefix in the export path, such as <code>s3://import-bucket/[custom-optional-prefix]</code>, Amazon FSx
     * exports the contents of your file system to that export prefix in the Amazon S3 bucket.
     * </p>
     * 
     * @param exportPath
     *        (Optional) The path in Amazon S3 where the root of your Amazon FSx file system is exported. The path must
     *        use the same Amazon S3 bucket as specified in ImportPath. You can provide an optional prefix to which new
     *        and changed data is to be exported from your Amazon FSx for Lustre file system. If an
     *        <code>ExportPath</code> value is not provided, Amazon FSx sets a default export path,
     *        <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>. The timestamp is in UTC format, for example
     *        <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.</p>
     *        <p>
     *        The Amazon S3 export bucket must be the same as the import bucket specified by <code>ImportPath</code>. If
     *        you only specify a bucket name, such as <code>s3://import-bucket</code>, you get a 1:1 mapping of file
     *        system objects to S3 bucket objects. This mapping means that the input data in S3 is overwritten on
     *        export. If you provide a custom prefix in the export path, such as
     *        <code>s3://import-bucket/[custom-optional-prefix]</code>, Amazon FSx exports the contents of your file
     *        system to that export prefix in the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemLustreConfiguration withExportPath(String exportPath) {
        setExportPath(exportPath);
        return this;
    }

    /**
     * <p>
     * (Optional) For files imported from a data repository, this value determines the stripe count and maximum amount
     * of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be
     * striped across is limited by the total number of disks that make up the file system.
     * </p>
     * <p>
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a
     * maximum size of 5 TB.
     * </p>
     * 
     * @param importedFileChunkSize
     *        (Optional) For files imported from a data repository, this value determines the stripe count and maximum
     *        amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a
     *        single file can be striped across is limited by the total number of disks that make up the file
     *        system.</p>
     *        <p>
     *        The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects
     *        have a maximum size of 5 TB.
     */

    public void setImportedFileChunkSize(Integer importedFileChunkSize) {
        this.importedFileChunkSize = importedFileChunkSize;
    }

    /**
     * <p>
     * (Optional) For files imported from a data repository, this value determines the stripe count and maximum amount
     * of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be
     * striped across is limited by the total number of disks that make up the file system.
     * </p>
     * <p>
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a
     * maximum size of 5 TB.
     * </p>
     * 
     * @return (Optional) For files imported from a data repository, this value determines the stripe count and maximum
     *         amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a
     *         single file can be striped across is limited by the total number of disks that make up the file
     *         system.</p>
     *         <p>
     *         The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3
     *         objects have a maximum size of 5 TB.
     */

    public Integer getImportedFileChunkSize() {
        return this.importedFileChunkSize;
    }

    /**
     * <p>
     * (Optional) For files imported from a data repository, this value determines the stripe count and maximum amount
     * of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be
     * striped across is limited by the total number of disks that make up the file system.
     * </p>
     * <p>
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a
     * maximum size of 5 TB.
     * </p>
     * 
     * @param importedFileChunkSize
     *        (Optional) For files imported from a data repository, this value determines the stripe count and maximum
     *        amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a
     *        single file can be striped across is limited by the total number of disks that make up the file
     *        system.</p>
     *        <p>
     *        The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects
     *        have a maximum size of 5 TB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemLustreConfiguration withImportedFileChunkSize(Integer importedFileChunkSize) {
        setImportedFileChunkSize(importedFileChunkSize);
        return this;
    }

    /**
     * <p>
     * Choose <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types when you need temporary storage and
     * shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides in-transit encryption of
     * data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * Choose <code>PERSISTENT_1</code> deployment type for longer-term storage and workloads and encryption of data in
     * transit. To learn more about deployment types, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre Deployment
     * Options</a>.
     * </p>
     * <p>
     * Encryption of data in-transit is automatically enabled when you access a <code>SCRATCH_2</code> or
     * <code>PERSISTENT_1</code> file system from Amazon EC2 instances that <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html">support this feature</a>.
     * (Default = <code>SCRATCH_1</code>)
     * </p>
     * <p>
     * Encryption of data in-transit for <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types is
     * supported when accessed from supported instance types in supported AWS Regions. To learn more, <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html">Encrypting Data in
     * Transit</a>.
     * </p>
     * 
     * @param deploymentType
     *        Choose <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types when you need temporary storage
     *        and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides in-transit
     *        encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.</p>
     *        <p>
     *        Choose <code>PERSISTENT_1</code> deployment type for longer-term storage and workloads and encryption of
     *        data in transit. To learn more about deployment types, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre
     *        Deployment Options</a>.
     *        </p>
     *        <p>
     *        Encryption of data in-transit is automatically enabled when you access a <code>SCRATCH_2</code> or
     *        <code>PERSISTENT_1</code> file system from Amazon EC2 instances that <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html">support this feature</a>.
     *        (Default = <code>SCRATCH_1</code>)
     *        </p>
     *        <p>
     *        Encryption of data in-transit for <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types is
     *        supported when accessed from supported instance types in supported AWS Regions. To learn more, <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html">Encrypting Data
     *        in Transit</a>.
     * @see LustreDeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * Choose <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types when you need temporary storage and
     * shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides in-transit encryption of
     * data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * Choose <code>PERSISTENT_1</code> deployment type for longer-term storage and workloads and encryption of data in
     * transit. To learn more about deployment types, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre Deployment
     * Options</a>.
     * </p>
     * <p>
     * Encryption of data in-transit is automatically enabled when you access a <code>SCRATCH_2</code> or
     * <code>PERSISTENT_1</code> file system from Amazon EC2 instances that <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html">support this feature</a>.
     * (Default = <code>SCRATCH_1</code>)
     * </p>
     * <p>
     * Encryption of data in-transit for <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types is
     * supported when accessed from supported instance types in supported AWS Regions. To learn more, <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html">Encrypting Data in
     * Transit</a>.
     * </p>
     * 
     * @return Choose <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types when you need temporary storage
     *         and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides in-transit
     *         encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.</p>
     *         <p>
     *         Choose <code>PERSISTENT_1</code> deployment type for longer-term storage and workloads and encryption of
     *         data in transit. To learn more about deployment types, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre
     *         Deployment Options</a>.
     *         </p>
     *         <p>
     *         Encryption of data in-transit is automatically enabled when you access a <code>SCRATCH_2</code> or
     *         <code>PERSISTENT_1</code> file system from Amazon EC2 instances that <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html">support this
     *         feature</a>. (Default = <code>SCRATCH_1</code>)
     *         </p>
     *         <p>
     *         Encryption of data in-transit for <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types
     *         is supported when accessed from supported instance types in supported AWS Regions. To learn more, <a
     *         href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html">Encrypting Data
     *         in Transit</a>.
     * @see LustreDeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * Choose <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types when you need temporary storage and
     * shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides in-transit encryption of
     * data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * Choose <code>PERSISTENT_1</code> deployment type for longer-term storage and workloads and encryption of data in
     * transit. To learn more about deployment types, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre Deployment
     * Options</a>.
     * </p>
     * <p>
     * Encryption of data in-transit is automatically enabled when you access a <code>SCRATCH_2</code> or
     * <code>PERSISTENT_1</code> file system from Amazon EC2 instances that <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html">support this feature</a>.
     * (Default = <code>SCRATCH_1</code>)
     * </p>
     * <p>
     * Encryption of data in-transit for <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types is
     * supported when accessed from supported instance types in supported AWS Regions. To learn more, <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html">Encrypting Data in
     * Transit</a>.
     * </p>
     * 
     * @param deploymentType
     *        Choose <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types when you need temporary storage
     *        and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides in-transit
     *        encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.</p>
     *        <p>
     *        Choose <code>PERSISTENT_1</code> deployment type for longer-term storage and workloads and encryption of
     *        data in transit. To learn more about deployment types, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre
     *        Deployment Options</a>.
     *        </p>
     *        <p>
     *        Encryption of data in-transit is automatically enabled when you access a <code>SCRATCH_2</code> or
     *        <code>PERSISTENT_1</code> file system from Amazon EC2 instances that <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html">support this feature</a>.
     *        (Default = <code>SCRATCH_1</code>)
     *        </p>
     *        <p>
     *        Encryption of data in-transit for <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types is
     *        supported when accessed from supported instance types in supported AWS Regions. To learn more, <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html">Encrypting Data
     *        in Transit</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LustreDeploymentType
     */

    public CreateFileSystemLustreConfiguration withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * Choose <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types when you need temporary storage and
     * shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides in-transit encryption of
     * data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * Choose <code>PERSISTENT_1</code> deployment type for longer-term storage and workloads and encryption of data in
     * transit. To learn more about deployment types, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre Deployment
     * Options</a>.
     * </p>
     * <p>
     * Encryption of data in-transit is automatically enabled when you access a <code>SCRATCH_2</code> or
     * <code>PERSISTENT_1</code> file system from Amazon EC2 instances that <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html">support this feature</a>.
     * (Default = <code>SCRATCH_1</code>)
     * </p>
     * <p>
     * Encryption of data in-transit for <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types is
     * supported when accessed from supported instance types in supported AWS Regions. To learn more, <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html">Encrypting Data in
     * Transit</a>.
     * </p>
     * 
     * @param deploymentType
     *        Choose <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types when you need temporary storage
     *        and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides in-transit
     *        encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.</p>
     *        <p>
     *        Choose <code>PERSISTENT_1</code> deployment type for longer-term storage and workloads and encryption of
     *        data in transit. To learn more about deployment types, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre
     *        Deployment Options</a>.
     *        </p>
     *        <p>
     *        Encryption of data in-transit is automatically enabled when you access a <code>SCRATCH_2</code> or
     *        <code>PERSISTENT_1</code> file system from Amazon EC2 instances that <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html">support this feature</a>.
     *        (Default = <code>SCRATCH_1</code>)
     *        </p>
     *        <p>
     *        Encryption of data in-transit for <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types is
     *        supported when accessed from supported instance types in supported AWS Regions. To learn more, <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html">Encrypting Data
     *        in Transit</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LustreDeploymentType
     */

    public CreateFileSystemLustreConfiguration withDeploymentType(LustreDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * (Optional) When you create your file system, your existing S3 objects appear as file and directory listings. Use
     * this property to choose how Amazon FSx keeps your file and directory listings up to date as you add or modify
     * objects in your linked S3 bucket. <code>AutoImportPolicy</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from the
     * linked S3 bucket when the file system is created. FSx does not update file and directory listings for any new or
     * changed objects after choosing this option.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code> - AutoImport is on. Amazon FSx automatically imports directory listings of any new objects added
     * to the linked S3 bucket that do not currently exist in the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_CHANGED</code> - AutoImport is on. Amazon FSx automatically imports file and directory listings of any
     * new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after you choose
     * this option.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import updates
     * from your S3 bucket</a>.
     * </p>
     * 
     * @param autoImportPolicy
     *        (Optional) When you create your file system, your existing S3 objects appear as file and directory
     *        listings. Use this property to choose how Amazon FSx keeps your file and directory listings up to date as
     *        you add or modify objects in your linked S3 bucket. <code>AutoImportPolicy</code> can have the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from
     *        the linked S3 bucket when the file system is created. FSx does not update file and directory listings for
     *        any new or changed objects after choosing this option.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW</code> - AutoImport is on. Amazon FSx automatically imports directory listings of any new
     *        objects added to the linked S3 bucket that do not currently exist in the FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_CHANGED</code> - AutoImport is on. Amazon FSx automatically imports file and directory listings
     *        of any new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after
     *        you choose this option.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import
     *        updates from your S3 bucket</a>.
     * @see AutoImportPolicyType
     */

    public void setAutoImportPolicy(String autoImportPolicy) {
        this.autoImportPolicy = autoImportPolicy;
    }

    /**
     * <p>
     * (Optional) When you create your file system, your existing S3 objects appear as file and directory listings. Use
     * this property to choose how Amazon FSx keeps your file and directory listings up to date as you add or modify
     * objects in your linked S3 bucket. <code>AutoImportPolicy</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from the
     * linked S3 bucket when the file system is created. FSx does not update file and directory listings for any new or
     * changed objects after choosing this option.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code> - AutoImport is on. Amazon FSx automatically imports directory listings of any new objects added
     * to the linked S3 bucket that do not currently exist in the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_CHANGED</code> - AutoImport is on. Amazon FSx automatically imports file and directory listings of any
     * new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after you choose
     * this option.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import updates
     * from your S3 bucket</a>.
     * </p>
     * 
     * @return (Optional) When you create your file system, your existing S3 objects appear as file and directory
     *         listings. Use this property to choose how Amazon FSx keeps your file and directory listings up to date as
     *         you add or modify objects in your linked S3 bucket. <code>AutoImportPolicy</code> can have the following
     *         values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code> - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from
     *         the linked S3 bucket when the file system is created. FSx does not update file and directory listings for
     *         any new or changed objects after choosing this option.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEW</code> - AutoImport is on. Amazon FSx automatically imports directory listings of any new
     *         objects added to the linked S3 bucket that do not currently exist in the FSx file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEW_CHANGED</code> - AutoImport is on. Amazon FSx automatically imports file and directory listings
     *         of any new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket
     *         after you choose this option.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import
     *         updates from your S3 bucket</a>.
     * @see AutoImportPolicyType
     */

    public String getAutoImportPolicy() {
        return this.autoImportPolicy;
    }

    /**
     * <p>
     * (Optional) When you create your file system, your existing S3 objects appear as file and directory listings. Use
     * this property to choose how Amazon FSx keeps your file and directory listings up to date as you add or modify
     * objects in your linked S3 bucket. <code>AutoImportPolicy</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from the
     * linked S3 bucket when the file system is created. FSx does not update file and directory listings for any new or
     * changed objects after choosing this option.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code> - AutoImport is on. Amazon FSx automatically imports directory listings of any new objects added
     * to the linked S3 bucket that do not currently exist in the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_CHANGED</code> - AutoImport is on. Amazon FSx automatically imports file and directory listings of any
     * new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after you choose
     * this option.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import updates
     * from your S3 bucket</a>.
     * </p>
     * 
     * @param autoImportPolicy
     *        (Optional) When you create your file system, your existing S3 objects appear as file and directory
     *        listings. Use this property to choose how Amazon FSx keeps your file and directory listings up to date as
     *        you add or modify objects in your linked S3 bucket. <code>AutoImportPolicy</code> can have the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from
     *        the linked S3 bucket when the file system is created. FSx does not update file and directory listings for
     *        any new or changed objects after choosing this option.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW</code> - AutoImport is on. Amazon FSx automatically imports directory listings of any new
     *        objects added to the linked S3 bucket that do not currently exist in the FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_CHANGED</code> - AutoImport is on. Amazon FSx automatically imports file and directory listings
     *        of any new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after
     *        you choose this option.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import
     *        updates from your S3 bucket</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoImportPolicyType
     */

    public CreateFileSystemLustreConfiguration withAutoImportPolicy(String autoImportPolicy) {
        setAutoImportPolicy(autoImportPolicy);
        return this;
    }

    /**
     * <p>
     * (Optional) When you create your file system, your existing S3 objects appear as file and directory listings. Use
     * this property to choose how Amazon FSx keeps your file and directory listings up to date as you add or modify
     * objects in your linked S3 bucket. <code>AutoImportPolicy</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from the
     * linked S3 bucket when the file system is created. FSx does not update file and directory listings for any new or
     * changed objects after choosing this option.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code> - AutoImport is on. Amazon FSx automatically imports directory listings of any new objects added
     * to the linked S3 bucket that do not currently exist in the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_CHANGED</code> - AutoImport is on. Amazon FSx automatically imports file and directory listings of any
     * new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after you choose
     * this option.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import updates
     * from your S3 bucket</a>.
     * </p>
     * 
     * @param autoImportPolicy
     *        (Optional) When you create your file system, your existing S3 objects appear as file and directory
     *        listings. Use this property to choose how Amazon FSx keeps your file and directory listings up to date as
     *        you add or modify objects in your linked S3 bucket. <code>AutoImportPolicy</code> can have the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from
     *        the linked S3 bucket when the file system is created. FSx does not update file and directory listings for
     *        any new or changed objects after choosing this option.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW</code> - AutoImport is on. Amazon FSx automatically imports directory listings of any new
     *        objects added to the linked S3 bucket that do not currently exist in the FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_CHANGED</code> - AutoImport is on. Amazon FSx automatically imports file and directory listings
     *        of any new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after
     *        you choose this option.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import
     *        updates from your S3 bucket</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoImportPolicyType
     */

    public CreateFileSystemLustreConfiguration withAutoImportPolicy(AutoImportPolicyType autoImportPolicy) {
        this.autoImportPolicy = autoImportPolicy.toString();
        return this;
    }

    /**
     * <p>
     * Required for the <code>PERSISTENT_1</code> deployment type, describes the amount of read and write throughput for
     * each 1 tebibyte of storage, in MB/s/TiB. File system throughput capacity is calculated by multiplying ﬁle system
     * storage capacity (TiB) by the PerUnitStorageThroughput (MB/s/TiB). For a 2.4 TiB ﬁle system, provisioning 50
     * MB/s/TiB of PerUnitStorageThroughput yields 120 MB/s of ﬁle system throughput. You pay for the amount of
     * throughput that you provision.
     * </p>
     * <p>
     * Valid values for SSD storage: 50, 100, 200. Valid values for HDD storage: 12, 40.
     * </p>
     * 
     * @param perUnitStorageThroughput
     *        Required for the <code>PERSISTENT_1</code> deployment type, describes the amount of read and write
     *        throughput for each 1 tebibyte of storage, in MB/s/TiB. File system throughput capacity is calculated by
     *        multiplying ﬁle system storage capacity (TiB) by the PerUnitStorageThroughput (MB/s/TiB). For a 2.4 TiB
     *        ﬁle system, provisioning 50 MB/s/TiB of PerUnitStorageThroughput yields 120 MB/s of ﬁle system throughput.
     *        You pay for the amount of throughput that you provision. </p>
     *        <p>
     *        Valid values for SSD storage: 50, 100, 200. Valid values for HDD storage: 12, 40.
     */

    public void setPerUnitStorageThroughput(Integer perUnitStorageThroughput) {
        this.perUnitStorageThroughput = perUnitStorageThroughput;
    }

    /**
     * <p>
     * Required for the <code>PERSISTENT_1</code> deployment type, describes the amount of read and write throughput for
     * each 1 tebibyte of storage, in MB/s/TiB. File system throughput capacity is calculated by multiplying ﬁle system
     * storage capacity (TiB) by the PerUnitStorageThroughput (MB/s/TiB). For a 2.4 TiB ﬁle system, provisioning 50
     * MB/s/TiB of PerUnitStorageThroughput yields 120 MB/s of ﬁle system throughput. You pay for the amount of
     * throughput that you provision.
     * </p>
     * <p>
     * Valid values for SSD storage: 50, 100, 200. Valid values for HDD storage: 12, 40.
     * </p>
     * 
     * @return Required for the <code>PERSISTENT_1</code> deployment type, describes the amount of read and write
     *         throughput for each 1 tebibyte of storage, in MB/s/TiB. File system throughput capacity is calculated by
     *         multiplying ﬁle system storage capacity (TiB) by the PerUnitStorageThroughput (MB/s/TiB). For a 2.4 TiB
     *         ﬁle system, provisioning 50 MB/s/TiB of PerUnitStorageThroughput yields 120 MB/s of ﬁle system
     *         throughput. You pay for the amount of throughput that you provision. </p>
     *         <p>
     *         Valid values for SSD storage: 50, 100, 200. Valid values for HDD storage: 12, 40.
     */

    public Integer getPerUnitStorageThroughput() {
        return this.perUnitStorageThroughput;
    }

    /**
     * <p>
     * Required for the <code>PERSISTENT_1</code> deployment type, describes the amount of read and write throughput for
     * each 1 tebibyte of storage, in MB/s/TiB. File system throughput capacity is calculated by multiplying ﬁle system
     * storage capacity (TiB) by the PerUnitStorageThroughput (MB/s/TiB). For a 2.4 TiB ﬁle system, provisioning 50
     * MB/s/TiB of PerUnitStorageThroughput yields 120 MB/s of ﬁle system throughput. You pay for the amount of
     * throughput that you provision.
     * </p>
     * <p>
     * Valid values for SSD storage: 50, 100, 200. Valid values for HDD storage: 12, 40.
     * </p>
     * 
     * @param perUnitStorageThroughput
     *        Required for the <code>PERSISTENT_1</code> deployment type, describes the amount of read and write
     *        throughput for each 1 tebibyte of storage, in MB/s/TiB. File system throughput capacity is calculated by
     *        multiplying ﬁle system storage capacity (TiB) by the PerUnitStorageThroughput (MB/s/TiB). For a 2.4 TiB
     *        ﬁle system, provisioning 50 MB/s/TiB of PerUnitStorageThroughput yields 120 MB/s of ﬁle system throughput.
     *        You pay for the amount of throughput that you provision. </p>
     *        <p>
     *        Valid values for SSD storage: 50, 100, 200. Valid values for HDD storage: 12, 40.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemLustreConfiguration withPerUnitStorageThroughput(Integer perUnitStorageThroughput) {
        setPerUnitStorageThroughput(perUnitStorageThroughput);
        return this;
    }

    /**
     * @param dailyAutomaticBackupStartTime
     */

    public void setDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
    }

    /**
     * @return
     */

    public String getDailyAutomaticBackupStartTime() {
        return this.dailyAutomaticBackupStartTime;
    }

    /**
     * @param dailyAutomaticBackupStartTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemLustreConfiguration withDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        setDailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime);
        return this;
    }

    /**
     * @param automaticBackupRetentionDays
     */

    public void setAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
    }

    /**
     * @return
     */

    public Integer getAutomaticBackupRetentionDays() {
        return this.automaticBackupRetentionDays;
    }

    /**
     * @param automaticBackupRetentionDays
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemLustreConfiguration withAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        setAutomaticBackupRetentionDays(automaticBackupRetentionDays);
        return this;
    }

    /**
     * <p>
     * (Optional) Not available to use with file systems that are linked to a data repository. A boolean flag indicating
     * whether tags for the file system should be copied to backups. The default value is false. If it's set to true,
     * all file system tags are copied to all automatic and user-initiated backups when the user doesn't specify any
     * backup-specific tags. If this value is true, and you specify one or more backup tags, only the specified tags are
     * copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from
     * the file system, regardless of this value.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html">Working with backups</a>.
     * </p>
     * 
     * @param copyTagsToBackups
     *        (Optional) Not available to use with file systems that are linked to a data repository. A boolean flag
     *        indicating whether tags for the file system should be copied to backups. The default value is false. If
     *        it's set to true, all file system tags are copied to all automatic and user-initiated backups when the
     *        user doesn't specify any backup-specific tags. If this value is true, and you specify one or more backup
     *        tags, only the specified tags are copied to backups. If you specify one or more tags when creating a
     *        user-initiated backup, no tags are copied from the file system, regardless of this value.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html">Working with backups</a>.
     */

    public void setCopyTagsToBackups(Boolean copyTagsToBackups) {
        this.copyTagsToBackups = copyTagsToBackups;
    }

    /**
     * <p>
     * (Optional) Not available to use with file systems that are linked to a data repository. A boolean flag indicating
     * whether tags for the file system should be copied to backups. The default value is false. If it's set to true,
     * all file system tags are copied to all automatic and user-initiated backups when the user doesn't specify any
     * backup-specific tags. If this value is true, and you specify one or more backup tags, only the specified tags are
     * copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from
     * the file system, regardless of this value.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html">Working with backups</a>.
     * </p>
     * 
     * @return (Optional) Not available to use with file systems that are linked to a data repository. A boolean flag
     *         indicating whether tags for the file system should be copied to backups. The default value is false. If
     *         it's set to true, all file system tags are copied to all automatic and user-initiated backups when the
     *         user doesn't specify any backup-specific tags. If this value is true, and you specify one or more backup
     *         tags, only the specified tags are copied to backups. If you specify one or more tags when creating a
     *         user-initiated backup, no tags are copied from the file system, regardless of this value.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html">Working with
     *         backups</a>.
     */

    public Boolean getCopyTagsToBackups() {
        return this.copyTagsToBackups;
    }

    /**
     * <p>
     * (Optional) Not available to use with file systems that are linked to a data repository. A boolean flag indicating
     * whether tags for the file system should be copied to backups. The default value is false. If it's set to true,
     * all file system tags are copied to all automatic and user-initiated backups when the user doesn't specify any
     * backup-specific tags. If this value is true, and you specify one or more backup tags, only the specified tags are
     * copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from
     * the file system, regardless of this value.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html">Working with backups</a>.
     * </p>
     * 
     * @param copyTagsToBackups
     *        (Optional) Not available to use with file systems that are linked to a data repository. A boolean flag
     *        indicating whether tags for the file system should be copied to backups. The default value is false. If
     *        it's set to true, all file system tags are copied to all automatic and user-initiated backups when the
     *        user doesn't specify any backup-specific tags. If this value is true, and you specify one or more backup
     *        tags, only the specified tags are copied to backups. If you specify one or more tags when creating a
     *        user-initiated backup, no tags are copied from the file system, regardless of this value.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html">Working with backups</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemLustreConfiguration withCopyTagsToBackups(Boolean copyTagsToBackups) {
        setCopyTagsToBackups(copyTagsToBackups);
        return this;
    }

    /**
     * <p>
     * (Optional) Not available to use with file systems that are linked to a data repository. A boolean flag indicating
     * whether tags for the file system should be copied to backups. The default value is false. If it's set to true,
     * all file system tags are copied to all automatic and user-initiated backups when the user doesn't specify any
     * backup-specific tags. If this value is true, and you specify one or more backup tags, only the specified tags are
     * copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from
     * the file system, regardless of this value.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html">Working with backups</a>.
     * </p>
     * 
     * @return (Optional) Not available to use with file systems that are linked to a data repository. A boolean flag
     *         indicating whether tags for the file system should be copied to backups. The default value is false. If
     *         it's set to true, all file system tags are copied to all automatic and user-initiated backups when the
     *         user doesn't specify any backup-specific tags. If this value is true, and you specify one or more backup
     *         tags, only the specified tags are copied to backups. If you specify one or more tags when creating a
     *         user-initiated backup, no tags are copied from the file system, regardless of this value.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html">Working with
     *         backups</a>.
     */

    public Boolean isCopyTagsToBackups() {
        return this.copyTagsToBackups;
    }

    /**
     * <p>
     * The type of drive cache used by PERSISTENT_1 file systems that are provisioned with HDD storage devices. This
     * parameter is required when storage type is HDD. Set to <code>READ</code>, improve the performance for frequently
     * accessed files and allows 20% of the total storage capacity of the file system to be cached.
     * </p>
     * <p>
     * This parameter is required when <code>StorageType</code> is set to HDD.
     * </p>
     * 
     * @param driveCacheType
     *        The type of drive cache used by PERSISTENT_1 file systems that are provisioned with HDD storage devices.
     *        This parameter is required when storage type is HDD. Set to <code>READ</code>, improve the performance for
     *        frequently accessed files and allows 20% of the total storage capacity of the file system to be cached.
     *        </p>
     *        <p>
     *        This parameter is required when <code>StorageType</code> is set to HDD.
     * @see DriveCacheType
     */

    public void setDriveCacheType(String driveCacheType) {
        this.driveCacheType = driveCacheType;
    }

    /**
     * <p>
     * The type of drive cache used by PERSISTENT_1 file systems that are provisioned with HDD storage devices. This
     * parameter is required when storage type is HDD. Set to <code>READ</code>, improve the performance for frequently
     * accessed files and allows 20% of the total storage capacity of the file system to be cached.
     * </p>
     * <p>
     * This parameter is required when <code>StorageType</code> is set to HDD.
     * </p>
     * 
     * @return The type of drive cache used by PERSISTENT_1 file systems that are provisioned with HDD storage devices.
     *         This parameter is required when storage type is HDD. Set to <code>READ</code>, improve the performance
     *         for frequently accessed files and allows 20% of the total storage capacity of the file system to be
     *         cached. </p>
     *         <p>
     *         This parameter is required when <code>StorageType</code> is set to HDD.
     * @see DriveCacheType
     */

    public String getDriveCacheType() {
        return this.driveCacheType;
    }

    /**
     * <p>
     * The type of drive cache used by PERSISTENT_1 file systems that are provisioned with HDD storage devices. This
     * parameter is required when storage type is HDD. Set to <code>READ</code>, improve the performance for frequently
     * accessed files and allows 20% of the total storage capacity of the file system to be cached.
     * </p>
     * <p>
     * This parameter is required when <code>StorageType</code> is set to HDD.
     * </p>
     * 
     * @param driveCacheType
     *        The type of drive cache used by PERSISTENT_1 file systems that are provisioned with HDD storage devices.
     *        This parameter is required when storage type is HDD. Set to <code>READ</code>, improve the performance for
     *        frequently accessed files and allows 20% of the total storage capacity of the file system to be cached.
     *        </p>
     *        <p>
     *        This parameter is required when <code>StorageType</code> is set to HDD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DriveCacheType
     */

    public CreateFileSystemLustreConfiguration withDriveCacheType(String driveCacheType) {
        setDriveCacheType(driveCacheType);
        return this;
    }

    /**
     * <p>
     * The type of drive cache used by PERSISTENT_1 file systems that are provisioned with HDD storage devices. This
     * parameter is required when storage type is HDD. Set to <code>READ</code>, improve the performance for frequently
     * accessed files and allows 20% of the total storage capacity of the file system to be cached.
     * </p>
     * <p>
     * This parameter is required when <code>StorageType</code> is set to HDD.
     * </p>
     * 
     * @param driveCacheType
     *        The type of drive cache used by PERSISTENT_1 file systems that are provisioned with HDD storage devices.
     *        This parameter is required when storage type is HDD. Set to <code>READ</code>, improve the performance for
     *        frequently accessed files and allows 20% of the total storage capacity of the file system to be cached.
     *        </p>
     *        <p>
     *        This parameter is required when <code>StorageType</code> is set to HDD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DriveCacheType
     */

    public CreateFileSystemLustreConfiguration withDriveCacheType(DriveCacheType driveCacheType) {
        this.driveCacheType = driveCacheType.toString();
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
        if (getWeeklyMaintenanceStartTime() != null)
            sb.append("WeeklyMaintenanceStartTime: ").append(getWeeklyMaintenanceStartTime()).append(",");
        if (getImportPath() != null)
            sb.append("ImportPath: ").append(getImportPath()).append(",");
        if (getExportPath() != null)
            sb.append("ExportPath: ").append(getExportPath()).append(",");
        if (getImportedFileChunkSize() != null)
            sb.append("ImportedFileChunkSize: ").append(getImportedFileChunkSize()).append(",");
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getAutoImportPolicy() != null)
            sb.append("AutoImportPolicy: ").append(getAutoImportPolicy()).append(",");
        if (getPerUnitStorageThroughput() != null)
            sb.append("PerUnitStorageThroughput: ").append(getPerUnitStorageThroughput()).append(",");
        if (getDailyAutomaticBackupStartTime() != null)
            sb.append("DailyAutomaticBackupStartTime: ").append(getDailyAutomaticBackupStartTime()).append(",");
        if (getAutomaticBackupRetentionDays() != null)
            sb.append("AutomaticBackupRetentionDays: ").append(getAutomaticBackupRetentionDays()).append(",");
        if (getCopyTagsToBackups() != null)
            sb.append("CopyTagsToBackups: ").append(getCopyTagsToBackups()).append(",");
        if (getDriveCacheType() != null)
            sb.append("DriveCacheType: ").append(getDriveCacheType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFileSystemLustreConfiguration == false)
            return false;
        CreateFileSystemLustreConfiguration other = (CreateFileSystemLustreConfiguration) obj;
        if (other.getWeeklyMaintenanceStartTime() == null ^ this.getWeeklyMaintenanceStartTime() == null)
            return false;
        if (other.getWeeklyMaintenanceStartTime() != null && other.getWeeklyMaintenanceStartTime().equals(this.getWeeklyMaintenanceStartTime()) == false)
            return false;
        if (other.getImportPath() == null ^ this.getImportPath() == null)
            return false;
        if (other.getImportPath() != null && other.getImportPath().equals(this.getImportPath()) == false)
            return false;
        if (other.getExportPath() == null ^ this.getExportPath() == null)
            return false;
        if (other.getExportPath() != null && other.getExportPath().equals(this.getExportPath()) == false)
            return false;
        if (other.getImportedFileChunkSize() == null ^ this.getImportedFileChunkSize() == null)
            return false;
        if (other.getImportedFileChunkSize() != null && other.getImportedFileChunkSize().equals(this.getImportedFileChunkSize()) == false)
            return false;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getAutoImportPolicy() == null ^ this.getAutoImportPolicy() == null)
            return false;
        if (other.getAutoImportPolicy() != null && other.getAutoImportPolicy().equals(this.getAutoImportPolicy()) == false)
            return false;
        if (other.getPerUnitStorageThroughput() == null ^ this.getPerUnitStorageThroughput() == null)
            return false;
        if (other.getPerUnitStorageThroughput() != null && other.getPerUnitStorageThroughput().equals(this.getPerUnitStorageThroughput()) == false)
            return false;
        if (other.getDailyAutomaticBackupStartTime() == null ^ this.getDailyAutomaticBackupStartTime() == null)
            return false;
        if (other.getDailyAutomaticBackupStartTime() != null
                && other.getDailyAutomaticBackupStartTime().equals(this.getDailyAutomaticBackupStartTime()) == false)
            return false;
        if (other.getAutomaticBackupRetentionDays() == null ^ this.getAutomaticBackupRetentionDays() == null)
            return false;
        if (other.getAutomaticBackupRetentionDays() != null && other.getAutomaticBackupRetentionDays().equals(this.getAutomaticBackupRetentionDays()) == false)
            return false;
        if (other.getCopyTagsToBackups() == null ^ this.getCopyTagsToBackups() == null)
            return false;
        if (other.getCopyTagsToBackups() != null && other.getCopyTagsToBackups().equals(this.getCopyTagsToBackups()) == false)
            return false;
        if (other.getDriveCacheType() == null ^ this.getDriveCacheType() == null)
            return false;
        if (other.getDriveCacheType() != null && other.getDriveCacheType().equals(this.getDriveCacheType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWeeklyMaintenanceStartTime() == null) ? 0 : getWeeklyMaintenanceStartTime().hashCode());
        hashCode = prime * hashCode + ((getImportPath() == null) ? 0 : getImportPath().hashCode());
        hashCode = prime * hashCode + ((getExportPath() == null) ? 0 : getExportPath().hashCode());
        hashCode = prime * hashCode + ((getImportedFileChunkSize() == null) ? 0 : getImportedFileChunkSize().hashCode());
        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getAutoImportPolicy() == null) ? 0 : getAutoImportPolicy().hashCode());
        hashCode = prime * hashCode + ((getPerUnitStorageThroughput() == null) ? 0 : getPerUnitStorageThroughput().hashCode());
        hashCode = prime * hashCode + ((getDailyAutomaticBackupStartTime() == null) ? 0 : getDailyAutomaticBackupStartTime().hashCode());
        hashCode = prime * hashCode + ((getAutomaticBackupRetentionDays() == null) ? 0 : getAutomaticBackupRetentionDays().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToBackups() == null) ? 0 : getCopyTagsToBackups().hashCode());
        hashCode = prime * hashCode + ((getDriveCacheType() == null) ? 0 : getDriveCacheType().hashCode());
        return hashCode;
    }

    @Override
    public CreateFileSystemLustreConfiguration clone() {
        try {
            return (CreateFileSystemLustreConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.CreateFileSystemLustreConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
