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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the details about a secret. It does not include the encrypted <code>SecretString</code> and
 * <code>SecretBinary</code> values. To get those values, use the <a>GetSecretValue</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/SecretListEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecretListEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret.
     * </p>
     * <p>
     * For more information about ARNs in Secrets Manager, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#iam-resources"
     * >Policy Resources</a> in the <i>AWS Secrets Manager User Guide</i>.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The friendly name of the secret. You can use forward slashes in the name to represent a path hierarchy. For
     * example, <code>/prod/databases/dbserver1</code> could represent the secret for a server named
     * <code>dbserver1</code> in the folder <code>databases</code> in the folder <code>prod</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The user-provided description of the secret.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN or alias of the AWS KMS customer master key (CMK) used to encrypt the <code>SecretString</code> and
     * <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager
     * defaults to encrypting the secret fields with the default KMS CMK, the key named <code>awssecretsmanager</code>,
     * for this account.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Indicates whether automatic, scheduled rotation is enabled for this secret.
     * </p>
     */
    private Boolean rotationEnabled;
    /**
     * <p>
     * The ARN of an AWS Lambda function invoked by Secrets Manager to rotate and expire the secret either automatically
     * per the schedule or manually by a call to <a>RotateSecret</a>.
     * </p>
     */
    private String rotationLambdaARN;
    /**
     * <p>
     * A structure that defines the rotation configuration for the secret.
     * </p>
     */
    private RotationRulesType rotationRules;
    /**
     * <p>
     * The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is
     * null if the secret hasn't ever rotated.
     * </p>
     */
    private java.util.Date lastRotatedDate;
    /**
     * <p>
     * The last date and time that this secret was modified in any way.
     * </p>
     */
    private java.util.Date lastChangedDate;
    /**
     * <p>
     * The last date that this secret was accessed. This value is truncated to midnight of the date and therefore shows
     * only the date, not the time.
     * </p>
     */
    private java.util.Date lastAccessedDate;
    /**
     * <p>
     * The date and time the deletion of the secret occurred. Not present on active secrets. The secret can be recovered
     * until the number of days in the recovery window has passed, as specified in the <code>RecoveryWindowInDays</code>
     * parameter of the <a>DeleteSecret</a> operation.
     * </p>
     */
    private java.util.Date deletedDate;
    /**
     * <p>
     * The list of user-defined tags associated with the secret. To add tags to a secret, use <a>TagResource</a>. To
     * remove tags, use <a>UntagResource</a>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A list of all of the currently assigned <code>SecretVersionStage</code> staging labels and the
     * <code>SecretVersionId</code> attached to each one. Staging labels are used to keep track of the different
     * versions during the rotation process.
     * </p>
     * <note>
     * <p>
     * A version that does not have any <code>SecretVersionStage</code> is considered deprecated and subject to
     * deletion. Such versions are not included in this list.
     * </p>
     * </note>
     */
    private java.util.Map<String, java.util.List<String>> secretVersionsToStages;
    /**
     * <p>
     * Returns the name of the service that created the secret.
     * </p>
     */
    private String owningService;
    /**
     * <p>
     * The date and time when a secret was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The Region where Secrets Manager originated the secret.
     * </p>
     */
    private String primaryRegion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret.
     * </p>
     * <p>
     * For more information about ARNs in Secrets Manager, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#iam-resources"
     * >Policy Resources</a> in the <i>AWS Secrets Manager User Guide</i>.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the secret.</p>
     *        <p>
     *        For more information about ARNs in Secrets Manager, see <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#iam-resources"
     *        >Policy Resources</a> in the <i>AWS Secrets Manager User Guide</i>.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret.
     * </p>
     * <p>
     * For more information about ARNs in Secrets Manager, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#iam-resources"
     * >Policy Resources</a> in the <i>AWS Secrets Manager User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the secret.</p>
     *         <p>
     *         For more information about ARNs in Secrets Manager, see <a href=
     *         "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#iam-resources"
     *         >Policy Resources</a> in the <i>AWS Secrets Manager User Guide</i>.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret.
     * </p>
     * <p>
     * For more information about ARNs in Secrets Manager, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#iam-resources"
     * >Policy Resources</a> in the <i>AWS Secrets Manager User Guide</i>.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the secret.</p>
     *        <p>
     *        For more information about ARNs in Secrets Manager, see <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#iam-resources"
     *        >Policy Resources</a> in the <i>AWS Secrets Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretListEntry withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The friendly name of the secret. You can use forward slashes in the name to represent a path hierarchy. For
     * example, <code>/prod/databases/dbserver1</code> could represent the secret for a server named
     * <code>dbserver1</code> in the folder <code>databases</code> in the folder <code>prod</code>.
     * </p>
     * 
     * @param name
     *        The friendly name of the secret. You can use forward slashes in the name to represent a path hierarchy.
     *        For example, <code>/prod/databases/dbserver1</code> could represent the secret for a server named
     *        <code>dbserver1</code> in the folder <code>databases</code> in the folder <code>prod</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the secret. You can use forward slashes in the name to represent a path hierarchy. For
     * example, <code>/prod/databases/dbserver1</code> could represent the secret for a server named
     * <code>dbserver1</code> in the folder <code>databases</code> in the folder <code>prod</code>.
     * </p>
     * 
     * @return The friendly name of the secret. You can use forward slashes in the name to represent a path hierarchy.
     *         For example, <code>/prod/databases/dbserver1</code> could represent the secret for a server named
     *         <code>dbserver1</code> in the folder <code>databases</code> in the folder <code>prod</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the secret. You can use forward slashes in the name to represent a path hierarchy. For
     * example, <code>/prod/databases/dbserver1</code> could represent the secret for a server named
     * <code>dbserver1</code> in the folder <code>databases</code> in the folder <code>prod</code>.
     * </p>
     * 
     * @param name
     *        The friendly name of the secret. You can use forward slashes in the name to represent a path hierarchy.
     *        For example, <code>/prod/databases/dbserver1</code> could represent the secret for a server named
     *        <code>dbserver1</code> in the folder <code>databases</code> in the folder <code>prod</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretListEntry withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The user-provided description of the secret.
     * </p>
     * 
     * @param description
     *        The user-provided description of the secret.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The user-provided description of the secret.
     * </p>
     * 
     * @return The user-provided description of the secret.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The user-provided description of the secret.
     * </p>
     * 
     * @param description
     *        The user-provided description of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretListEntry withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN or alias of the AWS KMS customer master key (CMK) used to encrypt the <code>SecretString</code> and
     * <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager
     * defaults to encrypting the secret fields with the default KMS CMK, the key named <code>awssecretsmanager</code>,
     * for this account.
     * </p>
     * 
     * @param kmsKeyId
     *        The ARN or alias of the AWS KMS customer master key (CMK) used to encrypt the <code>SecretString</code>
     *        and <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then
     *        Secrets Manager defaults to encrypting the secret fields with the default KMS CMK, the key named
     *        <code>awssecretsmanager</code>, for this account.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ARN or alias of the AWS KMS customer master key (CMK) used to encrypt the <code>SecretString</code> and
     * <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager
     * defaults to encrypting the secret fields with the default KMS CMK, the key named <code>awssecretsmanager</code>,
     * for this account.
     * </p>
     * 
     * @return The ARN or alias of the AWS KMS customer master key (CMK) used to encrypt the <code>SecretString</code>
     *         and <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then
     *         Secrets Manager defaults to encrypting the secret fields with the default KMS CMK, the key named
     *         <code>awssecretsmanager</code>, for this account.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ARN or alias of the AWS KMS customer master key (CMK) used to encrypt the <code>SecretString</code> and
     * <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager
     * defaults to encrypting the secret fields with the default KMS CMK, the key named <code>awssecretsmanager</code>,
     * for this account.
     * </p>
     * 
     * @param kmsKeyId
     *        The ARN or alias of the AWS KMS customer master key (CMK) used to encrypt the <code>SecretString</code>
     *        and <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then
     *        Secrets Manager defaults to encrypting the secret fields with the default KMS CMK, the key named
     *        <code>awssecretsmanager</code>, for this account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretListEntry withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Indicates whether automatic, scheduled rotation is enabled for this secret.
     * </p>
     * 
     * @param rotationEnabled
     *        Indicates whether automatic, scheduled rotation is enabled for this secret.
     */

    public void setRotationEnabled(Boolean rotationEnabled) {
        this.rotationEnabled = rotationEnabled;
    }

    /**
     * <p>
     * Indicates whether automatic, scheduled rotation is enabled for this secret.
     * </p>
     * 
     * @return Indicates whether automatic, scheduled rotation is enabled for this secret.
     */

    public Boolean getRotationEnabled() {
        return this.rotationEnabled;
    }

    /**
     * <p>
     * Indicates whether automatic, scheduled rotation is enabled for this secret.
     * </p>
     * 
     * @param rotationEnabled
     *        Indicates whether automatic, scheduled rotation is enabled for this secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretListEntry withRotationEnabled(Boolean rotationEnabled) {
        setRotationEnabled(rotationEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether automatic, scheduled rotation is enabled for this secret.
     * </p>
     * 
     * @return Indicates whether automatic, scheduled rotation is enabled for this secret.
     */

    public Boolean isRotationEnabled() {
        return this.rotationEnabled;
    }

    /**
     * <p>
     * The ARN of an AWS Lambda function invoked by Secrets Manager to rotate and expire the secret either automatically
     * per the schedule or manually by a call to <a>RotateSecret</a>.
     * </p>
     * 
     * @param rotationLambdaARN
     *        The ARN of an AWS Lambda function invoked by Secrets Manager to rotate and expire the secret either
     *        automatically per the schedule or manually by a call to <a>RotateSecret</a>.
     */

    public void setRotationLambdaARN(String rotationLambdaARN) {
        this.rotationLambdaARN = rotationLambdaARN;
    }

    /**
     * <p>
     * The ARN of an AWS Lambda function invoked by Secrets Manager to rotate and expire the secret either automatically
     * per the schedule or manually by a call to <a>RotateSecret</a>.
     * </p>
     * 
     * @return The ARN of an AWS Lambda function invoked by Secrets Manager to rotate and expire the secret either
     *         automatically per the schedule or manually by a call to <a>RotateSecret</a>.
     */

    public String getRotationLambdaARN() {
        return this.rotationLambdaARN;
    }

    /**
     * <p>
     * The ARN of an AWS Lambda function invoked by Secrets Manager to rotate and expire the secret either automatically
     * per the schedule or manually by a call to <a>RotateSecret</a>.
     * </p>
     * 
     * @param rotationLambdaARN
     *        The ARN of an AWS Lambda function invoked by Secrets Manager to rotate and expire the secret either
     *        automatically per the schedule or manually by a call to <a>RotateSecret</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretListEntry withRotationLambdaARN(String rotationLambdaARN) {
        setRotationLambdaARN(rotationLambdaARN);
        return this;
    }

    /**
     * <p>
     * A structure that defines the rotation configuration for the secret.
     * </p>
     * 
     * @param rotationRules
     *        A structure that defines the rotation configuration for the secret.
     */

    public void setRotationRules(RotationRulesType rotationRules) {
        this.rotationRules = rotationRules;
    }

    /**
     * <p>
     * A structure that defines the rotation configuration for the secret.
     * </p>
     * 
     * @return A structure that defines the rotation configuration for the secret.
     */

    public RotationRulesType getRotationRules() {
        return this.rotationRules;
    }

    /**
     * <p>
     * A structure that defines the rotation configuration for the secret.
     * </p>
     * 
     * @param rotationRules
     *        A structure that defines the rotation configuration for the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretListEntry withRotationRules(RotationRulesType rotationRules) {
        setRotationRules(rotationRules);
        return this;
    }

    /**
     * <p>
     * The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is
     * null if the secret hasn't ever rotated.
     * </p>
     * 
     * @param lastRotatedDate
     *        The most recent date and time that the Secrets Manager rotation process was successfully completed. This
     *        value is null if the secret hasn't ever rotated.
     */

    public void setLastRotatedDate(java.util.Date lastRotatedDate) {
        this.lastRotatedDate = lastRotatedDate;
    }

    /**
     * <p>
     * The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is
     * null if the secret hasn't ever rotated.
     * </p>
     * 
     * @return The most recent date and time that the Secrets Manager rotation process was successfully completed. This
     *         value is null if the secret hasn't ever rotated.
     */

    public java.util.Date getLastRotatedDate() {
        return this.lastRotatedDate;
    }

    /**
     * <p>
     * The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is
     * null if the secret hasn't ever rotated.
     * </p>
     * 
     * @param lastRotatedDate
     *        The most recent date and time that the Secrets Manager rotation process was successfully completed. This
     *        value is null if the secret hasn't ever rotated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretListEntry withLastRotatedDate(java.util.Date lastRotatedDate) {
        setLastRotatedDate(lastRotatedDate);
        return this;
    }

    /**
     * <p>
     * The last date and time that this secret was modified in any way.
     * </p>
     * 
     * @param lastChangedDate
     *        The last date and time that this secret was modified in any way.
     */

    public void setLastChangedDate(java.util.Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }

    /**
     * <p>
     * The last date and time that this secret was modified in any way.
     * </p>
     * 
     * @return The last date and time that this secret was modified in any way.
     */

    public java.util.Date getLastChangedDate() {
        return this.lastChangedDate;
    }

    /**
     * <p>
     * The last date and time that this secret was modified in any way.
     * </p>
     * 
     * @param lastChangedDate
     *        The last date and time that this secret was modified in any way.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretListEntry withLastChangedDate(java.util.Date lastChangedDate) {
        setLastChangedDate(lastChangedDate);
        return this;
    }

    /**
     * <p>
     * The last date that this secret was accessed. This value is truncated to midnight of the date and therefore shows
     * only the date, not the time.
     * </p>
     * 
     * @param lastAccessedDate
     *        The last date that this secret was accessed. This value is truncated to midnight of the date and therefore
     *        shows only the date, not the time.
     */

    public void setLastAccessedDate(java.util.Date lastAccessedDate) {
        this.lastAccessedDate = lastAccessedDate;
    }

    /**
     * <p>
     * The last date that this secret was accessed. This value is truncated to midnight of the date and therefore shows
     * only the date, not the time.
     * </p>
     * 
     * @return The last date that this secret was accessed. This value is truncated to midnight of the date and
     *         therefore shows only the date, not the time.
     */

    public java.util.Date getLastAccessedDate() {
        return this.lastAccessedDate;
    }

    /**
     * <p>
     * The last date that this secret was accessed. This value is truncated to midnight of the date and therefore shows
     * only the date, not the time.
     * </p>
     * 
     * @param lastAccessedDate
     *        The last date that this secret was accessed. This value is truncated to midnight of the date and therefore
     *        shows only the date, not the time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretListEntry withLastAccessedDate(java.util.Date lastAccessedDate) {
        setLastAccessedDate(lastAccessedDate);
        return this;
    }

    /**
     * <p>
     * The date and time the deletion of the secret occurred. Not present on active secrets. The secret can be recovered
     * until the number of days in the recovery window has passed, as specified in the <code>RecoveryWindowInDays</code>
     * parameter of the <a>DeleteSecret</a> operation.
     * </p>
     * 
     * @param deletedDate
     *        The date and time the deletion of the secret occurred. Not present on active secrets. The secret can be
     *        recovered until the number of days in the recovery window has passed, as specified in the
     *        <code>RecoveryWindowInDays</code> parameter of the <a>DeleteSecret</a> operation.
     */

    public void setDeletedDate(java.util.Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    /**
     * <p>
     * The date and time the deletion of the secret occurred. Not present on active secrets. The secret can be recovered
     * until the number of days in the recovery window has passed, as specified in the <code>RecoveryWindowInDays</code>
     * parameter of the <a>DeleteSecret</a> operation.
     * </p>
     * 
     * @return The date and time the deletion of the secret occurred. Not present on active secrets. The secret can be
     *         recovered until the number of days in the recovery window has passed, as specified in the
     *         <code>RecoveryWindowInDays</code> parameter of the <a>DeleteSecret</a> operation.
     */

    public java.util.Date getDeletedDate() {
        return this.deletedDate;
    }

    /**
     * <p>
     * The date and time the deletion of the secret occurred. Not present on active secrets. The secret can be recovered
     * until the number of days in the recovery window has passed, as specified in the <code>RecoveryWindowInDays</code>
     * parameter of the <a>DeleteSecret</a> operation.
     * </p>
     * 
     * @param deletedDate
     *        The date and time the deletion of the secret occurred. Not present on active secrets. The secret can be
     *        recovered until the number of days in the recovery window has passed, as specified in the
     *        <code>RecoveryWindowInDays</code> parameter of the <a>DeleteSecret</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretListEntry withDeletedDate(java.util.Date deletedDate) {
        setDeletedDate(deletedDate);
        return this;
    }

    /**
     * <p>
     * The list of user-defined tags associated with the secret. To add tags to a secret, use <a>TagResource</a>. To
     * remove tags, use <a>UntagResource</a>.
     * </p>
     * 
     * @return The list of user-defined tags associated with the secret. To add tags to a secret, use
     *         <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of user-defined tags associated with the secret. To add tags to a secret, use <a>TagResource</a>. To
     * remove tags, use <a>UntagResource</a>.
     * </p>
     * 
     * @param tags
     *        The list of user-defined tags associated with the secret. To add tags to a secret, use <a>TagResource</a>.
     *        To remove tags, use <a>UntagResource</a>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The list of user-defined tags associated with the secret. To add tags to a secret, use <a>TagResource</a>. To
     * remove tags, use <a>UntagResource</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of user-defined tags associated with the secret. To add tags to a secret, use <a>TagResource</a>.
     *        To remove tags, use <a>UntagResource</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretListEntry withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of user-defined tags associated with the secret. To add tags to a secret, use <a>TagResource</a>. To
     * remove tags, use <a>UntagResource</a>.
     * </p>
     * 
     * @param tags
     *        The list of user-defined tags associated with the secret. To add tags to a secret, use <a>TagResource</a>.
     *        To remove tags, use <a>UntagResource</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretListEntry withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A list of all of the currently assigned <code>SecretVersionStage</code> staging labels and the
     * <code>SecretVersionId</code> attached to each one. Staging labels are used to keep track of the different
     * versions during the rotation process.
     * </p>
     * <note>
     * <p>
     * A version that does not have any <code>SecretVersionStage</code> is considered deprecated and subject to
     * deletion. Such versions are not included in this list.
     * </p>
     * </note>
     * 
     * @return A list of all of the currently assigned <code>SecretVersionStage</code> staging labels and the
     *         <code>SecretVersionId</code> attached to each one. Staging labels are used to keep track of the different
     *         versions during the rotation process.</p> <note>
     *         <p>
     *         A version that does not have any <code>SecretVersionStage</code> is considered deprecated and subject to
     *         deletion. Such versions are not included in this list.
     *         </p>
     */

    public java.util.Map<String, java.util.List<String>> getSecretVersionsToStages() {
        return secretVersionsToStages;
    }

    /**
     * <p>
     * A list of all of the currently assigned <code>SecretVersionStage</code> staging labels and the
     * <code>SecretVersionId</code> attached to each one. Staging labels are used to keep track of the different
     * versions during the rotation process.
     * </p>
     * <note>
     * <p>
     * A version that does not have any <code>SecretVersionStage</code> is considered deprecated and subject to
     * deletion. Such versions are not included in this list.
     * </p>
     * </note>
     * 
     * @param secretVersionsToStages
     *        A list of all of the currently assigned <code>SecretVersionStage</code> staging labels and the
     *        <code>SecretVersionId</code> attached to each one. Staging labels are used to keep track of the different
     *        versions during the rotation process.</p> <note>
     *        <p>
     *        A version that does not have any <code>SecretVersionStage</code> is considered deprecated and subject to
     *        deletion. Such versions are not included in this list.
     *        </p>
     */

    public void setSecretVersionsToStages(java.util.Map<String, java.util.List<String>> secretVersionsToStages) {
        this.secretVersionsToStages = secretVersionsToStages;
    }

    /**
     * <p>
     * A list of all of the currently assigned <code>SecretVersionStage</code> staging labels and the
     * <code>SecretVersionId</code> attached to each one. Staging labels are used to keep track of the different
     * versions during the rotation process.
     * </p>
     * <note>
     * <p>
     * A version that does not have any <code>SecretVersionStage</code> is considered deprecated and subject to
     * deletion. Such versions are not included in this list.
     * </p>
     * </note>
     * 
     * @param secretVersionsToStages
     *        A list of all of the currently assigned <code>SecretVersionStage</code> staging labels and the
     *        <code>SecretVersionId</code> attached to each one. Staging labels are used to keep track of the different
     *        versions during the rotation process.</p> <note>
     *        <p>
     *        A version that does not have any <code>SecretVersionStage</code> is considered deprecated and subject to
     *        deletion. Such versions are not included in this list.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretListEntry withSecretVersionsToStages(java.util.Map<String, java.util.List<String>> secretVersionsToStages) {
        setSecretVersionsToStages(secretVersionsToStages);
        return this;
    }

    /**
     * Add a single SecretVersionsToStages entry
     *
     * @see SecretListEntry#withSecretVersionsToStages
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SecretListEntry addSecretVersionsToStagesEntry(String key, java.util.List<String> value) {
        if (null == this.secretVersionsToStages) {
            this.secretVersionsToStages = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.secretVersionsToStages.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.secretVersionsToStages.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SecretVersionsToStages.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretListEntry clearSecretVersionsToStagesEntries() {
        this.secretVersionsToStages = null;
        return this;
    }

    /**
     * <p>
     * Returns the name of the service that created the secret.
     * </p>
     * 
     * @param owningService
     *        Returns the name of the service that created the secret.
     */

    public void setOwningService(String owningService) {
        this.owningService = owningService;
    }

    /**
     * <p>
     * Returns the name of the service that created the secret.
     * </p>
     * 
     * @return Returns the name of the service that created the secret.
     */

    public String getOwningService() {
        return this.owningService;
    }

    /**
     * <p>
     * Returns the name of the service that created the secret.
     * </p>
     * 
     * @param owningService
     *        Returns the name of the service that created the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretListEntry withOwningService(String owningService) {
        setOwningService(owningService);
        return this;
    }

    /**
     * <p>
     * The date and time when a secret was created.
     * </p>
     * 
     * @param createdDate
     *        The date and time when a secret was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date and time when a secret was created.
     * </p>
     * 
     * @return The date and time when a secret was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date and time when a secret was created.
     * </p>
     * 
     * @param createdDate
     *        The date and time when a secret was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretListEntry withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The Region where Secrets Manager originated the secret.
     * </p>
     * 
     * @param primaryRegion
     *        The Region where Secrets Manager originated the secret.
     */

    public void setPrimaryRegion(String primaryRegion) {
        this.primaryRegion = primaryRegion;
    }

    /**
     * <p>
     * The Region where Secrets Manager originated the secret.
     * </p>
     * 
     * @return The Region where Secrets Manager originated the secret.
     */

    public String getPrimaryRegion() {
        return this.primaryRegion;
    }

    /**
     * <p>
     * The Region where Secrets Manager originated the secret.
     * </p>
     * 
     * @param primaryRegion
     *        The Region where Secrets Manager originated the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretListEntry withPrimaryRegion(String primaryRegion) {
        setPrimaryRegion(primaryRegion);
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
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getRotationEnabled() != null)
            sb.append("RotationEnabled: ").append(getRotationEnabled()).append(",");
        if (getRotationLambdaARN() != null)
            sb.append("RotationLambdaARN: ").append(getRotationLambdaARN()).append(",");
        if (getRotationRules() != null)
            sb.append("RotationRules: ").append(getRotationRules()).append(",");
        if (getLastRotatedDate() != null)
            sb.append("LastRotatedDate: ").append(getLastRotatedDate()).append(",");
        if (getLastChangedDate() != null)
            sb.append("LastChangedDate: ").append(getLastChangedDate()).append(",");
        if (getLastAccessedDate() != null)
            sb.append("LastAccessedDate: ").append(getLastAccessedDate()).append(",");
        if (getDeletedDate() != null)
            sb.append("DeletedDate: ").append(getDeletedDate()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getSecretVersionsToStages() != null)
            sb.append("SecretVersionsToStages: ").append(getSecretVersionsToStages()).append(",");
        if (getOwningService() != null)
            sb.append("OwningService: ").append(getOwningService()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getPrimaryRegion() != null)
            sb.append("PrimaryRegion: ").append(getPrimaryRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecretListEntry == false)
            return false;
        SecretListEntry other = (SecretListEntry) obj;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getRotationEnabled() == null ^ this.getRotationEnabled() == null)
            return false;
        if (other.getRotationEnabled() != null && other.getRotationEnabled().equals(this.getRotationEnabled()) == false)
            return false;
        if (other.getRotationLambdaARN() == null ^ this.getRotationLambdaARN() == null)
            return false;
        if (other.getRotationLambdaARN() != null && other.getRotationLambdaARN().equals(this.getRotationLambdaARN()) == false)
            return false;
        if (other.getRotationRules() == null ^ this.getRotationRules() == null)
            return false;
        if (other.getRotationRules() != null && other.getRotationRules().equals(this.getRotationRules()) == false)
            return false;
        if (other.getLastRotatedDate() == null ^ this.getLastRotatedDate() == null)
            return false;
        if (other.getLastRotatedDate() != null && other.getLastRotatedDate().equals(this.getLastRotatedDate()) == false)
            return false;
        if (other.getLastChangedDate() == null ^ this.getLastChangedDate() == null)
            return false;
        if (other.getLastChangedDate() != null && other.getLastChangedDate().equals(this.getLastChangedDate()) == false)
            return false;
        if (other.getLastAccessedDate() == null ^ this.getLastAccessedDate() == null)
            return false;
        if (other.getLastAccessedDate() != null && other.getLastAccessedDate().equals(this.getLastAccessedDate()) == false)
            return false;
        if (other.getDeletedDate() == null ^ this.getDeletedDate() == null)
            return false;
        if (other.getDeletedDate() != null && other.getDeletedDate().equals(this.getDeletedDate()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSecretVersionsToStages() == null ^ this.getSecretVersionsToStages() == null)
            return false;
        if (other.getSecretVersionsToStages() != null && other.getSecretVersionsToStages().equals(this.getSecretVersionsToStages()) == false)
            return false;
        if (other.getOwningService() == null ^ this.getOwningService() == null)
            return false;
        if (other.getOwningService() != null && other.getOwningService().equals(this.getOwningService()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getPrimaryRegion() == null ^ this.getPrimaryRegion() == null)
            return false;
        if (other.getPrimaryRegion() != null && other.getPrimaryRegion().equals(this.getPrimaryRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getRotationEnabled() == null) ? 0 : getRotationEnabled().hashCode());
        hashCode = prime * hashCode + ((getRotationLambdaARN() == null) ? 0 : getRotationLambdaARN().hashCode());
        hashCode = prime * hashCode + ((getRotationRules() == null) ? 0 : getRotationRules().hashCode());
        hashCode = prime * hashCode + ((getLastRotatedDate() == null) ? 0 : getLastRotatedDate().hashCode());
        hashCode = prime * hashCode + ((getLastChangedDate() == null) ? 0 : getLastChangedDate().hashCode());
        hashCode = prime * hashCode + ((getLastAccessedDate() == null) ? 0 : getLastAccessedDate().hashCode());
        hashCode = prime * hashCode + ((getDeletedDate() == null) ? 0 : getDeletedDate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSecretVersionsToStages() == null) ? 0 : getSecretVersionsToStages().hashCode());
        hashCode = prime * hashCode + ((getOwningService() == null) ? 0 : getOwningService().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getPrimaryRegion() == null) ? 0 : getPrimaryRegion().hashCode());
        return hashCode;
    }

    @Override
    public SecretListEntry clone() {
        try {
            return (SecretListEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.secretsmanager.model.transform.SecretListEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
