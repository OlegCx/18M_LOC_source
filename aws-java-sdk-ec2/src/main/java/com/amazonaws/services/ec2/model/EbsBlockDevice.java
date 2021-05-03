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

/**
 * <p>
 * Describes a block device for an EBS volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EbsBlockDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsBlockDevice implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination"
     * >Preserving Amazon EBS volumes on instance termination</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     */
    private Boolean deleteOnTermination;
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
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;
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
     * <code>gp2</code> and <code>gp3</code>:1-16,384
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
    private Integer volumeSize;
    /**
     * <p>
     * The volume type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a> in the
     * <i>Amazon EC2 User Guide</i>. If the volume type is <code>io1</code> or <code>io2</code>, you must specify the
     * IOPS that the volume supports.
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under which the EBS volume is
     * encrypted.
     * </p>
     * <p>
     * This parameter is only supported on <code>BlockDeviceMapping</code> objects called by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>, <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html">RequestSpotFleet</a>, and
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html">
     * RequestSpotInstances</a>.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The throughput that the volume supports, in MiB/s.
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
     * <p>
     * The ARN of the Outpost on which the snapshot is stored.
     * </p>
     */
    private String outpostArn;
    /**
     * <p>
     * Indicates whether the encryption state of an EBS volume is changed while being restored from a backing snapshot.
     * The effect of setting the encryption state to <code>true</code> depends on the volume origin (new or from a
     * snapshot), starting encryption state, ownership, and whether encryption by default is enabled. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters">Amazon EBS
     * encryption</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * In no case can you remove encryption from an encrypted volume.
     * </p>
     * <p>
     * Encrypted volumes can only be attached to instances that support Amazon EBS encryption. For more information, see
     * <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported instance types</a>.
     * </p>
     * <p>
     * This parameter is not returned by .
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination"
     * >Preserving Amazon EBS volumes on instance termination</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the EBS volume is deleted on instance termination. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination"
     *        >Preserving Amazon EBS volumes on instance termination</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination"
     * >Preserving Amazon EBS volumes on instance termination</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @return Indicates whether the EBS volume is deleted on instance termination. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination"
     *         >Preserving Amazon EBS volumes on instance termination</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination"
     * >Preserving Amazon EBS volumes on instance termination</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the EBS volume is deleted on instance termination. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination"
     *        >Preserving Amazon EBS volumes on instance termination</a> in the <i>Amazon EC2 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsBlockDevice withDeleteOnTermination(Boolean deleteOnTermination) {
        setDeleteOnTermination(deleteOnTermination);
        return this;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination"
     * >Preserving Amazon EBS volumes on instance termination</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @return Indicates whether the EBS volume is deleted on instance termination. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination"
     *         >Preserving Amazon EBS volumes on instance termination</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public Boolean isDeleteOnTermination() {
        return this.deleteOnTermination;
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

    public EbsBlockDevice withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @return The ID of the snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsBlockDevice withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
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
     * <code>gp2</code> and <code>gp3</code>:1-16,384
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
     * @param volumeSize
     *        The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size. If you specify a
     *        snapshot, the default is the snapshot size. You can specify a volume size that is equal to or larger than
     *        the snapshot size.</p>
     *        <p>
     *        The following are the supported volumes sizes for each volume type:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp2</code> and <code>gp3</code>:1-16,384
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

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
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
     * <code>gp2</code> and <code>gp3</code>:1-16,384
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
     *         <code>gp2</code> and <code>gp3</code>:1-16,384
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

    public Integer getVolumeSize() {
        return this.volumeSize;
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
     * <code>gp2</code> and <code>gp3</code>:1-16,384
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
     * @param volumeSize
     *        The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size. If you specify a
     *        snapshot, the default is the snapshot size. You can specify a volume size that is equal to or larger than
     *        the snapshot size.</p>
     *        <p>
     *        The following are the supported volumes sizes for each volume type:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp2</code> and <code>gp3</code>:1-16,384
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

    public EbsBlockDevice withVolumeSize(Integer volumeSize) {
        setVolumeSize(volumeSize);
        return this;
    }

    /**
     * <p>
     * The volume type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a> in the
     * <i>Amazon EC2 User Guide</i>. If the volume type is <code>io1</code> or <code>io2</code>, you must specify the
     * IOPS that the volume supports.
     * </p>
     * 
     * @param volumeType
     *        The volume type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a>
     *        in the <i>Amazon EC2 User Guide</i>. If the volume type is <code>io1</code> or <code>io2</code>, you must
     *        specify the IOPS that the volume supports.
     * @see VolumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a> in the
     * <i>Amazon EC2 User Guide</i>. If the volume type is <code>io1</code> or <code>io2</code>, you must specify the
     * IOPS that the volume supports.
     * </p>
     * 
     * @return The volume type. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume
     *         types</a> in the <i>Amazon EC2 User Guide</i>. If the volume type is <code>io1</code> or <code>io2</code>
     *         , you must specify the IOPS that the volume supports.
     * @see VolumeType
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The volume type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a> in the
     * <i>Amazon EC2 User Guide</i>. If the volume type is <code>io1</code> or <code>io2</code>, you must specify the
     * IOPS that the volume supports.
     * </p>
     * 
     * @param volumeType
     *        The volume type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a>
     *        in the <i>Amazon EC2 User Guide</i>. If the volume type is <code>io1</code> or <code>io2</code>, you must
     *        specify the IOPS that the volume supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public EbsBlockDevice withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The volume type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a> in the
     * <i>Amazon EC2 User Guide</i>. If the volume type is <code>io1</code> or <code>io2</code>, you must specify the
     * IOPS that the volume supports.
     * </p>
     * 
     * @param volumeType
     *        The volume type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a>
     *        in the <i>Amazon EC2 User Guide</i>. If the volume type is <code>io1</code> or <code>io2</code>, you must
     *        specify the IOPS that the volume supports.
     * @see VolumeType
     */

    public void setVolumeType(VolumeType volumeType) {
        withVolumeType(volumeType);
    }

    /**
     * <p>
     * The volume type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a> in the
     * <i>Amazon EC2 User Guide</i>. If the volume type is <code>io1</code> or <code>io2</code>, you must specify the
     * IOPS that the volume supports.
     * </p>
     * 
     * @param volumeType
     *        The volume type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a>
     *        in the <i>Amazon EC2 User Guide</i>. If the volume type is <code>io1</code> or <code>io2</code>, you must
     *        specify the IOPS that the volume supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public EbsBlockDevice withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * <p>
     * Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under which the EBS volume is
     * encrypted.
     * </p>
     * <p>
     * This parameter is only supported on <code>BlockDeviceMapping</code> objects called by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>, <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html">RequestSpotFleet</a>, and
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html">
     * RequestSpotInstances</a>.
     * </p>
     * 
     * @param kmsKeyId
     *        Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under which the EBS volume
     *        is encrypted.</p>
     *        <p>
     *        This parameter is only supported on <code>BlockDeviceMapping</code> objects called by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>, <a
     *        href
     *        ="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html">RequestSpotFleet</a>,
     *        and <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html">
     *        RequestSpotInstances</a>.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under which the EBS volume is
     * encrypted.
     * </p>
     * <p>
     * This parameter is only supported on <code>BlockDeviceMapping</code> objects called by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>, <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html">RequestSpotFleet</a>, and
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html">
     * RequestSpotInstances</a>.
     * </p>
     * 
     * @return Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under which the EBS
     *         volume is encrypted.</p>
     *         <p>
     *         This parameter is only supported on <code>BlockDeviceMapping</code> objects called by <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>, <a
     *         href
     *         ="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html">RequestSpotFleet</a>,
     *         and <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html">
     *         RequestSpotInstances</a>.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under which the EBS volume is
     * encrypted.
     * </p>
     * <p>
     * This parameter is only supported on <code>BlockDeviceMapping</code> objects called by <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>, <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html">RequestSpotFleet</a>, and
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html">
     * RequestSpotInstances</a>.
     * </p>
     * 
     * @param kmsKeyId
     *        Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under which the EBS volume
     *        is encrypted.</p>
     *        <p>
     *        This parameter is only supported on <code>BlockDeviceMapping</code> objects called by <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances</a>, <a
     *        href
     *        ="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html">RequestSpotFleet</a>,
     *        and <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html">
     *        RequestSpotInstances</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsBlockDevice withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The throughput that the volume supports, in MiB/s.
     * </p>
     * <p>
     * This parameter is valid only for <code>gp3</code> volumes.
     * </p>
     * <p>
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     * </p>
     * 
     * @param throughput
     *        The throughput that the volume supports, in MiB/s.</p>
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
     * The throughput that the volume supports, in MiB/s.
     * </p>
     * <p>
     * This parameter is valid only for <code>gp3</code> volumes.
     * </p>
     * <p>
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     * </p>
     * 
     * @return The throughput that the volume supports, in MiB/s.</p>
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
     * The throughput that the volume supports, in MiB/s.
     * </p>
     * <p>
     * This parameter is valid only for <code>gp3</code> volumes.
     * </p>
     * <p>
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     * </p>
     * 
     * @param throughput
     *        The throughput that the volume supports, in MiB/s.</p>
     *        <p>
     *        This parameter is valid only for <code>gp3</code> volumes.
     *        </p>
     *        <p>
     *        Valid Range: Minimum value of 125. Maximum value of 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsBlockDevice withThroughput(Integer throughput) {
        setThroughput(throughput);
        return this;
    }

    /**
     * <p>
     * The ARN of the Outpost on which the snapshot is stored.
     * </p>
     * 
     * @param outpostArn
     *        The ARN of the Outpost on which the snapshot is stored.
     */

    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The ARN of the Outpost on which the snapshot is stored.
     * </p>
     * 
     * @return The ARN of the Outpost on which the snapshot is stored.
     */

    public String getOutpostArn() {
        return this.outpostArn;
    }

    /**
     * <p>
     * The ARN of the Outpost on which the snapshot is stored.
     * </p>
     * 
     * @param outpostArn
     *        The ARN of the Outpost on which the snapshot is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsBlockDevice withOutpostArn(String outpostArn) {
        setOutpostArn(outpostArn);
        return this;
    }

    /**
     * <p>
     * Indicates whether the encryption state of an EBS volume is changed while being restored from a backing snapshot.
     * The effect of setting the encryption state to <code>true</code> depends on the volume origin (new or from a
     * snapshot), starting encryption state, ownership, and whether encryption by default is enabled. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters">Amazon EBS
     * encryption</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * In no case can you remove encryption from an encrypted volume.
     * </p>
     * <p>
     * Encrypted volumes can only be attached to instances that support Amazon EBS encryption. For more information, see
     * <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported instance types</a>.
     * </p>
     * <p>
     * This parameter is not returned by .
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the encryption state of an EBS volume is changed while being restored from a backing
     *        snapshot. The effect of setting the encryption state to <code>true</code> depends on the volume origin
     *        (new or from a snapshot), starting encryption state, ownership, and whether encryption by default is
     *        enabled. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters">Amazon
     *        EBS encryption</a> in the <i>Amazon EC2 User Guide</i>.</p>
     *        <p>
     *        In no case can you remove encryption from an encrypted volume.
     *        </p>
     *        <p>
     *        Encrypted volumes can only be attached to instances that support Amazon EBS encryption. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *        >Supported instance types</a>.
     *        </p>
     *        <p>
     *        This parameter is not returned by .
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the encryption state of an EBS volume is changed while being restored from a backing snapshot.
     * The effect of setting the encryption state to <code>true</code> depends on the volume origin (new or from a
     * snapshot), starting encryption state, ownership, and whether encryption by default is enabled. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters">Amazon EBS
     * encryption</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * In no case can you remove encryption from an encrypted volume.
     * </p>
     * <p>
     * Encrypted volumes can only be attached to instances that support Amazon EBS encryption. For more information, see
     * <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported instance types</a>.
     * </p>
     * <p>
     * This parameter is not returned by .
     * </p>
     * 
     * @return Indicates whether the encryption state of an EBS volume is changed while being restored from a backing
     *         snapshot. The effect of setting the encryption state to <code>true</code> depends on the volume origin
     *         (new or from a snapshot), starting encryption state, ownership, and whether encryption by default is
     *         enabled. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters"
     *         >Amazon EBS encryption</a> in the <i>Amazon EC2 User Guide</i>.</p>
     *         <p>
     *         In no case can you remove encryption from an encrypted volume.
     *         </p>
     *         <p>
     *         Encrypted volumes can only be attached to instances that support Amazon EBS encryption. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *         >Supported instance types</a>.
     *         </p>
     *         <p>
     *         This parameter is not returned by .
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Indicates whether the encryption state of an EBS volume is changed while being restored from a backing snapshot.
     * The effect of setting the encryption state to <code>true</code> depends on the volume origin (new or from a
     * snapshot), starting encryption state, ownership, and whether encryption by default is enabled. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters">Amazon EBS
     * encryption</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * In no case can you remove encryption from an encrypted volume.
     * </p>
     * <p>
     * Encrypted volumes can only be attached to instances that support Amazon EBS encryption. For more information, see
     * <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported instance types</a>.
     * </p>
     * <p>
     * This parameter is not returned by .
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the encryption state of an EBS volume is changed while being restored from a backing
     *        snapshot. The effect of setting the encryption state to <code>true</code> depends on the volume origin
     *        (new or from a snapshot), starting encryption state, ownership, and whether encryption by default is
     *        enabled. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters">Amazon
     *        EBS encryption</a> in the <i>Amazon EC2 User Guide</i>.</p>
     *        <p>
     *        In no case can you remove encryption from an encrypted volume.
     *        </p>
     *        <p>
     *        Encrypted volumes can only be attached to instances that support Amazon EBS encryption. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *        >Supported instance types</a>.
     *        </p>
     *        <p>
     *        This parameter is not returned by .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsBlockDevice withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the encryption state of an EBS volume is changed while being restored from a backing snapshot.
     * The effect of setting the encryption state to <code>true</code> depends on the volume origin (new or from a
     * snapshot), starting encryption state, ownership, and whether encryption by default is enabled. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters">Amazon EBS
     * encryption</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * In no case can you remove encryption from an encrypted volume.
     * </p>
     * <p>
     * Encrypted volumes can only be attached to instances that support Amazon EBS encryption. For more information, see
     * <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported instance types</a>.
     * </p>
     * <p>
     * This parameter is not returned by .
     * </p>
     * 
     * @return Indicates whether the encryption state of an EBS volume is changed while being restored from a backing
     *         snapshot. The effect of setting the encryption state to <code>true</code> depends on the volume origin
     *         (new or from a snapshot), starting encryption state, ownership, and whether encryption by default is
     *         enabled. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters"
     *         >Amazon EBS encryption</a> in the <i>Amazon EC2 User Guide</i>.</p>
     *         <p>
     *         In no case can you remove encryption from an encrypted volume.
     *         </p>
     *         <p>
     *         Encrypted volumes can only be attached to instances that support Amazon EBS encryption. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     *         >Supported instance types</a>.
     *         </p>
     *         <p>
     *         This parameter is not returned by .
     */

    public Boolean isEncrypted() {
        return this.encrypted;
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
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: ").append(getDeleteOnTermination()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getVolumeSize() != null)
            sb.append("VolumeSize: ").append(getVolumeSize()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getThroughput() != null)
            sb.append("Throughput: ").append(getThroughput()).append(",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: ").append(getOutpostArn()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsBlockDevice == false)
            return false;
        EbsBlockDevice other = (EbsBlockDevice) obj;
        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getThroughput() == null ^ this.getThroughput() == null)
            return false;
        if (other.getThroughput() != null && other.getThroughput().equals(this.getThroughput()) == false)
            return false;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getThroughput() == null) ? 0 : getThroughput().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        return hashCode;
    }

    @Override
    public EbsBlockDevice clone() {
        try {
            return (EbsBlockDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
