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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeFileSystemAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFileSystemAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array containing the <code>FileSystemAssociationInfo</code> data type of each file system association to be
     * described.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FileSystemAssociationInfo> fileSystemAssociationInfoList;

    /**
     * <p>
     * An array containing the <code>FileSystemAssociationInfo</code> data type of each file system association to be
     * described.
     * </p>
     * 
     * @return An array containing the <code>FileSystemAssociationInfo</code> data type of each file system association
     *         to be described.
     */

    public java.util.List<FileSystemAssociationInfo> getFileSystemAssociationInfoList() {
        if (fileSystemAssociationInfoList == null) {
            fileSystemAssociationInfoList = new com.amazonaws.internal.SdkInternalList<FileSystemAssociationInfo>();
        }
        return fileSystemAssociationInfoList;
    }

    /**
     * <p>
     * An array containing the <code>FileSystemAssociationInfo</code> data type of each file system association to be
     * described.
     * </p>
     * 
     * @param fileSystemAssociationInfoList
     *        An array containing the <code>FileSystemAssociationInfo</code> data type of each file system association
     *        to be described.
     */

    public void setFileSystemAssociationInfoList(java.util.Collection<FileSystemAssociationInfo> fileSystemAssociationInfoList) {
        if (fileSystemAssociationInfoList == null) {
            this.fileSystemAssociationInfoList = null;
            return;
        }

        this.fileSystemAssociationInfoList = new com.amazonaws.internal.SdkInternalList<FileSystemAssociationInfo>(fileSystemAssociationInfoList);
    }

    /**
     * <p>
     * An array containing the <code>FileSystemAssociationInfo</code> data type of each file system association to be
     * described.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileSystemAssociationInfoList(java.util.Collection)} or
     * {@link #withFileSystemAssociationInfoList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param fileSystemAssociationInfoList
     *        An array containing the <code>FileSystemAssociationInfo</code> data type of each file system association
     *        to be described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemAssociationsResult withFileSystemAssociationInfoList(FileSystemAssociationInfo... fileSystemAssociationInfoList) {
        if (this.fileSystemAssociationInfoList == null) {
            setFileSystemAssociationInfoList(new com.amazonaws.internal.SdkInternalList<FileSystemAssociationInfo>(fileSystemAssociationInfoList.length));
        }
        for (FileSystemAssociationInfo ele : fileSystemAssociationInfoList) {
            this.fileSystemAssociationInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array containing the <code>FileSystemAssociationInfo</code> data type of each file system association to be
     * described.
     * </p>
     * 
     * @param fileSystemAssociationInfoList
     *        An array containing the <code>FileSystemAssociationInfo</code> data type of each file system association
     *        to be described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemAssociationsResult withFileSystemAssociationInfoList(java.util.Collection<FileSystemAssociationInfo> fileSystemAssociationInfoList) {
        setFileSystemAssociationInfoList(fileSystemAssociationInfoList);
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
        if (getFileSystemAssociationInfoList() != null)
            sb.append("FileSystemAssociationInfoList: ").append(getFileSystemAssociationInfoList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFileSystemAssociationsResult == false)
            return false;
        DescribeFileSystemAssociationsResult other = (DescribeFileSystemAssociationsResult) obj;
        if (other.getFileSystemAssociationInfoList() == null ^ this.getFileSystemAssociationInfoList() == null)
            return false;
        if (other.getFileSystemAssociationInfoList() != null
                && other.getFileSystemAssociationInfoList().equals(this.getFileSystemAssociationInfoList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemAssociationInfoList() == null) ? 0 : getFileSystemAssociationInfoList().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFileSystemAssociationsResult clone() {
        try {
            return (DescribeFileSystemAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
