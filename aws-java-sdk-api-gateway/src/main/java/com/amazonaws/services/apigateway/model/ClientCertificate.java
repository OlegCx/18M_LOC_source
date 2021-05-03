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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a client certificate used to configure client-side SSL authentication while sending requests to the
 * integration endpoint.
 * </p>
 * <div class="remarks">Client certificates are used to authenticate an API by the backend server. To authenticate an
 * API client (or user), use IAM roles and policies, a custom <a>Authorizer</a> or an Amazon Cognito user pool.</div>
 * <div class="seeAlso"> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/getting-started-client-side-ssl-authentication.html"
 * >Use Client-Side Certificate</a> </div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientCertificate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the client certificate.
     * </p>
     */
    private String clientCertificateId;
    /**
     * <p>
     * The description of the client certificate.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The PEM-encoded public key of the client certificate, which can be used to configure certificate authentication
     * in the integration endpoint .
     * </p>
     */
    private String pemEncodedCertificate;
    /**
     * <p>
     * The timestamp when the client certificate was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The timestamp when the client certificate will expire.
     * </p>
     */
    private java.util.Date expirationDate;
    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier of the client certificate.
     * </p>
     * 
     * @param clientCertificateId
     *        The identifier of the client certificate.
     */

    public void setClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    /**
     * <p>
     * The identifier of the client certificate.
     * </p>
     * 
     * @return The identifier of the client certificate.
     */

    public String getClientCertificateId() {
        return this.clientCertificateId;
    }

    /**
     * <p>
     * The identifier of the client certificate.
     * </p>
     * 
     * @param clientCertificateId
     *        The identifier of the client certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientCertificate withClientCertificateId(String clientCertificateId) {
        setClientCertificateId(clientCertificateId);
        return this;
    }

    /**
     * <p>
     * The description of the client certificate.
     * </p>
     * 
     * @param description
     *        The description of the client certificate.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the client certificate.
     * </p>
     * 
     * @return The description of the client certificate.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the client certificate.
     * </p>
     * 
     * @param description
     *        The description of the client certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientCertificate withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The PEM-encoded public key of the client certificate, which can be used to configure certificate authentication
     * in the integration endpoint .
     * </p>
     * 
     * @param pemEncodedCertificate
     *        The PEM-encoded public key of the client certificate, which can be used to configure certificate
     *        authentication in the integration endpoint .
     */

    public void setPemEncodedCertificate(String pemEncodedCertificate) {
        this.pemEncodedCertificate = pemEncodedCertificate;
    }

    /**
     * <p>
     * The PEM-encoded public key of the client certificate, which can be used to configure certificate authentication
     * in the integration endpoint .
     * </p>
     * 
     * @return The PEM-encoded public key of the client certificate, which can be used to configure certificate
     *         authentication in the integration endpoint .
     */

    public String getPemEncodedCertificate() {
        return this.pemEncodedCertificate;
    }

    /**
     * <p>
     * The PEM-encoded public key of the client certificate, which can be used to configure certificate authentication
     * in the integration endpoint .
     * </p>
     * 
     * @param pemEncodedCertificate
     *        The PEM-encoded public key of the client certificate, which can be used to configure certificate
     *        authentication in the integration endpoint .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientCertificate withPemEncodedCertificate(String pemEncodedCertificate) {
        setPemEncodedCertificate(pemEncodedCertificate);
        return this;
    }

    /**
     * <p>
     * The timestamp when the client certificate was created.
     * </p>
     * 
     * @param createdDate
     *        The timestamp when the client certificate was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The timestamp when the client certificate was created.
     * </p>
     * 
     * @return The timestamp when the client certificate was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The timestamp when the client certificate was created.
     * </p>
     * 
     * @param createdDate
     *        The timestamp when the client certificate was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientCertificate withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The timestamp when the client certificate will expire.
     * </p>
     * 
     * @param expirationDate
     *        The timestamp when the client certificate will expire.
     */

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The timestamp when the client certificate will expire.
     * </p>
     * 
     * @return The timestamp when the client certificate will expire.
     */

    public java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * <p>
     * The timestamp when the client certificate will expire.
     * </p>
     * 
     * @param expirationDate
     *        The timestamp when the client certificate will expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientCertificate withExpirationDate(java.util.Date expirationDate) {
        setExpirationDate(expirationDate);
        return this;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given resource.
     * </p>
     * 
     * @return The collection of tags. Each tag element is associated with a given resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given resource.
     * </p>
     * 
     * @param tags
     *        The collection of tags. Each tag element is associated with a given resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given resource.
     * </p>
     * 
     * @param tags
     *        The collection of tags. Each tag element is associated with a given resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientCertificate withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ClientCertificate#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ClientCertificate addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientCertificate clearTagsEntries() {
        this.tags = null;
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
        if (getClientCertificateId() != null)
            sb.append("ClientCertificateId: ").append(getClientCertificateId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPemEncodedCertificate() != null)
            sb.append("PemEncodedCertificate: ").append(getPemEncodedCertificate()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: ").append(getExpirationDate()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientCertificate == false)
            return false;
        ClientCertificate other = (ClientCertificate) obj;
        if (other.getClientCertificateId() == null ^ this.getClientCertificateId() == null)
            return false;
        if (other.getClientCertificateId() != null && other.getClientCertificateId().equals(this.getClientCertificateId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPemEncodedCertificate() == null ^ this.getPemEncodedCertificate() == null)
            return false;
        if (other.getPemEncodedCertificate() != null && other.getPemEncodedCertificate().equals(this.getPemEncodedCertificate()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientCertificateId() == null) ? 0 : getClientCertificateId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPemEncodedCertificate() == null) ? 0 : getPemEncodedCertificate().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ClientCertificate clone() {
        try {
            return (ClientCertificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigateway.model.transform.ClientCertificateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
