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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The API ID.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The type definition, in GraphQL Schema Definition Language (SDL) format.
     * </p>
     * <p>
     * For more information, see the <a href="http://graphql.org/learn/schema/">GraphQL SDL documentation</a>.
     * </p>
     */
    private String definition;
    /**
     * <p>
     * The type format: SDL or JSON.
     * </p>
     */
    private String format;

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @param apiId
     *        The API ID.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @return The API ID.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @param apiId
     *        The API ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTypeRequest withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The type definition, in GraphQL Schema Definition Language (SDL) format.
     * </p>
     * <p>
     * For more information, see the <a href="http://graphql.org/learn/schema/">GraphQL SDL documentation</a>.
     * </p>
     * 
     * @param definition
     *        The type definition, in GraphQL Schema Definition Language (SDL) format.</p>
     *        <p>
     *        For more information, see the <a href="http://graphql.org/learn/schema/">GraphQL SDL documentation</a>.
     */

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The type definition, in GraphQL Schema Definition Language (SDL) format.
     * </p>
     * <p>
     * For more information, see the <a href="http://graphql.org/learn/schema/">GraphQL SDL documentation</a>.
     * </p>
     * 
     * @return The type definition, in GraphQL Schema Definition Language (SDL) format.</p>
     *         <p>
     *         For more information, see the <a href="http://graphql.org/learn/schema/">GraphQL SDL documentation</a>.
     */

    public String getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The type definition, in GraphQL Schema Definition Language (SDL) format.
     * </p>
     * <p>
     * For more information, see the <a href="http://graphql.org/learn/schema/">GraphQL SDL documentation</a>.
     * </p>
     * 
     * @param definition
     *        The type definition, in GraphQL Schema Definition Language (SDL) format.</p>
     *        <p>
     *        For more information, see the <a href="http://graphql.org/learn/schema/">GraphQL SDL documentation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTypeRequest withDefinition(String definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The type format: SDL or JSON.
     * </p>
     * 
     * @param format
     *        The type format: SDL or JSON.
     * @see TypeDefinitionFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The type format: SDL or JSON.
     * </p>
     * 
     * @return The type format: SDL or JSON.
     * @see TypeDefinitionFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The type format: SDL or JSON.
     * </p>
     * 
     * @param format
     *        The type format: SDL or JSON.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TypeDefinitionFormat
     */

    public CreateTypeRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The type format: SDL or JSON.
     * </p>
     * 
     * @param format
     *        The type format: SDL or JSON.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TypeDefinitionFormat
     */

    public CreateTypeRequest withFormat(TypeDefinitionFormat format) {
        this.format = format.toString();
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
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTypeRequest == false)
            return false;
        CreateTypeRequest other = (CreateTypeRequest) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public CreateTypeRequest clone() {
        return (CreateTypeRequest) super.clone();
    }

}
