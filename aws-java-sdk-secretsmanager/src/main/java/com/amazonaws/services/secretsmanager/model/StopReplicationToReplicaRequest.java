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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/StopReplicationToReplica"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopReplicationToReplicaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Response to <code>StopReplicationToReplica</code> of a secret, based on the <code>SecretId</code>.
     * </p>
     */
    private String secretId;

    /**
     * <p>
     * Response to <code>StopReplicationToReplica</code> of a secret, based on the <code>SecretId</code>.
     * </p>
     * 
     * @param secretId
     *        Response to <code>StopReplicationToReplica</code> of a secret, based on the <code>SecretId</code>.
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * Response to <code>StopReplicationToReplica</code> of a secret, based on the <code>SecretId</code>.
     * </p>
     * 
     * @return Response to <code>StopReplicationToReplica</code> of a secret, based on the <code>SecretId</code>.
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * Response to <code>StopReplicationToReplica</code> of a secret, based on the <code>SecretId</code>.
     * </p>
     * 
     * @param secretId
     *        Response to <code>StopReplicationToReplica</code> of a secret, based on the <code>SecretId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopReplicationToReplicaRequest withSecretId(String secretId) {
        setSecretId(secretId);
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
        if (getSecretId() != null)
            sb.append("SecretId: ").append(getSecretId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopReplicationToReplicaRequest == false)
            return false;
        StopReplicationToReplicaRequest other = (StopReplicationToReplicaRequest) obj;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        return hashCode;
    }

    @Override
    public StopReplicationToReplicaRequest clone() {
        return (StopReplicationToReplicaRequest) super.clone();
    }

}
