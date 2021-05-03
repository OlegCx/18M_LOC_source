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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameServerInstances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGameServerInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     */
    private String gameServerGroupName;
    /**
     * <p>
     * The EC2 instance IDs that you want to retrieve status on. EC2 instance IDs use a 17-character format, for
     * example: <code>i-1234567890abcdef0</code>. To retrieve all instances in the game server group, leave this
     * parameter empty.
     * </p>
     */
    private java.util.List<String> instanceIds;
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
     * A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @param gameServerGroupName
     *        A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     */

    public void setGameServerGroupName(String gameServerGroupName) {
        this.gameServerGroupName = gameServerGroupName;
    }

    /**
     * <p>
     * A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @return A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     */

    public String getGameServerGroupName() {
        return this.gameServerGroupName;
    }

    /**
     * <p>
     * A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @param gameServerGroupName
     *        A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameServerInstancesRequest withGameServerGroupName(String gameServerGroupName) {
        setGameServerGroupName(gameServerGroupName);
        return this;
    }

    /**
     * <p>
     * The EC2 instance IDs that you want to retrieve status on. EC2 instance IDs use a 17-character format, for
     * example: <code>i-1234567890abcdef0</code>. To retrieve all instances in the game server group, leave this
     * parameter empty.
     * </p>
     * 
     * @return The EC2 instance IDs that you want to retrieve status on. EC2 instance IDs use a 17-character format, for
     *         example: <code>i-1234567890abcdef0</code>. To retrieve all instances in the game server group, leave this
     *         parameter empty.
     */

    public java.util.List<String> getInstanceIds() {
        return instanceIds;
    }

    /**
     * <p>
     * The EC2 instance IDs that you want to retrieve status on. EC2 instance IDs use a 17-character format, for
     * example: <code>i-1234567890abcdef0</code>. To retrieve all instances in the game server group, leave this
     * parameter empty.
     * </p>
     * 
     * @param instanceIds
     *        The EC2 instance IDs that you want to retrieve status on. EC2 instance IDs use a 17-character format, for
     *        example: <code>i-1234567890abcdef0</code>. To retrieve all instances in the game server group, leave this
     *        parameter empty.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new java.util.ArrayList<String>(instanceIds);
    }

    /**
     * <p>
     * The EC2 instance IDs that you want to retrieve status on. EC2 instance IDs use a 17-character format, for
     * example: <code>i-1234567890abcdef0</code>. To retrieve all instances in the game server group, leave this
     * parameter empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        The EC2 instance IDs that you want to retrieve status on. EC2 instance IDs use a 17-character format, for
     *        example: <code>i-1234567890abcdef0</code>. To retrieve all instances in the game server group, leave this
     *        parameter empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameServerInstancesRequest withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new java.util.ArrayList<String>(instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The EC2 instance IDs that you want to retrieve status on. EC2 instance IDs use a 17-character format, for
     * example: <code>i-1234567890abcdef0</code>. To retrieve all instances in the game server group, leave this
     * parameter empty.
     * </p>
     * 
     * @param instanceIds
     *        The EC2 instance IDs that you want to retrieve status on. EC2 instance IDs use a 17-character format, for
     *        example: <code>i-1234567890abcdef0</code>. To retrieve all instances in the game server group, leave this
     *        parameter empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameServerInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
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

    public DescribeGameServerInstancesRequest withLimit(Integer limit) {
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

    public DescribeGameServerInstancesRequest withNextToken(String nextToken) {
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
        if (getGameServerGroupName() != null)
            sb.append("GameServerGroupName: ").append(getGameServerGroupName()).append(",");
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds()).append(",");
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

        if (obj instanceof DescribeGameServerInstancesRequest == false)
            return false;
        DescribeGameServerInstancesRequest other = (DescribeGameServerInstancesRequest) obj;
        if (other.getGameServerGroupName() == null ^ this.getGameServerGroupName() == null)
            return false;
        if (other.getGameServerGroupName() != null && other.getGameServerGroupName().equals(this.getGameServerGroupName()) == false)
            return false;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
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

        hashCode = prime * hashCode + ((getGameServerGroupName() == null) ? 0 : getGameServerGroupName().hashCode());
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGameServerInstancesRequest clone() {
        return (DescribeGameServerInstancesRequest) super.clone();
    }

}
