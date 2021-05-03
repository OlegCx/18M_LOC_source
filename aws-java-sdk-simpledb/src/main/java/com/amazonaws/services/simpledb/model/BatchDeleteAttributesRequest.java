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
package com.amazonaws.services.simpledb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The name of the domain in which the attributes are being deleted. */
    private String domainName;
    /** A list of items on which to perform the operation. */
    private com.amazonaws.internal.SdkInternalList<DeletableItem> items;

    /**
     * Default constructor for BatchDeleteAttributesRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public BatchDeleteAttributesRequest() {
    }

    /**
     * Constructs a new BatchDeleteAttributesRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param domainName
     *        The name of the domain in which the attributes are being deleted.
     * @param items
     *        A list of items on which to perform the operation.
     */
    public BatchDeleteAttributesRequest(String domainName, java.util.List<DeletableItem> items) {
        setDomainName(domainName);
        setItems(items);
    }

    /**
     * The name of the domain in which the attributes are being deleted.
     * 
     * @param domainName
     *        The name of the domain in which the attributes are being deleted.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * The name of the domain in which the attributes are being deleted.
     * 
     * @return The name of the domain in which the attributes are being deleted.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * The name of the domain in which the attributes are being deleted.
     * 
     * @param domainName
     *        The name of the domain in which the attributes are being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteAttributesRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * A list of items on which to perform the operation.
     * 
     * @return A list of items on which to perform the operation.
     */

    public java.util.List<DeletableItem> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<DeletableItem>();
        }
        return items;
    }

    /**
     * A list of items on which to perform the operation.
     * 
     * @param items
     *        A list of items on which to perform the operation.
     */

    public void setItems(java.util.Collection<DeletableItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<DeletableItem>(items);
    }

    /**
     * A list of items on which to perform the operation.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A list of items on which to perform the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteAttributesRequest withItems(DeletableItem... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<DeletableItem>(items.length));
        }
        for (DeletableItem ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * A list of items on which to perform the operation.
     * 
     * @param items
     *        A list of items on which to perform the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteAttributesRequest withItems(java.util.Collection<DeletableItem> items) {
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
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

        if (obj instanceof BatchDeleteAttributesRequest == false)
            return false;
        BatchDeleteAttributesRequest other = (BatchDeleteAttributesRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
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

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteAttributesRequest clone() {
        return (BatchDeleteAttributesRequest) super.clone();
    }

}
