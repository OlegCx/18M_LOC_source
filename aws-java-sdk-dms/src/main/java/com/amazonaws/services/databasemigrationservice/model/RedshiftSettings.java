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
 * Provides information that defines an Amazon Redshift endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RedshiftSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A value that indicates to allow any date format, including invalid formats such as 00/00/00 00:00:00, to be
     * loaded without generating an error. You can choose <code>true</code> or <code>false</code> (the default).
     * </p>
     * <p>
     * This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with the DATEFORMAT
     * parameter. If the date format for the data doesn't match the DATEFORMAT specification, Amazon Redshift inserts a
     * NULL value into that field.
     * </p>
     */
    private Boolean acceptAnyDate;
    /**
     * <p>
     * Code to run after connecting. This parameter should contain the code itself, not the name of a file containing
     * the code.
     * </p>
     */
    private String afterConnectScript;
    /**
     * <p>
     * An S3 folder where the comma-separated-value (.csv) files are stored before being uploaded to the target Redshift
     * cluster.
     * </p>
     * <p>
     * For full load mode, AWS DMS converts source records into .csv files and loads them to the
     * <i>BucketFolder/TableID</i> path. AWS DMS uses the Redshift <code>COPY</code> command to upload the .csv files to
     * the target table. The files are deleted once the <code>COPY</code> operation has finished. For more information,
     * see <a href="https://docs.aws.amazon.com/redshift/latest/dg/r_COPY.html">COPY</a> in the <i>Amazon Redshift
     * Database Developer Guide</i>.
     * </p>
     * <p>
     * For change-data-capture (CDC) mode, AWS DMS creates a <i>NetChanges</i> table, and loads the .csv files to this
     * <i>BucketFolder/NetChangesTableID</i> path.
     * </p>
     */
    private String bucketFolder;
    /**
     * <p>
     * The name of the intermediate S3 bucket used to store .csv files before uploading data to Redshift.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * If Amazon Redshift is configured to support case sensitive schema names, set <code>CaseSensitiveNames</code> to
     * <code>true</code>. The default is <code>false</code>.
     * </p>
     */
    private Boolean caseSensitiveNames;
    /**
     * <p>
     * If you set <code>CompUpdate</code> to <code>true</code> Amazon Redshift applies automatic compression if the
     * table is empty. This applies even if the table columns already have encodings other than <code>RAW</code>. If you
     * set <code>CompUpdate</code> to <code>false</code>, automatic compression is disabled and existing column
     * encodings aren't changed. The default is <code>true</code>.
     * </p>
     */
    private Boolean compUpdate;
    /**
     * <p>
     * A value that sets the amount of time to wait (in milliseconds) before timing out, beginning from when you
     * initially establish a connection.
     * </p>
     */
    private Integer connectionTimeout;
    /**
     * <p>
     * The name of the Amazon Redshift data warehouse (service) that you are working with.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The date format that you are using. Valid values are <code>auto</code> (case-sensitive), your date format string
     * enclosed in quotes, or NULL. If this parameter is left unset (NULL), it defaults to a format of 'YYYY-MM-DD'.
     * Using <code>auto</code> recognizes most strings, even some that aren't supported when you use a date format
     * string.
     * </p>
     * <p>
     * If your date and time values use formats different from each other, set this to <code>auto</code>.
     * </p>
     */
    private String dateFormat;
    /**
     * <p>
     * A value that specifies whether AWS DMS should migrate empty CHAR and VARCHAR fields as NULL. A value of
     * <code>true</code> sets empty CHAR and VARCHAR fields to null. The default is <code>false</code>.
     * </p>
     */
    private Boolean emptyAsNull;
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
     * To use <code>SSE_S3</code>, create an AWS Identity and Access Management (IAM) role with a policy that allows
     * <code>"arn:aws:s3:::*"</code> to use the following actions: <code>"s3:PutObject", "s3:ListBucket"</code>
     * </p>
     */
    private String encryptionMode;
    /**
     * <p>
     * This setting is only valid for a full-load migration task. Set <code>ExplicitIds</code> to <code>true</code> to
     * have tables with <code>IDENTITY</code> columns override their auto-generated values with explicit values loaded
     * from the source data files used to populate the tables. The default is <code>false</code>.
     * </p>
     */
    private Boolean explicitIds;
    /**
     * <p>
     * The number of threads used to upload a single file. This parameter accepts a value from 1 through 64. It defaults
     * to 10.
     * </p>
     * <p>
     * The number of parallel streams used to upload a single .csv file to an S3 bucket using S3 Multipart Upload. For
     * more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html">Multipart upload
     * overview</a>.
     * </p>
     * <p>
     * <code>FileTransferUploadStreams</code> accepts a value from 1 through 64. It defaults to 10.
     * </p>
     */
    private Integer fileTransferUploadStreams;
    /**
     * <p>
     * The amount of time to wait (in milliseconds) before timing out of operations performed by AWS DMS on a Redshift
     * cluster, such as Redshift COPY, INSERT, DELETE, and UPDATE.
     * </p>
     */
    private Integer loadTimeout;
    /**
     * <p>
     * The maximum size (in KB) of any .csv file used to load data on an S3 bucket and transfer data to Amazon Redshift.
     * It defaults to 1048576KB (1 GB).
     * </p>
     */
    private Integer maxFileSize;
    /**
     * <p>
     * The password for the user named in the <code>username</code> property.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The port number for Amazon Redshift. The default value is 5439.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * A value that specifies to remove surrounding quotation marks from strings in the incoming data. All characters
     * within the quotation marks, including delimiters, are retained. Choose <code>true</code> to remove quotation
     * marks. The default is <code>false</code>.
     * </p>
     */
    private Boolean removeQuotes;
    /**
     * <p>
     * A list of characters that you want to replace. Use with <code>ReplaceChars</code>.
     * </p>
     */
    private String replaceInvalidChars;
    /**
     * <p>
     * A value that specifies to replaces the invalid characters specified in <code>ReplaceInvalidChars</code>,
     * substituting the specified characters instead. The default is <code>"?"</code>.
     * </p>
     */
    private String replaceChars;
    /**
     * <p>
     * The name of the Amazon Redshift cluster you are using.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that has access to the Amazon Redshift service.
     * </p>
     */
    private String serviceAccessRoleArn;
    /**
     * <p>
     * The AWS KMS key ID. If you are using <code>SSE_KMS</code> for the <code>EncryptionMode</code>, provide this key
     * ID. The key that you use needs an attached policy that enables IAM user permissions and allows use of the key.
     * </p>
     */
    private String serverSideEncryptionKmsKeyId;
    /**
     * <p>
     * The time format that you want to use. Valid values are <code>auto</code> (case-sensitive),
     * <code>'timeformat_string'</code>, <code>'epochsecs'</code>, or <code>'epochmillisecs'</code>. It defaults to 10.
     * Using <code>auto</code> recognizes most strings, even some that aren't supported when you use a time format
     * string.
     * </p>
     * <p>
     * If your date and time values use formats different from each other, set this parameter to <code>auto</code>.
     * </p>
     */
    private String timeFormat;
    /**
     * <p>
     * A value that specifies to remove the trailing white space characters from a VARCHAR string. This parameter
     * applies only to columns with a VARCHAR data type. Choose <code>true</code> to remove unneeded white space. The
     * default is <code>false</code>.
     * </p>
     */
    private Boolean trimBlanks;
    /**
     * <p>
     * A value that specifies to truncate data in columns to the appropriate number of characters, so that the data fits
     * in the column. This parameter applies only to columns with a VARCHAR or CHAR data type, and rows with a size of 4
     * MB or less. Choose <code>true</code> to truncate data. The default is <code>false</code>.
     * </p>
     */
    private Boolean truncateColumns;
    /**
     * <p>
     * An Amazon Redshift user name for a registered user.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The size (in KB) of the in-memory file write buffer used when generating .csv files on the local disk at the DMS
     * replication instance. The default value is 1000 (buffer size is 1000KB).
     * </p>
     */
    private Integer writeBufferSize;
    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted entity and grants the
     * required permissions to access the value in <code>SecretsManagerSecret</code>. <code>SecretsManagerSecret</code>
     * has the value of the AWS Secrets Manager secret that allows access to the Amazon Redshift endpoint.
     * </p>
     * <note>
     * <p>
     * You can specify one of two sets of values for these permissions. You can specify the values for this setting and
     * <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for <code>UserName</code>,
     * <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't specify both. For more
     * information on creating this <code>SecretsManagerSecret</code> and the <code>SecretsManagerAccessRoleArn</code>
     * and <code>SecretsManagerSecretId</code> required to access it, see <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     * >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration Service
     * User Guide</i>.
     * </p>
     * </note>
     */
    private String secretsManagerAccessRoleArn;
    /**
     * <p>
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the Amazon
     * Redshift endpoint connection details.
     * </p>
     */
    private String secretsManagerSecretId;

    /**
     * <p>
     * A value that indicates to allow any date format, including invalid formats such as 00/00/00 00:00:00, to be
     * loaded without generating an error. You can choose <code>true</code> or <code>false</code> (the default).
     * </p>
     * <p>
     * This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with the DATEFORMAT
     * parameter. If the date format for the data doesn't match the DATEFORMAT specification, Amazon Redshift inserts a
     * NULL value into that field.
     * </p>
     * 
     * @param acceptAnyDate
     *        A value that indicates to allow any date format, including invalid formats such as 00/00/00 00:00:00, to
     *        be loaded without generating an error. You can choose <code>true</code> or <code>false</code> (the
     *        default).</p>
     *        <p>
     *        This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with the DATEFORMAT
     *        parameter. If the date format for the data doesn't match the DATEFORMAT specification, Amazon Redshift
     *        inserts a NULL value into that field.
     */

    public void setAcceptAnyDate(Boolean acceptAnyDate) {
        this.acceptAnyDate = acceptAnyDate;
    }

    /**
     * <p>
     * A value that indicates to allow any date format, including invalid formats such as 00/00/00 00:00:00, to be
     * loaded without generating an error. You can choose <code>true</code> or <code>false</code> (the default).
     * </p>
     * <p>
     * This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with the DATEFORMAT
     * parameter. If the date format for the data doesn't match the DATEFORMAT specification, Amazon Redshift inserts a
     * NULL value into that field.
     * </p>
     * 
     * @return A value that indicates to allow any date format, including invalid formats such as 00/00/00 00:00:00, to
     *         be loaded without generating an error. You can choose <code>true</code> or <code>false</code> (the
     *         default).</p>
     *         <p>
     *         This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with the DATEFORMAT
     *         parameter. If the date format for the data doesn't match the DATEFORMAT specification, Amazon Redshift
     *         inserts a NULL value into that field.
     */

    public Boolean getAcceptAnyDate() {
        return this.acceptAnyDate;
    }

    /**
     * <p>
     * A value that indicates to allow any date format, including invalid formats such as 00/00/00 00:00:00, to be
     * loaded without generating an error. You can choose <code>true</code> or <code>false</code> (the default).
     * </p>
     * <p>
     * This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with the DATEFORMAT
     * parameter. If the date format for the data doesn't match the DATEFORMAT specification, Amazon Redshift inserts a
     * NULL value into that field.
     * </p>
     * 
     * @param acceptAnyDate
     *        A value that indicates to allow any date format, including invalid formats such as 00/00/00 00:00:00, to
     *        be loaded without generating an error. You can choose <code>true</code> or <code>false</code> (the
     *        default).</p>
     *        <p>
     *        This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with the DATEFORMAT
     *        parameter. If the date format for the data doesn't match the DATEFORMAT specification, Amazon Redshift
     *        inserts a NULL value into that field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withAcceptAnyDate(Boolean acceptAnyDate) {
        setAcceptAnyDate(acceptAnyDate);
        return this;
    }

    /**
     * <p>
     * A value that indicates to allow any date format, including invalid formats such as 00/00/00 00:00:00, to be
     * loaded without generating an error. You can choose <code>true</code> or <code>false</code> (the default).
     * </p>
     * <p>
     * This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with the DATEFORMAT
     * parameter. If the date format for the data doesn't match the DATEFORMAT specification, Amazon Redshift inserts a
     * NULL value into that field.
     * </p>
     * 
     * @return A value that indicates to allow any date format, including invalid formats such as 00/00/00 00:00:00, to
     *         be loaded without generating an error. You can choose <code>true</code> or <code>false</code> (the
     *         default).</p>
     *         <p>
     *         This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with the DATEFORMAT
     *         parameter. If the date format for the data doesn't match the DATEFORMAT specification, Amazon Redshift
     *         inserts a NULL value into that field.
     */

    public Boolean isAcceptAnyDate() {
        return this.acceptAnyDate;
    }

    /**
     * <p>
     * Code to run after connecting. This parameter should contain the code itself, not the name of a file containing
     * the code.
     * </p>
     * 
     * @param afterConnectScript
     *        Code to run after connecting. This parameter should contain the code itself, not the name of a file
     *        containing the code.
     */

    public void setAfterConnectScript(String afterConnectScript) {
        this.afterConnectScript = afterConnectScript;
    }

    /**
     * <p>
     * Code to run after connecting. This parameter should contain the code itself, not the name of a file containing
     * the code.
     * </p>
     * 
     * @return Code to run after connecting. This parameter should contain the code itself, not the name of a file
     *         containing the code.
     */

    public String getAfterConnectScript() {
        return this.afterConnectScript;
    }

    /**
     * <p>
     * Code to run after connecting. This parameter should contain the code itself, not the name of a file containing
     * the code.
     * </p>
     * 
     * @param afterConnectScript
     *        Code to run after connecting. This parameter should contain the code itself, not the name of a file
     *        containing the code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withAfterConnectScript(String afterConnectScript) {
        setAfterConnectScript(afterConnectScript);
        return this;
    }

    /**
     * <p>
     * An S3 folder where the comma-separated-value (.csv) files are stored before being uploaded to the target Redshift
     * cluster.
     * </p>
     * <p>
     * For full load mode, AWS DMS converts source records into .csv files and loads them to the
     * <i>BucketFolder/TableID</i> path. AWS DMS uses the Redshift <code>COPY</code> command to upload the .csv files to
     * the target table. The files are deleted once the <code>COPY</code> operation has finished. For more information,
     * see <a href="https://docs.aws.amazon.com/redshift/latest/dg/r_COPY.html">COPY</a> in the <i>Amazon Redshift
     * Database Developer Guide</i>.
     * </p>
     * <p>
     * For change-data-capture (CDC) mode, AWS DMS creates a <i>NetChanges</i> table, and loads the .csv files to this
     * <i>BucketFolder/NetChangesTableID</i> path.
     * </p>
     * 
     * @param bucketFolder
     *        An S3 folder where the comma-separated-value (.csv) files are stored before being uploaded to the target
     *        Redshift cluster. </p>
     *        <p>
     *        For full load mode, AWS DMS converts source records into .csv files and loads them to the
     *        <i>BucketFolder/TableID</i> path. AWS DMS uses the Redshift <code>COPY</code> command to upload the .csv
     *        files to the target table. The files are deleted once the <code>COPY</code> operation has finished. For
     *        more information, see <a href="https://docs.aws.amazon.com/redshift/latest/dg/r_COPY.html">COPY</a> in the
     *        <i>Amazon Redshift Database Developer Guide</i>.
     *        </p>
     *        <p>
     *        For change-data-capture (CDC) mode, AWS DMS creates a <i>NetChanges</i> table, and loads the .csv files to
     *        this <i>BucketFolder/NetChangesTableID</i> path.
     */

    public void setBucketFolder(String bucketFolder) {
        this.bucketFolder = bucketFolder;
    }

    /**
     * <p>
     * An S3 folder where the comma-separated-value (.csv) files are stored before being uploaded to the target Redshift
     * cluster.
     * </p>
     * <p>
     * For full load mode, AWS DMS converts source records into .csv files and loads them to the
     * <i>BucketFolder/TableID</i> path. AWS DMS uses the Redshift <code>COPY</code> command to upload the .csv files to
     * the target table. The files are deleted once the <code>COPY</code> operation has finished. For more information,
     * see <a href="https://docs.aws.amazon.com/redshift/latest/dg/r_COPY.html">COPY</a> in the <i>Amazon Redshift
     * Database Developer Guide</i>.
     * </p>
     * <p>
     * For change-data-capture (CDC) mode, AWS DMS creates a <i>NetChanges</i> table, and loads the .csv files to this
     * <i>BucketFolder/NetChangesTableID</i> path.
     * </p>
     * 
     * @return An S3 folder where the comma-separated-value (.csv) files are stored before being uploaded to the target
     *         Redshift cluster. </p>
     *         <p>
     *         For full load mode, AWS DMS converts source records into .csv files and loads them to the
     *         <i>BucketFolder/TableID</i> path. AWS DMS uses the Redshift <code>COPY</code> command to upload the .csv
     *         files to the target table. The files are deleted once the <code>COPY</code> operation has finished. For
     *         more information, see <a href="https://docs.aws.amazon.com/redshift/latest/dg/r_COPY.html">COPY</a> in
     *         the <i>Amazon Redshift Database Developer Guide</i>.
     *         </p>
     *         <p>
     *         For change-data-capture (CDC) mode, AWS DMS creates a <i>NetChanges</i> table, and loads the .csv files
     *         to this <i>BucketFolder/NetChangesTableID</i> path.
     */

    public String getBucketFolder() {
        return this.bucketFolder;
    }

    /**
     * <p>
     * An S3 folder where the comma-separated-value (.csv) files are stored before being uploaded to the target Redshift
     * cluster.
     * </p>
     * <p>
     * For full load mode, AWS DMS converts source records into .csv files and loads them to the
     * <i>BucketFolder/TableID</i> path. AWS DMS uses the Redshift <code>COPY</code> command to upload the .csv files to
     * the target table. The files are deleted once the <code>COPY</code> operation has finished. For more information,
     * see <a href="https://docs.aws.amazon.com/redshift/latest/dg/r_COPY.html">COPY</a> in the <i>Amazon Redshift
     * Database Developer Guide</i>.
     * </p>
     * <p>
     * For change-data-capture (CDC) mode, AWS DMS creates a <i>NetChanges</i> table, and loads the .csv files to this
     * <i>BucketFolder/NetChangesTableID</i> path.
     * </p>
     * 
     * @param bucketFolder
     *        An S3 folder where the comma-separated-value (.csv) files are stored before being uploaded to the target
     *        Redshift cluster. </p>
     *        <p>
     *        For full load mode, AWS DMS converts source records into .csv files and loads them to the
     *        <i>BucketFolder/TableID</i> path. AWS DMS uses the Redshift <code>COPY</code> command to upload the .csv
     *        files to the target table. The files are deleted once the <code>COPY</code> operation has finished. For
     *        more information, see <a href="https://docs.aws.amazon.com/redshift/latest/dg/r_COPY.html">COPY</a> in the
     *        <i>Amazon Redshift Database Developer Guide</i>.
     *        </p>
     *        <p>
     *        For change-data-capture (CDC) mode, AWS DMS creates a <i>NetChanges</i> table, and loads the .csv files to
     *        this <i>BucketFolder/NetChangesTableID</i> path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withBucketFolder(String bucketFolder) {
        setBucketFolder(bucketFolder);
        return this;
    }

    /**
     * <p>
     * The name of the intermediate S3 bucket used to store .csv files before uploading data to Redshift.
     * </p>
     * 
     * @param bucketName
     *        The name of the intermediate S3 bucket used to store .csv files before uploading data to Redshift.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the intermediate S3 bucket used to store .csv files before uploading data to Redshift.
     * </p>
     * 
     * @return The name of the intermediate S3 bucket used to store .csv files before uploading data to Redshift.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the intermediate S3 bucket used to store .csv files before uploading data to Redshift.
     * </p>
     * 
     * @param bucketName
     *        The name of the intermediate S3 bucket used to store .csv files before uploading data to Redshift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * If Amazon Redshift is configured to support case sensitive schema names, set <code>CaseSensitiveNames</code> to
     * <code>true</code>. The default is <code>false</code>.
     * </p>
     * 
     * @param caseSensitiveNames
     *        If Amazon Redshift is configured to support case sensitive schema names, set
     *        <code>CaseSensitiveNames</code> to <code>true</code>. The default is <code>false</code>.
     */

    public void setCaseSensitiveNames(Boolean caseSensitiveNames) {
        this.caseSensitiveNames = caseSensitiveNames;
    }

    /**
     * <p>
     * If Amazon Redshift is configured to support case sensitive schema names, set <code>CaseSensitiveNames</code> to
     * <code>true</code>. The default is <code>false</code>.
     * </p>
     * 
     * @return If Amazon Redshift is configured to support case sensitive schema names, set
     *         <code>CaseSensitiveNames</code> to <code>true</code>. The default is <code>false</code>.
     */

    public Boolean getCaseSensitiveNames() {
        return this.caseSensitiveNames;
    }

    /**
     * <p>
     * If Amazon Redshift is configured to support case sensitive schema names, set <code>CaseSensitiveNames</code> to
     * <code>true</code>. The default is <code>false</code>.
     * </p>
     * 
     * @param caseSensitiveNames
     *        If Amazon Redshift is configured to support case sensitive schema names, set
     *        <code>CaseSensitiveNames</code> to <code>true</code>. The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withCaseSensitiveNames(Boolean caseSensitiveNames) {
        setCaseSensitiveNames(caseSensitiveNames);
        return this;
    }

    /**
     * <p>
     * If Amazon Redshift is configured to support case sensitive schema names, set <code>CaseSensitiveNames</code> to
     * <code>true</code>. The default is <code>false</code>.
     * </p>
     * 
     * @return If Amazon Redshift is configured to support case sensitive schema names, set
     *         <code>CaseSensitiveNames</code> to <code>true</code>. The default is <code>false</code>.
     */

    public Boolean isCaseSensitiveNames() {
        return this.caseSensitiveNames;
    }

    /**
     * <p>
     * If you set <code>CompUpdate</code> to <code>true</code> Amazon Redshift applies automatic compression if the
     * table is empty. This applies even if the table columns already have encodings other than <code>RAW</code>. If you
     * set <code>CompUpdate</code> to <code>false</code>, automatic compression is disabled and existing column
     * encodings aren't changed. The default is <code>true</code>.
     * </p>
     * 
     * @param compUpdate
     *        If you set <code>CompUpdate</code> to <code>true</code> Amazon Redshift applies automatic compression if
     *        the table is empty. This applies even if the table columns already have encodings other than
     *        <code>RAW</code>. If you set <code>CompUpdate</code> to <code>false</code>, automatic compression is
     *        disabled and existing column encodings aren't changed. The default is <code>true</code>.
     */

    public void setCompUpdate(Boolean compUpdate) {
        this.compUpdate = compUpdate;
    }

    /**
     * <p>
     * If you set <code>CompUpdate</code> to <code>true</code> Amazon Redshift applies automatic compression if the
     * table is empty. This applies even if the table columns already have encodings other than <code>RAW</code>. If you
     * set <code>CompUpdate</code> to <code>false</code>, automatic compression is disabled and existing column
     * encodings aren't changed. The default is <code>true</code>.
     * </p>
     * 
     * @return If you set <code>CompUpdate</code> to <code>true</code> Amazon Redshift applies automatic compression if
     *         the table is empty. This applies even if the table columns already have encodings other than
     *         <code>RAW</code>. If you set <code>CompUpdate</code> to <code>false</code>, automatic compression is
     *         disabled and existing column encodings aren't changed. The default is <code>true</code>.
     */

    public Boolean getCompUpdate() {
        return this.compUpdate;
    }

    /**
     * <p>
     * If you set <code>CompUpdate</code> to <code>true</code> Amazon Redshift applies automatic compression if the
     * table is empty. This applies even if the table columns already have encodings other than <code>RAW</code>. If you
     * set <code>CompUpdate</code> to <code>false</code>, automatic compression is disabled and existing column
     * encodings aren't changed. The default is <code>true</code>.
     * </p>
     * 
     * @param compUpdate
     *        If you set <code>CompUpdate</code> to <code>true</code> Amazon Redshift applies automatic compression if
     *        the table is empty. This applies even if the table columns already have encodings other than
     *        <code>RAW</code>. If you set <code>CompUpdate</code> to <code>false</code>, automatic compression is
     *        disabled and existing column encodings aren't changed. The default is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withCompUpdate(Boolean compUpdate) {
        setCompUpdate(compUpdate);
        return this;
    }

    /**
     * <p>
     * If you set <code>CompUpdate</code> to <code>true</code> Amazon Redshift applies automatic compression if the
     * table is empty. This applies even if the table columns already have encodings other than <code>RAW</code>. If you
     * set <code>CompUpdate</code> to <code>false</code>, automatic compression is disabled and existing column
     * encodings aren't changed. The default is <code>true</code>.
     * </p>
     * 
     * @return If you set <code>CompUpdate</code> to <code>true</code> Amazon Redshift applies automatic compression if
     *         the table is empty. This applies even if the table columns already have encodings other than
     *         <code>RAW</code>. If you set <code>CompUpdate</code> to <code>false</code>, automatic compression is
     *         disabled and existing column encodings aren't changed. The default is <code>true</code>.
     */

    public Boolean isCompUpdate() {
        return this.compUpdate;
    }

    /**
     * <p>
     * A value that sets the amount of time to wait (in milliseconds) before timing out, beginning from when you
     * initially establish a connection.
     * </p>
     * 
     * @param connectionTimeout
     *        A value that sets the amount of time to wait (in milliseconds) before timing out, beginning from when you
     *        initially establish a connection.
     */

    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    /**
     * <p>
     * A value that sets the amount of time to wait (in milliseconds) before timing out, beginning from when you
     * initially establish a connection.
     * </p>
     * 
     * @return A value that sets the amount of time to wait (in milliseconds) before timing out, beginning from when you
     *         initially establish a connection.
     */

    public Integer getConnectionTimeout() {
        return this.connectionTimeout;
    }

    /**
     * <p>
     * A value that sets the amount of time to wait (in milliseconds) before timing out, beginning from when you
     * initially establish a connection.
     * </p>
     * 
     * @param connectionTimeout
     *        A value that sets the amount of time to wait (in milliseconds) before timing out, beginning from when you
     *        initially establish a connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withConnectionTimeout(Integer connectionTimeout) {
        setConnectionTimeout(connectionTimeout);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Redshift data warehouse (service) that you are working with.
     * </p>
     * 
     * @param databaseName
     *        The name of the Amazon Redshift data warehouse (service) that you are working with.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the Amazon Redshift data warehouse (service) that you are working with.
     * </p>
     * 
     * @return The name of the Amazon Redshift data warehouse (service) that you are working with.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the Amazon Redshift data warehouse (service) that you are working with.
     * </p>
     * 
     * @param databaseName
     *        The name of the Amazon Redshift data warehouse (service) that you are working with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The date format that you are using. Valid values are <code>auto</code> (case-sensitive), your date format string
     * enclosed in quotes, or NULL. If this parameter is left unset (NULL), it defaults to a format of 'YYYY-MM-DD'.
     * Using <code>auto</code> recognizes most strings, even some that aren't supported when you use a date format
     * string.
     * </p>
     * <p>
     * If your date and time values use formats different from each other, set this to <code>auto</code>.
     * </p>
     * 
     * @param dateFormat
     *        The date format that you are using. Valid values are <code>auto</code> (case-sensitive), your date format
     *        string enclosed in quotes, or NULL. If this parameter is left unset (NULL), it defaults to a format of
     *        'YYYY-MM-DD'. Using <code>auto</code> recognizes most strings, even some that aren't supported when you
     *        use a date format string. </p>
     *        <p>
     *        If your date and time values use formats different from each other, set this to <code>auto</code>.
     */

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    /**
     * <p>
     * The date format that you are using. Valid values are <code>auto</code> (case-sensitive), your date format string
     * enclosed in quotes, or NULL. If this parameter is left unset (NULL), it defaults to a format of 'YYYY-MM-DD'.
     * Using <code>auto</code> recognizes most strings, even some that aren't supported when you use a date format
     * string.
     * </p>
     * <p>
     * If your date and time values use formats different from each other, set this to <code>auto</code>.
     * </p>
     * 
     * @return The date format that you are using. Valid values are <code>auto</code> (case-sensitive), your date format
     *         string enclosed in quotes, or NULL. If this parameter is left unset (NULL), it defaults to a format of
     *         'YYYY-MM-DD'. Using <code>auto</code> recognizes most strings, even some that aren't supported when you
     *         use a date format string. </p>
     *         <p>
     *         If your date and time values use formats different from each other, set this to <code>auto</code>.
     */

    public String getDateFormat() {
        return this.dateFormat;
    }

    /**
     * <p>
     * The date format that you are using. Valid values are <code>auto</code> (case-sensitive), your date format string
     * enclosed in quotes, or NULL. If this parameter is left unset (NULL), it defaults to a format of 'YYYY-MM-DD'.
     * Using <code>auto</code> recognizes most strings, even some that aren't supported when you use a date format
     * string.
     * </p>
     * <p>
     * If your date and time values use formats different from each other, set this to <code>auto</code>.
     * </p>
     * 
     * @param dateFormat
     *        The date format that you are using. Valid values are <code>auto</code> (case-sensitive), your date format
     *        string enclosed in quotes, or NULL. If this parameter is left unset (NULL), it defaults to a format of
     *        'YYYY-MM-DD'. Using <code>auto</code> recognizes most strings, even some that aren't supported when you
     *        use a date format string. </p>
     *        <p>
     *        If your date and time values use formats different from each other, set this to <code>auto</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withDateFormat(String dateFormat) {
        setDateFormat(dateFormat);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether AWS DMS should migrate empty CHAR and VARCHAR fields as NULL. A value of
     * <code>true</code> sets empty CHAR and VARCHAR fields to null. The default is <code>false</code>.
     * </p>
     * 
     * @param emptyAsNull
     *        A value that specifies whether AWS DMS should migrate empty CHAR and VARCHAR fields as NULL. A value of
     *        <code>true</code> sets empty CHAR and VARCHAR fields to null. The default is <code>false</code>.
     */

    public void setEmptyAsNull(Boolean emptyAsNull) {
        this.emptyAsNull = emptyAsNull;
    }

    /**
     * <p>
     * A value that specifies whether AWS DMS should migrate empty CHAR and VARCHAR fields as NULL. A value of
     * <code>true</code> sets empty CHAR and VARCHAR fields to null. The default is <code>false</code>.
     * </p>
     * 
     * @return A value that specifies whether AWS DMS should migrate empty CHAR and VARCHAR fields as NULL. A value of
     *         <code>true</code> sets empty CHAR and VARCHAR fields to null. The default is <code>false</code>.
     */

    public Boolean getEmptyAsNull() {
        return this.emptyAsNull;
    }

    /**
     * <p>
     * A value that specifies whether AWS DMS should migrate empty CHAR and VARCHAR fields as NULL. A value of
     * <code>true</code> sets empty CHAR and VARCHAR fields to null. The default is <code>false</code>.
     * </p>
     * 
     * @param emptyAsNull
     *        A value that specifies whether AWS DMS should migrate empty CHAR and VARCHAR fields as NULL. A value of
     *        <code>true</code> sets empty CHAR and VARCHAR fields to null. The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withEmptyAsNull(Boolean emptyAsNull) {
        setEmptyAsNull(emptyAsNull);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether AWS DMS should migrate empty CHAR and VARCHAR fields as NULL. A value of
     * <code>true</code> sets empty CHAR and VARCHAR fields to null. The default is <code>false</code>.
     * </p>
     * 
     * @return A value that specifies whether AWS DMS should migrate empty CHAR and VARCHAR fields as NULL. A value of
     *         <code>true</code> sets empty CHAR and VARCHAR fields to null. The default is <code>false</code>.
     */

    public Boolean isEmptyAsNull() {
        return this.emptyAsNull;
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
     * To use <code>SSE_S3</code>, create an AWS Identity and Access Management (IAM) role with a policy that allows
     * <code>"arn:aws:s3:::*"</code> to use the following actions: <code>"s3:PutObject", "s3:ListBucket"</code>
     * </p>
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
     *        To use <code>SSE_S3</code>, create an AWS Identity and Access Management (IAM) role with a policy that
     *        allows <code>"arn:aws:s3:::*"</code> to use the following actions:
     *        <code>"s3:PutObject", "s3:ListBucket"</code>
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
     * To use <code>SSE_S3</code>, create an AWS Identity and Access Management (IAM) role with a policy that allows
     * <code>"arn:aws:s3:::*"</code> to use the following actions: <code>"s3:PutObject", "s3:ListBucket"</code>
     * </p>
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
     *         To use <code>SSE_S3</code>, create an AWS Identity and Access Management (IAM) role with a policy that
     *         allows <code>"arn:aws:s3:::*"</code> to use the following actions:
     *         <code>"s3:PutObject", "s3:ListBucket"</code>
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
     * To use <code>SSE_S3</code>, create an AWS Identity and Access Management (IAM) role with a policy that allows
     * <code>"arn:aws:s3:::*"</code> to use the following actions: <code>"s3:PutObject", "s3:ListBucket"</code>
     * </p>
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
     *        To use <code>SSE_S3</code>, create an AWS Identity and Access Management (IAM) role with a policy that
     *        allows <code>"arn:aws:s3:::*"</code> to use the following actions:
     *        <code>"s3:PutObject", "s3:ListBucket"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionModeValue
     */

    public RedshiftSettings withEncryptionMode(String encryptionMode) {
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
     * To use <code>SSE_S3</code>, create an AWS Identity and Access Management (IAM) role with a policy that allows
     * <code>"arn:aws:s3:::*"</code> to use the following actions: <code>"s3:PutObject", "s3:ListBucket"</code>
     * </p>
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
     *        To use <code>SSE_S3</code>, create an AWS Identity and Access Management (IAM) role with a policy that
     *        allows <code>"arn:aws:s3:::*"</code> to use the following actions:
     *        <code>"s3:PutObject", "s3:ListBucket"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionModeValue
     */

    public RedshiftSettings withEncryptionMode(EncryptionModeValue encryptionMode) {
        this.encryptionMode = encryptionMode.toString();
        return this;
    }

    /**
     * <p>
     * This setting is only valid for a full-load migration task. Set <code>ExplicitIds</code> to <code>true</code> to
     * have tables with <code>IDENTITY</code> columns override their auto-generated values with explicit values loaded
     * from the source data files used to populate the tables. The default is <code>false</code>.
     * </p>
     * 
     * @param explicitIds
     *        This setting is only valid for a full-load migration task. Set <code>ExplicitIds</code> to
     *        <code>true</code> to have tables with <code>IDENTITY</code> columns override their auto-generated values
     *        with explicit values loaded from the source data files used to populate the tables. The default is
     *        <code>false</code>.
     */

    public void setExplicitIds(Boolean explicitIds) {
        this.explicitIds = explicitIds;
    }

    /**
     * <p>
     * This setting is only valid for a full-load migration task. Set <code>ExplicitIds</code> to <code>true</code> to
     * have tables with <code>IDENTITY</code> columns override their auto-generated values with explicit values loaded
     * from the source data files used to populate the tables. The default is <code>false</code>.
     * </p>
     * 
     * @return This setting is only valid for a full-load migration task. Set <code>ExplicitIds</code> to
     *         <code>true</code> to have tables with <code>IDENTITY</code> columns override their auto-generated values
     *         with explicit values loaded from the source data files used to populate the tables. The default is
     *         <code>false</code>.
     */

    public Boolean getExplicitIds() {
        return this.explicitIds;
    }

    /**
     * <p>
     * This setting is only valid for a full-load migration task. Set <code>ExplicitIds</code> to <code>true</code> to
     * have tables with <code>IDENTITY</code> columns override their auto-generated values with explicit values loaded
     * from the source data files used to populate the tables. The default is <code>false</code>.
     * </p>
     * 
     * @param explicitIds
     *        This setting is only valid for a full-load migration task. Set <code>ExplicitIds</code> to
     *        <code>true</code> to have tables with <code>IDENTITY</code> columns override their auto-generated values
     *        with explicit values loaded from the source data files used to populate the tables. The default is
     *        <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withExplicitIds(Boolean explicitIds) {
        setExplicitIds(explicitIds);
        return this;
    }

    /**
     * <p>
     * This setting is only valid for a full-load migration task. Set <code>ExplicitIds</code> to <code>true</code> to
     * have tables with <code>IDENTITY</code> columns override their auto-generated values with explicit values loaded
     * from the source data files used to populate the tables. The default is <code>false</code>.
     * </p>
     * 
     * @return This setting is only valid for a full-load migration task. Set <code>ExplicitIds</code> to
     *         <code>true</code> to have tables with <code>IDENTITY</code> columns override their auto-generated values
     *         with explicit values loaded from the source data files used to populate the tables. The default is
     *         <code>false</code>.
     */

    public Boolean isExplicitIds() {
        return this.explicitIds;
    }

    /**
     * <p>
     * The number of threads used to upload a single file. This parameter accepts a value from 1 through 64. It defaults
     * to 10.
     * </p>
     * <p>
     * The number of parallel streams used to upload a single .csv file to an S3 bucket using S3 Multipart Upload. For
     * more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html">Multipart upload
     * overview</a>.
     * </p>
     * <p>
     * <code>FileTransferUploadStreams</code> accepts a value from 1 through 64. It defaults to 10.
     * </p>
     * 
     * @param fileTransferUploadStreams
     *        The number of threads used to upload a single file. This parameter accepts a value from 1 through 64. It
     *        defaults to 10.</p>
     *        <p>
     *        The number of parallel streams used to upload a single .csv file to an S3 bucket using S3 Multipart
     *        Upload. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html">Multipart upload overview</a>.
     *        </p>
     *        <p>
     *        <code>FileTransferUploadStreams</code> accepts a value from 1 through 64. It defaults to 10.
     */

    public void setFileTransferUploadStreams(Integer fileTransferUploadStreams) {
        this.fileTransferUploadStreams = fileTransferUploadStreams;
    }

    /**
     * <p>
     * The number of threads used to upload a single file. This parameter accepts a value from 1 through 64. It defaults
     * to 10.
     * </p>
     * <p>
     * The number of parallel streams used to upload a single .csv file to an S3 bucket using S3 Multipart Upload. For
     * more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html">Multipart upload
     * overview</a>.
     * </p>
     * <p>
     * <code>FileTransferUploadStreams</code> accepts a value from 1 through 64. It defaults to 10.
     * </p>
     * 
     * @return The number of threads used to upload a single file. This parameter accepts a value from 1 through 64. It
     *         defaults to 10.</p>
     *         <p>
     *         The number of parallel streams used to upload a single .csv file to an S3 bucket using S3 Multipart
     *         Upload. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html">Multipart upload overview</a>.
     *         </p>
     *         <p>
     *         <code>FileTransferUploadStreams</code> accepts a value from 1 through 64. It defaults to 10.
     */

    public Integer getFileTransferUploadStreams() {
        return this.fileTransferUploadStreams;
    }

    /**
     * <p>
     * The number of threads used to upload a single file. This parameter accepts a value from 1 through 64. It defaults
     * to 10.
     * </p>
     * <p>
     * The number of parallel streams used to upload a single .csv file to an S3 bucket using S3 Multipart Upload. For
     * more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html">Multipart upload
     * overview</a>.
     * </p>
     * <p>
     * <code>FileTransferUploadStreams</code> accepts a value from 1 through 64. It defaults to 10.
     * </p>
     * 
     * @param fileTransferUploadStreams
     *        The number of threads used to upload a single file. This parameter accepts a value from 1 through 64. It
     *        defaults to 10.</p>
     *        <p>
     *        The number of parallel streams used to upload a single .csv file to an S3 bucket using S3 Multipart
     *        Upload. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html">Multipart upload overview</a>.
     *        </p>
     *        <p>
     *        <code>FileTransferUploadStreams</code> accepts a value from 1 through 64. It defaults to 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withFileTransferUploadStreams(Integer fileTransferUploadStreams) {
        setFileTransferUploadStreams(fileTransferUploadStreams);
        return this;
    }

    /**
     * <p>
     * The amount of time to wait (in milliseconds) before timing out of operations performed by AWS DMS on a Redshift
     * cluster, such as Redshift COPY, INSERT, DELETE, and UPDATE.
     * </p>
     * 
     * @param loadTimeout
     *        The amount of time to wait (in milliseconds) before timing out of operations performed by AWS DMS on a
     *        Redshift cluster, such as Redshift COPY, INSERT, DELETE, and UPDATE.
     */

    public void setLoadTimeout(Integer loadTimeout) {
        this.loadTimeout = loadTimeout;
    }

    /**
     * <p>
     * The amount of time to wait (in milliseconds) before timing out of operations performed by AWS DMS on a Redshift
     * cluster, such as Redshift COPY, INSERT, DELETE, and UPDATE.
     * </p>
     * 
     * @return The amount of time to wait (in milliseconds) before timing out of operations performed by AWS DMS on a
     *         Redshift cluster, such as Redshift COPY, INSERT, DELETE, and UPDATE.
     */

    public Integer getLoadTimeout() {
        return this.loadTimeout;
    }

    /**
     * <p>
     * The amount of time to wait (in milliseconds) before timing out of operations performed by AWS DMS on a Redshift
     * cluster, such as Redshift COPY, INSERT, DELETE, and UPDATE.
     * </p>
     * 
     * @param loadTimeout
     *        The amount of time to wait (in milliseconds) before timing out of operations performed by AWS DMS on a
     *        Redshift cluster, such as Redshift COPY, INSERT, DELETE, and UPDATE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withLoadTimeout(Integer loadTimeout) {
        setLoadTimeout(loadTimeout);
        return this;
    }

    /**
     * <p>
     * The maximum size (in KB) of any .csv file used to load data on an S3 bucket and transfer data to Amazon Redshift.
     * It defaults to 1048576KB (1 GB).
     * </p>
     * 
     * @param maxFileSize
     *        The maximum size (in KB) of any .csv file used to load data on an S3 bucket and transfer data to Amazon
     *        Redshift. It defaults to 1048576KB (1 GB).
     */

    public void setMaxFileSize(Integer maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    /**
     * <p>
     * The maximum size (in KB) of any .csv file used to load data on an S3 bucket and transfer data to Amazon Redshift.
     * It defaults to 1048576KB (1 GB).
     * </p>
     * 
     * @return The maximum size (in KB) of any .csv file used to load data on an S3 bucket and transfer data to Amazon
     *         Redshift. It defaults to 1048576KB (1 GB).
     */

    public Integer getMaxFileSize() {
        return this.maxFileSize;
    }

    /**
     * <p>
     * The maximum size (in KB) of any .csv file used to load data on an S3 bucket and transfer data to Amazon Redshift.
     * It defaults to 1048576KB (1 GB).
     * </p>
     * 
     * @param maxFileSize
     *        The maximum size (in KB) of any .csv file used to load data on an S3 bucket and transfer data to Amazon
     *        Redshift. It defaults to 1048576KB (1 GB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withMaxFileSize(Integer maxFileSize) {
        setMaxFileSize(maxFileSize);
        return this;
    }

    /**
     * <p>
     * The password for the user named in the <code>username</code> property.
     * </p>
     * 
     * @param password
     *        The password for the user named in the <code>username</code> property.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password for the user named in the <code>username</code> property.
     * </p>
     * 
     * @return The password for the user named in the <code>username</code> property.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password for the user named in the <code>username</code> property.
     * </p>
     * 
     * @param password
     *        The password for the user named in the <code>username</code> property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The port number for Amazon Redshift. The default value is 5439.
     * </p>
     * 
     * @param port
     *        The port number for Amazon Redshift. The default value is 5439.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number for Amazon Redshift. The default value is 5439.
     * </p>
     * 
     * @return The port number for Amazon Redshift. The default value is 5439.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number for Amazon Redshift. The default value is 5439.
     * </p>
     * 
     * @param port
     *        The port number for Amazon Redshift. The default value is 5439.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * A value that specifies to remove surrounding quotation marks from strings in the incoming data. All characters
     * within the quotation marks, including delimiters, are retained. Choose <code>true</code> to remove quotation
     * marks. The default is <code>false</code>.
     * </p>
     * 
     * @param removeQuotes
     *        A value that specifies to remove surrounding quotation marks from strings in the incoming data. All
     *        characters within the quotation marks, including delimiters, are retained. Choose <code>true</code> to
     *        remove quotation marks. The default is <code>false</code>.
     */

    public void setRemoveQuotes(Boolean removeQuotes) {
        this.removeQuotes = removeQuotes;
    }

    /**
     * <p>
     * A value that specifies to remove surrounding quotation marks from strings in the incoming data. All characters
     * within the quotation marks, including delimiters, are retained. Choose <code>true</code> to remove quotation
     * marks. The default is <code>false</code>.
     * </p>
     * 
     * @return A value that specifies to remove surrounding quotation marks from strings in the incoming data. All
     *         characters within the quotation marks, including delimiters, are retained. Choose <code>true</code> to
     *         remove quotation marks. The default is <code>false</code>.
     */

    public Boolean getRemoveQuotes() {
        return this.removeQuotes;
    }

    /**
     * <p>
     * A value that specifies to remove surrounding quotation marks from strings in the incoming data. All characters
     * within the quotation marks, including delimiters, are retained. Choose <code>true</code> to remove quotation
     * marks. The default is <code>false</code>.
     * </p>
     * 
     * @param removeQuotes
     *        A value that specifies to remove surrounding quotation marks from strings in the incoming data. All
     *        characters within the quotation marks, including delimiters, are retained. Choose <code>true</code> to
     *        remove quotation marks. The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withRemoveQuotes(Boolean removeQuotes) {
        setRemoveQuotes(removeQuotes);
        return this;
    }

    /**
     * <p>
     * A value that specifies to remove surrounding quotation marks from strings in the incoming data. All characters
     * within the quotation marks, including delimiters, are retained. Choose <code>true</code> to remove quotation
     * marks. The default is <code>false</code>.
     * </p>
     * 
     * @return A value that specifies to remove surrounding quotation marks from strings in the incoming data. All
     *         characters within the quotation marks, including delimiters, are retained. Choose <code>true</code> to
     *         remove quotation marks. The default is <code>false</code>.
     */

    public Boolean isRemoveQuotes() {
        return this.removeQuotes;
    }

    /**
     * <p>
     * A list of characters that you want to replace. Use with <code>ReplaceChars</code>.
     * </p>
     * 
     * @param replaceInvalidChars
     *        A list of characters that you want to replace. Use with <code>ReplaceChars</code>.
     */

    public void setReplaceInvalidChars(String replaceInvalidChars) {
        this.replaceInvalidChars = replaceInvalidChars;
    }

    /**
     * <p>
     * A list of characters that you want to replace. Use with <code>ReplaceChars</code>.
     * </p>
     * 
     * @return A list of characters that you want to replace. Use with <code>ReplaceChars</code>.
     */

    public String getReplaceInvalidChars() {
        return this.replaceInvalidChars;
    }

    /**
     * <p>
     * A list of characters that you want to replace. Use with <code>ReplaceChars</code>.
     * </p>
     * 
     * @param replaceInvalidChars
     *        A list of characters that you want to replace. Use with <code>ReplaceChars</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withReplaceInvalidChars(String replaceInvalidChars) {
        setReplaceInvalidChars(replaceInvalidChars);
        return this;
    }

    /**
     * <p>
     * A value that specifies to replaces the invalid characters specified in <code>ReplaceInvalidChars</code>,
     * substituting the specified characters instead. The default is <code>"?"</code>.
     * </p>
     * 
     * @param replaceChars
     *        A value that specifies to replaces the invalid characters specified in <code>ReplaceInvalidChars</code>,
     *        substituting the specified characters instead. The default is <code>"?"</code>.
     */

    public void setReplaceChars(String replaceChars) {
        this.replaceChars = replaceChars;
    }

    /**
     * <p>
     * A value that specifies to replaces the invalid characters specified in <code>ReplaceInvalidChars</code>,
     * substituting the specified characters instead. The default is <code>"?"</code>.
     * </p>
     * 
     * @return A value that specifies to replaces the invalid characters specified in <code>ReplaceInvalidChars</code>,
     *         substituting the specified characters instead. The default is <code>"?"</code>.
     */

    public String getReplaceChars() {
        return this.replaceChars;
    }

    /**
     * <p>
     * A value that specifies to replaces the invalid characters specified in <code>ReplaceInvalidChars</code>,
     * substituting the specified characters instead. The default is <code>"?"</code>.
     * </p>
     * 
     * @param replaceChars
     *        A value that specifies to replaces the invalid characters specified in <code>ReplaceInvalidChars</code>,
     *        substituting the specified characters instead. The default is <code>"?"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withReplaceChars(String replaceChars) {
        setReplaceChars(replaceChars);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Redshift cluster you are using.
     * </p>
     * 
     * @param serverName
     *        The name of the Amazon Redshift cluster you are using.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the Amazon Redshift cluster you are using.
     * </p>
     * 
     * @return The name of the Amazon Redshift cluster you are using.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the Amazon Redshift cluster you are using.
     * </p>
     * 
     * @param serverName
     *        The name of the Amazon Redshift cluster you are using.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that has access to the Amazon Redshift service.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that has access to the Amazon Redshift service.
     */

    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that has access to the Amazon Redshift service.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that has access to the Amazon Redshift service.
     */

    public String getServiceAccessRoleArn() {
        return this.serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that has access to the Amazon Redshift service.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that has access to the Amazon Redshift service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withServiceAccessRoleArn(String serviceAccessRoleArn) {
        setServiceAccessRoleArn(serviceAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The AWS KMS key ID. If you are using <code>SSE_KMS</code> for the <code>EncryptionMode</code>, provide this key
     * ID. The key that you use needs an attached policy that enables IAM user permissions and allows use of the key.
     * </p>
     * 
     * @param serverSideEncryptionKmsKeyId
     *        The AWS KMS key ID. If you are using <code>SSE_KMS</code> for the <code>EncryptionMode</code>, provide
     *        this key ID. The key that you use needs an attached policy that enables IAM user permissions and allows
     *        use of the key.
     */

    public void setServerSideEncryptionKmsKeyId(String serverSideEncryptionKmsKeyId) {
        this.serverSideEncryptionKmsKeyId = serverSideEncryptionKmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID. If you are using <code>SSE_KMS</code> for the <code>EncryptionMode</code>, provide this key
     * ID. The key that you use needs an attached policy that enables IAM user permissions and allows use of the key.
     * </p>
     * 
     * @return The AWS KMS key ID. If you are using <code>SSE_KMS</code> for the <code>EncryptionMode</code>, provide
     *         this key ID. The key that you use needs an attached policy that enables IAM user permissions and allows
     *         use of the key.
     */

    public String getServerSideEncryptionKmsKeyId() {
        return this.serverSideEncryptionKmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID. If you are using <code>SSE_KMS</code> for the <code>EncryptionMode</code>, provide this key
     * ID. The key that you use needs an attached policy that enables IAM user permissions and allows use of the key.
     * </p>
     * 
     * @param serverSideEncryptionKmsKeyId
     *        The AWS KMS key ID. If you are using <code>SSE_KMS</code> for the <code>EncryptionMode</code>, provide
     *        this key ID. The key that you use needs an attached policy that enables IAM user permissions and allows
     *        use of the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withServerSideEncryptionKmsKeyId(String serverSideEncryptionKmsKeyId) {
        setServerSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId);
        return this;
    }

    /**
     * <p>
     * The time format that you want to use. Valid values are <code>auto</code> (case-sensitive),
     * <code>'timeformat_string'</code>, <code>'epochsecs'</code>, or <code>'epochmillisecs'</code>. It defaults to 10.
     * Using <code>auto</code> recognizes most strings, even some that aren't supported when you use a time format
     * string.
     * </p>
     * <p>
     * If your date and time values use formats different from each other, set this parameter to <code>auto</code>.
     * </p>
     * 
     * @param timeFormat
     *        The time format that you want to use. Valid values are <code>auto</code> (case-sensitive),
     *        <code>'timeformat_string'</code>, <code>'epochsecs'</code>, or <code>'epochmillisecs'</code>. It defaults
     *        to 10. Using <code>auto</code> recognizes most strings, even some that aren't supported when you use a
     *        time format string. </p>
     *        <p>
     *        If your date and time values use formats different from each other, set this parameter to
     *        <code>auto</code>.
     */

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    /**
     * <p>
     * The time format that you want to use. Valid values are <code>auto</code> (case-sensitive),
     * <code>'timeformat_string'</code>, <code>'epochsecs'</code>, or <code>'epochmillisecs'</code>. It defaults to 10.
     * Using <code>auto</code> recognizes most strings, even some that aren't supported when you use a time format
     * string.
     * </p>
     * <p>
     * If your date and time values use formats different from each other, set this parameter to <code>auto</code>.
     * </p>
     * 
     * @return The time format that you want to use. Valid values are <code>auto</code> (case-sensitive),
     *         <code>'timeformat_string'</code>, <code>'epochsecs'</code>, or <code>'epochmillisecs'</code>. It defaults
     *         to 10. Using <code>auto</code> recognizes most strings, even some that aren't supported when you use a
     *         time format string. </p>
     *         <p>
     *         If your date and time values use formats different from each other, set this parameter to
     *         <code>auto</code>.
     */

    public String getTimeFormat() {
        return this.timeFormat;
    }

    /**
     * <p>
     * The time format that you want to use. Valid values are <code>auto</code> (case-sensitive),
     * <code>'timeformat_string'</code>, <code>'epochsecs'</code>, or <code>'epochmillisecs'</code>. It defaults to 10.
     * Using <code>auto</code> recognizes most strings, even some that aren't supported when you use a time format
     * string.
     * </p>
     * <p>
     * If your date and time values use formats different from each other, set this parameter to <code>auto</code>.
     * </p>
     * 
     * @param timeFormat
     *        The time format that you want to use. Valid values are <code>auto</code> (case-sensitive),
     *        <code>'timeformat_string'</code>, <code>'epochsecs'</code>, or <code>'epochmillisecs'</code>. It defaults
     *        to 10. Using <code>auto</code> recognizes most strings, even some that aren't supported when you use a
     *        time format string. </p>
     *        <p>
     *        If your date and time values use formats different from each other, set this parameter to
     *        <code>auto</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withTimeFormat(String timeFormat) {
        setTimeFormat(timeFormat);
        return this;
    }

    /**
     * <p>
     * A value that specifies to remove the trailing white space characters from a VARCHAR string. This parameter
     * applies only to columns with a VARCHAR data type. Choose <code>true</code> to remove unneeded white space. The
     * default is <code>false</code>.
     * </p>
     * 
     * @param trimBlanks
     *        A value that specifies to remove the trailing white space characters from a VARCHAR string. This parameter
     *        applies only to columns with a VARCHAR data type. Choose <code>true</code> to remove unneeded white space.
     *        The default is <code>false</code>.
     */

    public void setTrimBlanks(Boolean trimBlanks) {
        this.trimBlanks = trimBlanks;
    }

    /**
     * <p>
     * A value that specifies to remove the trailing white space characters from a VARCHAR string. This parameter
     * applies only to columns with a VARCHAR data type. Choose <code>true</code> to remove unneeded white space. The
     * default is <code>false</code>.
     * </p>
     * 
     * @return A value that specifies to remove the trailing white space characters from a VARCHAR string. This
     *         parameter applies only to columns with a VARCHAR data type. Choose <code>true</code> to remove unneeded
     *         white space. The default is <code>false</code>.
     */

    public Boolean getTrimBlanks() {
        return this.trimBlanks;
    }

    /**
     * <p>
     * A value that specifies to remove the trailing white space characters from a VARCHAR string. This parameter
     * applies only to columns with a VARCHAR data type. Choose <code>true</code> to remove unneeded white space. The
     * default is <code>false</code>.
     * </p>
     * 
     * @param trimBlanks
     *        A value that specifies to remove the trailing white space characters from a VARCHAR string. This parameter
     *        applies only to columns with a VARCHAR data type. Choose <code>true</code> to remove unneeded white space.
     *        The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withTrimBlanks(Boolean trimBlanks) {
        setTrimBlanks(trimBlanks);
        return this;
    }

    /**
     * <p>
     * A value that specifies to remove the trailing white space characters from a VARCHAR string. This parameter
     * applies only to columns with a VARCHAR data type. Choose <code>true</code> to remove unneeded white space. The
     * default is <code>false</code>.
     * </p>
     * 
     * @return A value that specifies to remove the trailing white space characters from a VARCHAR string. This
     *         parameter applies only to columns with a VARCHAR data type. Choose <code>true</code> to remove unneeded
     *         white space. The default is <code>false</code>.
     */

    public Boolean isTrimBlanks() {
        return this.trimBlanks;
    }

    /**
     * <p>
     * A value that specifies to truncate data in columns to the appropriate number of characters, so that the data fits
     * in the column. This parameter applies only to columns with a VARCHAR or CHAR data type, and rows with a size of 4
     * MB or less. Choose <code>true</code> to truncate data. The default is <code>false</code>.
     * </p>
     * 
     * @param truncateColumns
     *        A value that specifies to truncate data in columns to the appropriate number of characters, so that the
     *        data fits in the column. This parameter applies only to columns with a VARCHAR or CHAR data type, and rows
     *        with a size of 4 MB or less. Choose <code>true</code> to truncate data. The default is <code>false</code>.
     */

    public void setTruncateColumns(Boolean truncateColumns) {
        this.truncateColumns = truncateColumns;
    }

    /**
     * <p>
     * A value that specifies to truncate data in columns to the appropriate number of characters, so that the data fits
     * in the column. This parameter applies only to columns with a VARCHAR or CHAR data type, and rows with a size of 4
     * MB or less. Choose <code>true</code> to truncate data. The default is <code>false</code>.
     * </p>
     * 
     * @return A value that specifies to truncate data in columns to the appropriate number of characters, so that the
     *         data fits in the column. This parameter applies only to columns with a VARCHAR or CHAR data type, and
     *         rows with a size of 4 MB or less. Choose <code>true</code> to truncate data. The default is
     *         <code>false</code>.
     */

    public Boolean getTruncateColumns() {
        return this.truncateColumns;
    }

    /**
     * <p>
     * A value that specifies to truncate data in columns to the appropriate number of characters, so that the data fits
     * in the column. This parameter applies only to columns with a VARCHAR or CHAR data type, and rows with a size of 4
     * MB or less. Choose <code>true</code> to truncate data. The default is <code>false</code>.
     * </p>
     * 
     * @param truncateColumns
     *        A value that specifies to truncate data in columns to the appropriate number of characters, so that the
     *        data fits in the column. This parameter applies only to columns with a VARCHAR or CHAR data type, and rows
     *        with a size of 4 MB or less. Choose <code>true</code> to truncate data. The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withTruncateColumns(Boolean truncateColumns) {
        setTruncateColumns(truncateColumns);
        return this;
    }

    /**
     * <p>
     * A value that specifies to truncate data in columns to the appropriate number of characters, so that the data fits
     * in the column. This parameter applies only to columns with a VARCHAR or CHAR data type, and rows with a size of 4
     * MB or less. Choose <code>true</code> to truncate data. The default is <code>false</code>.
     * </p>
     * 
     * @return A value that specifies to truncate data in columns to the appropriate number of characters, so that the
     *         data fits in the column. This parameter applies only to columns with a VARCHAR or CHAR data type, and
     *         rows with a size of 4 MB or less. Choose <code>true</code> to truncate data. The default is
     *         <code>false</code>.
     */

    public Boolean isTruncateColumns() {
        return this.truncateColumns;
    }

    /**
     * <p>
     * An Amazon Redshift user name for a registered user.
     * </p>
     * 
     * @param username
     *        An Amazon Redshift user name for a registered user.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * An Amazon Redshift user name for a registered user.
     * </p>
     * 
     * @return An Amazon Redshift user name for a registered user.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * An Amazon Redshift user name for a registered user.
     * </p>
     * 
     * @param username
     *        An Amazon Redshift user name for a registered user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The size (in KB) of the in-memory file write buffer used when generating .csv files on the local disk at the DMS
     * replication instance. The default value is 1000 (buffer size is 1000KB).
     * </p>
     * 
     * @param writeBufferSize
     *        The size (in KB) of the in-memory file write buffer used when generating .csv files on the local disk at
     *        the DMS replication instance. The default value is 1000 (buffer size is 1000KB).
     */

    public void setWriteBufferSize(Integer writeBufferSize) {
        this.writeBufferSize = writeBufferSize;
    }

    /**
     * <p>
     * The size (in KB) of the in-memory file write buffer used when generating .csv files on the local disk at the DMS
     * replication instance. The default value is 1000 (buffer size is 1000KB).
     * </p>
     * 
     * @return The size (in KB) of the in-memory file write buffer used when generating .csv files on the local disk at
     *         the DMS replication instance. The default value is 1000 (buffer size is 1000KB).
     */

    public Integer getWriteBufferSize() {
        return this.writeBufferSize;
    }

    /**
     * <p>
     * The size (in KB) of the in-memory file write buffer used when generating .csv files on the local disk at the DMS
     * replication instance. The default value is 1000 (buffer size is 1000KB).
     * </p>
     * 
     * @param writeBufferSize
     *        The size (in KB) of the in-memory file write buffer used when generating .csv files on the local disk at
     *        the DMS replication instance. The default value is 1000 (buffer size is 1000KB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withWriteBufferSize(Integer writeBufferSize) {
        setWriteBufferSize(writeBufferSize);
        return this;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted entity and grants the
     * required permissions to access the value in <code>SecretsManagerSecret</code>. <code>SecretsManagerSecret</code>
     * has the value of the AWS Secrets Manager secret that allows access to the Amazon Redshift endpoint.
     * </p>
     * <note>
     * <p>
     * You can specify one of two sets of values for these permissions. You can specify the values for this setting and
     * <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for <code>UserName</code>,
     * <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't specify both. For more
     * information on creating this <code>SecretsManagerSecret</code> and the <code>SecretsManagerAccessRoleArn</code>
     * and <code>SecretsManagerSecretId</code> required to access it, see <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     * >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration Service
     * User Guide</i>.
     * </p>
     * </note>
     * 
     * @param secretsManagerAccessRoleArn
     *        The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted entity and
     *        grants the required permissions to access the value in <code>SecretsManagerSecret</code>.
     *        <code>SecretsManagerSecret</code> has the value of the AWS Secrets Manager secret that allows access to
     *        the Amazon Redshift endpoint.</p> <note>
     *        <p>
     *        You can specify one of two sets of values for these permissions. You can specify the values for this
     *        setting and <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for
     *        <code>UserName</code>, <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't
     *        specify both. For more information on creating this <code>SecretsManagerSecret</code> and the
     *        <code>SecretsManagerAccessRoleArn</code> and <code>SecretsManagerSecretId</code> required to access it,
     *        see <a href=
     *        "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     *        >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration
     *        Service User Guide</i>.
     *        </p>
     */

    public void setSecretsManagerAccessRoleArn(String secretsManagerAccessRoleArn) {
        this.secretsManagerAccessRoleArn = secretsManagerAccessRoleArn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted entity and grants the
     * required permissions to access the value in <code>SecretsManagerSecret</code>. <code>SecretsManagerSecret</code>
     * has the value of the AWS Secrets Manager secret that allows access to the Amazon Redshift endpoint.
     * </p>
     * <note>
     * <p>
     * You can specify one of two sets of values for these permissions. You can specify the values for this setting and
     * <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for <code>UserName</code>,
     * <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't specify both. For more
     * information on creating this <code>SecretsManagerSecret</code> and the <code>SecretsManagerAccessRoleArn</code>
     * and <code>SecretsManagerSecretId</code> required to access it, see <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     * >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration Service
     * User Guide</i>.
     * </p>
     * </note>
     * 
     * @return The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted entity and
     *         grants the required permissions to access the value in <code>SecretsManagerSecret</code>.
     *         <code>SecretsManagerSecret</code> has the value of the AWS Secrets Manager secret that allows access to
     *         the Amazon Redshift endpoint.</p> <note>
     *         <p>
     *         You can specify one of two sets of values for these permissions. You can specify the values for this
     *         setting and <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for
     *         <code>UserName</code>, <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't
     *         specify both. For more information on creating this <code>SecretsManagerSecret</code> and the
     *         <code>SecretsManagerAccessRoleArn</code> and <code>SecretsManagerSecretId</code> required to access it,
     *         see <a href=
     *         "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     *         >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration
     *         Service User Guide</i>.
     *         </p>
     */

    public String getSecretsManagerAccessRoleArn() {
        return this.secretsManagerAccessRoleArn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted entity and grants the
     * required permissions to access the value in <code>SecretsManagerSecret</code>. <code>SecretsManagerSecret</code>
     * has the value of the AWS Secrets Manager secret that allows access to the Amazon Redshift endpoint.
     * </p>
     * <note>
     * <p>
     * You can specify one of two sets of values for these permissions. You can specify the values for this setting and
     * <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for <code>UserName</code>,
     * <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't specify both. For more
     * information on creating this <code>SecretsManagerSecret</code> and the <code>SecretsManagerAccessRoleArn</code>
     * and <code>SecretsManagerSecretId</code> required to access it, see <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     * >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration Service
     * User Guide</i>.
     * </p>
     * </note>
     * 
     * @param secretsManagerAccessRoleArn
     *        The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted entity and
     *        grants the required permissions to access the value in <code>SecretsManagerSecret</code>.
     *        <code>SecretsManagerSecret</code> has the value of the AWS Secrets Manager secret that allows access to
     *        the Amazon Redshift endpoint.</p> <note>
     *        <p>
     *        You can specify one of two sets of values for these permissions. You can specify the values for this
     *        setting and <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for
     *        <code>UserName</code>, <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't
     *        specify both. For more information on creating this <code>SecretsManagerSecret</code> and the
     *        <code>SecretsManagerAccessRoleArn</code> and <code>SecretsManagerSecretId</code> required to access it,
     *        see <a href=
     *        "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     *        >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration
     *        Service User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withSecretsManagerAccessRoleArn(String secretsManagerAccessRoleArn) {
        setSecretsManagerAccessRoleArn(secretsManagerAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the Amazon
     * Redshift endpoint connection details.
     * </p>
     * 
     * @param secretsManagerSecretId
     *        The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the
     *        Amazon Redshift endpoint connection details.
     */

    public void setSecretsManagerSecretId(String secretsManagerSecretId) {
        this.secretsManagerSecretId = secretsManagerSecretId;
    }

    /**
     * <p>
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the Amazon
     * Redshift endpoint connection details.
     * </p>
     * 
     * @return The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the
     *         Amazon Redshift endpoint connection details.
     */

    public String getSecretsManagerSecretId() {
        return this.secretsManagerSecretId;
    }

    /**
     * <p>
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the Amazon
     * Redshift endpoint connection details.
     * </p>
     * 
     * @param secretsManagerSecretId
     *        The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the
     *        Amazon Redshift endpoint connection details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSettings withSecretsManagerSecretId(String secretsManagerSecretId) {
        setSecretsManagerSecretId(secretsManagerSecretId);
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
        if (getAcceptAnyDate() != null)
            sb.append("AcceptAnyDate: ").append(getAcceptAnyDate()).append(",");
        if (getAfterConnectScript() != null)
            sb.append("AfterConnectScript: ").append(getAfterConnectScript()).append(",");
        if (getBucketFolder() != null)
            sb.append("BucketFolder: ").append(getBucketFolder()).append(",");
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getCaseSensitiveNames() != null)
            sb.append("CaseSensitiveNames: ").append(getCaseSensitiveNames()).append(",");
        if (getCompUpdate() != null)
            sb.append("CompUpdate: ").append(getCompUpdate()).append(",");
        if (getConnectionTimeout() != null)
            sb.append("ConnectionTimeout: ").append(getConnectionTimeout()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getDateFormat() != null)
            sb.append("DateFormat: ").append(getDateFormat()).append(",");
        if (getEmptyAsNull() != null)
            sb.append("EmptyAsNull: ").append(getEmptyAsNull()).append(",");
        if (getEncryptionMode() != null)
            sb.append("EncryptionMode: ").append(getEncryptionMode()).append(",");
        if (getExplicitIds() != null)
            sb.append("ExplicitIds: ").append(getExplicitIds()).append(",");
        if (getFileTransferUploadStreams() != null)
            sb.append("FileTransferUploadStreams: ").append(getFileTransferUploadStreams()).append(",");
        if (getLoadTimeout() != null)
            sb.append("LoadTimeout: ").append(getLoadTimeout()).append(",");
        if (getMaxFileSize() != null)
            sb.append("MaxFileSize: ").append(getMaxFileSize()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getRemoveQuotes() != null)
            sb.append("RemoveQuotes: ").append(getRemoveQuotes()).append(",");
        if (getReplaceInvalidChars() != null)
            sb.append("ReplaceInvalidChars: ").append(getReplaceInvalidChars()).append(",");
        if (getReplaceChars() != null)
            sb.append("ReplaceChars: ").append(getReplaceChars()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getServiceAccessRoleArn() != null)
            sb.append("ServiceAccessRoleArn: ").append(getServiceAccessRoleArn()).append(",");
        if (getServerSideEncryptionKmsKeyId() != null)
            sb.append("ServerSideEncryptionKmsKeyId: ").append(getServerSideEncryptionKmsKeyId()).append(",");
        if (getTimeFormat() != null)
            sb.append("TimeFormat: ").append(getTimeFormat()).append(",");
        if (getTrimBlanks() != null)
            sb.append("TrimBlanks: ").append(getTrimBlanks()).append(",");
        if (getTruncateColumns() != null)
            sb.append("TruncateColumns: ").append(getTruncateColumns()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getWriteBufferSize() != null)
            sb.append("WriteBufferSize: ").append(getWriteBufferSize()).append(",");
        if (getSecretsManagerAccessRoleArn() != null)
            sb.append("SecretsManagerAccessRoleArn: ").append(getSecretsManagerAccessRoleArn()).append(",");
        if (getSecretsManagerSecretId() != null)
            sb.append("SecretsManagerSecretId: ").append(getSecretsManagerSecretId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftSettings == false)
            return false;
        RedshiftSettings other = (RedshiftSettings) obj;
        if (other.getAcceptAnyDate() == null ^ this.getAcceptAnyDate() == null)
            return false;
        if (other.getAcceptAnyDate() != null && other.getAcceptAnyDate().equals(this.getAcceptAnyDate()) == false)
            return false;
        if (other.getAfterConnectScript() == null ^ this.getAfterConnectScript() == null)
            return false;
        if (other.getAfterConnectScript() != null && other.getAfterConnectScript().equals(this.getAfterConnectScript()) == false)
            return false;
        if (other.getBucketFolder() == null ^ this.getBucketFolder() == null)
            return false;
        if (other.getBucketFolder() != null && other.getBucketFolder().equals(this.getBucketFolder()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getCaseSensitiveNames() == null ^ this.getCaseSensitiveNames() == null)
            return false;
        if (other.getCaseSensitiveNames() != null && other.getCaseSensitiveNames().equals(this.getCaseSensitiveNames()) == false)
            return false;
        if (other.getCompUpdate() == null ^ this.getCompUpdate() == null)
            return false;
        if (other.getCompUpdate() != null && other.getCompUpdate().equals(this.getCompUpdate()) == false)
            return false;
        if (other.getConnectionTimeout() == null ^ this.getConnectionTimeout() == null)
            return false;
        if (other.getConnectionTimeout() != null && other.getConnectionTimeout().equals(this.getConnectionTimeout()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getDateFormat() == null ^ this.getDateFormat() == null)
            return false;
        if (other.getDateFormat() != null && other.getDateFormat().equals(this.getDateFormat()) == false)
            return false;
        if (other.getEmptyAsNull() == null ^ this.getEmptyAsNull() == null)
            return false;
        if (other.getEmptyAsNull() != null && other.getEmptyAsNull().equals(this.getEmptyAsNull()) == false)
            return false;
        if (other.getEncryptionMode() == null ^ this.getEncryptionMode() == null)
            return false;
        if (other.getEncryptionMode() != null && other.getEncryptionMode().equals(this.getEncryptionMode()) == false)
            return false;
        if (other.getExplicitIds() == null ^ this.getExplicitIds() == null)
            return false;
        if (other.getExplicitIds() != null && other.getExplicitIds().equals(this.getExplicitIds()) == false)
            return false;
        if (other.getFileTransferUploadStreams() == null ^ this.getFileTransferUploadStreams() == null)
            return false;
        if (other.getFileTransferUploadStreams() != null && other.getFileTransferUploadStreams().equals(this.getFileTransferUploadStreams()) == false)
            return false;
        if (other.getLoadTimeout() == null ^ this.getLoadTimeout() == null)
            return false;
        if (other.getLoadTimeout() != null && other.getLoadTimeout().equals(this.getLoadTimeout()) == false)
            return false;
        if (other.getMaxFileSize() == null ^ this.getMaxFileSize() == null)
            return false;
        if (other.getMaxFileSize() != null && other.getMaxFileSize().equals(this.getMaxFileSize()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getRemoveQuotes() == null ^ this.getRemoveQuotes() == null)
            return false;
        if (other.getRemoveQuotes() != null && other.getRemoveQuotes().equals(this.getRemoveQuotes()) == false)
            return false;
        if (other.getReplaceInvalidChars() == null ^ this.getReplaceInvalidChars() == null)
            return false;
        if (other.getReplaceInvalidChars() != null && other.getReplaceInvalidChars().equals(this.getReplaceInvalidChars()) == false)
            return false;
        if (other.getReplaceChars() == null ^ this.getReplaceChars() == null)
            return false;
        if (other.getReplaceChars() != null && other.getReplaceChars().equals(this.getReplaceChars()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getServiceAccessRoleArn() == null ^ this.getServiceAccessRoleArn() == null)
            return false;
        if (other.getServiceAccessRoleArn() != null && other.getServiceAccessRoleArn().equals(this.getServiceAccessRoleArn()) == false)
            return false;
        if (other.getServerSideEncryptionKmsKeyId() == null ^ this.getServerSideEncryptionKmsKeyId() == null)
            return false;
        if (other.getServerSideEncryptionKmsKeyId() != null && other.getServerSideEncryptionKmsKeyId().equals(this.getServerSideEncryptionKmsKeyId()) == false)
            return false;
        if (other.getTimeFormat() == null ^ this.getTimeFormat() == null)
            return false;
        if (other.getTimeFormat() != null && other.getTimeFormat().equals(this.getTimeFormat()) == false)
            return false;
        if (other.getTrimBlanks() == null ^ this.getTrimBlanks() == null)
            return false;
        if (other.getTrimBlanks() != null && other.getTrimBlanks().equals(this.getTrimBlanks()) == false)
            return false;
        if (other.getTruncateColumns() == null ^ this.getTruncateColumns() == null)
            return false;
        if (other.getTruncateColumns() != null && other.getTruncateColumns().equals(this.getTruncateColumns()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getWriteBufferSize() == null ^ this.getWriteBufferSize() == null)
            return false;
        if (other.getWriteBufferSize() != null && other.getWriteBufferSize().equals(this.getWriteBufferSize()) == false)
            return false;
        if (other.getSecretsManagerAccessRoleArn() == null ^ this.getSecretsManagerAccessRoleArn() == null)
            return false;
        if (other.getSecretsManagerAccessRoleArn() != null && other.getSecretsManagerAccessRoleArn().equals(this.getSecretsManagerAccessRoleArn()) == false)
            return false;
        if (other.getSecretsManagerSecretId() == null ^ this.getSecretsManagerSecretId() == null)
            return false;
        if (other.getSecretsManagerSecretId() != null && other.getSecretsManagerSecretId().equals(this.getSecretsManagerSecretId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptAnyDate() == null) ? 0 : getAcceptAnyDate().hashCode());
        hashCode = prime * hashCode + ((getAfterConnectScript() == null) ? 0 : getAfterConnectScript().hashCode());
        hashCode = prime * hashCode + ((getBucketFolder() == null) ? 0 : getBucketFolder().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getCaseSensitiveNames() == null) ? 0 : getCaseSensitiveNames().hashCode());
        hashCode = prime * hashCode + ((getCompUpdate() == null) ? 0 : getCompUpdate().hashCode());
        hashCode = prime * hashCode + ((getConnectionTimeout() == null) ? 0 : getConnectionTimeout().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getDateFormat() == null) ? 0 : getDateFormat().hashCode());
        hashCode = prime * hashCode + ((getEmptyAsNull() == null) ? 0 : getEmptyAsNull().hashCode());
        hashCode = prime * hashCode + ((getEncryptionMode() == null) ? 0 : getEncryptionMode().hashCode());
        hashCode = prime * hashCode + ((getExplicitIds() == null) ? 0 : getExplicitIds().hashCode());
        hashCode = prime * hashCode + ((getFileTransferUploadStreams() == null) ? 0 : getFileTransferUploadStreams().hashCode());
        hashCode = prime * hashCode + ((getLoadTimeout() == null) ? 0 : getLoadTimeout().hashCode());
        hashCode = prime * hashCode + ((getMaxFileSize() == null) ? 0 : getMaxFileSize().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getRemoveQuotes() == null) ? 0 : getRemoveQuotes().hashCode());
        hashCode = prime * hashCode + ((getReplaceInvalidChars() == null) ? 0 : getReplaceInvalidChars().hashCode());
        hashCode = prime * hashCode + ((getReplaceChars() == null) ? 0 : getReplaceChars().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryptionKmsKeyId() == null) ? 0 : getServerSideEncryptionKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTimeFormat() == null) ? 0 : getTimeFormat().hashCode());
        hashCode = prime * hashCode + ((getTrimBlanks() == null) ? 0 : getTrimBlanks().hashCode());
        hashCode = prime * hashCode + ((getTruncateColumns() == null) ? 0 : getTruncateColumns().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getWriteBufferSize() == null) ? 0 : getWriteBufferSize().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerAccessRoleArn() == null) ? 0 : getSecretsManagerAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerSecretId() == null) ? 0 : getSecretsManagerSecretId().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftSettings clone() {
        try {
            return (RedshiftSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.RedshiftSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
