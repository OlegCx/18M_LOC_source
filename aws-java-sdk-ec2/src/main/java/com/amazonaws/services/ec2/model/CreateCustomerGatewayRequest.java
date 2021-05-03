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
import com.amazonaws.services.ec2.model.transform.CreateCustomerGatewayRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CreateCustomerGateway.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomerGatewayRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateCustomerGatewayRequest> {

    /**
     * <p>
     * For devices that support BGP, the customer gateway's BGP ASN.
     * </p>
     * <p>
     * Default: 65000
     * </p>
     */
    private Integer bgpAsn;
    /**
     * <p>
     * The Internet-routable IP address for the customer gateway's outside interface. The address must be static.
     * </p>
     */
    private String publicIp;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * </p>
     */
    private String type;
    /**
     * <p>
     * The tags to apply to the customer gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * A name for the customer gateway device.
     * </p>
     * <p>
     * Length Constraints: Up to 255 characters.
     * </p>
     */
    private String deviceName;

    /**
     * Default constructor for CreateCustomerGatewayRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public CreateCustomerGatewayRequest() {
    }

    /**
     * Constructs a new CreateCustomerGatewayRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param type
     *        The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * @param publicIp
     *        The Internet-routable IP address for the customer gateway's outside interface. The address must be static.
     * @param bgpAsn
     *        For devices that support BGP, the customer gateway's BGP ASN.</p>
     *        <p>
     *        Default: 65000
     */
    public CreateCustomerGatewayRequest(String type, String publicIp, Integer bgpAsn) {
        setType(type);
        setPublicIp(publicIp);
        setBgpAsn(bgpAsn);
    }

    /**
     * Constructs a new CreateCustomerGatewayRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param type
     *        The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * @param publicIp
     *        The Internet-routable IP address for the customer gateway's outside interface. The address must be static.
     * @param bgpAsn
     *        For devices that support BGP, the customer gateway's BGP ASN.</p>
     *        <p>
     *        Default: 65000
     */
    public CreateCustomerGatewayRequest(GatewayType type, String publicIp, Integer bgpAsn) {
        setType(type.toString());
        setPublicIp(publicIp);
        setBgpAsn(bgpAsn);
    }

    /**
     * <p>
     * For devices that support BGP, the customer gateway's BGP ASN.
     * </p>
     * <p>
     * Default: 65000
     * </p>
     * 
     * @param bgpAsn
     *        For devices that support BGP, the customer gateway's BGP ASN.</p>
     *        <p>
     *        Default: 65000
     */

    public void setBgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
    }

    /**
     * <p>
     * For devices that support BGP, the customer gateway's BGP ASN.
     * </p>
     * <p>
     * Default: 65000
     * </p>
     * 
     * @return For devices that support BGP, the customer gateway's BGP ASN.</p>
     *         <p>
     *         Default: 65000
     */

    public Integer getBgpAsn() {
        return this.bgpAsn;
    }

    /**
     * <p>
     * For devices that support BGP, the customer gateway's BGP ASN.
     * </p>
     * <p>
     * Default: 65000
     * </p>
     * 
     * @param bgpAsn
     *        For devices that support BGP, the customer gateway's BGP ASN.</p>
     *        <p>
     *        Default: 65000
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomerGatewayRequest withBgpAsn(Integer bgpAsn) {
        setBgpAsn(bgpAsn);
        return this;
    }

    /**
     * <p>
     * The Internet-routable IP address for the customer gateway's outside interface. The address must be static.
     * </p>
     * 
     * @param publicIp
     *        The Internet-routable IP address for the customer gateway's outside interface. The address must be static.
     */

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The Internet-routable IP address for the customer gateway's outside interface. The address must be static.
     * </p>
     * 
     * @return The Internet-routable IP address for the customer gateway's outside interface. The address must be
     *         static.
     */

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * <p>
     * The Internet-routable IP address for the customer gateway's outside interface. The address must be static.
     * </p>
     * 
     * @param publicIp
     *        The Internet-routable IP address for the customer gateway's outside interface. The address must be static.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomerGatewayRequest withPublicIp(String publicIp) {
        setPublicIp(publicIp);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) for the customer gateway certificate.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the customer gateway certificate.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) for the customer gateway certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomerGatewayRequest withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * </p>
     * 
     * @param type
     *        The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * @see GatewayType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * </p>
     * 
     * @return The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * @see GatewayType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * </p>
     * 
     * @param type
     *        The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayType
     */

    public CreateCustomerGatewayRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * </p>
     * 
     * @param type
     *        The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * @see GatewayType
     */

    public void setType(GatewayType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * </p>
     * 
     * @param type
     *        The type of VPN connection that this customer gateway supports (<code>ipsec.1</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayType
     */

    public CreateCustomerGatewayRequest withType(GatewayType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The tags to apply to the customer gateway.
     * </p>
     * 
     * @return The tags to apply to the customer gateway.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the customer gateway.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the customer gateway.
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
     * The tags to apply to the customer gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the customer gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomerGatewayRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The tags to apply to the customer gateway.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the customer gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomerGatewayRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * A name for the customer gateway device.
     * </p>
     * <p>
     * Length Constraints: Up to 255 characters.
     * </p>
     * 
     * @param deviceName
     *        A name for the customer gateway device.</p>
     *        <p>
     *        Length Constraints: Up to 255 characters.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * A name for the customer gateway device.
     * </p>
     * <p>
     * Length Constraints: Up to 255 characters.
     * </p>
     * 
     * @return A name for the customer gateway device.</p>
     *         <p>
     *         Length Constraints: Up to 255 characters.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * A name for the customer gateway device.
     * </p>
     * <p>
     * Length Constraints: Up to 255 characters.
     * </p>
     * 
     * @param deviceName
     *        A name for the customer gateway device.</p>
     *        <p>
     *        Length Constraints: Up to 255 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomerGatewayRequest withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateCustomerGatewayRequest> getDryRunRequest() {
        Request<CreateCustomerGatewayRequest> request = new CreateCustomerGatewayRequestMarshaller().marshall(this);
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
        if (getBgpAsn() != null)
            sb.append("BgpAsn: ").append(getBgpAsn()).append(",");
        if (getPublicIp() != null)
            sb.append("PublicIp: ").append(getPublicIp()).append(",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomerGatewayRequest == false)
            return false;
        CreateCustomerGatewayRequest other = (CreateCustomerGatewayRequest) obj;
        if (other.getBgpAsn() == null ^ this.getBgpAsn() == null)
            return false;
        if (other.getBgpAsn() != null && other.getBgpAsn().equals(this.getBgpAsn()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBgpAsn() == null) ? 0 : getBgpAsn().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomerGatewayRequest clone() {
        return (CreateCustomerGatewayRequest) super.clone();
    }
}
