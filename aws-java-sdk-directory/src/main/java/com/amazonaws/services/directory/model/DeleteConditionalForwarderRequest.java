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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a conditional forwarder.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeleteConditionalForwarder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteConditionalForwarderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The directory ID for which you are deleting the conditional forwarder.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The fully qualified domain name (FQDN) of the remote domain with which you are deleting the conditional
     * forwarder.
     * </p>
     */
    private String remoteDomainName;

    /**
     * <p>
     * The directory ID for which you are deleting the conditional forwarder.
     * </p>
     * 
     * @param directoryId
     *        The directory ID for which you are deleting the conditional forwarder.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The directory ID for which you are deleting the conditional forwarder.
     * </p>
     * 
     * @return The directory ID for which you are deleting the conditional forwarder.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The directory ID for which you are deleting the conditional forwarder.
     * </p>
     * 
     * @param directoryId
     *        The directory ID for which you are deleting the conditional forwarder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConditionalForwarderRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) of the remote domain with which you are deleting the conditional
     * forwarder.
     * </p>
     * 
     * @param remoteDomainName
     *        The fully qualified domain name (FQDN) of the remote domain with which you are deleting the conditional
     *        forwarder.
     */

    public void setRemoteDomainName(String remoteDomainName) {
        this.remoteDomainName = remoteDomainName;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) of the remote domain with which you are deleting the conditional
     * forwarder.
     * </p>
     * 
     * @return The fully qualified domain name (FQDN) of the remote domain with which you are deleting the conditional
     *         forwarder.
     */

    public String getRemoteDomainName() {
        return this.remoteDomainName;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) of the remote domain with which you are deleting the conditional
     * forwarder.
     * </p>
     * 
     * @param remoteDomainName
     *        The fully qualified domain name (FQDN) of the remote domain with which you are deleting the conditional
     *        forwarder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConditionalForwarderRequest withRemoteDomainName(String remoteDomainName) {
        setRemoteDomainName(remoteDomainName);
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
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getRemoteDomainName() != null)
            sb.append("RemoteDomainName: ").append(getRemoteDomainName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteConditionalForwarderRequest == false)
            return false;
        DeleteConditionalForwarderRequest other = (DeleteConditionalForwarderRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getRemoteDomainName() == null ^ this.getRemoteDomainName() == null)
            return false;
        if (other.getRemoteDomainName() != null && other.getRemoteDomainName().equals(this.getRemoteDomainName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getRemoteDomainName() == null) ? 0 : getRemoteDomainName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteConditionalForwarderRequest clone() {
        return (DeleteConditionalForwarderRequest) super.clone();
    }

}
