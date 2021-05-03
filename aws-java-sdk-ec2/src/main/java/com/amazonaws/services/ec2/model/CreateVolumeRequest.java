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
import com.amazonaws.services.ec2.model.transform.CreateVolumeRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVolumeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateVolumeRequest> {

    /**
     * <p>
     * The Availability Zone in which to create the volume.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * Indicates whether the volume should be encrypted. The effect of setting the encryption state to <code>true</code>
     * depends on the volume origin (new or from a snapshot), starting encryption state, ownership, and whether
     * encryption by default is enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default">Encryption by
     * default</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported instance types</a>.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and <code>io2</code>
     * volumes, this represents the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes,
     * this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits
     * for bursting.
     * </p>
     * <p>
     * The following are the supported values for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp3</code>: 3,000-16,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io2</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * </ul>
     * <p>
     * For <code>io1</code> and <code>io2</code> volumes, we guarantee 64,000 IOPS only for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a>. Other instance families guarantee performance up to 32,000 IOPS.
     * </p>
     * <p>
     * This parameter is required for <code>io1</code> and <code>io2</code> volumes. The default for <code>gp3</code>
     * volumes is 3,000 IOPS. This parameter is not supported for <code>gp2</code>, <code>st1</code>, <code>sc1</code>,
     * or <code>standard</code> volumes.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS
     * encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If <code>KmsKeyId</code> is
     * specified, the encrypted state must be <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
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
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid, the
     * action can appear to complete, but eventually fails.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     */
    private String outpostArn;
    /**
     * <p>
     * The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size. If you specify a
     * snapshot, the default is the snapshot size. You can specify a volume size that is equal to or larger than the
     * snapshot size.
     * </p>
     * <p>
     * The following are the supported volumes sizes for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code> and <code>gp3</code>: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> and <code>io2</code>: 4-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code> and <code>sc1</code>: 125-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>standard</code>: 1-1,024
     * </p>
     * </li>
     * </ul>
     */
    private Integer size;
    /**
     * <p>
     * The snapshot from which to create the volume. You must specify either a snapshot ID or a volume size.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The volume type. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose SSD: <code>gp2</code> | <code>gp3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS SSD: <code>io1</code> | <code>io2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Throughput Optimized HDD: <code>st1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cold HDD: <code>sc1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic: <code>standard</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>gp2</code>
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * The tags to apply to the volume during creation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * Indicates whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the volume to up
     * to 16 <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a> in the same Availability Zone. This parameter is supported with <code>io1</code>
     * and <code>io2</code> volumes only. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"> Amazon EBS Multi-Attach</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private Boolean multiAttachEnabled;
    /**
     * <p>
     * The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
     * </p>
     * <p>
     * This parameter is valid only for <code>gp3</code> volumes.
     * </p>
     * <p>
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     * </p>
     */
    private Integer throughput;

    /**
     * Default constructor for CreateVolumeRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CreateVolumeRequest() {
    }

    /**
     * Constructs a new CreateVolumeRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param size
     *        The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size. If you specify a
     *        snapshot, the default is the snapshot size. You can specify a volume size that is equal to or larger than
     *        the snapshot size.</p>
     *        <p>
     *        The following are the supported volumes sizes for each volume type:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp2</code> and <code>gp3</code>: 1-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code> and <code>io2</code>: 4-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>st1</code> and <code>sc1</code>: 125-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>standard</code>: 1-1,024
     *        </p>
     *        </li>
     * @param availabilityZone
     *        The Availability Zone in which to create the volume.
     */
    public CreateVolumeRequest(Integer size, String availabilityZone) {
        setSize(size);
        setAvailabilityZone(availabilityZone);
    }

    /**
     * Constructs a new CreateVolumeRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param snapshotId
     *        The snapshot from which to create the volume. You must specify either a snapshot ID or a volume size.
     * @param availabilityZone
     *        The Availability Zone in which to create the volume.
     */
    public CreateVolumeRequest(String snapshotId, String availabilityZone) {
        setSnapshotId(snapshotId);
        setAvailabilityZone(availabilityZone);
    }

    /**
     * <p>
     * The Availability Zone in which to create the volume.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which to create the volume.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to create the volume.
     * </p>
     * 
     * @return The Availability Zone in which to create the volume.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to create the volume.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which to create the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume should be encrypted. The effect of setting the encryption state to <code>true</code>
     * depends on the volume origin (new or from a snapshot), starting encryption state, ownership, and whether
     * encryption by default is enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default">Encryption by
     * default</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported instance types</a>.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the volume should be encrypted. The effect of setting the encryption state to
     *        <code>true</code> depends on the volume origin (new or from a snapshot), starting encryption state,
     *        ownership, and whether encryption by default is enabled. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default"
     *        >Encryption by default</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *        >Supported instance types</a>.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the volume should be encrypted. The effect of setting the encryption state to <code>true</code>
     * depends on the volume origin (new or from a snapshot), starting encryption state, ownership, and whether
     * encryption by default is enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default">Encryption by
     * default</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported instance types</a>.
     * </p>
     * 
     * @return Indicates whether the volume should be encrypted. The effect of setting the encryption state to
     *         <code>true</code> depends on the volume origin (new or from a snapshot), starting encryption state,
     *         ownership, and whether encryption by default is enabled. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default"
     *         >Encryption by default</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *         <p>
     *         Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *         >Supported instance types</a>.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Indicates whether the volume should be encrypted. The effect of setting the encryption state to <code>true</code>
     * depends on the volume origin (new or from a snapshot), starting encryption state, ownership, and whether
     * encryption by default is enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default">Encryption by
     * default</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported instance types</a>.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the volume should be encrypted. The effect of setting the encryption state to
     *        <code>true</code> depends on the volume origin (new or from a snapshot), starting encryption state,
     *        ownership, and whether encryption by default is enabled. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default"
     *        >Encryption by default</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *        >Supported instance types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume should be encrypted. The effect of setting the encryption state to <code>true</code>
     * depends on the volume origin (new or from a snapshot), starting encryption state, ownership, and whether
     * encryption by default is enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default">Encryption by
     * default</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported instance types</a>.
     * </p>
     * 
     * @return Indicates whether the volume should be encrypted. The effect of setting the encryption state to
     *         <code>true</code> depends on the volume origin (new or from a snapshot), starting encryption state,
     *         ownership, and whether encryption by default is enabled. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default"
     *         >Encryption by default</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *         <p>
     *         Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *         >Supported instance types</a>.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and <code>io2</code>
     * volumes, this represents the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes,
     * this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits
     * for bursting.
     * </p>
     * <p>
     * The following are the supported values for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp3</code>: 3,000-16,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io2</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * </ul>
     * <p>
     * For <code>io1</code> and <code>io2</code> volumes, we guarantee 64,000 IOPS only for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a>. Other instance families guarantee performance up to 32,000 IOPS.
     * </p>
     * <p>
     * This parameter is required for <code>io1</code> and <code>io2</code> volumes. The default for <code>gp3</code>
     * volumes is 3,000 IOPS. This parameter is not supported for <code>gp2</code>, <code>st1</code>, <code>sc1</code>,
     * or <code>standard</code> volumes.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and
     *        <code>io2</code> volumes, this represents the number of IOPS that are provisioned for the volume. For
     *        <code>gp2</code> volumes, this represents the baseline performance of the volume and the rate at which the
     *        volume accumulates I/O credits for bursting.</p>
     *        <p>
     *        The following are the supported values for each volume type:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp3</code>: 3,000-16,000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code>: 100-64,000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io2</code>: 100-64,000 IOPS
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For <code>io1</code> and <code>io2</code> volumes, we guarantee 64,000 IOPS only for <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *        >Instances built on the Nitro System</a>. Other instance families guarantee performance up to 32,000 IOPS.
     *        </p>
     *        <p>
     *        This parameter is required for <code>io1</code> and <code>io2</code> volumes. The default for
     *        <code>gp3</code> volumes is 3,000 IOPS. This parameter is not supported for <code>gp2</code>,
     *        <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and <code>io2</code>
     * volumes, this represents the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes,
     * this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits
     * for bursting.
     * </p>
     * <p>
     * The following are the supported values for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp3</code>: 3,000-16,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io2</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * </ul>
     * <p>
     * For <code>io1</code> and <code>io2</code> volumes, we guarantee 64,000 IOPS only for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a>. Other instance families guarantee performance up to 32,000 IOPS.
     * </p>
     * <p>
     * This parameter is required for <code>io1</code> and <code>io2</code> volumes. The default for <code>gp3</code>
     * volumes is 3,000 IOPS. This parameter is not supported for <code>gp2</code>, <code>st1</code>, <code>sc1</code>,
     * or <code>standard</code> volumes.
     * </p>
     * 
     * @return The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and
     *         <code>io2</code> volumes, this represents the number of IOPS that are provisioned for the volume. For
     *         <code>gp2</code> volumes, this represents the baseline performance of the volume and the rate at which
     *         the volume accumulates I/O credits for bursting.</p>
     *         <p>
     *         The following are the supported values for each volume type:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>gp3</code>: 3,000-16,000 IOPS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>io1</code>: 100-64,000 IOPS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>io2</code>: 100-64,000 IOPS
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For <code>io1</code> and <code>io2</code> volumes, we guarantee 64,000 IOPS only for <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *         >Instances built on the Nitro System</a>. Other instance families guarantee performance up to 32,000
     *         IOPS.
     *         </p>
     *         <p>
     *         This parameter is required for <code>io1</code> and <code>io2</code> volumes. The default for
     *         <code>gp3</code> volumes is 3,000 IOPS. This parameter is not supported for <code>gp2</code>,
     *         <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and <code>io2</code>
     * volumes, this represents the number of IOPS that are provisioned for the volume. For <code>gp2</code> volumes,
     * this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits
     * for bursting.
     * </p>
     * <p>
     * The following are the supported values for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp3</code>: 3,000-16,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io2</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * </ul>
     * <p>
     * For <code>io1</code> and <code>io2</code> volumes, we guarantee 64,000 IOPS only for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a>. Other instance families guarantee performance up to 32,000 IOPS.
     * </p>
     * <p>
     * This parameter is required for <code>io1</code> and <code>io2</code> volumes. The default for <code>gp3</code>
     * volumes is 3,000 IOPS. This parameter is not supported for <code>gp2</code>, <code>st1</code>, <code>sc1</code>,
     * or <code>standard</code> volumes.
     * </p>
     * 
     * @param iops
     *        The number of I/O operations per second (IOPS). For <code>gp3</code>, <code>io1</code>, and
     *        <code>io2</code> volumes, this represents the number of IOPS that are provisioned for the volume. For
     *        <code>gp2</code> volumes, this represents the baseline performance of the volume and the rate at which the
     *        volume accumulates I/O credits for bursting.</p>
     *        <p>
     *        The following are the supported values for each volume type:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp3</code>: 3,000-16,000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code>: 100-64,000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io2</code>: 100-64,000 IOPS
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For <code>io1</code> and <code>io2</code> volumes, we guarantee 64,000 IOPS only for <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *        >Instances built on the Nitro System</a>. Other instance families guarantee performance up to 32,000 IOPS.
     *        </p>
     *        <p>
     *        This parameter is required for <code>io1</code> and <code>io2</code> volumes. The default for
     *        <code>gp3</code> volumes is 3,000 IOPS. This parameter is not supported for <code>gp2</code>,
     *        <code>st1</code>, <code>sc1</code>, or <code>standard</code> volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS
     * encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If <code>KmsKeyId</code> is
     * specified, the encrypted state must be <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
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
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid, the
     * action can appear to complete, but eventually fails.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS
     *        encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If
     *        <code>KmsKeyId</code> is specified, the encrypted state must be <code>true</code>.</p>
     *        <p>
     *        You can specify the CMK using any of the following:
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
     *        AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not
     *        valid, the action can appear to complete, but eventually fails.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS
     * encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If <code>KmsKeyId</code> is
     * specified, the encrypted state must be <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
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
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid, the
     * action can appear to complete, but eventually fails.
     * </p>
     * 
     * @return The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon
     *         EBS encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If
     *         <code>KmsKeyId</code> is specified, the encrypted state must be <code>true</code>.</p>
     *         <p>
     *         You can specify the CMK using any of the following:
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
     *         AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not
     *         valid, the action can appear to complete, but eventually fails.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS
     * encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If <code>KmsKeyId</code> is
     * specified, the encrypted state must be <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
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
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid, the
     * action can appear to complete, but eventually fails.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS
     *        encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If
     *        <code>KmsKeyId</code> is specified, the encrypted state must be <code>true</code>.</p>
     *        <p>
     *        You can specify the CMK using any of the following:
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
     *        AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not
     *        valid, the action can appear to complete, but eventually fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the Outpost.
     */

    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Outpost.
     */

    public String getOutpostArn() {
        return this.outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withOutpostArn(String outpostArn) {
        setOutpostArn(outpostArn);
        return this;
    }

    /**
     * <p>
     * The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size. If you specify a
     * snapshot, the default is the snapshot size. You can specify a volume size that is equal to or larger than the
     * snapshot size.
     * </p>
     * <p>
     * The following are the supported volumes sizes for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code> and <code>gp3</code>: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> and <code>io2</code>: 4-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code> and <code>sc1</code>: 125-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>standard</code>: 1-1,024
     * </p>
     * </li>
     * </ul>
     * 
     * @param size
     *        The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size. If you specify a
     *        snapshot, the default is the snapshot size. You can specify a volume size that is equal to or larger than
     *        the snapshot size.</p>
     *        <p>
     *        The following are the supported volumes sizes for each volume type:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp2</code> and <code>gp3</code>: 1-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code> and <code>io2</code>: 4-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>st1</code> and <code>sc1</code>: 125-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>standard</code>: 1-1,024
     *        </p>
     *        </li>
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size. If you specify a
     * snapshot, the default is the snapshot size. You can specify a volume size that is equal to or larger than the
     * snapshot size.
     * </p>
     * <p>
     * The following are the supported volumes sizes for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code> and <code>gp3</code>: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> and <code>io2</code>: 4-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code> and <code>sc1</code>: 125-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>standard</code>: 1-1,024
     * </p>
     * </li>
     * </ul>
     * 
     * @return The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size. If you specify a
     *         snapshot, the default is the snapshot size. You can specify a volume size that is equal to or larger than
     *         the snapshot size.</p>
     *         <p>
     *         The following are the supported volumes sizes for each volume type:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>gp2</code> and <code>gp3</code>: 1-16,384
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>io1</code> and <code>io2</code>: 4-16,384
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>st1</code> and <code>sc1</code>: 125-16,384
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>standard</code>: 1-1,024
     *         </p>
     *         </li>
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size. If you specify a
     * snapshot, the default is the snapshot size. You can specify a volume size that is equal to or larger than the
     * snapshot size.
     * </p>
     * <p>
     * The following are the supported volumes sizes for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code> and <code>gp3</code>: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> and <code>io2</code>: 4-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code> and <code>sc1</code>: 125-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>standard</code>: 1-1,024
     * </p>
     * </li>
     * </ul>
     * 
     * @param size
     *        The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size. If you specify a
     *        snapshot, the default is the snapshot size. You can specify a volume size that is equal to or larger than
     *        the snapshot size.</p>
     *        <p>
     *        The following are the supported volumes sizes for each volume type:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp2</code> and <code>gp3</code>: 1-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code> and <code>io2</code>: 4-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>st1</code> and <code>sc1</code>: 125-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>standard</code>: 1-1,024
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withSize(Integer size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The snapshot from which to create the volume. You must specify either a snapshot ID or a volume size.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot from which to create the volume. You must specify either a snapshot ID or a volume size.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot from which to create the volume. You must specify either a snapshot ID or a volume size.
     * </p>
     * 
     * @return The snapshot from which to create the volume. You must specify either a snapshot ID or a volume size.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The snapshot from which to create the volume. You must specify either a snapshot ID or a volume size.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot from which to create the volume. You must specify either a snapshot ID or a volume size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The volume type. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose SSD: <code>gp2</code> | <code>gp3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS SSD: <code>io1</code> | <code>io2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Throughput Optimized HDD: <code>st1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cold HDD: <code>sc1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic: <code>standard</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>gp2</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type. This parameter can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose SSD: <code>gp2</code> | <code>gp3</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS SSD: <code>io1</code> | <code>io2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Throughput Optimized HDD: <code>st1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cold HDD: <code>sc1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic: <code>standard</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a>
     *        in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *        </p>
     *        <p>
     *        Default: <code>gp2</code>
     * @see VolumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose SSD: <code>gp2</code> | <code>gp3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS SSD: <code>io1</code> | <code>io2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Throughput Optimized HDD: <code>st1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cold HDD: <code>sc1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic: <code>standard</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>gp2</code>
     * </p>
     * 
     * @return The volume type. This parameter can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         General Purpose SSD: <code>gp2</code> | <code>gp3</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Provisioned IOPS SSD: <code>io1</code> | <code>io2</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Throughput Optimized HDD: <code>st1</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cold HDD: <code>sc1</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Magnetic: <code>standard</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume
     *         types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         </p>
     *         <p>
     *         Default: <code>gp2</code>
     * @see VolumeType
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The volume type. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose SSD: <code>gp2</code> | <code>gp3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS SSD: <code>io1</code> | <code>io2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Throughput Optimized HDD: <code>st1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cold HDD: <code>sc1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic: <code>standard</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>gp2</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type. This parameter can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose SSD: <code>gp2</code> | <code>gp3</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS SSD: <code>io1</code> | <code>io2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Throughput Optimized HDD: <code>st1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cold HDD: <code>sc1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic: <code>standard</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a>
     *        in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *        </p>
     *        <p>
     *        Default: <code>gp2</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public CreateVolumeRequest withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The volume type. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose SSD: <code>gp2</code> | <code>gp3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS SSD: <code>io1</code> | <code>io2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Throughput Optimized HDD: <code>st1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cold HDD: <code>sc1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic: <code>standard</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>gp2</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type. This parameter can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose SSD: <code>gp2</code> | <code>gp3</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS SSD: <code>io1</code> | <code>io2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Throughput Optimized HDD: <code>st1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cold HDD: <code>sc1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic: <code>standard</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a>
     *        in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *        </p>
     *        <p>
     *        Default: <code>gp2</code>
     * @see VolumeType
     */

    public void setVolumeType(VolumeType volumeType) {
        withVolumeType(volumeType);
    }

    /**
     * <p>
     * The volume type. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose SSD: <code>gp2</code> | <code>gp3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS SSD: <code>io1</code> | <code>io2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Throughput Optimized HDD: <code>st1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Cold HDD: <code>sc1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic: <code>standard</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>gp2</code>
     * </p>
     * 
     * @param volumeType
     *        The volume type. This parameter can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose SSD: <code>gp2</code> | <code>gp3</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS SSD: <code>io1</code> | <code>io2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Throughput Optimized HDD: <code>st1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cold HDD: <code>sc1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic: <code>standard</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a>
     *        in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *        </p>
     *        <p>
     *        Default: <code>gp2</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public CreateVolumeRequest withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * <p>
     * The tags to apply to the volume during creation.
     * </p>
     * 
     * @return The tags to apply to the volume during creation.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the volume during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the volume during creation.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the volume during creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the volume during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the volume during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the volume during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the volume to up
     * to 16 <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a> in the same Availability Zone. This parameter is supported with <code>io1</code>
     * and <code>io2</code> volumes only. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"> Amazon EBS Multi-Attach</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param multiAttachEnabled
     *        Indicates whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the volume
     *        to up to 16 <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *        >Instances built on the Nitro System</a> in the same Availability Zone. This parameter is supported with
     *        <code>io1</code> and <code>io2</code> volumes only. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"> Amazon EBS
     *        Multi-Attach</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setMultiAttachEnabled(Boolean multiAttachEnabled) {
        this.multiAttachEnabled = multiAttachEnabled;
    }

    /**
     * <p>
     * Indicates whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the volume to up
     * to 16 <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a> in the same Availability Zone. This parameter is supported with <code>io1</code>
     * and <code>io2</code> volumes only. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"> Amazon EBS Multi-Attach</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Indicates whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the
     *         volume to up to 16 <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *         >Instances built on the Nitro System</a> in the same Availability Zone. This parameter is supported with
     *         <code>io1</code> and <code>io2</code> volumes only. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"> Amazon EBS
     *         Multi-Attach</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean getMultiAttachEnabled() {
        return this.multiAttachEnabled;
    }

    /**
     * <p>
     * Indicates whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the volume to up
     * to 16 <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a> in the same Availability Zone. This parameter is supported with <code>io1</code>
     * and <code>io2</code> volumes only. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"> Amazon EBS Multi-Attach</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param multiAttachEnabled
     *        Indicates whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the volume
     *        to up to 16 <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *        >Instances built on the Nitro System</a> in the same Availability Zone. This parameter is supported with
     *        <code>io1</code> and <code>io2</code> volumes only. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"> Amazon EBS
     *        Multi-Attach</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withMultiAttachEnabled(Boolean multiAttachEnabled) {
        setMultiAttachEnabled(multiAttachEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the volume to up
     * to 16 <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a> in the same Availability Zone. This parameter is supported with <code>io1</code>
     * and <code>io2</code> volumes only. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"> Amazon EBS Multi-Attach</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Indicates whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the
     *         volume to up to 16 <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *         >Instances built on the Nitro System</a> in the same Availability Zone. This parameter is supported with
     *         <code>io1</code> and <code>io2</code> volumes only. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"> Amazon EBS
     *         Multi-Attach</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean isMultiAttachEnabled() {
        return this.multiAttachEnabled;
    }

    /**
     * <p>
     * The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
     * </p>
     * <p>
     * This parameter is valid only for <code>gp3</code> volumes.
     * </p>
     * <p>
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     * </p>
     * 
     * @param throughput
     *        The throughput to provision for a volume, with a maximum of 1,000 MiB/s.</p>
     *        <p>
     *        This parameter is valid only for <code>gp3</code> volumes.
     *        </p>
     *        <p>
     *        Valid Range: Minimum value of 125. Maximum value of 1000.
     */

    public void setThroughput(Integer throughput) {
        this.throughput = throughput;
    }

    /**
     * <p>
     * The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
     * </p>
     * <p>
     * This parameter is valid only for <code>gp3</code> volumes.
     * </p>
     * <p>
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     * </p>
     * 
     * @return The throughput to provision for a volume, with a maximum of 1,000 MiB/s.</p>
     *         <p>
     *         This parameter is valid only for <code>gp3</code> volumes.
     *         </p>
     *         <p>
     *         Valid Range: Minimum value of 125. Maximum value of 1000.
     */

    public Integer getThroughput() {
        return this.throughput;
    }

    /**
     * <p>
     * The throughput to provision for a volume, with a maximum of 1,000 MiB/s.
     * </p>
     * <p>
     * This parameter is valid only for <code>gp3</code> volumes.
     * </p>
     * <p>
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     * </p>
     * 
     * @param throughput
     *        The throughput to provision for a volume, with a maximum of 1,000 MiB/s.</p>
     *        <p>
     *        This parameter is valid only for <code>gp3</code> volumes.
     *        </p>
     *        <p>
     *        Valid Range: Minimum value of 125. Maximum value of 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withThroughput(Integer throughput) {
        setThroughput(throughput);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateVolumeRequest> getDryRunRequest() {
        Request<CreateVolumeRequest> request = new CreateVolumeRequestMarshaller().marshall(this);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: ").append(getOutpostArn()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getMultiAttachEnabled() != null)
            sb.append("MultiAttachEnabled: ").append(getMultiAttachEnabled()).append(",");
        if (getThroughput() != null)
            sb.append("Throughput: ").append(getThroughput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVolumeRequest == false)
            return false;
        CreateVolumeRequest other = (CreateVolumeRequest) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getMultiAttachEnabled() == null ^ this.getMultiAttachEnabled() == null)
            return false;
        if (other.getMultiAttachEnabled() != null && other.getMultiAttachEnabled().equals(this.getMultiAttachEnabled()) == false)
            return false;
        if (other.getThroughput() == null ^ this.getThroughput() == null)
            return false;
        if (other.getThroughput() != null && other.getThroughput().equals(this.getThroughput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getMultiAttachEnabled() == null) ? 0 : getMultiAttachEnabled().hashCode());
        hashCode = prime * hashCode + ((getThroughput() == null) ? 0 : getThroughput().hashCode());
        return hashCode;
    }

    @Override
    public CreateVolumeRequest clone() {
        return (CreateVolumeRequest) super.clone();
    }
}
