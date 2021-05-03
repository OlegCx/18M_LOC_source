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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConformancePackStatuses"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrganizationConformancePackStatusesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>OrganizationConformancePackStatus</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OrganizationConformancePackStatus> organizationConformancePackStatuses;
    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>OrganizationConformancePackStatus</code> objects.
     * </p>
     * 
     * @return A list of <code>OrganizationConformancePackStatus</code> objects.
     */

    public java.util.List<OrganizationConformancePackStatus> getOrganizationConformancePackStatuses() {
        if (organizationConformancePackStatuses == null) {
            organizationConformancePackStatuses = new com.amazonaws.internal.SdkInternalList<OrganizationConformancePackStatus>();
        }
        return organizationConformancePackStatuses;
    }

    /**
     * <p>
     * A list of <code>OrganizationConformancePackStatus</code> objects.
     * </p>
     * 
     * @param organizationConformancePackStatuses
     *        A list of <code>OrganizationConformancePackStatus</code> objects.
     */

    public void setOrganizationConformancePackStatuses(java.util.Collection<OrganizationConformancePackStatus> organizationConformancePackStatuses) {
        if (organizationConformancePackStatuses == null) {
            this.organizationConformancePackStatuses = null;
            return;
        }

        this.organizationConformancePackStatuses = new com.amazonaws.internal.SdkInternalList<OrganizationConformancePackStatus>(
                organizationConformancePackStatuses);
    }

    /**
     * <p>
     * A list of <code>OrganizationConformancePackStatus</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationConformancePackStatuses(java.util.Collection)} or
     * {@link #withOrganizationConformancePackStatuses(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param organizationConformancePackStatuses
     *        A list of <code>OrganizationConformancePackStatus</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConformancePackStatusesResult withOrganizationConformancePackStatuses(
            OrganizationConformancePackStatus... organizationConformancePackStatuses) {
        if (this.organizationConformancePackStatuses == null) {
            setOrganizationConformancePackStatuses(new com.amazonaws.internal.SdkInternalList<OrganizationConformancePackStatus>(
                    organizationConformancePackStatuses.length));
        }
        for (OrganizationConformancePackStatus ele : organizationConformancePackStatuses) {
            this.organizationConformancePackStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>OrganizationConformancePackStatus</code> objects.
     * </p>
     * 
     * @param organizationConformancePackStatuses
     *        A list of <code>OrganizationConformancePackStatus</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConformancePackStatusesResult withOrganizationConformancePackStatuses(
            java.util.Collection<OrganizationConformancePackStatus> organizationConformancePackStatuses) {
        setOrganizationConformancePackStatuses(organizationConformancePackStatuses);
        return this;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string returned on a previous page that you use to get the next page of results in a
     *        paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @return The nextToken string returned on a previous page that you use to get the next page of results in a
     *         paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string returned on a previous page that you use to get the next page of results in a
     *        paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConformancePackStatusesResult withNextToken(String nextToken) {
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
        if (getOrganizationConformancePackStatuses() != null)
            sb.append("OrganizationConformancePackStatuses: ").append(getOrganizationConformancePackStatuses()).append(",");
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

        if (obj instanceof DescribeOrganizationConformancePackStatusesResult == false)
            return false;
        DescribeOrganizationConformancePackStatusesResult other = (DescribeOrganizationConformancePackStatusesResult) obj;
        if (other.getOrganizationConformancePackStatuses() == null ^ this.getOrganizationConformancePackStatuses() == null)
            return false;
        if (other.getOrganizationConformancePackStatuses() != null
                && other.getOrganizationConformancePackStatuses().equals(this.getOrganizationConformancePackStatuses()) == false)
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

        hashCode = prime * hashCode + ((getOrganizationConformancePackStatuses() == null) ? 0 : getOrganizationConformancePackStatuses().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrganizationConformancePackStatusesResult clone() {
        try {
            return (DescribeOrganizationConformancePackStatusesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
