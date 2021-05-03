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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateReusableDelegationSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReusableDelegationSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains name server information.
     * </p>
     */
    private DelegationSet delegationSet;
    /**
     * <p>
     * The unique URL representing the new reusable delegation set.
     * </p>
     */
    private String location;

    /**
     * <p>
     * A complex type that contains name server information.
     * </p>
     * 
     * @param delegationSet
     *        A complex type that contains name server information.
     */

    public void setDelegationSet(DelegationSet delegationSet) {
        this.delegationSet = delegationSet;
    }

    /**
     * <p>
     * A complex type that contains name server information.
     * </p>
     * 
     * @return A complex type that contains name server information.
     */

    public DelegationSet getDelegationSet() {
        return this.delegationSet;
    }

    /**
     * <p>
     * A complex type that contains name server information.
     * </p>
     * 
     * @param delegationSet
     *        A complex type that contains name server information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReusableDelegationSetResult withDelegationSet(DelegationSet delegationSet) {
        setDelegationSet(delegationSet);
        return this;
    }

    /**
     * <p>
     * The unique URL representing the new reusable delegation set.
     * </p>
     * 
     * @param location
     *        The unique URL representing the new reusable delegation set.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The unique URL representing the new reusable delegation set.
     * </p>
     * 
     * @return The unique URL representing the new reusable delegation set.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The unique URL representing the new reusable delegation set.
     * </p>
     * 
     * @param location
     *        The unique URL representing the new reusable delegation set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReusableDelegationSetResult withLocation(String location) {
        setLocation(location);
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
        if (getDelegationSet() != null)
            sb.append("DelegationSet: ").append(getDelegationSet()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReusableDelegationSetResult == false)
            return false;
        CreateReusableDelegationSetResult other = (CreateReusableDelegationSetResult) obj;
        if (other.getDelegationSet() == null ^ this.getDelegationSet() == null)
            return false;
        if (other.getDelegationSet() != null && other.getDelegationSet().equals(this.getDelegationSet()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDelegationSet() == null) ? 0 : getDelegationSet().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public CreateReusableDelegationSetResult clone() {
        try {
            return (CreateReusableDelegationSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
