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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListUpdates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUpdatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon EKS cluster to list updates for.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the Amazon EKS managed node group to list updates for.
     * </p>
     */
    private String nodegroupName;
    /**
     * <p>
     * The names of the installed add-ons that have available updates.
     * </p>
     */
    private String addonName;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListUpdates</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of update results returned by <code>ListUpdates</code> in paginated output. When you use this
     * parameter, <code>ListUpdates</code> returns only <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. You can see the remaining results of the initial request by sending
     * another <code>ListUpdates</code> request with the returned <code>nextToken</code> value. This value can be
     * between 1 and 100. If you don't use this parameter, <code>ListUpdates</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the Amazon EKS cluster to list updates for.
     * </p>
     * 
     * @param name
     *        The name of the Amazon EKS cluster to list updates for.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster to list updates for.
     * </p>
     * 
     * @return The name of the Amazon EKS cluster to list updates for.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster to list updates for.
     * </p>
     * 
     * @param name
     *        The name of the Amazon EKS cluster to list updates for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUpdatesRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon EKS managed node group to list updates for.
     * </p>
     * 
     * @param nodegroupName
     *        The name of the Amazon EKS managed node group to list updates for.
     */

    public void setNodegroupName(String nodegroupName) {
        this.nodegroupName = nodegroupName;
    }

    /**
     * <p>
     * The name of the Amazon EKS managed node group to list updates for.
     * </p>
     * 
     * @return The name of the Amazon EKS managed node group to list updates for.
     */

    public String getNodegroupName() {
        return this.nodegroupName;
    }

    /**
     * <p>
     * The name of the Amazon EKS managed node group to list updates for.
     * </p>
     * 
     * @param nodegroupName
     *        The name of the Amazon EKS managed node group to list updates for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUpdatesRequest withNodegroupName(String nodegroupName) {
        setNodegroupName(nodegroupName);
        return this;
    }

    /**
     * <p>
     * The names of the installed add-ons that have available updates.
     * </p>
     * 
     * @param addonName
     *        The names of the installed add-ons that have available updates.
     */

    public void setAddonName(String addonName) {
        this.addonName = addonName;
    }

    /**
     * <p>
     * The names of the installed add-ons that have available updates.
     * </p>
     * 
     * @return The names of the installed add-ons that have available updates.
     */

    public String getAddonName() {
        return this.addonName;
    }

    /**
     * <p>
     * The names of the installed add-ons that have available updates.
     * </p>
     * 
     * @param addonName
     *        The names of the installed add-ons that have available updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUpdatesRequest withAddonName(String addonName) {
        setAddonName(addonName);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListUpdates</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListUpdates</code> request where
     *        <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListUpdates</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListUpdates</code> request
     *         where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the <code>nextToken</code> value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListUpdates</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListUpdates</code> request where
     *        <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUpdatesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of update results returned by <code>ListUpdates</code> in paginated output. When you use this
     * parameter, <code>ListUpdates</code> returns only <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. You can see the remaining results of the initial request by sending
     * another <code>ListUpdates</code> request with the returned <code>nextToken</code> value. This value can be
     * between 1 and 100. If you don't use this parameter, <code>ListUpdates</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of update results returned by <code>ListUpdates</code> in paginated output. When you
     *        use this parameter, <code>ListUpdates</code> returns only <code>maxResults</code> results in a single page
     *        along with a <code>nextToken</code> response element. You can see the remaining results of the initial
     *        request by sending another <code>ListUpdates</code> request with the returned <code>nextToken</code>
     *        value. This value can be between 1 and 100. If you don't use this parameter, <code>ListUpdates</code>
     *        returns up to 100 results and a <code>nextToken</code> value if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of update results returned by <code>ListUpdates</code> in paginated output. When you use this
     * parameter, <code>ListUpdates</code> returns only <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. You can see the remaining results of the initial request by sending
     * another <code>ListUpdates</code> request with the returned <code>nextToken</code> value. This value can be
     * between 1 and 100. If you don't use this parameter, <code>ListUpdates</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @return The maximum number of update results returned by <code>ListUpdates</code> in paginated output. When you
     *         use this parameter, <code>ListUpdates</code> returns only <code>maxResults</code> results in a single
     *         page along with a <code>nextToken</code> response element. You can see the remaining results of the
     *         initial request by sending another <code>ListUpdates</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 100. If you don't use this parameter,
     *         <code>ListUpdates</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of update results returned by <code>ListUpdates</code> in paginated output. When you use this
     * parameter, <code>ListUpdates</code> returns only <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. You can see the remaining results of the initial request by sending
     * another <code>ListUpdates</code> request with the returned <code>nextToken</code> value. This value can be
     * between 1 and 100. If you don't use this parameter, <code>ListUpdates</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of update results returned by <code>ListUpdates</code> in paginated output. When you
     *        use this parameter, <code>ListUpdates</code> returns only <code>maxResults</code> results in a single page
     *        along with a <code>nextToken</code> response element. You can see the remaining results of the initial
     *        request by sending another <code>ListUpdates</code> request with the returned <code>nextToken</code>
     *        value. This value can be between 1 and 100. If you don't use this parameter, <code>ListUpdates</code>
     *        returns up to 100 results and a <code>nextToken</code> value if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUpdatesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNodegroupName() != null)
            sb.append("NodegroupName: ").append(getNodegroupName()).append(",");
        if (getAddonName() != null)
            sb.append("AddonName: ").append(getAddonName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUpdatesRequest == false)
            return false;
        ListUpdatesRequest other = (ListUpdatesRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNodegroupName() == null ^ this.getNodegroupName() == null)
            return false;
        if (other.getNodegroupName() != null && other.getNodegroupName().equals(this.getNodegroupName()) == false)
            return false;
        if (other.getAddonName() == null ^ this.getAddonName() == null)
            return false;
        if (other.getAddonName() != null && other.getAddonName().equals(this.getAddonName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNodegroupName() == null) ? 0 : getNodegroupName().hashCode());
        hashCode = prime * hashCode + ((getAddonName() == null) ? 0 : getAddonName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListUpdatesRequest clone() {
        return (ListUpdatesRequest) super.clone();
    }

}
