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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a constraint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ConstraintDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConstraintDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the constraint.
     * </p>
     */
    private String constraintId;
    /**
     * <p>
     * The type of constraint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * STACKSET
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPLATE</code>
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The description of the constraint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The owner of the constraint.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The identifier of the product the constraint applies to. Note that a constraint applies to a specific instance of
     * a product within a certain portfolio.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The identifier of the portfolio the product resides in. The constraint applies only to the instance of the
     * product that lives within this portfolio.
     * </p>
     */
    private String portfolioId;

    /**
     * <p>
     * The identifier of the constraint.
     * </p>
     * 
     * @param constraintId
     *        The identifier of the constraint.
     */

    public void setConstraintId(String constraintId) {
        this.constraintId = constraintId;
    }

    /**
     * <p>
     * The identifier of the constraint.
     * </p>
     * 
     * @return The identifier of the constraint.
     */

    public String getConstraintId() {
        return this.constraintId;
    }

    /**
     * <p>
     * The identifier of the constraint.
     * </p>
     * 
     * @param constraintId
     *        The identifier of the constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConstraintDetail withConstraintId(String constraintId) {
        setConstraintId(constraintId);
        return this;
    }

    /**
     * <p>
     * The type of constraint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * STACKSET
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPLATE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of constraint.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LAUNCH</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOTIFICATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STACKSET
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEMPLATE</code>
     *        </p>
     *        </li>
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of constraint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * STACKSET
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPLATE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of constraint.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LAUNCH</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOTIFICATION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         STACKSET
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TEMPLATE</code>
     *         </p>
     *         </li>
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of constraint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * STACKSET
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPLATE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of constraint.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LAUNCH</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOTIFICATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STACKSET
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEMPLATE</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConstraintDetail withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The description of the constraint.
     * </p>
     * 
     * @param description
     *        The description of the constraint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the constraint.
     * </p>
     * 
     * @return The description of the constraint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the constraint.
     * </p>
     * 
     * @param description
     *        The description of the constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConstraintDetail withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The owner of the constraint.
     * </p>
     * 
     * @param owner
     *        The owner of the constraint.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the constraint.
     * </p>
     * 
     * @return The owner of the constraint.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the constraint.
     * </p>
     * 
     * @param owner
     *        The owner of the constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConstraintDetail withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The identifier of the product the constraint applies to. Note that a constraint applies to a specific instance of
     * a product within a certain portfolio.
     * </p>
     * 
     * @param productId
     *        The identifier of the product the constraint applies to. Note that a constraint applies to a specific
     *        instance of a product within a certain portfolio.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The identifier of the product the constraint applies to. Note that a constraint applies to a specific instance of
     * a product within a certain portfolio.
     * </p>
     * 
     * @return The identifier of the product the constraint applies to. Note that a constraint applies to a specific
     *         instance of a product within a certain portfolio.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The identifier of the product the constraint applies to. Note that a constraint applies to a specific instance of
     * a product within a certain portfolio.
     * </p>
     * 
     * @param productId
     *        The identifier of the product the constraint applies to. Note that a constraint applies to a specific
     *        instance of a product within a certain portfolio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConstraintDetail withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The identifier of the portfolio the product resides in. The constraint applies only to the instance of the
     * product that lives within this portfolio.
     * </p>
     * 
     * @param portfolioId
     *        The identifier of the portfolio the product resides in. The constraint applies only to the instance of the
     *        product that lives within this portfolio.
     */

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    /**
     * <p>
     * The identifier of the portfolio the product resides in. The constraint applies only to the instance of the
     * product that lives within this portfolio.
     * </p>
     * 
     * @return The identifier of the portfolio the product resides in. The constraint applies only to the instance of
     *         the product that lives within this portfolio.
     */

    public String getPortfolioId() {
        return this.portfolioId;
    }

    /**
     * <p>
     * The identifier of the portfolio the product resides in. The constraint applies only to the instance of the
     * product that lives within this portfolio.
     * </p>
     * 
     * @param portfolioId
     *        The identifier of the portfolio the product resides in. The constraint applies only to the instance of the
     *        product that lives within this portfolio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConstraintDetail withPortfolioId(String portfolioId) {
        setPortfolioId(portfolioId);
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
        if (getConstraintId() != null)
            sb.append("ConstraintId: ").append(getConstraintId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getPortfolioId() != null)
            sb.append("PortfolioId: ").append(getPortfolioId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConstraintDetail == false)
            return false;
        ConstraintDetail other = (ConstraintDetail) obj;
        if (other.getConstraintId() == null ^ this.getConstraintId() == null)
            return false;
        if (other.getConstraintId() != null && other.getConstraintId().equals(this.getConstraintId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getPortfolioId() == null ^ this.getPortfolioId() == null)
            return false;
        if (other.getPortfolioId() != null && other.getPortfolioId().equals(this.getPortfolioId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConstraintId() == null) ? 0 : getConstraintId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getPortfolioId() == null) ? 0 : getPortfolioId().hashCode());
        return hashCode;
    }

    @Override
    public ConstraintDetail clone() {
        try {
            return (ConstraintDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ConstraintDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
