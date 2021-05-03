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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListFileSystemAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFileSystemAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * The maximum number of file system associations to return in the response. If present, <code>Limit</code> must be
     * an integer with a value greater than zero. Optional.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Opaque pagination token returned from a previous <code>ListFileSystemAssociations</code> operation. If present,
     * <code>Marker</code> specifies where to continue the list from after a previous call to
     * <code>ListFileSystemAssociations</code>. Optional.
     * </p>
     */
    private String marker;

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFileSystemAssociationsRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The maximum number of file system associations to return in the response. If present, <code>Limit</code> must be
     * an integer with a value greater than zero. Optional.
     * </p>
     * 
     * @param limit
     *        The maximum number of file system associations to return in the response. If present, <code>Limit</code>
     *        must be an integer with a value greater than zero. Optional.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of file system associations to return in the response. If present, <code>Limit</code> must be
     * an integer with a value greater than zero. Optional.
     * </p>
     * 
     * @return The maximum number of file system associations to return in the response. If present, <code>Limit</code>
     *         must be an integer with a value greater than zero. Optional.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of file system associations to return in the response. If present, <code>Limit</code> must be
     * an integer with a value greater than zero. Optional.
     * </p>
     * 
     * @param limit
     *        The maximum number of file system associations to return in the response. If present, <code>Limit</code>
     *        must be an integer with a value greater than zero. Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFileSystemAssociationsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Opaque pagination token returned from a previous <code>ListFileSystemAssociations</code> operation. If present,
     * <code>Marker</code> specifies where to continue the list from after a previous call to
     * <code>ListFileSystemAssociations</code>. Optional.
     * </p>
     * 
     * @param marker
     *        Opaque pagination token returned from a previous <code>ListFileSystemAssociations</code> operation. If
     *        present, <code>Marker</code> specifies where to continue the list from after a previous call to
     *        <code>ListFileSystemAssociations</code>. Optional.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Opaque pagination token returned from a previous <code>ListFileSystemAssociations</code> operation. If present,
     * <code>Marker</code> specifies where to continue the list from after a previous call to
     * <code>ListFileSystemAssociations</code>. Optional.
     * </p>
     * 
     * @return Opaque pagination token returned from a previous <code>ListFileSystemAssociations</code> operation. If
     *         present, <code>Marker</code> specifies where to continue the list from after a previous call to
     *         <code>ListFileSystemAssociations</code>. Optional.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Opaque pagination token returned from a previous <code>ListFileSystemAssociations</code> operation. If present,
     * <code>Marker</code> specifies where to continue the list from after a previous call to
     * <code>ListFileSystemAssociations</code>. Optional.
     * </p>
     * 
     * @param marker
     *        Opaque pagination token returned from a previous <code>ListFileSystemAssociations</code> operation. If
     *        present, <code>Marker</code> specifies where to continue the list from after a previous call to
     *        <code>ListFileSystemAssociations</code>. Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFileSystemAssociationsRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFileSystemAssociationsRequest == false)
            return false;
        ListFileSystemAssociationsRequest other = (ListFileSystemAssociationsRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListFileSystemAssociationsRequest clone() {
        return (ListFileSystemAssociationsRequest) super.clone();
    }

}
