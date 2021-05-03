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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the network interface attachment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2NetworkInterfaceAttachment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2NetworkInterfaceAttachment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates when the attachment initiated.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String attachTime;
    /**
     * <p>
     * The identifier of the network interface attachment
     * </p>
     */
    private String attachmentId;
    /**
     * <p>
     * Indicates whether the network interface is deleted when the instance is terminated.
     * </p>
     */
    private Boolean deleteOnTermination;
    /**
     * <p>
     * The device index of the network interface attachment on the instance.
     * </p>
     */
    private Integer deviceIndex;
    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The AWS account ID of the owner of the instance.
     * </p>
     */
    private String instanceOwnerId;
    /**
     * <p>
     * The attachment state.
     * </p>
     * <p>
     * Valid values: <code>attaching</code> | <code>attached</code> | <code>detaching</code> | <code>detached</code>
     * </p>
     */
    private String status;

    /**
     * <p>
     * Indicates when the attachment initiated.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param attachTime
     *        Indicates when the attachment initiated.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setAttachTime(String attachTime) {
        this.attachTime = attachTime;
    }

    /**
     * <p>
     * Indicates when the attachment initiated.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the attachment initiated.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getAttachTime() {
        return this.attachTime;
    }

    /**
     * <p>
     * Indicates when the attachment initiated.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param attachTime
     *        Indicates when the attachment initiated.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceAttachment withAttachTime(String attachTime) {
        setAttachTime(attachTime);
        return this;
    }

    /**
     * <p>
     * The identifier of the network interface attachment
     * </p>
     * 
     * @param attachmentId
     *        The identifier of the network interface attachment
     */

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * <p>
     * The identifier of the network interface attachment
     * </p>
     * 
     * @return The identifier of the network interface attachment
     */

    public String getAttachmentId() {
        return this.attachmentId;
    }

    /**
     * <p>
     * The identifier of the network interface attachment
     * </p>
     * 
     * @param attachmentId
     *        The identifier of the network interface attachment
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceAttachment withAttachmentId(String attachmentId) {
        setAttachmentId(attachmentId);
        return this;
    }

    /**
     * <p>
     * Indicates whether the network interface is deleted when the instance is terminated.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the network interface is deleted when the instance is terminated.
     */

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the network interface is deleted when the instance is terminated.
     * </p>
     * 
     * @return Indicates whether the network interface is deleted when the instance is terminated.
     */

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the network interface is deleted when the instance is terminated.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the network interface is deleted when the instance is terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceAttachment withDeleteOnTermination(Boolean deleteOnTermination) {
        setDeleteOnTermination(deleteOnTermination);
        return this;
    }

    /**
     * <p>
     * Indicates whether the network interface is deleted when the instance is terminated.
     * </p>
     * 
     * @return Indicates whether the network interface is deleted when the instance is terminated.
     */

    public Boolean isDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * The device index of the network interface attachment on the instance.
     * </p>
     * 
     * @param deviceIndex
     *        The device index of the network interface attachment on the instance.
     */

    public void setDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
    }

    /**
     * <p>
     * The device index of the network interface attachment on the instance.
     * </p>
     * 
     * @return The device index of the network interface attachment on the instance.
     */

    public Integer getDeviceIndex() {
        return this.deviceIndex;
    }

    /**
     * <p>
     * The device index of the network interface attachment on the instance.
     * </p>
     * 
     * @param deviceIndex
     *        The device index of the network interface attachment on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceAttachment withDeviceIndex(Integer deviceIndex) {
        setDeviceIndex(deviceIndex);
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceAttachment withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the instance.
     * </p>
     * 
     * @param instanceOwnerId
     *        The AWS account ID of the owner of the instance.
     */

    public void setInstanceOwnerId(String instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the instance.
     * </p>
     * 
     * @return The AWS account ID of the owner of the instance.
     */

    public String getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the instance.
     * </p>
     * 
     * @param instanceOwnerId
     *        The AWS account ID of the owner of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceAttachment withInstanceOwnerId(String instanceOwnerId) {
        setInstanceOwnerId(instanceOwnerId);
        return this;
    }

    /**
     * <p>
     * The attachment state.
     * </p>
     * <p>
     * Valid values: <code>attaching</code> | <code>attached</code> | <code>detaching</code> | <code>detached</code>
     * </p>
     * 
     * @param status
     *        The attachment state.</p>
     *        <p>
     *        Valid values: <code>attaching</code> | <code>attached</code> | <code>detaching</code> |
     *        <code>detached</code>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The attachment state.
     * </p>
     * <p>
     * Valid values: <code>attaching</code> | <code>attached</code> | <code>detaching</code> | <code>detached</code>
     * </p>
     * 
     * @return The attachment state.</p>
     *         <p>
     *         Valid values: <code>attaching</code> | <code>attached</code> | <code>detaching</code> |
     *         <code>detached</code>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The attachment state.
     * </p>
     * <p>
     * Valid values: <code>attaching</code> | <code>attached</code> | <code>detaching</code> | <code>detached</code>
     * </p>
     * 
     * @param status
     *        The attachment state.</p>
     *        <p>
     *        Valid values: <code>attaching</code> | <code>attached</code> | <code>detaching</code> |
     *        <code>detached</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceAttachment withStatus(String status) {
        setStatus(status);
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
        if (getAttachTime() != null)
            sb.append("AttachTime: ").append(getAttachTime()).append(",");
        if (getAttachmentId() != null)
            sb.append("AttachmentId: ").append(getAttachmentId()).append(",");
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: ").append(getDeleteOnTermination()).append(",");
        if (getDeviceIndex() != null)
            sb.append("DeviceIndex: ").append(getDeviceIndex()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getInstanceOwnerId() != null)
            sb.append("InstanceOwnerId: ").append(getInstanceOwnerId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2NetworkInterfaceAttachment == false)
            return false;
        AwsEc2NetworkInterfaceAttachment other = (AwsEc2NetworkInterfaceAttachment) obj;
        if (other.getAttachTime() == null ^ this.getAttachTime() == null)
            return false;
        if (other.getAttachTime() != null && other.getAttachTime().equals(this.getAttachTime()) == false)
            return false;
        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null)
            return false;
        if (other.getAttachmentId() != null && other.getAttachmentId().equals(this.getAttachmentId()) == false)
            return false;
        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        if (other.getDeviceIndex() == null ^ this.getDeviceIndex() == null)
            return false;
        if (other.getDeviceIndex() != null && other.getDeviceIndex().equals(this.getDeviceIndex()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceOwnerId() == null ^ this.getInstanceOwnerId() == null)
            return false;
        if (other.getInstanceOwnerId() != null && other.getInstanceOwnerId().equals(this.getInstanceOwnerId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachTime() == null) ? 0 : getAttachTime().hashCode());
        hashCode = prime * hashCode + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode + ((getDeviceIndex() == null) ? 0 : getDeviceIndex().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceOwnerId() == null) ? 0 : getInstanceOwnerId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2NetworkInterfaceAttachment clone() {
        try {
            return (AwsEc2NetworkInterfaceAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2NetworkInterfaceAttachmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
