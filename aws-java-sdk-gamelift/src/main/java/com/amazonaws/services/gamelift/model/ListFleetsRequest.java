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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListFleets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFleetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the build to request fleets for. Use this parameter to return only fleets using a
     * specified build. Use either the build ID or ARN value.
     * </p>
     */
    private String buildId;
    /**
     * <p>
     * A unique identifier for the Realtime script to request fleets for. Use this parameter to return only fleets using
     * a specified script. Use either the script ID or ARN value.
     * </p>
     */
    private String scriptId;
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
     * A unique identifier for the build to request fleets for. Use this parameter to return only fleets using a
     * specified build. Use either the build ID or ARN value.
     * </p>
     * 
     * @param buildId
     *        A unique identifier for the build to request fleets for. Use this parameter to return only fleets using a
     *        specified build. Use either the build ID or ARN value.
     */

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    /**
     * <p>
     * A unique identifier for the build to request fleets for. Use this parameter to return only fleets using a
     * specified build. Use either the build ID or ARN value.
     * </p>
     * 
     * @return A unique identifier for the build to request fleets for. Use this parameter to return only fleets using a
     *         specified build. Use either the build ID or ARN value.
     */

    public String getBuildId() {
        return this.buildId;
    }

    /**
     * <p>
     * A unique identifier for the build to request fleets for. Use this parameter to return only fleets using a
     * specified build. Use either the build ID or ARN value.
     * </p>
     * 
     * @param buildId
     *        A unique identifier for the build to request fleets for. Use this parameter to return only fleets using a
     *        specified build. Use either the build ID or ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsRequest withBuildId(String buildId) {
        setBuildId(buildId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the Realtime script to request fleets for. Use this parameter to return only fleets using
     * a specified script. Use either the script ID or ARN value.
     * </p>
     * 
     * @param scriptId
     *        A unique identifier for the Realtime script to request fleets for. Use this parameter to return only
     *        fleets using a specified script. Use either the script ID or ARN value.
     */

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    /**
     * <p>
     * A unique identifier for the Realtime script to request fleets for. Use this parameter to return only fleets using
     * a specified script. Use either the script ID or ARN value.
     * </p>
     * 
     * @return A unique identifier for the Realtime script to request fleets for. Use this parameter to return only
     *         fleets using a specified script. Use either the script ID or ARN value.
     */

    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * <p>
     * A unique identifier for the Realtime script to request fleets for. Use this parameter to return only fleets using
     * a specified script. Use either the script ID or ARN value.
     * </p>
     * 
     * @param scriptId
     *        A unique identifier for the Realtime script to request fleets for. Use this parameter to return only
     *        fleets using a specified script. Use either the script ID or ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsRequest withScriptId(String scriptId) {
        setScriptId(scriptId);
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

    public ListFleetsRequest withLimit(Integer limit) {
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

    public ListFleetsRequest withNextToken(String nextToken) {
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
        if (getBuildId() != null)
            sb.append("BuildId: ").append(getBuildId()).append(",");
        if (getScriptId() != null)
            sb.append("ScriptId: ").append(getScriptId()).append(",");
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

        if (obj instanceof ListFleetsRequest == false)
            return false;
        ListFleetsRequest other = (ListFleetsRequest) obj;
        if (other.getBuildId() == null ^ this.getBuildId() == null)
            return false;
        if (other.getBuildId() != null && other.getBuildId().equals(this.getBuildId()) == false)
            return false;
        if (other.getScriptId() == null ^ this.getScriptId() == null)
            return false;
        if (other.getScriptId() != null && other.getScriptId().equals(this.getScriptId()) == false)
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

        hashCode = prime * hashCode + ((getBuildId() == null) ? 0 : getBuildId().hashCode());
        hashCode = prime * hashCode + ((getScriptId() == null) ? 0 : getScriptId().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFleetsRequest clone() {
        return (ListFleetsRequest) super.clone();
    }

}
