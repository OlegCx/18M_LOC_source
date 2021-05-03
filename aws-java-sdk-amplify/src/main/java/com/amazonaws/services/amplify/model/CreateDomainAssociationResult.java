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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result structure for the create domain association request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateDomainAssociation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDomainAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes the structure of a domain association, which associates a custom domain with an Amplify app.
     * </p>
     */
    private DomainAssociation domainAssociation;

    /**
     * <p>
     * Describes the structure of a domain association, which associates a custom domain with an Amplify app.
     * </p>
     * 
     * @param domainAssociation
     *        Describes the structure of a domain association, which associates a custom domain with an Amplify app.
     */

    public void setDomainAssociation(DomainAssociation domainAssociation) {
        this.domainAssociation = domainAssociation;
    }

    /**
     * <p>
     * Describes the structure of a domain association, which associates a custom domain with an Amplify app.
     * </p>
     * 
     * @return Describes the structure of a domain association, which associates a custom domain with an Amplify app.
     */

    public DomainAssociation getDomainAssociation() {
        return this.domainAssociation;
    }

    /**
     * <p>
     * Describes the structure of a domain association, which associates a custom domain with an Amplify app.
     * </p>
     * 
     * @param domainAssociation
     *        Describes the structure of a domain association, which associates a custom domain with an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainAssociationResult withDomainAssociation(DomainAssociation domainAssociation) {
        setDomainAssociation(domainAssociation);
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
        if (getDomainAssociation() != null)
            sb.append("DomainAssociation: ").append(getDomainAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDomainAssociationResult == false)
            return false;
        CreateDomainAssociationResult other = (CreateDomainAssociationResult) obj;
        if (other.getDomainAssociation() == null ^ this.getDomainAssociation() == null)
            return false;
        if (other.getDomainAssociation() != null && other.getDomainAssociation().equals(this.getDomainAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainAssociation() == null) ? 0 : getDomainAssociation().hashCode());
        return hashCode;
    }

    @Override
    public CreateDomainAssociationResult clone() {
        try {
            return (CreateDomainAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
