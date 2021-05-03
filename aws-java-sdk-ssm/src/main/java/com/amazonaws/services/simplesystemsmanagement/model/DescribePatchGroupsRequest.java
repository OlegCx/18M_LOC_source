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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePatchGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of patch groups to return (per page).
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of results.
     * </p>
     * <p>
     * For <code>DescribePatchGroups</code>,valid filter keys include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NAME_PREFIX</code>: The name of the patch group. Wildcards (*) are accepted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPERATING_SYSTEM</code>: The supported operating system type to return results for. For valid operating
     * system values, see <a>GetDefaultPatchBaselineRequest$OperatingSystem</a> in <a>CreatePatchBaseline</a>.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>--filters Key=NAME_PREFIX,Values=MyPatchGroup*</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>--filters Key=OPERATING_SYSTEM,Values=AMAZON_LINUX_2</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<PatchOrchestratorFilter> filters;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of patch groups to return (per page).
     * </p>
     * 
     * @param maxResults
     *        The maximum number of patch groups to return (per page).
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of patch groups to return (per page).
     * </p>
     * 
     * @return The maximum number of patch groups to return (per page).
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of patch groups to return (per page).
     * </p>
     * 
     * @param maxResults
     *        The maximum number of patch groups to return (per page).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of results.
     * </p>
     * <p>
     * For <code>DescribePatchGroups</code>,valid filter keys include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NAME_PREFIX</code>: The name of the patch group. Wildcards (*) are accepted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPERATING_SYSTEM</code>: The supported operating system type to return results for. For valid operating
     * system values, see <a>GetDefaultPatchBaselineRequest$OperatingSystem</a> in <a>CreatePatchBaseline</a>.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>--filters Key=NAME_PREFIX,Values=MyPatchGroup*</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>--filters Key=OPERATING_SYSTEM,Values=AMAZON_LINUX_2</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return One or more filters. Use a filter to return a more specific list of results.</p>
     *         <p>
     *         For <code>DescribePatchGroups</code>,valid filter keys include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NAME_PREFIX</code>: The name of the patch group. Wildcards (*) are accepted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPERATING_SYSTEM</code>: The supported operating system type to return results for. For valid
     *         operating system values, see <a>GetDefaultPatchBaselineRequest$OperatingSystem</a> in
     *         <a>CreatePatchBaseline</a>.
     *         </p>
     *         <p>
     *         Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>--filters Key=NAME_PREFIX,Values=MyPatchGroup*</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>--filters Key=OPERATING_SYSTEM,Values=AMAZON_LINUX_2</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public java.util.List<PatchOrchestratorFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<PatchOrchestratorFilter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of results.
     * </p>
     * <p>
     * For <code>DescribePatchGroups</code>,valid filter keys include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NAME_PREFIX</code>: The name of the patch group. Wildcards (*) are accepted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPERATING_SYSTEM</code>: The supported operating system type to return results for. For valid operating
     * system values, see <a>GetDefaultPatchBaselineRequest$OperatingSystem</a> in <a>CreatePatchBaseline</a>.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>--filters Key=NAME_PREFIX,Values=MyPatchGroup*</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>--filters Key=OPERATING_SYSTEM,Values=AMAZON_LINUX_2</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters. Use a filter to return a more specific list of results.</p>
     *        <p>
     *        For <code>DescribePatchGroups</code>,valid filter keys include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NAME_PREFIX</code>: The name of the patch group. Wildcards (*) are accepted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPERATING_SYSTEM</code>: The supported operating system type to return results for. For valid
     *        operating system values, see <a>GetDefaultPatchBaselineRequest$OperatingSystem</a> in
     *        <a>CreatePatchBaseline</a>.
     *        </p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>--filters Key=NAME_PREFIX,Values=MyPatchGroup*</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>--filters Key=OPERATING_SYSTEM,Values=AMAZON_LINUX_2</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setFilters(java.util.Collection<PatchOrchestratorFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<PatchOrchestratorFilter>(filters);
    }

    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of results.
     * </p>
     * <p>
     * For <code>DescribePatchGroups</code>,valid filter keys include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NAME_PREFIX</code>: The name of the patch group. Wildcards (*) are accepted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPERATING_SYSTEM</code>: The supported operating system type to return results for. For valid operating
     * system values, see <a>GetDefaultPatchBaselineRequest$OperatingSystem</a> in <a>CreatePatchBaseline</a>.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>--filters Key=NAME_PREFIX,Values=MyPatchGroup*</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>--filters Key=OPERATING_SYSTEM,Values=AMAZON_LINUX_2</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters. Use a filter to return a more specific list of results.</p>
     *        <p>
     *        For <code>DescribePatchGroups</code>,valid filter keys include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NAME_PREFIX</code>: The name of the patch group. Wildcards (*) are accepted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPERATING_SYSTEM</code>: The supported operating system type to return results for. For valid
     *        operating system values, see <a>GetDefaultPatchBaselineRequest$OperatingSystem</a> in
     *        <a>CreatePatchBaseline</a>.
     *        </p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>--filters Key=NAME_PREFIX,Values=MyPatchGroup*</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>--filters Key=OPERATING_SYSTEM,Values=AMAZON_LINUX_2</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupsRequest withFilters(PatchOrchestratorFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<PatchOrchestratorFilter>(filters.length));
        }
        for (PatchOrchestratorFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of results.
     * </p>
     * <p>
     * For <code>DescribePatchGroups</code>,valid filter keys include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NAME_PREFIX</code>: The name of the patch group. Wildcards (*) are accepted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPERATING_SYSTEM</code>: The supported operating system type to return results for. For valid operating
     * system values, see <a>GetDefaultPatchBaselineRequest$OperatingSystem</a> in <a>CreatePatchBaseline</a>.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>--filters Key=NAME_PREFIX,Values=MyPatchGroup*</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>--filters Key=OPERATING_SYSTEM,Values=AMAZON_LINUX_2</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters. Use a filter to return a more specific list of results.</p>
     *        <p>
     *        For <code>DescribePatchGroups</code>,valid filter keys include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NAME_PREFIX</code>: The name of the patch group. Wildcards (*) are accepted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPERATING_SYSTEM</code>: The supported operating system type to return results for. For valid
     *        operating system values, see <a>GetDefaultPatchBaselineRequest$OperatingSystem</a> in
     *        <a>CreatePatchBaseline</a>.
     *        </p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>--filters Key=NAME_PREFIX,Values=MyPatchGroup*</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>--filters Key=OPERATING_SYSTEM,Values=AMAZON_LINUX_2</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupsRequest withFilters(java.util.Collection<PatchOrchestratorFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupsRequest withNextToken(String nextToken) {
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof DescribePatchGroupsRequest == false)
            return false;
        DescribePatchGroupsRequest other = (DescribePatchGroupsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribePatchGroupsRequest clone() {
        return (DescribePatchGroupsRequest) super.clone();
    }

}
