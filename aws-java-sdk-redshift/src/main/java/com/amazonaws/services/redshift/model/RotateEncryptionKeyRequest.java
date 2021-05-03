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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RotateEncryptionKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RotateEncryptionKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the cluster that you want to rotate the encryption keys for.
     * </p>
     * <p>
     * Constraints: Must be the name of valid cluster that has encryption enabled.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The unique identifier of the cluster that you want to rotate the encryption keys for.
     * </p>
     * <p>
     * Constraints: Must be the name of valid cluster that has encryption enabled.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster that you want to rotate the encryption keys for.</p>
     *        <p>
     *        Constraints: Must be the name of valid cluster that has encryption enabled.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster that you want to rotate the encryption keys for.
     * </p>
     * <p>
     * Constraints: Must be the name of valid cluster that has encryption enabled.
     * </p>
     * 
     * @return The unique identifier of the cluster that you want to rotate the encryption keys for.</p>
     *         <p>
     *         Constraints: Must be the name of valid cluster that has encryption enabled.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster that you want to rotate the encryption keys for.
     * </p>
     * <p>
     * Constraints: Must be the name of valid cluster that has encryption enabled.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster that you want to rotate the encryption keys for.</p>
     *        <p>
     *        Constraints: Must be the name of valid cluster that has encryption enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotateEncryptionKeyRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RotateEncryptionKeyRequest == false)
            return false;
        RotateEncryptionKeyRequest other = (RotateEncryptionKeyRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public RotateEncryptionKeyRequest clone() {
        return (RotateEncryptionKeyRequest) super.clone();
    }

}
