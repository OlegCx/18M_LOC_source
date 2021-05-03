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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGameSessionDetailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the fleet to retrieve all game sessions active on the fleet. You can use either the fleet
     * ID or ARN value.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * A unique identifier for the game session to retrieve.
     * </p>
     */
    private String gameSessionId;
    /**
     * <p>
     * A unique identifier for the alias associated with the fleet to retrieve all game sessions for. You can use either
     * the alias ID or ARN value.
     * </p>
     */
    private String aliasId;
    /**
     * <p>
     * A fleet location to get game sessions for. You can specify a fleet's home Region or a remote location. Use the
     * AWS Region code format, such as <code>us-west-2</code>.
     * </p>
     */
    private String location;
    /**
     * <p>
     * Game session status to filter results on. Possible game session statuses include <code>ACTIVE</code>,
     * <code>TERMINATED</code>, <code>ACTIVATING</code> and <code>TERMINATING</code> (the last two are transitory).
     * </p>
     */
    private String statusFilter;
    /**
     * <p>
     * The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set
     * of sequential pages.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * A token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this operation. To start at the beginning of the result set, do not specify a value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A unique identifier for the fleet to retrieve all game sessions active on the fleet. You can use either the fleet
     * ID or ARN value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to retrieve all game sessions active on the fleet. You can use either
     *        the fleet ID or ARN value.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to retrieve all game sessions active on the fleet. You can use either the fleet
     * ID or ARN value.
     * </p>
     * 
     * @return A unique identifier for the fleet to retrieve all game sessions active on the fleet. You can use either
     *         the fleet ID or ARN value.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to retrieve all game sessions active on the fleet. You can use either the fleet
     * ID or ARN value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to retrieve all game sessions active on the fleet. You can use either
     *        the fleet ID or ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameSessionDetailsRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the game session to retrieve.
     * </p>
     * 
     * @param gameSessionId
     *        A unique identifier for the game session to retrieve.
     */

    public void setGameSessionId(String gameSessionId) {
        this.gameSessionId = gameSessionId;
    }

    /**
     * <p>
     * A unique identifier for the game session to retrieve.
     * </p>
     * 
     * @return A unique identifier for the game session to retrieve.
     */

    public String getGameSessionId() {
        return this.gameSessionId;
    }

    /**
     * <p>
     * A unique identifier for the game session to retrieve.
     * </p>
     * 
     * @param gameSessionId
     *        A unique identifier for the game session to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameSessionDetailsRequest withGameSessionId(String gameSessionId) {
        setGameSessionId(gameSessionId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the alias associated with the fleet to retrieve all game sessions for. You can use either
     * the alias ID or ARN value.
     * </p>
     * 
     * @param aliasId
     *        A unique identifier for the alias associated with the fleet to retrieve all game sessions for. You can use
     *        either the alias ID or ARN value.
     */

    public void setAliasId(String aliasId) {
        this.aliasId = aliasId;
    }

    /**
     * <p>
     * A unique identifier for the alias associated with the fleet to retrieve all game sessions for. You can use either
     * the alias ID or ARN value.
     * </p>
     * 
     * @return A unique identifier for the alias associated with the fleet to retrieve all game sessions for. You can
     *         use either the alias ID or ARN value.
     */

    public String getAliasId() {
        return this.aliasId;
    }

    /**
     * <p>
     * A unique identifier for the alias associated with the fleet to retrieve all game sessions for. You can use either
     * the alias ID or ARN value.
     * </p>
     * 
     * @param aliasId
     *        A unique identifier for the alias associated with the fleet to retrieve all game sessions for. You can use
     *        either the alias ID or ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameSessionDetailsRequest withAliasId(String aliasId) {
        setAliasId(aliasId);
        return this;
    }

    /**
     * <p>
     * A fleet location to get game sessions for. You can specify a fleet's home Region or a remote location. Use the
     * AWS Region code format, such as <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        A fleet location to get game sessions for. You can specify a fleet's home Region or a remote location. Use
     *        the AWS Region code format, such as <code>us-west-2</code>.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * A fleet location to get game sessions for. You can specify a fleet's home Region or a remote location. Use the
     * AWS Region code format, such as <code>us-west-2</code>.
     * </p>
     * 
     * @return A fleet location to get game sessions for. You can specify a fleet's home Region or a remote location.
     *         Use the AWS Region code format, such as <code>us-west-2</code>.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * A fleet location to get game sessions for. You can specify a fleet's home Region or a remote location. Use the
     * AWS Region code format, such as <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        A fleet location to get game sessions for. You can specify a fleet's home Region or a remote location. Use
     *        the AWS Region code format, such as <code>us-west-2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameSessionDetailsRequest withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * Game session status to filter results on. Possible game session statuses include <code>ACTIVE</code>,
     * <code>TERMINATED</code>, <code>ACTIVATING</code> and <code>TERMINATING</code> (the last two are transitory).
     * </p>
     * 
     * @param statusFilter
     *        Game session status to filter results on. Possible game session statuses include <code>ACTIVE</code>,
     *        <code>TERMINATED</code>, <code>ACTIVATING</code> and <code>TERMINATING</code> (the last two are
     *        transitory).
     */

    public void setStatusFilter(String statusFilter) {
        this.statusFilter = statusFilter;
    }

    /**
     * <p>
     * Game session status to filter results on. Possible game session statuses include <code>ACTIVE</code>,
     * <code>TERMINATED</code>, <code>ACTIVATING</code> and <code>TERMINATING</code> (the last two are transitory).
     * </p>
     * 
     * @return Game session status to filter results on. Possible game session statuses include <code>ACTIVE</code>,
     *         <code>TERMINATED</code>, <code>ACTIVATING</code> and <code>TERMINATING</code> (the last two are
     *         transitory).
     */

    public String getStatusFilter() {
        return this.statusFilter;
    }

    /**
     * <p>
     * Game session status to filter results on. Possible game session statuses include <code>ACTIVE</code>,
     * <code>TERMINATED</code>, <code>ACTIVATING</code> and <code>TERMINATING</code> (the last two are transitory).
     * </p>
     * 
     * @param statusFilter
     *        Game session status to filter results on. Possible game session statuses include <code>ACTIVE</code>,
     *        <code>TERMINATED</code>, <code>ACTIVATING</code> and <code>TERMINATING</code> (the last two are
     *        transitory).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameSessionDetailsRequest withStatusFilter(String statusFilter) {
        setStatusFilter(statusFilter);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set
     * of sequential pages.
     * </p>
     * 
     * @param limit
     *        The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as
     *        a set of sequential pages.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set
     * of sequential pages.
     * </p>
     * 
     * @return The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as
     *         a set of sequential pages.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set
     * of sequential pages.
     * </p>
     * 
     * @param limit
     *        The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as
     *        a set of sequential pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameSessionDetailsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * A token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this operation. To start at the beginning of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the start of the next sequential page of results. Use the token that is returned
     *        with a previous call to this operation. To start at the beginning of the result set, do not specify a
     *        value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this operation. To start at the beginning of the result set, do not specify a value.
     * </p>
     * 
     * @return A token that indicates the start of the next sequential page of results. Use the token that is returned
     *         with a previous call to this operation. To start at the beginning of the result set, do not specify a
     *         value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this operation. To start at the beginning of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the start of the next sequential page of results. Use the token that is returned
     *        with a previous call to this operation. To start at the beginning of the result set, do not specify a
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameSessionDetailsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getGameSessionId() != null)
            sb.append("GameSessionId: ").append(getGameSessionId()).append(",");
        if (getAliasId() != null)
            sb.append("AliasId: ").append(getAliasId()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getStatusFilter() != null)
            sb.append("StatusFilter: ").append(getStatusFilter()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGameSessionDetailsRequest == false)
            return false;
        DescribeGameSessionDetailsRequest other = (DescribeGameSessionDetailsRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getGameSessionId() == null ^ this.getGameSessionId() == null)
            return false;
        if (other.getGameSessionId() != null && other.getGameSessionId().equals(this.getGameSessionId()) == false)
            return false;
        if (other.getAliasId() == null ^ this.getAliasId() == null)
            return false;
        if (other.getAliasId() != null && other.getAliasId().equals(this.getAliasId()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getStatusFilter() == null ^ this.getStatusFilter() == null)
            return false;
        if (other.getStatusFilter() != null && other.getStatusFilter().equals(this.getStatusFilter()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getGameSessionId() == null) ? 0 : getGameSessionId().hashCode());
        hashCode = prime * hashCode + ((getAliasId() == null) ? 0 : getAliasId().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getStatusFilter() == null) ? 0 : getStatusFilter().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGameSessionDetailsRequest clone() {
        return (DescribeGameSessionDetailsRequest) super.clone();
    }

}
