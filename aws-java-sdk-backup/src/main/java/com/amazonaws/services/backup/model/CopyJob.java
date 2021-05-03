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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains detailed information about a copy job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CopyJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account ID that owns the copy job.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Uniquely identifies a copy job.
     * </p>
     */
    private String copyJobId;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a source copy vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     */
    private String sourceBackupVaultArn;
    /**
     * <p>
     * An ARN that uniquely identifies a source recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     */
    private String sourceRecoveryPointArn;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a destination copy vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     */
    private String destinationBackupVaultArn;
    /**
     * <p>
     * An ARN that uniquely identifies a destination recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     */
    private String destinationRecoveryPointArn;
    /**
     * <p>
     * The AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon
     * Relational Database Service (Amazon RDS) database.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The date and time a copy job is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date and time a copy job is completed, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date completionDate;
    /**
     * <p>
     * The current state of a copy job.
     * </p>
     */
    private String state;
    /**
     * <p>
     * A detailed message explaining the status of the job to copy a resource.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The size, in bytes, of a copy job.
     * </p>
     */
    private Long backupSizeInBytes;
    /**
     * <p>
     * Specifies the IAM role ARN used to copy the target recovery point; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     */
    private String iamRoleArn;

    private RecoveryPointCreator createdBy;
    /**
     * <p>
     * The type of AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an
     * Amazon Relational Database Service (Amazon RDS) database.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The account ID that owns the copy job.
     * </p>
     * 
     * @param accountId
     *        The account ID that owns the copy job.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID that owns the copy job.
     * </p>
     * 
     * @return The account ID that owns the copy job.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID that owns the copy job.
     * </p>
     * 
     * @param accountId
     *        The account ID that owns the copy job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyJob withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Uniquely identifies a copy job.
     * </p>
     * 
     * @param copyJobId
     *        Uniquely identifies a copy job.
     */

    public void setCopyJobId(String copyJobId) {
        this.copyJobId = copyJobId;
    }

    /**
     * <p>
     * Uniquely identifies a copy job.
     * </p>
     * 
     * @return Uniquely identifies a copy job.
     */

    public String getCopyJobId() {
        return this.copyJobId;
    }

    /**
     * <p>
     * Uniquely identifies a copy job.
     * </p>
     * 
     * @param copyJobId
     *        Uniquely identifies a copy job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyJob withCopyJobId(String copyJobId) {
        setCopyJobId(copyJobId);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a source copy vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @param sourceBackupVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a source copy vault; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     */

    public void setSourceBackupVaultArn(String sourceBackupVaultArn) {
        this.sourceBackupVaultArn = sourceBackupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a source copy vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies a source copy vault; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     */

    public String getSourceBackupVaultArn() {
        return this.sourceBackupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a source copy vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @param sourceBackupVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a source copy vault; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyJob withSourceBackupVaultArn(String sourceBackupVaultArn) {
        setSourceBackupVaultArn(sourceBackupVaultArn);
        return this;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a source recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @param sourceRecoveryPointArn
     *        An ARN that uniquely identifies a source recovery point; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     */

    public void setSourceRecoveryPointArn(String sourceRecoveryPointArn) {
        this.sourceRecoveryPointArn = sourceRecoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a source recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @return An ARN that uniquely identifies a source recovery point; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     */

    public String getSourceRecoveryPointArn() {
        return this.sourceRecoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a source recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @param sourceRecoveryPointArn
     *        An ARN that uniquely identifies a source recovery point; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyJob withSourceRecoveryPointArn(String sourceRecoveryPointArn) {
        setSourceRecoveryPointArn(sourceRecoveryPointArn);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a destination copy vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @param destinationBackupVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a destination copy vault; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     */

    public void setDestinationBackupVaultArn(String destinationBackupVaultArn) {
        this.destinationBackupVaultArn = destinationBackupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a destination copy vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies a destination copy vault; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     */

    public String getDestinationBackupVaultArn() {
        return this.destinationBackupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a destination copy vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @param destinationBackupVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a destination copy vault; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyJob withDestinationBackupVaultArn(String destinationBackupVaultArn) {
        setDestinationBackupVaultArn(destinationBackupVaultArn);
        return this;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a destination recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @param destinationRecoveryPointArn
     *        An ARN that uniquely identifies a destination recovery point; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     */

    public void setDestinationRecoveryPointArn(String destinationRecoveryPointArn) {
        this.destinationRecoveryPointArn = destinationRecoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a destination recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @return An ARN that uniquely identifies a destination recovery point; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     */

    public String getDestinationRecoveryPointArn() {
        return this.destinationRecoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a destination recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @param destinationRecoveryPointArn
     *        An ARN that uniquely identifies a destination recovery point; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyJob withDestinationRecoveryPointArn(String destinationRecoveryPointArn) {
        setDestinationRecoveryPointArn(destinationRecoveryPointArn);
        return this;
    }

    /**
     * <p>
     * The AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon
     * Relational Database Service (Amazon RDS) database.
     * </p>
     * 
     * @param resourceArn
     *        The AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon
     *        Relational Database Service (Amazon RDS) database.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon
     * Relational Database Service (Amazon RDS) database.
     * </p>
     * 
     * @return The AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an
     *         Amazon Relational Database Service (Amazon RDS) database.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon
     * Relational Database Service (Amazon RDS) database.
     * </p>
     * 
     * @param resourceArn
     *        The AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon
     *        Relational Database Service (Amazon RDS) database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyJob withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The date and time a copy job is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time a copy job is created, in Unix format and Coordinated Universal Time (UTC). The value of
     *        <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     *        Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time a copy job is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time a copy job is created, in Unix format and Coordinated Universal Time (UTC). The value
     *         of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *         represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time a copy job is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time a copy job is created, in Unix format and Coordinated Universal Time (UTC). The value of
     *        <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     *        Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyJob withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date and time a copy job is completed, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param completionDate
     *        The date and time a copy job is completed, in Unix format and Coordinated Universal Time (UTC). The value
     *        of <code>CompletionDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCompletionDate(java.util.Date completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * <p>
     * The date and time a copy job is completed, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time a copy job is completed, in Unix format and Coordinated Universal Time (UTC). The value
     *         of <code>CompletionDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *         represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getCompletionDate() {
        return this.completionDate;
    }

    /**
     * <p>
     * The date and time a copy job is completed, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param completionDate
     *        The date and time a copy job is completed, in Unix format and Coordinated Universal Time (UTC). The value
     *        of <code>CompletionDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyJob withCompletionDate(java.util.Date completionDate) {
        setCompletionDate(completionDate);
        return this;
    }

    /**
     * <p>
     * The current state of a copy job.
     * </p>
     * 
     * @param state
     *        The current state of a copy job.
     * @see CopyJobState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of a copy job.
     * </p>
     * 
     * @return The current state of a copy job.
     * @see CopyJobState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of a copy job.
     * </p>
     * 
     * @param state
     *        The current state of a copy job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CopyJobState
     */

    public CopyJob withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of a copy job.
     * </p>
     * 
     * @param state
     *        The current state of a copy job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CopyJobState
     */

    public CopyJob withState(CopyJobState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A detailed message explaining the status of the job to copy a resource.
     * </p>
     * 
     * @param statusMessage
     *        A detailed message explaining the status of the job to copy a resource.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A detailed message explaining the status of the job to copy a resource.
     * </p>
     * 
     * @return A detailed message explaining the status of the job to copy a resource.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A detailed message explaining the status of the job to copy a resource.
     * </p>
     * 
     * @param statusMessage
     *        A detailed message explaining the status of the job to copy a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyJob withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of a copy job.
     * </p>
     * 
     * @param backupSizeInBytes
     *        The size, in bytes, of a copy job.
     */

    public void setBackupSizeInBytes(Long backupSizeInBytes) {
        this.backupSizeInBytes = backupSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of a copy job.
     * </p>
     * 
     * @return The size, in bytes, of a copy job.
     */

    public Long getBackupSizeInBytes() {
        return this.backupSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of a copy job.
     * </p>
     * 
     * @param backupSizeInBytes
     *        The size, in bytes, of a copy job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyJob withBackupSizeInBytes(Long backupSizeInBytes) {
        setBackupSizeInBytes(backupSizeInBytes);
        return this;
    }

    /**
     * <p>
     * Specifies the IAM role ARN used to copy the target recovery point; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @param iamRoleArn
     *        Specifies the IAM role ARN used to copy the target recovery point; for example,
     *        <code>arn:aws:iam::123456789012:role/S3Access</code>.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * Specifies the IAM role ARN used to copy the target recovery point; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @return Specifies the IAM role ARN used to copy the target recovery point; for example,
     *         <code>arn:aws:iam::123456789012:role/S3Access</code>.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * Specifies the IAM role ARN used to copy the target recovery point; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @param iamRoleArn
     *        Specifies the IAM role ARN used to copy the target recovery point; for example,
     *        <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyJob withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * @param createdBy
     */

    public void setCreatedBy(RecoveryPointCreator createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return
     */

    public RecoveryPointCreator getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @param createdBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyJob withCreatedBy(RecoveryPointCreator createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The type of AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an
     * Amazon Relational Database Service (Amazon RDS) database.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or
     *        an Amazon Relational Database Service (Amazon RDS) database.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an
     * Amazon Relational Database Service (Amazon RDS) database.
     * </p>
     * 
     * @return The type of AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or
     *         an Amazon Relational Database Service (Amazon RDS) database.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an
     * Amazon Relational Database Service (Amazon RDS) database.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or
     *        an Amazon Relational Database Service (Amazon RDS) database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyJob withResourceType(String resourceType) {
        setResourceType(resourceType);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getCopyJobId() != null)
            sb.append("CopyJobId: ").append(getCopyJobId()).append(",");
        if (getSourceBackupVaultArn() != null)
            sb.append("SourceBackupVaultArn: ").append(getSourceBackupVaultArn()).append(",");
        if (getSourceRecoveryPointArn() != null)
            sb.append("SourceRecoveryPointArn: ").append(getSourceRecoveryPointArn()).append(",");
        if (getDestinationBackupVaultArn() != null)
            sb.append("DestinationBackupVaultArn: ").append(getDestinationBackupVaultArn()).append(",");
        if (getDestinationRecoveryPointArn() != null)
            sb.append("DestinationRecoveryPointArn: ").append(getDestinationRecoveryPointArn()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getCompletionDate() != null)
            sb.append("CompletionDate: ").append(getCompletionDate()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getBackupSizeInBytes() != null)
            sb.append("BackupSizeInBytes: ").append(getBackupSizeInBytes()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyJob == false)
            return false;
        CopyJob other = (CopyJob) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getCopyJobId() == null ^ this.getCopyJobId() == null)
            return false;
        if (other.getCopyJobId() != null && other.getCopyJobId().equals(this.getCopyJobId()) == false)
            return false;
        if (other.getSourceBackupVaultArn() == null ^ this.getSourceBackupVaultArn() == null)
            return false;
        if (other.getSourceBackupVaultArn() != null && other.getSourceBackupVaultArn().equals(this.getSourceBackupVaultArn()) == false)
            return false;
        if (other.getSourceRecoveryPointArn() == null ^ this.getSourceRecoveryPointArn() == null)
            return false;
        if (other.getSourceRecoveryPointArn() != null && other.getSourceRecoveryPointArn().equals(this.getSourceRecoveryPointArn()) == false)
            return false;
        if (other.getDestinationBackupVaultArn() == null ^ this.getDestinationBackupVaultArn() == null)
            return false;
        if (other.getDestinationBackupVaultArn() != null && other.getDestinationBackupVaultArn().equals(this.getDestinationBackupVaultArn()) == false)
            return false;
        if (other.getDestinationRecoveryPointArn() == null ^ this.getDestinationRecoveryPointArn() == null)
            return false;
        if (other.getDestinationRecoveryPointArn() != null && other.getDestinationRecoveryPointArn().equals(this.getDestinationRecoveryPointArn()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getCompletionDate() == null ^ this.getCompletionDate() == null)
            return false;
        if (other.getCompletionDate() != null && other.getCompletionDate().equals(this.getCompletionDate()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getBackupSizeInBytes() == null ^ this.getBackupSizeInBytes() == null)
            return false;
        if (other.getBackupSizeInBytes() != null && other.getBackupSizeInBytes().equals(this.getBackupSizeInBytes()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getCopyJobId() == null) ? 0 : getCopyJobId().hashCode());
        hashCode = prime * hashCode + ((getSourceBackupVaultArn() == null) ? 0 : getSourceBackupVaultArn().hashCode());
        hashCode = prime * hashCode + ((getSourceRecoveryPointArn() == null) ? 0 : getSourceRecoveryPointArn().hashCode());
        hashCode = prime * hashCode + ((getDestinationBackupVaultArn() == null) ? 0 : getDestinationBackupVaultArn().hashCode());
        hashCode = prime * hashCode + ((getDestinationRecoveryPointArn() == null) ? 0 : getDestinationRecoveryPointArn().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getCompletionDate() == null) ? 0 : getCompletionDate().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getBackupSizeInBytes() == null) ? 0 : getBackupSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public CopyJob clone() {
        try {
            return (CopyJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.CopyJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
