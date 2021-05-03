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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * UpdateSMBFileShareInput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateSMBFileShare" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSMBFileShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SMB file share that you want to update.
     * </p>
     */
    private String fileShareARN;
    /**
     * <p>
     * Set to <code>true</code> to use Amazon S3 server-side encryption with your own AWS KMS key, or <code>false</code>
     * to use a key managed by Amazon S3. Optional.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean kMSEncrypted;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side
     * encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when
     * <code>KMSEncrypted</code> is <code>true</code>. Optional.
     * </p>
     */
    private String kMSKey;
    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by the file gateway. The default value is
     * <code>S3_INTELLIGENT_TIERING</code>. Optional.
     * </p>
     * <p>
     * Valid Values: <code>S3_STANDARD</code> | <code>S3_INTELLIGENT_TIERING</code> | <code>S3_STANDARD_IA</code> |
     * <code>S3_ONEZONE_IA</code>
     * </p>
     */
    private String defaultStorageClass;
    /**
     * <p>
     * A value that sets the access control list (ACL) permission for objects in the S3 bucket that a file gateway puts
     * objects into. The default value is <code>private</code>.
     * </p>
     */
    private String objectACL;
    /**
     * <p>
     * A value that sets the write status of a file share. Set this value to <code>true</code> to set write status to
     * read-only, otherwise set to <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean readOnly;
    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to
     * <code>true</code> to enable MIME type guessing, otherwise set to <code>false</code>. The default value is
     * <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean guessMIMETypeEnabled;
    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket.
     * If this value is set to <code>true</code>, the requester pays the costs; otherwise, the S3 bucket owner pays.
     * However, the S3 bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure that the
     * configuration on the file share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean requesterPays;
    /**
     * <p>
     * Set this value to <code>true</code> to enable access control list (ACL) on the SMB file share. Set it to
     * <code>false</code> to map file and directory permissions to the POSIX permissions.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html">Using Microsoft Windows ACLs to
     * control access to an SMB file share</a> in the <i>AWS Storage Gateway User Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean sMBACLEnabled;
    /**
     * <p>
     * The files and folders on this share will only be visible to users with read access.
     * </p>
     */
    private Boolean accessBasedEnumeration;
    /**
     * <p>
     * A list of users or groups in the Active Directory that have administrator rights to the file share. A group must
     * be prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>, <code>user1</code>,
     * <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> adminUserList;
    /**
     * <p>
     * A list of users or groups in the Active Directory that are allowed to access the file share. A group must be
     * prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>, <code>user1</code>,
     * <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> validUserList;
    /**
     * <p>
     * A list of users or groups in the Active Directory that are not allowed to access the file share. A group must be
     * prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>, <code>user1</code>,
     * <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> invalidUserList;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage used for audit logs.
     * </p>
     */
    private String auditDestinationARN;
    /**
     * <p>
     * The case of an object name in an Amazon S3 bucket. For <code>ClientSpecified</code>, the client determines the
     * case sensitivity. For <code>CaseSensitive</code>, the gateway determines the case sensitivity. The default value
     * is <code>ClientSpecified</code>.
     * </p>
     */
    private String caseSensitivity;
    /**
     * <p>
     * The name of the file share. Optional.
     * </p>
     * <note>
     * <p>
     * <code>FileShareName</code> must be set if an S3 prefix name is set in <code>LocationARN</code>.
     * </p>
     * </note>
     */
    private String fileShareName;
    /**
     * <p>
     * Specifies refresh cache information for the file share.
     * </p>
     */
    private CacheAttributes cacheAttributes;
    /**
     * <p>
     * The notification policy of the file share. <code>SettlingTimeInSeconds</code> controls the number of seconds to
     * wait after the last point in time a client wrote to a file before generating an <code>ObjectUploaded</code>
     * notification. Because clients can make many small writes to files, it's best to set this parameter for as long as
     * possible to avoid generating multiple notifications for the same file in a small time period.
     * </p>
     * <note>
     * <p>
     * <code>SettlingTimeInSeconds</code> has no effect on the timing of the object uploading to Amazon S3, only the
     * timing of the notification.
     * </p>
     * </note>
     * <p>
     * The following example sets <code>NotificationPolicy</code> on with <code>SettlingTimeInSeconds</code> set to 60.
     * </p>
     * <p>
     * <code>{\"Upload\": {\"SettlingTimeInSeconds\": 60}}</code>
     * </p>
     * <p>
     * The following example sets <code>NotificationPolicy</code> off.
     * </p>
     * <p>
     * <code>{}</code>
     * </p>
     */
    private String notificationPolicy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SMB file share that you want to update.
     * </p>
     * 
     * @param fileShareARN
     *        The Amazon Resource Name (ARN) of the SMB file share that you want to update.
     */

    public void setFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SMB file share that you want to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SMB file share that you want to update.
     */

    public String getFileShareARN() {
        return this.fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SMB file share that you want to update.
     * </p>
     * 
     * @param fileShareARN
     *        The Amazon Resource Name (ARN) of the SMB file share that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withFileShareARN(String fileShareARN) {
        setFileShareARN(fileShareARN);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to use Amazon S3 server-side encryption with your own AWS KMS key, or <code>false</code>
     * to use a key managed by Amazon S3. Optional.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param kMSEncrypted
     *        Set to <code>true</code> to use Amazon S3 server-side encryption with your own AWS KMS key, or
     *        <code>false</code> to use a key managed by Amazon S3. Optional.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     */

    public void setKMSEncrypted(Boolean kMSEncrypted) {
        this.kMSEncrypted = kMSEncrypted;
    }

    /**
     * <p>
     * Set to <code>true</code> to use Amazon S3 server-side encryption with your own AWS KMS key, or <code>false</code>
     * to use a key managed by Amazon S3. Optional.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return Set to <code>true</code> to use Amazon S3 server-side encryption with your own AWS KMS key, or
     *         <code>false</code> to use a key managed by Amazon S3. Optional.</p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean getKMSEncrypted() {
        return this.kMSEncrypted;
    }

    /**
     * <p>
     * Set to <code>true</code> to use Amazon S3 server-side encryption with your own AWS KMS key, or <code>false</code>
     * to use a key managed by Amazon S3. Optional.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param kMSEncrypted
     *        Set to <code>true</code> to use Amazon S3 server-side encryption with your own AWS KMS key, or
     *        <code>false</code> to use a key managed by Amazon S3. Optional.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withKMSEncrypted(Boolean kMSEncrypted) {
        setKMSEncrypted(kMSEncrypted);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to use Amazon S3 server-side encryption with your own AWS KMS key, or <code>false</code>
     * to use a key managed by Amazon S3. Optional.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return Set to <code>true</code> to use Amazon S3 server-side encryption with your own AWS KMS key, or
     *         <code>false</code> to use a key managed by Amazon S3. Optional.</p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean isKMSEncrypted() {
        return this.kMSEncrypted;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side
     * encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when
     * <code>KMSEncrypted</code> is <code>true</code>. Optional.
     * </p>
     * 
     * @param kMSKey
     *        The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side
     *        encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when
     *        <code>KMSEncrypted</code> is <code>true</code>. Optional.
     */

    public void setKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side
     * encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when
     * <code>KMSEncrypted</code> is <code>true</code>. Optional.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side
     *         encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when
     *         <code>KMSEncrypted</code> is <code>true</code>. Optional.
     */

    public String getKMSKey() {
        return this.kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side
     * encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when
     * <code>KMSEncrypted</code> is <code>true</code>. Optional.
     * </p>
     * 
     * @param kMSKey
     *        The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side
     *        encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when
     *        <code>KMSEncrypted</code> is <code>true</code>. Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withKMSKey(String kMSKey) {
        setKMSKey(kMSKey);
        return this;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by the file gateway. The default value is
     * <code>S3_INTELLIGENT_TIERING</code>. Optional.
     * </p>
     * <p>
     * Valid Values: <code>S3_STANDARD</code> | <code>S3_INTELLIGENT_TIERING</code> | <code>S3_STANDARD_IA</code> |
     * <code>S3_ONEZONE_IA</code>
     * </p>
     * 
     * @param defaultStorageClass
     *        The default storage class for objects put into an Amazon S3 bucket by the file gateway. The default value
     *        is <code>S3_INTELLIGENT_TIERING</code>. Optional.</p>
     *        <p>
     *        Valid Values: <code>S3_STANDARD</code> | <code>S3_INTELLIGENT_TIERING</code> | <code>S3_STANDARD_IA</code>
     *        | <code>S3_ONEZONE_IA</code>
     */

    public void setDefaultStorageClass(String defaultStorageClass) {
        this.defaultStorageClass = defaultStorageClass;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by the file gateway. The default value is
     * <code>S3_INTELLIGENT_TIERING</code>. Optional.
     * </p>
     * <p>
     * Valid Values: <code>S3_STANDARD</code> | <code>S3_INTELLIGENT_TIERING</code> | <code>S3_STANDARD_IA</code> |
     * <code>S3_ONEZONE_IA</code>
     * </p>
     * 
     * @return The default storage class for objects put into an Amazon S3 bucket by the file gateway. The default value
     *         is <code>S3_INTELLIGENT_TIERING</code>. Optional.</p>
     *         <p>
     *         Valid Values: <code>S3_STANDARD</code> | <code>S3_INTELLIGENT_TIERING</code> |
     *         <code>S3_STANDARD_IA</code> | <code>S3_ONEZONE_IA</code>
     */

    public String getDefaultStorageClass() {
        return this.defaultStorageClass;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by the file gateway. The default value is
     * <code>S3_INTELLIGENT_TIERING</code>. Optional.
     * </p>
     * <p>
     * Valid Values: <code>S3_STANDARD</code> | <code>S3_INTELLIGENT_TIERING</code> | <code>S3_STANDARD_IA</code> |
     * <code>S3_ONEZONE_IA</code>
     * </p>
     * 
     * @param defaultStorageClass
     *        The default storage class for objects put into an Amazon S3 bucket by the file gateway. The default value
     *        is <code>S3_INTELLIGENT_TIERING</code>. Optional.</p>
     *        <p>
     *        Valid Values: <code>S3_STANDARD</code> | <code>S3_INTELLIGENT_TIERING</code> | <code>S3_STANDARD_IA</code>
     *        | <code>S3_ONEZONE_IA</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withDefaultStorageClass(String defaultStorageClass) {
        setDefaultStorageClass(defaultStorageClass);
        return this;
    }

    /**
     * <p>
     * A value that sets the access control list (ACL) permission for objects in the S3 bucket that a file gateway puts
     * objects into. The default value is <code>private</code>.
     * </p>
     * 
     * @param objectACL
     *        A value that sets the access control list (ACL) permission for objects in the S3 bucket that a file
     *        gateway puts objects into. The default value is <code>private</code>.
     * @see ObjectACL
     */

    public void setObjectACL(String objectACL) {
        this.objectACL = objectACL;
    }

    /**
     * <p>
     * A value that sets the access control list (ACL) permission for objects in the S3 bucket that a file gateway puts
     * objects into. The default value is <code>private</code>.
     * </p>
     * 
     * @return A value that sets the access control list (ACL) permission for objects in the S3 bucket that a file
     *         gateway puts objects into. The default value is <code>private</code>.
     * @see ObjectACL
     */

    public String getObjectACL() {
        return this.objectACL;
    }

    /**
     * <p>
     * A value that sets the access control list (ACL) permission for objects in the S3 bucket that a file gateway puts
     * objects into. The default value is <code>private</code>.
     * </p>
     * 
     * @param objectACL
     *        A value that sets the access control list (ACL) permission for objects in the S3 bucket that a file
     *        gateway puts objects into. The default value is <code>private</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectACL
     */

    public UpdateSMBFileShareRequest withObjectACL(String objectACL) {
        setObjectACL(objectACL);
        return this;
    }

    /**
     * <p>
     * A value that sets the access control list (ACL) permission for objects in the S3 bucket that a file gateway puts
     * objects into. The default value is <code>private</code>.
     * </p>
     * 
     * @param objectACL
     *        A value that sets the access control list (ACL) permission for objects in the S3 bucket that a file
     *        gateway puts objects into. The default value is <code>private</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectACL
     */

    public UpdateSMBFileShareRequest withObjectACL(ObjectACL objectACL) {
        this.objectACL = objectACL.toString();
        return this;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. Set this value to <code>true</code> to set write status to
     * read-only, otherwise set to <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param readOnly
     *        A value that sets the write status of a file share. Set this value to <code>true</code> to set write
     *        status to read-only, otherwise set to <code>false</code>.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     */

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. Set this value to <code>true</code> to set write status to
     * read-only, otherwise set to <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A value that sets the write status of a file share. Set this value to <code>true</code> to set write
     *         status to read-only, otherwise set to <code>false</code>.</p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. Set this value to <code>true</code> to set write status to
     * read-only, otherwise set to <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param readOnly
     *        A value that sets the write status of a file share. Set this value to <code>true</code> to set write
     *        status to read-only, otherwise set to <code>false</code>.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withReadOnly(Boolean readOnly) {
        setReadOnly(readOnly);
        return this;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. Set this value to <code>true</code> to set write status to
     * read-only, otherwise set to <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A value that sets the write status of a file share. Set this value to <code>true</code> to set write
     *         status to read-only, otherwise set to <code>false</code>.</p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean isReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to
     * <code>true</code> to enable MIME type guessing, otherwise set to <code>false</code>. The default value is
     * <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param guessMIMETypeEnabled
     *        A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this
     *        value to <code>true</code> to enable MIME type guessing, otherwise set to <code>false</code>. The default
     *        value is <code>true</code>.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     */

    public void setGuessMIMETypeEnabled(Boolean guessMIMETypeEnabled) {
        this.guessMIMETypeEnabled = guessMIMETypeEnabled;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to
     * <code>true</code> to enable MIME type guessing, otherwise set to <code>false</code>. The default value is
     * <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this
     *         value to <code>true</code> to enable MIME type guessing, otherwise set to <code>false</code>. The default
     *         value is <code>true</code>.</p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean getGuessMIMETypeEnabled() {
        return this.guessMIMETypeEnabled;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to
     * <code>true</code> to enable MIME type guessing, otherwise set to <code>false</code>. The default value is
     * <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param guessMIMETypeEnabled
     *        A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this
     *        value to <code>true</code> to enable MIME type guessing, otherwise set to <code>false</code>. The default
     *        value is <code>true</code>.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withGuessMIMETypeEnabled(Boolean guessMIMETypeEnabled) {
        setGuessMIMETypeEnabled(guessMIMETypeEnabled);
        return this;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to
     * <code>true</code> to enable MIME type guessing, otherwise set to <code>false</code>. The default value is
     * <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this
     *         value to <code>true</code> to enable MIME type guessing, otherwise set to <code>false</code>. The default
     *         value is <code>true</code>.</p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean isGuessMIMETypeEnabled() {
        return this.guessMIMETypeEnabled;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket.
     * If this value is set to <code>true</code>, the requester pays the costs; otherwise, the S3 bucket owner pays.
     * However, the S3 bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure that the
     * configuration on the file share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param requesterPays
     *        A value that sets who pays the cost of the request and the cost associated with data download from the S3
     *        bucket. If this value is set to <code>true</code>, the requester pays the costs; otherwise, the S3 bucket
     *        owner pays. However, the S3 bucket owner always pays the cost of storing data.</p> <note>
     *        <p>
     *        <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure
     *        that the configuration on the file share is the same as the S3 bucket configuration.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     */

    public void setRequesterPays(Boolean requesterPays) {
        this.requesterPays = requesterPays;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket.
     * If this value is set to <code>true</code>, the requester pays the costs; otherwise, the S3 bucket owner pays.
     * However, the S3 bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure that the
     * configuration on the file share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A value that sets who pays the cost of the request and the cost associated with data download from the S3
     *         bucket. If this value is set to <code>true</code>, the requester pays the costs; otherwise, the S3 bucket
     *         owner pays. However, the S3 bucket owner always pays the cost of storing data.</p> <note>
     *         <p>
     *         <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure
     *         that the configuration on the file share is the same as the S3 bucket configuration.
     *         </p>
     *         </note>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean getRequesterPays() {
        return this.requesterPays;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket.
     * If this value is set to <code>true</code>, the requester pays the costs; otherwise, the S3 bucket owner pays.
     * However, the S3 bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure that the
     * configuration on the file share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param requesterPays
     *        A value that sets who pays the cost of the request and the cost associated with data download from the S3
     *        bucket. If this value is set to <code>true</code>, the requester pays the costs; otherwise, the S3 bucket
     *        owner pays. However, the S3 bucket owner always pays the cost of storing data.</p> <note>
     *        <p>
     *        <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure
     *        that the configuration on the file share is the same as the S3 bucket configuration.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withRequesterPays(Boolean requesterPays) {
        setRequesterPays(requesterPays);
        return this;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket.
     * If this value is set to <code>true</code>, the requester pays the costs; otherwise, the S3 bucket owner pays.
     * However, the S3 bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure that the
     * configuration on the file share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A value that sets who pays the cost of the request and the cost associated with data download from the S3
     *         bucket. If this value is set to <code>true</code>, the requester pays the costs; otherwise, the S3 bucket
     *         owner pays. However, the S3 bucket owner always pays the cost of storing data.</p> <note>
     *         <p>
     *         <code>RequesterPays</code> is a configuration for the S3 bucket that backs the file share, so make sure
     *         that the configuration on the file share is the same as the S3 bucket configuration.
     *         </p>
     *         </note>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean isRequesterPays() {
        return this.requesterPays;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to enable access control list (ACL) on the SMB file share. Set it to
     * <code>false</code> to map file and directory permissions to the POSIX permissions.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html">Using Microsoft Windows ACLs to
     * control access to an SMB file share</a> in the <i>AWS Storage Gateway User Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param sMBACLEnabled
     *        Set this value to <code>true</code> to enable access control list (ACL) on the SMB file share. Set it to
     *        <code>false</code> to map file and directory permissions to the POSIX permissions.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html">Using Microsoft Windows
     *        ACLs to control access to an SMB file share</a> in the <i>AWS Storage Gateway User Guide</i>.
     *        </p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     */

    public void setSMBACLEnabled(Boolean sMBACLEnabled) {
        this.sMBACLEnabled = sMBACLEnabled;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to enable access control list (ACL) on the SMB file share. Set it to
     * <code>false</code> to map file and directory permissions to the POSIX permissions.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html">Using Microsoft Windows ACLs to
     * control access to an SMB file share</a> in the <i>AWS Storage Gateway User Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return Set this value to <code>true</code> to enable access control list (ACL) on the SMB file share. Set it to
     *         <code>false</code> to map file and directory permissions to the POSIX permissions.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html">Using Microsoft Windows
     *         ACLs to control access to an SMB file share</a> in the <i>AWS Storage Gateway User Guide</i>.
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean getSMBACLEnabled() {
        return this.sMBACLEnabled;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to enable access control list (ACL) on the SMB file share. Set it to
     * <code>false</code> to map file and directory permissions to the POSIX permissions.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html">Using Microsoft Windows ACLs to
     * control access to an SMB file share</a> in the <i>AWS Storage Gateway User Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param sMBACLEnabled
     *        Set this value to <code>true</code> to enable access control list (ACL) on the SMB file share. Set it to
     *        <code>false</code> to map file and directory permissions to the POSIX permissions.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html">Using Microsoft Windows
     *        ACLs to control access to an SMB file share</a> in the <i>AWS Storage Gateway User Guide</i>.
     *        </p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withSMBACLEnabled(Boolean sMBACLEnabled) {
        setSMBACLEnabled(sMBACLEnabled);
        return this;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to enable access control list (ACL) on the SMB file share. Set it to
     * <code>false</code> to map file and directory permissions to the POSIX permissions.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html">Using Microsoft Windows ACLs to
     * control access to an SMB file share</a> in the <i>AWS Storage Gateway User Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return Set this value to <code>true</code> to enable access control list (ACL) on the SMB file share. Set it to
     *         <code>false</code> to map file and directory permissions to the POSIX permissions.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html">Using Microsoft Windows
     *         ACLs to control access to an SMB file share</a> in the <i>AWS Storage Gateway User Guide</i>.
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean isSMBACLEnabled() {
        return this.sMBACLEnabled;
    }

    /**
     * <p>
     * The files and folders on this share will only be visible to users with read access.
     * </p>
     * 
     * @param accessBasedEnumeration
     *        The files and folders on this share will only be visible to users with read access.
     */

    public void setAccessBasedEnumeration(Boolean accessBasedEnumeration) {
        this.accessBasedEnumeration = accessBasedEnumeration;
    }

    /**
     * <p>
     * The files and folders on this share will only be visible to users with read access.
     * </p>
     * 
     * @return The files and folders on this share will only be visible to users with read access.
     */

    public Boolean getAccessBasedEnumeration() {
        return this.accessBasedEnumeration;
    }

    /**
     * <p>
     * The files and folders on this share will only be visible to users with read access.
     * </p>
     * 
     * @param accessBasedEnumeration
     *        The files and folders on this share will only be visible to users with read access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withAccessBasedEnumeration(Boolean accessBasedEnumeration) {
        setAccessBasedEnumeration(accessBasedEnumeration);
        return this;
    }

    /**
     * <p>
     * The files and folders on this share will only be visible to users with read access.
     * </p>
     * 
     * @return The files and folders on this share will only be visible to users with read access.
     */

    public Boolean isAccessBasedEnumeration() {
        return this.accessBasedEnumeration;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that have administrator rights to the file share. A group must
     * be prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>, <code>user1</code>,
     * <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * 
     * @return A list of users or groups in the Active Directory that have administrator rights to the file share. A
     *         group must be prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>,
     *         <code>user1</code>, <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if
     *         Authentication is set to <code>ActiveDirectory</code>.
     */

    public java.util.List<String> getAdminUserList() {
        if (adminUserList == null) {
            adminUserList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return adminUserList;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that have administrator rights to the file share. A group must
     * be prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>, <code>user1</code>,
     * <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * 
     * @param adminUserList
     *        A list of users or groups in the Active Directory that have administrator rights to the file share. A
     *        group must be prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>,
     *        <code>user1</code>, <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if
     *        Authentication is set to <code>ActiveDirectory</code>.
     */

    public void setAdminUserList(java.util.Collection<String> adminUserList) {
        if (adminUserList == null) {
            this.adminUserList = null;
            return;
        }

        this.adminUserList = new com.amazonaws.internal.SdkInternalList<String>(adminUserList);
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that have administrator rights to the file share. A group must
     * be prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>, <code>user1</code>,
     * <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdminUserList(java.util.Collection)} or {@link #withAdminUserList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param adminUserList
     *        A list of users or groups in the Active Directory that have administrator rights to the file share. A
     *        group must be prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>,
     *        <code>user1</code>, <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if
     *        Authentication is set to <code>ActiveDirectory</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withAdminUserList(String... adminUserList) {
        if (this.adminUserList == null) {
            setAdminUserList(new com.amazonaws.internal.SdkInternalList<String>(adminUserList.length));
        }
        for (String ele : adminUserList) {
            this.adminUserList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that have administrator rights to the file share. A group must
     * be prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>, <code>user1</code>,
     * <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * 
     * @param adminUserList
     *        A list of users or groups in the Active Directory that have administrator rights to the file share. A
     *        group must be prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>,
     *        <code>user1</code>, <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if
     *        Authentication is set to <code>ActiveDirectory</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withAdminUserList(java.util.Collection<String> adminUserList) {
        setAdminUserList(adminUserList);
        return this;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are allowed to access the file share. A group must be
     * prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>, <code>user1</code>,
     * <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * 
     * @return A list of users or groups in the Active Directory that are allowed to access the file share. A group must
     *         be prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>,
     *         <code>user1</code>, <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if
     *         Authentication is set to <code>ActiveDirectory</code>.
     */

    public java.util.List<String> getValidUserList() {
        if (validUserList == null) {
            validUserList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return validUserList;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are allowed to access the file share. A group must be
     * prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>, <code>user1</code>,
     * <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * 
     * @param validUserList
     *        A list of users or groups in the Active Directory that are allowed to access the file share. A group must
     *        be prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>,
     *        <code>user1</code>, <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if
     *        Authentication is set to <code>ActiveDirectory</code>.
     */

    public void setValidUserList(java.util.Collection<String> validUserList) {
        if (validUserList == null) {
            this.validUserList = null;
            return;
        }

        this.validUserList = new com.amazonaws.internal.SdkInternalList<String>(validUserList);
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are allowed to access the file share. A group must be
     * prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>, <code>user1</code>,
     * <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidUserList(java.util.Collection)} or {@link #withValidUserList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param validUserList
     *        A list of users or groups in the Active Directory that are allowed to access the file share. A group must
     *        be prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>,
     *        <code>user1</code>, <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if
     *        Authentication is set to <code>ActiveDirectory</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withValidUserList(String... validUserList) {
        if (this.validUserList == null) {
            setValidUserList(new com.amazonaws.internal.SdkInternalList<String>(validUserList.length));
        }
        for (String ele : validUserList) {
            this.validUserList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are allowed to access the file share. A group must be
     * prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>, <code>user1</code>,
     * <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * 
     * @param validUserList
     *        A list of users or groups in the Active Directory that are allowed to access the file share. A group must
     *        be prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>,
     *        <code>user1</code>, <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if
     *        Authentication is set to <code>ActiveDirectory</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withValidUserList(java.util.Collection<String> validUserList) {
        setValidUserList(validUserList);
        return this;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are not allowed to access the file share. A group must be
     * prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>, <code>user1</code>,
     * <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * 
     * @return A list of users or groups in the Active Directory that are not allowed to access the file share. A group
     *         must be prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>,
     *         <code>user1</code>, <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if
     *         Authentication is set to <code>ActiveDirectory</code>.
     */

    public java.util.List<String> getInvalidUserList() {
        if (invalidUserList == null) {
            invalidUserList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return invalidUserList;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are not allowed to access the file share. A group must be
     * prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>, <code>user1</code>,
     * <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * 
     * @param invalidUserList
     *        A list of users or groups in the Active Directory that are not allowed to access the file share. A group
     *        must be prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>,
     *        <code>user1</code>, <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if
     *        Authentication is set to <code>ActiveDirectory</code>.
     */

    public void setInvalidUserList(java.util.Collection<String> invalidUserList) {
        if (invalidUserList == null) {
            this.invalidUserList = null;
            return;
        }

        this.invalidUserList = new com.amazonaws.internal.SdkInternalList<String>(invalidUserList);
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are not allowed to access the file share. A group must be
     * prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>, <code>user1</code>,
     * <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvalidUserList(java.util.Collection)} or {@link #withInvalidUserList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param invalidUserList
     *        A list of users or groups in the Active Directory that are not allowed to access the file share. A group
     *        must be prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>,
     *        <code>user1</code>, <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if
     *        Authentication is set to <code>ActiveDirectory</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withInvalidUserList(String... invalidUserList) {
        if (this.invalidUserList == null) {
            setInvalidUserList(new com.amazonaws.internal.SdkInternalList<String>(invalidUserList.length));
        }
        for (String ele : invalidUserList) {
            this.invalidUserList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are not allowed to access the file share. A group must be
     * prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>, <code>user1</code>,
     * <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * 
     * @param invalidUserList
     *        A list of users or groups in the Active Directory that are not allowed to access the file share. A group
     *        must be prefixed with the @ character. Acceptable formats include: <code>DOMAIN\User1</code>,
     *        <code>user1</code>, <code>@group1</code>, and <code>@DOMAIN\group1</code>. Can only be set if
     *        Authentication is set to <code>ActiveDirectory</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withInvalidUserList(java.util.Collection<String> invalidUserList) {
        setInvalidUserList(invalidUserList);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage used for audit logs.
     * </p>
     * 
     * @param auditDestinationARN
     *        The Amazon Resource Name (ARN) of the storage used for audit logs.
     */

    public void setAuditDestinationARN(String auditDestinationARN) {
        this.auditDestinationARN = auditDestinationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage used for audit logs.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the storage used for audit logs.
     */

    public String getAuditDestinationARN() {
        return this.auditDestinationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage used for audit logs.
     * </p>
     * 
     * @param auditDestinationARN
     *        The Amazon Resource Name (ARN) of the storage used for audit logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withAuditDestinationARN(String auditDestinationARN) {
        setAuditDestinationARN(auditDestinationARN);
        return this;
    }

    /**
     * <p>
     * The case of an object name in an Amazon S3 bucket. For <code>ClientSpecified</code>, the client determines the
     * case sensitivity. For <code>CaseSensitive</code>, the gateway determines the case sensitivity. The default value
     * is <code>ClientSpecified</code>.
     * </p>
     * 
     * @param caseSensitivity
     *        The case of an object name in an Amazon S3 bucket. For <code>ClientSpecified</code>, the client determines
     *        the case sensitivity. For <code>CaseSensitive</code>, the gateway determines the case sensitivity. The
     *        default value is <code>ClientSpecified</code>.
     * @see CaseSensitivity
     */

    public void setCaseSensitivity(String caseSensitivity) {
        this.caseSensitivity = caseSensitivity;
    }

    /**
     * <p>
     * The case of an object name in an Amazon S3 bucket. For <code>ClientSpecified</code>, the client determines the
     * case sensitivity. For <code>CaseSensitive</code>, the gateway determines the case sensitivity. The default value
     * is <code>ClientSpecified</code>.
     * </p>
     * 
     * @return The case of an object name in an Amazon S3 bucket. For <code>ClientSpecified</code>, the client
     *         determines the case sensitivity. For <code>CaseSensitive</code>, the gateway determines the case
     *         sensitivity. The default value is <code>ClientSpecified</code>.
     * @see CaseSensitivity
     */

    public String getCaseSensitivity() {
        return this.caseSensitivity;
    }

    /**
     * <p>
     * The case of an object name in an Amazon S3 bucket. For <code>ClientSpecified</code>, the client determines the
     * case sensitivity. For <code>CaseSensitive</code>, the gateway determines the case sensitivity. The default value
     * is <code>ClientSpecified</code>.
     * </p>
     * 
     * @param caseSensitivity
     *        The case of an object name in an Amazon S3 bucket. For <code>ClientSpecified</code>, the client determines
     *        the case sensitivity. For <code>CaseSensitive</code>, the gateway determines the case sensitivity. The
     *        default value is <code>ClientSpecified</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CaseSensitivity
     */

    public UpdateSMBFileShareRequest withCaseSensitivity(String caseSensitivity) {
        setCaseSensitivity(caseSensitivity);
        return this;
    }

    /**
     * <p>
     * The case of an object name in an Amazon S3 bucket. For <code>ClientSpecified</code>, the client determines the
     * case sensitivity. For <code>CaseSensitive</code>, the gateway determines the case sensitivity. The default value
     * is <code>ClientSpecified</code>.
     * </p>
     * 
     * @param caseSensitivity
     *        The case of an object name in an Amazon S3 bucket. For <code>ClientSpecified</code>, the client determines
     *        the case sensitivity. For <code>CaseSensitive</code>, the gateway determines the case sensitivity. The
     *        default value is <code>ClientSpecified</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CaseSensitivity
     */

    public UpdateSMBFileShareRequest withCaseSensitivity(CaseSensitivity caseSensitivity) {
        this.caseSensitivity = caseSensitivity.toString();
        return this;
    }

    /**
     * <p>
     * The name of the file share. Optional.
     * </p>
     * <note>
     * <p>
     * <code>FileShareName</code> must be set if an S3 prefix name is set in <code>LocationARN</code>.
     * </p>
     * </note>
     * 
     * @param fileShareName
     *        The name of the file share. Optional.</p> <note>
     *        <p>
     *        <code>FileShareName</code> must be set if an S3 prefix name is set in <code>LocationARN</code>.
     *        </p>
     */

    public void setFileShareName(String fileShareName) {
        this.fileShareName = fileShareName;
    }

    /**
     * <p>
     * The name of the file share. Optional.
     * </p>
     * <note>
     * <p>
     * <code>FileShareName</code> must be set if an S3 prefix name is set in <code>LocationARN</code>.
     * </p>
     * </note>
     * 
     * @return The name of the file share. Optional.</p> <note>
     *         <p>
     *         <code>FileShareName</code> must be set if an S3 prefix name is set in <code>LocationARN</code>.
     *         </p>
     */

    public String getFileShareName() {
        return this.fileShareName;
    }

    /**
     * <p>
     * The name of the file share. Optional.
     * </p>
     * <note>
     * <p>
     * <code>FileShareName</code> must be set if an S3 prefix name is set in <code>LocationARN</code>.
     * </p>
     * </note>
     * 
     * @param fileShareName
     *        The name of the file share. Optional.</p> <note>
     *        <p>
     *        <code>FileShareName</code> must be set if an S3 prefix name is set in <code>LocationARN</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withFileShareName(String fileShareName) {
        setFileShareName(fileShareName);
        return this;
    }

    /**
     * <p>
     * Specifies refresh cache information for the file share.
     * </p>
     * 
     * @param cacheAttributes
     *        Specifies refresh cache information for the file share.
     */

    public void setCacheAttributes(CacheAttributes cacheAttributes) {
        this.cacheAttributes = cacheAttributes;
    }

    /**
     * <p>
     * Specifies refresh cache information for the file share.
     * </p>
     * 
     * @return Specifies refresh cache information for the file share.
     */

    public CacheAttributes getCacheAttributes() {
        return this.cacheAttributes;
    }

    /**
     * <p>
     * Specifies refresh cache information for the file share.
     * </p>
     * 
     * @param cacheAttributes
     *        Specifies refresh cache information for the file share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withCacheAttributes(CacheAttributes cacheAttributes) {
        setCacheAttributes(cacheAttributes);
        return this;
    }

    /**
     * <p>
     * The notification policy of the file share. <code>SettlingTimeInSeconds</code> controls the number of seconds to
     * wait after the last point in time a client wrote to a file before generating an <code>ObjectUploaded</code>
     * notification. Because clients can make many small writes to files, it's best to set this parameter for as long as
     * possible to avoid generating multiple notifications for the same file in a small time period.
     * </p>
     * <note>
     * <p>
     * <code>SettlingTimeInSeconds</code> has no effect on the timing of the object uploading to Amazon S3, only the
     * timing of the notification.
     * </p>
     * </note>
     * <p>
     * The following example sets <code>NotificationPolicy</code> on with <code>SettlingTimeInSeconds</code> set to 60.
     * </p>
     * <p>
     * <code>{\"Upload\": {\"SettlingTimeInSeconds\": 60}}</code>
     * </p>
     * <p>
     * The following example sets <code>NotificationPolicy</code> off.
     * </p>
     * <p>
     * <code>{}</code>
     * </p>
     * 
     * @param notificationPolicy
     *        The notification policy of the file share. <code>SettlingTimeInSeconds</code> controls the number of
     *        seconds to wait after the last point in time a client wrote to a file before generating an
     *        <code>ObjectUploaded</code> notification. Because clients can make many small writes to files, it's best
     *        to set this parameter for as long as possible to avoid generating multiple notifications for the same file
     *        in a small time period.</p> <note>
     *        <p>
     *        <code>SettlingTimeInSeconds</code> has no effect on the timing of the object uploading to Amazon S3, only
     *        the timing of the notification.
     *        </p>
     *        </note>
     *        <p>
     *        The following example sets <code>NotificationPolicy</code> on with <code>SettlingTimeInSeconds</code> set
     *        to 60.
     *        </p>
     *        <p>
     *        <code>{\"Upload\": {\"SettlingTimeInSeconds\": 60}}</code>
     *        </p>
     *        <p>
     *        The following example sets <code>NotificationPolicy</code> off.
     *        </p>
     *        <p>
     *        <code>{}</code>
     */

    public void setNotificationPolicy(String notificationPolicy) {
        this.notificationPolicy = notificationPolicy;
    }

    /**
     * <p>
     * The notification policy of the file share. <code>SettlingTimeInSeconds</code> controls the number of seconds to
     * wait after the last point in time a client wrote to a file before generating an <code>ObjectUploaded</code>
     * notification. Because clients can make many small writes to files, it's best to set this parameter for as long as
     * possible to avoid generating multiple notifications for the same file in a small time period.
     * </p>
     * <note>
     * <p>
     * <code>SettlingTimeInSeconds</code> has no effect on the timing of the object uploading to Amazon S3, only the
     * timing of the notification.
     * </p>
     * </note>
     * <p>
     * The following example sets <code>NotificationPolicy</code> on with <code>SettlingTimeInSeconds</code> set to 60.
     * </p>
     * <p>
     * <code>{\"Upload\": {\"SettlingTimeInSeconds\": 60}}</code>
     * </p>
     * <p>
     * The following example sets <code>NotificationPolicy</code> off.
     * </p>
     * <p>
     * <code>{}</code>
     * </p>
     * 
     * @return The notification policy of the file share. <code>SettlingTimeInSeconds</code> controls the number of
     *         seconds to wait after the last point in time a client wrote to a file before generating an
     *         <code>ObjectUploaded</code> notification. Because clients can make many small writes to files, it's best
     *         to set this parameter for as long as possible to avoid generating multiple notifications for the same
     *         file in a small time period.</p> <note>
     *         <p>
     *         <code>SettlingTimeInSeconds</code> has no effect on the timing of the object uploading to Amazon S3, only
     *         the timing of the notification.
     *         </p>
     *         </note>
     *         <p>
     *         The following example sets <code>NotificationPolicy</code> on with <code>SettlingTimeInSeconds</code> set
     *         to 60.
     *         </p>
     *         <p>
     *         <code>{\"Upload\": {\"SettlingTimeInSeconds\": 60}}</code>
     *         </p>
     *         <p>
     *         The following example sets <code>NotificationPolicy</code> off.
     *         </p>
     *         <p>
     *         <code>{}</code>
     */

    public String getNotificationPolicy() {
        return this.notificationPolicy;
    }

    /**
     * <p>
     * The notification policy of the file share. <code>SettlingTimeInSeconds</code> controls the number of seconds to
     * wait after the last point in time a client wrote to a file before generating an <code>ObjectUploaded</code>
     * notification. Because clients can make many small writes to files, it's best to set this parameter for as long as
     * possible to avoid generating multiple notifications for the same file in a small time period.
     * </p>
     * <note>
     * <p>
     * <code>SettlingTimeInSeconds</code> has no effect on the timing of the object uploading to Amazon S3, only the
     * timing of the notification.
     * </p>
     * </note>
     * <p>
     * The following example sets <code>NotificationPolicy</code> on with <code>SettlingTimeInSeconds</code> set to 60.
     * </p>
     * <p>
     * <code>{\"Upload\": {\"SettlingTimeInSeconds\": 60}}</code>
     * </p>
     * <p>
     * The following example sets <code>NotificationPolicy</code> off.
     * </p>
     * <p>
     * <code>{}</code>
     * </p>
     * 
     * @param notificationPolicy
     *        The notification policy of the file share. <code>SettlingTimeInSeconds</code> controls the number of
     *        seconds to wait after the last point in time a client wrote to a file before generating an
     *        <code>ObjectUploaded</code> notification. Because clients can make many small writes to files, it's best
     *        to set this parameter for as long as possible to avoid generating multiple notifications for the same file
     *        in a small time period.</p> <note>
     *        <p>
     *        <code>SettlingTimeInSeconds</code> has no effect on the timing of the object uploading to Amazon S3, only
     *        the timing of the notification.
     *        </p>
     *        </note>
     *        <p>
     *        The following example sets <code>NotificationPolicy</code> on with <code>SettlingTimeInSeconds</code> set
     *        to 60.
     *        </p>
     *        <p>
     *        <code>{\"Upload\": {\"SettlingTimeInSeconds\": 60}}</code>
     *        </p>
     *        <p>
     *        The following example sets <code>NotificationPolicy</code> off.
     *        </p>
     *        <p>
     *        <code>{}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareRequest withNotificationPolicy(String notificationPolicy) {
        setNotificationPolicy(notificationPolicy);
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
        if (getFileShareARN() != null)
            sb.append("FileShareARN: ").append(getFileShareARN()).append(",");
        if (getKMSEncrypted() != null)
            sb.append("KMSEncrypted: ").append(getKMSEncrypted()).append(",");
        if (getKMSKey() != null)
            sb.append("KMSKey: ").append(getKMSKey()).append(",");
        if (getDefaultStorageClass() != null)
            sb.append("DefaultStorageClass: ").append(getDefaultStorageClass()).append(",");
        if (getObjectACL() != null)
            sb.append("ObjectACL: ").append(getObjectACL()).append(",");
        if (getReadOnly() != null)
            sb.append("ReadOnly: ").append(getReadOnly()).append(",");
        if (getGuessMIMETypeEnabled() != null)
            sb.append("GuessMIMETypeEnabled: ").append(getGuessMIMETypeEnabled()).append(",");
        if (getRequesterPays() != null)
            sb.append("RequesterPays: ").append(getRequesterPays()).append(",");
        if (getSMBACLEnabled() != null)
            sb.append("SMBACLEnabled: ").append(getSMBACLEnabled()).append(",");
        if (getAccessBasedEnumeration() != null)
            sb.append("AccessBasedEnumeration: ").append(getAccessBasedEnumeration()).append(",");
        if (getAdminUserList() != null)
            sb.append("AdminUserList: ").append(getAdminUserList()).append(",");
        if (getValidUserList() != null)
            sb.append("ValidUserList: ").append(getValidUserList()).append(",");
        if (getInvalidUserList() != null)
            sb.append("InvalidUserList: ").append(getInvalidUserList()).append(",");
        if (getAuditDestinationARN() != null)
            sb.append("AuditDestinationARN: ").append(getAuditDestinationARN()).append(",");
        if (getCaseSensitivity() != null)
            sb.append("CaseSensitivity: ").append(getCaseSensitivity()).append(",");
        if (getFileShareName() != null)
            sb.append("FileShareName: ").append(getFileShareName()).append(",");
        if (getCacheAttributes() != null)
            sb.append("CacheAttributes: ").append(getCacheAttributes()).append(",");
        if (getNotificationPolicy() != null)
            sb.append("NotificationPolicy: ").append(getNotificationPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSMBFileShareRequest == false)
            return false;
        UpdateSMBFileShareRequest other = (UpdateSMBFileShareRequest) obj;
        if (other.getFileShareARN() == null ^ this.getFileShareARN() == null)
            return false;
        if (other.getFileShareARN() != null && other.getFileShareARN().equals(this.getFileShareARN()) == false)
            return false;
        if (other.getKMSEncrypted() == null ^ this.getKMSEncrypted() == null)
            return false;
        if (other.getKMSEncrypted() != null && other.getKMSEncrypted().equals(this.getKMSEncrypted()) == false)
            return false;
        if (other.getKMSKey() == null ^ this.getKMSKey() == null)
            return false;
        if (other.getKMSKey() != null && other.getKMSKey().equals(this.getKMSKey()) == false)
            return false;
        if (other.getDefaultStorageClass() == null ^ this.getDefaultStorageClass() == null)
            return false;
        if (other.getDefaultStorageClass() != null && other.getDefaultStorageClass().equals(this.getDefaultStorageClass()) == false)
            return false;
        if (other.getObjectACL() == null ^ this.getObjectACL() == null)
            return false;
        if (other.getObjectACL() != null && other.getObjectACL().equals(this.getObjectACL()) == false)
            return false;
        if (other.getReadOnly() == null ^ this.getReadOnly() == null)
            return false;
        if (other.getReadOnly() != null && other.getReadOnly().equals(this.getReadOnly()) == false)
            return false;
        if (other.getGuessMIMETypeEnabled() == null ^ this.getGuessMIMETypeEnabled() == null)
            return false;
        if (other.getGuessMIMETypeEnabled() != null && other.getGuessMIMETypeEnabled().equals(this.getGuessMIMETypeEnabled()) == false)
            return false;
        if (other.getRequesterPays() == null ^ this.getRequesterPays() == null)
            return false;
        if (other.getRequesterPays() != null && other.getRequesterPays().equals(this.getRequesterPays()) == false)
            return false;
        if (other.getSMBACLEnabled() == null ^ this.getSMBACLEnabled() == null)
            return false;
        if (other.getSMBACLEnabled() != null && other.getSMBACLEnabled().equals(this.getSMBACLEnabled()) == false)
            return false;
        if (other.getAccessBasedEnumeration() == null ^ this.getAccessBasedEnumeration() == null)
            return false;
        if (other.getAccessBasedEnumeration() != null && other.getAccessBasedEnumeration().equals(this.getAccessBasedEnumeration()) == false)
            return false;
        if (other.getAdminUserList() == null ^ this.getAdminUserList() == null)
            return false;
        if (other.getAdminUserList() != null && other.getAdminUserList().equals(this.getAdminUserList()) == false)
            return false;
        if (other.getValidUserList() == null ^ this.getValidUserList() == null)
            return false;
        if (other.getValidUserList() != null && other.getValidUserList().equals(this.getValidUserList()) == false)
            return false;
        if (other.getInvalidUserList() == null ^ this.getInvalidUserList() == null)
            return false;
        if (other.getInvalidUserList() != null && other.getInvalidUserList().equals(this.getInvalidUserList()) == false)
            return false;
        if (other.getAuditDestinationARN() == null ^ this.getAuditDestinationARN() == null)
            return false;
        if (other.getAuditDestinationARN() != null && other.getAuditDestinationARN().equals(this.getAuditDestinationARN()) == false)
            return false;
        if (other.getCaseSensitivity() == null ^ this.getCaseSensitivity() == null)
            return false;
        if (other.getCaseSensitivity() != null && other.getCaseSensitivity().equals(this.getCaseSensitivity()) == false)
            return false;
        if (other.getFileShareName() == null ^ this.getFileShareName() == null)
            return false;
        if (other.getFileShareName() != null && other.getFileShareName().equals(this.getFileShareName()) == false)
            return false;
        if (other.getCacheAttributes() == null ^ this.getCacheAttributes() == null)
            return false;
        if (other.getCacheAttributes() != null && other.getCacheAttributes().equals(this.getCacheAttributes()) == false)
            return false;
        if (other.getNotificationPolicy() == null ^ this.getNotificationPolicy() == null)
            return false;
        if (other.getNotificationPolicy() != null && other.getNotificationPolicy().equals(this.getNotificationPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileShareARN() == null) ? 0 : getFileShareARN().hashCode());
        hashCode = prime * hashCode + ((getKMSEncrypted() == null) ? 0 : getKMSEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode + ((getDefaultStorageClass() == null) ? 0 : getDefaultStorageClass().hashCode());
        hashCode = prime * hashCode + ((getObjectACL() == null) ? 0 : getObjectACL().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        hashCode = prime * hashCode + ((getGuessMIMETypeEnabled() == null) ? 0 : getGuessMIMETypeEnabled().hashCode());
        hashCode = prime * hashCode + ((getRequesterPays() == null) ? 0 : getRequesterPays().hashCode());
        hashCode = prime * hashCode + ((getSMBACLEnabled() == null) ? 0 : getSMBACLEnabled().hashCode());
        hashCode = prime * hashCode + ((getAccessBasedEnumeration() == null) ? 0 : getAccessBasedEnumeration().hashCode());
        hashCode = prime * hashCode + ((getAdminUserList() == null) ? 0 : getAdminUserList().hashCode());
        hashCode = prime * hashCode + ((getValidUserList() == null) ? 0 : getValidUserList().hashCode());
        hashCode = prime * hashCode + ((getInvalidUserList() == null) ? 0 : getInvalidUserList().hashCode());
        hashCode = prime * hashCode + ((getAuditDestinationARN() == null) ? 0 : getAuditDestinationARN().hashCode());
        hashCode = prime * hashCode + ((getCaseSensitivity() == null) ? 0 : getCaseSensitivity().hashCode());
        hashCode = prime * hashCode + ((getFileShareName() == null) ? 0 : getFileShareName().hashCode());
        hashCode = prime * hashCode + ((getCacheAttributes() == null) ? 0 : getCacheAttributes().hashCode());
        hashCode = prime * hashCode + ((getNotificationPolicy() == null) ? 0 : getNotificationPolicy().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSMBFileShareRequest clone() {
        return (UpdateSMBFileShareRequest) super.clone();
    }

}
