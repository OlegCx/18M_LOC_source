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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetGroupCertificateAuthority"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGroupCertificateAuthorityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ID of the certificate authority. */
    private String certificateAuthorityId;
    /** The ID of the Greengrass group. */
    private String groupId;

    /**
     * The ID of the certificate authority.
     * 
     * @param certificateAuthorityId
     *        The ID of the certificate authority.
     */

    public void setCertificateAuthorityId(String certificateAuthorityId) {
        this.certificateAuthorityId = certificateAuthorityId;
    }

    /**
     * The ID of the certificate authority.
     * 
     * @return The ID of the certificate authority.
     */

    public String getCertificateAuthorityId() {
        return this.certificateAuthorityId;
    }

    /**
     * The ID of the certificate authority.
     * 
     * @param certificateAuthorityId
     *        The ID of the certificate authority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupCertificateAuthorityRequest withCertificateAuthorityId(String certificateAuthorityId) {
        setCertificateAuthorityId(certificateAuthorityId);
        return this;
    }

    /**
     * The ID of the Greengrass group.
     * 
     * @param groupId
     *        The ID of the Greengrass group.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * The ID of the Greengrass group.
     * 
     * @return The ID of the Greengrass group.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * The ID of the Greengrass group.
     * 
     * @param groupId
     *        The ID of the Greengrass group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupCertificateAuthorityRequest withGroupId(String groupId) {
        setGroupId(groupId);
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
        if (getCertificateAuthorityId() != null)
            sb.append("CertificateAuthorityId: ").append(getCertificateAuthorityId()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGroupCertificateAuthorityRequest == false)
            return false;
        GetGroupCertificateAuthorityRequest other = (GetGroupCertificateAuthorityRequest) obj;
        if (other.getCertificateAuthorityId() == null ^ this.getCertificateAuthorityId() == null)
            return false;
        if (other.getCertificateAuthorityId() != null && other.getCertificateAuthorityId().equals(this.getCertificateAuthorityId()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthorityId() == null) ? 0 : getCertificateAuthorityId().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        return hashCode;
    }

    @Override
    public GetGroupCertificateAuthorityRequest clone() {
        return (GetGroupCertificateAuthorityRequest) super.clone();
    }

}
