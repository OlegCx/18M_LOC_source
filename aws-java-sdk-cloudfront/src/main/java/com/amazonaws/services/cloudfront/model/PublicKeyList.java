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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A list of public keys that you can use with <a
 * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">signed URLs and signed
 * cookies</a>, or with <a
 * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html">field-level
 * encryption</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/PublicKeyList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublicKeyList implements Serializable, Cloneable {

    /**
     * <p>
     * If there are more elements to be listed, this element is present and contains the value that you can use for the
     * <code>Marker</code> request parameter to continue listing your public keys where you left off.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * The maximum number of public keys you want in the response.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * The number of public keys in the list.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * A list of public keys.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PublicKeySummary> items;

    /**
     * <p>
     * If there are more elements to be listed, this element is present and contains the value that you can use for the
     * <code>Marker</code> request parameter to continue listing your public keys where you left off.
     * </p>
     * 
     * @param nextMarker
     *        If there are more elements to be listed, this element is present and contains the value that you can use
     *        for the <code>Marker</code> request parameter to continue listing your public keys where you left off.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If there are more elements to be listed, this element is present and contains the value that you can use for the
     * <code>Marker</code> request parameter to continue listing your public keys where you left off.
     * </p>
     * 
     * @return If there are more elements to be listed, this element is present and contains the value that you can use
     *         for the <code>Marker</code> request parameter to continue listing your public keys where you left off.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If there are more elements to be listed, this element is present and contains the value that you can use for the
     * <code>Marker</code> request parameter to continue listing your public keys where you left off.
     * </p>
     * 
     * @param nextMarker
     *        If there are more elements to be listed, this element is present and contains the value that you can use
     *        for the <code>Marker</code> request parameter to continue listing your public keys where you left off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKeyList withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * The maximum number of public keys you want in the response.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of public keys you want in the response.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of public keys you want in the response.
     * </p>
     * 
     * @return The maximum number of public keys you want in the response.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of public keys you want in the response.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of public keys you want in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKeyList withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * The number of public keys in the list.
     * </p>
     * 
     * @param quantity
     *        The number of public keys in the list.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of public keys in the list.
     * </p>
     * 
     * @return The number of public keys in the list.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of public keys in the list.
     * </p>
     * 
     * @param quantity
     *        The number of public keys in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKeyList withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * A list of public keys.
     * </p>
     * 
     * @return A list of public keys.
     */

    public java.util.List<PublicKeySummary> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<PublicKeySummary>();
        }
        return items;
    }

    /**
     * <p>
     * A list of public keys.
     * </p>
     * 
     * @param items
     *        A list of public keys.
     */

    public void setItems(java.util.Collection<PublicKeySummary> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<PublicKeySummary>(items);
    }

    /**
     * <p>
     * A list of public keys.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A list of public keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKeyList withItems(PublicKeySummary... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<PublicKeySummary>(items.length));
        }
        for (PublicKeySummary ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of public keys.
     * </p>
     * 
     * @param items
     *        A list of public keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKeyList withItems(java.util.Collection<PublicKeySummary> items) {
        setItems(items);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
        if (getQuantity() != null)
            sb.append("Quantity: ").append(getQuantity()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublicKeyList == false)
            return false;
        PublicKeyList other = (PublicKeyList) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public PublicKeyList clone() {
        try {
            return (PublicKeyList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
