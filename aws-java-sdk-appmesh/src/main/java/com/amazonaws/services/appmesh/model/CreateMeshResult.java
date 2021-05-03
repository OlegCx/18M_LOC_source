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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <zonbook></zonbook><xhtml></xhtml>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateMesh" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMeshResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The full description of your service mesh following the create call.
     * </p>
     */
    private MeshData mesh;

    /**
     * <p>
     * The full description of your service mesh following the create call.
     * </p>
     * 
     * @param mesh
     *        The full description of your service mesh following the create call.
     */

    public void setMesh(MeshData mesh) {
        this.mesh = mesh;
    }

    /**
     * <p>
     * The full description of your service mesh following the create call.
     * </p>
     * 
     * @return The full description of your service mesh following the create call.
     */

    public MeshData getMesh() {
        return this.mesh;
    }

    /**
     * <p>
     * The full description of your service mesh following the create call.
     * </p>
     * 
     * @param mesh
     *        The full description of your service mesh following the create call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeshResult withMesh(MeshData mesh) {
        setMesh(mesh);
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
        if (getMesh() != null)
            sb.append("Mesh: ").append(getMesh());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMeshResult == false)
            return false;
        CreateMeshResult other = (CreateMeshResult) obj;
        if (other.getMesh() == null ^ this.getMesh() == null)
            return false;
        if (other.getMesh() != null && other.getMesh().equals(this.getMesh()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMesh() == null) ? 0 : getMesh().hashCode());
        return hashCode;
    }

    @Override
    public CreateMeshResult clone() {
        try {
            return (CreateMeshResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
