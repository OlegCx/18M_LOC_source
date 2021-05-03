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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the Active Directory to be used for client authentication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DirectoryServiceAuthenticationRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectoryServiceAuthenticationRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Active Directory to be used for authentication.
     * </p>
     */
    private String directoryId;

    /**
     * <p>
     * The ID of the Active Directory to be used for authentication.
     * </p>
     * 
     * @param directoryId
     *        The ID of the Active Directory to be used for authentication.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The ID of the Active Directory to be used for authentication.
     * </p>
     * 
     * @return The ID of the Active Directory to be used for authentication.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The ID of the Active Directory to be used for authentication.
     * </p>
     * 
     * @param directoryId
     *        The ID of the Active Directory to be used for authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryServiceAuthenticationRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectoryServiceAuthenticationRequest == false)
            return false;
        DirectoryServiceAuthenticationRequest other = (DirectoryServiceAuthenticationRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        return hashCode;
    }

    @Override
    public DirectoryServiceAuthenticationRequest clone() {
        try {
            return (DirectoryServiceAuthenticationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
