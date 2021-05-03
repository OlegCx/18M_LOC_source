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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the result of a successful invocation of the <code>DescribeReservedDBInstances</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeReservedDBInstances" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedDBInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of reserved DB instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReservedDBInstance> reservedDBInstances;

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedDBInstancesResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of reserved DB instances.
     * </p>
     * 
     * @return A list of reserved DB instances.
     */

    public java.util.List<ReservedDBInstance> getReservedDBInstances() {
        if (reservedDBInstances == null) {
            reservedDBInstances = new com.amazonaws.internal.SdkInternalList<ReservedDBInstance>();
        }
        return reservedDBInstances;
    }

    /**
     * <p>
     * A list of reserved DB instances.
     * </p>
     * 
     * @param reservedDBInstances
     *        A list of reserved DB instances.
     */

    public void setReservedDBInstances(java.util.Collection<ReservedDBInstance> reservedDBInstances) {
        if (reservedDBInstances == null) {
            this.reservedDBInstances = null;
            return;
        }

        this.reservedDBInstances = new com.amazonaws.internal.SdkInternalList<ReservedDBInstance>(reservedDBInstances);
    }

    /**
     * <p>
     * A list of reserved DB instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedDBInstances(java.util.Collection)} or {@link #withReservedDBInstances(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param reservedDBInstances
     *        A list of reserved DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedDBInstancesResult withReservedDBInstances(ReservedDBInstance... reservedDBInstances) {
        if (this.reservedDBInstances == null) {
            setReservedDBInstances(new com.amazonaws.internal.SdkInternalList<ReservedDBInstance>(reservedDBInstances.length));
        }
        for (ReservedDBInstance ele : reservedDBInstances) {
            this.reservedDBInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of reserved DB instances.
     * </p>
     * 
     * @param reservedDBInstances
     *        A list of reserved DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedDBInstancesResult withReservedDBInstances(java.util.Collection<ReservedDBInstance> reservedDBInstances) {
        setReservedDBInstances(reservedDBInstances);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getReservedDBInstances() != null)
            sb.append("ReservedDBInstances: ").append(getReservedDBInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedDBInstancesResult == false)
            return false;
        DescribeReservedDBInstancesResult other = (DescribeReservedDBInstancesResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReservedDBInstances() == null ^ this.getReservedDBInstances() == null)
            return false;
        if (other.getReservedDBInstances() != null && other.getReservedDBInstances().equals(this.getReservedDBInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getReservedDBInstances() == null) ? 0 : getReservedDBInstances().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedDBInstancesResult clone() {
        try {
            return (DescribeReservedDBInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
