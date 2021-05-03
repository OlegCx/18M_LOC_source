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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a single row in the query results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/Row" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Row implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of data points in a single row of the result set.
     * </p>
     */
    private java.util.List<Datum> data;

    /**
     * <p>
     * List of data points in a single row of the result set.
     * </p>
     * 
     * @return List of data points in a single row of the result set.
     */

    public java.util.List<Datum> getData() {
        return data;
    }

    /**
     * <p>
     * List of data points in a single row of the result set.
     * </p>
     * 
     * @param data
     *        List of data points in a single row of the result set.
     */

    public void setData(java.util.Collection<Datum> data) {
        if (data == null) {
            this.data = null;
            return;
        }

        this.data = new java.util.ArrayList<Datum>(data);
    }

    /**
     * <p>
     * List of data points in a single row of the result set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setData(java.util.Collection)} or {@link #withData(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param data
     *        List of data points in a single row of the result set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Row withData(Datum... data) {
        if (this.data == null) {
            setData(new java.util.ArrayList<Datum>(data.length));
        }
        for (Datum ele : data) {
            this.data.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of data points in a single row of the result set.
     * </p>
     * 
     * @param data
     *        List of data points in a single row of the result set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Row withData(java.util.Collection<Datum> data) {
        setData(data);
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
        if (getData() != null)
            sb.append("Data: ").append(getData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Row == false)
            return false;
        Row other = (Row) obj;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        return hashCode;
    }

    @Override
    public Row clone() {
        try {
            return (Row) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.RowMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
