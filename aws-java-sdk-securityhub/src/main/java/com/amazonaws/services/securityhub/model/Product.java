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
 * Contains details about a product.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Product" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Product implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN assigned to the product.
     * </p>
     */
    private String productArn;
    /**
     * <p>
     * The name of the product.
     * </p>
     */
    private String productName;
    /**
     * <p>
     * The name of the company that provides the product.
     * </p>
     */
    private String companyName;
    /**
     * <p>
     * A description of the product.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The categories assigned to the product.
     * </p>
     */
    private java.util.List<String> categories;
    /**
     * <p>
     * The types of integration that the product supports. Available values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - The integration sends findings to Security Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - The integration receives findings from Security Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FINDINGS_IN_SECURITY_HUB</code> - The integration does not send new findings to Security Hub, but
     * does make updates to the findings that it receives from Security Hub.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> integrationTypes;
    /**
     * <p>
     * For integrations with AWS services, the AWS Console URL from which to activate the service.
     * </p>
     * <p>
     * For integrations with third-party products, the AWS Marketplace URL from which to subscribe to or purchase the
     * product.
     * </p>
     */
    private String marketplaceUrl;
    /**
     * <p>
     * The URL to the service or product documentation about the integration with Security Hub, including how to
     * activate the integration.
     * </p>
     */
    private String activationUrl;
    /**
     * <p>
     * The resource policy associated with the product.
     * </p>
     */
    private String productSubscriptionResourcePolicy;

    /**
     * <p>
     * The ARN assigned to the product.
     * </p>
     * 
     * @param productArn
     *        The ARN assigned to the product.
     */

    public void setProductArn(String productArn) {
        this.productArn = productArn;
    }

    /**
     * <p>
     * The ARN assigned to the product.
     * </p>
     * 
     * @return The ARN assigned to the product.
     */

    public String getProductArn() {
        return this.productArn;
    }

    /**
     * <p>
     * The ARN assigned to the product.
     * </p>
     * 
     * @param productArn
     *        The ARN assigned to the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Product withProductArn(String productArn) {
        setProductArn(productArn);
        return this;
    }

    /**
     * <p>
     * The name of the product.
     * </p>
     * 
     * @param productName
     *        The name of the product.
     */

    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * <p>
     * The name of the product.
     * </p>
     * 
     * @return The name of the product.
     */

    public String getProductName() {
        return this.productName;
    }

    /**
     * <p>
     * The name of the product.
     * </p>
     * 
     * @param productName
     *        The name of the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Product withProductName(String productName) {
        setProductName(productName);
        return this;
    }

    /**
     * <p>
     * The name of the company that provides the product.
     * </p>
     * 
     * @param companyName
     *        The name of the company that provides the product.
     */

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * <p>
     * The name of the company that provides the product.
     * </p>
     * 
     * @return The name of the company that provides the product.
     */

    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * <p>
     * The name of the company that provides the product.
     * </p>
     * 
     * @param companyName
     *        The name of the company that provides the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Product withCompanyName(String companyName) {
        setCompanyName(companyName);
        return this;
    }

    /**
     * <p>
     * A description of the product.
     * </p>
     * 
     * @param description
     *        A description of the product.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the product.
     * </p>
     * 
     * @return A description of the product.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the product.
     * </p>
     * 
     * @param description
     *        A description of the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Product withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The categories assigned to the product.
     * </p>
     * 
     * @return The categories assigned to the product.
     */

    public java.util.List<String> getCategories() {
        return categories;
    }

    /**
     * <p>
     * The categories assigned to the product.
     * </p>
     * 
     * @param categories
     *        The categories assigned to the product.
     */

    public void setCategories(java.util.Collection<String> categories) {
        if (categories == null) {
            this.categories = null;
            return;
        }

        this.categories = new java.util.ArrayList<String>(categories);
    }

    /**
     * <p>
     * The categories assigned to the product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategories(java.util.Collection)} or {@link #withCategories(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param categories
     *        The categories assigned to the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Product withCategories(String... categories) {
        if (this.categories == null) {
            setCategories(new java.util.ArrayList<String>(categories.length));
        }
        for (String ele : categories) {
            this.categories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The categories assigned to the product.
     * </p>
     * 
     * @param categories
     *        The categories assigned to the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Product withCategories(java.util.Collection<String> categories) {
        setCategories(categories);
        return this;
    }

    /**
     * <p>
     * The types of integration that the product supports. Available values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - The integration sends findings to Security Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - The integration receives findings from Security Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FINDINGS_IN_SECURITY_HUB</code> - The integration does not send new findings to Security Hub, but
     * does make updates to the findings that it receives from Security Hub.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The types of integration that the product supports. Available values are the following.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - The integration sends findings to Security Hub.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - The integration receives findings from Security Hub.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_FINDINGS_IN_SECURITY_HUB</code> - The integration does not send new findings to Security
     *         Hub, but does make updates to the findings that it receives from Security Hub.
     *         </p>
     *         </li>
     * @see IntegrationType
     */

    public java.util.List<String> getIntegrationTypes() {
        return integrationTypes;
    }

    /**
     * <p>
     * The types of integration that the product supports. Available values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - The integration sends findings to Security Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - The integration receives findings from Security Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FINDINGS_IN_SECURITY_HUB</code> - The integration does not send new findings to Security Hub, but
     * does make updates to the findings that it receives from Security Hub.
     * </p>
     * </li>
     * </ul>
     * 
     * @param integrationTypes
     *        The types of integration that the product supports. Available values are the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - The integration sends findings to Security Hub.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - The integration receives findings from Security Hub.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FINDINGS_IN_SECURITY_HUB</code> - The integration does not send new findings to Security Hub,
     *        but does make updates to the findings that it receives from Security Hub.
     *        </p>
     *        </li>
     * @see IntegrationType
     */

    public void setIntegrationTypes(java.util.Collection<String> integrationTypes) {
        if (integrationTypes == null) {
            this.integrationTypes = null;
            return;
        }

        this.integrationTypes = new java.util.ArrayList<String>(integrationTypes);
    }

    /**
     * <p>
     * The types of integration that the product supports. Available values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - The integration sends findings to Security Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - The integration receives findings from Security Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FINDINGS_IN_SECURITY_HUB</code> - The integration does not send new findings to Security Hub, but
     * does make updates to the findings that it receives from Security Hub.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIntegrationTypes(java.util.Collection)} or {@link #withIntegrationTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param integrationTypes
     *        The types of integration that the product supports. Available values are the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - The integration sends findings to Security Hub.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - The integration receives findings from Security Hub.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FINDINGS_IN_SECURITY_HUB</code> - The integration does not send new findings to Security Hub,
     *        but does make updates to the findings that it receives from Security Hub.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegrationType
     */

    public Product withIntegrationTypes(String... integrationTypes) {
        if (this.integrationTypes == null) {
            setIntegrationTypes(new java.util.ArrayList<String>(integrationTypes.length));
        }
        for (String ele : integrationTypes) {
            this.integrationTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The types of integration that the product supports. Available values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - The integration sends findings to Security Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - The integration receives findings from Security Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FINDINGS_IN_SECURITY_HUB</code> - The integration does not send new findings to Security Hub, but
     * does make updates to the findings that it receives from Security Hub.
     * </p>
     * </li>
     * </ul>
     * 
     * @param integrationTypes
     *        The types of integration that the product supports. Available values are the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - The integration sends findings to Security Hub.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - The integration receives findings from Security Hub.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FINDINGS_IN_SECURITY_HUB</code> - The integration does not send new findings to Security Hub,
     *        but does make updates to the findings that it receives from Security Hub.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegrationType
     */

    public Product withIntegrationTypes(java.util.Collection<String> integrationTypes) {
        setIntegrationTypes(integrationTypes);
        return this;
    }

    /**
     * <p>
     * The types of integration that the product supports. Available values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - The integration sends findings to Security Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - The integration receives findings from Security Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FINDINGS_IN_SECURITY_HUB</code> - The integration does not send new findings to Security Hub, but
     * does make updates to the findings that it receives from Security Hub.
     * </p>
     * </li>
     * </ul>
     * 
     * @param integrationTypes
     *        The types of integration that the product supports. Available values are the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SEND_FINDINGS_TO_SECURITY_HUB</code> - The integration sends findings to Security Hub.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RECEIVE_FINDINGS_FROM_SECURITY_HUB</code> - The integration receives findings from Security Hub.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FINDINGS_IN_SECURITY_HUB</code> - The integration does not send new findings to Security Hub,
     *        but does make updates to the findings that it receives from Security Hub.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegrationType
     */

    public Product withIntegrationTypes(IntegrationType... integrationTypes) {
        java.util.ArrayList<String> integrationTypesCopy = new java.util.ArrayList<String>(integrationTypes.length);
        for (IntegrationType value : integrationTypes) {
            integrationTypesCopy.add(value.toString());
        }
        if (getIntegrationTypes() == null) {
            setIntegrationTypes(integrationTypesCopy);
        } else {
            getIntegrationTypes().addAll(integrationTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * For integrations with AWS services, the AWS Console URL from which to activate the service.
     * </p>
     * <p>
     * For integrations with third-party products, the AWS Marketplace URL from which to subscribe to or purchase the
     * product.
     * </p>
     * 
     * @param marketplaceUrl
     *        For integrations with AWS services, the AWS Console URL from which to activate the service.</p>
     *        <p>
     *        For integrations with third-party products, the AWS Marketplace URL from which to subscribe to or purchase
     *        the product.
     */

    public void setMarketplaceUrl(String marketplaceUrl) {
        this.marketplaceUrl = marketplaceUrl;
    }

    /**
     * <p>
     * For integrations with AWS services, the AWS Console URL from which to activate the service.
     * </p>
     * <p>
     * For integrations with third-party products, the AWS Marketplace URL from which to subscribe to or purchase the
     * product.
     * </p>
     * 
     * @return For integrations with AWS services, the AWS Console URL from which to activate the service.</p>
     *         <p>
     *         For integrations with third-party products, the AWS Marketplace URL from which to subscribe to or
     *         purchase the product.
     */

    public String getMarketplaceUrl() {
        return this.marketplaceUrl;
    }

    /**
     * <p>
     * For integrations with AWS services, the AWS Console URL from which to activate the service.
     * </p>
     * <p>
     * For integrations with third-party products, the AWS Marketplace URL from which to subscribe to or purchase the
     * product.
     * </p>
     * 
     * @param marketplaceUrl
     *        For integrations with AWS services, the AWS Console URL from which to activate the service.</p>
     *        <p>
     *        For integrations with third-party products, the AWS Marketplace URL from which to subscribe to or purchase
     *        the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Product withMarketplaceUrl(String marketplaceUrl) {
        setMarketplaceUrl(marketplaceUrl);
        return this;
    }

    /**
     * <p>
     * The URL to the service or product documentation about the integration with Security Hub, including how to
     * activate the integration.
     * </p>
     * 
     * @param activationUrl
     *        The URL to the service or product documentation about the integration with Security Hub, including how to
     *        activate the integration.
     */

    public void setActivationUrl(String activationUrl) {
        this.activationUrl = activationUrl;
    }

    /**
     * <p>
     * The URL to the service or product documentation about the integration with Security Hub, including how to
     * activate the integration.
     * </p>
     * 
     * @return The URL to the service or product documentation about the integration with Security Hub, including how to
     *         activate the integration.
     */

    public String getActivationUrl() {
        return this.activationUrl;
    }

    /**
     * <p>
     * The URL to the service or product documentation about the integration with Security Hub, including how to
     * activate the integration.
     * </p>
     * 
     * @param activationUrl
     *        The URL to the service or product documentation about the integration with Security Hub, including how to
     *        activate the integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Product withActivationUrl(String activationUrl) {
        setActivationUrl(activationUrl);
        return this;
    }

    /**
     * <p>
     * The resource policy associated with the product.
     * </p>
     * 
     * @param productSubscriptionResourcePolicy
     *        The resource policy associated with the product.
     */

    public void setProductSubscriptionResourcePolicy(String productSubscriptionResourcePolicy) {
        this.productSubscriptionResourcePolicy = productSubscriptionResourcePolicy;
    }

    /**
     * <p>
     * The resource policy associated with the product.
     * </p>
     * 
     * @return The resource policy associated with the product.
     */

    public String getProductSubscriptionResourcePolicy() {
        return this.productSubscriptionResourcePolicy;
    }

    /**
     * <p>
     * The resource policy associated with the product.
     * </p>
     * 
     * @param productSubscriptionResourcePolicy
     *        The resource policy associated with the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Product withProductSubscriptionResourcePolicy(String productSubscriptionResourcePolicy) {
        setProductSubscriptionResourcePolicy(productSubscriptionResourcePolicy);
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
        if (getProductArn() != null)
            sb.append("ProductArn: ").append(getProductArn()).append(",");
        if (getProductName() != null)
            sb.append("ProductName: ").append(getProductName()).append(",");
        if (getCompanyName() != null)
            sb.append("CompanyName: ").append(getCompanyName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCategories() != null)
            sb.append("Categories: ").append(getCategories()).append(",");
        if (getIntegrationTypes() != null)
            sb.append("IntegrationTypes: ").append(getIntegrationTypes()).append(",");
        if (getMarketplaceUrl() != null)
            sb.append("MarketplaceUrl: ").append(getMarketplaceUrl()).append(",");
        if (getActivationUrl() != null)
            sb.append("ActivationUrl: ").append(getActivationUrl()).append(",");
        if (getProductSubscriptionResourcePolicy() != null)
            sb.append("ProductSubscriptionResourcePolicy: ").append(getProductSubscriptionResourcePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Product == false)
            return false;
        Product other = (Product) obj;
        if (other.getProductArn() == null ^ this.getProductArn() == null)
            return false;
        if (other.getProductArn() != null && other.getProductArn().equals(this.getProductArn()) == false)
            return false;
        if (other.getProductName() == null ^ this.getProductName() == null)
            return false;
        if (other.getProductName() != null && other.getProductName().equals(this.getProductName()) == false)
            return false;
        if (other.getCompanyName() == null ^ this.getCompanyName() == null)
            return false;
        if (other.getCompanyName() != null && other.getCompanyName().equals(this.getCompanyName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCategories() == null ^ this.getCategories() == null)
            return false;
        if (other.getCategories() != null && other.getCategories().equals(this.getCategories()) == false)
            return false;
        if (other.getIntegrationTypes() == null ^ this.getIntegrationTypes() == null)
            return false;
        if (other.getIntegrationTypes() != null && other.getIntegrationTypes().equals(this.getIntegrationTypes()) == false)
            return false;
        if (other.getMarketplaceUrl() == null ^ this.getMarketplaceUrl() == null)
            return false;
        if (other.getMarketplaceUrl() != null && other.getMarketplaceUrl().equals(this.getMarketplaceUrl()) == false)
            return false;
        if (other.getActivationUrl() == null ^ this.getActivationUrl() == null)
            return false;
        if (other.getActivationUrl() != null && other.getActivationUrl().equals(this.getActivationUrl()) == false)
            return false;
        if (other.getProductSubscriptionResourcePolicy() == null ^ this.getProductSubscriptionResourcePolicy() == null)
            return false;
        if (other.getProductSubscriptionResourcePolicy() != null
                && other.getProductSubscriptionResourcePolicy().equals(this.getProductSubscriptionResourcePolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductArn() == null) ? 0 : getProductArn().hashCode());
        hashCode = prime * hashCode + ((getProductName() == null) ? 0 : getProductName().hashCode());
        hashCode = prime * hashCode + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCategories() == null) ? 0 : getCategories().hashCode());
        hashCode = prime * hashCode + ((getIntegrationTypes() == null) ? 0 : getIntegrationTypes().hashCode());
        hashCode = prime * hashCode + ((getMarketplaceUrl() == null) ? 0 : getMarketplaceUrl().hashCode());
        hashCode = prime * hashCode + ((getActivationUrl() == null) ? 0 : getActivationUrl().hashCode());
        hashCode = prime * hashCode + ((getProductSubscriptionResourcePolicy() == null) ? 0 : getProductSubscriptionResourcePolicy().hashCode());
        return hashCode;
    }

    @Override
    public Product clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ProductMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
