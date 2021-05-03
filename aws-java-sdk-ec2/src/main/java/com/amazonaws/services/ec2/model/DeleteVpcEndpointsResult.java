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

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of DeleteVpcEndpoints.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVpcEndpointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the VPC endpoints that were not successfully deleted.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UnsuccessfulItem> unsuccessful;

    /**
     * <p>
     * Information about the VPC endpoints that were not successfully deleted.
     * </p>
     * 
     * @return Information about the VPC endpoints that were not successfully deleted.
     */

    public java.util.List<UnsuccessfulItem> getUnsuccessful() {
        if (unsuccessful == null) {
            unsuccessful = new com.amazonaws.internal.SdkInternalList<UnsuccessfulItem>();
        }
        return unsuccessful;
    }

    /**
     * <p>
     * Information about the VPC endpoints that were not successfully deleted.
     * </p>
     * 
     * @param unsuccessful
     *        Information about the VPC endpoints that were not successfully deleted.
     */

    public void setUnsuccessful(java.util.Collection<UnsuccessfulItem> unsuccessful) {
        if (unsuccessful == null) {
            this.unsuccessful = null;
            return;
        }

        this.unsuccessful = new com.amazonaws.internal.SdkInternalList<UnsuccessfulItem>(unsuccessful);
    }

    /**
     * <p>
     * Information about the VPC endpoints that were not successfully deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnsuccessful(java.util.Collection)} or {@link #withUnsuccessful(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param unsuccessful
     *        Information about the VPC endpoints that were not successfully deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVpcEndpointsResult withUnsuccessful(UnsuccessfulItem... unsuccessful) {
        if (this.unsuccessful == null) {
            setUnsuccessful(new com.amazonaws.internal.SdkInternalList<UnsuccessfulItem>(unsuccessful.length));
        }
        for (UnsuccessfulItem ele : unsuccessful) {
            this.unsuccessful.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the VPC endpoints that were not successfully deleted.
     * </p>
     * 
     * @param unsuccessful
     *        Information about the VPC endpoints that were not successfully deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVpcEndpointsResult withUnsuccessful(java.util.Collection<UnsuccessfulItem> unsuccessful) {
        setUnsuccessful(unsuccessful);
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
        if (getUnsuccessful() != null)
            sb.append("Unsuccessful: ").append(getUnsuccessful());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVpcEndpointsResult == false)
            return false;
        DeleteVpcEndpointsResult other = (DeleteVpcEndpointsResult) obj;
        if (other.getUnsuccessful() == null ^ this.getUnsuccessful() == null)
            return false;
        if (other.getUnsuccessful() != null && other.getUnsuccessful().equals(this.getUnsuccessful()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUnsuccessful() == null) ? 0 : getUnsuccessful().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVpcEndpointsResult clone() {
        try {
            return (DeleteVpcEndpointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
