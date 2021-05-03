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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/RemoveAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveAttributesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private AttributesResource attributesResource;

    /**
     * @param attributesResource
     */

    public void setAttributesResource(AttributesResource attributesResource) {
        this.attributesResource = attributesResource;
    }

    /**
     * @return
     */

    public AttributesResource getAttributesResource() {
        return this.attributesResource;
    }

    /**
     * @param attributesResource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveAttributesResult withAttributesResource(AttributesResource attributesResource) {
        setAttributesResource(attributesResource);
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
        if (getAttributesResource() != null)
            sb.append("AttributesResource: ").append(getAttributesResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveAttributesResult == false)
            return false;
        RemoveAttributesResult other = (RemoveAttributesResult) obj;
        if (other.getAttributesResource() == null ^ this.getAttributesResource() == null)
            return false;
        if (other.getAttributesResource() != null && other.getAttributesResource().equals(this.getAttributesResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributesResource() == null) ? 0 : getAttributesResource().hashCode());
        return hashCode;
    }

    @Override
    public RemoveAttributesResult clone() {
        try {
            return (RemoveAttributesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
