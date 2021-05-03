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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDevEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDevEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>DevEndpoint</code> definition.
     * </p>
     */
    private DevEndpoint devEndpoint;

    /**
     * <p>
     * A <code>DevEndpoint</code> definition.
     * </p>
     * 
     * @param devEndpoint
     *        A <code>DevEndpoint</code> definition.
     */

    public void setDevEndpoint(DevEndpoint devEndpoint) {
        this.devEndpoint = devEndpoint;
    }

    /**
     * <p>
     * A <code>DevEndpoint</code> definition.
     * </p>
     * 
     * @return A <code>DevEndpoint</code> definition.
     */

    public DevEndpoint getDevEndpoint() {
        return this.devEndpoint;
    }

    /**
     * <p>
     * A <code>DevEndpoint</code> definition.
     * </p>
     * 
     * @param devEndpoint
     *        A <code>DevEndpoint</code> definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDevEndpointResult withDevEndpoint(DevEndpoint devEndpoint) {
        setDevEndpoint(devEndpoint);
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
        if (getDevEndpoint() != null)
            sb.append("DevEndpoint: ").append(getDevEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDevEndpointResult == false)
            return false;
        GetDevEndpointResult other = (GetDevEndpointResult) obj;
        if (other.getDevEndpoint() == null ^ this.getDevEndpoint() == null)
            return false;
        if (other.getDevEndpoint() != null && other.getDevEndpoint().equals(this.getDevEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevEndpoint() == null) ? 0 : getDevEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public GetDevEndpointResult clone() {
        try {
            return (GetDevEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
