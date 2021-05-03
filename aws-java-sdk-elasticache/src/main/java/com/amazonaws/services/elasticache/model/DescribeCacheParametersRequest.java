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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>DescribeCacheParameters</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCacheParametersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a specific cache parameter group to return details for.
     * </p>
     */
    private String cacheParameterGroupName;
    /**
     * <p>
     * The parameter types to return.
     * </p>
     * <p>
     * Valid values: <code>user</code> | <code>system</code> | <code>engine-default</code>
     * </p>
     */
    private String source;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * Default constructor for DescribeCacheParametersRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public DescribeCacheParametersRequest() {
    }

    /**
     * Constructs a new DescribeCacheParametersRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param cacheParameterGroupName
     *        The name of a specific cache parameter group to return details for.
     */
    public DescribeCacheParametersRequest(String cacheParameterGroupName) {
        setCacheParameterGroupName(cacheParameterGroupName);
    }

    /**
     * <p>
     * The name of a specific cache parameter group to return details for.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The name of a specific cache parameter group to return details for.
     */

    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of a specific cache parameter group to return details for.
     * </p>
     * 
     * @return The name of a specific cache parameter group to return details for.
     */

    public String getCacheParameterGroupName() {
        return this.cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of a specific cache parameter group to return details for.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The name of a specific cache parameter group to return details for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheParametersRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        setCacheParameterGroupName(cacheParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The parameter types to return.
     * </p>
     * <p>
     * Valid values: <code>user</code> | <code>system</code> | <code>engine-default</code>
     * </p>
     * 
     * @param source
     *        The parameter types to return.</p>
     *        <p>
     *        Valid values: <code>user</code> | <code>system</code> | <code>engine-default</code>
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The parameter types to return.
     * </p>
     * <p>
     * Valid values: <code>user</code> | <code>system</code> | <code>engine-default</code>
     * </p>
     * 
     * @return The parameter types to return.</p>
     *         <p>
     *         Valid values: <code>user</code> | <code>system</code> | <code>engine-default</code>
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The parameter types to return.
     * </p>
     * <p>
     * Valid values: <code>user</code> | <code>system</code> | <code>engine-default</code>
     * </p>
     * 
     * @param source
     *        The parameter types to return.</p>
     *        <p>
     *        Valid values: <code>user</code> | <code>system</code> | <code>engine-default</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheParametersRequest withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     *        retrieved.</p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: minimum 20; maximum 100.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     *         retrieved.</p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: minimum 20; maximum 100.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     *        retrieved.</p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: minimum 20; maximum 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheParametersRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional marker returned from a prior request. Use this marker for pagination of results from this
     *         operation. If this parameter is specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheParametersRequest withMarker(String marker) {
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
        if (getCacheParameterGroupName() != null)
            sb.append("CacheParameterGroupName: ").append(getCacheParameterGroupName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
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

        if (obj instanceof DescribeCacheParametersRequest == false)
            return false;
        DescribeCacheParametersRequest other = (DescribeCacheParametersRequest) obj;
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null)
            return false;
        if (other.getCacheParameterGroupName() != null && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
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

        hashCode = prime * hashCode + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCacheParametersRequest clone() {
        return (DescribeCacheParametersRequest) super.clone();
    }

}
