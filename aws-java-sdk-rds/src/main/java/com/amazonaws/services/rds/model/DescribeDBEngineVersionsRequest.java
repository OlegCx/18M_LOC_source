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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBEngineVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBEngineVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The database engine to return.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     */
    private String engine;
    /**
     * <p>
     * The database engine version to return.
     * </p>
     * <p>
     * Example: <code>5.1.49</code>
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The name of a specific DB parameter group family to return details for.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DBParameterGroupFamily.
     * </p>
     * </li>
     * </ul>
     */
    private String dBParameterGroupFamily;
    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of records to include in the response. If more than the <code>MaxRecords</code> value is
     * available, a pagination token called a marker is included in the response so you can retrieve the remaining
     * results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A value that indicates whether only the default version of the specified engine or engine and major version
     * combination is returned.
     * </p>
     */
    private Boolean defaultOnly;
    /**
     * <p>
     * A value that indicates whether to list the supported character sets for each engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the <code>CharacterSetName</code> parameter for
     * <code>CreateDBInstance</code>, the response includes a list of supported character sets for each engine version.
     * </p>
     */
    private Boolean listSupportedCharacterSets;
    /**
     * <p>
     * A value that indicates whether to list the supported time zones for each engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the <code>TimeZone</code> parameter for
     * <code>CreateDBInstance</code>, the response includes a list of supported time zones for each engine version.
     * </p>
     */
    private Boolean listSupportedTimezones;
    /**
     * <p>
     * A value that indicates whether to include engine versions that aren't available in the list. The default is to
     * list only available engine versions.
     * </p>
     */
    private Boolean includeAll;

    /**
     * <p>
     * The database engine to return.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param engine
     *        The database engine to return.</p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mysql</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web</code>
     *        </p>
     *        </li>
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The database engine to return.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The database engine to return.</p>
     *         <p>
     *         Valid Values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>aurora-postgresql</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mariadb</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mysql</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-ee</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-se2</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-se1</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-se</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>postgres</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ee</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-se</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ex</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-web</code>
     *         </p>
     *         </li>
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The database engine to return.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param engine
     *        The database engine to return.</p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mysql</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBEngineVersionsRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The database engine version to return.
     * </p>
     * <p>
     * Example: <code>5.1.49</code>
     * </p>
     * 
     * @param engineVersion
     *        The database engine version to return.</p>
     *        <p>
     *        Example: <code>5.1.49</code>
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The database engine version to return.
     * </p>
     * <p>
     * Example: <code>5.1.49</code>
     * </p>
     * 
     * @return The database engine version to return.</p>
     *         <p>
     *         Example: <code>5.1.49</code>
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The database engine version to return.
     * </p>
     * <p>
     * Example: <code>5.1.49</code>
     * </p>
     * 
     * @param engineVersion
     *        The database engine version to return.</p>
     *        <p>
     *        Example: <code>5.1.49</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBEngineVersionsRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The name of a specific DB parameter group family to return details for.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DBParameterGroupFamily.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBParameterGroupFamily
     *        The name of a specific DB parameter group family to return details for.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match an existing DBParameterGroupFamily.
     *        </p>
     *        </li>
     */

    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }

    /**
     * <p>
     * The name of a specific DB parameter group family to return details for.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DBParameterGroupFamily.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of a specific DB parameter group family to return details for.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match an existing DBParameterGroupFamily.
     *         </p>
     *         </li>
     */

    public String getDBParameterGroupFamily() {
        return this.dBParameterGroupFamily;
    }

    /**
     * <p>
     * The name of a specific DB parameter group family to return details for.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DBParameterGroupFamily.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBParameterGroupFamily
     *        The name of a specific DB parameter group family to return details for.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match an existing DBParameterGroupFamily.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBEngineVersionsRequest withDBParameterGroupFamily(String dBParameterGroupFamily) {
        setDBParameterGroupFamily(dBParameterGroupFamily);
        return this;
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     * 
     * @return This parameter isn't currently supported.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     * 
     * @param filters
     *        This parameter isn't currently supported.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        This parameter isn't currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBEngineVersionsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This parameter isn't currently supported.
     * </p>
     * 
     * @param filters
     *        This parameter isn't currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBEngineVersionsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more than the <code>MaxRecords</code> value is
     * available, a pagination token called a marker is included in the response so you can retrieve the remaining
     * results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more than the <code>MaxRecords</code> value
     *        is available, a pagination token called a marker is included in the response so you can retrieve the
     *        remaining results. </p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more than the <code>MaxRecords</code> value is
     * available, a pagination token called a marker is included in the response so you can retrieve the remaining
     * results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more than the <code>MaxRecords</code> value
     *         is available, a pagination token called a marker is included in the response so you can retrieve the
     *         remaining results. </p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: Minimum 20, maximum 100.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more than the <code>MaxRecords</code> value is
     * available, a pagination token called a marker is included in the response so you can retrieve the remaining
     * results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more than the <code>MaxRecords</code> value
     *        is available, a pagination token called a marker is included in the response so you can retrieve the
     *        remaining results. </p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBEngineVersionsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
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

    public DescribeDBEngineVersionsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether only the default version of the specified engine or engine and major version
     * combination is returned.
     * </p>
     * 
     * @param defaultOnly
     *        A value that indicates whether only the default version of the specified engine or engine and major
     *        version combination is returned.
     */

    public void setDefaultOnly(Boolean defaultOnly) {
        this.defaultOnly = defaultOnly;
    }

    /**
     * <p>
     * A value that indicates whether only the default version of the specified engine or engine and major version
     * combination is returned.
     * </p>
     * 
     * @return A value that indicates whether only the default version of the specified engine or engine and major
     *         version combination is returned.
     */

    public Boolean getDefaultOnly() {
        return this.defaultOnly;
    }

    /**
     * <p>
     * A value that indicates whether only the default version of the specified engine or engine and major version
     * combination is returned.
     * </p>
     * 
     * @param defaultOnly
     *        A value that indicates whether only the default version of the specified engine or engine and major
     *        version combination is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBEngineVersionsRequest withDefaultOnly(Boolean defaultOnly) {
        setDefaultOnly(defaultOnly);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether only the default version of the specified engine or engine and major version
     * combination is returned.
     * </p>
     * 
     * @return A value that indicates whether only the default version of the specified engine or engine and major
     *         version combination is returned.
     */

    public Boolean isDefaultOnly() {
        return this.defaultOnly;
    }

    /**
     * <p>
     * A value that indicates whether to list the supported character sets for each engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the <code>CharacterSetName</code> parameter for
     * <code>CreateDBInstance</code>, the response includes a list of supported character sets for each engine version.
     * </p>
     * 
     * @param listSupportedCharacterSets
     *        A value that indicates whether to list the supported character sets for each engine version.</p>
     *        <p>
     *        If this parameter is enabled and the requested engine supports the <code>CharacterSetName</code> parameter
     *        for <code>CreateDBInstance</code>, the response includes a list of supported character sets for each
     *        engine version.
     */

    public void setListSupportedCharacterSets(Boolean listSupportedCharacterSets) {
        this.listSupportedCharacterSets = listSupportedCharacterSets;
    }

    /**
     * <p>
     * A value that indicates whether to list the supported character sets for each engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the <code>CharacterSetName</code> parameter for
     * <code>CreateDBInstance</code>, the response includes a list of supported character sets for each engine version.
     * </p>
     * 
     * @return A value that indicates whether to list the supported character sets for each engine version.</p>
     *         <p>
     *         If this parameter is enabled and the requested engine supports the <code>CharacterSetName</code>
     *         parameter for <code>CreateDBInstance</code>, the response includes a list of supported character sets for
     *         each engine version.
     */

    public Boolean getListSupportedCharacterSets() {
        return this.listSupportedCharacterSets;
    }

    /**
     * <p>
     * A value that indicates whether to list the supported character sets for each engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the <code>CharacterSetName</code> parameter for
     * <code>CreateDBInstance</code>, the response includes a list of supported character sets for each engine version.
     * </p>
     * 
     * @param listSupportedCharacterSets
     *        A value that indicates whether to list the supported character sets for each engine version.</p>
     *        <p>
     *        If this parameter is enabled and the requested engine supports the <code>CharacterSetName</code> parameter
     *        for <code>CreateDBInstance</code>, the response includes a list of supported character sets for each
     *        engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBEngineVersionsRequest withListSupportedCharacterSets(Boolean listSupportedCharacterSets) {
        setListSupportedCharacterSets(listSupportedCharacterSets);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to list the supported character sets for each engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the <code>CharacterSetName</code> parameter for
     * <code>CreateDBInstance</code>, the response includes a list of supported character sets for each engine version.
     * </p>
     * 
     * @return A value that indicates whether to list the supported character sets for each engine version.</p>
     *         <p>
     *         If this parameter is enabled and the requested engine supports the <code>CharacterSetName</code>
     *         parameter for <code>CreateDBInstance</code>, the response includes a list of supported character sets for
     *         each engine version.
     */

    public Boolean isListSupportedCharacterSets() {
        return this.listSupportedCharacterSets;
    }

    /**
     * <p>
     * A value that indicates whether to list the supported time zones for each engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the <code>TimeZone</code> parameter for
     * <code>CreateDBInstance</code>, the response includes a list of supported time zones for each engine version.
     * </p>
     * 
     * @param listSupportedTimezones
     *        A value that indicates whether to list the supported time zones for each engine version.</p>
     *        <p>
     *        If this parameter is enabled and the requested engine supports the <code>TimeZone</code> parameter for
     *        <code>CreateDBInstance</code>, the response includes a list of supported time zones for each engine
     *        version.
     */

    public void setListSupportedTimezones(Boolean listSupportedTimezones) {
        this.listSupportedTimezones = listSupportedTimezones;
    }

    /**
     * <p>
     * A value that indicates whether to list the supported time zones for each engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the <code>TimeZone</code> parameter for
     * <code>CreateDBInstance</code>, the response includes a list of supported time zones for each engine version.
     * </p>
     * 
     * @return A value that indicates whether to list the supported time zones for each engine version.</p>
     *         <p>
     *         If this parameter is enabled and the requested engine supports the <code>TimeZone</code> parameter for
     *         <code>CreateDBInstance</code>, the response includes a list of supported time zones for each engine
     *         version.
     */

    public Boolean getListSupportedTimezones() {
        return this.listSupportedTimezones;
    }

    /**
     * <p>
     * A value that indicates whether to list the supported time zones for each engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the <code>TimeZone</code> parameter for
     * <code>CreateDBInstance</code>, the response includes a list of supported time zones for each engine version.
     * </p>
     * 
     * @param listSupportedTimezones
     *        A value that indicates whether to list the supported time zones for each engine version.</p>
     *        <p>
     *        If this parameter is enabled and the requested engine supports the <code>TimeZone</code> parameter for
     *        <code>CreateDBInstance</code>, the response includes a list of supported time zones for each engine
     *        version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBEngineVersionsRequest withListSupportedTimezones(Boolean listSupportedTimezones) {
        setListSupportedTimezones(listSupportedTimezones);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to list the supported time zones for each engine version.
     * </p>
     * <p>
     * If this parameter is enabled and the requested engine supports the <code>TimeZone</code> parameter for
     * <code>CreateDBInstance</code>, the response includes a list of supported time zones for each engine version.
     * </p>
     * 
     * @return A value that indicates whether to list the supported time zones for each engine version.</p>
     *         <p>
     *         If this parameter is enabled and the requested engine supports the <code>TimeZone</code> parameter for
     *         <code>CreateDBInstance</code>, the response includes a list of supported time zones for each engine
     *         version.
     */

    public Boolean isListSupportedTimezones() {
        return this.listSupportedTimezones;
    }

    /**
     * <p>
     * A value that indicates whether to include engine versions that aren't available in the list. The default is to
     * list only available engine versions.
     * </p>
     * 
     * @param includeAll
     *        A value that indicates whether to include engine versions that aren't available in the list. The default
     *        is to list only available engine versions.
     */

    public void setIncludeAll(Boolean includeAll) {
        this.includeAll = includeAll;
    }

    /**
     * <p>
     * A value that indicates whether to include engine versions that aren't available in the list. The default is to
     * list only available engine versions.
     * </p>
     * 
     * @return A value that indicates whether to include engine versions that aren't available in the list. The default
     *         is to list only available engine versions.
     */

    public Boolean getIncludeAll() {
        return this.includeAll;
    }

    /**
     * <p>
     * A value that indicates whether to include engine versions that aren't available in the list. The default is to
     * list only available engine versions.
     * </p>
     * 
     * @param includeAll
     *        A value that indicates whether to include engine versions that aren't available in the list. The default
     *        is to list only available engine versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBEngineVersionsRequest withIncludeAll(Boolean includeAll) {
        setIncludeAll(includeAll);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to include engine versions that aren't available in the list. The default is to
     * list only available engine versions.
     * </p>
     * 
     * @return A value that indicates whether to include engine versions that aren't available in the list. The default
     *         is to list only available engine versions.
     */

    public Boolean isIncludeAll() {
        return this.includeAll;
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
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getDBParameterGroupFamily() != null)
            sb.append("DBParameterGroupFamily: ").append(getDBParameterGroupFamily()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getDefaultOnly() != null)
            sb.append("DefaultOnly: ").append(getDefaultOnly()).append(",");
        if (getListSupportedCharacterSets() != null)
            sb.append("ListSupportedCharacterSets: ").append(getListSupportedCharacterSets()).append(",");
        if (getListSupportedTimezones() != null)
            sb.append("ListSupportedTimezones: ").append(getListSupportedTimezones()).append(",");
        if (getIncludeAll() != null)
            sb.append("IncludeAll: ").append(getIncludeAll());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBEngineVersionsRequest == false)
            return false;
        DescribeDBEngineVersionsRequest other = (DescribeDBEngineVersionsRequest) obj;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDBParameterGroupFamily() == null ^ this.getDBParameterGroupFamily() == null)
            return false;
        if (other.getDBParameterGroupFamily() != null && other.getDBParameterGroupFamily().equals(this.getDBParameterGroupFamily()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDefaultOnly() == null ^ this.getDefaultOnly() == null)
            return false;
        if (other.getDefaultOnly() != null && other.getDefaultOnly().equals(this.getDefaultOnly()) == false)
            return false;
        if (other.getListSupportedCharacterSets() == null ^ this.getListSupportedCharacterSets() == null)
            return false;
        if (other.getListSupportedCharacterSets() != null && other.getListSupportedCharacterSets().equals(this.getListSupportedCharacterSets()) == false)
            return false;
        if (other.getListSupportedTimezones() == null ^ this.getListSupportedTimezones() == null)
            return false;
        if (other.getListSupportedTimezones() != null && other.getListSupportedTimezones().equals(this.getListSupportedTimezones()) == false)
            return false;
        if (other.getIncludeAll() == null ^ this.getIncludeAll() == null)
            return false;
        if (other.getIncludeAll() != null && other.getIncludeAll().equals(this.getIncludeAll()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getDBParameterGroupFamily() == null) ? 0 : getDBParameterGroupFamily().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getDefaultOnly() == null) ? 0 : getDefaultOnly().hashCode());
        hashCode = prime * hashCode + ((getListSupportedCharacterSets() == null) ? 0 : getListSupportedCharacterSets().hashCode());
        hashCode = prime * hashCode + ((getListSupportedTimezones() == null) ? 0 : getListSupportedTimezones().hashCode());
        hashCode = prime * hashCode + ((getIncludeAll() == null) ? 0 : getIncludeAll().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBEngineVersionsRequest clone() {
        return (DescribeDBEngineVersionsRequest) super.clone();
    }

}
