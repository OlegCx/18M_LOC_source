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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Retrieves attributes within a facet that are associated with an object inside an <a>BatchRead</a> operation. For more
 * information, see <a>GetObjectAttributes</a> and <a>BatchReadRequest$Operations</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchGetObjectAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetObjectAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Reference that identifies the object whose attributes will be retrieved.
     * </p>
     */
    private ObjectReference objectReference;
    /**
     * <p>
     * Identifier for the facet whose attributes will be retrieved. See <a>SchemaFacet</a> for details.
     * </p>
     */
    private SchemaFacet schemaFacet;
    /**
     * <p>
     * List of attribute names whose values will be retrieved.
     * </p>
     */
    private java.util.List<String> attributeNames;

    /**
     * <p>
     * Reference that identifies the object whose attributes will be retrieved.
     * </p>
     * 
     * @param objectReference
     *        Reference that identifies the object whose attributes will be retrieved.
     */

    public void setObjectReference(ObjectReference objectReference) {
        this.objectReference = objectReference;
    }

    /**
     * <p>
     * Reference that identifies the object whose attributes will be retrieved.
     * </p>
     * 
     * @return Reference that identifies the object whose attributes will be retrieved.
     */

    public ObjectReference getObjectReference() {
        return this.objectReference;
    }

    /**
     * <p>
     * Reference that identifies the object whose attributes will be retrieved.
     * </p>
     * 
     * @param objectReference
     *        Reference that identifies the object whose attributes will be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetObjectAttributes withObjectReference(ObjectReference objectReference) {
        setObjectReference(objectReference);
        return this;
    }

    /**
     * <p>
     * Identifier for the facet whose attributes will be retrieved. See <a>SchemaFacet</a> for details.
     * </p>
     * 
     * @param schemaFacet
     *        Identifier for the facet whose attributes will be retrieved. See <a>SchemaFacet</a> for details.
     */

    public void setSchemaFacet(SchemaFacet schemaFacet) {
        this.schemaFacet = schemaFacet;
    }

    /**
     * <p>
     * Identifier for the facet whose attributes will be retrieved. See <a>SchemaFacet</a> for details.
     * </p>
     * 
     * @return Identifier for the facet whose attributes will be retrieved. See <a>SchemaFacet</a> for details.
     */

    public SchemaFacet getSchemaFacet() {
        return this.schemaFacet;
    }

    /**
     * <p>
     * Identifier for the facet whose attributes will be retrieved. See <a>SchemaFacet</a> for details.
     * </p>
     * 
     * @param schemaFacet
     *        Identifier for the facet whose attributes will be retrieved. See <a>SchemaFacet</a> for details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetObjectAttributes withSchemaFacet(SchemaFacet schemaFacet) {
        setSchemaFacet(schemaFacet);
        return this;
    }

    /**
     * <p>
     * List of attribute names whose values will be retrieved.
     * </p>
     * 
     * @return List of attribute names whose values will be retrieved.
     */

    public java.util.List<String> getAttributeNames() {
        return attributeNames;
    }

    /**
     * <p>
     * List of attribute names whose values will be retrieved.
     * </p>
     * 
     * @param attributeNames
     *        List of attribute names whose values will be retrieved.
     */

    public void setAttributeNames(java.util.Collection<String> attributeNames) {
        if (attributeNames == null) {
            this.attributeNames = null;
            return;
        }

        this.attributeNames = new java.util.ArrayList<String>(attributeNames);
    }

    /**
     * <p>
     * List of attribute names whose values will be retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeNames(java.util.Collection)} or {@link #withAttributeNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param attributeNames
     *        List of attribute names whose values will be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetObjectAttributes withAttributeNames(String... attributeNames) {
        if (this.attributeNames == null) {
            setAttributeNames(new java.util.ArrayList<String>(attributeNames.length));
        }
        for (String ele : attributeNames) {
            this.attributeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of attribute names whose values will be retrieved.
     * </p>
     * 
     * @param attributeNames
     *        List of attribute names whose values will be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetObjectAttributes withAttributeNames(java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
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
        if (getObjectReference() != null)
            sb.append("ObjectReference: ").append(getObjectReference()).append(",");
        if (getSchemaFacet() != null)
            sb.append("SchemaFacet: ").append(getSchemaFacet()).append(",");
        if (getAttributeNames() != null)
            sb.append("AttributeNames: ").append(getAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetObjectAttributes == false)
            return false;
        BatchGetObjectAttributes other = (BatchGetObjectAttributes) obj;
        if (other.getObjectReference() == null ^ this.getObjectReference() == null)
            return false;
        if (other.getObjectReference() != null && other.getObjectReference().equals(this.getObjectReference()) == false)
            return false;
        if (other.getSchemaFacet() == null ^ this.getSchemaFacet() == null)
            return false;
        if (other.getSchemaFacet() != null && other.getSchemaFacet().equals(this.getSchemaFacet()) == false)
            return false;
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null)
            return false;
        if (other.getAttributeNames() != null && other.getAttributeNames().equals(this.getAttributeNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjectReference() == null) ? 0 : getObjectReference().hashCode());
        hashCode = prime * hashCode + ((getSchemaFacet() == null) ? 0 : getSchemaFacet().hashCode());
        hashCode = prime * hashCode + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetObjectAttributes clone() {
        try {
            return (BatchGetObjectAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchGetObjectAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
