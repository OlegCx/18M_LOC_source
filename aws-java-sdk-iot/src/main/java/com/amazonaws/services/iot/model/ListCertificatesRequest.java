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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the ListCertificates operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCertificatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The result page size.
     * </p>
     */
    private Integer pageSize;
    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Specifies the order for results. If True, the results are returned in ascending order, based on the creation
     * date.
     * </p>
     */
    private Boolean ascendingOrder;

    /**
     * <p>
     * The result page size.
     * </p>
     * 
     * @param pageSize
     *        The result page size.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The result page size.
     * </p>
     * 
     * @return The result page size.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The result page size.
     * </p>
     * 
     * @param pageSize
     *        The result page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificatesRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @return The marker for the next set of results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificatesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Specifies the order for results. If True, the results are returned in ascending order, based on the creation
     * date.
     * </p>
     * 
     * @param ascendingOrder
     *        Specifies the order for results. If True, the results are returned in ascending order, based on the
     *        creation date.
     */

    public void setAscendingOrder(Boolean ascendingOrder) {
        this.ascendingOrder = ascendingOrder;
    }

    /**
     * <p>
     * Specifies the order for results. If True, the results are returned in ascending order, based on the creation
     * date.
     * </p>
     * 
     * @return Specifies the order for results. If True, the results are returned in ascending order, based on the
     *         creation date.
     */

    public Boolean getAscendingOrder() {
        return this.ascendingOrder;
    }

    /**
     * <p>
     * Specifies the order for results. If True, the results are returned in ascending order, based on the creation
     * date.
     * </p>
     * 
     * @param ascendingOrder
     *        Specifies the order for results. If True, the results are returned in ascending order, based on the
     *        creation date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificatesRequest withAscendingOrder(Boolean ascendingOrder) {
        setAscendingOrder(ascendingOrder);
        return this;
    }

    /**
     * <p>
     * Specifies the order for results. If True, the results are returned in ascending order, based on the creation
     * date.
     * </p>
     * 
     * @return Specifies the order for results. If True, the results are returned in ascending order, based on the
     *         creation date.
     */

    public Boolean isAscendingOrder() {
        return this.ascendingOrder;
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
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getAscendingOrder() != null)
            sb.append("AscendingOrder: ").append(getAscendingOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCertificatesRequest == false)
            return false;
        ListCertificatesRequest other = (ListCertificatesRequest) obj;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getAscendingOrder() == null ^ this.getAscendingOrder() == null)
            return false;
        if (other.getAscendingOrder() != null && other.getAscendingOrder().equals(this.getAscendingOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getAscendingOrder() == null) ? 0 : getAscendingOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListCertificatesRequest clone() {
        return (ListCertificatesRequest) super.clone();
    }

}
