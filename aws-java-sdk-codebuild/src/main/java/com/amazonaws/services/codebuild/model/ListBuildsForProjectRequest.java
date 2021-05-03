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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListBuildsForProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBuildsForProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The order to list results in. The results are sorted by build number, not the build identifier.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List the build IDs in ascending order by build ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List the build IDs in descending order by build ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the project has more than 100 builds, setting the sort order will result in an error.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * During a previous call, if there are more than 100 items in the list, only the first 100 items are returned,
     * along with a unique string called a <i>nextToken</i>. To get the next batch of items in the list, call this
     * operation again, adding the next token to the call. To get all of the items in the list, keep calling this
     * operation with each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     * 
     * @param projectName
     *        The name of the AWS CodeBuild project.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     * 
     * @return The name of the AWS CodeBuild project.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     * 
     * @param projectName
     *        The name of the AWS CodeBuild project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuildsForProjectRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The order to list results in. The results are sorted by build number, not the build identifier.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List the build IDs in ascending order by build ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List the build IDs in descending order by build ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the project has more than 100 builds, setting the sort order will result in an error.
     * </p>
     * 
     * @param sortOrder
     *        The order to list results in. The results are sorted by build number, not the build identifier.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASCENDING</code>: List the build IDs in ascending order by build ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESCENDING</code>: List the build IDs in descending order by build ID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the project has more than 100 builds, setting the sort order will result in an error.
     * @see SortOrderType
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order to list results in. The results are sorted by build number, not the build identifier.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List the build IDs in ascending order by build ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List the build IDs in descending order by build ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the project has more than 100 builds, setting the sort order will result in an error.
     * </p>
     * 
     * @return The order to list results in. The results are sorted by build number, not the build identifier.</p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ASCENDING</code>: List the build IDs in ascending order by build ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DESCENDING</code>: List the build IDs in descending order by build ID.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the project has more than 100 builds, setting the sort order will result in an error.
     * @see SortOrderType
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The order to list results in. The results are sorted by build number, not the build identifier.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List the build IDs in ascending order by build ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List the build IDs in descending order by build ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the project has more than 100 builds, setting the sort order will result in an error.
     * </p>
     * 
     * @param sortOrder
     *        The order to list results in. The results are sorted by build number, not the build identifier.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASCENDING</code>: List the build IDs in ascending order by build ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESCENDING</code>: List the build IDs in descending order by build ID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the project has more than 100 builds, setting the sort order will result in an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrderType
     */

    public ListBuildsForProjectRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The order to list results in. The results are sorted by build number, not the build identifier.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List the build IDs in ascending order by build ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List the build IDs in descending order by build ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the project has more than 100 builds, setting the sort order will result in an error.
     * </p>
     * 
     * @param sortOrder
     *        The order to list results in. The results are sorted by build number, not the build identifier.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASCENDING</code>: List the build IDs in ascending order by build ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESCENDING</code>: List the build IDs in descending order by build ID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the project has more than 100 builds, setting the sort order will result in an error.
     * @see SortOrderType
     */

    public void setSortOrder(SortOrderType sortOrder) {
        withSortOrder(sortOrder);
    }

    /**
     * <p>
     * The order to list results in. The results are sorted by build number, not the build identifier.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List the build IDs in ascending order by build ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List the build IDs in descending order by build ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the project has more than 100 builds, setting the sort order will result in an error.
     * </p>
     * 
     * @param sortOrder
     *        The order to list results in. The results are sorted by build number, not the build identifier.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASCENDING</code>: List the build IDs in ascending order by build ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESCENDING</code>: List the build IDs in descending order by build ID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the project has more than 100 builds, setting the sort order will result in an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrderType
     */

    public ListBuildsForProjectRequest withSortOrder(SortOrderType sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * During a previous call, if there are more than 100 items in the list, only the first 100 items are returned,
     * along with a unique string called a <i>nextToken</i>. To get the next batch of items in the list, call this
     * operation again, adding the next token to the call. To get all of the items in the list, keep calling this
     * operation with each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     * 
     * @param nextToken
     *        During a previous call, if there are more than 100 items in the list, only the first 100 items are
     *        returned, along with a unique string called a <i>nextToken</i>. To get the next batch of items in the
     *        list, call this operation again, adding the next token to the call. To get all of the items in the list,
     *        keep calling this operation with each subsequent next token that is returned, until no more next tokens
     *        are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * During a previous call, if there are more than 100 items in the list, only the first 100 items are returned,
     * along with a unique string called a <i>nextToken</i>. To get the next batch of items in the list, call this
     * operation again, adding the next token to the call. To get all of the items in the list, keep calling this
     * operation with each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     * 
     * @return During a previous call, if there are more than 100 items in the list, only the first 100 items are
     *         returned, along with a unique string called a <i>nextToken</i>. To get the next batch of items in the
     *         list, call this operation again, adding the next token to the call. To get all of the items in the list,
     *         keep calling this operation with each subsequent next token that is returned, until no more next tokens
     *         are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * During a previous call, if there are more than 100 items in the list, only the first 100 items are returned,
     * along with a unique string called a <i>nextToken</i>. To get the next batch of items in the list, call this
     * operation again, adding the next token to the call. To get all of the items in the list, keep calling this
     * operation with each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     * 
     * @param nextToken
     *        During a previous call, if there are more than 100 items in the list, only the first 100 items are
     *        returned, along with a unique string called a <i>nextToken</i>. To get the next batch of items in the
     *        list, call this operation again, adding the next token to the call. To get all of the items in the list,
     *        keep calling this operation with each subsequent next token that is returned, until no more next tokens
     *        are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuildsForProjectRequest withNextToken(String nextToken) {
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
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

        if (obj instanceof ListBuildsForProjectRequest == false)
            return false;
        ListBuildsForProjectRequest other = (ListBuildsForProjectRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
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

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBuildsForProjectRequest clone() {
        return (ListBuildsForProjectRequest) super.clone();
    }

}
