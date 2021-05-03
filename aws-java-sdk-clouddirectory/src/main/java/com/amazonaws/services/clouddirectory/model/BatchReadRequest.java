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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchRead" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchReadRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a>. For more information, see
     * <a>arns</a>.
     * </p>
     */
    private String directoryArn;
    /**
     * <p>
     * A list of operations that are part of the batch.
     * </p>
     */
    private java.util.List<BatchReadOperation> operations;
    /**
     * <p>
     * Represents the manner and timing in which the successful write or update of an object is reflected in a
     * subsequent read operation of that same object.
     * </p>
     */
    private String consistencyLevel;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a>. For more information, see
     * <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the <a>Directory</a>. For more information, see
     *        <a>arns</a>.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a>. For more information, see
     * <a>arns</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that is associated with the <a>Directory</a>. For more information, see
     *         <a>arns</a>.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a>. For more information, see
     * <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the <a>Directory</a>. For more information, see
     *        <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadRequest withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

    /**
     * <p>
     * A list of operations that are part of the batch.
     * </p>
     * 
     * @return A list of operations that are part of the batch.
     */

    public java.util.List<BatchReadOperation> getOperations() {
        return operations;
    }

    /**
     * <p>
     * A list of operations that are part of the batch.
     * </p>
     * 
     * @param operations
     *        A list of operations that are part of the batch.
     */

    public void setOperations(java.util.Collection<BatchReadOperation> operations) {
        if (operations == null) {
            this.operations = null;
            return;
        }

        this.operations = new java.util.ArrayList<BatchReadOperation>(operations);
    }

    /**
     * <p>
     * A list of operations that are part of the batch.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperations(java.util.Collection)} or {@link #withOperations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param operations
     *        A list of operations that are part of the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadRequest withOperations(BatchReadOperation... operations) {
        if (this.operations == null) {
            setOperations(new java.util.ArrayList<BatchReadOperation>(operations.length));
        }
        for (BatchReadOperation ele : operations) {
            this.operations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of operations that are part of the batch.
     * </p>
     * 
     * @param operations
     *        A list of operations that are part of the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadRequest withOperations(java.util.Collection<BatchReadOperation> operations) {
        setOperations(operations);
        return this;
    }

    /**
     * <p>
     * Represents the manner and timing in which the successful write or update of an object is reflected in a
     * subsequent read operation of that same object.
     * </p>
     * 
     * @param consistencyLevel
     *        Represents the manner and timing in which the successful write or update of an object is reflected in a
     *        subsequent read operation of that same object.
     * @see ConsistencyLevel
     */

    public void setConsistencyLevel(String consistencyLevel) {
        this.consistencyLevel = consistencyLevel;
    }

    /**
     * <p>
     * Represents the manner and timing in which the successful write or update of an object is reflected in a
     * subsequent read operation of that same object.
     * </p>
     * 
     * @return Represents the manner and timing in which the successful write or update of an object is reflected in a
     *         subsequent read operation of that same object.
     * @see ConsistencyLevel
     */

    public String getConsistencyLevel() {
        return this.consistencyLevel;
    }

    /**
     * <p>
     * Represents the manner and timing in which the successful write or update of an object is reflected in a
     * subsequent read operation of that same object.
     * </p>
     * 
     * @param consistencyLevel
     *        Represents the manner and timing in which the successful write or update of an object is reflected in a
     *        subsequent read operation of that same object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConsistencyLevel
     */

    public BatchReadRequest withConsistencyLevel(String consistencyLevel) {
        setConsistencyLevel(consistencyLevel);
        return this;
    }

    /**
     * <p>
     * Represents the manner and timing in which the successful write or update of an object is reflected in a
     * subsequent read operation of that same object.
     * </p>
     * 
     * @param consistencyLevel
     *        Represents the manner and timing in which the successful write or update of an object is reflected in a
     *        subsequent read operation of that same object.
     * @see ConsistencyLevel
     */

    public void setConsistencyLevel(ConsistencyLevel consistencyLevel) {
        withConsistencyLevel(consistencyLevel);
    }

    /**
     * <p>
     * Represents the manner and timing in which the successful write or update of an object is reflected in a
     * subsequent read operation of that same object.
     * </p>
     * 
     * @param consistencyLevel
     *        Represents the manner and timing in which the successful write or update of an object is reflected in a
     *        subsequent read operation of that same object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConsistencyLevel
     */

    public BatchReadRequest withConsistencyLevel(ConsistencyLevel consistencyLevel) {
        this.consistencyLevel = consistencyLevel.toString();
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
        if (getDirectoryArn() != null)
            sb.append("DirectoryArn: ").append(getDirectoryArn()).append(",");
        if (getOperations() != null)
            sb.append("Operations: ").append(getOperations()).append(",");
        if (getConsistencyLevel() != null)
            sb.append("ConsistencyLevel: ").append(getConsistencyLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchReadRequest == false)
            return false;
        BatchReadRequest other = (BatchReadRequest) obj;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        if (other.getOperations() == null ^ this.getOperations() == null)
            return false;
        if (other.getOperations() != null && other.getOperations().equals(this.getOperations()) == false)
            return false;
        if (other.getConsistencyLevel() == null ^ this.getConsistencyLevel() == null)
            return false;
        if (other.getConsistencyLevel() != null && other.getConsistencyLevel().equals(this.getConsistencyLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        hashCode = prime * hashCode + ((getOperations() == null) ? 0 : getOperations().hashCode());
        hashCode = prime * hashCode + ((getConsistencyLevel() == null) ? 0 : getConsistencyLevel().hashCode());
        return hashCode;
    }

    @Override
    public BatchReadRequest clone() {
        return (BatchReadRequest) super.clone();
    }

}
