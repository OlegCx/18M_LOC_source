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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DescribeRulesPackages" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRulesPackagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the rules package.
     * </p>
     */
    private java.util.List<RulesPackage> rulesPackages;
    /**
     * <p>
     * Rules package details that cannot be described. An error code is provided for each failed item.
     * </p>
     */
    private java.util.Map<String, FailedItemDetails> failedItems;

    /**
     * <p>
     * Information about the rules package.
     * </p>
     * 
     * @return Information about the rules package.
     */

    public java.util.List<RulesPackage> getRulesPackages() {
        return rulesPackages;
    }

    /**
     * <p>
     * Information about the rules package.
     * </p>
     * 
     * @param rulesPackages
     *        Information about the rules package.
     */

    public void setRulesPackages(java.util.Collection<RulesPackage> rulesPackages) {
        if (rulesPackages == null) {
            this.rulesPackages = null;
            return;
        }

        this.rulesPackages = new java.util.ArrayList<RulesPackage>(rulesPackages);
    }

    /**
     * <p>
     * Information about the rules package.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRulesPackages(java.util.Collection)} or {@link #withRulesPackages(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param rulesPackages
     *        Information about the rules package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRulesPackagesResult withRulesPackages(RulesPackage... rulesPackages) {
        if (this.rulesPackages == null) {
            setRulesPackages(new java.util.ArrayList<RulesPackage>(rulesPackages.length));
        }
        for (RulesPackage ele : rulesPackages) {
            this.rulesPackages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the rules package.
     * </p>
     * 
     * @param rulesPackages
     *        Information about the rules package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRulesPackagesResult withRulesPackages(java.util.Collection<RulesPackage> rulesPackages) {
        setRulesPackages(rulesPackages);
        return this;
    }

    /**
     * <p>
     * Rules package details that cannot be described. An error code is provided for each failed item.
     * </p>
     * 
     * @return Rules package details that cannot be described. An error code is provided for each failed item.
     */

    public java.util.Map<String, FailedItemDetails> getFailedItems() {
        return failedItems;
    }

    /**
     * <p>
     * Rules package details that cannot be described. An error code is provided for each failed item.
     * </p>
     * 
     * @param failedItems
     *        Rules package details that cannot be described. An error code is provided for each failed item.
     */

    public void setFailedItems(java.util.Map<String, FailedItemDetails> failedItems) {
        this.failedItems = failedItems;
    }

    /**
     * <p>
     * Rules package details that cannot be described. An error code is provided for each failed item.
     * </p>
     * 
     * @param failedItems
     *        Rules package details that cannot be described. An error code is provided for each failed item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRulesPackagesResult withFailedItems(java.util.Map<String, FailedItemDetails> failedItems) {
        setFailedItems(failedItems);
        return this;
    }

    /**
     * Add a single FailedItems entry
     *
     * @see DescribeRulesPackagesResult#withFailedItems
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRulesPackagesResult addFailedItemsEntry(String key, FailedItemDetails value) {
        if (null == this.failedItems) {
            this.failedItems = new java.util.HashMap<String, FailedItemDetails>();
        }
        if (this.failedItems.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.failedItems.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FailedItems.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRulesPackagesResult clearFailedItemsEntries() {
        this.failedItems = null;
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
        if (getRulesPackages() != null)
            sb.append("RulesPackages: ").append(getRulesPackages()).append(",");
        if (getFailedItems() != null)
            sb.append("FailedItems: ").append(getFailedItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRulesPackagesResult == false)
            return false;
        DescribeRulesPackagesResult other = (DescribeRulesPackagesResult) obj;
        if (other.getRulesPackages() == null ^ this.getRulesPackages() == null)
            return false;
        if (other.getRulesPackages() != null && other.getRulesPackages().equals(this.getRulesPackages()) == false)
            return false;
        if (other.getFailedItems() == null ^ this.getFailedItems() == null)
            return false;
        if (other.getFailedItems() != null && other.getFailedItems().equals(this.getFailedItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRulesPackages() == null) ? 0 : getRulesPackages().hashCode());
        hashCode = prime * hashCode + ((getFailedItems() == null) ? 0 : getFailedItems().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRulesPackagesResult clone() {
        try {
            return (DescribeRulesPackagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
