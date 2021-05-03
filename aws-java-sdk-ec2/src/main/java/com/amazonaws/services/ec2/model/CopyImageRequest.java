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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CopyImageRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CopyImage.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyImageRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CopyImageRequest> {

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A description for the new AMI in the destination Region.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies whether the destination snapshots of the copied image should be encrypted. You can encrypt a copy of an
     * unencrypted snapshot, but you cannot create an unencrypted copy of an encrypted snapshot. The default CMK for EBS
     * is used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK using <code>KmsKeyId</code>.
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The identifier of the symmetric AWS Key Management Service (AWS KMS) customer master key (CMK) to use when
     * creating encrypted volumes. If this parameter is not specified, your AWS managed CMK for EBS is used. If you
     * specify a CMK, you must also set the encrypted state to <code>true</code>.
     * </p>
     * <p>
     * You can specify a CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an identifier that is not valid, the action
     * can appear to complete, but eventually fails.
     * </p>
     * <p>
     * The specified CMK must exist in the destination Region.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric CMKs.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The name of the new AMI in the destination Region.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the AMI to copy.
     * </p>
     */
    private String sourceImageId;
    /**
     * <p>
     * The name of the Region that contains the AMI to copy.
     * </p>
     */
    private String sourceRegion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost to which to copy the AMI. Only specify this parameter when copying
     * an AMI from an AWS Region to an Outpost. The AMI must be in the Region of the destination Outpost. You cannot
     * copy an AMI from an Outpost to a Region, from one Outpost to another, or within the same Outpost.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#copy-amis"> Copying AMIs from
     * an AWS Region to an Outpost</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String destinationOutpostArn;

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *         see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A description for the new AMI in the destination Region.
     * </p>
     * 
     * @param description
     *        A description for the new AMI in the destination Region.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the new AMI in the destination Region.
     * </p>
     * 
     * @return A description for the new AMI in the destination Region.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the new AMI in the destination Region.
     * </p>
     * 
     * @param description
     *        A description for the new AMI in the destination Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies whether the destination snapshots of the copied image should be encrypted. You can encrypt a copy of an
     * unencrypted snapshot, but you cannot create an unencrypted copy of an encrypted snapshot. The default CMK for EBS
     * is used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK using <code>KmsKeyId</code>.
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the destination snapshots of the copied image should be encrypted. You can encrypt a
     *        copy of an unencrypted snapshot, but you cannot create an unencrypted copy of an encrypted snapshot. The
     *        default CMK for EBS is used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK
     *        using <code>KmsKeyId</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Specifies whether the destination snapshots of the copied image should be encrypted. You can encrypt a copy of an
     * unencrypted snapshot, but you cannot create an unencrypted copy of an encrypted snapshot. The default CMK for EBS
     * is used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK using <code>KmsKeyId</code>.
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies whether the destination snapshots of the copied image should be encrypted. You can encrypt a
     *         copy of an unencrypted snapshot, but you cannot create an unencrypted copy of an encrypted snapshot. The
     *         default CMK for EBS is used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK
     *         using <code>KmsKeyId</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a>
     *         in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Specifies whether the destination snapshots of the copied image should be encrypted. You can encrypt a copy of an
     * unencrypted snapshot, but you cannot create an unencrypted copy of an encrypted snapshot. The default CMK for EBS
     * is used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK using <code>KmsKeyId</code>.
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the destination snapshots of the copied image should be encrypted. You can encrypt a
     *        copy of an unencrypted snapshot, but you cannot create an unencrypted copy of an encrypted snapshot. The
     *        default CMK for EBS is used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK
     *        using <code>KmsKeyId</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageRequest withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the destination snapshots of the copied image should be encrypted. You can encrypt a copy of an
     * unencrypted snapshot, but you cannot create an unencrypted copy of an encrypted snapshot. The default CMK for EBS
     * is used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK using <code>KmsKeyId</code>.
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies whether the destination snapshots of the copied image should be encrypted. You can encrypt a
     *         copy of an unencrypted snapshot, but you cannot create an unencrypted copy of an encrypted snapshot. The
     *         default CMK for EBS is used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK
     *         using <code>KmsKeyId</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a>
     *         in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The identifier of the symmetric AWS Key Management Service (AWS KMS) customer master key (CMK) to use when
     * creating encrypted volumes. If this parameter is not specified, your AWS managed CMK for EBS is used. If you
     * specify a CMK, you must also set the encrypted state to <code>true</code>.
     * </p>
     * <p>
     * You can specify a CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an identifier that is not valid, the action
     * can appear to complete, but eventually fails.
     * </p>
     * <p>
     * The specified CMK must exist in the destination Region.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric CMKs.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of the symmetric AWS Key Management Service (AWS KMS) customer master key (CMK) to use when
     *        creating encrypted volumes. If this parameter is not specified, your AWS managed CMK for EBS is used. If
     *        you specify a CMK, you must also set the encrypted state to <code>true</code>.</p>
     *        <p>
     *        You can specify a CMK using any of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias. For example, alias/ExampleAlias.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        AWS authenticates the CMK asynchronously. Therefore, if you specify an identifier that is not valid, the
     *        action can appear to complete, but eventually fails.
     *        </p>
     *        <p>
     *        The specified CMK must exist in the destination Region.
     *        </p>
     *        <p>
     *        Amazon EBS does not support asymmetric CMKs.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the symmetric AWS Key Management Service (AWS KMS) customer master key (CMK) to use when
     * creating encrypted volumes. If this parameter is not specified, your AWS managed CMK for EBS is used. If you
     * specify a CMK, you must also set the encrypted state to <code>true</code>.
     * </p>
     * <p>
     * You can specify a CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an identifier that is not valid, the action
     * can appear to complete, but eventually fails.
     * </p>
     * <p>
     * The specified CMK must exist in the destination Region.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric CMKs.
     * </p>
     * 
     * @return The identifier of the symmetric AWS Key Management Service (AWS KMS) customer master key (CMK) to use
     *         when creating encrypted volumes. If this parameter is not specified, your AWS managed CMK for EBS is
     *         used. If you specify a CMK, you must also set the encrypted state to <code>true</code>.</p>
     *         <p>
     *         You can specify a CMK using any of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key alias. For example, alias/ExampleAlias.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         AWS authenticates the CMK asynchronously. Therefore, if you specify an identifier that is not valid, the
     *         action can appear to complete, but eventually fails.
     *         </p>
     *         <p>
     *         The specified CMK must exist in the destination Region.
     *         </p>
     *         <p>
     *         Amazon EBS does not support asymmetric CMKs.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the symmetric AWS Key Management Service (AWS KMS) customer master key (CMK) to use when
     * creating encrypted volumes. If this parameter is not specified, your AWS managed CMK for EBS is used. If you
     * specify a CMK, you must also set the encrypted state to <code>true</code>.
     * </p>
     * <p>
     * You can specify a CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an identifier that is not valid, the action
     * can appear to complete, but eventually fails.
     * </p>
     * <p>
     * The specified CMK must exist in the destination Region.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric CMKs.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of the symmetric AWS Key Management Service (AWS KMS) customer master key (CMK) to use when
     *        creating encrypted volumes. If this parameter is not specified, your AWS managed CMK for EBS is used. If
     *        you specify a CMK, you must also set the encrypted state to <code>true</code>.</p>
     *        <p>
     *        You can specify a CMK using any of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias. For example, alias/ExampleAlias.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        AWS authenticates the CMK asynchronously. Therefore, if you specify an identifier that is not valid, the
     *        action can appear to complete, but eventually fails.
     *        </p>
     *        <p>
     *        The specified CMK must exist in the destination Region.
     *        </p>
     *        <p>
     *        Amazon EBS does not support asymmetric CMKs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The name of the new AMI in the destination Region.
     * </p>
     * 
     * @param name
     *        The name of the new AMI in the destination Region.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new AMI in the destination Region.
     * </p>
     * 
     * @return The name of the new AMI in the destination Region.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the new AMI in the destination Region.
     * </p>
     * 
     * @param name
     *        The name of the new AMI in the destination Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the AMI to copy.
     * </p>
     * 
     * @param sourceImageId
     *        The ID of the AMI to copy.
     */

    public void setSourceImageId(String sourceImageId) {
        this.sourceImageId = sourceImageId;
    }

    /**
     * <p>
     * The ID of the AMI to copy.
     * </p>
     * 
     * @return The ID of the AMI to copy.
     */

    public String getSourceImageId() {
        return this.sourceImageId;
    }

    /**
     * <p>
     * The ID of the AMI to copy.
     * </p>
     * 
     * @param sourceImageId
     *        The ID of the AMI to copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageRequest withSourceImageId(String sourceImageId) {
        setSourceImageId(sourceImageId);
        return this;
    }

    /**
     * <p>
     * The name of the Region that contains the AMI to copy.
     * </p>
     * 
     * @param sourceRegion
     *        The name of the Region that contains the AMI to copy.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The name of the Region that contains the AMI to copy.
     * </p>
     * 
     * @return The name of the Region that contains the AMI to copy.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * <p>
     * The name of the Region that contains the AMI to copy.
     * </p>
     * 
     * @param sourceRegion
     *        The name of the Region that contains the AMI to copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageRequest withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost to which to copy the AMI. Only specify this parameter when copying
     * an AMI from an AWS Region to an Outpost. The AMI must be in the Region of the destination Outpost. You cannot
     * copy an AMI from an Outpost to a Region, from one Outpost to another, or within the same Outpost.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#copy-amis"> Copying AMIs from
     * an AWS Region to an Outpost</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param destinationOutpostArn
     *        The Amazon Resource Name (ARN) of the Outpost to which to copy the AMI. Only specify this parameter when
     *        copying an AMI from an AWS Region to an Outpost. The AMI must be in the Region of the destination Outpost.
     *        You cannot copy an AMI from an Outpost to a Region, from one Outpost to another, or within the same
     *        Outpost.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#copy-amis"> Copying AMIs
     *        from an AWS Region to an Outpost</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setDestinationOutpostArn(String destinationOutpostArn) {
        this.destinationOutpostArn = destinationOutpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost to which to copy the AMI. Only specify this parameter when copying
     * an AMI from an AWS Region to an Outpost. The AMI must be in the Region of the destination Outpost. You cannot
     * copy an AMI from an Outpost to a Region, from one Outpost to another, or within the same Outpost.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#copy-amis"> Copying AMIs from
     * an AWS Region to an Outpost</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Outpost to which to copy the AMI. Only specify this parameter when
     *         copying an AMI from an AWS Region to an Outpost. The AMI must be in the Region of the destination
     *         Outpost. You cannot copy an AMI from an Outpost to a Region, from one Outpost to another, or within the
     *         same Outpost.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#copy-amis"> Copying
     *         AMIs from an AWS Region to an Outpost</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public String getDestinationOutpostArn() {
        return this.destinationOutpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost to which to copy the AMI. Only specify this parameter when copying
     * an AMI from an AWS Region to an Outpost. The AMI must be in the Region of the destination Outpost. You cannot
     * copy an AMI from an Outpost to a Region, from one Outpost to another, or within the same Outpost.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#copy-amis"> Copying AMIs from
     * an AWS Region to an Outpost</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param destinationOutpostArn
     *        The Amazon Resource Name (ARN) of the Outpost to which to copy the AMI. Only specify this parameter when
     *        copying an AMI from an AWS Region to an Outpost. The AMI must be in the Region of the destination Outpost.
     *        You cannot copy an AMI from an Outpost to a Region, from one Outpost to another, or within the same
     *        Outpost.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#copy-amis"> Copying AMIs
     *        from an AWS Region to an Outpost</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageRequest withDestinationOutpostArn(String destinationOutpostArn) {
        setDestinationOutpostArn(destinationOutpostArn);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CopyImageRequest> getDryRunRequest() {
        Request<CopyImageRequest> request = new CopyImageRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSourceImageId() != null)
            sb.append("SourceImageId: ").append(getSourceImageId()).append(",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion()).append(",");
        if (getDestinationOutpostArn() != null)
            sb.append("DestinationOutpostArn: ").append(getDestinationOutpostArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyImageRequest == false)
            return false;
        CopyImageRequest other = (CopyImageRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSourceImageId() == null ^ this.getSourceImageId() == null)
            return false;
        if (other.getSourceImageId() != null && other.getSourceImageId().equals(this.getSourceImageId()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        if (other.getDestinationOutpostArn() == null ^ this.getDestinationOutpostArn() == null)
            return false;
        if (other.getDestinationOutpostArn() != null && other.getDestinationOutpostArn().equals(this.getDestinationOutpostArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSourceImageId() == null) ? 0 : getSourceImageId().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode + ((getDestinationOutpostArn() == null) ? 0 : getDestinationOutpostArn().hashCode());
        return hashCode;
    }

    @Override
    public CopyImageRequest clone() {
        return (CopyImageRequest) super.clone();
    }
}
