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
 * A JSON object containing one or more of the following fields:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>UpdateChapCredentialsInput$InitiatorName</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateChapCredentialsInput$SecretToAuthenticateInitiator</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateChapCredentialsInput$SecretToAuthenticateTarget</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateChapCredentialsInput$TargetARN</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateChapCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateChapCredentialsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the <a>DescribeStorediSCSIVolumes</a> operation to
     * return the TargetARN for specified VolumeARN.
     * </p>
     */
    private String targetARN;
    /**
     * <p>
     * The secret key that the initiator (for example, the Windows client) must provide to participate in mutual CHAP
     * with the target.
     * </p>
     * <note>
     * <p>
     * The secret key must be between 12 and 16 bytes when encoded in UTF-8.
     * </p>
     * </note>
     */
    private String secretToAuthenticateInitiator;
    /**
     * <p>
     * The iSCSI initiator that connects to the target.
     * </p>
     */
    private String initiatorName;
    /**
     * <p>
     * The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g. Windows
     * client).
     * </p>
     * <p>
     * Byte constraints: Minimum bytes of 12. Maximum bytes of 16.
     * </p>
     * <note>
     * <p>
     * The secret key must be between 12 and 16 bytes when encoded in UTF-8.
     * </p>
     * </note>
     */
    private String secretToAuthenticateTarget;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the <a>DescribeStorediSCSIVolumes</a> operation to
     * return the TargetARN for specified VolumeARN.
     * </p>
     * 
     * @param targetARN
     *        The Amazon Resource Name (ARN) of the iSCSI volume target. Use the <a>DescribeStorediSCSIVolumes</a>
     *        operation to return the TargetARN for specified VolumeARN.
     */

    public void setTargetARN(String targetARN) {
        this.targetARN = targetARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the <a>DescribeStorediSCSIVolumes</a> operation to
     * return the TargetARN for specified VolumeARN.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the iSCSI volume target. Use the <a>DescribeStorediSCSIVolumes</a>
     *         operation to return the TargetARN for specified VolumeARN.
     */

    public String getTargetARN() {
        return this.targetARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the <a>DescribeStorediSCSIVolumes</a> operation to
     * return the TargetARN for specified VolumeARN.
     * </p>
     * 
     * @param targetARN
     *        The Amazon Resource Name (ARN) of the iSCSI volume target. Use the <a>DescribeStorediSCSIVolumes</a>
     *        operation to return the TargetARN for specified VolumeARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChapCredentialsRequest withTargetARN(String targetARN) {
        setTargetARN(targetARN);
        return this;
    }

    /**
     * <p>
     * The secret key that the initiator (for example, the Windows client) must provide to participate in mutual CHAP
     * with the target.
     * </p>
     * <note>
     * <p>
     * The secret key must be between 12 and 16 bytes when encoded in UTF-8.
     * </p>
     * </note>
     * 
     * @param secretToAuthenticateInitiator
     *        The secret key that the initiator (for example, the Windows client) must provide to participate in mutual
     *        CHAP with the target.</p> <note>
     *        <p>
     *        The secret key must be between 12 and 16 bytes when encoded in UTF-8.
     *        </p>
     */

    public void setSecretToAuthenticateInitiator(String secretToAuthenticateInitiator) {
        this.secretToAuthenticateInitiator = secretToAuthenticateInitiator;
    }

    /**
     * <p>
     * The secret key that the initiator (for example, the Windows client) must provide to participate in mutual CHAP
     * with the target.
     * </p>
     * <note>
     * <p>
     * The secret key must be between 12 and 16 bytes when encoded in UTF-8.
     * </p>
     * </note>
     * 
     * @return The secret key that the initiator (for example, the Windows client) must provide to participate in mutual
     *         CHAP with the target.</p> <note>
     *         <p>
     *         The secret key must be between 12 and 16 bytes when encoded in UTF-8.
     *         </p>
     */

    public String getSecretToAuthenticateInitiator() {
        return this.secretToAuthenticateInitiator;
    }

    /**
     * <p>
     * The secret key that the initiator (for example, the Windows client) must provide to participate in mutual CHAP
     * with the target.
     * </p>
     * <note>
     * <p>
     * The secret key must be between 12 and 16 bytes when encoded in UTF-8.
     * </p>
     * </note>
     * 
     * @param secretToAuthenticateInitiator
     *        The secret key that the initiator (for example, the Windows client) must provide to participate in mutual
     *        CHAP with the target.</p> <note>
     *        <p>
     *        The secret key must be between 12 and 16 bytes when encoded in UTF-8.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChapCredentialsRequest withSecretToAuthenticateInitiator(String secretToAuthenticateInitiator) {
        setSecretToAuthenticateInitiator(secretToAuthenticateInitiator);
        return this;
    }

    /**
     * <p>
     * The iSCSI initiator that connects to the target.
     * </p>
     * 
     * @param initiatorName
     *        The iSCSI initiator that connects to the target.
     */

    public void setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
    }

    /**
     * <p>
     * The iSCSI initiator that connects to the target.
     * </p>
     * 
     * @return The iSCSI initiator that connects to the target.
     */

    public String getInitiatorName() {
        return this.initiatorName;
    }

    /**
     * <p>
     * The iSCSI initiator that connects to the target.
     * </p>
     * 
     * @param initiatorName
     *        The iSCSI initiator that connects to the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChapCredentialsRequest withInitiatorName(String initiatorName) {
        setInitiatorName(initiatorName);
        return this;
    }

    /**
     * <p>
     * The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g. Windows
     * client).
     * </p>
     * <p>
     * Byte constraints: Minimum bytes of 12. Maximum bytes of 16.
     * </p>
     * <note>
     * <p>
     * The secret key must be between 12 and 16 bytes when encoded in UTF-8.
     * </p>
     * </note>
     * 
     * @param secretToAuthenticateTarget
     *        The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g. Windows
     *        client).</p>
     *        <p>
     *        Byte constraints: Minimum bytes of 12. Maximum bytes of 16.
     *        </p>
     *        <note>
     *        <p>
     *        The secret key must be between 12 and 16 bytes when encoded in UTF-8.
     *        </p>
     */

    public void setSecretToAuthenticateTarget(String secretToAuthenticateTarget) {
        this.secretToAuthenticateTarget = secretToAuthenticateTarget;
    }

    /**
     * <p>
     * The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g. Windows
     * client).
     * </p>
     * <p>
     * Byte constraints: Minimum bytes of 12. Maximum bytes of 16.
     * </p>
     * <note>
     * <p>
     * The secret key must be between 12 and 16 bytes when encoded in UTF-8.
     * </p>
     * </note>
     * 
     * @return The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g.
     *         Windows client).</p>
     *         <p>
     *         Byte constraints: Minimum bytes of 12. Maximum bytes of 16.
     *         </p>
     *         <note>
     *         <p>
     *         The secret key must be between 12 and 16 bytes when encoded in UTF-8.
     *         </p>
     */

    public String getSecretToAuthenticateTarget() {
        return this.secretToAuthenticateTarget;
    }

    /**
     * <p>
     * The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g. Windows
     * client).
     * </p>
     * <p>
     * Byte constraints: Minimum bytes of 12. Maximum bytes of 16.
     * </p>
     * <note>
     * <p>
     * The secret key must be between 12 and 16 bytes when encoded in UTF-8.
     * </p>
     * </note>
     * 
     * @param secretToAuthenticateTarget
     *        The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g. Windows
     *        client).</p>
     *        <p>
     *        Byte constraints: Minimum bytes of 12. Maximum bytes of 16.
     *        </p>
     *        <note>
     *        <p>
     *        The secret key must be between 12 and 16 bytes when encoded in UTF-8.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChapCredentialsRequest withSecretToAuthenticateTarget(String secretToAuthenticateTarget) {
        setSecretToAuthenticateTarget(secretToAuthenticateTarget);
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
        if (getTargetARN() != null)
            sb.append("TargetARN: ").append(getTargetARN()).append(",");
        if (getSecretToAuthenticateInitiator() != null)
            sb.append("SecretToAuthenticateInitiator: ").append("***Sensitive Data Redacted***").append(",");
        if (getInitiatorName() != null)
            sb.append("InitiatorName: ").append(getInitiatorName()).append(",");
        if (getSecretToAuthenticateTarget() != null)
            sb.append("SecretToAuthenticateTarget: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateChapCredentialsRequest == false)
            return false;
        UpdateChapCredentialsRequest other = (UpdateChapCredentialsRequest) obj;
        if (other.getTargetARN() == null ^ this.getTargetARN() == null)
            return false;
        if (other.getTargetARN() != null && other.getTargetARN().equals(this.getTargetARN()) == false)
            return false;
        if (other.getSecretToAuthenticateInitiator() == null ^ this.getSecretToAuthenticateInitiator() == null)
            return false;
        if (other.getSecretToAuthenticateInitiator() != null
                && other.getSecretToAuthenticateInitiator().equals(this.getSecretToAuthenticateInitiator()) == false)
            return false;
        if (other.getInitiatorName() == null ^ this.getInitiatorName() == null)
            return false;
        if (other.getInitiatorName() != null && other.getInitiatorName().equals(this.getInitiatorName()) == false)
            return false;
        if (other.getSecretToAuthenticateTarget() == null ^ this.getSecretToAuthenticateTarget() == null)
            return false;
        if (other.getSecretToAuthenticateTarget() != null && other.getSecretToAuthenticateTarget().equals(this.getSecretToAuthenticateTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetARN() == null) ? 0 : getTargetARN().hashCode());
        hashCode = prime * hashCode + ((getSecretToAuthenticateInitiator() == null) ? 0 : getSecretToAuthenticateInitiator().hashCode());
        hashCode = prime * hashCode + ((getInitiatorName() == null) ? 0 : getInitiatorName().hashCode());
        hashCode = prime * hashCode + ((getSecretToAuthenticateTarget() == null) ? 0 : getSecretToAuthenticateTarget().hashCode());
        return hashCode;
    }

    @Override
    public UpdateChapCredentialsRequest clone() {
        return (UpdateChapCredentialsRequest) super.clone();
    }

}
