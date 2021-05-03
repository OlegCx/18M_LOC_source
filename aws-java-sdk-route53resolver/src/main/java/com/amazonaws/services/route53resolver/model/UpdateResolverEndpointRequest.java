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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateResolverEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResolverEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Resolver endpoint that you want to update.
     * </p>
     */
    private String resolverEndpointId;
    /**
     * <p>
     * The name of the Resolver endpoint that you want to update.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The ID of the Resolver endpoint that you want to update.
     * </p>
     * 
     * @param resolverEndpointId
     *        The ID of the Resolver endpoint that you want to update.
     */

    public void setResolverEndpointId(String resolverEndpointId) {
        this.resolverEndpointId = resolverEndpointId;
    }

    /**
     * <p>
     * The ID of the Resolver endpoint that you want to update.
     * </p>
     * 
     * @return The ID of the Resolver endpoint that you want to update.
     */

    public String getResolverEndpointId() {
        return this.resolverEndpointId;
    }

    /**
     * <p>
     * The ID of the Resolver endpoint that you want to update.
     * </p>
     * 
     * @param resolverEndpointId
     *        The ID of the Resolver endpoint that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResolverEndpointRequest withResolverEndpointId(String resolverEndpointId) {
        setResolverEndpointId(resolverEndpointId);
        return this;
    }

    /**
     * <p>
     * The name of the Resolver endpoint that you want to update.
     * </p>
     * 
     * @param name
     *        The name of the Resolver endpoint that you want to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Resolver endpoint that you want to update.
     * </p>
     * 
     * @return The name of the Resolver endpoint that you want to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Resolver endpoint that you want to update.
     * </p>
     * 
     * @param name
     *        The name of the Resolver endpoint that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResolverEndpointRequest withName(String name) {
        setName(name);
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
        if (getResolverEndpointId() != null)
            sb.append("ResolverEndpointId: ").append(getResolverEndpointId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResolverEndpointRequest == false)
            return false;
        UpdateResolverEndpointRequest other = (UpdateResolverEndpointRequest) obj;
        if (other.getResolverEndpointId() == null ^ this.getResolverEndpointId() == null)
            return false;
        if (other.getResolverEndpointId() != null && other.getResolverEndpointId().equals(this.getResolverEndpointId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolverEndpointId() == null) ? 0 : getResolverEndpointId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResolverEndpointRequest clone() {
        return (UpdateResolverEndpointRequest) super.clone();
    }

}
