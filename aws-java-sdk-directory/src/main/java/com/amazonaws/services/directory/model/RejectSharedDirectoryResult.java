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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RejectSharedDirectory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RejectSharedDirectoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier of the shared directory in the directory consumer account.
     * </p>
     */
    private String sharedDirectoryId;

    /**
     * <p>
     * Identifier of the shared directory in the directory consumer account.
     * </p>
     * 
     * @param sharedDirectoryId
     *        Identifier of the shared directory in the directory consumer account.
     */

    public void setSharedDirectoryId(String sharedDirectoryId) {
        this.sharedDirectoryId = sharedDirectoryId;
    }

    /**
     * <p>
     * Identifier of the shared directory in the directory consumer account.
     * </p>
     * 
     * @return Identifier of the shared directory in the directory consumer account.
     */

    public String getSharedDirectoryId() {
        return this.sharedDirectoryId;
    }

    /**
     * <p>
     * Identifier of the shared directory in the directory consumer account.
     * </p>
     * 
     * @param sharedDirectoryId
     *        Identifier of the shared directory in the directory consumer account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectSharedDirectoryResult withSharedDirectoryId(String sharedDirectoryId) {
        setSharedDirectoryId(sharedDirectoryId);
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
        if (getSharedDirectoryId() != null)
            sb.append("SharedDirectoryId: ").append(getSharedDirectoryId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RejectSharedDirectoryResult == false)
            return false;
        RejectSharedDirectoryResult other = (RejectSharedDirectoryResult) obj;
        if (other.getSharedDirectoryId() == null ^ this.getSharedDirectoryId() == null)
            return false;
        if (other.getSharedDirectoryId() != null && other.getSharedDirectoryId().equals(this.getSharedDirectoryId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSharedDirectoryId() == null) ? 0 : getSharedDirectoryId().hashCode());
        return hashCode;
    }

    @Override
    public RejectSharedDirectoryResult clone() {
        try {
            return (RejectSharedDirectoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
