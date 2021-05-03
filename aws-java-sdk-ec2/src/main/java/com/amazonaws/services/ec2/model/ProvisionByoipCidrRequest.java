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
import com.amazonaws.services.ec2.model.transform.ProvisionByoipCidrRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionByoipCidrRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ProvisionByoipCidrRequest> {

    /**
     * <p>
     * The public IPv4 or IPv6 address range, in CIDR notation. The most specific IPv4 prefix that you can specify is
     * /24. The most specific IPv6 prefix you can specify is /56. The address range cannot overlap with another address
     * range that you've brought to this or another Region.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using
     * BYOIP.
     * </p>
     */
    private CidrAuthorizationContext cidrAuthorizationContext;
    /**
     * <p>
     * (IPv6 only) Indicate whether the address range will be publicly advertised to the internet.
     * </p>
     * <p>
     * Default: true
     * </p>
     */
    private Boolean publiclyAdvertisable;
    /**
     * <p>
     * A description for the address range and the address pool.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The tags to apply to the address pool.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> poolTagSpecifications;

    /**
     * <p>
     * The public IPv4 or IPv6 address range, in CIDR notation. The most specific IPv4 prefix that you can specify is
     * /24. The most specific IPv6 prefix you can specify is /56. The address range cannot overlap with another address
     * range that you've brought to this or another Region.
     * </p>
     * 
     * @param cidr
     *        The public IPv4 or IPv6 address range, in CIDR notation. The most specific IPv4 prefix that you can
     *        specify is /24. The most specific IPv6 prefix you can specify is /56. The address range cannot overlap
     *        with another address range that you've brought to this or another Region.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The public IPv4 or IPv6 address range, in CIDR notation. The most specific IPv4 prefix that you can specify is
     * /24. The most specific IPv6 prefix you can specify is /56. The address range cannot overlap with another address
     * range that you've brought to this or another Region.
     * </p>
     * 
     * @return The public IPv4 or IPv6 address range, in CIDR notation. The most specific IPv4 prefix that you can
     *         specify is /24. The most specific IPv6 prefix you can specify is /56. The address range cannot overlap
     *         with another address range that you've brought to this or another Region.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The public IPv4 or IPv6 address range, in CIDR notation. The most specific IPv4 prefix that you can specify is
     * /24. The most specific IPv6 prefix you can specify is /56. The address range cannot overlap with another address
     * range that you've brought to this or another Region.
     * </p>
     * 
     * @param cidr
     *        The public IPv4 or IPv6 address range, in CIDR notation. The most specific IPv4 prefix that you can
     *        specify is /24. The most specific IPv6 prefix you can specify is /56. The address range cannot overlap
     *        with another address range that you've brought to this or another Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionByoipCidrRequest withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using
     * BYOIP.
     * </p>
     * 
     * @param cidrAuthorizationContext
     *        A signed document that proves that you are authorized to bring the specified IP address range to Amazon
     *        using BYOIP.
     */

    public void setCidrAuthorizationContext(CidrAuthorizationContext cidrAuthorizationContext) {
        this.cidrAuthorizationContext = cidrAuthorizationContext;
    }

    /**
     * <p>
     * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using
     * BYOIP.
     * </p>
     * 
     * @return A signed document that proves that you are authorized to bring the specified IP address range to Amazon
     *         using BYOIP.
     */

    public CidrAuthorizationContext getCidrAuthorizationContext() {
        return this.cidrAuthorizationContext;
    }

    /**
     * <p>
     * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using
     * BYOIP.
     * </p>
     * 
     * @param cidrAuthorizationContext
     *        A signed document that proves that you are authorized to bring the specified IP address range to Amazon
     *        using BYOIP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionByoipCidrRequest withCidrAuthorizationContext(CidrAuthorizationContext cidrAuthorizationContext) {
        setCidrAuthorizationContext(cidrAuthorizationContext);
        return this;
    }

    /**
     * <p>
     * (IPv6 only) Indicate whether the address range will be publicly advertised to the internet.
     * </p>
     * <p>
     * Default: true
     * </p>
     * 
     * @param publiclyAdvertisable
     *        (IPv6 only) Indicate whether the address range will be publicly advertised to the internet.</p>
     *        <p>
     *        Default: true
     */

    public void setPubliclyAdvertisable(Boolean publiclyAdvertisable) {
        this.publiclyAdvertisable = publiclyAdvertisable;
    }

    /**
     * <p>
     * (IPv6 only) Indicate whether the address range will be publicly advertised to the internet.
     * </p>
     * <p>
     * Default: true
     * </p>
     * 
     * @return (IPv6 only) Indicate whether the address range will be publicly advertised to the internet.</p>
     *         <p>
     *         Default: true
     */

    public Boolean getPubliclyAdvertisable() {
        return this.publiclyAdvertisable;
    }

    /**
     * <p>
     * (IPv6 only) Indicate whether the address range will be publicly advertised to the internet.
     * </p>
     * <p>
     * Default: true
     * </p>
     * 
     * @param publiclyAdvertisable
     *        (IPv6 only) Indicate whether the address range will be publicly advertised to the internet.</p>
     *        <p>
     *        Default: true
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionByoipCidrRequest withPubliclyAdvertisable(Boolean publiclyAdvertisable) {
        setPubliclyAdvertisable(publiclyAdvertisable);
        return this;
    }

    /**
     * <p>
     * (IPv6 only) Indicate whether the address range will be publicly advertised to the internet.
     * </p>
     * <p>
     * Default: true
     * </p>
     * 
     * @return (IPv6 only) Indicate whether the address range will be publicly advertised to the internet.</p>
     *         <p>
     *         Default: true
     */

    public Boolean isPubliclyAdvertisable() {
        return this.publiclyAdvertisable;
    }

    /**
     * <p>
     * A description for the address range and the address pool.
     * </p>
     * 
     * @param description
     *        A description for the address range and the address pool.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the address range and the address pool.
     * </p>
     * 
     * @return A description for the address range and the address pool.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the address range and the address pool.
     * </p>
     * 
     * @param description
     *        A description for the address range and the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionByoipCidrRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the address pool.
     * </p>
     * 
     * @return The tags to apply to the address pool.
     */

    public java.util.List<TagSpecification> getPoolTagSpecifications() {
        if (poolTagSpecifications == null) {
            poolTagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return poolTagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the address pool.
     * </p>
     * 
     * @param poolTagSpecifications
     *        The tags to apply to the address pool.
     */

    public void setPoolTagSpecifications(java.util.Collection<TagSpecification> poolTagSpecifications) {
        if (poolTagSpecifications == null) {
            this.poolTagSpecifications = null;
            return;
        }

        this.poolTagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(poolTagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the address pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPoolTagSpecifications(java.util.Collection)} or
     * {@link #withPoolTagSpecifications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param poolTagSpecifications
     *        The tags to apply to the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionByoipCidrRequest withPoolTagSpecifications(TagSpecification... poolTagSpecifications) {
        if (this.poolTagSpecifications == null) {
            setPoolTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(poolTagSpecifications.length));
        }
        for (TagSpecification ele : poolTagSpecifications) {
            this.poolTagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the address pool.
     * </p>
     * 
     * @param poolTagSpecifications
     *        The tags to apply to the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionByoipCidrRequest withPoolTagSpecifications(java.util.Collection<TagSpecification> poolTagSpecifications) {
        setPoolTagSpecifications(poolTagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ProvisionByoipCidrRequest> getDryRunRequest() {
        Request<ProvisionByoipCidrRequest> request = new ProvisionByoipCidrRequestMarshaller().marshall(this);
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
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getCidrAuthorizationContext() != null)
            sb.append("CidrAuthorizationContext: ").append(getCidrAuthorizationContext()).append(",");
        if (getPubliclyAdvertisable() != null)
            sb.append("PubliclyAdvertisable: ").append(getPubliclyAdvertisable()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPoolTagSpecifications() != null)
            sb.append("PoolTagSpecifications: ").append(getPoolTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionByoipCidrRequest == false)
            return false;
        ProvisionByoipCidrRequest other = (ProvisionByoipCidrRequest) obj;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getCidrAuthorizationContext() == null ^ this.getCidrAuthorizationContext() == null)
            return false;
        if (other.getCidrAuthorizationContext() != null && other.getCidrAuthorizationContext().equals(this.getCidrAuthorizationContext()) == false)
            return false;
        if (other.getPubliclyAdvertisable() == null ^ this.getPubliclyAdvertisable() == null)
            return false;
        if (other.getPubliclyAdvertisable() != null && other.getPubliclyAdvertisable().equals(this.getPubliclyAdvertisable()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPoolTagSpecifications() == null ^ this.getPoolTagSpecifications() == null)
            return false;
        if (other.getPoolTagSpecifications() != null && other.getPoolTagSpecifications().equals(this.getPoolTagSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getCidrAuthorizationContext() == null) ? 0 : getCidrAuthorizationContext().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAdvertisable() == null) ? 0 : getPubliclyAdvertisable().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPoolTagSpecifications() == null) ? 0 : getPoolTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionByoipCidrRequest clone() {
        return (ProvisionByoipCidrRequest) super.clone();
    }
}
