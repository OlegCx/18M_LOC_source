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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A certificate that has been transferred but not yet accepted.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutgoingCertificate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The certificate ARN.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The certificate ID.
     * </p>
     */
    private String certificateId;
    /**
     * <p>
     * The AWS account to which the transfer was made.
     * </p>
     */
    private String transferredTo;
    /**
     * <p>
     * The date the transfer was initiated.
     * </p>
     */
    private java.util.Date transferDate;
    /**
     * <p>
     * The transfer message.
     * </p>
     */
    private String transferMessage;
    /**
     * <p>
     * The certificate creation date.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The certificate ARN.
     * </p>
     * 
     * @param certificateArn
     *        The certificate ARN.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The certificate ARN.
     * </p>
     * 
     * @return The certificate ARN.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The certificate ARN.
     * </p>
     * 
     * @param certificateArn
     *        The certificate ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutgoingCertificate withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The certificate ID.
     * </p>
     * 
     * @param certificateId
     *        The certificate ID.
     */

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The certificate ID.
     * </p>
     * 
     * @return The certificate ID.
     */

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * <p>
     * The certificate ID.
     * </p>
     * 
     * @param certificateId
     *        The certificate ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutgoingCertificate withCertificateId(String certificateId) {
        setCertificateId(certificateId);
        return this;
    }

    /**
     * <p>
     * The AWS account to which the transfer was made.
     * </p>
     * 
     * @param transferredTo
     *        The AWS account to which the transfer was made.
     */

    public void setTransferredTo(String transferredTo) {
        this.transferredTo = transferredTo;
    }

    /**
     * <p>
     * The AWS account to which the transfer was made.
     * </p>
     * 
     * @return The AWS account to which the transfer was made.
     */

    public String getTransferredTo() {
        return this.transferredTo;
    }

    /**
     * <p>
     * The AWS account to which the transfer was made.
     * </p>
     * 
     * @param transferredTo
     *        The AWS account to which the transfer was made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutgoingCertificate withTransferredTo(String transferredTo) {
        setTransferredTo(transferredTo);
        return this;
    }

    /**
     * <p>
     * The date the transfer was initiated.
     * </p>
     * 
     * @param transferDate
     *        The date the transfer was initiated.
     */

    public void setTransferDate(java.util.Date transferDate) {
        this.transferDate = transferDate;
    }

    /**
     * <p>
     * The date the transfer was initiated.
     * </p>
     * 
     * @return The date the transfer was initiated.
     */

    public java.util.Date getTransferDate() {
        return this.transferDate;
    }

    /**
     * <p>
     * The date the transfer was initiated.
     * </p>
     * 
     * @param transferDate
     *        The date the transfer was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutgoingCertificate withTransferDate(java.util.Date transferDate) {
        setTransferDate(transferDate);
        return this;
    }

    /**
     * <p>
     * The transfer message.
     * </p>
     * 
     * @param transferMessage
     *        The transfer message.
     */

    public void setTransferMessage(String transferMessage) {
        this.transferMessage = transferMessage;
    }

    /**
     * <p>
     * The transfer message.
     * </p>
     * 
     * @return The transfer message.
     */

    public String getTransferMessage() {
        return this.transferMessage;
    }

    /**
     * <p>
     * The transfer message.
     * </p>
     * 
     * @param transferMessage
     *        The transfer message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutgoingCertificate withTransferMessage(String transferMessage) {
        setTransferMessage(transferMessage);
        return this;
    }

    /**
     * <p>
     * The certificate creation date.
     * </p>
     * 
     * @param creationDate
     *        The certificate creation date.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The certificate creation date.
     * </p>
     * 
     * @return The certificate creation date.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The certificate creation date.
     * </p>
     * 
     * @param creationDate
     *        The certificate creation date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutgoingCertificate withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getCertificateId() != null)
            sb.append("CertificateId: ").append(getCertificateId()).append(",");
        if (getTransferredTo() != null)
            sb.append("TransferredTo: ").append(getTransferredTo()).append(",");
        if (getTransferDate() != null)
            sb.append("TransferDate: ").append(getTransferDate()).append(",");
        if (getTransferMessage() != null)
            sb.append("TransferMessage: ").append(getTransferMessage()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutgoingCertificate == false)
            return false;
        OutgoingCertificate other = (OutgoingCertificate) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getTransferredTo() == null ^ this.getTransferredTo() == null)
            return false;
        if (other.getTransferredTo() != null && other.getTransferredTo().equals(this.getTransferredTo()) == false)
            return false;
        if (other.getTransferDate() == null ^ this.getTransferDate() == null)
            return false;
        if (other.getTransferDate() != null && other.getTransferDate().equals(this.getTransferDate()) == false)
            return false;
        if (other.getTransferMessage() == null ^ this.getTransferMessage() == null)
            return false;
        if (other.getTransferMessage() != null && other.getTransferMessage().equals(this.getTransferMessage()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode());
        hashCode = prime * hashCode + ((getTransferredTo() == null) ? 0 : getTransferredTo().hashCode());
        hashCode = prime * hashCode + ((getTransferDate() == null) ? 0 : getTransferDate().hashCode());
        hashCode = prime * hashCode + ((getTransferMessage() == null) ? 0 : getTransferMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public OutgoingCertificate clone() {
        try {
            return (OutgoingCertificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.OutgoingCertificateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
