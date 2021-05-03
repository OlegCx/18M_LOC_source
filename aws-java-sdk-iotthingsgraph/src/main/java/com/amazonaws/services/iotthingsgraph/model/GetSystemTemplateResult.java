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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetSystemTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSystemTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that contains summary data about the system.
     * </p>
     */
    private SystemTemplateDescription description;

    /**
     * <p>
     * An object that contains summary data about the system.
     * </p>
     * 
     * @param description
     *        An object that contains summary data about the system.
     */

    public void setDescription(SystemTemplateDescription description) {
        this.description = description;
    }

    /**
     * <p>
     * An object that contains summary data about the system.
     * </p>
     * 
     * @return An object that contains summary data about the system.
     */

    public SystemTemplateDescription getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An object that contains summary data about the system.
     * </p>
     * 
     * @param description
     *        An object that contains summary data about the system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSystemTemplateResult withDescription(SystemTemplateDescription description) {
        setDescription(description);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSystemTemplateResult == false)
            return false;
        GetSystemTemplateResult other = (GetSystemTemplateResult) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public GetSystemTemplateResult clone() {
        try {
            return (GetSystemTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
