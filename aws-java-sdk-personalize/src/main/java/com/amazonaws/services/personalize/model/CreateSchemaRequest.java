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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSchemaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the schema.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A schema in Avro JSON format.
     * </p>
     */
    private String schema;

    /**
     * <p>
     * The name for the schema.
     * </p>
     * 
     * @param name
     *        The name for the schema.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the schema.
     * </p>
     * 
     * @return The name for the schema.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the schema.
     * </p>
     * 
     * @param name
     *        The name for the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A schema in Avro JSON format.
     * </p>
     * 
     * @param schema
     *        A schema in Avro JSON format.
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * A schema in Avro JSON format.
     * </p>
     * 
     * @return A schema in Avro JSON format.
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * A schema in Avro JSON format.
     * </p>
     * 
     * @param schema
     *        A schema in Avro JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaRequest withSchema(String schema) {
        setSchema(schema);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSchemaRequest == false)
            return false;
        CreateSchemaRequest other = (CreateSchemaRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        return hashCode;
    }

    @Override
    public CreateSchemaRequest clone() {
        return (CreateSchemaRequest) super.clone();
    }

}
