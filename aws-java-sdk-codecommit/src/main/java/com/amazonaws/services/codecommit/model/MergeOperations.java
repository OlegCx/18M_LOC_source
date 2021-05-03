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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the file operation conflicts in a merge operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergeOperations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MergeOperations implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operation (add, modify, or delete) on a file in the source of a merge or pull request.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The operation on a file in the destination of a merge or pull request.
     * </p>
     */
    private String destination;

    /**
     * <p>
     * The operation (add, modify, or delete) on a file in the source of a merge or pull request.
     * </p>
     * 
     * @param source
     *        The operation (add, modify, or delete) on a file in the source of a merge or pull request.
     * @see ChangeTypeEnum
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The operation (add, modify, or delete) on a file in the source of a merge or pull request.
     * </p>
     * 
     * @return The operation (add, modify, or delete) on a file in the source of a merge or pull request.
     * @see ChangeTypeEnum
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The operation (add, modify, or delete) on a file in the source of a merge or pull request.
     * </p>
     * 
     * @param source
     *        The operation (add, modify, or delete) on a file in the source of a merge or pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeTypeEnum
     */

    public MergeOperations withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The operation (add, modify, or delete) on a file in the source of a merge or pull request.
     * </p>
     * 
     * @param source
     *        The operation (add, modify, or delete) on a file in the source of a merge or pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeTypeEnum
     */

    public MergeOperations withSource(ChangeTypeEnum source) {
        this.source = source.toString();
        return this;
    }

    /**
     * <p>
     * The operation on a file in the destination of a merge or pull request.
     * </p>
     * 
     * @param destination
     *        The operation on a file in the destination of a merge or pull request.
     * @see ChangeTypeEnum
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The operation on a file in the destination of a merge or pull request.
     * </p>
     * 
     * @return The operation on a file in the destination of a merge or pull request.
     * @see ChangeTypeEnum
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The operation on a file in the destination of a merge or pull request.
     * </p>
     * 
     * @param destination
     *        The operation on a file in the destination of a merge or pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeTypeEnum
     */

    public MergeOperations withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The operation on a file in the destination of a merge or pull request.
     * </p>
     * 
     * @param destination
     *        The operation on a file in the destination of a merge or pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeTypeEnum
     */

    public MergeOperations withDestination(ChangeTypeEnum destination) {
        this.destination = destination.toString();
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergeOperations == false)
            return false;
        MergeOperations other = (MergeOperations) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        return hashCode;
    }

    @Override
    public MergeOperations clone() {
        try {
            return (MergeOperations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.MergeOperationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
