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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateProvisioningArtifact"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProvisioningArtifactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     */
    private String acceptLanguage;
    /**
     * <p>
     * The product identifier.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     */
    private String provisioningArtifactId;
    /**
     * <p>
     * The updated name of the provisioning artifact.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The updated description of the provisioning artifact.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Indicates whether the product version is active.
     * </p>
     * <p>
     * Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned
     * product from an inactive provisioning artifact.
     * </p>
     */
    private Boolean active;
    /**
     * <p>
     * Information set by the administrator to provide guidance to end users about which provisioning artifacts to use.
     * </p>
     * <p>
     * The <code>DEFAULT</code> value indicates that the product version is active.
     * </p>
     * <p>
     * The administrator can set the guidance to <code>DEPRECATED</code> to inform users that the product version is
     * deprecated. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new
     * provisioned products using a deprecated version.
     * </p>
     */
    private String guidance;

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language code.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningArtifactRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @return The product identifier.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningArtifactRequest withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact.
     */

    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @return The identifier of the provisioning artifact.
     */

    public String getProvisioningArtifactId() {
        return this.provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningArtifactRequest withProvisioningArtifactId(String provisioningArtifactId) {
        setProvisioningArtifactId(provisioningArtifactId);
        return this;
    }

    /**
     * <p>
     * The updated name of the provisioning artifact.
     * </p>
     * 
     * @param name
     *        The updated name of the provisioning artifact.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The updated name of the provisioning artifact.
     * </p>
     * 
     * @return The updated name of the provisioning artifact.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The updated name of the provisioning artifact.
     * </p>
     * 
     * @param name
     *        The updated name of the provisioning artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningArtifactRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The updated description of the provisioning artifact.
     * </p>
     * 
     * @param description
     *        The updated description of the provisioning artifact.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated description of the provisioning artifact.
     * </p>
     * 
     * @return The updated description of the provisioning artifact.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The updated description of the provisioning artifact.
     * </p>
     * 
     * @param description
     *        The updated description of the provisioning artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningArtifactRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Indicates whether the product version is active.
     * </p>
     * <p>
     * Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned
     * product from an inactive provisioning artifact.
     * </p>
     * 
     * @param active
     *        Indicates whether the product version is active.</p>
     *        <p>
     *        Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a
     *        provisioned product from an inactive provisioning artifact.
     */

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * Indicates whether the product version is active.
     * </p>
     * <p>
     * Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned
     * product from an inactive provisioning artifact.
     * </p>
     * 
     * @return Indicates whether the product version is active.</p>
     *         <p>
     *         Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a
     *         provisioned product from an inactive provisioning artifact.
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * <p>
     * Indicates whether the product version is active.
     * </p>
     * <p>
     * Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned
     * product from an inactive provisioning artifact.
     * </p>
     * 
     * @param active
     *        Indicates whether the product version is active.</p>
     *        <p>
     *        Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a
     *        provisioned product from an inactive provisioning artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningArtifactRequest withActive(Boolean active) {
        setActive(active);
        return this;
    }

    /**
     * <p>
     * Indicates whether the product version is active.
     * </p>
     * <p>
     * Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned
     * product from an inactive provisioning artifact.
     * </p>
     * 
     * @return Indicates whether the product version is active.</p>
     *         <p>
     *         Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a
     *         provisioned product from an inactive provisioning artifact.
     */

    public Boolean isActive() {
        return this.active;
    }

    /**
     * <p>
     * Information set by the administrator to provide guidance to end users about which provisioning artifacts to use.
     * </p>
     * <p>
     * The <code>DEFAULT</code> value indicates that the product version is active.
     * </p>
     * <p>
     * The administrator can set the guidance to <code>DEPRECATED</code> to inform users that the product version is
     * deprecated. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new
     * provisioned products using a deprecated version.
     * </p>
     * 
     * @param guidance
     *        Information set by the administrator to provide guidance to end users about which provisioning artifacts
     *        to use.</p>
     *        <p>
     *        The <code>DEFAULT</code> value indicates that the product version is active.
     *        </p>
     *        <p>
     *        The administrator can set the guidance to <code>DEPRECATED</code> to inform users that the product version
     *        is deprecated. Users are able to make updates to a provisioned product of a deprecated version but cannot
     *        launch new provisioned products using a deprecated version.
     * @see ProvisioningArtifactGuidance
     */

    public void setGuidance(String guidance) {
        this.guidance = guidance;
    }

    /**
     * <p>
     * Information set by the administrator to provide guidance to end users about which provisioning artifacts to use.
     * </p>
     * <p>
     * The <code>DEFAULT</code> value indicates that the product version is active.
     * </p>
     * <p>
     * The administrator can set the guidance to <code>DEPRECATED</code> to inform users that the product version is
     * deprecated. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new
     * provisioned products using a deprecated version.
     * </p>
     * 
     * @return Information set by the administrator to provide guidance to end users about which provisioning artifacts
     *         to use.</p>
     *         <p>
     *         The <code>DEFAULT</code> value indicates that the product version is active.
     *         </p>
     *         <p>
     *         The administrator can set the guidance to <code>DEPRECATED</code> to inform users that the product
     *         version is deprecated. Users are able to make updates to a provisioned product of a deprecated version
     *         but cannot launch new provisioned products using a deprecated version.
     * @see ProvisioningArtifactGuidance
     */

    public String getGuidance() {
        return this.guidance;
    }

    /**
     * <p>
     * Information set by the administrator to provide guidance to end users about which provisioning artifacts to use.
     * </p>
     * <p>
     * The <code>DEFAULT</code> value indicates that the product version is active.
     * </p>
     * <p>
     * The administrator can set the guidance to <code>DEPRECATED</code> to inform users that the product version is
     * deprecated. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new
     * provisioned products using a deprecated version.
     * </p>
     * 
     * @param guidance
     *        Information set by the administrator to provide guidance to end users about which provisioning artifacts
     *        to use.</p>
     *        <p>
     *        The <code>DEFAULT</code> value indicates that the product version is active.
     *        </p>
     *        <p>
     *        The administrator can set the guidance to <code>DEPRECATED</code> to inform users that the product version
     *        is deprecated. Users are able to make updates to a provisioned product of a deprecated version but cannot
     *        launch new provisioned products using a deprecated version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisioningArtifactGuidance
     */

    public UpdateProvisioningArtifactRequest withGuidance(String guidance) {
        setGuidance(guidance);
        return this;
    }

    /**
     * <p>
     * Information set by the administrator to provide guidance to end users about which provisioning artifacts to use.
     * </p>
     * <p>
     * The <code>DEFAULT</code> value indicates that the product version is active.
     * </p>
     * <p>
     * The administrator can set the guidance to <code>DEPRECATED</code> to inform users that the product version is
     * deprecated. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new
     * provisioned products using a deprecated version.
     * </p>
     * 
     * @param guidance
     *        Information set by the administrator to provide guidance to end users about which provisioning artifacts
     *        to use.</p>
     *        <p>
     *        The <code>DEFAULT</code> value indicates that the product version is active.
     *        </p>
     *        <p>
     *        The administrator can set the guidance to <code>DEPRECATED</code> to inform users that the product version
     *        is deprecated. Users are able to make updates to a provisioned product of a deprecated version but cannot
     *        launch new provisioned products using a deprecated version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisioningArtifactGuidance
     */

    public UpdateProvisioningArtifactRequest withGuidance(ProvisioningArtifactGuidance guidance) {
        this.guidance = guidance.toString();
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: ").append(getProvisioningArtifactId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getActive() != null)
            sb.append("Active: ").append(getActive()).append(",");
        if (getGuidance() != null)
            sb.append("Guidance: ").append(getGuidance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProvisioningArtifactRequest == false)
            return false;
        UpdateProvisioningArtifactRequest other = (UpdateProvisioningArtifactRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        if (other.getGuidance() == null ^ this.getGuidance() == null)
            return false;
        if (other.getGuidance() != null && other.getGuidance().equals(this.getGuidance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        hashCode = prime * hashCode + ((getGuidance() == null) ? 0 : getGuidance().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProvisioningArtifactRequest clone() {
        return (UpdateProvisioningArtifactRequest) super.clone();
    }

}
