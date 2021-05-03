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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/CreateAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the alias name. This value must begin with <code>alias/</code> followed by a name, such as
     * <code>alias/ExampleAlias</code>.
     * </p>
     * <p>
     * The <code>AliasName</code> value must be string of 1-256 characters. It can contain only alphanumeric characters,
     * forward slashes (/), underscores (_), and dashes (-). The alias name cannot begin with <code>alias/aws/</code>.
     * The <code>alias/aws/</code> prefix is reserved for <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">AWS managed CMKs</a>.
     * </p>
     */
    private String aliasName;
    /**
     * <p>
     * Associates the alias with the specified <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk">customer managed CMK</a>.
     * The CMK must be in the same AWS Region.
     * </p>
     * <p>
     * A valid CMK ID is required. If you supply a null or empty string value, this operation returns an error.
     * </p>
     * <p>
     * For help finding the key ID and ARN, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn">Finding the Key ID
     * and ARN</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     */
    private String targetKeyId;

    /**
     * <p>
     * Specifies the alias name. This value must begin with <code>alias/</code> followed by a name, such as
     * <code>alias/ExampleAlias</code>.
     * </p>
     * <p>
     * The <code>AliasName</code> value must be string of 1-256 characters. It can contain only alphanumeric characters,
     * forward slashes (/), underscores (_), and dashes (-). The alias name cannot begin with <code>alias/aws/</code>.
     * The <code>alias/aws/</code> prefix is reserved for <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">AWS managed CMKs</a>.
     * </p>
     * 
     * @param aliasName
     *        Specifies the alias name. This value must begin with <code>alias/</code> followed by a name, such as
     *        <code>alias/ExampleAlias</code>. </p>
     *        <p>
     *        The <code>AliasName</code> value must be string of 1-256 characters. It can contain only alphanumeric
     *        characters, forward slashes (/), underscores (_), and dashes (-). The alias name cannot begin with
     *        <code>alias/aws/</code>. The <code>alias/aws/</code> prefix is reserved for <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">AWS managed
     *        CMKs</a>.
     */

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * Specifies the alias name. This value must begin with <code>alias/</code> followed by a name, such as
     * <code>alias/ExampleAlias</code>.
     * </p>
     * <p>
     * The <code>AliasName</code> value must be string of 1-256 characters. It can contain only alphanumeric characters,
     * forward slashes (/), underscores (_), and dashes (-). The alias name cannot begin with <code>alias/aws/</code>.
     * The <code>alias/aws/</code> prefix is reserved for <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">AWS managed CMKs</a>.
     * </p>
     * 
     * @return Specifies the alias name. This value must begin with <code>alias/</code> followed by a name, such as
     *         <code>alias/ExampleAlias</code>. </p>
     *         <p>
     *         The <code>AliasName</code> value must be string of 1-256 characters. It can contain only alphanumeric
     *         characters, forward slashes (/), underscores (_), and dashes (-). The alias name cannot begin with
     *         <code>alias/aws/</code>. The <code>alias/aws/</code> prefix is reserved for <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">AWS managed
     *         CMKs</a>.
     */

    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * <p>
     * Specifies the alias name. This value must begin with <code>alias/</code> followed by a name, such as
     * <code>alias/ExampleAlias</code>.
     * </p>
     * <p>
     * The <code>AliasName</code> value must be string of 1-256 characters. It can contain only alphanumeric characters,
     * forward slashes (/), underscores (_), and dashes (-). The alias name cannot begin with <code>alias/aws/</code>.
     * The <code>alias/aws/</code> prefix is reserved for <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">AWS managed CMKs</a>.
     * </p>
     * 
     * @param aliasName
     *        Specifies the alias name. This value must begin with <code>alias/</code> followed by a name, such as
     *        <code>alias/ExampleAlias</code>. </p>
     *        <p>
     *        The <code>AliasName</code> value must be string of 1-256 characters. It can contain only alphanumeric
     *        characters, forward slashes (/), underscores (_), and dashes (-). The alias name cannot begin with
     *        <code>alias/aws/</code>. The <code>alias/aws/</code> prefix is reserved for <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">AWS managed
     *        CMKs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAliasRequest withAliasName(String aliasName) {
        setAliasName(aliasName);
        return this;
    }

    /**
     * <p>
     * Associates the alias with the specified <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk">customer managed CMK</a>.
     * The CMK must be in the same AWS Region.
     * </p>
     * <p>
     * A valid CMK ID is required. If you supply a null or empty string value, this operation returns an error.
     * </p>
     * <p>
     * For help finding the key ID and ARN, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn">Finding the Key ID
     * and ARN</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * 
     * @param targetKeyId
     *        Associates the alias with the specified <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk">customer managed
     *        CMK</a>. The CMK must be in the same AWS Region. </p>
     *        <p>
     *        A valid CMK ID is required. If you supply a null or empty string value, this operation returns an error.
     *        </p>
     *        <p>
     *        For help finding the key ID and ARN, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn">Finding the
     *        Key ID and ARN</a> in the <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     */

    public void setTargetKeyId(String targetKeyId) {
        this.targetKeyId = targetKeyId;
    }

    /**
     * <p>
     * Associates the alias with the specified <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk">customer managed CMK</a>.
     * The CMK must be in the same AWS Region.
     * </p>
     * <p>
     * A valid CMK ID is required. If you supply a null or empty string value, this operation returns an error.
     * </p>
     * <p>
     * For help finding the key ID and ARN, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn">Finding the Key ID
     * and ARN</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * 
     * @return Associates the alias with the specified <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk">customer managed
     *         CMK</a>. The CMK must be in the same AWS Region. </p>
     *         <p>
     *         A valid CMK ID is required. If you supply a null or empty string value, this operation returns an error.
     *         </p>
     *         <p>
     *         For help finding the key ID and ARN, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn">Finding
     *         the Key ID and ARN</a> in the <i>AWS Key Management Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     */

    public String getTargetKeyId() {
        return this.targetKeyId;
    }

    /**
     * <p>
     * Associates the alias with the specified <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk">customer managed CMK</a>.
     * The CMK must be in the same AWS Region.
     * </p>
     * <p>
     * A valid CMK ID is required. If you supply a null or empty string value, this operation returns an error.
     * </p>
     * <p>
     * For help finding the key ID and ARN, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn">Finding the Key ID
     * and ARN</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * 
     * @param targetKeyId
     *        Associates the alias with the specified <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk">customer managed
     *        CMK</a>. The CMK must be in the same AWS Region. </p>
     *        <p>
     *        A valid CMK ID is required. If you supply a null or empty string value, this operation returns an error.
     *        </p>
     *        <p>
     *        For help finding the key ID and ARN, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn">Finding the
     *        Key ID and ARN</a> in the <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAliasRequest withTargetKeyId(String targetKeyId) {
        setTargetKeyId(targetKeyId);
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
        if (getAliasName() != null)
            sb.append("AliasName: ").append(getAliasName()).append(",");
        if (getTargetKeyId() != null)
            sb.append("TargetKeyId: ").append(getTargetKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAliasRequest == false)
            return false;
        CreateAliasRequest other = (CreateAliasRequest) obj;
        if (other.getAliasName() == null ^ this.getAliasName() == null)
            return false;
        if (other.getAliasName() != null && other.getAliasName().equals(this.getAliasName()) == false)
            return false;
        if (other.getTargetKeyId() == null ^ this.getTargetKeyId() == null)
            return false;
        if (other.getTargetKeyId() != null && other.getTargetKeyId().equals(this.getTargetKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        hashCode = prime * hashCode + ((getTargetKeyId() == null) ? 0 : getTargetKeyId().hashCode());
        return hashCode;
    }

    @Override
    public CreateAliasRequest clone() {
        return (CreateAliasRequest) super.clone();
    }

}
