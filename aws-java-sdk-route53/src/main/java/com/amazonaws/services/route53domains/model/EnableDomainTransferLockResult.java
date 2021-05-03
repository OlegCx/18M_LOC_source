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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The EnableDomainTransferLock response includes the following elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/EnableDomainTransferLock"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableDomainTransferLockResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier for tracking the progress of the request. To use this ID to query the operation status, use
     * GetOperationDetail.
     * </p>
     */
    private String operationId;

    /**
     * <p>
     * Identifier for tracking the progress of the request. To use this ID to query the operation status, use
     * GetOperationDetail.
     * </p>
     * 
     * @param operationId
     *        Identifier for tracking the progress of the request. To use this ID to query the operation status, use
     *        GetOperationDetail.
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * Identifier for tracking the progress of the request. To use this ID to query the operation status, use
     * GetOperationDetail.
     * </p>
     * 
     * @return Identifier for tracking the progress of the request. To use this ID to query the operation status, use
     *         GetOperationDetail.
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * <p>
     * Identifier for tracking the progress of the request. To use this ID to query the operation status, use
     * GetOperationDetail.
     * </p>
     * 
     * @param operationId
     *        Identifier for tracking the progress of the request. To use this ID to query the operation status, use
     *        GetOperationDetail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableDomainTransferLockResult withOperationId(String operationId) {
        setOperationId(operationId);
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
        if (getOperationId() != null)
            sb.append("OperationId: ").append(getOperationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableDomainTransferLockResult == false)
            return false;
        EnableDomainTransferLockResult other = (EnableDomainTransferLockResult) obj;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        return hashCode;
    }

    @Override
    public EnableDomainTransferLockResult clone() {
        try {
            return (EnableDomainTransferLockResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
