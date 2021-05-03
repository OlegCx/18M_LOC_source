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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The domain name configuration.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainNameConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A domain name for the API.
     * </p>
     */
    private String apiGatewayDomainName;
    /**
     * <p>
     * An AWS-managed certificate that will be used by the edge-optimized endpoint for this domain name. AWS Certificate
     * Manager is the only supported source.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The user-friendly name of the certificate that will be used by the edge-optimized endpoint for this domain name.
     * </p>
     */
    private String certificateName;
    /**
     * <p>
     * The timestamp when the certificate that was used by edge-optimized endpoint for this domain name was uploaded.
     * </p>
     */
    private java.util.Date certificateUploadDate;
    /**
     * <p>
     * The status of the domain name migration. The valid values are AVAILABLE and UPDATING. If the status is UPDATING,
     * the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain
     * can be updated.
     * </p>
     */
    private String domainNameStatus;
    /**
     * <p>
     * An optional text message containing detailed information about status of the domain name migration.
     * </p>
     */
    private String domainNameStatusMessage;
    /**
     * <p>
     * The endpoint type.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * The Amazon Route 53 Hosted Zone ID of the endpoint.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values are
     * TLS_1_0 and TLS_1_2.
     * </p>
     */
    private String securityPolicy;

    /**
     * <p>
     * A domain name for the API.
     * </p>
     * 
     * @param apiGatewayDomainName
     *        A domain name for the API.
     */

    public void setApiGatewayDomainName(String apiGatewayDomainName) {
        this.apiGatewayDomainName = apiGatewayDomainName;
    }

    /**
     * <p>
     * A domain name for the API.
     * </p>
     * 
     * @return A domain name for the API.
     */

    public String getApiGatewayDomainName() {
        return this.apiGatewayDomainName;
    }

    /**
     * <p>
     * A domain name for the API.
     * </p>
     * 
     * @param apiGatewayDomainName
     *        A domain name for the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainNameConfiguration withApiGatewayDomainName(String apiGatewayDomainName) {
        setApiGatewayDomainName(apiGatewayDomainName);
        return this;
    }

    /**
     * <p>
     * An AWS-managed certificate that will be used by the edge-optimized endpoint for this domain name. AWS Certificate
     * Manager is the only supported source.
     * </p>
     * 
     * @param certificateArn
     *        An AWS-managed certificate that will be used by the edge-optimized endpoint for this domain name. AWS
     *        Certificate Manager is the only supported source.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * An AWS-managed certificate that will be used by the edge-optimized endpoint for this domain name. AWS Certificate
     * Manager is the only supported source.
     * </p>
     * 
     * @return An AWS-managed certificate that will be used by the edge-optimized endpoint for this domain name. AWS
     *         Certificate Manager is the only supported source.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * An AWS-managed certificate that will be used by the edge-optimized endpoint for this domain name. AWS Certificate
     * Manager is the only supported source.
     * </p>
     * 
     * @param certificateArn
     *        An AWS-managed certificate that will be used by the edge-optimized endpoint for this domain name. AWS
     *        Certificate Manager is the only supported source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainNameConfiguration withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by the edge-optimized endpoint for this domain name.
     * </p>
     * 
     * @param certificateName
     *        The user-friendly name of the certificate that will be used by the edge-optimized endpoint for this domain
     *        name.
     */

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by the edge-optimized endpoint for this domain name.
     * </p>
     * 
     * @return The user-friendly name of the certificate that will be used by the edge-optimized endpoint for this
     *         domain name.
     */

    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by the edge-optimized endpoint for this domain name.
     * </p>
     * 
     * @param certificateName
     *        The user-friendly name of the certificate that will be used by the edge-optimized endpoint for this domain
     *        name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainNameConfiguration withCertificateName(String certificateName) {
        setCertificateName(certificateName);
        return this;
    }

    /**
     * <p>
     * The timestamp when the certificate that was used by edge-optimized endpoint for this domain name was uploaded.
     * </p>
     * 
     * @param certificateUploadDate
     *        The timestamp when the certificate that was used by edge-optimized endpoint for this domain name was
     *        uploaded.
     */

    public void setCertificateUploadDate(java.util.Date certificateUploadDate) {
        this.certificateUploadDate = certificateUploadDate;
    }

    /**
     * <p>
     * The timestamp when the certificate that was used by edge-optimized endpoint for this domain name was uploaded.
     * </p>
     * 
     * @return The timestamp when the certificate that was used by edge-optimized endpoint for this domain name was
     *         uploaded.
     */

    public java.util.Date getCertificateUploadDate() {
        return this.certificateUploadDate;
    }

    /**
     * <p>
     * The timestamp when the certificate that was used by edge-optimized endpoint for this domain name was uploaded.
     * </p>
     * 
     * @param certificateUploadDate
     *        The timestamp when the certificate that was used by edge-optimized endpoint for this domain name was
     *        uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainNameConfiguration withCertificateUploadDate(java.util.Date certificateUploadDate) {
        setCertificateUploadDate(certificateUploadDate);
        return this;
    }

    /**
     * <p>
     * The status of the domain name migration. The valid values are AVAILABLE and UPDATING. If the status is UPDATING,
     * the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain
     * can be updated.
     * </p>
     * 
     * @param domainNameStatus
     *        The status of the domain name migration. The valid values are AVAILABLE and UPDATING. If the status is
     *        UPDATING, the domain cannot be modified further until the existing operation is complete. If it is
     *        AVAILABLE, the domain can be updated.
     * @see DomainNameStatus
     */

    public void setDomainNameStatus(String domainNameStatus) {
        this.domainNameStatus = domainNameStatus;
    }

    /**
     * <p>
     * The status of the domain name migration. The valid values are AVAILABLE and UPDATING. If the status is UPDATING,
     * the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain
     * can be updated.
     * </p>
     * 
     * @return The status of the domain name migration. The valid values are AVAILABLE and UPDATING. If the status is
     *         UPDATING, the domain cannot be modified further until the existing operation is complete. If it is
     *         AVAILABLE, the domain can be updated.
     * @see DomainNameStatus
     */

    public String getDomainNameStatus() {
        return this.domainNameStatus;
    }

    /**
     * <p>
     * The status of the domain name migration. The valid values are AVAILABLE and UPDATING. If the status is UPDATING,
     * the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain
     * can be updated.
     * </p>
     * 
     * @param domainNameStatus
     *        The status of the domain name migration. The valid values are AVAILABLE and UPDATING. If the status is
     *        UPDATING, the domain cannot be modified further until the existing operation is complete. If it is
     *        AVAILABLE, the domain can be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainNameStatus
     */

    public DomainNameConfiguration withDomainNameStatus(String domainNameStatus) {
        setDomainNameStatus(domainNameStatus);
        return this;
    }

    /**
     * <p>
     * The status of the domain name migration. The valid values are AVAILABLE and UPDATING. If the status is UPDATING,
     * the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain
     * can be updated.
     * </p>
     * 
     * @param domainNameStatus
     *        The status of the domain name migration. The valid values are AVAILABLE and UPDATING. If the status is
     *        UPDATING, the domain cannot be modified further until the existing operation is complete. If it is
     *        AVAILABLE, the domain can be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainNameStatus
     */

    public DomainNameConfiguration withDomainNameStatus(DomainNameStatus domainNameStatus) {
        this.domainNameStatus = domainNameStatus.toString();
        return this;
    }

    /**
     * <p>
     * An optional text message containing detailed information about status of the domain name migration.
     * </p>
     * 
     * @param domainNameStatusMessage
     *        An optional text message containing detailed information about status of the domain name migration.
     */

    public void setDomainNameStatusMessage(String domainNameStatusMessage) {
        this.domainNameStatusMessage = domainNameStatusMessage;
    }

    /**
     * <p>
     * An optional text message containing detailed information about status of the domain name migration.
     * </p>
     * 
     * @return An optional text message containing detailed information about status of the domain name migration.
     */

    public String getDomainNameStatusMessage() {
        return this.domainNameStatusMessage;
    }

    /**
     * <p>
     * An optional text message containing detailed information about status of the domain name migration.
     * </p>
     * 
     * @param domainNameStatusMessage
     *        An optional text message containing detailed information about status of the domain name migration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainNameConfiguration withDomainNameStatusMessage(String domainNameStatusMessage) {
        setDomainNameStatusMessage(domainNameStatusMessage);
        return this;
    }

    /**
     * <p>
     * The endpoint type.
     * </p>
     * 
     * @param endpointType
     *        The endpoint type.
     * @see EndpointType
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The endpoint type.
     * </p>
     * 
     * @return The endpoint type.
     * @see EndpointType
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The endpoint type.
     * </p>
     * 
     * @param endpointType
     *        The endpoint type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public DomainNameConfiguration withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The endpoint type.
     * </p>
     * 
     * @param endpointType
     *        The endpoint type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public DomainNameConfiguration withEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Route 53 Hosted Zone ID of the endpoint.
     * </p>
     * 
     * @param hostedZoneId
     *        The Amazon Route 53 Hosted Zone ID of the endpoint.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The Amazon Route 53 Hosted Zone ID of the endpoint.
     * </p>
     * 
     * @return The Amazon Route 53 Hosted Zone ID of the endpoint.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The Amazon Route 53 Hosted Zone ID of the endpoint.
     * </p>
     * 
     * @param hostedZoneId
     *        The Amazon Route 53 Hosted Zone ID of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainNameConfiguration withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values are
     * TLS_1_0 and TLS_1_2.
     * </p>
     * 
     * @param securityPolicy
     *        The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values
     *        are TLS_1_0 and TLS_1_2.
     * @see SecurityPolicy
     */

    public void setSecurityPolicy(String securityPolicy) {
        this.securityPolicy = securityPolicy;
    }

    /**
     * <p>
     * The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values are
     * TLS_1_0 and TLS_1_2.
     * </p>
     * 
     * @return The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values
     *         are TLS_1_0 and TLS_1_2.
     * @see SecurityPolicy
     */

    public String getSecurityPolicy() {
        return this.securityPolicy;
    }

    /**
     * <p>
     * The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values are
     * TLS_1_0 and TLS_1_2.
     * </p>
     * 
     * @param securityPolicy
     *        The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values
     *        are TLS_1_0 and TLS_1_2.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityPolicy
     */

    public DomainNameConfiguration withSecurityPolicy(String securityPolicy) {
        setSecurityPolicy(securityPolicy);
        return this;
    }

    /**
     * <p>
     * The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values are
     * TLS_1_0 and TLS_1_2.
     * </p>
     * 
     * @param securityPolicy
     *        The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values
     *        are TLS_1_0 and TLS_1_2.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityPolicy
     */

    public DomainNameConfiguration withSecurityPolicy(SecurityPolicy securityPolicy) {
        this.securityPolicy = securityPolicy.toString();
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
        if (getApiGatewayDomainName() != null)
            sb.append("ApiGatewayDomainName: ").append(getApiGatewayDomainName()).append(",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getCertificateName() != null)
            sb.append("CertificateName: ").append(getCertificateName()).append(",");
        if (getCertificateUploadDate() != null)
            sb.append("CertificateUploadDate: ").append(getCertificateUploadDate()).append(",");
        if (getDomainNameStatus() != null)
            sb.append("DomainNameStatus: ").append(getDomainNameStatus()).append(",");
        if (getDomainNameStatusMessage() != null)
            sb.append("DomainNameStatusMessage: ").append(getDomainNameStatusMessage()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId()).append(",");
        if (getSecurityPolicy() != null)
            sb.append("SecurityPolicy: ").append(getSecurityPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainNameConfiguration == false)
            return false;
        DomainNameConfiguration other = (DomainNameConfiguration) obj;
        if (other.getApiGatewayDomainName() == null ^ this.getApiGatewayDomainName() == null)
            return false;
        if (other.getApiGatewayDomainName() != null && other.getApiGatewayDomainName().equals(this.getApiGatewayDomainName()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getCertificateName() == null ^ this.getCertificateName() == null)
            return false;
        if (other.getCertificateName() != null && other.getCertificateName().equals(this.getCertificateName()) == false)
            return false;
        if (other.getCertificateUploadDate() == null ^ this.getCertificateUploadDate() == null)
            return false;
        if (other.getCertificateUploadDate() != null && other.getCertificateUploadDate().equals(this.getCertificateUploadDate()) == false)
            return false;
        if (other.getDomainNameStatus() == null ^ this.getDomainNameStatus() == null)
            return false;
        if (other.getDomainNameStatus() != null && other.getDomainNameStatus().equals(this.getDomainNameStatus()) == false)
            return false;
        if (other.getDomainNameStatusMessage() == null ^ this.getDomainNameStatusMessage() == null)
            return false;
        if (other.getDomainNameStatusMessage() != null && other.getDomainNameStatusMessage().equals(this.getDomainNameStatusMessage()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getSecurityPolicy() == null ^ this.getSecurityPolicy() == null)
            return false;
        if (other.getSecurityPolicy() != null && other.getSecurityPolicy().equals(this.getSecurityPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiGatewayDomainName() == null) ? 0 : getApiGatewayDomainName().hashCode());
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        hashCode = prime * hashCode + ((getCertificateUploadDate() == null) ? 0 : getCertificateUploadDate().hashCode());
        hashCode = prime * hashCode + ((getDomainNameStatus() == null) ? 0 : getDomainNameStatus().hashCode());
        hashCode = prime * hashCode + ((getDomainNameStatusMessage() == null) ? 0 : getDomainNameStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getSecurityPolicy() == null) ? 0 : getSecurityPolicy().hashCode());
        return hashCode;
    }

    @Override
    public DomainNameConfiguration clone() {
        try {
            return (DomainNameConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigatewayv2.model.transform.DomainNameConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
