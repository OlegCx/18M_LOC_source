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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Unix file permissions and ownership information assigned, by default, to native S3 objects when file gateway
 * discovers them in S3 buckets. This operation is only supported in file gateways.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/NFSFileShareInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NFSFileShareInfo implements Serializable, Cloneable, StructuredPojo {

    private NFSFileShareDefaults nFSFileShareDefaults;

    private String fileShareARN;

    private String fileShareId;

    private String fileShareStatus;

    private String gatewayARN;
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

    private String kMSKey;

    private String path;

    private String role;

    private String locationARN;
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

    private String objectACL;

    private com.amazonaws.internal.SdkInternalList<String> clientList;

    private String squash;
    /**
     * <p>
     * A value that sets the write status of a file share. Set this value to <code>true</code> to set the write status
     * to read-only, otherwise set to <code>false</code>.
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
     * A list of up to 50 tags assigned to the NFS file share, sorted alphabetically by key name. Each tag is a
     * key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
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
     * Refresh cache information for the file share.
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
     * @param nFSFileShareDefaults
     */

    public void setNFSFileShareDefaults(NFSFileShareDefaults nFSFileShareDefaults) {
        this.nFSFileShareDefaults = nFSFileShareDefaults;
    }

    /**
     * @return
     */

    public NFSFileShareDefaults getNFSFileShareDefaults() {
        return this.nFSFileShareDefaults;
    }

    /**
     * @param nFSFileShareDefaults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withNFSFileShareDefaults(NFSFileShareDefaults nFSFileShareDefaults) {
        setNFSFileShareDefaults(nFSFileShareDefaults);
        return this;
    }

    /**
     * @param fileShareARN
     */

    public void setFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
    }

    /**
     * @return
     */

    public String getFileShareARN() {
        return this.fileShareARN;
    }

    /**
     * @param fileShareARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withFileShareARN(String fileShareARN) {
        setFileShareARN(fileShareARN);
        return this;
    }

    /**
     * @param fileShareId
     */

    public void setFileShareId(String fileShareId) {
        this.fileShareId = fileShareId;
    }

    /**
     * @return
     */

    public String getFileShareId() {
        return this.fileShareId;
    }

    /**
     * @param fileShareId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withFileShareId(String fileShareId) {
        setFileShareId(fileShareId);
        return this;
    }

    /**
     * @param fileShareStatus
     */

    public void setFileShareStatus(String fileShareStatus) {
        this.fileShareStatus = fileShareStatus;
    }

    /**
     * @return
     */

    public String getFileShareStatus() {
        return this.fileShareStatus;
    }

    /**
     * @param fileShareStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withFileShareStatus(String fileShareStatus) {
        setFileShareStatus(fileShareStatus);
        return this;
    }

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
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

    public NFSFileShareInfo withKMSEncrypted(Boolean kMSEncrypted) {
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
     * @param kMSKey
     */

    public void setKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
    }

    /**
     * @return
     */

    public String getKMSKey() {
        return this.kMSKey;
    }

    /**
     * @param kMSKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withKMSKey(String kMSKey) {
        setKMSKey(kMSKey);
        return this;
    }

    /**
     * @param path
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return
     */

    public String getPath() {
        return this.path;
    }

    /**
     * @param path
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * @param role
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return
     */

    public String getRole() {
        return this.role;
    }

    /**
     * @param role
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * @param locationARN
     */

    public void setLocationARN(String locationARN) {
        this.locationARN = locationARN;
    }

    /**
     * @return
     */

    public String getLocationARN() {
        return this.locationARN;
    }

    /**
     * @param locationARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withLocationARN(String locationARN) {
        setLocationARN(locationARN);
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

    public NFSFileShareInfo withDefaultStorageClass(String defaultStorageClass) {
        setDefaultStorageClass(defaultStorageClass);
        return this;
    }

    /**
     * @param objectACL
     * @see ObjectACL
     */

    public void setObjectACL(String objectACL) {
        this.objectACL = objectACL;
    }

    /**
     * @return
     * @see ObjectACL
     */

    public String getObjectACL() {
        return this.objectACL;
    }

    /**
     * @param objectACL
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectACL
     */

    public NFSFileShareInfo withObjectACL(String objectACL) {
        setObjectACL(objectACL);
        return this;
    }

    /**
     * @param objectACL
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectACL
     */

    public NFSFileShareInfo withObjectACL(ObjectACL objectACL) {
        this.objectACL = objectACL.toString();
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getClientList() {
        if (clientList == null) {
            clientList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return clientList;
    }

    /**
     * @param clientList
     */

    public void setClientList(java.util.Collection<String> clientList) {
        if (clientList == null) {
            this.clientList = null;
            return;
        }

        this.clientList = new com.amazonaws.internal.SdkInternalList<String>(clientList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClientList(java.util.Collection)} or {@link #withClientList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param clientList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withClientList(String... clientList) {
        if (this.clientList == null) {
            setClientList(new com.amazonaws.internal.SdkInternalList<String>(clientList.length));
        }
        for (String ele : clientList) {
            this.clientList.add(ele);
        }
        return this;
    }

    /**
     * @param clientList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withClientList(java.util.Collection<String> clientList) {
        setClientList(clientList);
        return this;
    }

    /**
     * @param squash
     */

    public void setSquash(String squash) {
        this.squash = squash;
    }

    /**
     * @return
     */

    public String getSquash() {
        return this.squash;
    }

    /**
     * @param squash
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withSquash(String squash) {
        setSquash(squash);
        return this;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. Set this value to <code>true</code> to set the write status
     * to read-only, otherwise set to <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param readOnly
     *        A value that sets the write status of a file share. Set this value to <code>true</code> to set the write
     *        status to read-only, otherwise set to <code>false</code>.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     */

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. Set this value to <code>true</code> to set the write status
     * to read-only, otherwise set to <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A value that sets the write status of a file share. Set this value to <code>true</code> to set the write
     *         status to read-only, otherwise set to <code>false</code>.</p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. Set this value to <code>true</code> to set the write status
     * to read-only, otherwise set to <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param readOnly
     *        A value that sets the write status of a file share. Set this value to <code>true</code> to set the write
     *        status to read-only, otherwise set to <code>false</code>.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withReadOnly(Boolean readOnly) {
        setReadOnly(readOnly);
        return this;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. Set this value to <code>true</code> to set the write status
     * to read-only, otherwise set to <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A value that sets the write status of a file share. Set this value to <code>true</code> to set the write
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

    public NFSFileShareInfo withGuessMIMETypeEnabled(Boolean guessMIMETypeEnabled) {
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

    public NFSFileShareInfo withRequesterPays(Boolean requesterPays) {
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
     * A list of up to 50 tags assigned to the NFS file share, sorted alphabetically by key name. Each tag is a
     * key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * 
     * @return A list of up to 50 tags assigned to the NFS file share, sorted alphabetically by key name. Each tag is a
     *         key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     *         <code>ListTagsForResource</code> API operation.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the NFS file share, sorted alphabetically by key name. Each tag is a
     * key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags assigned to the NFS file share, sorted alphabetically by key name. Each tag is a
     *        key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     *        <code>ListTagsForResource</code> API operation.
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
     * A list of up to 50 tags assigned to the NFS file share, sorted alphabetically by key name. Each tag is a
     * key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags assigned to the NFS file share, sorted alphabetically by key name. Each tag is a
     *        key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     *        <code>ListTagsForResource</code> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withTags(Tag... tags) {
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
     * A list of up to 50 tags assigned to the NFS file share, sorted alphabetically by key name. Each tag is a
     * key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags assigned to the NFS file share, sorted alphabetically by key name. Each tag is a
     *        key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     *        <code>ListTagsForResource</code> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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

    public NFSFileShareInfo withFileShareName(String fileShareName) {
        setFileShareName(fileShareName);
        return this;
    }

    /**
     * <p>
     * Refresh cache information for the file share.
     * </p>
     * 
     * @param cacheAttributes
     *        Refresh cache information for the file share.
     */

    public void setCacheAttributes(CacheAttributes cacheAttributes) {
        this.cacheAttributes = cacheAttributes;
    }

    /**
     * <p>
     * Refresh cache information for the file share.
     * </p>
     * 
     * @return Refresh cache information for the file share.
     */

    public CacheAttributes getCacheAttributes() {
        return this.cacheAttributes;
    }

    /**
     * <p>
     * Refresh cache information for the file share.
     * </p>
     * 
     * @param cacheAttributes
     *        Refresh cache information for the file share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withCacheAttributes(CacheAttributes cacheAttributes) {
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

    public NFSFileShareInfo withNotificationPolicy(String notificationPolicy) {
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
        if (getNFSFileShareDefaults() != null)
            sb.append("NFSFileShareDefaults: ").append(getNFSFileShareDefaults()).append(",");
        if (getFileShareARN() != null)
            sb.append("FileShareARN: ").append(getFileShareARN()).append(",");
        if (getFileShareId() != null)
            sb.append("FileShareId: ").append(getFileShareId()).append(",");
        if (getFileShareStatus() != null)
            sb.append("FileShareStatus: ").append(getFileShareStatus()).append(",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getKMSEncrypted() != null)
            sb.append("KMSEncrypted: ").append(getKMSEncrypted()).append(",");
        if (getKMSKey() != null)
            sb.append("KMSKey: ").append(getKMSKey()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getLocationARN() != null)
            sb.append("LocationARN: ").append(getLocationARN()).append(",");
        if (getDefaultStorageClass() != null)
            sb.append("DefaultStorageClass: ").append(getDefaultStorageClass()).append(",");
        if (getObjectACL() != null)
            sb.append("ObjectACL: ").append(getObjectACL()).append(",");
        if (getClientList() != null)
            sb.append("ClientList: ").append(getClientList()).append(",");
        if (getSquash() != null)
            sb.append("Squash: ").append(getSquash()).append(",");
        if (getReadOnly() != null)
            sb.append("ReadOnly: ").append(getReadOnly()).append(",");
        if (getGuessMIMETypeEnabled() != null)
            sb.append("GuessMIMETypeEnabled: ").append(getGuessMIMETypeEnabled()).append(",");
        if (getRequesterPays() != null)
            sb.append("RequesterPays: ").append(getRequesterPays()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof NFSFileShareInfo == false)
            return false;
        NFSFileShareInfo other = (NFSFileShareInfo) obj;
        if (other.getNFSFileShareDefaults() == null ^ this.getNFSFileShareDefaults() == null)
            return false;
        if (other.getNFSFileShareDefaults() != null && other.getNFSFileShareDefaults().equals(this.getNFSFileShareDefaults()) == false)
            return false;
        if (other.getFileShareARN() == null ^ this.getFileShareARN() == null)
            return false;
        if (other.getFileShareARN() != null && other.getFileShareARN().equals(this.getFileShareARN()) == false)
            return false;
        if (other.getFileShareId() == null ^ this.getFileShareId() == null)
            return false;
        if (other.getFileShareId() != null && other.getFileShareId().equals(this.getFileShareId()) == false)
            return false;
        if (other.getFileShareStatus() == null ^ this.getFileShareStatus() == null)
            return false;
        if (other.getFileShareStatus() != null && other.getFileShareStatus().equals(this.getFileShareStatus()) == false)
            return false;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getKMSEncrypted() == null ^ this.getKMSEncrypted() == null)
            return false;
        if (other.getKMSEncrypted() != null && other.getKMSEncrypted().equals(this.getKMSEncrypted()) == false)
            return false;
        if (other.getKMSKey() == null ^ this.getKMSKey() == null)
            return false;
        if (other.getKMSKey() != null && other.getKMSKey().equals(this.getKMSKey()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getLocationARN() == null ^ this.getLocationARN() == null)
            return false;
        if (other.getLocationARN() != null && other.getLocationARN().equals(this.getLocationARN()) == false)
            return false;
        if (other.getDefaultStorageClass() == null ^ this.getDefaultStorageClass() == null)
            return false;
        if (other.getDefaultStorageClass() != null && other.getDefaultStorageClass().equals(this.getDefaultStorageClass()) == false)
            return false;
        if (other.getObjectACL() == null ^ this.getObjectACL() == null)
            return false;
        if (other.getObjectACL() != null && other.getObjectACL().equals(this.getObjectACL()) == false)
            return false;
        if (other.getClientList() == null ^ this.getClientList() == null)
            return false;
        if (other.getClientList() != null && other.getClientList().equals(this.getClientList()) == false)
            return false;
        if (other.getSquash() == null ^ this.getSquash() == null)
            return false;
        if (other.getSquash() != null && other.getSquash().equals(this.getSquash()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getNFSFileShareDefaults() == null) ? 0 : getNFSFileShareDefaults().hashCode());
        hashCode = prime * hashCode + ((getFileShareARN() == null) ? 0 : getFileShareARN().hashCode());
        hashCode = prime * hashCode + ((getFileShareId() == null) ? 0 : getFileShareId().hashCode());
        hashCode = prime * hashCode + ((getFileShareStatus() == null) ? 0 : getFileShareStatus().hashCode());
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getKMSEncrypted() == null) ? 0 : getKMSEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getLocationARN() == null) ? 0 : getLocationARN().hashCode());
        hashCode = prime * hashCode + ((getDefaultStorageClass() == null) ? 0 : getDefaultStorageClass().hashCode());
        hashCode = prime * hashCode + ((getObjectACL() == null) ? 0 : getObjectACL().hashCode());
        hashCode = prime * hashCode + ((getClientList() == null) ? 0 : getClientList().hashCode());
        hashCode = prime * hashCode + ((getSquash() == null) ? 0 : getSquash().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        hashCode = prime * hashCode + ((getGuessMIMETypeEnabled() == null) ? 0 : getGuessMIMETypeEnabled().hashCode());
        hashCode = prime * hashCode + ((getRequesterPays() == null) ? 0 : getRequesterPays().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getFileShareName() == null) ? 0 : getFileShareName().hashCode());
        hashCode = prime * hashCode + ((getCacheAttributes() == null) ? 0 : getCacheAttributes().hashCode());
        hashCode = prime * hashCode + ((getNotificationPolicy() == null) ? 0 : getNotificationPolicy().hashCode());
        return hashCode;
    }

    @Override
    public NFSFileShareInfo clone() {
        try {
            return (NFSFileShareInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.NFSFileShareInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
