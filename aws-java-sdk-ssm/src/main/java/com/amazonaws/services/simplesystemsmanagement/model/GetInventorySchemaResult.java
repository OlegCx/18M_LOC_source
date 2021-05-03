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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetInventorySchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInventorySchemaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Inventory schemas returned by the request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InventoryItemSchema> schemas;
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Inventory schemas returned by the request.
     * </p>
     * 
     * @return Inventory schemas returned by the request.
     */

    public java.util.List<InventoryItemSchema> getSchemas() {
        if (schemas == null) {
            schemas = new com.amazonaws.internal.SdkInternalList<InventoryItemSchema>();
        }
        return schemas;
    }

    /**
     * <p>
     * Inventory schemas returned by the request.
     * </p>
     * 
     * @param schemas
     *        Inventory schemas returned by the request.
     */

    public void setSchemas(java.util.Collection<InventoryItemSchema> schemas) {
        if (schemas == null) {
            this.schemas = null;
            return;
        }

        this.schemas = new com.amazonaws.internal.SdkInternalList<InventoryItemSchema>(schemas);
    }

    /**
     * <p>
     * Inventory schemas returned by the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchemas(java.util.Collection)} or {@link #withSchemas(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param schemas
     *        Inventory schemas returned by the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInventorySchemaResult withSchemas(InventoryItemSchema... schemas) {
        if (this.schemas == null) {
            setSchemas(new com.amazonaws.internal.SdkInternalList<InventoryItemSchema>(schemas.length));
        }
        for (InventoryItemSchema ele : schemas) {
            this.schemas.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Inventory schemas returned by the request.
     * </p>
     * 
     * @param schemas
     *        Inventory schemas returned by the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInventorySchemaResult withSchemas(java.util.Collection<InventoryItemSchema> schemas) {
        setSchemas(schemas);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @return The token to use when requesting the next set of items. If there are no additional items to return, the
     *         string is empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInventorySchemaResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getSchemas() != null)
            sb.append("Schemas: ").append(getSchemas()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInventorySchemaResult == false)
            return false;
        GetInventorySchemaResult other = (GetInventorySchemaResult) obj;
        if (other.getSchemas() == null ^ this.getSchemas() == null)
            return false;
        if (other.getSchemas() != null && other.getSchemas().equals(this.getSchemas()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemas() == null) ? 0 : getSchemas().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetInventorySchemaResult clone() {
        try {
            return (GetInventorySchemaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
