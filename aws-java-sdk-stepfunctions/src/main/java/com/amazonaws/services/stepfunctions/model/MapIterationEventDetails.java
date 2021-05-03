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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about an iteration of a Map state.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/MapIterationEventDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MapIterationEventDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the iteration’s parent Map state.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The index of the array belonging to the Map state iteration.
     * </p>
     */
    private Integer index;

    /**
     * <p>
     * The name of the iteration’s parent Map state.
     * </p>
     * 
     * @param name
     *        The name of the iteration’s parent Map state.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the iteration’s parent Map state.
     * </p>
     * 
     * @return The name of the iteration’s parent Map state.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the iteration’s parent Map state.
     * </p>
     * 
     * @param name
     *        The name of the iteration’s parent Map state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapIterationEventDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The index of the array belonging to the Map state iteration.
     * </p>
     * 
     * @param index
     *        The index of the array belonging to the Map state iteration.
     */

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * The index of the array belonging to the Map state iteration.
     * </p>
     * 
     * @return The index of the array belonging to the Map state iteration.
     */

    public Integer getIndex() {
        return this.index;
    }

    /**
     * <p>
     * The index of the array belonging to the Map state iteration.
     * </p>
     * 
     * @param index
     *        The index of the array belonging to the Map state iteration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapIterationEventDetails withIndex(Integer index) {
        setIndex(index);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getIndex() != null)
            sb.append("Index: ").append(getIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MapIterationEventDetails == false)
            return false;
        MapIterationEventDetails other = (MapIterationEventDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        return hashCode;
    }

    @Override
    public MapIterationEventDetails clone() {
        try {
            return (MapIterationEventDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.MapIterationEventDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
