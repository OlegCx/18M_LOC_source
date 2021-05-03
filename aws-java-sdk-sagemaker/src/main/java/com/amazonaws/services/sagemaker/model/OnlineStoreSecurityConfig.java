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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The security configuration for <code>OnlineStore</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/OnlineStoreSecurityConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OnlineStoreSecurityConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that SageMaker Feature Store uses to encrypt the Amazon S3
     * objects at rest using Amazon S3 server-side encryption.
     * </p>
     * <p>
     * The caller (either IAM user or IAM role) of <code>CreateFeatureGroup</code> must have below permissions to the
     * <code>OnlineStore</code> <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"kms:Encrypt"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:Decrypt"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:DescribeKey"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:CreateGrant"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:RetireGrant"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:ReEncryptFrom"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:ReEncryptTo"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:GenerateDataKey"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:ListAliases"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:ListGrants"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:RevokeGrant"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The caller (either IAM user or IAM role) to all DataPlane operations (<code>PutRecord</code>,
     * <code>GetRecord</code>, <code>DeleteRecord</code>) must have the following permissions to the
     * <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"kms:Decrypt"</code>
     * </p>
     * </li>
     * </ul>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that SageMaker Feature Store uses to encrypt the Amazon S3
     * objects at rest using Amazon S3 server-side encryption.
     * </p>
     * <p>
     * The caller (either IAM user or IAM role) of <code>CreateFeatureGroup</code> must have below permissions to the
     * <code>OnlineStore</code> <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"kms:Encrypt"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:Decrypt"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:DescribeKey"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:CreateGrant"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:RetireGrant"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:ReEncryptFrom"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:ReEncryptTo"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:GenerateDataKey"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:ListAliases"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:ListGrants"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:RevokeGrant"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The caller (either IAM user or IAM role) to all DataPlane operations (<code>PutRecord</code>,
     * <code>GetRecord</code>, <code>DeleteRecord</code>) must have the following permissions to the
     * <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"kms:Decrypt"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The ID of the AWS Key Management Service (AWS KMS) key that SageMaker Feature Store uses to encrypt the
     *        Amazon S3 objects at rest using Amazon S3 server-side encryption.</p>
     *        <p>
     *        The caller (either IAM user or IAM role) of <code>CreateFeatureGroup</code> must have below permissions to
     *        the <code>OnlineStore</code> <code>KmsKeyId</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"kms:Encrypt"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:Decrypt"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:DescribeKey"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:CreateGrant"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:RetireGrant"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:ReEncryptFrom"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:ReEncryptTo"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:GenerateDataKey"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:ListAliases"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:ListGrants"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:RevokeGrant"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The caller (either IAM user or IAM role) to all DataPlane operations (<code>PutRecord</code>,
     *        <code>GetRecord</code>, <code>DeleteRecord</code>) must have the following permissions to the
     *        <code>KmsKeyId</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"kms:Decrypt"</code>
     *        </p>
     *        </li>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that SageMaker Feature Store uses to encrypt the Amazon S3
     * objects at rest using Amazon S3 server-side encryption.
     * </p>
     * <p>
     * The caller (either IAM user or IAM role) of <code>CreateFeatureGroup</code> must have below permissions to the
     * <code>OnlineStore</code> <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"kms:Encrypt"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:Decrypt"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:DescribeKey"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:CreateGrant"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:RetireGrant"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:ReEncryptFrom"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:ReEncryptTo"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:GenerateDataKey"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:ListAliases"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:ListGrants"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:RevokeGrant"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The caller (either IAM user or IAM role) to all DataPlane operations (<code>PutRecord</code>,
     * <code>GetRecord</code>, <code>DeleteRecord</code>) must have the following permissions to the
     * <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"kms:Decrypt"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The ID of the AWS Key Management Service (AWS KMS) key that SageMaker Feature Store uses to encrypt the
     *         Amazon S3 objects at rest using Amazon S3 server-side encryption.</p>
     *         <p>
     *         The caller (either IAM user or IAM role) of <code>CreateFeatureGroup</code> must have below permissions
     *         to the <code>OnlineStore</code> <code>KmsKeyId</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"kms:Encrypt"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"kms:Decrypt"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"kms:DescribeKey"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"kms:CreateGrant"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"kms:RetireGrant"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"kms:ReEncryptFrom"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"kms:ReEncryptTo"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"kms:GenerateDataKey"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"kms:ListAliases"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"kms:ListGrants"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"kms:RevokeGrant"</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The caller (either IAM user or IAM role) to all DataPlane operations (<code>PutRecord</code>,
     *         <code>GetRecord</code>, <code>DeleteRecord</code>) must have the following permissions to the
     *         <code>KmsKeyId</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"kms:Decrypt"</code>
     *         </p>
     *         </li>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that SageMaker Feature Store uses to encrypt the Amazon S3
     * objects at rest using Amazon S3 server-side encryption.
     * </p>
     * <p>
     * The caller (either IAM user or IAM role) of <code>CreateFeatureGroup</code> must have below permissions to the
     * <code>OnlineStore</code> <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"kms:Encrypt"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:Decrypt"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:DescribeKey"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:CreateGrant"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:RetireGrant"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:ReEncryptFrom"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:ReEncryptTo"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:GenerateDataKey"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:ListAliases"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:ListGrants"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"kms:RevokeGrant"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The caller (either IAM user or IAM role) to all DataPlane operations (<code>PutRecord</code>,
     * <code>GetRecord</code>, <code>DeleteRecord</code>) must have the following permissions to the
     * <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"kms:Decrypt"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The ID of the AWS Key Management Service (AWS KMS) key that SageMaker Feature Store uses to encrypt the
     *        Amazon S3 objects at rest using Amazon S3 server-side encryption.</p>
     *        <p>
     *        The caller (either IAM user or IAM role) of <code>CreateFeatureGroup</code> must have below permissions to
     *        the <code>OnlineStore</code> <code>KmsKeyId</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"kms:Encrypt"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:Decrypt"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:DescribeKey"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:CreateGrant"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:RetireGrant"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:ReEncryptFrom"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:ReEncryptTo"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:GenerateDataKey"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:ListAliases"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:ListGrants"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"kms:RevokeGrant"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The caller (either IAM user or IAM role) to all DataPlane operations (<code>PutRecord</code>,
     *        <code>GetRecord</code>, <code>DeleteRecord</code>) must have the following permissions to the
     *        <code>KmsKeyId</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"kms:Decrypt"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnlineStoreSecurityConfig withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OnlineStoreSecurityConfig == false)
            return false;
        OnlineStoreSecurityConfig other = (OnlineStoreSecurityConfig) obj;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public OnlineStoreSecurityConfig clone() {
        try {
            return (OnlineStoreSecurityConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.OnlineStoreSecurityConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
