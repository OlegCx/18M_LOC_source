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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the DeleteCertificate operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
     * </p>
     */
    private String certificateId;
    /**
     * <p>
     * Forces the deletion of a certificate if it is inactive and is not attached to an IoT thing.
     * </p>
     */
    private Boolean forceDelete;

    /**
     * <p>
     * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
     * </p>
     * 
     * @param certificateId
     *        The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
     */

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
     * </p>
     * 
     * @return The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
     */

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * <p>
     * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
     * </p>
     * 
     * @param certificateId
     *        The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCertificateRequest withCertificateId(String certificateId) {
        setCertificateId(certificateId);
        return this;
    }

    /**
     * <p>
     * Forces the deletion of a certificate if it is inactive and is not attached to an IoT thing.
     * </p>
     * 
     * @param forceDelete
     *        Forces the deletion of a certificate if it is inactive and is not attached to an IoT thing.
     */

    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }

    /**
     * <p>
     * Forces the deletion of a certificate if it is inactive and is not attached to an IoT thing.
     * </p>
     * 
     * @return Forces the deletion of a certificate if it is inactive and is not attached to an IoT thing.
     */

    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    /**
     * <p>
     * Forces the deletion of a certificate if it is inactive and is not attached to an IoT thing.
     * </p>
     * 
     * @param forceDelete
     *        Forces the deletion of a certificate if it is inactive and is not attached to an IoT thing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCertificateRequest withForceDelete(Boolean forceDelete) {
        setForceDelete(forceDelete);
        return this;
    }

    /**
     * <p>
     * Forces the deletion of a certificate if it is inactive and is not attached to an IoT thing.
     * </p>
     * 
     * @return Forces the deletion of a certificate if it is inactive and is not attached to an IoT thing.
     */

    public Boolean isForceDelete() {
        return this.forceDelete;
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
        if (getCertificateId() != null)
            sb.append("CertificateId: ").append(getCertificateId()).append(",");
        if (getForceDelete() != null)
            sb.append("ForceDelete: ").append(getForceDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCertificateRequest == false)
            return false;
        DeleteCertificateRequest other = (DeleteCertificateRequest) obj;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getForceDelete() == null ^ this.getForceDelete() == null)
            return false;
        if (other.getForceDelete() != null && other.getForceDelete().equals(this.getForceDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode());
        hashCode = prime * hashCode + ((getForceDelete() == null) ? 0 : getForceDelete().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCertificateRequest clone() {
        return (DeleteCertificateRequest) super.clone();
    }

}
