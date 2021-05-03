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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings for exporting data to Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/S3Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Settings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role. It is a required parameter that enables DMS
     * to write and read objects from an S3 bucket.
     * </p>
     */
    private String serviceAccessRoleArn;
    /**
     * <p>
     * Specifies how tables are defined in the S3 source files only.
     * </p>
     */
    private String externalTableDefinition;
    /**
     * <p>
     * The delimiter used to separate rows in the .csv file for both source and target. The default is a carriage return
     * (<code>\n</code>).
     * </p>
     */
    private String csvRowDelimiter;
    /**
     * <p>
     * The delimiter used to separate columns in the .csv file for both source and target. The default is a comma.
     * </p>
     */
    private String csvDelimiter;
    /**
     * <p>
     * An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path
     * <code> <i>bucketFolder</i>/<i>schema_name</i>/<i>table_name</i>/</code>. If this parameter isn't specified, then
     * the path used is <code> <i>schema_name</i>/<i>table_name</i>/</code>.
     * </p>
     */
    private String bucketFolder;
    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files. Either
     * set this parameter to NONE (the default) or don't use it to leave the files uncompressed. This parameter applies
     * to both .csv and .parquet file formats.
     * </p>
     */
    private String compressionType;
    /**
     * <p>
     * The type of server-side encryption that you want to use for your data. This encryption type is part of the
     * endpoint settings or the extra connections attributes for Amazon S3. You can choose either <code>SSE_S3</code>
     * (the default) or <code>SSE_KMS</code>.
     * </p>
     * <note>
     * <p>
     * For the <code>ModifyEndpoint</code> operation, you can change the existing value of the
     * <code>EncryptionMode</code> parameter from <code>SSE_KMS</code> to <code>SSE_S3</code>. But you can’t change the
     * existing value from <code>SSE_S3</code> to <code>SSE_KMS</code>.
     * </p>
     * </note>
     * <p>
     * To use <code>SSE_S3</code>, you need an AWS Identity and Access Management (IAM) role with permission to allow
     * <code>"arn:aws:s3:::dms-*"</code> to use the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:CreateBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObjectVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucketPolicy</code>
     * </p>
     * </li>
     * </ul>
     */
    private String encryptionMode;
    /**
     * <p>
     * If you are using <code>SSE_KMS</code> for the <code>EncryptionMode</code>, provide the AWS KMS key ID. The key
     * that you use needs an attached policy that enables AWS Identity and Access Management (IAM) user permissions and
     * allows use of the key.
     * </p>
     * <p>
     * Here is a CLI example:
     * <code>aws dms create-endpoint --endpoint-identifier <i>value</i> --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn=<i>value</i>,BucketFolder=<i>value</i>,BucketName=<i>value</i>,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId=<i>value</i> </code>
     * </p>
     */
    private String serverSideEncryptionKmsKeyId;
    /**
     * <p>
     * The format of the data that you want to use for output. You can choose one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>csv</code> : This is a row-based file format with comma-separated values (.csv).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parquet</code> : Apache Parquet (.parquet) is a columnar storage file format that features efficient
     * compression and provides faster query response.
     * </p>
     * </li>
     * </ul>
     */
    private String dataFormat;
    /**
     * <p>
     * The type of encoding you are using:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RLE_DICTIONARY</code> uses a combination of bit-packing and run-length encoding to store repeated values
     * more efficiently. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN</code> doesn't use encoding at all. Values are stored as they are.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN_DICTIONARY</code> builds a dictionary of the values encountered in a given column. The dictionary is
     * stored in a dictionary page for each column chunk.
     * </p>
     * </li>
     * </ul>
     */
    private String encodingType;
    /**
     * <p>
     * The maximum size of an encoded dictionary page of a column. If the dictionary page exceeds this, this column is
     * stored using an encoding type of <code>PLAIN</code>. This parameter defaults to 1024 * 1024 bytes (1 MiB), the
     * maximum size of a dictionary page before it reverts to <code>PLAIN</code> encoding. This size is used for
     * .parquet file format only.
     * </p>
     */
    private Integer dictPageSizeLimit;
    /**
     * <p>
     * The number of rows in a row group. A smaller row group size provides faster reads. But as the number of row
     * groups grows, the slower writes become. This parameter defaults to 10,000 rows. This number is used for .parquet
     * file format only.
     * </p>
     * <p>
     * If you choose a value larger than the maximum, <code>RowGroupLength</code> is set to the max row group length in
     * bytes (64 * 1024 * 1024).
     * </p>
     */
    private Integer rowGroupLength;
    /**
     * <p>
     * The size of one data page in bytes. This parameter defaults to 1024 * 1024 bytes (1 MiB). This number is used for
     * .parquet file format only.
     * </p>
     */
    private Integer dataPageSize;
    /**
     * <p>
     * The version of the Apache Parquet format that you want to use: <code>parquet_1_0</code> (the default) or
     * <code>parquet_2_0</code>.
     * </p>
     */
    private String parquetVersion;
    /**
     * <p>
     * A value that enables statistics for Parquet pages and row groups. Choose <code>true</code> to enable statistics,
     * <code>false</code> to disable. Statistics include <code>NULL</code>, <code>DISTINCT</code>, <code>MAX</code>, and
     * <code>MIN</code> values. This parameter defaults to <code>true</code>. This value is used for .parquet file
     * format only.
     * </p>
     */
    private Boolean enableStatistics;
    /**
     * <p>
     * A value that enables a full load to write INSERT operations to the comma-separated value (.csv) output files only
     * to indicate how the rows were added to the source database.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>IncludeOpForFullLoad</code> parameter in versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * For full load, records can only be inserted. By default (the <code>false</code> setting), no information is
     * recorded in these output files for a full load to indicate that the rows were inserted at the source database. If
     * <code>IncludeOpForFullLoad</code> is set to <code>true</code> or <code>y</code>, the INSERT is recorded as an I
     * annotation in the first field of the .csv file. This allows the format of your target records from a full load to
     * be consistent with the target records from a CDC load.
     * </p>
     * <note>
     * <p>
     * This setting works together with the <code>CdcInsertsOnly</code> and the <code>CdcInsertsAndUpdates</code>
     * parameters for output to .csv files only. For more information about how these settings work together, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps">
     * Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User Guide.</i>.
     * </p>
     * </note>
     */
    private Boolean includeOpForFullLoad;
    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write only INSERT operations to .csv or columnar storage
     * (.parquet) output files. By default (the <code>false</code> setting), the first field in a .csv or .parquet
     * record contains the letter I (INSERT), U (UPDATE), or D (DELETE). These values indicate whether the row was
     * inserted, updated, or deleted at the source database for a CDC load to the target.
     * </p>
     * <p>
     * If <code>CdcInsertsOnly</code> is set to <code>true</code> or <code>y</code>, only INSERTs from the source
     * database are migrated to the .csv or .parquet file. For .csv format only, how these INSERTs are recorded depends
     * on the value of <code>IncludeOpForFullLoad</code>. If <code>IncludeOpForFullLoad</code> is set to
     * <code>true</code>, the first field of every CDC record is set to I to indicate the INSERT operation at the
     * source. If <code>IncludeOpForFullLoad</code> is set to <code>false</code>, every CDC record is written without a
     * first field to indicate the INSERT operation at the source. For more information about how these settings work
     * together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     * Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the interaction described preceding between the <code>CdcInsertsOnly</code> and
     * <code>IncludeOpForFullLoad</code> parameters in versions 3.1.4 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't both be set to <code>true</code> for the
     * same endpoint. Set either <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to <code>true</code>
     * for the same endpoint, but not both.
     * </p>
     * </note>
     */
    private Boolean cdcInsertsOnly;
    /**
     * <p>
     * A value that when nonblank causes AWS DMS to add a column with timestamp information to the endpoint data for an
     * Amazon S3 target.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>TimestampColumnName</code> parameter in versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * DMS includes an additional <code>STRING</code> column in the .csv or .parquet object files of your migrated data
     * when you set <code>TimestampColumnName</code> to a nonblank value.
     * </p>
     * <p>
     * For a full load, each row of this timestamp column contains a timestamp for when the data was transferred from
     * the source to the target by DMS.
     * </p>
     * <p>
     * For a change data capture (CDC) load, each row of the timestamp column contains the timestamp for the commit of
     * that row in the source database.
     * </p>
     * <p>
     * The string format for this timestamp column value is <code>yyyy-MM-dd HH:mm:ss.SSSSSS</code>. By default, the
     * precision of this value is in microseconds. For a CDC load, the rounding of the precision depends on the commit
     * timestamp supported by DMS for the source database.
     * </p>
     * <p>
     * When the <code>AddColumnName</code> parameter is set to <code>true</code>, DMS also includes a name for the
     * timestamp column that you set with <code>TimestampColumnName</code>.
     * </p>
     */
    private String timestampColumnName;
    /**
     * <p>
     * A value that specifies the precision of any <code>TIMESTAMP</code> column values that are written to an Amazon S3
     * object file in .parquet format.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>ParquetTimestampInMillisecond</code> parameter in versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * When <code>ParquetTimestampInMillisecond</code> is set to <code>true</code> or <code>y</code>, AWS DMS writes all
     * <code>TIMESTAMP</code> columns in a .parquet formatted file with millisecond precision. Otherwise, DMS writes
     * them with microsecond precision.
     * </p>
     * <p>
     * Currently, Amazon Athena and AWS Glue can handle only millisecond precision for <code>TIMESTAMP</code> values.
     * Set this parameter to <code>true</code> for S3 endpoint object files that are .parquet formatted only if you plan
     * to query or process the data with Athena or AWS Glue.
     * </p>
     * <note>
     * <p>
     * AWS DMS writes any <code>TIMESTAMP</code> column values written to an S3 file in .csv format with microsecond
     * precision.
     * </p>
     * <p>
     * Setting <code>ParquetTimestampInMillisecond</code> has no effect on the string format of the timestamp column
     * value that is inserted by setting the <code>TimestampColumnName</code> parameter.
     * </p>
     * </note>
     */
    private Boolean parquetTimestampInMillisecond;
    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write INSERT and UPDATE operations to .csv or .parquet
     * (columnar storage) output files. The default setting is <code>false</code>, but when
     * <code>CdcInsertsAndUpdates</code> is set to <code>true</code> or <code>y</code>, only INSERTs and UPDATEs from
     * the source database are migrated to the .csv or .parquet file.
     * </p>
     * <p>
     * For .csv file format only, how these INSERTs and UPDATEs are recorded depends on the value of the
     * <code>IncludeOpForFullLoad</code> parameter. If <code>IncludeOpForFullLoad</code> is set to <code>true</code>,
     * the first field of every CDC record is set to either <code>I</code> or <code>U</code> to indicate INSERT and
     * UPDATE operations at the source. But if <code>IncludeOpForFullLoad</code> is set to <code>false</code>, CDC
     * records are written without an indication of INSERT or UPDATE operations at the source. For more information
     * about how these settings work together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     * Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the use of the <code>CdcInsertsAndUpdates</code> parameter in versions 3.3.1 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't both be set to <code>true</code> for the
     * same endpoint. Set either <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to <code>true</code>
     * for the same endpoint, but not both.
     * </p>
     * </note>
     */
    private Boolean cdcInsertsAndUpdates;
    /**
     * <p>
     * When set to <code>true</code>, this parameter partitions S3 bucket folders based on transaction commit dates. The
     * default value is <code>false</code>. For more information about date-based folder partitoning, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.DatePartitioning">Using
     * date-based folder partitioning</a>.
     * </p>
     */
    private Boolean datePartitionEnabled;
    /**
     * <p>
     * Identifies the sequence of the date format to use during folder partitioning. The default value is
     * <code>YYYYMMDD</code>. Use this parameter when <code>DatePartitionedEnabled</code> is set to <code>true</code>.
     * </p>
     */
    private String datePartitionSequence;
    /**
     * <p>
     * Specifies a date separating delimiter to use during folder partitioning. The default value is <code>SLASH</code>.
     * Use this parameter when <code>DatePartitionedEnabled</code> is set to <code>true</code>.
     * </p>
     */
    private String datePartitionDelimiter;
    /**
     * <p>
     * This setting applies if the S3 output files during a change data capture (CDC) load are written in .csv format.
     * If set to <code>true</code> for columns not included in the supplemental log, AWS DMS uses the value specified by
     * <a href=
     * "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CsvNoSupValue">
     * <code>CsvNoSupValue</code> </a>. If not set or set to <code>false</code>, AWS DMS uses the null value for these
     * columns.
     * </p>
     * <note>
     * <p>
     * This setting is supported in AWS DMS versions 3.4.1 and later.
     * </p>
     * </note>
     */
    private Boolean useCsvNoSupValue;
    /**
     * <p>
     * This setting only applies if your Amazon S3 output files during a change data capture (CDC) load are written in
     * .csv format. If <a href=
     * "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-UseCsvNoSupValue">
     * <code>UseCsvNoSupValue</code> </a> is set to true, specify a string value that you want AWS DMS to use for all
     * columns not included in the supplemental log. If you do not specify a string value, AWS DMS uses the null value
     * for these columns regardless of the <code>UseCsvNoSupValue</code> setting.
     * </p>
     * <note>
     * <p>
     * This setting is supported in AWS DMS versions 3.4.1 and later.
     * </p>
     * </note>
     */
    private String csvNoSupValue;
    /**
     * <p>
     * If set to <code>true</code>, AWS DMS saves the transaction order for a change data capture (CDC) load on the
     * Amazon S3 target specified by <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CdcPath">
     * <code>CdcPath</code> </a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath"
     * >Capturing data changes (CDC) including transaction order on the S3 target</a>.
     * </p>
     * <note>
     * <p>
     * This setting is supported in AWS DMS versions 3.4.2 and later.
     * </p>
     * </note>
     */
    private Boolean preserveTransactions;
    /**
     * <p>
     * Specifies the folder path of CDC files. For an S3 source, this setting is required if a task captures change
     * data; otherwise, it's optional. If <code>CdcPath</code> is set, AWS DMS reads CDC files from this path and
     * replicates the data changes to the target endpoint. For an S3 target if you set <a href=
     * "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-PreserveTransactions"
     * > <code>PreserveTransactions</code> </a> to <code>true</code>, AWS DMS verifies that you have set this parameter
     * to a folder path on your S3 target where AWS DMS can save the transaction order for the CDC load. AWS DMS creates
     * this CDC folder path in either your S3 target working directory or the S3 target location specified by <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketFolder">
     * <code>BucketFolder</code> </a> and <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketName">
     * <code>BucketName</code> </a>.
     * </p>
     * <p>
     * For example, if you specify <code>CdcPath</code> as <code>MyChangedData</code>, and you specify
     * <code>BucketName</code> as <code>MyTargetBucket</code> but do not specify <code>BucketFolder</code>, AWS DMS
     * creates the CDC folder path following: <code>MyTargetBucket/MyChangedData</code>.
     * </p>
     * <p>
     * If you specify the same <code>CdcPath</code>, and you specify <code>BucketName</code> as
     * <code>MyTargetBucket</code> and <code>BucketFolder</code> as <code>MyTargetData</code>, AWS DMS creates the CDC
     * folder path following: <code>MyTargetBucket/MyTargetData/MyChangedData</code>.
     * </p>
     * <p>
     * For more information on CDC including transaction order on an S3 target, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath"
     * >Capturing data changes (CDC) including transaction order on the S3 target</a>.
     * </p>
     * <note>
     * <p>
     * This setting is supported in AWS DMS versions 3.4.2 and later.
     * </p>
     * </note>
     */
    private String cdcPath;

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role. It is a required parameter that enables DMS
     * to write and read objects from an S3 bucket.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The Amazon Resource Name (ARN) used by the service access IAM role. It is a required parameter that
     *        enables DMS to write and read objects from an S3 bucket.
     */

    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role. It is a required parameter that enables DMS
     * to write and read objects from an S3 bucket.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) used by the service access IAM role. It is a required parameter that
     *         enables DMS to write and read objects from an S3 bucket.
     */

    public String getServiceAccessRoleArn() {
        return this.serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role. It is a required parameter that enables DMS
     * to write and read objects from an S3 bucket.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The Amazon Resource Name (ARN) used by the service access IAM role. It is a required parameter that
     *        enables DMS to write and read objects from an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withServiceAccessRoleArn(String serviceAccessRoleArn) {
        setServiceAccessRoleArn(serviceAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * Specifies how tables are defined in the S3 source files only.
     * </p>
     * 
     * @param externalTableDefinition
     *        Specifies how tables are defined in the S3 source files only.
     */

    public void setExternalTableDefinition(String externalTableDefinition) {
        this.externalTableDefinition = externalTableDefinition;
    }

    /**
     * <p>
     * Specifies how tables are defined in the S3 source files only.
     * </p>
     * 
     * @return Specifies how tables are defined in the S3 source files only.
     */

    public String getExternalTableDefinition() {
        return this.externalTableDefinition;
    }

    /**
     * <p>
     * Specifies how tables are defined in the S3 source files only.
     * </p>
     * 
     * @param externalTableDefinition
     *        Specifies how tables are defined in the S3 source files only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withExternalTableDefinition(String externalTableDefinition) {
        setExternalTableDefinition(externalTableDefinition);
        return this;
    }

    /**
     * <p>
     * The delimiter used to separate rows in the .csv file for both source and target. The default is a carriage return
     * (<code>\n</code>).
     * </p>
     * 
     * @param csvRowDelimiter
     *        The delimiter used to separate rows in the .csv file for both source and target. The default is a carriage
     *        return (<code>\n</code>).
     */

    public void setCsvRowDelimiter(String csvRowDelimiter) {
        this.csvRowDelimiter = csvRowDelimiter;
    }

    /**
     * <p>
     * The delimiter used to separate rows in the .csv file for both source and target. The default is a carriage return
     * (<code>\n</code>).
     * </p>
     * 
     * @return The delimiter used to separate rows in the .csv file for both source and target. The default is a
     *         carriage return (<code>\n</code>).
     */

    public String getCsvRowDelimiter() {
        return this.csvRowDelimiter;
    }

    /**
     * <p>
     * The delimiter used to separate rows in the .csv file for both source and target. The default is a carriage return
     * (<code>\n</code>).
     * </p>
     * 
     * @param csvRowDelimiter
     *        The delimiter used to separate rows in the .csv file for both source and target. The default is a carriage
     *        return (<code>\n</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withCsvRowDelimiter(String csvRowDelimiter) {
        setCsvRowDelimiter(csvRowDelimiter);
        return this;
    }

    /**
     * <p>
     * The delimiter used to separate columns in the .csv file for both source and target. The default is a comma.
     * </p>
     * 
     * @param csvDelimiter
     *        The delimiter used to separate columns in the .csv file for both source and target. The default is a
     *        comma.
     */

    public void setCsvDelimiter(String csvDelimiter) {
        this.csvDelimiter = csvDelimiter;
    }

    /**
     * <p>
     * The delimiter used to separate columns in the .csv file for both source and target. The default is a comma.
     * </p>
     * 
     * @return The delimiter used to separate columns in the .csv file for both source and target. The default is a
     *         comma.
     */

    public String getCsvDelimiter() {
        return this.csvDelimiter;
    }

    /**
     * <p>
     * The delimiter used to separate columns in the .csv file for both source and target. The default is a comma.
     * </p>
     * 
     * @param csvDelimiter
     *        The delimiter used to separate columns in the .csv file for both source and target. The default is a
     *        comma.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withCsvDelimiter(String csvDelimiter) {
        setCsvDelimiter(csvDelimiter);
        return this;
    }

    /**
     * <p>
     * An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path
     * <code> <i>bucketFolder</i>/<i>schema_name</i>/<i>table_name</i>/</code>. If this parameter isn't specified, then
     * the path used is <code> <i>schema_name</i>/<i>table_name</i>/</code>.
     * </p>
     * 
     * @param bucketFolder
     *        An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path
     *        <code> <i>bucketFolder</i>/<i>schema_name</i>/<i>table_name</i>/</code>. If this parameter isn't
     *        specified, then the path used is <code> <i>schema_name</i>/<i>table_name</i>/</code>.
     */

    public void setBucketFolder(String bucketFolder) {
        this.bucketFolder = bucketFolder;
    }

    /**
     * <p>
     * An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path
     * <code> <i>bucketFolder</i>/<i>schema_name</i>/<i>table_name</i>/</code>. If this parameter isn't specified, then
     * the path used is <code> <i>schema_name</i>/<i>table_name</i>/</code>.
     * </p>
     * 
     * @return An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path
     *         <code> <i>bucketFolder</i>/<i>schema_name</i>/<i>table_name</i>/</code>. If this parameter isn't
     *         specified, then the path used is <code> <i>schema_name</i>/<i>table_name</i>/</code>.
     */

    public String getBucketFolder() {
        return this.bucketFolder;
    }

    /**
     * <p>
     * An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path
     * <code> <i>bucketFolder</i>/<i>schema_name</i>/<i>table_name</i>/</code>. If this parameter isn't specified, then
     * the path used is <code> <i>schema_name</i>/<i>table_name</i>/</code>.
     * </p>
     * 
     * @param bucketFolder
     *        An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path
     *        <code> <i>bucketFolder</i>/<i>schema_name</i>/<i>table_name</i>/</code>. If this parameter isn't
     *        specified, then the path used is <code> <i>schema_name</i>/<i>table_name</i>/</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withBucketFolder(String bucketFolder) {
        setBucketFolder(bucketFolder);
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        The name of the S3 bucket.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @return The name of the S3 bucket.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        The name of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files. Either
     * set this parameter to NONE (the default) or don't use it to leave the files uncompressed. This parameter applies
     * to both .csv and .parquet file formats.
     * </p>
     * 
     * @param compressionType
     *        An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files.
     *        Either set this parameter to NONE (the default) or don't use it to leave the files uncompressed. This
     *        parameter applies to both .csv and .parquet file formats.
     * @see CompressionTypeValue
     */

    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    /**
     * <p>
     * An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files. Either
     * set this parameter to NONE (the default) or don't use it to leave the files uncompressed. This parameter applies
     * to both .csv and .parquet file formats.
     * </p>
     * 
     * @return An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files.
     *         Either set this parameter to NONE (the default) or don't use it to leave the files uncompressed. This
     *         parameter applies to both .csv and .parquet file formats.
     * @see CompressionTypeValue
     */

    public String getCompressionType() {
        return this.compressionType;
    }

    /**
     * <p>
     * An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files. Either
     * set this parameter to NONE (the default) or don't use it to leave the files uncompressed. This parameter applies
     * to both .csv and .parquet file formats.
     * </p>
     * 
     * @param compressionType
     *        An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files.
     *        Either set this parameter to NONE (the default) or don't use it to leave the files uncompressed. This
     *        parameter applies to both .csv and .parquet file formats.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionTypeValue
     */

    public S3Settings withCompressionType(String compressionType) {
        setCompressionType(compressionType);
        return this;
    }

    /**
     * <p>
     * An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files. Either
     * set this parameter to NONE (the default) or don't use it to leave the files uncompressed. This parameter applies
     * to both .csv and .parquet file formats.
     * </p>
     * 
     * @param compressionType
     *        An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files.
     *        Either set this parameter to NONE (the default) or don't use it to leave the files uncompressed. This
     *        parameter applies to both .csv and .parquet file formats.
     * @see CompressionTypeValue
     */

    public void setCompressionType(CompressionTypeValue compressionType) {
        withCompressionType(compressionType);
    }

    /**
     * <p>
     * An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files. Either
     * set this parameter to NONE (the default) or don't use it to leave the files uncompressed. This parameter applies
     * to both .csv and .parquet file formats.
     * </p>
     * 
     * @param compressionType
     *        An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files.
     *        Either set this parameter to NONE (the default) or don't use it to leave the files uncompressed. This
     *        parameter applies to both .csv and .parquet file formats.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionTypeValue
     */

    public S3Settings withCompressionType(CompressionTypeValue compressionType) {
        this.compressionType = compressionType.toString();
        return this;
    }

    /**
     * <p>
     * The type of server-side encryption that you want to use for your data. This encryption type is part of the
     * endpoint settings or the extra connections attributes for Amazon S3. You can choose either <code>SSE_S3</code>
     * (the default) or <code>SSE_KMS</code>.
     * </p>
     * <note>
     * <p>
     * For the <code>ModifyEndpoint</code> operation, you can change the existing value of the
     * <code>EncryptionMode</code> parameter from <code>SSE_KMS</code> to <code>SSE_S3</code>. But you can’t change the
     * existing value from <code>SSE_S3</code> to <code>SSE_KMS</code>.
     * </p>
     * </note>
     * <p>
     * To use <code>SSE_S3</code>, you need an AWS Identity and Access Management (IAM) role with permission to allow
     * <code>"arn:aws:s3:::dms-*"</code> to use the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:CreateBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObjectVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucketPolicy</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionMode
     *        The type of server-side encryption that you want to use for your data. This encryption type is part of the
     *        endpoint settings or the extra connections attributes for Amazon S3. You can choose either
     *        <code>SSE_S3</code> (the default) or <code>SSE_KMS</code>. </p> <note>
     *        <p>
     *        For the <code>ModifyEndpoint</code> operation, you can change the existing value of the
     *        <code>EncryptionMode</code> parameter from <code>SSE_KMS</code> to <code>SSE_S3</code>. But you can’t
     *        change the existing value from <code>SSE_S3</code> to <code>SSE_KMS</code>.
     *        </p>
     *        </note>
     *        <p>
     *        To use <code>SSE_S3</code>, you need an AWS Identity and Access Management (IAM) role with permission to
     *        allow <code>"arn:aws:s3:::dms-*"</code> to use the following actions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>s3:CreateBucket</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:ListBucket</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:DeleteBucket</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:GetBucketLocation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:GetObject</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:PutObject</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:DeleteObject</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:GetObjectVersion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:GetBucketPolicy</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:PutBucketPolicy</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:DeleteBucketPolicy</code>
     *        </p>
     *        </li>
     * @see EncryptionModeValue
     */

    public void setEncryptionMode(String encryptionMode) {
        this.encryptionMode = encryptionMode;
    }

    /**
     * <p>
     * The type of server-side encryption that you want to use for your data. This encryption type is part of the
     * endpoint settings or the extra connections attributes for Amazon S3. You can choose either <code>SSE_S3</code>
     * (the default) or <code>SSE_KMS</code>.
     * </p>
     * <note>
     * <p>
     * For the <code>ModifyEndpoint</code> operation, you can change the existing value of the
     * <code>EncryptionMode</code> parameter from <code>SSE_KMS</code> to <code>SSE_S3</code>. But you can’t change the
     * existing value from <code>SSE_S3</code> to <code>SSE_KMS</code>.
     * </p>
     * </note>
     * <p>
     * To use <code>SSE_S3</code>, you need an AWS Identity and Access Management (IAM) role with permission to allow
     * <code>"arn:aws:s3:::dms-*"</code> to use the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:CreateBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObjectVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucketPolicy</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of server-side encryption that you want to use for your data. This encryption type is part of
     *         the endpoint settings or the extra connections attributes for Amazon S3. You can choose either
     *         <code>SSE_S3</code> (the default) or <code>SSE_KMS</code>. </p> <note>
     *         <p>
     *         For the <code>ModifyEndpoint</code> operation, you can change the existing value of the
     *         <code>EncryptionMode</code> parameter from <code>SSE_KMS</code> to <code>SSE_S3</code>. But you can’t
     *         change the existing value from <code>SSE_S3</code> to <code>SSE_KMS</code>.
     *         </p>
     *         </note>
     *         <p>
     *         To use <code>SSE_S3</code>, you need an AWS Identity and Access Management (IAM) role with permission to
     *         allow <code>"arn:aws:s3:::dms-*"</code> to use the following actions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>s3:CreateBucket</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:ListBucket</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:DeleteBucket</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:GetBucketLocation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:GetObject</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:PutObject</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:DeleteObject</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:GetObjectVersion</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:GetBucketPolicy</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:PutBucketPolicy</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:DeleteBucketPolicy</code>
     *         </p>
     *         </li>
     * @see EncryptionModeValue
     */

    public String getEncryptionMode() {
        return this.encryptionMode;
    }

    /**
     * <p>
     * The type of server-side encryption that you want to use for your data. This encryption type is part of the
     * endpoint settings or the extra connections attributes for Amazon S3. You can choose either <code>SSE_S3</code>
     * (the default) or <code>SSE_KMS</code>.
     * </p>
     * <note>
     * <p>
     * For the <code>ModifyEndpoint</code> operation, you can change the existing value of the
     * <code>EncryptionMode</code> parameter from <code>SSE_KMS</code> to <code>SSE_S3</code>. But you can’t change the
     * existing value from <code>SSE_S3</code> to <code>SSE_KMS</code>.
     * </p>
     * </note>
     * <p>
     * To use <code>SSE_S3</code>, you need an AWS Identity and Access Management (IAM) role with permission to allow
     * <code>"arn:aws:s3:::dms-*"</code> to use the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:CreateBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObjectVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucketPolicy</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionMode
     *        The type of server-side encryption that you want to use for your data. This encryption type is part of the
     *        endpoint settings or the extra connections attributes for Amazon S3. You can choose either
     *        <code>SSE_S3</code> (the default) or <code>SSE_KMS</code>. </p> <note>
     *        <p>
     *        For the <code>ModifyEndpoint</code> operation, you can change the existing value of the
     *        <code>EncryptionMode</code> parameter from <code>SSE_KMS</code> to <code>SSE_S3</code>. But you can’t
     *        change the existing value from <code>SSE_S3</code> to <code>SSE_KMS</code>.
     *        </p>
     *        </note>
     *        <p>
     *        To use <code>SSE_S3</code>, you need an AWS Identity and Access Management (IAM) role with permission to
     *        allow <code>"arn:aws:s3:::dms-*"</code> to use the following actions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>s3:CreateBucket</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:ListBucket</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:DeleteBucket</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:GetBucketLocation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:GetObject</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:PutObject</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:DeleteObject</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:GetObjectVersion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:GetBucketPolicy</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:PutBucketPolicy</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:DeleteBucketPolicy</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionModeValue
     */

    public S3Settings withEncryptionMode(String encryptionMode) {
        setEncryptionMode(encryptionMode);
        return this;
    }

    /**
     * <p>
     * The type of server-side encryption that you want to use for your data. This encryption type is part of the
     * endpoint settings or the extra connections attributes for Amazon S3. You can choose either <code>SSE_S3</code>
     * (the default) or <code>SSE_KMS</code>.
     * </p>
     * <note>
     * <p>
     * For the <code>ModifyEndpoint</code> operation, you can change the existing value of the
     * <code>EncryptionMode</code> parameter from <code>SSE_KMS</code> to <code>SSE_S3</code>. But you can’t change the
     * existing value from <code>SSE_S3</code> to <code>SSE_KMS</code>.
     * </p>
     * </note>
     * <p>
     * To use <code>SSE_S3</code>, you need an AWS Identity and Access Management (IAM) role with permission to allow
     * <code>"arn:aws:s3:::dms-*"</code> to use the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:CreateBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObjectVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucketPolicy</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionMode
     *        The type of server-side encryption that you want to use for your data. This encryption type is part of the
     *        endpoint settings or the extra connections attributes for Amazon S3. You can choose either
     *        <code>SSE_S3</code> (the default) or <code>SSE_KMS</code>. </p> <note>
     *        <p>
     *        For the <code>ModifyEndpoint</code> operation, you can change the existing value of the
     *        <code>EncryptionMode</code> parameter from <code>SSE_KMS</code> to <code>SSE_S3</code>. But you can’t
     *        change the existing value from <code>SSE_S3</code> to <code>SSE_KMS</code>.
     *        </p>
     *        </note>
     *        <p>
     *        To use <code>SSE_S3</code>, you need an AWS Identity and Access Management (IAM) role with permission to
     *        allow <code>"arn:aws:s3:::dms-*"</code> to use the following actions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>s3:CreateBucket</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:ListBucket</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:DeleteBucket</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:GetBucketLocation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:GetObject</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:PutObject</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:DeleteObject</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:GetObjectVersion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:GetBucketPolicy</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:PutBucketPolicy</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:DeleteBucketPolicy</code>
     *        </p>
     *        </li>
     * @see EncryptionModeValue
     */

    public void setEncryptionMode(EncryptionModeValue encryptionMode) {
        withEncryptionMode(encryptionMode);
    }

    /**
     * <p>
     * The type of server-side encryption that you want to use for your data. This encryption type is part of the
     * endpoint settings or the extra connections attributes for Amazon S3. You can choose either <code>SSE_S3</code>
     * (the default) or <code>SSE_KMS</code>.
     * </p>
     * <note>
     * <p>
     * For the <code>ModifyEndpoint</code> operation, you can change the existing value of the
     * <code>EncryptionMode</code> parameter from <code>SSE_KMS</code> to <code>SSE_S3</code>. But you can’t change the
     * existing value from <code>SSE_S3</code> to <code>SSE_KMS</code>.
     * </p>
     * </note>
     * <p>
     * To use <code>SSE_S3</code>, you need an AWS Identity and Access Management (IAM) role with permission to allow
     * <code>"arn:aws:s3:::dms-*"</code> to use the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:CreateBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObjectVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucketPolicy</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionMode
     *        The type of server-side encryption that you want to use for your data. This encryption type is part of the
     *        endpoint settings or the extra connections attributes for Amazon S3. You can choose either
     *        <code>SSE_S3</code> (the default) or <code>SSE_KMS</code>. </p> <note>
     *        <p>
     *        For the <code>ModifyEndpoint</code> operation, you can change the existing value of the
     *        <code>EncryptionMode</code> parameter from <code>SSE_KMS</code> to <code>SSE_S3</code>. But you can’t
     *        change the existing value from <code>SSE_S3</code> to <code>SSE_KMS</code>.
     *        </p>
     *        </note>
     *        <p>
     *        To use <code>SSE_S3</code>, you need an AWS Identity and Access Management (IAM) role with permission to
     *        allow <code>"arn:aws:s3:::dms-*"</code> to use the following actions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>s3:CreateBucket</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:ListBucket</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:DeleteBucket</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:GetBucketLocation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:GetObject</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:PutObject</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:DeleteObject</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:GetObjectVersion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:GetBucketPolicy</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:PutBucketPolicy</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3:DeleteBucketPolicy</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionModeValue
     */

    public S3Settings withEncryptionMode(EncryptionModeValue encryptionMode) {
        this.encryptionMode = encryptionMode.toString();
        return this;
    }

    /**
     * <p>
     * If you are using <code>SSE_KMS</code> for the <code>EncryptionMode</code>, provide the AWS KMS key ID. The key
     * that you use needs an attached policy that enables AWS Identity and Access Management (IAM) user permissions and
     * allows use of the key.
     * </p>
     * <p>
     * Here is a CLI example:
     * <code>aws dms create-endpoint --endpoint-identifier <i>value</i> --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn=<i>value</i>,BucketFolder=<i>value</i>,BucketName=<i>value</i>,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId=<i>value</i> </code>
     * </p>
     * 
     * @param serverSideEncryptionKmsKeyId
     *        If you are using <code>SSE_KMS</code> for the <code>EncryptionMode</code>, provide the AWS KMS key ID. The
     *        key that you use needs an attached policy that enables AWS Identity and Access Management (IAM) user
     *        permissions and allows use of the key.</p>
     *        <p>
     *        Here is a CLI example:
     *        <code>aws dms create-endpoint --endpoint-identifier <i>value</i> --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn=<i>value</i>,BucketFolder=<i>value</i>,BucketName=<i>value</i>,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId=<i>value</i> </code>
     */

    public void setServerSideEncryptionKmsKeyId(String serverSideEncryptionKmsKeyId) {
        this.serverSideEncryptionKmsKeyId = serverSideEncryptionKmsKeyId;
    }

    /**
     * <p>
     * If you are using <code>SSE_KMS</code> for the <code>EncryptionMode</code>, provide the AWS KMS key ID. The key
     * that you use needs an attached policy that enables AWS Identity and Access Management (IAM) user permissions and
     * allows use of the key.
     * </p>
     * <p>
     * Here is a CLI example:
     * <code>aws dms create-endpoint --endpoint-identifier <i>value</i> --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn=<i>value</i>,BucketFolder=<i>value</i>,BucketName=<i>value</i>,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId=<i>value</i> </code>
     * </p>
     * 
     * @return If you are using <code>SSE_KMS</code> for the <code>EncryptionMode</code>, provide the AWS KMS key ID.
     *         The key that you use needs an attached policy that enables AWS Identity and Access Management (IAM) user
     *         permissions and allows use of the key.</p>
     *         <p>
     *         Here is a CLI example:
     *         <code>aws dms create-endpoint --endpoint-identifier <i>value</i> --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn=<i>value</i>,BucketFolder=<i>value</i>,BucketName=<i>value</i>,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId=<i>value</i> </code>
     */

    public String getServerSideEncryptionKmsKeyId() {
        return this.serverSideEncryptionKmsKeyId;
    }

    /**
     * <p>
     * If you are using <code>SSE_KMS</code> for the <code>EncryptionMode</code>, provide the AWS KMS key ID. The key
     * that you use needs an attached policy that enables AWS Identity and Access Management (IAM) user permissions and
     * allows use of the key.
     * </p>
     * <p>
     * Here is a CLI example:
     * <code>aws dms create-endpoint --endpoint-identifier <i>value</i> --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn=<i>value</i>,BucketFolder=<i>value</i>,BucketName=<i>value</i>,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId=<i>value</i> </code>
     * </p>
     * 
     * @param serverSideEncryptionKmsKeyId
     *        If you are using <code>SSE_KMS</code> for the <code>EncryptionMode</code>, provide the AWS KMS key ID. The
     *        key that you use needs an attached policy that enables AWS Identity and Access Management (IAM) user
     *        permissions and allows use of the key.</p>
     *        <p>
     *        Here is a CLI example:
     *        <code>aws dms create-endpoint --endpoint-identifier <i>value</i> --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn=<i>value</i>,BucketFolder=<i>value</i>,BucketName=<i>value</i>,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId=<i>value</i> </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withServerSideEncryptionKmsKeyId(String serverSideEncryptionKmsKeyId) {
        setServerSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId);
        return this;
    }

    /**
     * <p>
     * The format of the data that you want to use for output. You can choose one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>csv</code> : This is a row-based file format with comma-separated values (.csv).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parquet</code> : Apache Parquet (.parquet) is a columnar storage file format that features efficient
     * compression and provides faster query response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataFormat
     *        The format of the data that you want to use for output. You can choose one of the following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>csv</code> : This is a row-based file format with comma-separated values (.csv).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>parquet</code> : Apache Parquet (.parquet) is a columnar storage file format that features efficient
     *        compression and provides faster query response.
     *        </p>
     *        </li>
     * @see DataFormatValue
     */

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * <p>
     * The format of the data that you want to use for output. You can choose one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>csv</code> : This is a row-based file format with comma-separated values (.csv).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parquet</code> : Apache Parquet (.parquet) is a columnar storage file format that features efficient
     * compression and provides faster query response.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The format of the data that you want to use for output. You can choose one of the following: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>csv</code> : This is a row-based file format with comma-separated values (.csv).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>parquet</code> : Apache Parquet (.parquet) is a columnar storage file format that features
     *         efficient compression and provides faster query response.
     *         </p>
     *         </li>
     * @see DataFormatValue
     */

    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * <p>
     * The format of the data that you want to use for output. You can choose one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>csv</code> : This is a row-based file format with comma-separated values (.csv).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parquet</code> : Apache Parquet (.parquet) is a columnar storage file format that features efficient
     * compression and provides faster query response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataFormat
     *        The format of the data that you want to use for output. You can choose one of the following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>csv</code> : This is a row-based file format with comma-separated values (.csv).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>parquet</code> : Apache Parquet (.parquet) is a columnar storage file format that features efficient
     *        compression and provides faster query response.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataFormatValue
     */

    public S3Settings withDataFormat(String dataFormat) {
        setDataFormat(dataFormat);
        return this;
    }

    /**
     * <p>
     * The format of the data that you want to use for output. You can choose one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>csv</code> : This is a row-based file format with comma-separated values (.csv).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parquet</code> : Apache Parquet (.parquet) is a columnar storage file format that features efficient
     * compression and provides faster query response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataFormat
     *        The format of the data that you want to use for output. You can choose one of the following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>csv</code> : This is a row-based file format with comma-separated values (.csv).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>parquet</code> : Apache Parquet (.parquet) is a columnar storage file format that features efficient
     *        compression and provides faster query response.
     *        </p>
     *        </li>
     * @see DataFormatValue
     */

    public void setDataFormat(DataFormatValue dataFormat) {
        withDataFormat(dataFormat);
    }

    /**
     * <p>
     * The format of the data that you want to use for output. You can choose one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>csv</code> : This is a row-based file format with comma-separated values (.csv).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parquet</code> : Apache Parquet (.parquet) is a columnar storage file format that features efficient
     * compression and provides faster query response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataFormat
     *        The format of the data that you want to use for output. You can choose one of the following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>csv</code> : This is a row-based file format with comma-separated values (.csv).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>parquet</code> : Apache Parquet (.parquet) is a columnar storage file format that features efficient
     *        compression and provides faster query response.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataFormatValue
     */

    public S3Settings withDataFormat(DataFormatValue dataFormat) {
        this.dataFormat = dataFormat.toString();
        return this;
    }

    /**
     * <p>
     * The type of encoding you are using:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RLE_DICTIONARY</code> uses a combination of bit-packing and run-length encoding to store repeated values
     * more efficiently. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN</code> doesn't use encoding at all. Values are stored as they are.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN_DICTIONARY</code> builds a dictionary of the values encountered in a given column. The dictionary is
     * stored in a dictionary page for each column chunk.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encodingType
     *        The type of encoding you are using: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RLE_DICTIONARY</code> uses a combination of bit-packing and run-length encoding to store repeated
     *        values more efficiently. This is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLAIN</code> doesn't use encoding at all. Values are stored as they are.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLAIN_DICTIONARY</code> builds a dictionary of the values encountered in a given column. The
     *        dictionary is stored in a dictionary page for each column chunk.
     *        </p>
     *        </li>
     * @see EncodingTypeValue
     */

    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    /**
     * <p>
     * The type of encoding you are using:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RLE_DICTIONARY</code> uses a combination of bit-packing and run-length encoding to store repeated values
     * more efficiently. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN</code> doesn't use encoding at all. Values are stored as they are.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN_DICTIONARY</code> builds a dictionary of the values encountered in a given column. The dictionary is
     * stored in a dictionary page for each column chunk.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of encoding you are using: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RLE_DICTIONARY</code> uses a combination of bit-packing and run-length encoding to store repeated
     *         values more efficiently. This is the default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PLAIN</code> doesn't use encoding at all. Values are stored as they are.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PLAIN_DICTIONARY</code> builds a dictionary of the values encountered in a given column. The
     *         dictionary is stored in a dictionary page for each column chunk.
     *         </p>
     *         </li>
     * @see EncodingTypeValue
     */

    public String getEncodingType() {
        return this.encodingType;
    }

    /**
     * <p>
     * The type of encoding you are using:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RLE_DICTIONARY</code> uses a combination of bit-packing and run-length encoding to store repeated values
     * more efficiently. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN</code> doesn't use encoding at all. Values are stored as they are.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN_DICTIONARY</code> builds a dictionary of the values encountered in a given column. The dictionary is
     * stored in a dictionary page for each column chunk.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encodingType
     *        The type of encoding you are using: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RLE_DICTIONARY</code> uses a combination of bit-packing and run-length encoding to store repeated
     *        values more efficiently. This is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLAIN</code> doesn't use encoding at all. Values are stored as they are.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLAIN_DICTIONARY</code> builds a dictionary of the values encountered in a given column. The
     *        dictionary is stored in a dictionary page for each column chunk.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncodingTypeValue
     */

    public S3Settings withEncodingType(String encodingType) {
        setEncodingType(encodingType);
        return this;
    }

    /**
     * <p>
     * The type of encoding you are using:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RLE_DICTIONARY</code> uses a combination of bit-packing and run-length encoding to store repeated values
     * more efficiently. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN</code> doesn't use encoding at all. Values are stored as they are.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN_DICTIONARY</code> builds a dictionary of the values encountered in a given column. The dictionary is
     * stored in a dictionary page for each column chunk.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encodingType
     *        The type of encoding you are using: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RLE_DICTIONARY</code> uses a combination of bit-packing and run-length encoding to store repeated
     *        values more efficiently. This is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLAIN</code> doesn't use encoding at all. Values are stored as they are.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLAIN_DICTIONARY</code> builds a dictionary of the values encountered in a given column. The
     *        dictionary is stored in a dictionary page for each column chunk.
     *        </p>
     *        </li>
     * @see EncodingTypeValue
     */

    public void setEncodingType(EncodingTypeValue encodingType) {
        withEncodingType(encodingType);
    }

    /**
     * <p>
     * The type of encoding you are using:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RLE_DICTIONARY</code> uses a combination of bit-packing and run-length encoding to store repeated values
     * more efficiently. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN</code> doesn't use encoding at all. Values are stored as they are.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN_DICTIONARY</code> builds a dictionary of the values encountered in a given column. The dictionary is
     * stored in a dictionary page for each column chunk.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encodingType
     *        The type of encoding you are using: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RLE_DICTIONARY</code> uses a combination of bit-packing and run-length encoding to store repeated
     *        values more efficiently. This is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLAIN</code> doesn't use encoding at all. Values are stored as they are.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLAIN_DICTIONARY</code> builds a dictionary of the values encountered in a given column. The
     *        dictionary is stored in a dictionary page for each column chunk.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncodingTypeValue
     */

    public S3Settings withEncodingType(EncodingTypeValue encodingType) {
        this.encodingType = encodingType.toString();
        return this;
    }

    /**
     * <p>
     * The maximum size of an encoded dictionary page of a column. If the dictionary page exceeds this, this column is
     * stored using an encoding type of <code>PLAIN</code>. This parameter defaults to 1024 * 1024 bytes (1 MiB), the
     * maximum size of a dictionary page before it reverts to <code>PLAIN</code> encoding. This size is used for
     * .parquet file format only.
     * </p>
     * 
     * @param dictPageSizeLimit
     *        The maximum size of an encoded dictionary page of a column. If the dictionary page exceeds this, this
     *        column is stored using an encoding type of <code>PLAIN</code>. This parameter defaults to 1024 * 1024
     *        bytes (1 MiB), the maximum size of a dictionary page before it reverts to <code>PLAIN</code> encoding.
     *        This size is used for .parquet file format only.
     */

    public void setDictPageSizeLimit(Integer dictPageSizeLimit) {
        this.dictPageSizeLimit = dictPageSizeLimit;
    }

    /**
     * <p>
     * The maximum size of an encoded dictionary page of a column. If the dictionary page exceeds this, this column is
     * stored using an encoding type of <code>PLAIN</code>. This parameter defaults to 1024 * 1024 bytes (1 MiB), the
     * maximum size of a dictionary page before it reverts to <code>PLAIN</code> encoding. This size is used for
     * .parquet file format only.
     * </p>
     * 
     * @return The maximum size of an encoded dictionary page of a column. If the dictionary page exceeds this, this
     *         column is stored using an encoding type of <code>PLAIN</code>. This parameter defaults to 1024 * 1024
     *         bytes (1 MiB), the maximum size of a dictionary page before it reverts to <code>PLAIN</code> encoding.
     *         This size is used for .parquet file format only.
     */

    public Integer getDictPageSizeLimit() {
        return this.dictPageSizeLimit;
    }

    /**
     * <p>
     * The maximum size of an encoded dictionary page of a column. If the dictionary page exceeds this, this column is
     * stored using an encoding type of <code>PLAIN</code>. This parameter defaults to 1024 * 1024 bytes (1 MiB), the
     * maximum size of a dictionary page before it reverts to <code>PLAIN</code> encoding. This size is used for
     * .parquet file format only.
     * </p>
     * 
     * @param dictPageSizeLimit
     *        The maximum size of an encoded dictionary page of a column. If the dictionary page exceeds this, this
     *        column is stored using an encoding type of <code>PLAIN</code>. This parameter defaults to 1024 * 1024
     *        bytes (1 MiB), the maximum size of a dictionary page before it reverts to <code>PLAIN</code> encoding.
     *        This size is used for .parquet file format only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withDictPageSizeLimit(Integer dictPageSizeLimit) {
        setDictPageSizeLimit(dictPageSizeLimit);
        return this;
    }

    /**
     * <p>
     * The number of rows in a row group. A smaller row group size provides faster reads. But as the number of row
     * groups grows, the slower writes become. This parameter defaults to 10,000 rows. This number is used for .parquet
     * file format only.
     * </p>
     * <p>
     * If you choose a value larger than the maximum, <code>RowGroupLength</code> is set to the max row group length in
     * bytes (64 * 1024 * 1024).
     * </p>
     * 
     * @param rowGroupLength
     *        The number of rows in a row group. A smaller row group size provides faster reads. But as the number of
     *        row groups grows, the slower writes become. This parameter defaults to 10,000 rows. This number is used
     *        for .parquet file format only. </p>
     *        <p>
     *        If you choose a value larger than the maximum, <code>RowGroupLength</code> is set to the max row group
     *        length in bytes (64 * 1024 * 1024).
     */

    public void setRowGroupLength(Integer rowGroupLength) {
        this.rowGroupLength = rowGroupLength;
    }

    /**
     * <p>
     * The number of rows in a row group. A smaller row group size provides faster reads. But as the number of row
     * groups grows, the slower writes become. This parameter defaults to 10,000 rows. This number is used for .parquet
     * file format only.
     * </p>
     * <p>
     * If you choose a value larger than the maximum, <code>RowGroupLength</code> is set to the max row group length in
     * bytes (64 * 1024 * 1024).
     * </p>
     * 
     * @return The number of rows in a row group. A smaller row group size provides faster reads. But as the number of
     *         row groups grows, the slower writes become. This parameter defaults to 10,000 rows. This number is used
     *         for .parquet file format only. </p>
     *         <p>
     *         If you choose a value larger than the maximum, <code>RowGroupLength</code> is set to the max row group
     *         length in bytes (64 * 1024 * 1024).
     */

    public Integer getRowGroupLength() {
        return this.rowGroupLength;
    }

    /**
     * <p>
     * The number of rows in a row group. A smaller row group size provides faster reads. But as the number of row
     * groups grows, the slower writes become. This parameter defaults to 10,000 rows. This number is used for .parquet
     * file format only.
     * </p>
     * <p>
     * If you choose a value larger than the maximum, <code>RowGroupLength</code> is set to the max row group length in
     * bytes (64 * 1024 * 1024).
     * </p>
     * 
     * @param rowGroupLength
     *        The number of rows in a row group. A smaller row group size provides faster reads. But as the number of
     *        row groups grows, the slower writes become. This parameter defaults to 10,000 rows. This number is used
     *        for .parquet file format only. </p>
     *        <p>
     *        If you choose a value larger than the maximum, <code>RowGroupLength</code> is set to the max row group
     *        length in bytes (64 * 1024 * 1024).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withRowGroupLength(Integer rowGroupLength) {
        setRowGroupLength(rowGroupLength);
        return this;
    }

    /**
     * <p>
     * The size of one data page in bytes. This parameter defaults to 1024 * 1024 bytes (1 MiB). This number is used for
     * .parquet file format only.
     * </p>
     * 
     * @param dataPageSize
     *        The size of one data page in bytes. This parameter defaults to 1024 * 1024 bytes (1 MiB). This number is
     *        used for .parquet file format only.
     */

    public void setDataPageSize(Integer dataPageSize) {
        this.dataPageSize = dataPageSize;
    }

    /**
     * <p>
     * The size of one data page in bytes. This parameter defaults to 1024 * 1024 bytes (1 MiB). This number is used for
     * .parquet file format only.
     * </p>
     * 
     * @return The size of one data page in bytes. This parameter defaults to 1024 * 1024 bytes (1 MiB). This number is
     *         used for .parquet file format only.
     */

    public Integer getDataPageSize() {
        return this.dataPageSize;
    }

    /**
     * <p>
     * The size of one data page in bytes. This parameter defaults to 1024 * 1024 bytes (1 MiB). This number is used for
     * .parquet file format only.
     * </p>
     * 
     * @param dataPageSize
     *        The size of one data page in bytes. This parameter defaults to 1024 * 1024 bytes (1 MiB). This number is
     *        used for .parquet file format only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withDataPageSize(Integer dataPageSize) {
        setDataPageSize(dataPageSize);
        return this;
    }

    /**
     * <p>
     * The version of the Apache Parquet format that you want to use: <code>parquet_1_0</code> (the default) or
     * <code>parquet_2_0</code>.
     * </p>
     * 
     * @param parquetVersion
     *        The version of the Apache Parquet format that you want to use: <code>parquet_1_0</code> (the default) or
     *        <code>parquet_2_0</code>.
     * @see ParquetVersionValue
     */

    public void setParquetVersion(String parquetVersion) {
        this.parquetVersion = parquetVersion;
    }

    /**
     * <p>
     * The version of the Apache Parquet format that you want to use: <code>parquet_1_0</code> (the default) or
     * <code>parquet_2_0</code>.
     * </p>
     * 
     * @return The version of the Apache Parquet format that you want to use: <code>parquet_1_0</code> (the default) or
     *         <code>parquet_2_0</code>.
     * @see ParquetVersionValue
     */

    public String getParquetVersion() {
        return this.parquetVersion;
    }

    /**
     * <p>
     * The version of the Apache Parquet format that you want to use: <code>parquet_1_0</code> (the default) or
     * <code>parquet_2_0</code>.
     * </p>
     * 
     * @param parquetVersion
     *        The version of the Apache Parquet format that you want to use: <code>parquet_1_0</code> (the default) or
     *        <code>parquet_2_0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParquetVersionValue
     */

    public S3Settings withParquetVersion(String parquetVersion) {
        setParquetVersion(parquetVersion);
        return this;
    }

    /**
     * <p>
     * The version of the Apache Parquet format that you want to use: <code>parquet_1_0</code> (the default) or
     * <code>parquet_2_0</code>.
     * </p>
     * 
     * @param parquetVersion
     *        The version of the Apache Parquet format that you want to use: <code>parquet_1_0</code> (the default) or
     *        <code>parquet_2_0</code>.
     * @see ParquetVersionValue
     */

    public void setParquetVersion(ParquetVersionValue parquetVersion) {
        withParquetVersion(parquetVersion);
    }

    /**
     * <p>
     * The version of the Apache Parquet format that you want to use: <code>parquet_1_0</code> (the default) or
     * <code>parquet_2_0</code>.
     * </p>
     * 
     * @param parquetVersion
     *        The version of the Apache Parquet format that you want to use: <code>parquet_1_0</code> (the default) or
     *        <code>parquet_2_0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParquetVersionValue
     */

    public S3Settings withParquetVersion(ParquetVersionValue parquetVersion) {
        this.parquetVersion = parquetVersion.toString();
        return this;
    }

    /**
     * <p>
     * A value that enables statistics for Parquet pages and row groups. Choose <code>true</code> to enable statistics,
     * <code>false</code> to disable. Statistics include <code>NULL</code>, <code>DISTINCT</code>, <code>MAX</code>, and
     * <code>MIN</code> values. This parameter defaults to <code>true</code>. This value is used for .parquet file
     * format only.
     * </p>
     * 
     * @param enableStatistics
     *        A value that enables statistics for Parquet pages and row groups. Choose <code>true</code> to enable
     *        statistics, <code>false</code> to disable. Statistics include <code>NULL</code>, <code>DISTINCT</code>,
     *        <code>MAX</code>, and <code>MIN</code> values. This parameter defaults to <code>true</code>. This value is
     *        used for .parquet file format only.
     */

    public void setEnableStatistics(Boolean enableStatistics) {
        this.enableStatistics = enableStatistics;
    }

    /**
     * <p>
     * A value that enables statistics for Parquet pages and row groups. Choose <code>true</code> to enable statistics,
     * <code>false</code> to disable. Statistics include <code>NULL</code>, <code>DISTINCT</code>, <code>MAX</code>, and
     * <code>MIN</code> values. This parameter defaults to <code>true</code>. This value is used for .parquet file
     * format only.
     * </p>
     * 
     * @return A value that enables statistics for Parquet pages and row groups. Choose <code>true</code> to enable
     *         statistics, <code>false</code> to disable. Statistics include <code>NULL</code>, <code>DISTINCT</code>,
     *         <code>MAX</code>, and <code>MIN</code> values. This parameter defaults to <code>true</code>. This value
     *         is used for .parquet file format only.
     */

    public Boolean getEnableStatistics() {
        return this.enableStatistics;
    }

    /**
     * <p>
     * A value that enables statistics for Parquet pages and row groups. Choose <code>true</code> to enable statistics,
     * <code>false</code> to disable. Statistics include <code>NULL</code>, <code>DISTINCT</code>, <code>MAX</code>, and
     * <code>MIN</code> values. This parameter defaults to <code>true</code>. This value is used for .parquet file
     * format only.
     * </p>
     * 
     * @param enableStatistics
     *        A value that enables statistics for Parquet pages and row groups. Choose <code>true</code> to enable
     *        statistics, <code>false</code> to disable. Statistics include <code>NULL</code>, <code>DISTINCT</code>,
     *        <code>MAX</code>, and <code>MIN</code> values. This parameter defaults to <code>true</code>. This value is
     *        used for .parquet file format only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withEnableStatistics(Boolean enableStatistics) {
        setEnableStatistics(enableStatistics);
        return this;
    }

    /**
     * <p>
     * A value that enables statistics for Parquet pages and row groups. Choose <code>true</code> to enable statistics,
     * <code>false</code> to disable. Statistics include <code>NULL</code>, <code>DISTINCT</code>, <code>MAX</code>, and
     * <code>MIN</code> values. This parameter defaults to <code>true</code>. This value is used for .parquet file
     * format only.
     * </p>
     * 
     * @return A value that enables statistics for Parquet pages and row groups. Choose <code>true</code> to enable
     *         statistics, <code>false</code> to disable. Statistics include <code>NULL</code>, <code>DISTINCT</code>,
     *         <code>MAX</code>, and <code>MIN</code> values. This parameter defaults to <code>true</code>. This value
     *         is used for .parquet file format only.
     */

    public Boolean isEnableStatistics() {
        return this.enableStatistics;
    }

    /**
     * <p>
     * A value that enables a full load to write INSERT operations to the comma-separated value (.csv) output files only
     * to indicate how the rows were added to the source database.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>IncludeOpForFullLoad</code> parameter in versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * For full load, records can only be inserted. By default (the <code>false</code> setting), no information is
     * recorded in these output files for a full load to indicate that the rows were inserted at the source database. If
     * <code>IncludeOpForFullLoad</code> is set to <code>true</code> or <code>y</code>, the INSERT is recorded as an I
     * annotation in the first field of the .csv file. This allows the format of your target records from a full load to
     * be consistent with the target records from a CDC load.
     * </p>
     * <note>
     * <p>
     * This setting works together with the <code>CdcInsertsOnly</code> and the <code>CdcInsertsAndUpdates</code>
     * parameters for output to .csv files only. For more information about how these settings work together, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps">
     * Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User Guide.</i>.
     * </p>
     * </note>
     * 
     * @param includeOpForFullLoad
     *        A value that enables a full load to write INSERT operations to the comma-separated value (.csv) output
     *        files only to indicate how the rows were added to the source database.</p> <note>
     *        <p>
     *        AWS DMS supports the <code>IncludeOpForFullLoad</code> parameter in versions 3.1.4 and later.
     *        </p>
     *        </note>
     *        <p>
     *        For full load, records can only be inserted. By default (the <code>false</code> setting), no information
     *        is recorded in these output files for a full load to indicate that the rows were inserted at the source
     *        database. If <code>IncludeOpForFullLoad</code> is set to <code>true</code> or <code>y</code>, the INSERT
     *        is recorded as an I annotation in the first field of the .csv file. This allows the format of your target
     *        records from a full load to be consistent with the target records from a CDC load.
     *        </p>
     *        <note>
     *        <p>
     *        This setting works together with the <code>CdcInsertsOnly</code> and the <code>CdcInsertsAndUpdates</code>
     *        parameters for output to .csv files only. For more information about how these settings work together, see
     *        <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *        >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     *        Guide.</i>.
     *        </p>
     */

    public void setIncludeOpForFullLoad(Boolean includeOpForFullLoad) {
        this.includeOpForFullLoad = includeOpForFullLoad;
    }

    /**
     * <p>
     * A value that enables a full load to write INSERT operations to the comma-separated value (.csv) output files only
     * to indicate how the rows were added to the source database.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>IncludeOpForFullLoad</code> parameter in versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * For full load, records can only be inserted. By default (the <code>false</code> setting), no information is
     * recorded in these output files for a full load to indicate that the rows were inserted at the source database. If
     * <code>IncludeOpForFullLoad</code> is set to <code>true</code> or <code>y</code>, the INSERT is recorded as an I
     * annotation in the first field of the .csv file. This allows the format of your target records from a full load to
     * be consistent with the target records from a CDC load.
     * </p>
     * <note>
     * <p>
     * This setting works together with the <code>CdcInsertsOnly</code> and the <code>CdcInsertsAndUpdates</code>
     * parameters for output to .csv files only. For more information about how these settings work together, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps">
     * Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User Guide.</i>.
     * </p>
     * </note>
     * 
     * @return A value that enables a full load to write INSERT operations to the comma-separated value (.csv) output
     *         files only to indicate how the rows were added to the source database.</p> <note>
     *         <p>
     *         AWS DMS supports the <code>IncludeOpForFullLoad</code> parameter in versions 3.1.4 and later.
     *         </p>
     *         </note>
     *         <p>
     *         For full load, records can only be inserted. By default (the <code>false</code> setting), no information
     *         is recorded in these output files for a full load to indicate that the rows were inserted at the source
     *         database. If <code>IncludeOpForFullLoad</code> is set to <code>true</code> or <code>y</code>, the INSERT
     *         is recorded as an I annotation in the first field of the .csv file. This allows the format of your target
     *         records from a full load to be consistent with the target records from a CDC load.
     *         </p>
     *         <note>
     *         <p>
     *         This setting works together with the <code>CdcInsertsOnly</code> and the
     *         <code>CdcInsertsAndUpdates</code> parameters for output to .csv files only. For more information about
     *         how these settings work together, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *         >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     *         Guide.</i>.
     *         </p>
     */

    public Boolean getIncludeOpForFullLoad() {
        return this.includeOpForFullLoad;
    }

    /**
     * <p>
     * A value that enables a full load to write INSERT operations to the comma-separated value (.csv) output files only
     * to indicate how the rows were added to the source database.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>IncludeOpForFullLoad</code> parameter in versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * For full load, records can only be inserted. By default (the <code>false</code> setting), no information is
     * recorded in these output files for a full load to indicate that the rows were inserted at the source database. If
     * <code>IncludeOpForFullLoad</code> is set to <code>true</code> or <code>y</code>, the INSERT is recorded as an I
     * annotation in the first field of the .csv file. This allows the format of your target records from a full load to
     * be consistent with the target records from a CDC load.
     * </p>
     * <note>
     * <p>
     * This setting works together with the <code>CdcInsertsOnly</code> and the <code>CdcInsertsAndUpdates</code>
     * parameters for output to .csv files only. For more information about how these settings work together, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps">
     * Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User Guide.</i>.
     * </p>
     * </note>
     * 
     * @param includeOpForFullLoad
     *        A value that enables a full load to write INSERT operations to the comma-separated value (.csv) output
     *        files only to indicate how the rows were added to the source database.</p> <note>
     *        <p>
     *        AWS DMS supports the <code>IncludeOpForFullLoad</code> parameter in versions 3.1.4 and later.
     *        </p>
     *        </note>
     *        <p>
     *        For full load, records can only be inserted. By default (the <code>false</code> setting), no information
     *        is recorded in these output files for a full load to indicate that the rows were inserted at the source
     *        database. If <code>IncludeOpForFullLoad</code> is set to <code>true</code> or <code>y</code>, the INSERT
     *        is recorded as an I annotation in the first field of the .csv file. This allows the format of your target
     *        records from a full load to be consistent with the target records from a CDC load.
     *        </p>
     *        <note>
     *        <p>
     *        This setting works together with the <code>CdcInsertsOnly</code> and the <code>CdcInsertsAndUpdates</code>
     *        parameters for output to .csv files only. For more information about how these settings work together, see
     *        <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *        >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     *        Guide.</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withIncludeOpForFullLoad(Boolean includeOpForFullLoad) {
        setIncludeOpForFullLoad(includeOpForFullLoad);
        return this;
    }

    /**
     * <p>
     * A value that enables a full load to write INSERT operations to the comma-separated value (.csv) output files only
     * to indicate how the rows were added to the source database.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>IncludeOpForFullLoad</code> parameter in versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * For full load, records can only be inserted. By default (the <code>false</code> setting), no information is
     * recorded in these output files for a full load to indicate that the rows were inserted at the source database. If
     * <code>IncludeOpForFullLoad</code> is set to <code>true</code> or <code>y</code>, the INSERT is recorded as an I
     * annotation in the first field of the .csv file. This allows the format of your target records from a full load to
     * be consistent with the target records from a CDC load.
     * </p>
     * <note>
     * <p>
     * This setting works together with the <code>CdcInsertsOnly</code> and the <code>CdcInsertsAndUpdates</code>
     * parameters for output to .csv files only. For more information about how these settings work together, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps">
     * Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User Guide.</i>.
     * </p>
     * </note>
     * 
     * @return A value that enables a full load to write INSERT operations to the comma-separated value (.csv) output
     *         files only to indicate how the rows were added to the source database.</p> <note>
     *         <p>
     *         AWS DMS supports the <code>IncludeOpForFullLoad</code> parameter in versions 3.1.4 and later.
     *         </p>
     *         </note>
     *         <p>
     *         For full load, records can only be inserted. By default (the <code>false</code> setting), no information
     *         is recorded in these output files for a full load to indicate that the rows were inserted at the source
     *         database. If <code>IncludeOpForFullLoad</code> is set to <code>true</code> or <code>y</code>, the INSERT
     *         is recorded as an I annotation in the first field of the .csv file. This allows the format of your target
     *         records from a full load to be consistent with the target records from a CDC load.
     *         </p>
     *         <note>
     *         <p>
     *         This setting works together with the <code>CdcInsertsOnly</code> and the
     *         <code>CdcInsertsAndUpdates</code> parameters for output to .csv files only. For more information about
     *         how these settings work together, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *         >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     *         Guide.</i>.
     *         </p>
     */

    public Boolean isIncludeOpForFullLoad() {
        return this.includeOpForFullLoad;
    }

    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write only INSERT operations to .csv or columnar storage
     * (.parquet) output files. By default (the <code>false</code> setting), the first field in a .csv or .parquet
     * record contains the letter I (INSERT), U (UPDATE), or D (DELETE). These values indicate whether the row was
     * inserted, updated, or deleted at the source database for a CDC load to the target.
     * </p>
     * <p>
     * If <code>CdcInsertsOnly</code> is set to <code>true</code> or <code>y</code>, only INSERTs from the source
     * database are migrated to the .csv or .parquet file. For .csv format only, how these INSERTs are recorded depends
     * on the value of <code>IncludeOpForFullLoad</code>. If <code>IncludeOpForFullLoad</code> is set to
     * <code>true</code>, the first field of every CDC record is set to I to indicate the INSERT operation at the
     * source. If <code>IncludeOpForFullLoad</code> is set to <code>false</code>, every CDC record is written without a
     * first field to indicate the INSERT operation at the source. For more information about how these settings work
     * together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     * Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the interaction described preceding between the <code>CdcInsertsOnly</code> and
     * <code>IncludeOpForFullLoad</code> parameters in versions 3.1.4 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't both be set to <code>true</code> for the
     * same endpoint. Set either <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to <code>true</code>
     * for the same endpoint, but not both.
     * </p>
     * </note>
     * 
     * @param cdcInsertsOnly
     *        A value that enables a change data capture (CDC) load to write only INSERT operations to .csv or columnar
     *        storage (.parquet) output files. By default (the <code>false</code> setting), the first field in a .csv or
     *        .parquet record contains the letter I (INSERT), U (UPDATE), or D (DELETE). These values indicate whether
     *        the row was inserted, updated, or deleted at the source database for a CDC load to the target.</p>
     *        <p>
     *        If <code>CdcInsertsOnly</code> is set to <code>true</code> or <code>y</code>, only INSERTs from the source
     *        database are migrated to the .csv or .parquet file. For .csv format only, how these INSERTs are recorded
     *        depends on the value of <code>IncludeOpForFullLoad</code>. If <code>IncludeOpForFullLoad</code> is set to
     *        <code>true</code>, the first field of every CDC record is set to I to indicate the INSERT operation at the
     *        source. If <code>IncludeOpForFullLoad</code> is set to <code>false</code>, every CDC record is written
     *        without a first field to indicate the INSERT operation at the source. For more information about how these
     *        settings work together, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *        >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     *        Guide.</i>.
     *        </p>
     *        <note>
     *        <p>
     *        AWS DMS supports the interaction described preceding between the <code>CdcInsertsOnly</code> and
     *        <code>IncludeOpForFullLoad</code> parameters in versions 3.1.4 and later.
     *        </p>
     *        <p>
     *        <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't both be set to <code>true</code>
     *        for the same endpoint. Set either <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to
     *        <code>true</code> for the same endpoint, but not both.
     *        </p>
     */

    public void setCdcInsertsOnly(Boolean cdcInsertsOnly) {
        this.cdcInsertsOnly = cdcInsertsOnly;
    }

    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write only INSERT operations to .csv or columnar storage
     * (.parquet) output files. By default (the <code>false</code> setting), the first field in a .csv or .parquet
     * record contains the letter I (INSERT), U (UPDATE), or D (DELETE). These values indicate whether the row was
     * inserted, updated, or deleted at the source database for a CDC load to the target.
     * </p>
     * <p>
     * If <code>CdcInsertsOnly</code> is set to <code>true</code> or <code>y</code>, only INSERTs from the source
     * database are migrated to the .csv or .parquet file. For .csv format only, how these INSERTs are recorded depends
     * on the value of <code>IncludeOpForFullLoad</code>. If <code>IncludeOpForFullLoad</code> is set to
     * <code>true</code>, the first field of every CDC record is set to I to indicate the INSERT operation at the
     * source. If <code>IncludeOpForFullLoad</code> is set to <code>false</code>, every CDC record is written without a
     * first field to indicate the INSERT operation at the source. For more information about how these settings work
     * together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     * Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the interaction described preceding between the <code>CdcInsertsOnly</code> and
     * <code>IncludeOpForFullLoad</code> parameters in versions 3.1.4 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't both be set to <code>true</code> for the
     * same endpoint. Set either <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to <code>true</code>
     * for the same endpoint, but not both.
     * </p>
     * </note>
     * 
     * @return A value that enables a change data capture (CDC) load to write only INSERT operations to .csv or columnar
     *         storage (.parquet) output files. By default (the <code>false</code> setting), the first field in a .csv
     *         or .parquet record contains the letter I (INSERT), U (UPDATE), or D (DELETE). These values indicate
     *         whether the row was inserted, updated, or deleted at the source database for a CDC load to the
     *         target.</p>
     *         <p>
     *         If <code>CdcInsertsOnly</code> is set to <code>true</code> or <code>y</code>, only INSERTs from the
     *         source database are migrated to the .csv or .parquet file. For .csv format only, how these INSERTs are
     *         recorded depends on the value of <code>IncludeOpForFullLoad</code>. If <code>IncludeOpForFullLoad</code>
     *         is set to <code>true</code>, the first field of every CDC record is set to I to indicate the INSERT
     *         operation at the source. If <code>IncludeOpForFullLoad</code> is set to <code>false</code>, every CDC
     *         record is written without a first field to indicate the INSERT operation at the source. For more
     *         information about how these settings work together, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *         >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     *         Guide.</i>.
     *         </p>
     *         <note>
     *         <p>
     *         AWS DMS supports the interaction described preceding between the <code>CdcInsertsOnly</code> and
     *         <code>IncludeOpForFullLoad</code> parameters in versions 3.1.4 and later.
     *         </p>
     *         <p>
     *         <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't both be set to <code>true</code>
     *         for the same endpoint. Set either <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to
     *         <code>true</code> for the same endpoint, but not both.
     *         </p>
     */

    public Boolean getCdcInsertsOnly() {
        return this.cdcInsertsOnly;
    }

    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write only INSERT operations to .csv or columnar storage
     * (.parquet) output files. By default (the <code>false</code> setting), the first field in a .csv or .parquet
     * record contains the letter I (INSERT), U (UPDATE), or D (DELETE). These values indicate whether the row was
     * inserted, updated, or deleted at the source database for a CDC load to the target.
     * </p>
     * <p>
     * If <code>CdcInsertsOnly</code> is set to <code>true</code> or <code>y</code>, only INSERTs from the source
     * database are migrated to the .csv or .parquet file. For .csv format only, how these INSERTs are recorded depends
     * on the value of <code>IncludeOpForFullLoad</code>. If <code>IncludeOpForFullLoad</code> is set to
     * <code>true</code>, the first field of every CDC record is set to I to indicate the INSERT operation at the
     * source. If <code>IncludeOpForFullLoad</code> is set to <code>false</code>, every CDC record is written without a
     * first field to indicate the INSERT operation at the source. For more information about how these settings work
     * together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     * Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the interaction described preceding between the <code>CdcInsertsOnly</code> and
     * <code>IncludeOpForFullLoad</code> parameters in versions 3.1.4 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't both be set to <code>true</code> for the
     * same endpoint. Set either <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to <code>true</code>
     * for the same endpoint, but not both.
     * </p>
     * </note>
     * 
     * @param cdcInsertsOnly
     *        A value that enables a change data capture (CDC) load to write only INSERT operations to .csv or columnar
     *        storage (.parquet) output files. By default (the <code>false</code> setting), the first field in a .csv or
     *        .parquet record contains the letter I (INSERT), U (UPDATE), or D (DELETE). These values indicate whether
     *        the row was inserted, updated, or deleted at the source database for a CDC load to the target.</p>
     *        <p>
     *        If <code>CdcInsertsOnly</code> is set to <code>true</code> or <code>y</code>, only INSERTs from the source
     *        database are migrated to the .csv or .parquet file. For .csv format only, how these INSERTs are recorded
     *        depends on the value of <code>IncludeOpForFullLoad</code>. If <code>IncludeOpForFullLoad</code> is set to
     *        <code>true</code>, the first field of every CDC record is set to I to indicate the INSERT operation at the
     *        source. If <code>IncludeOpForFullLoad</code> is set to <code>false</code>, every CDC record is written
     *        without a first field to indicate the INSERT operation at the source. For more information about how these
     *        settings work together, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *        >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     *        Guide.</i>.
     *        </p>
     *        <note>
     *        <p>
     *        AWS DMS supports the interaction described preceding between the <code>CdcInsertsOnly</code> and
     *        <code>IncludeOpForFullLoad</code> parameters in versions 3.1.4 and later.
     *        </p>
     *        <p>
     *        <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't both be set to <code>true</code>
     *        for the same endpoint. Set either <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to
     *        <code>true</code> for the same endpoint, but not both.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withCdcInsertsOnly(Boolean cdcInsertsOnly) {
        setCdcInsertsOnly(cdcInsertsOnly);
        return this;
    }

    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write only INSERT operations to .csv or columnar storage
     * (.parquet) output files. By default (the <code>false</code> setting), the first field in a .csv or .parquet
     * record contains the letter I (INSERT), U (UPDATE), or D (DELETE). These values indicate whether the row was
     * inserted, updated, or deleted at the source database for a CDC load to the target.
     * </p>
     * <p>
     * If <code>CdcInsertsOnly</code> is set to <code>true</code> or <code>y</code>, only INSERTs from the source
     * database are migrated to the .csv or .parquet file. For .csv format only, how these INSERTs are recorded depends
     * on the value of <code>IncludeOpForFullLoad</code>. If <code>IncludeOpForFullLoad</code> is set to
     * <code>true</code>, the first field of every CDC record is set to I to indicate the INSERT operation at the
     * source. If <code>IncludeOpForFullLoad</code> is set to <code>false</code>, every CDC record is written without a
     * first field to indicate the INSERT operation at the source. For more information about how these settings work
     * together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     * Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the interaction described preceding between the <code>CdcInsertsOnly</code> and
     * <code>IncludeOpForFullLoad</code> parameters in versions 3.1.4 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't both be set to <code>true</code> for the
     * same endpoint. Set either <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to <code>true</code>
     * for the same endpoint, but not both.
     * </p>
     * </note>
     * 
     * @return A value that enables a change data capture (CDC) load to write only INSERT operations to .csv or columnar
     *         storage (.parquet) output files. By default (the <code>false</code> setting), the first field in a .csv
     *         or .parquet record contains the letter I (INSERT), U (UPDATE), or D (DELETE). These values indicate
     *         whether the row was inserted, updated, or deleted at the source database for a CDC load to the
     *         target.</p>
     *         <p>
     *         If <code>CdcInsertsOnly</code> is set to <code>true</code> or <code>y</code>, only INSERTs from the
     *         source database are migrated to the .csv or .parquet file. For .csv format only, how these INSERTs are
     *         recorded depends on the value of <code>IncludeOpForFullLoad</code>. If <code>IncludeOpForFullLoad</code>
     *         is set to <code>true</code>, the first field of every CDC record is set to I to indicate the INSERT
     *         operation at the source. If <code>IncludeOpForFullLoad</code> is set to <code>false</code>, every CDC
     *         record is written without a first field to indicate the INSERT operation at the source. For more
     *         information about how these settings work together, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *         >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     *         Guide.</i>.
     *         </p>
     *         <note>
     *         <p>
     *         AWS DMS supports the interaction described preceding between the <code>CdcInsertsOnly</code> and
     *         <code>IncludeOpForFullLoad</code> parameters in versions 3.1.4 and later.
     *         </p>
     *         <p>
     *         <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't both be set to <code>true</code>
     *         for the same endpoint. Set either <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to
     *         <code>true</code> for the same endpoint, but not both.
     *         </p>
     */

    public Boolean isCdcInsertsOnly() {
        return this.cdcInsertsOnly;
    }

    /**
     * <p>
     * A value that when nonblank causes AWS DMS to add a column with timestamp information to the endpoint data for an
     * Amazon S3 target.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>TimestampColumnName</code> parameter in versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * DMS includes an additional <code>STRING</code> column in the .csv or .parquet object files of your migrated data
     * when you set <code>TimestampColumnName</code> to a nonblank value.
     * </p>
     * <p>
     * For a full load, each row of this timestamp column contains a timestamp for when the data was transferred from
     * the source to the target by DMS.
     * </p>
     * <p>
     * For a change data capture (CDC) load, each row of the timestamp column contains the timestamp for the commit of
     * that row in the source database.
     * </p>
     * <p>
     * The string format for this timestamp column value is <code>yyyy-MM-dd HH:mm:ss.SSSSSS</code>. By default, the
     * precision of this value is in microseconds. For a CDC load, the rounding of the precision depends on the commit
     * timestamp supported by DMS for the source database.
     * </p>
     * <p>
     * When the <code>AddColumnName</code> parameter is set to <code>true</code>, DMS also includes a name for the
     * timestamp column that you set with <code>TimestampColumnName</code>.
     * </p>
     * 
     * @param timestampColumnName
     *        A value that when nonblank causes AWS DMS to add a column with timestamp information to the endpoint data
     *        for an Amazon S3 target.</p> <note>
     *        <p>
     *        AWS DMS supports the <code>TimestampColumnName</code> parameter in versions 3.1.4 and later.
     *        </p>
     *        </note>
     *        <p>
     *        DMS includes an additional <code>STRING</code> column in the .csv or .parquet object files of your
     *        migrated data when you set <code>TimestampColumnName</code> to a nonblank value.
     *        </p>
     *        <p>
     *        For a full load, each row of this timestamp column contains a timestamp for when the data was transferred
     *        from the source to the target by DMS.
     *        </p>
     *        <p>
     *        For a change data capture (CDC) load, each row of the timestamp column contains the timestamp for the
     *        commit of that row in the source database.
     *        </p>
     *        <p>
     *        The string format for this timestamp column value is <code>yyyy-MM-dd HH:mm:ss.SSSSSS</code>. By default,
     *        the precision of this value is in microseconds. For a CDC load, the rounding of the precision depends on
     *        the commit timestamp supported by DMS for the source database.
     *        </p>
     *        <p>
     *        When the <code>AddColumnName</code> parameter is set to <code>true</code>, DMS also includes a name for
     *        the timestamp column that you set with <code>TimestampColumnName</code>.
     */

    public void setTimestampColumnName(String timestampColumnName) {
        this.timestampColumnName = timestampColumnName;
    }

    /**
     * <p>
     * A value that when nonblank causes AWS DMS to add a column with timestamp information to the endpoint data for an
     * Amazon S3 target.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>TimestampColumnName</code> parameter in versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * DMS includes an additional <code>STRING</code> column in the .csv or .parquet object files of your migrated data
     * when you set <code>TimestampColumnName</code> to a nonblank value.
     * </p>
     * <p>
     * For a full load, each row of this timestamp column contains a timestamp for when the data was transferred from
     * the source to the target by DMS.
     * </p>
     * <p>
     * For a change data capture (CDC) load, each row of the timestamp column contains the timestamp for the commit of
     * that row in the source database.
     * </p>
     * <p>
     * The string format for this timestamp column value is <code>yyyy-MM-dd HH:mm:ss.SSSSSS</code>. By default, the
     * precision of this value is in microseconds. For a CDC load, the rounding of the precision depends on the commit
     * timestamp supported by DMS for the source database.
     * </p>
     * <p>
     * When the <code>AddColumnName</code> parameter is set to <code>true</code>, DMS also includes a name for the
     * timestamp column that you set with <code>TimestampColumnName</code>.
     * </p>
     * 
     * @return A value that when nonblank causes AWS DMS to add a column with timestamp information to the endpoint data
     *         for an Amazon S3 target.</p> <note>
     *         <p>
     *         AWS DMS supports the <code>TimestampColumnName</code> parameter in versions 3.1.4 and later.
     *         </p>
     *         </note>
     *         <p>
     *         DMS includes an additional <code>STRING</code> column in the .csv or .parquet object files of your
     *         migrated data when you set <code>TimestampColumnName</code> to a nonblank value.
     *         </p>
     *         <p>
     *         For a full load, each row of this timestamp column contains a timestamp for when the data was transferred
     *         from the source to the target by DMS.
     *         </p>
     *         <p>
     *         For a change data capture (CDC) load, each row of the timestamp column contains the timestamp for the
     *         commit of that row in the source database.
     *         </p>
     *         <p>
     *         The string format for this timestamp column value is <code>yyyy-MM-dd HH:mm:ss.SSSSSS</code>. By default,
     *         the precision of this value is in microseconds. For a CDC load, the rounding of the precision depends on
     *         the commit timestamp supported by DMS for the source database.
     *         </p>
     *         <p>
     *         When the <code>AddColumnName</code> parameter is set to <code>true</code>, DMS also includes a name for
     *         the timestamp column that you set with <code>TimestampColumnName</code>.
     */

    public String getTimestampColumnName() {
        return this.timestampColumnName;
    }

    /**
     * <p>
     * A value that when nonblank causes AWS DMS to add a column with timestamp information to the endpoint data for an
     * Amazon S3 target.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>TimestampColumnName</code> parameter in versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * DMS includes an additional <code>STRING</code> column in the .csv or .parquet object files of your migrated data
     * when you set <code>TimestampColumnName</code> to a nonblank value.
     * </p>
     * <p>
     * For a full load, each row of this timestamp column contains a timestamp for when the data was transferred from
     * the source to the target by DMS.
     * </p>
     * <p>
     * For a change data capture (CDC) load, each row of the timestamp column contains the timestamp for the commit of
     * that row in the source database.
     * </p>
     * <p>
     * The string format for this timestamp column value is <code>yyyy-MM-dd HH:mm:ss.SSSSSS</code>. By default, the
     * precision of this value is in microseconds. For a CDC load, the rounding of the precision depends on the commit
     * timestamp supported by DMS for the source database.
     * </p>
     * <p>
     * When the <code>AddColumnName</code> parameter is set to <code>true</code>, DMS also includes a name for the
     * timestamp column that you set with <code>TimestampColumnName</code>.
     * </p>
     * 
     * @param timestampColumnName
     *        A value that when nonblank causes AWS DMS to add a column with timestamp information to the endpoint data
     *        for an Amazon S3 target.</p> <note>
     *        <p>
     *        AWS DMS supports the <code>TimestampColumnName</code> parameter in versions 3.1.4 and later.
     *        </p>
     *        </note>
     *        <p>
     *        DMS includes an additional <code>STRING</code> column in the .csv or .parquet object files of your
     *        migrated data when you set <code>TimestampColumnName</code> to a nonblank value.
     *        </p>
     *        <p>
     *        For a full load, each row of this timestamp column contains a timestamp for when the data was transferred
     *        from the source to the target by DMS.
     *        </p>
     *        <p>
     *        For a change data capture (CDC) load, each row of the timestamp column contains the timestamp for the
     *        commit of that row in the source database.
     *        </p>
     *        <p>
     *        The string format for this timestamp column value is <code>yyyy-MM-dd HH:mm:ss.SSSSSS</code>. By default,
     *        the precision of this value is in microseconds. For a CDC load, the rounding of the precision depends on
     *        the commit timestamp supported by DMS for the source database.
     *        </p>
     *        <p>
     *        When the <code>AddColumnName</code> parameter is set to <code>true</code>, DMS also includes a name for
     *        the timestamp column that you set with <code>TimestampColumnName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withTimestampColumnName(String timestampColumnName) {
        setTimestampColumnName(timestampColumnName);
        return this;
    }

    /**
     * <p>
     * A value that specifies the precision of any <code>TIMESTAMP</code> column values that are written to an Amazon S3
     * object file in .parquet format.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>ParquetTimestampInMillisecond</code> parameter in versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * When <code>ParquetTimestampInMillisecond</code> is set to <code>true</code> or <code>y</code>, AWS DMS writes all
     * <code>TIMESTAMP</code> columns in a .parquet formatted file with millisecond precision. Otherwise, DMS writes
     * them with microsecond precision.
     * </p>
     * <p>
     * Currently, Amazon Athena and AWS Glue can handle only millisecond precision for <code>TIMESTAMP</code> values.
     * Set this parameter to <code>true</code> for S3 endpoint object files that are .parquet formatted only if you plan
     * to query or process the data with Athena or AWS Glue.
     * </p>
     * <note>
     * <p>
     * AWS DMS writes any <code>TIMESTAMP</code> column values written to an S3 file in .csv format with microsecond
     * precision.
     * </p>
     * <p>
     * Setting <code>ParquetTimestampInMillisecond</code> has no effect on the string format of the timestamp column
     * value that is inserted by setting the <code>TimestampColumnName</code> parameter.
     * </p>
     * </note>
     * 
     * @param parquetTimestampInMillisecond
     *        A value that specifies the precision of any <code>TIMESTAMP</code> column values that are written to an
     *        Amazon S3 object file in .parquet format.</p> <note>
     *        <p>
     *        AWS DMS supports the <code>ParquetTimestampInMillisecond</code> parameter in versions 3.1.4 and later.
     *        </p>
     *        </note>
     *        <p>
     *        When <code>ParquetTimestampInMillisecond</code> is set to <code>true</code> or <code>y</code>, AWS DMS
     *        writes all <code>TIMESTAMP</code> columns in a .parquet formatted file with millisecond precision.
     *        Otherwise, DMS writes them with microsecond precision.
     *        </p>
     *        <p>
     *        Currently, Amazon Athena and AWS Glue can handle only millisecond precision for <code>TIMESTAMP</code>
     *        values. Set this parameter to <code>true</code> for S3 endpoint object files that are .parquet formatted
     *        only if you plan to query or process the data with Athena or AWS Glue.
     *        </p>
     *        <note>
     *        <p>
     *        AWS DMS writes any <code>TIMESTAMP</code> column values written to an S3 file in .csv format with
     *        microsecond precision.
     *        </p>
     *        <p>
     *        Setting <code>ParquetTimestampInMillisecond</code> has no effect on the string format of the timestamp
     *        column value that is inserted by setting the <code>TimestampColumnName</code> parameter.
     *        </p>
     */

    public void setParquetTimestampInMillisecond(Boolean parquetTimestampInMillisecond) {
        this.parquetTimestampInMillisecond = parquetTimestampInMillisecond;
    }

    /**
     * <p>
     * A value that specifies the precision of any <code>TIMESTAMP</code> column values that are written to an Amazon S3
     * object file in .parquet format.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>ParquetTimestampInMillisecond</code> parameter in versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * When <code>ParquetTimestampInMillisecond</code> is set to <code>true</code> or <code>y</code>, AWS DMS writes all
     * <code>TIMESTAMP</code> columns in a .parquet formatted file with millisecond precision. Otherwise, DMS writes
     * them with microsecond precision.
     * </p>
     * <p>
     * Currently, Amazon Athena and AWS Glue can handle only millisecond precision for <code>TIMESTAMP</code> values.
     * Set this parameter to <code>true</code> for S3 endpoint object files that are .parquet formatted only if you plan
     * to query or process the data with Athena or AWS Glue.
     * </p>
     * <note>
     * <p>
     * AWS DMS writes any <code>TIMESTAMP</code> column values written to an S3 file in .csv format with microsecond
     * precision.
     * </p>
     * <p>
     * Setting <code>ParquetTimestampInMillisecond</code> has no effect on the string format of the timestamp column
     * value that is inserted by setting the <code>TimestampColumnName</code> parameter.
     * </p>
     * </note>
     * 
     * @return A value that specifies the precision of any <code>TIMESTAMP</code> column values that are written to an
     *         Amazon S3 object file in .parquet format.</p> <note>
     *         <p>
     *         AWS DMS supports the <code>ParquetTimestampInMillisecond</code> parameter in versions 3.1.4 and later.
     *         </p>
     *         </note>
     *         <p>
     *         When <code>ParquetTimestampInMillisecond</code> is set to <code>true</code> or <code>y</code>, AWS DMS
     *         writes all <code>TIMESTAMP</code> columns in a .parquet formatted file with millisecond precision.
     *         Otherwise, DMS writes them with microsecond precision.
     *         </p>
     *         <p>
     *         Currently, Amazon Athena and AWS Glue can handle only millisecond precision for <code>TIMESTAMP</code>
     *         values. Set this parameter to <code>true</code> for S3 endpoint object files that are .parquet formatted
     *         only if you plan to query or process the data with Athena or AWS Glue.
     *         </p>
     *         <note>
     *         <p>
     *         AWS DMS writes any <code>TIMESTAMP</code> column values written to an S3 file in .csv format with
     *         microsecond precision.
     *         </p>
     *         <p>
     *         Setting <code>ParquetTimestampInMillisecond</code> has no effect on the string format of the timestamp
     *         column value that is inserted by setting the <code>TimestampColumnName</code> parameter.
     *         </p>
     */

    public Boolean getParquetTimestampInMillisecond() {
        return this.parquetTimestampInMillisecond;
    }

    /**
     * <p>
     * A value that specifies the precision of any <code>TIMESTAMP</code> column values that are written to an Amazon S3
     * object file in .parquet format.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>ParquetTimestampInMillisecond</code> parameter in versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * When <code>ParquetTimestampInMillisecond</code> is set to <code>true</code> or <code>y</code>, AWS DMS writes all
     * <code>TIMESTAMP</code> columns in a .parquet formatted file with millisecond precision. Otherwise, DMS writes
     * them with microsecond precision.
     * </p>
     * <p>
     * Currently, Amazon Athena and AWS Glue can handle only millisecond precision for <code>TIMESTAMP</code> values.
     * Set this parameter to <code>true</code> for S3 endpoint object files that are .parquet formatted only if you plan
     * to query or process the data with Athena or AWS Glue.
     * </p>
     * <note>
     * <p>
     * AWS DMS writes any <code>TIMESTAMP</code> column values written to an S3 file in .csv format with microsecond
     * precision.
     * </p>
     * <p>
     * Setting <code>ParquetTimestampInMillisecond</code> has no effect on the string format of the timestamp column
     * value that is inserted by setting the <code>TimestampColumnName</code> parameter.
     * </p>
     * </note>
     * 
     * @param parquetTimestampInMillisecond
     *        A value that specifies the precision of any <code>TIMESTAMP</code> column values that are written to an
     *        Amazon S3 object file in .parquet format.</p> <note>
     *        <p>
     *        AWS DMS supports the <code>ParquetTimestampInMillisecond</code> parameter in versions 3.1.4 and later.
     *        </p>
     *        </note>
     *        <p>
     *        When <code>ParquetTimestampInMillisecond</code> is set to <code>true</code> or <code>y</code>, AWS DMS
     *        writes all <code>TIMESTAMP</code> columns in a .parquet formatted file with millisecond precision.
     *        Otherwise, DMS writes them with microsecond precision.
     *        </p>
     *        <p>
     *        Currently, Amazon Athena and AWS Glue can handle only millisecond precision for <code>TIMESTAMP</code>
     *        values. Set this parameter to <code>true</code> for S3 endpoint object files that are .parquet formatted
     *        only if you plan to query or process the data with Athena or AWS Glue.
     *        </p>
     *        <note>
     *        <p>
     *        AWS DMS writes any <code>TIMESTAMP</code> column values written to an S3 file in .csv format with
     *        microsecond precision.
     *        </p>
     *        <p>
     *        Setting <code>ParquetTimestampInMillisecond</code> has no effect on the string format of the timestamp
     *        column value that is inserted by setting the <code>TimestampColumnName</code> parameter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withParquetTimestampInMillisecond(Boolean parquetTimestampInMillisecond) {
        setParquetTimestampInMillisecond(parquetTimestampInMillisecond);
        return this;
    }

    /**
     * <p>
     * A value that specifies the precision of any <code>TIMESTAMP</code> column values that are written to an Amazon S3
     * object file in .parquet format.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>ParquetTimestampInMillisecond</code> parameter in versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * When <code>ParquetTimestampInMillisecond</code> is set to <code>true</code> or <code>y</code>, AWS DMS writes all
     * <code>TIMESTAMP</code> columns in a .parquet formatted file with millisecond precision. Otherwise, DMS writes
     * them with microsecond precision.
     * </p>
     * <p>
     * Currently, Amazon Athena and AWS Glue can handle only millisecond precision for <code>TIMESTAMP</code> values.
     * Set this parameter to <code>true</code> for S3 endpoint object files that are .parquet formatted only if you plan
     * to query or process the data with Athena or AWS Glue.
     * </p>
     * <note>
     * <p>
     * AWS DMS writes any <code>TIMESTAMP</code> column values written to an S3 file in .csv format with microsecond
     * precision.
     * </p>
     * <p>
     * Setting <code>ParquetTimestampInMillisecond</code> has no effect on the string format of the timestamp column
     * value that is inserted by setting the <code>TimestampColumnName</code> parameter.
     * </p>
     * </note>
     * 
     * @return A value that specifies the precision of any <code>TIMESTAMP</code> column values that are written to an
     *         Amazon S3 object file in .parquet format.</p> <note>
     *         <p>
     *         AWS DMS supports the <code>ParquetTimestampInMillisecond</code> parameter in versions 3.1.4 and later.
     *         </p>
     *         </note>
     *         <p>
     *         When <code>ParquetTimestampInMillisecond</code> is set to <code>true</code> or <code>y</code>, AWS DMS
     *         writes all <code>TIMESTAMP</code> columns in a .parquet formatted file with millisecond precision.
     *         Otherwise, DMS writes them with microsecond precision.
     *         </p>
     *         <p>
     *         Currently, Amazon Athena and AWS Glue can handle only millisecond precision for <code>TIMESTAMP</code>
     *         values. Set this parameter to <code>true</code> for S3 endpoint object files that are .parquet formatted
     *         only if you plan to query or process the data with Athena or AWS Glue.
     *         </p>
     *         <note>
     *         <p>
     *         AWS DMS writes any <code>TIMESTAMP</code> column values written to an S3 file in .csv format with
     *         microsecond precision.
     *         </p>
     *         <p>
     *         Setting <code>ParquetTimestampInMillisecond</code> has no effect on the string format of the timestamp
     *         column value that is inserted by setting the <code>TimestampColumnName</code> parameter.
     *         </p>
     */

    public Boolean isParquetTimestampInMillisecond() {
        return this.parquetTimestampInMillisecond;
    }

    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write INSERT and UPDATE operations to .csv or .parquet
     * (columnar storage) output files. The default setting is <code>false</code>, but when
     * <code>CdcInsertsAndUpdates</code> is set to <code>true</code> or <code>y</code>, only INSERTs and UPDATEs from
     * the source database are migrated to the .csv or .parquet file.
     * </p>
     * <p>
     * For .csv file format only, how these INSERTs and UPDATEs are recorded depends on the value of the
     * <code>IncludeOpForFullLoad</code> parameter. If <code>IncludeOpForFullLoad</code> is set to <code>true</code>,
     * the first field of every CDC record is set to either <code>I</code> or <code>U</code> to indicate INSERT and
     * UPDATE operations at the source. But if <code>IncludeOpForFullLoad</code> is set to <code>false</code>, CDC
     * records are written without an indication of INSERT or UPDATE operations at the source. For more information
     * about how these settings work together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     * Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the use of the <code>CdcInsertsAndUpdates</code> parameter in versions 3.3.1 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't both be set to <code>true</code> for the
     * same endpoint. Set either <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to <code>true</code>
     * for the same endpoint, but not both.
     * </p>
     * </note>
     * 
     * @param cdcInsertsAndUpdates
     *        A value that enables a change data capture (CDC) load to write INSERT and UPDATE operations to .csv or
     *        .parquet (columnar storage) output files. The default setting is <code>false</code>, but when
     *        <code>CdcInsertsAndUpdates</code> is set to <code>true</code> or <code>y</code>, only INSERTs and UPDATEs
     *        from the source database are migrated to the .csv or .parquet file. </p>
     *        <p>
     *        For .csv file format only, how these INSERTs and UPDATEs are recorded depends on the value of the
     *        <code>IncludeOpForFullLoad</code> parameter. If <code>IncludeOpForFullLoad</code> is set to
     *        <code>true</code>, the first field of every CDC record is set to either <code>I</code> or <code>U</code>
     *        to indicate INSERT and UPDATE operations at the source. But if <code>IncludeOpForFullLoad</code> is set to
     *        <code>false</code>, CDC records are written without an indication of INSERT or UPDATE operations at the
     *        source. For more information about how these settings work together, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *        >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     *        Guide.</i>.
     *        </p>
     *        <note>
     *        <p>
     *        AWS DMS supports the use of the <code>CdcInsertsAndUpdates</code> parameter in versions 3.3.1 and later.
     *        </p>
     *        <p>
     *        <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't both be set to <code>true</code>
     *        for the same endpoint. Set either <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to
     *        <code>true</code> for the same endpoint, but not both.
     *        </p>
     */

    public void setCdcInsertsAndUpdates(Boolean cdcInsertsAndUpdates) {
        this.cdcInsertsAndUpdates = cdcInsertsAndUpdates;
    }

    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write INSERT and UPDATE operations to .csv or .parquet
     * (columnar storage) output files. The default setting is <code>false</code>, but when
     * <code>CdcInsertsAndUpdates</code> is set to <code>true</code> or <code>y</code>, only INSERTs and UPDATEs from
     * the source database are migrated to the .csv or .parquet file.
     * </p>
     * <p>
     * For .csv file format only, how these INSERTs and UPDATEs are recorded depends on the value of the
     * <code>IncludeOpForFullLoad</code> parameter. If <code>IncludeOpForFullLoad</code> is set to <code>true</code>,
     * the first field of every CDC record is set to either <code>I</code> or <code>U</code> to indicate INSERT and
     * UPDATE operations at the source. But if <code>IncludeOpForFullLoad</code> is set to <code>false</code>, CDC
     * records are written without an indication of INSERT or UPDATE operations at the source. For more information
     * about how these settings work together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     * Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the use of the <code>CdcInsertsAndUpdates</code> parameter in versions 3.3.1 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't both be set to <code>true</code> for the
     * same endpoint. Set either <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to <code>true</code>
     * for the same endpoint, but not both.
     * </p>
     * </note>
     * 
     * @return A value that enables a change data capture (CDC) load to write INSERT and UPDATE operations to .csv or
     *         .parquet (columnar storage) output files. The default setting is <code>false</code>, but when
     *         <code>CdcInsertsAndUpdates</code> is set to <code>true</code> or <code>y</code>, only INSERTs and UPDATEs
     *         from the source database are migrated to the .csv or .parquet file. </p>
     *         <p>
     *         For .csv file format only, how these INSERTs and UPDATEs are recorded depends on the value of the
     *         <code>IncludeOpForFullLoad</code> parameter. If <code>IncludeOpForFullLoad</code> is set to
     *         <code>true</code>, the first field of every CDC record is set to either <code>I</code> or <code>U</code>
     *         to indicate INSERT and UPDATE operations at the source. But if <code>IncludeOpForFullLoad</code> is set
     *         to <code>false</code>, CDC records are written without an indication of INSERT or UPDATE operations at
     *         the source. For more information about how these settings work together, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *         >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     *         Guide.</i>.
     *         </p>
     *         <note>
     *         <p>
     *         AWS DMS supports the use of the <code>CdcInsertsAndUpdates</code> parameter in versions 3.3.1 and later.
     *         </p>
     *         <p>
     *         <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't both be set to <code>true</code>
     *         for the same endpoint. Set either <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to
     *         <code>true</code> for the same endpoint, but not both.
     *         </p>
     */

    public Boolean getCdcInsertsAndUpdates() {
        return this.cdcInsertsAndUpdates;
    }

    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write INSERT and UPDATE operations to .csv or .parquet
     * (columnar storage) output files. The default setting is <code>false</code>, but when
     * <code>CdcInsertsAndUpdates</code> is set to <code>true</code> or <code>y</code>, only INSERTs and UPDATEs from
     * the source database are migrated to the .csv or .parquet file.
     * </p>
     * <p>
     * For .csv file format only, how these INSERTs and UPDATEs are recorded depends on the value of the
     * <code>IncludeOpForFullLoad</code> parameter. If <code>IncludeOpForFullLoad</code> is set to <code>true</code>,
     * the first field of every CDC record is set to either <code>I</code> or <code>U</code> to indicate INSERT and
     * UPDATE operations at the source. But if <code>IncludeOpForFullLoad</code> is set to <code>false</code>, CDC
     * records are written without an indication of INSERT or UPDATE operations at the source. For more information
     * about how these settings work together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     * Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the use of the <code>CdcInsertsAndUpdates</code> parameter in versions 3.3.1 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't both be set to <code>true</code> for the
     * same endpoint. Set either <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to <code>true</code>
     * for the same endpoint, but not both.
     * </p>
     * </note>
     * 
     * @param cdcInsertsAndUpdates
     *        A value that enables a change data capture (CDC) load to write INSERT and UPDATE operations to .csv or
     *        .parquet (columnar storage) output files. The default setting is <code>false</code>, but when
     *        <code>CdcInsertsAndUpdates</code> is set to <code>true</code> or <code>y</code>, only INSERTs and UPDATEs
     *        from the source database are migrated to the .csv or .parquet file. </p>
     *        <p>
     *        For .csv file format only, how these INSERTs and UPDATEs are recorded depends on the value of the
     *        <code>IncludeOpForFullLoad</code> parameter. If <code>IncludeOpForFullLoad</code> is set to
     *        <code>true</code>, the first field of every CDC record is set to either <code>I</code> or <code>U</code>
     *        to indicate INSERT and UPDATE operations at the source. But if <code>IncludeOpForFullLoad</code> is set to
     *        <code>false</code>, CDC records are written without an indication of INSERT or UPDATE operations at the
     *        source. For more information about how these settings work together, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *        >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     *        Guide.</i>.
     *        </p>
     *        <note>
     *        <p>
     *        AWS DMS supports the use of the <code>CdcInsertsAndUpdates</code> parameter in versions 3.3.1 and later.
     *        </p>
     *        <p>
     *        <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't both be set to <code>true</code>
     *        for the same endpoint. Set either <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to
     *        <code>true</code> for the same endpoint, but not both.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withCdcInsertsAndUpdates(Boolean cdcInsertsAndUpdates) {
        setCdcInsertsAndUpdates(cdcInsertsAndUpdates);
        return this;
    }

    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write INSERT and UPDATE operations to .csv or .parquet
     * (columnar storage) output files. The default setting is <code>false</code>, but when
     * <code>CdcInsertsAndUpdates</code> is set to <code>true</code> or <code>y</code>, only INSERTs and UPDATEs from
     * the source database are migrated to the .csv or .parquet file.
     * </p>
     * <p>
     * For .csv file format only, how these INSERTs and UPDATEs are recorded depends on the value of the
     * <code>IncludeOpForFullLoad</code> parameter. If <code>IncludeOpForFullLoad</code> is set to <code>true</code>,
     * the first field of every CDC record is set to either <code>I</code> or <code>U</code> to indicate INSERT and
     * UPDATE operations at the source. But if <code>IncludeOpForFullLoad</code> is set to <code>false</code>, CDC
     * records are written without an indication of INSERT or UPDATE operations at the source. For more information
     * about how these settings work together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     * Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the use of the <code>CdcInsertsAndUpdates</code> parameter in versions 3.3.1 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't both be set to <code>true</code> for the
     * same endpoint. Set either <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to <code>true</code>
     * for the same endpoint, but not both.
     * </p>
     * </note>
     * 
     * @return A value that enables a change data capture (CDC) load to write INSERT and UPDATE operations to .csv or
     *         .parquet (columnar storage) output files. The default setting is <code>false</code>, but when
     *         <code>CdcInsertsAndUpdates</code> is set to <code>true</code> or <code>y</code>, only INSERTs and UPDATEs
     *         from the source database are migrated to the .csv or .parquet file. </p>
     *         <p>
     *         For .csv file format only, how these INSERTs and UPDATEs are recorded depends on the value of the
     *         <code>IncludeOpForFullLoad</code> parameter. If <code>IncludeOpForFullLoad</code> is set to
     *         <code>true</code>, the first field of every CDC record is set to either <code>I</code> or <code>U</code>
     *         to indicate INSERT and UPDATE operations at the source. But if <code>IncludeOpForFullLoad</code> is set
     *         to <code>false</code>, CDC records are written without an indication of INSERT or UPDATE operations at
     *         the source. For more information about how these settings work together, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *         >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS Database Migration Service User
     *         Guide.</i>.
     *         </p>
     *         <note>
     *         <p>
     *         AWS DMS supports the use of the <code>CdcInsertsAndUpdates</code> parameter in versions 3.3.1 and later.
     *         </p>
     *         <p>
     *         <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't both be set to <code>true</code>
     *         for the same endpoint. Set either <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to
     *         <code>true</code> for the same endpoint, but not both.
     *         </p>
     */

    public Boolean isCdcInsertsAndUpdates() {
        return this.cdcInsertsAndUpdates;
    }

    /**
     * <p>
     * When set to <code>true</code>, this parameter partitions S3 bucket folders based on transaction commit dates. The
     * default value is <code>false</code>. For more information about date-based folder partitoning, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.DatePartitioning">Using
     * date-based folder partitioning</a>.
     * </p>
     * 
     * @param datePartitionEnabled
     *        When set to <code>true</code>, this parameter partitions S3 bucket folders based on transaction commit
     *        dates. The default value is <code>false</code>. For more information about date-based folder partitoning,
     *        see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.DatePartitioning"
     *        >Using date-based folder partitioning</a>.
     */

    public void setDatePartitionEnabled(Boolean datePartitionEnabled) {
        this.datePartitionEnabled = datePartitionEnabled;
    }

    /**
     * <p>
     * When set to <code>true</code>, this parameter partitions S3 bucket folders based on transaction commit dates. The
     * default value is <code>false</code>. For more information about date-based folder partitoning, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.DatePartitioning">Using
     * date-based folder partitioning</a>.
     * </p>
     * 
     * @return When set to <code>true</code>, this parameter partitions S3 bucket folders based on transaction commit
     *         dates. The default value is <code>false</code>. For more information about date-based folder partitoning,
     *         see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.DatePartitioning"
     *         >Using date-based folder partitioning</a>.
     */

    public Boolean getDatePartitionEnabled() {
        return this.datePartitionEnabled;
    }

    /**
     * <p>
     * When set to <code>true</code>, this parameter partitions S3 bucket folders based on transaction commit dates. The
     * default value is <code>false</code>. For more information about date-based folder partitoning, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.DatePartitioning">Using
     * date-based folder partitioning</a>.
     * </p>
     * 
     * @param datePartitionEnabled
     *        When set to <code>true</code>, this parameter partitions S3 bucket folders based on transaction commit
     *        dates. The default value is <code>false</code>. For more information about date-based folder partitoning,
     *        see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.DatePartitioning"
     *        >Using date-based folder partitioning</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withDatePartitionEnabled(Boolean datePartitionEnabled) {
        setDatePartitionEnabled(datePartitionEnabled);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, this parameter partitions S3 bucket folders based on transaction commit dates. The
     * default value is <code>false</code>. For more information about date-based folder partitoning, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.DatePartitioning">Using
     * date-based folder partitioning</a>.
     * </p>
     * 
     * @return When set to <code>true</code>, this parameter partitions S3 bucket folders based on transaction commit
     *         dates. The default value is <code>false</code>. For more information about date-based folder partitoning,
     *         see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.DatePartitioning"
     *         >Using date-based folder partitioning</a>.
     */

    public Boolean isDatePartitionEnabled() {
        return this.datePartitionEnabled;
    }

    /**
     * <p>
     * Identifies the sequence of the date format to use during folder partitioning. The default value is
     * <code>YYYYMMDD</code>. Use this parameter when <code>DatePartitionedEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @param datePartitionSequence
     *        Identifies the sequence of the date format to use during folder partitioning. The default value is
     *        <code>YYYYMMDD</code>. Use this parameter when <code>DatePartitionedEnabled</code> is set to
     *        <code>true</code>.
     * @see DatePartitionSequenceValue
     */

    public void setDatePartitionSequence(String datePartitionSequence) {
        this.datePartitionSequence = datePartitionSequence;
    }

    /**
     * <p>
     * Identifies the sequence of the date format to use during folder partitioning. The default value is
     * <code>YYYYMMDD</code>. Use this parameter when <code>DatePartitionedEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @return Identifies the sequence of the date format to use during folder partitioning. The default value is
     *         <code>YYYYMMDD</code>. Use this parameter when <code>DatePartitionedEnabled</code> is set to
     *         <code>true</code>.
     * @see DatePartitionSequenceValue
     */

    public String getDatePartitionSequence() {
        return this.datePartitionSequence;
    }

    /**
     * <p>
     * Identifies the sequence of the date format to use during folder partitioning. The default value is
     * <code>YYYYMMDD</code>. Use this parameter when <code>DatePartitionedEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @param datePartitionSequence
     *        Identifies the sequence of the date format to use during folder partitioning. The default value is
     *        <code>YYYYMMDD</code>. Use this parameter when <code>DatePartitionedEnabled</code> is set to
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatePartitionSequenceValue
     */

    public S3Settings withDatePartitionSequence(String datePartitionSequence) {
        setDatePartitionSequence(datePartitionSequence);
        return this;
    }

    /**
     * <p>
     * Identifies the sequence of the date format to use during folder partitioning. The default value is
     * <code>YYYYMMDD</code>. Use this parameter when <code>DatePartitionedEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @param datePartitionSequence
     *        Identifies the sequence of the date format to use during folder partitioning. The default value is
     *        <code>YYYYMMDD</code>. Use this parameter when <code>DatePartitionedEnabled</code> is set to
     *        <code>true</code>.
     * @see DatePartitionSequenceValue
     */

    public void setDatePartitionSequence(DatePartitionSequenceValue datePartitionSequence) {
        withDatePartitionSequence(datePartitionSequence);
    }

    /**
     * <p>
     * Identifies the sequence of the date format to use during folder partitioning. The default value is
     * <code>YYYYMMDD</code>. Use this parameter when <code>DatePartitionedEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @param datePartitionSequence
     *        Identifies the sequence of the date format to use during folder partitioning. The default value is
     *        <code>YYYYMMDD</code>. Use this parameter when <code>DatePartitionedEnabled</code> is set to
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatePartitionSequenceValue
     */

    public S3Settings withDatePartitionSequence(DatePartitionSequenceValue datePartitionSequence) {
        this.datePartitionSequence = datePartitionSequence.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a date separating delimiter to use during folder partitioning. The default value is <code>SLASH</code>.
     * Use this parameter when <code>DatePartitionedEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @param datePartitionDelimiter
     *        Specifies a date separating delimiter to use during folder partitioning. The default value is
     *        <code>SLASH</code>. Use this parameter when <code>DatePartitionedEnabled</code> is set to
     *        <code>true</code>.
     * @see DatePartitionDelimiterValue
     */

    public void setDatePartitionDelimiter(String datePartitionDelimiter) {
        this.datePartitionDelimiter = datePartitionDelimiter;
    }

    /**
     * <p>
     * Specifies a date separating delimiter to use during folder partitioning. The default value is <code>SLASH</code>.
     * Use this parameter when <code>DatePartitionedEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @return Specifies a date separating delimiter to use during folder partitioning. The default value is
     *         <code>SLASH</code>. Use this parameter when <code>DatePartitionedEnabled</code> is set to
     *         <code>true</code>.
     * @see DatePartitionDelimiterValue
     */

    public String getDatePartitionDelimiter() {
        return this.datePartitionDelimiter;
    }

    /**
     * <p>
     * Specifies a date separating delimiter to use during folder partitioning. The default value is <code>SLASH</code>.
     * Use this parameter when <code>DatePartitionedEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @param datePartitionDelimiter
     *        Specifies a date separating delimiter to use during folder partitioning. The default value is
     *        <code>SLASH</code>. Use this parameter when <code>DatePartitionedEnabled</code> is set to
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatePartitionDelimiterValue
     */

    public S3Settings withDatePartitionDelimiter(String datePartitionDelimiter) {
        setDatePartitionDelimiter(datePartitionDelimiter);
        return this;
    }

    /**
     * <p>
     * Specifies a date separating delimiter to use during folder partitioning. The default value is <code>SLASH</code>.
     * Use this parameter when <code>DatePartitionedEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @param datePartitionDelimiter
     *        Specifies a date separating delimiter to use during folder partitioning. The default value is
     *        <code>SLASH</code>. Use this parameter when <code>DatePartitionedEnabled</code> is set to
     *        <code>true</code>.
     * @see DatePartitionDelimiterValue
     */

    public void setDatePartitionDelimiter(DatePartitionDelimiterValue datePartitionDelimiter) {
        withDatePartitionDelimiter(datePartitionDelimiter);
    }

    /**
     * <p>
     * Specifies a date separating delimiter to use during folder partitioning. The default value is <code>SLASH</code>.
     * Use this parameter when <code>DatePartitionedEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @param datePartitionDelimiter
     *        Specifies a date separating delimiter to use during folder partitioning. The default value is
     *        <code>SLASH</code>. Use this parameter when <code>DatePartitionedEnabled</code> is set to
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatePartitionDelimiterValue
     */

    public S3Settings withDatePartitionDelimiter(DatePartitionDelimiterValue datePartitionDelimiter) {
        this.datePartitionDelimiter = datePartitionDelimiter.toString();
        return this;
    }

    /**
     * <p>
     * This setting applies if the S3 output files during a change data capture (CDC) load are written in .csv format.
     * If set to <code>true</code> for columns not included in the supplemental log, AWS DMS uses the value specified by
     * <a href=
     * "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CsvNoSupValue">
     * <code>CsvNoSupValue</code> </a>. If not set or set to <code>false</code>, AWS DMS uses the null value for these
     * columns.
     * </p>
     * <note>
     * <p>
     * This setting is supported in AWS DMS versions 3.4.1 and later.
     * </p>
     * </note>
     * 
     * @param useCsvNoSupValue
     *        This setting applies if the S3 output files during a change data capture (CDC) load are written in .csv
     *        format. If set to <code>true</code> for columns not included in the supplemental log, AWS DMS uses the
     *        value specified by <a href=
     *        "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CsvNoSupValue"
     *        > <code>CsvNoSupValue</code> </a>. If not set or set to <code>false</code>, AWS DMS uses the null value
     *        for these columns.</p> <note>
     *        <p>
     *        This setting is supported in AWS DMS versions 3.4.1 and later.
     *        </p>
     */

    public void setUseCsvNoSupValue(Boolean useCsvNoSupValue) {
        this.useCsvNoSupValue = useCsvNoSupValue;
    }

    /**
     * <p>
     * This setting applies if the S3 output files during a change data capture (CDC) load are written in .csv format.
     * If set to <code>true</code> for columns not included in the supplemental log, AWS DMS uses the value specified by
     * <a href=
     * "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CsvNoSupValue">
     * <code>CsvNoSupValue</code> </a>. If not set or set to <code>false</code>, AWS DMS uses the null value for these
     * columns.
     * </p>
     * <note>
     * <p>
     * This setting is supported in AWS DMS versions 3.4.1 and later.
     * </p>
     * </note>
     * 
     * @return This setting applies if the S3 output files during a change data capture (CDC) load are written in .csv
     *         format. If set to <code>true</code> for columns not included in the supplemental log, AWS DMS uses the
     *         value specified by <a href=
     *         "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CsvNoSupValue"
     *         > <code>CsvNoSupValue</code> </a>. If not set or set to <code>false</code>, AWS DMS uses the null value
     *         for these columns.</p> <note>
     *         <p>
     *         This setting is supported in AWS DMS versions 3.4.1 and later.
     *         </p>
     */

    public Boolean getUseCsvNoSupValue() {
        return this.useCsvNoSupValue;
    }

    /**
     * <p>
     * This setting applies if the S3 output files during a change data capture (CDC) load are written in .csv format.
     * If set to <code>true</code> for columns not included in the supplemental log, AWS DMS uses the value specified by
     * <a href=
     * "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CsvNoSupValue">
     * <code>CsvNoSupValue</code> </a>. If not set or set to <code>false</code>, AWS DMS uses the null value for these
     * columns.
     * </p>
     * <note>
     * <p>
     * This setting is supported in AWS DMS versions 3.4.1 and later.
     * </p>
     * </note>
     * 
     * @param useCsvNoSupValue
     *        This setting applies if the S3 output files during a change data capture (CDC) load are written in .csv
     *        format. If set to <code>true</code> for columns not included in the supplemental log, AWS DMS uses the
     *        value specified by <a href=
     *        "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CsvNoSupValue"
     *        > <code>CsvNoSupValue</code> </a>. If not set or set to <code>false</code>, AWS DMS uses the null value
     *        for these columns.</p> <note>
     *        <p>
     *        This setting is supported in AWS DMS versions 3.4.1 and later.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withUseCsvNoSupValue(Boolean useCsvNoSupValue) {
        setUseCsvNoSupValue(useCsvNoSupValue);
        return this;
    }

    /**
     * <p>
     * This setting applies if the S3 output files during a change data capture (CDC) load are written in .csv format.
     * If set to <code>true</code> for columns not included in the supplemental log, AWS DMS uses the value specified by
     * <a href=
     * "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CsvNoSupValue">
     * <code>CsvNoSupValue</code> </a>. If not set or set to <code>false</code>, AWS DMS uses the null value for these
     * columns.
     * </p>
     * <note>
     * <p>
     * This setting is supported in AWS DMS versions 3.4.1 and later.
     * </p>
     * </note>
     * 
     * @return This setting applies if the S3 output files during a change data capture (CDC) load are written in .csv
     *         format. If set to <code>true</code> for columns not included in the supplemental log, AWS DMS uses the
     *         value specified by <a href=
     *         "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CsvNoSupValue"
     *         > <code>CsvNoSupValue</code> </a>. If not set or set to <code>false</code>, AWS DMS uses the null value
     *         for these columns.</p> <note>
     *         <p>
     *         This setting is supported in AWS DMS versions 3.4.1 and later.
     *         </p>
     */

    public Boolean isUseCsvNoSupValue() {
        return this.useCsvNoSupValue;
    }

    /**
     * <p>
     * This setting only applies if your Amazon S3 output files during a change data capture (CDC) load are written in
     * .csv format. If <a href=
     * "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-UseCsvNoSupValue">
     * <code>UseCsvNoSupValue</code> </a> is set to true, specify a string value that you want AWS DMS to use for all
     * columns not included in the supplemental log. If you do not specify a string value, AWS DMS uses the null value
     * for these columns regardless of the <code>UseCsvNoSupValue</code> setting.
     * </p>
     * <note>
     * <p>
     * This setting is supported in AWS DMS versions 3.4.1 and later.
     * </p>
     * </note>
     * 
     * @param csvNoSupValue
     *        This setting only applies if your Amazon S3 output files during a change data capture (CDC) load are
     *        written in .csv format. If <a href=
     *        "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-UseCsvNoSupValue"
     *        > <code>UseCsvNoSupValue</code> </a> is set to true, specify a string value that you want AWS DMS to use
     *        for all columns not included in the supplemental log. If you do not specify a string value, AWS DMS uses
     *        the null value for these columns regardless of the <code>UseCsvNoSupValue</code> setting.</p> <note>
     *        <p>
     *        This setting is supported in AWS DMS versions 3.4.1 and later.
     *        </p>
     */

    public void setCsvNoSupValue(String csvNoSupValue) {
        this.csvNoSupValue = csvNoSupValue;
    }

    /**
     * <p>
     * This setting only applies if your Amazon S3 output files during a change data capture (CDC) load are written in
     * .csv format. If <a href=
     * "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-UseCsvNoSupValue">
     * <code>UseCsvNoSupValue</code> </a> is set to true, specify a string value that you want AWS DMS to use for all
     * columns not included in the supplemental log. If you do not specify a string value, AWS DMS uses the null value
     * for these columns regardless of the <code>UseCsvNoSupValue</code> setting.
     * </p>
     * <note>
     * <p>
     * This setting is supported in AWS DMS versions 3.4.1 and later.
     * </p>
     * </note>
     * 
     * @return This setting only applies if your Amazon S3 output files during a change data capture (CDC) load are
     *         written in .csv format. If <a href=
     *         "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-UseCsvNoSupValue"
     *         > <code>UseCsvNoSupValue</code> </a> is set to true, specify a string value that you want AWS DMS to use
     *         for all columns not included in the supplemental log. If you do not specify a string value, AWS DMS uses
     *         the null value for these columns regardless of the <code>UseCsvNoSupValue</code> setting.</p> <note>
     *         <p>
     *         This setting is supported in AWS DMS versions 3.4.1 and later.
     *         </p>
     */

    public String getCsvNoSupValue() {
        return this.csvNoSupValue;
    }

    /**
     * <p>
     * This setting only applies if your Amazon S3 output files during a change data capture (CDC) load are written in
     * .csv format. If <a href=
     * "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-UseCsvNoSupValue">
     * <code>UseCsvNoSupValue</code> </a> is set to true, specify a string value that you want AWS DMS to use for all
     * columns not included in the supplemental log. If you do not specify a string value, AWS DMS uses the null value
     * for these columns regardless of the <code>UseCsvNoSupValue</code> setting.
     * </p>
     * <note>
     * <p>
     * This setting is supported in AWS DMS versions 3.4.1 and later.
     * </p>
     * </note>
     * 
     * @param csvNoSupValue
     *        This setting only applies if your Amazon S3 output files during a change data capture (CDC) load are
     *        written in .csv format. If <a href=
     *        "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-UseCsvNoSupValue"
     *        > <code>UseCsvNoSupValue</code> </a> is set to true, specify a string value that you want AWS DMS to use
     *        for all columns not included in the supplemental log. If you do not specify a string value, AWS DMS uses
     *        the null value for these columns regardless of the <code>UseCsvNoSupValue</code> setting.</p> <note>
     *        <p>
     *        This setting is supported in AWS DMS versions 3.4.1 and later.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withCsvNoSupValue(String csvNoSupValue) {
        setCsvNoSupValue(csvNoSupValue);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, AWS DMS saves the transaction order for a change data capture (CDC) load on the
     * Amazon S3 target specified by <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CdcPath">
     * <code>CdcPath</code> </a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath"
     * >Capturing data changes (CDC) including transaction order on the S3 target</a>.
     * </p>
     * <note>
     * <p>
     * This setting is supported in AWS DMS versions 3.4.2 and later.
     * </p>
     * </note>
     * 
     * @param preserveTransactions
     *        If set to <code>true</code>, AWS DMS saves the transaction order for a change data capture (CDC) load on
     *        the Amazon S3 target specified by <a href=
     *        "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CdcPath">
     *        <code>CdcPath</code> </a>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath"
     *        >Capturing data changes (CDC) including transaction order on the S3 target</a>.</p> <note>
     *        <p>
     *        This setting is supported in AWS DMS versions 3.4.2 and later.
     *        </p>
     */

    public void setPreserveTransactions(Boolean preserveTransactions) {
        this.preserveTransactions = preserveTransactions;
    }

    /**
     * <p>
     * If set to <code>true</code>, AWS DMS saves the transaction order for a change data capture (CDC) load on the
     * Amazon S3 target specified by <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CdcPath">
     * <code>CdcPath</code> </a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath"
     * >Capturing data changes (CDC) including transaction order on the S3 target</a>.
     * </p>
     * <note>
     * <p>
     * This setting is supported in AWS DMS versions 3.4.2 and later.
     * </p>
     * </note>
     * 
     * @return If set to <code>true</code>, AWS DMS saves the transaction order for a change data capture (CDC) load on
     *         the Amazon S3 target specified by <a href=
     *         "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CdcPath">
     *         <code>CdcPath</code> </a>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath"
     *         >Capturing data changes (CDC) including transaction order on the S3 target</a>.</p> <note>
     *         <p>
     *         This setting is supported in AWS DMS versions 3.4.2 and later.
     *         </p>
     */

    public Boolean getPreserveTransactions() {
        return this.preserveTransactions;
    }

    /**
     * <p>
     * If set to <code>true</code>, AWS DMS saves the transaction order for a change data capture (CDC) load on the
     * Amazon S3 target specified by <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CdcPath">
     * <code>CdcPath</code> </a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath"
     * >Capturing data changes (CDC) including transaction order on the S3 target</a>.
     * </p>
     * <note>
     * <p>
     * This setting is supported in AWS DMS versions 3.4.2 and later.
     * </p>
     * </note>
     * 
     * @param preserveTransactions
     *        If set to <code>true</code>, AWS DMS saves the transaction order for a change data capture (CDC) load on
     *        the Amazon S3 target specified by <a href=
     *        "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CdcPath">
     *        <code>CdcPath</code> </a>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath"
     *        >Capturing data changes (CDC) including transaction order on the S3 target</a>.</p> <note>
     *        <p>
     *        This setting is supported in AWS DMS versions 3.4.2 and later.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withPreserveTransactions(Boolean preserveTransactions) {
        setPreserveTransactions(preserveTransactions);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, AWS DMS saves the transaction order for a change data capture (CDC) load on the
     * Amazon S3 target specified by <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CdcPath">
     * <code>CdcPath</code> </a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath"
     * >Capturing data changes (CDC) including transaction order on the S3 target</a>.
     * </p>
     * <note>
     * <p>
     * This setting is supported in AWS DMS versions 3.4.2 and later.
     * </p>
     * </note>
     * 
     * @return If set to <code>true</code>, AWS DMS saves the transaction order for a change data capture (CDC) load on
     *         the Amazon S3 target specified by <a href=
     *         "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-CdcPath">
     *         <code>CdcPath</code> </a>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath"
     *         >Capturing data changes (CDC) including transaction order on the S3 target</a>.</p> <note>
     *         <p>
     *         This setting is supported in AWS DMS versions 3.4.2 and later.
     *         </p>
     */

    public Boolean isPreserveTransactions() {
        return this.preserveTransactions;
    }

    /**
     * <p>
     * Specifies the folder path of CDC files. For an S3 source, this setting is required if a task captures change
     * data; otherwise, it's optional. If <code>CdcPath</code> is set, AWS DMS reads CDC files from this path and
     * replicates the data changes to the target endpoint. For an S3 target if you set <a href=
     * "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-PreserveTransactions"
     * > <code>PreserveTransactions</code> </a> to <code>true</code>, AWS DMS verifies that you have set this parameter
     * to a folder path on your S3 target where AWS DMS can save the transaction order for the CDC load. AWS DMS creates
     * this CDC folder path in either your S3 target working directory or the S3 target location specified by <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketFolder">
     * <code>BucketFolder</code> </a> and <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketName">
     * <code>BucketName</code> </a>.
     * </p>
     * <p>
     * For example, if you specify <code>CdcPath</code> as <code>MyChangedData</code>, and you specify
     * <code>BucketName</code> as <code>MyTargetBucket</code> but do not specify <code>BucketFolder</code>, AWS DMS
     * creates the CDC folder path following: <code>MyTargetBucket/MyChangedData</code>.
     * </p>
     * <p>
     * If you specify the same <code>CdcPath</code>, and you specify <code>BucketName</code> as
     * <code>MyTargetBucket</code> and <code>BucketFolder</code> as <code>MyTargetData</code>, AWS DMS creates the CDC
     * folder path following: <code>MyTargetBucket/MyTargetData/MyChangedData</code>.
     * </p>
     * <p>
     * For more information on CDC including transaction order on an S3 target, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath"
     * >Capturing data changes (CDC) including transaction order on the S3 target</a>.
     * </p>
     * <note>
     * <p>
     * This setting is supported in AWS DMS versions 3.4.2 and later.
     * </p>
     * </note>
     * 
     * @param cdcPath
     *        Specifies the folder path of CDC files. For an S3 source, this setting is required if a task captures
     *        change data; otherwise, it's optional. If <code>CdcPath</code> is set, AWS DMS reads CDC files from this
     *        path and replicates the data changes to the target endpoint. For an S3 target if you set <a href=
     *        "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-PreserveTransactions"
     *        > <code>PreserveTransactions</code> </a> to <code>true</code>, AWS DMS verifies that you have set this
     *        parameter to a folder path on your S3 target where AWS DMS can save the transaction order for the CDC
     *        load. AWS DMS creates this CDC folder path in either your S3 target working directory or the S3 target
     *        location specified by <a href=
     *        "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketFolder"
     *        > <code>BucketFolder</code> </a> and <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketName"
     *        > <code>BucketName</code> </a>.</p>
     *        <p>
     *        For example, if you specify <code>CdcPath</code> as <code>MyChangedData</code>, and you specify
     *        <code>BucketName</code> as <code>MyTargetBucket</code> but do not specify <code>BucketFolder</code>, AWS
     *        DMS creates the CDC folder path following: <code>MyTargetBucket/MyChangedData</code>.
     *        </p>
     *        <p>
     *        If you specify the same <code>CdcPath</code>, and you specify <code>BucketName</code> as
     *        <code>MyTargetBucket</code> and <code>BucketFolder</code> as <code>MyTargetData</code>, AWS DMS creates
     *        the CDC folder path following: <code>MyTargetBucket/MyTargetData/MyChangedData</code>.
     *        </p>
     *        <p>
     *        For more information on CDC including transaction order on an S3 target, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath"
     *        >Capturing data changes (CDC) including transaction order on the S3 target</a>.
     *        </p>
     *        <note>
     *        <p>
     *        This setting is supported in AWS DMS versions 3.4.2 and later.
     *        </p>
     */

    public void setCdcPath(String cdcPath) {
        this.cdcPath = cdcPath;
    }

    /**
     * <p>
     * Specifies the folder path of CDC files. For an S3 source, this setting is required if a task captures change
     * data; otherwise, it's optional. If <code>CdcPath</code> is set, AWS DMS reads CDC files from this path and
     * replicates the data changes to the target endpoint. For an S3 target if you set <a href=
     * "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-PreserveTransactions"
     * > <code>PreserveTransactions</code> </a> to <code>true</code>, AWS DMS verifies that you have set this parameter
     * to a folder path on your S3 target where AWS DMS can save the transaction order for the CDC load. AWS DMS creates
     * this CDC folder path in either your S3 target working directory or the S3 target location specified by <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketFolder">
     * <code>BucketFolder</code> </a> and <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketName">
     * <code>BucketName</code> </a>.
     * </p>
     * <p>
     * For example, if you specify <code>CdcPath</code> as <code>MyChangedData</code>, and you specify
     * <code>BucketName</code> as <code>MyTargetBucket</code> but do not specify <code>BucketFolder</code>, AWS DMS
     * creates the CDC folder path following: <code>MyTargetBucket/MyChangedData</code>.
     * </p>
     * <p>
     * If you specify the same <code>CdcPath</code>, and you specify <code>BucketName</code> as
     * <code>MyTargetBucket</code> and <code>BucketFolder</code> as <code>MyTargetData</code>, AWS DMS creates the CDC
     * folder path following: <code>MyTargetBucket/MyTargetData/MyChangedData</code>.
     * </p>
     * <p>
     * For more information on CDC including transaction order on an S3 target, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath"
     * >Capturing data changes (CDC) including transaction order on the S3 target</a>.
     * </p>
     * <note>
     * <p>
     * This setting is supported in AWS DMS versions 3.4.2 and later.
     * </p>
     * </note>
     * 
     * @return Specifies the folder path of CDC files. For an S3 source, this setting is required if a task captures
     *         change data; otherwise, it's optional. If <code>CdcPath</code> is set, AWS DMS reads CDC files from this
     *         path and replicates the data changes to the target endpoint. For an S3 target if you set <a href=
     *         "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-PreserveTransactions"
     *         > <code>PreserveTransactions</code> </a> to <code>true</code>, AWS DMS verifies that you have set this
     *         parameter to a folder path on your S3 target where AWS DMS can save the transaction order for the CDC
     *         load. AWS DMS creates this CDC folder path in either your S3 target working directory or the S3 target
     *         location specified by <a href=
     *         "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketFolder"
     *         > <code>BucketFolder</code> </a> and <a
     *         href="https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketName"
     *         > <code>BucketName</code> </a>.</p>
     *         <p>
     *         For example, if you specify <code>CdcPath</code> as <code>MyChangedData</code>, and you specify
     *         <code>BucketName</code> as <code>MyTargetBucket</code> but do not specify <code>BucketFolder</code>, AWS
     *         DMS creates the CDC folder path following: <code>MyTargetBucket/MyChangedData</code>.
     *         </p>
     *         <p>
     *         If you specify the same <code>CdcPath</code>, and you specify <code>BucketName</code> as
     *         <code>MyTargetBucket</code> and <code>BucketFolder</code> as <code>MyTargetData</code>, AWS DMS creates
     *         the CDC folder path following: <code>MyTargetBucket/MyTargetData/MyChangedData</code>.
     *         </p>
     *         <p>
     *         For more information on CDC including transaction order on an S3 target, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath"
     *         >Capturing data changes (CDC) including transaction order on the S3 target</a>.
     *         </p>
     *         <note>
     *         <p>
     *         This setting is supported in AWS DMS versions 3.4.2 and later.
     *         </p>
     */

    public String getCdcPath() {
        return this.cdcPath;
    }

    /**
     * <p>
     * Specifies the folder path of CDC files. For an S3 source, this setting is required if a task captures change
     * data; otherwise, it's optional. If <code>CdcPath</code> is set, AWS DMS reads CDC files from this path and
     * replicates the data changes to the target endpoint. For an S3 target if you set <a href=
     * "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-PreserveTransactions"
     * > <code>PreserveTransactions</code> </a> to <code>true</code>, AWS DMS verifies that you have set this parameter
     * to a folder path on your S3 target where AWS DMS can save the transaction order for the CDC load. AWS DMS creates
     * this CDC folder path in either your S3 target working directory or the S3 target location specified by <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketFolder">
     * <code>BucketFolder</code> </a> and <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketName">
     * <code>BucketName</code> </a>.
     * </p>
     * <p>
     * For example, if you specify <code>CdcPath</code> as <code>MyChangedData</code>, and you specify
     * <code>BucketName</code> as <code>MyTargetBucket</code> but do not specify <code>BucketFolder</code>, AWS DMS
     * creates the CDC folder path following: <code>MyTargetBucket/MyChangedData</code>.
     * </p>
     * <p>
     * If you specify the same <code>CdcPath</code>, and you specify <code>BucketName</code> as
     * <code>MyTargetBucket</code> and <code>BucketFolder</code> as <code>MyTargetData</code>, AWS DMS creates the CDC
     * folder path following: <code>MyTargetBucket/MyTargetData/MyChangedData</code>.
     * </p>
     * <p>
     * For more information on CDC including transaction order on an S3 target, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath"
     * >Capturing data changes (CDC) including transaction order on the S3 target</a>.
     * </p>
     * <note>
     * <p>
     * This setting is supported in AWS DMS versions 3.4.2 and later.
     * </p>
     * </note>
     * 
     * @param cdcPath
     *        Specifies the folder path of CDC files. For an S3 source, this setting is required if a task captures
     *        change data; otherwise, it's optional. If <code>CdcPath</code> is set, AWS DMS reads CDC files from this
     *        path and replicates the data changes to the target endpoint. For an S3 target if you set <a href=
     *        "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-PreserveTransactions"
     *        > <code>PreserveTransactions</code> </a> to <code>true</code>, AWS DMS verifies that you have set this
     *        parameter to a folder path on your S3 target where AWS DMS can save the transaction order for the CDC
     *        load. AWS DMS creates this CDC folder path in either your S3 target working directory or the S3 target
     *        location specified by <a href=
     *        "https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketFolder"
     *        > <code>BucketFolder</code> </a> and <a
     *        href="https://docs.aws.amazon.com/dms/latest/APIReference/API_S3Settings.html#DMS-Type-S3Settings-BucketName"
     *        > <code>BucketName</code> </a>.</p>
     *        <p>
     *        For example, if you specify <code>CdcPath</code> as <code>MyChangedData</code>, and you specify
     *        <code>BucketName</code> as <code>MyTargetBucket</code> but do not specify <code>BucketFolder</code>, AWS
     *        DMS creates the CDC folder path following: <code>MyTargetBucket/MyChangedData</code>.
     *        </p>
     *        <p>
     *        If you specify the same <code>CdcPath</code>, and you specify <code>BucketName</code> as
     *        <code>MyTargetBucket</code> and <code>BucketFolder</code> as <code>MyTargetData</code>, AWS DMS creates
     *        the CDC folder path following: <code>MyTargetBucket/MyTargetData/MyChangedData</code>.
     *        </p>
     *        <p>
     *        For more information on CDC including transaction order on an S3 target, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.EndpointSettings.CdcPath"
     *        >Capturing data changes (CDC) including transaction order on the S3 target</a>.
     *        </p>
     *        <note>
     *        <p>
     *        This setting is supported in AWS DMS versions 3.4.2 and later.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withCdcPath(String cdcPath) {
        setCdcPath(cdcPath);
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
        if (getServiceAccessRoleArn() != null)
            sb.append("ServiceAccessRoleArn: ").append(getServiceAccessRoleArn()).append(",");
        if (getExternalTableDefinition() != null)
            sb.append("ExternalTableDefinition: ").append(getExternalTableDefinition()).append(",");
        if (getCsvRowDelimiter() != null)
            sb.append("CsvRowDelimiter: ").append(getCsvRowDelimiter()).append(",");
        if (getCsvDelimiter() != null)
            sb.append("CsvDelimiter: ").append(getCsvDelimiter()).append(",");
        if (getBucketFolder() != null)
            sb.append("BucketFolder: ").append(getBucketFolder()).append(",");
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getCompressionType() != null)
            sb.append("CompressionType: ").append(getCompressionType()).append(",");
        if (getEncryptionMode() != null)
            sb.append("EncryptionMode: ").append(getEncryptionMode()).append(",");
        if (getServerSideEncryptionKmsKeyId() != null)
            sb.append("ServerSideEncryptionKmsKeyId: ").append(getServerSideEncryptionKmsKeyId()).append(",");
        if (getDataFormat() != null)
            sb.append("DataFormat: ").append(getDataFormat()).append(",");
        if (getEncodingType() != null)
            sb.append("EncodingType: ").append(getEncodingType()).append(",");
        if (getDictPageSizeLimit() != null)
            sb.append("DictPageSizeLimit: ").append(getDictPageSizeLimit()).append(",");
        if (getRowGroupLength() != null)
            sb.append("RowGroupLength: ").append(getRowGroupLength()).append(",");
        if (getDataPageSize() != null)
            sb.append("DataPageSize: ").append(getDataPageSize()).append(",");
        if (getParquetVersion() != null)
            sb.append("ParquetVersion: ").append(getParquetVersion()).append(",");
        if (getEnableStatistics() != null)
            sb.append("EnableStatistics: ").append(getEnableStatistics()).append(",");
        if (getIncludeOpForFullLoad() != null)
            sb.append("IncludeOpForFullLoad: ").append(getIncludeOpForFullLoad()).append(",");
        if (getCdcInsertsOnly() != null)
            sb.append("CdcInsertsOnly: ").append(getCdcInsertsOnly()).append(",");
        if (getTimestampColumnName() != null)
            sb.append("TimestampColumnName: ").append(getTimestampColumnName()).append(",");
        if (getParquetTimestampInMillisecond() != null)
            sb.append("ParquetTimestampInMillisecond: ").append(getParquetTimestampInMillisecond()).append(",");
        if (getCdcInsertsAndUpdates() != null)
            sb.append("CdcInsertsAndUpdates: ").append(getCdcInsertsAndUpdates()).append(",");
        if (getDatePartitionEnabled() != null)
            sb.append("DatePartitionEnabled: ").append(getDatePartitionEnabled()).append(",");
        if (getDatePartitionSequence() != null)
            sb.append("DatePartitionSequence: ").append(getDatePartitionSequence()).append(",");
        if (getDatePartitionDelimiter() != null)
            sb.append("DatePartitionDelimiter: ").append(getDatePartitionDelimiter()).append(",");
        if (getUseCsvNoSupValue() != null)
            sb.append("UseCsvNoSupValue: ").append(getUseCsvNoSupValue()).append(",");
        if (getCsvNoSupValue() != null)
            sb.append("CsvNoSupValue: ").append(getCsvNoSupValue()).append(",");
        if (getPreserveTransactions() != null)
            sb.append("PreserveTransactions: ").append(getPreserveTransactions()).append(",");
        if (getCdcPath() != null)
            sb.append("CdcPath: ").append(getCdcPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Settings == false)
            return false;
        S3Settings other = (S3Settings) obj;
        if (other.getServiceAccessRoleArn() == null ^ this.getServiceAccessRoleArn() == null)
            return false;
        if (other.getServiceAccessRoleArn() != null && other.getServiceAccessRoleArn().equals(this.getServiceAccessRoleArn()) == false)
            return false;
        if (other.getExternalTableDefinition() == null ^ this.getExternalTableDefinition() == null)
            return false;
        if (other.getExternalTableDefinition() != null && other.getExternalTableDefinition().equals(this.getExternalTableDefinition()) == false)
            return false;
        if (other.getCsvRowDelimiter() == null ^ this.getCsvRowDelimiter() == null)
            return false;
        if (other.getCsvRowDelimiter() != null && other.getCsvRowDelimiter().equals(this.getCsvRowDelimiter()) == false)
            return false;
        if (other.getCsvDelimiter() == null ^ this.getCsvDelimiter() == null)
            return false;
        if (other.getCsvDelimiter() != null && other.getCsvDelimiter().equals(this.getCsvDelimiter()) == false)
            return false;
        if (other.getBucketFolder() == null ^ this.getBucketFolder() == null)
            return false;
        if (other.getBucketFolder() != null && other.getBucketFolder().equals(this.getBucketFolder()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getCompressionType() == null ^ this.getCompressionType() == null)
            return false;
        if (other.getCompressionType() != null && other.getCompressionType().equals(this.getCompressionType()) == false)
            return false;
        if (other.getEncryptionMode() == null ^ this.getEncryptionMode() == null)
            return false;
        if (other.getEncryptionMode() != null && other.getEncryptionMode().equals(this.getEncryptionMode()) == false)
            return false;
        if (other.getServerSideEncryptionKmsKeyId() == null ^ this.getServerSideEncryptionKmsKeyId() == null)
            return false;
        if (other.getServerSideEncryptionKmsKeyId() != null && other.getServerSideEncryptionKmsKeyId().equals(this.getServerSideEncryptionKmsKeyId()) == false)
            return false;
        if (other.getDataFormat() == null ^ this.getDataFormat() == null)
            return false;
        if (other.getDataFormat() != null && other.getDataFormat().equals(this.getDataFormat()) == false)
            return false;
        if (other.getEncodingType() == null ^ this.getEncodingType() == null)
            return false;
        if (other.getEncodingType() != null && other.getEncodingType().equals(this.getEncodingType()) == false)
            return false;
        if (other.getDictPageSizeLimit() == null ^ this.getDictPageSizeLimit() == null)
            return false;
        if (other.getDictPageSizeLimit() != null && other.getDictPageSizeLimit().equals(this.getDictPageSizeLimit()) == false)
            return false;
        if (other.getRowGroupLength() == null ^ this.getRowGroupLength() == null)
            return false;
        if (other.getRowGroupLength() != null && other.getRowGroupLength().equals(this.getRowGroupLength()) == false)
            return false;
        if (other.getDataPageSize() == null ^ this.getDataPageSize() == null)
            return false;
        if (other.getDataPageSize() != null && other.getDataPageSize().equals(this.getDataPageSize()) == false)
            return false;
        if (other.getParquetVersion() == null ^ this.getParquetVersion() == null)
            return false;
        if (other.getParquetVersion() != null && other.getParquetVersion().equals(this.getParquetVersion()) == false)
            return false;
        if (other.getEnableStatistics() == null ^ this.getEnableStatistics() == null)
            return false;
        if (other.getEnableStatistics() != null && other.getEnableStatistics().equals(this.getEnableStatistics()) == false)
            return false;
        if (other.getIncludeOpForFullLoad() == null ^ this.getIncludeOpForFullLoad() == null)
            return false;
        if (other.getIncludeOpForFullLoad() != null && other.getIncludeOpForFullLoad().equals(this.getIncludeOpForFullLoad()) == false)
            return false;
        if (other.getCdcInsertsOnly() == null ^ this.getCdcInsertsOnly() == null)
            return false;
        if (other.getCdcInsertsOnly() != null && other.getCdcInsertsOnly().equals(this.getCdcInsertsOnly()) == false)
            return false;
        if (other.getTimestampColumnName() == null ^ this.getTimestampColumnName() == null)
            return false;
        if (other.getTimestampColumnName() != null && other.getTimestampColumnName().equals(this.getTimestampColumnName()) == false)
            return false;
        if (other.getParquetTimestampInMillisecond() == null ^ this.getParquetTimestampInMillisecond() == null)
            return false;
        if (other.getParquetTimestampInMillisecond() != null
                && other.getParquetTimestampInMillisecond().equals(this.getParquetTimestampInMillisecond()) == false)
            return false;
        if (other.getCdcInsertsAndUpdates() == null ^ this.getCdcInsertsAndUpdates() == null)
            return false;
        if (other.getCdcInsertsAndUpdates() != null && other.getCdcInsertsAndUpdates().equals(this.getCdcInsertsAndUpdates()) == false)
            return false;
        if (other.getDatePartitionEnabled() == null ^ this.getDatePartitionEnabled() == null)
            return false;
        if (other.getDatePartitionEnabled() != null && other.getDatePartitionEnabled().equals(this.getDatePartitionEnabled()) == false)
            return false;
        if (other.getDatePartitionSequence() == null ^ this.getDatePartitionSequence() == null)
            return false;
        if (other.getDatePartitionSequence() != null && other.getDatePartitionSequence().equals(this.getDatePartitionSequence()) == false)
            return false;
        if (other.getDatePartitionDelimiter() == null ^ this.getDatePartitionDelimiter() == null)
            return false;
        if (other.getDatePartitionDelimiter() != null && other.getDatePartitionDelimiter().equals(this.getDatePartitionDelimiter()) == false)
            return false;
        if (other.getUseCsvNoSupValue() == null ^ this.getUseCsvNoSupValue() == null)
            return false;
        if (other.getUseCsvNoSupValue() != null && other.getUseCsvNoSupValue().equals(this.getUseCsvNoSupValue()) == false)
            return false;
        if (other.getCsvNoSupValue() == null ^ this.getCsvNoSupValue() == null)
            return false;
        if (other.getCsvNoSupValue() != null && other.getCsvNoSupValue().equals(this.getCsvNoSupValue()) == false)
            return false;
        if (other.getPreserveTransactions() == null ^ this.getPreserveTransactions() == null)
            return false;
        if (other.getPreserveTransactions() != null && other.getPreserveTransactions().equals(this.getPreserveTransactions()) == false)
            return false;
        if (other.getCdcPath() == null ^ this.getCdcPath() == null)
            return false;
        if (other.getCdcPath() != null && other.getCdcPath().equals(this.getCdcPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getExternalTableDefinition() == null) ? 0 : getExternalTableDefinition().hashCode());
        hashCode = prime * hashCode + ((getCsvRowDelimiter() == null) ? 0 : getCsvRowDelimiter().hashCode());
        hashCode = prime * hashCode + ((getCsvDelimiter() == null) ? 0 : getCsvDelimiter().hashCode());
        hashCode = prime * hashCode + ((getBucketFolder() == null) ? 0 : getBucketFolder().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getCompressionType() == null) ? 0 : getCompressionType().hashCode());
        hashCode = prime * hashCode + ((getEncryptionMode() == null) ? 0 : getEncryptionMode().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryptionKmsKeyId() == null) ? 0 : getServerSideEncryptionKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDataFormat() == null) ? 0 : getDataFormat().hashCode());
        hashCode = prime * hashCode + ((getEncodingType() == null) ? 0 : getEncodingType().hashCode());
        hashCode = prime * hashCode + ((getDictPageSizeLimit() == null) ? 0 : getDictPageSizeLimit().hashCode());
        hashCode = prime * hashCode + ((getRowGroupLength() == null) ? 0 : getRowGroupLength().hashCode());
        hashCode = prime * hashCode + ((getDataPageSize() == null) ? 0 : getDataPageSize().hashCode());
        hashCode = prime * hashCode + ((getParquetVersion() == null) ? 0 : getParquetVersion().hashCode());
        hashCode = prime * hashCode + ((getEnableStatistics() == null) ? 0 : getEnableStatistics().hashCode());
        hashCode = prime * hashCode + ((getIncludeOpForFullLoad() == null) ? 0 : getIncludeOpForFullLoad().hashCode());
        hashCode = prime * hashCode + ((getCdcInsertsOnly() == null) ? 0 : getCdcInsertsOnly().hashCode());
        hashCode = prime * hashCode + ((getTimestampColumnName() == null) ? 0 : getTimestampColumnName().hashCode());
        hashCode = prime * hashCode + ((getParquetTimestampInMillisecond() == null) ? 0 : getParquetTimestampInMillisecond().hashCode());
        hashCode = prime * hashCode + ((getCdcInsertsAndUpdates() == null) ? 0 : getCdcInsertsAndUpdates().hashCode());
        hashCode = prime * hashCode + ((getDatePartitionEnabled() == null) ? 0 : getDatePartitionEnabled().hashCode());
        hashCode = prime * hashCode + ((getDatePartitionSequence() == null) ? 0 : getDatePartitionSequence().hashCode());
        hashCode = prime * hashCode + ((getDatePartitionDelimiter() == null) ? 0 : getDatePartitionDelimiter().hashCode());
        hashCode = prime * hashCode + ((getUseCsvNoSupValue() == null) ? 0 : getUseCsvNoSupValue().hashCode());
        hashCode = prime * hashCode + ((getCsvNoSupValue() == null) ? 0 : getCsvNoSupValue().hashCode());
        hashCode = prime * hashCode + ((getPreserveTransactions() == null) ? 0 : getPreserveTransactions().hashCode());
        hashCode = prime * hashCode + ((getCdcPath() == null) ? 0 : getCdcPath().hashCode());
        return hashCode;
    }

    @Override
    public S3Settings clone() {
        try {
            return (S3Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.S3SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
