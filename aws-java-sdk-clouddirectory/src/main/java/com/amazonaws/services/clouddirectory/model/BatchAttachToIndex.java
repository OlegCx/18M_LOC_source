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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Attaches the specified object to the specified index inside a <a>BatchRead</a> operation. For more information, see
 * <a>AttachToIndex</a> and <a>BatchReadRequest$Operations</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchAttachToIndex" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchAttachToIndex implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A reference to the index that you are attaching the object to.
     * </p>
     */
    private ObjectReference indexReference;
    /**
     * <p>
     * A reference to the object that you are attaching to the index.
     * </p>
     */
    private ObjectReference targetReference;

    /**
     * <p>
     * A reference to the index that you are attaching the object to.
     * </p>
     * 
     * @param indexReference
     *        A reference to the index that you are attaching the object to.
     */

    public void setIndexReference(ObjectReference indexReference) {
        this.indexReference = indexReference;
    }

    /**
     * <p>
     * A reference to the index that you are attaching the object to.
     * </p>
     * 
     * @return A reference to the index that you are attaching the object to.
     */

    public ObjectReference getIndexReference() {
        return this.indexReference;
    }

    /**
     * <p>
     * A reference to the index that you are attaching the object to.
     * </p>
     * 
     * @param indexReference
     *        A reference to the index that you are attaching the object to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAttachToIndex withIndexReference(ObjectReference indexReference) {
        setIndexReference(indexReference);
        return this;
    }

    /**
     * <p>
     * A reference to the object that you are attaching to the index.
     * </p>
     * 
     * @param targetReference
     *        A reference to the object that you are attaching to the index.
     */

    public void setTargetReference(ObjectReference targetReference) {
        this.targetReference = targetReference;
    }

    /**
     * <p>
     * A reference to the object that you are attaching to the index.
     * </p>
     * 
     * @return A reference to the object that you are attaching to the index.
     */

    public ObjectReference getTargetReference() {
        return this.targetReference;
    }

    /**
     * <p>
     * A reference to the object that you are attaching to the index.
     * </p>
     * 
     * @param targetReference
     *        A reference to the object that you are attaching to the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAttachToIndex withTargetReference(ObjectReference targetReference) {
        setTargetReference(targetReference);
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
        if (getIndexReference() != null)
            sb.append("IndexReference: ").append(getIndexReference()).append(",");
        if (getTargetReference() != null)
            sb.append("TargetReference: ").append(getTargetReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchAttachToIndex == false)
            return false;
        BatchAttachToIndex other = (BatchAttachToIndex) obj;
        if (other.getIndexReference() == null ^ this.getIndexReference() == null)
            return false;
        if (other.getIndexReference() != null && other.getIndexReference().equals(this.getIndexReference()) == false)
            return false;
        if (other.getTargetReference() == null ^ this.getTargetReference() == null)
            return false;
        if (other.getTargetReference() != null && other.getTargetReference().equals(this.getTargetReference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexReference() == null) ? 0 : getIndexReference().hashCode());
        hashCode = prime * hashCode + ((getTargetReference() == null) ? 0 : getTargetReference().hashCode());
        return hashCode;
    }

    @Override
    public BatchAttachToIndex clone() {
        try {
            return (BatchAttachToIndex) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchAttachToIndexMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
