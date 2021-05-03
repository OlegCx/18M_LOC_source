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
public class DomainMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The name of the domain for which to display the metadata of. */
    private String domainName;

    /**
     * Default constructor for DomainMetadataRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public DomainMetadataRequest() {
    }

    /**
     * Constructs a new DomainMetadataRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param domainName
     *        The name of the domain for which to display the metadata of.
     */
    public DomainMetadataRequest(String domainName) {
        setDomainName(domainName);
    }

    /**
     * The name of the domain for which to display the metadata of.
     * 
     * @param domainName
     *        The name of the domain for which to display the metadata of.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * The name of the domain for which to display the metadata of.
     * 
     * @return The name of the domain for which to display the metadata of.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * The name of the domain for which to display the metadata of.
     * 
     * @param domainName
     *        The name of the domain for which to display the metadata of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainMetadataRequest withDomainName(String domainName) {
        setDomainName(domainName);
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
            sb.append("DomainName: ").append(getDomainName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainMetadataRequest == false)
            return false;
        DomainMetadataRequest other = (DomainMetadataRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public DomainMetadataRequest clone() {
        return (DomainMetadataRequest) super.clone();
    }

}
