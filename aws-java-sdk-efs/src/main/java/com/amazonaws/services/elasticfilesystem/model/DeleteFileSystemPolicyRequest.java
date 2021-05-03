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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DeleteFileSystemPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFileSystemPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the EFS file system for which to delete the <code>FileSystemPolicy</code>.
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * Specifies the EFS file system for which to delete the <code>FileSystemPolicy</code>.
     * </p>
     * 
     * @param fileSystemId
     *        Specifies the EFS file system for which to delete the <code>FileSystemPolicy</code>.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * Specifies the EFS file system for which to delete the <code>FileSystemPolicy</code>.
     * </p>
     * 
     * @return Specifies the EFS file system for which to delete the <code>FileSystemPolicy</code>.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * Specifies the EFS file system for which to delete the <code>FileSystemPolicy</code>.
     * </p>
     * 
     * @param fileSystemId
     *        Specifies the EFS file system for which to delete the <code>FileSystemPolicy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileSystemPolicyRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFileSystemPolicyRequest == false)
            return false;
        DeleteFileSystemPolicyRequest other = (DeleteFileSystemPolicyRequest) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFileSystemPolicyRequest clone() {
        return (DeleteFileSystemPolicyRequest) super.clone();
    }

}
