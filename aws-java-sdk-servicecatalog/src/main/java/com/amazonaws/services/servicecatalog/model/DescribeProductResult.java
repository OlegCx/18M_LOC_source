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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProduct" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProductResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information about the product view.
     * </p>
     */
    private ProductViewSummary productViewSummary;
    /**
     * <p>
     * Information about the provisioning artifacts for the specified product.
     * </p>
     */
    private java.util.List<ProvisioningArtifact> provisioningArtifacts;
    /**
     * <p>
     * Information about the associated budgets.
     * </p>
     */
    private java.util.List<BudgetDetail> budgets;
    /**
     * <p>
     * Information about the associated launch paths.
     * </p>
     */
    private java.util.List<LaunchPath> launchPaths;

    /**
     * <p>
     * Summary information about the product view.
     * </p>
     * 
     * @param productViewSummary
     *        Summary information about the product view.
     */

    public void setProductViewSummary(ProductViewSummary productViewSummary) {
        this.productViewSummary = productViewSummary;
    }

    /**
     * <p>
     * Summary information about the product view.
     * </p>
     * 
     * @return Summary information about the product view.
     */

    public ProductViewSummary getProductViewSummary() {
        return this.productViewSummary;
    }

    /**
     * <p>
     * Summary information about the product view.
     * </p>
     * 
     * @param productViewSummary
     *        Summary information about the product view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductResult withProductViewSummary(ProductViewSummary productViewSummary) {
        setProductViewSummary(productViewSummary);
        return this;
    }

    /**
     * <p>
     * Information about the provisioning artifacts for the specified product.
     * </p>
     * 
     * @return Information about the provisioning artifacts for the specified product.
     */

    public java.util.List<ProvisioningArtifact> getProvisioningArtifacts() {
        return provisioningArtifacts;
    }

    /**
     * <p>
     * Information about the provisioning artifacts for the specified product.
     * </p>
     * 
     * @param provisioningArtifacts
     *        Information about the provisioning artifacts for the specified product.
     */

    public void setProvisioningArtifacts(java.util.Collection<ProvisioningArtifact> provisioningArtifacts) {
        if (provisioningArtifacts == null) {
            this.provisioningArtifacts = null;
            return;
        }

        this.provisioningArtifacts = new java.util.ArrayList<ProvisioningArtifact>(provisioningArtifacts);
    }

    /**
     * <p>
     * Information about the provisioning artifacts for the specified product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisioningArtifacts(java.util.Collection)} or
     * {@link #withProvisioningArtifacts(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param provisioningArtifacts
     *        Information about the provisioning artifacts for the specified product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductResult withProvisioningArtifacts(ProvisioningArtifact... provisioningArtifacts) {
        if (this.provisioningArtifacts == null) {
            setProvisioningArtifacts(new java.util.ArrayList<ProvisioningArtifact>(provisioningArtifacts.length));
        }
        for (ProvisioningArtifact ele : provisioningArtifacts) {
            this.provisioningArtifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the provisioning artifacts for the specified product.
     * </p>
     * 
     * @param provisioningArtifacts
     *        Information about the provisioning artifacts for the specified product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductResult withProvisioningArtifacts(java.util.Collection<ProvisioningArtifact> provisioningArtifacts) {
        setProvisioningArtifacts(provisioningArtifacts);
        return this;
    }

    /**
     * <p>
     * Information about the associated budgets.
     * </p>
     * 
     * @return Information about the associated budgets.
     */

    public java.util.List<BudgetDetail> getBudgets() {
        return budgets;
    }

    /**
     * <p>
     * Information about the associated budgets.
     * </p>
     * 
     * @param budgets
     *        Information about the associated budgets.
     */

    public void setBudgets(java.util.Collection<BudgetDetail> budgets) {
        if (budgets == null) {
            this.budgets = null;
            return;
        }

        this.budgets = new java.util.ArrayList<BudgetDetail>(budgets);
    }

    /**
     * <p>
     * Information about the associated budgets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBudgets(java.util.Collection)} or {@link #withBudgets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param budgets
     *        Information about the associated budgets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductResult withBudgets(BudgetDetail... budgets) {
        if (this.budgets == null) {
            setBudgets(new java.util.ArrayList<BudgetDetail>(budgets.length));
        }
        for (BudgetDetail ele : budgets) {
            this.budgets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the associated budgets.
     * </p>
     * 
     * @param budgets
     *        Information about the associated budgets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductResult withBudgets(java.util.Collection<BudgetDetail> budgets) {
        setBudgets(budgets);
        return this;
    }

    /**
     * <p>
     * Information about the associated launch paths.
     * </p>
     * 
     * @return Information about the associated launch paths.
     */

    public java.util.List<LaunchPath> getLaunchPaths() {
        return launchPaths;
    }

    /**
     * <p>
     * Information about the associated launch paths.
     * </p>
     * 
     * @param launchPaths
     *        Information about the associated launch paths.
     */

    public void setLaunchPaths(java.util.Collection<LaunchPath> launchPaths) {
        if (launchPaths == null) {
            this.launchPaths = null;
            return;
        }

        this.launchPaths = new java.util.ArrayList<LaunchPath>(launchPaths);
    }

    /**
     * <p>
     * Information about the associated launch paths.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLaunchPaths(java.util.Collection)} or {@link #withLaunchPaths(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param launchPaths
     *        Information about the associated launch paths.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductResult withLaunchPaths(LaunchPath... launchPaths) {
        if (this.launchPaths == null) {
            setLaunchPaths(new java.util.ArrayList<LaunchPath>(launchPaths.length));
        }
        for (LaunchPath ele : launchPaths) {
            this.launchPaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the associated launch paths.
     * </p>
     * 
     * @param launchPaths
     *        Information about the associated launch paths.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductResult withLaunchPaths(java.util.Collection<LaunchPath> launchPaths) {
        setLaunchPaths(launchPaths);
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
        if (getProductViewSummary() != null)
            sb.append("ProductViewSummary: ").append(getProductViewSummary()).append(",");
        if (getProvisioningArtifacts() != null)
            sb.append("ProvisioningArtifacts: ").append(getProvisioningArtifacts()).append(",");
        if (getBudgets() != null)
            sb.append("Budgets: ").append(getBudgets()).append(",");
        if (getLaunchPaths() != null)
            sb.append("LaunchPaths: ").append(getLaunchPaths());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProductResult == false)
            return false;
        DescribeProductResult other = (DescribeProductResult) obj;
        if (other.getProductViewSummary() == null ^ this.getProductViewSummary() == null)
            return false;
        if (other.getProductViewSummary() != null && other.getProductViewSummary().equals(this.getProductViewSummary()) == false)
            return false;
        if (other.getProvisioningArtifacts() == null ^ this.getProvisioningArtifacts() == null)
            return false;
        if (other.getProvisioningArtifacts() != null && other.getProvisioningArtifacts().equals(this.getProvisioningArtifacts()) == false)
            return false;
        if (other.getBudgets() == null ^ this.getBudgets() == null)
            return false;
        if (other.getBudgets() != null && other.getBudgets().equals(this.getBudgets()) == false)
            return false;
        if (other.getLaunchPaths() == null ^ this.getLaunchPaths() == null)
            return false;
        if (other.getLaunchPaths() != null && other.getLaunchPaths().equals(this.getLaunchPaths()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductViewSummary() == null) ? 0 : getProductViewSummary().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifacts() == null) ? 0 : getProvisioningArtifacts().hashCode());
        hashCode = prime * hashCode + ((getBudgets() == null) ? 0 : getBudgets().hashCode());
        hashCode = prime * hashCode + ((getLaunchPaths() == null) ? 0 : getLaunchPaths().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProductResult clone() {
        try {
            return (DescribeProductResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
