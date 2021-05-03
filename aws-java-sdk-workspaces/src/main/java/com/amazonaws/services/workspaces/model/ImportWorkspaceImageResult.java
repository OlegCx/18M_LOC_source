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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ImportWorkspaceImage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportWorkspaceImageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the WorkSpace image.
     * </p>
     */
    private String imageId;

    /**
     * <p>
     * The identifier of the WorkSpace image.
     * </p>
     * 
     * @param imageId
     *        The identifier of the WorkSpace image.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The identifier of the WorkSpace image.
     * </p>
     * 
     * @return The identifier of the WorkSpace image.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The identifier of the WorkSpace image.
     * </p>
     * 
     * @param imageId
     *        The identifier of the WorkSpace image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportWorkspaceImageResult withImageId(String imageId) {
        setImageId(imageId);
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
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportWorkspaceImageResult == false)
            return false;
        ImportWorkspaceImageResult other = (ImportWorkspaceImageResult) obj;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        return hashCode;
    }

    @Override
    public ImportWorkspaceImageResult clone() {
        try {
            return (ImportWorkspaceImageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
