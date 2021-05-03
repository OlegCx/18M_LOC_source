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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Statistical information about the data store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DatastoreStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatastoreStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The estimated size of the data store.
     * </p>
     */
    private EstimatedResourceSize size;

    /**
     * <p>
     * The estimated size of the data store.
     * </p>
     * 
     * @param size
     *        The estimated size of the data store.
     */

    public void setSize(EstimatedResourceSize size) {
        this.size = size;
    }

    /**
     * <p>
     * The estimated size of the data store.
     * </p>
     * 
     * @return The estimated size of the data store.
     */

    public EstimatedResourceSize getSize() {
        return this.size;
    }

    /**
     * <p>
     * The estimated size of the data store.
     * </p>
     * 
     * @param size
     *        The estimated size of the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreStatistics withSize(EstimatedResourceSize size) {
        setSize(size);
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
        if (getSize() != null)
            sb.append("Size: ").append(getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatastoreStatistics == false)
            return false;
        DatastoreStatistics other = (DatastoreStatistics) obj;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        return hashCode;
    }

    @Override
    public DatastoreStatistics clone() {
        try {
            return (DatastoreStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DatastoreStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
