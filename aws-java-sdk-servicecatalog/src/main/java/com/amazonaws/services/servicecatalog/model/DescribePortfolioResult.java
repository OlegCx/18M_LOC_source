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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribePortfolio" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePortfolioResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the portfolio.
     * </p>
     */
    private PortfolioDetail portfolioDetail;
    /**
     * <p>
     * Information about the tags associated with the portfolio.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Information about the TagOptions associated with the portfolio.
     * </p>
     */
    private java.util.List<TagOptionDetail> tagOptions;
    /**
     * <p>
     * Information about the associated budgets.
     * </p>
     */
    private java.util.List<BudgetDetail> budgets;

    /**
     * <p>
     * Information about the portfolio.
     * </p>
     * 
     * @param portfolioDetail
     *        Information about the portfolio.
     */

    public void setPortfolioDetail(PortfolioDetail portfolioDetail) {
        this.portfolioDetail = portfolioDetail;
    }

    /**
     * <p>
     * Information about the portfolio.
     * </p>
     * 
     * @return Information about the portfolio.
     */

    public PortfolioDetail getPortfolioDetail() {
        return this.portfolioDetail;
    }

    /**
     * <p>
     * Information about the portfolio.
     * </p>
     * 
     * @param portfolioDetail
     *        Information about the portfolio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortfolioResult withPortfolioDetail(PortfolioDetail portfolioDetail) {
        setPortfolioDetail(portfolioDetail);
        return this;
    }

    /**
     * <p>
     * Information about the tags associated with the portfolio.
     * </p>
     * 
     * @return Information about the tags associated with the portfolio.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Information about the tags associated with the portfolio.
     * </p>
     * 
     * @param tags
     *        Information about the tags associated with the portfolio.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Information about the tags associated with the portfolio.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Information about the tags associated with the portfolio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortfolioResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the tags associated with the portfolio.
     * </p>
     * 
     * @param tags
     *        Information about the tags associated with the portfolio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortfolioResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Information about the TagOptions associated with the portfolio.
     * </p>
     * 
     * @return Information about the TagOptions associated with the portfolio.
     */

    public java.util.List<TagOptionDetail> getTagOptions() {
        return tagOptions;
    }

    /**
     * <p>
     * Information about the TagOptions associated with the portfolio.
     * </p>
     * 
     * @param tagOptions
     *        Information about the TagOptions associated with the portfolio.
     */

    public void setTagOptions(java.util.Collection<TagOptionDetail> tagOptions) {
        if (tagOptions == null) {
            this.tagOptions = null;
            return;
        }

        this.tagOptions = new java.util.ArrayList<TagOptionDetail>(tagOptions);
    }

    /**
     * <p>
     * Information about the TagOptions associated with the portfolio.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagOptions(java.util.Collection)} or {@link #withTagOptions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagOptions
     *        Information about the TagOptions associated with the portfolio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortfolioResult withTagOptions(TagOptionDetail... tagOptions) {
        if (this.tagOptions == null) {
            setTagOptions(new java.util.ArrayList<TagOptionDetail>(tagOptions.length));
        }
        for (TagOptionDetail ele : tagOptions) {
            this.tagOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the TagOptions associated with the portfolio.
     * </p>
     * 
     * @param tagOptions
     *        Information about the TagOptions associated with the portfolio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortfolioResult withTagOptions(java.util.Collection<TagOptionDetail> tagOptions) {
        setTagOptions(tagOptions);
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

    public DescribePortfolioResult withBudgets(BudgetDetail... budgets) {
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

    public DescribePortfolioResult withBudgets(java.util.Collection<BudgetDetail> budgets) {
        setBudgets(budgets);
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
        if (getPortfolioDetail() != null)
            sb.append("PortfolioDetail: ").append(getPortfolioDetail()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTagOptions() != null)
            sb.append("TagOptions: ").append(getTagOptions()).append(",");
        if (getBudgets() != null)
            sb.append("Budgets: ").append(getBudgets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePortfolioResult == false)
            return false;
        DescribePortfolioResult other = (DescribePortfolioResult) obj;
        if (other.getPortfolioDetail() == null ^ this.getPortfolioDetail() == null)
            return false;
        if (other.getPortfolioDetail() != null && other.getPortfolioDetail().equals(this.getPortfolioDetail()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTagOptions() == null ^ this.getTagOptions() == null)
            return false;
        if (other.getTagOptions() != null && other.getTagOptions().equals(this.getTagOptions()) == false)
            return false;
        if (other.getBudgets() == null ^ this.getBudgets() == null)
            return false;
        if (other.getBudgets() != null && other.getBudgets().equals(this.getBudgets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortfolioDetail() == null) ? 0 : getPortfolioDetail().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTagOptions() == null) ? 0 : getTagOptions().hashCode());
        hashCode = prime * hashCode + ((getBudgets() == null) ? 0 : getBudgets().hashCode());
        return hashCode;
    }

    @Override
    public DescribePortfolioResult clone() {
        try {
            return (DescribePortfolioResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
