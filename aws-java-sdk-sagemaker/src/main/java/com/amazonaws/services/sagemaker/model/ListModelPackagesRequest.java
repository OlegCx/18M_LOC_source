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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelPackages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListModelPackagesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A filter that returns only model packages created after the specified time (timestamp).
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * A filter that returns only model packages created before the specified time (timestamp).
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * The maximum number of model packages to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A string in the model package name. This filter returns only model packages whose name contains the specified
     * string.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * A filter that returns only the model packages with the specified approval status.
     * </p>
     */
    private String modelApprovalStatus;
    /**
     * <p>
     * A filter that returns only model versions that belong to the specified model group.
     * </p>
     */
    private String modelPackageGroupName;
    /**
     * <p>
     * A filter that returns onlyl the model packages of the specified type. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VERSIONED</code> - List only versioned models.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNVERSIONED</code> - List only unversioined models.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOTH</code> - List both versioned and unversioned models.
     * </p>
     * </li>
     * </ul>
     */
    private String modelPackageType;
    /**
     * <p>
     * If the response to a previous <code>ListModelPackages</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of model packages, use the token in the next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * A filter that returns only model packages created after the specified time (timestamp).
     * </p>
     * 
     * @param creationTimeAfter
     *        A filter that returns only model packages created after the specified time (timestamp).
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only model packages created after the specified time (timestamp).
     * </p>
     * 
     * @return A filter that returns only model packages created after the specified time (timestamp).
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only model packages created after the specified time (timestamp).
     * </p>
     * 
     * @param creationTimeAfter
     *        A filter that returns only model packages created after the specified time (timestamp).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelPackagesRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * A filter that returns only model packages created before the specified time (timestamp).
     * </p>
     * 
     * @param creationTimeBefore
     *        A filter that returns only model packages created before the specified time (timestamp).
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only model packages created before the specified time (timestamp).
     * </p>
     * 
     * @return A filter that returns only model packages created before the specified time (timestamp).
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only model packages created before the specified time (timestamp).
     * </p>
     * 
     * @param creationTimeBefore
     *        A filter that returns only model packages created before the specified time (timestamp).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelPackagesRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * The maximum number of model packages to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of model packages to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of model packages to return in the response.
     * </p>
     * 
     * @return The maximum number of model packages to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of model packages to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of model packages to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelPackagesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A string in the model package name. This filter returns only model packages whose name contains the specified
     * string.
     * </p>
     * 
     * @param nameContains
     *        A string in the model package name. This filter returns only model packages whose name contains the
     *        specified string.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * A string in the model package name. This filter returns only model packages whose name contains the specified
     * string.
     * </p>
     * 
     * @return A string in the model package name. This filter returns only model packages whose name contains the
     *         specified string.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * A string in the model package name. This filter returns only model packages whose name contains the specified
     * string.
     * </p>
     * 
     * @param nameContains
     *        A string in the model package name. This filter returns only model packages whose name contains the
     *        specified string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelPackagesRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * A filter that returns only the model packages with the specified approval status.
     * </p>
     * 
     * @param modelApprovalStatus
     *        A filter that returns only the model packages with the specified approval status.
     * @see ModelApprovalStatus
     */

    public void setModelApprovalStatus(String modelApprovalStatus) {
        this.modelApprovalStatus = modelApprovalStatus;
    }

    /**
     * <p>
     * A filter that returns only the model packages with the specified approval status.
     * </p>
     * 
     * @return A filter that returns only the model packages with the specified approval status.
     * @see ModelApprovalStatus
     */

    public String getModelApprovalStatus() {
        return this.modelApprovalStatus;
    }

    /**
     * <p>
     * A filter that returns only the model packages with the specified approval status.
     * </p>
     * 
     * @param modelApprovalStatus
     *        A filter that returns only the model packages with the specified approval status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelApprovalStatus
     */

    public ListModelPackagesRequest withModelApprovalStatus(String modelApprovalStatus) {
        setModelApprovalStatus(modelApprovalStatus);
        return this;
    }

    /**
     * <p>
     * A filter that returns only the model packages with the specified approval status.
     * </p>
     * 
     * @param modelApprovalStatus
     *        A filter that returns only the model packages with the specified approval status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelApprovalStatus
     */

    public ListModelPackagesRequest withModelApprovalStatus(ModelApprovalStatus modelApprovalStatus) {
        this.modelApprovalStatus = modelApprovalStatus.toString();
        return this;
    }

    /**
     * <p>
     * A filter that returns only model versions that belong to the specified model group.
     * </p>
     * 
     * @param modelPackageGroupName
     *        A filter that returns only model versions that belong to the specified model group.
     */

    public void setModelPackageGroupName(String modelPackageGroupName) {
        this.modelPackageGroupName = modelPackageGroupName;
    }

    /**
     * <p>
     * A filter that returns only model versions that belong to the specified model group.
     * </p>
     * 
     * @return A filter that returns only model versions that belong to the specified model group.
     */

    public String getModelPackageGroupName() {
        return this.modelPackageGroupName;
    }

    /**
     * <p>
     * A filter that returns only model versions that belong to the specified model group.
     * </p>
     * 
     * @param modelPackageGroupName
     *        A filter that returns only model versions that belong to the specified model group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelPackagesRequest withModelPackageGroupName(String modelPackageGroupName) {
        setModelPackageGroupName(modelPackageGroupName);
        return this;
    }

    /**
     * <p>
     * A filter that returns onlyl the model packages of the specified type. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VERSIONED</code> - List only versioned models.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNVERSIONED</code> - List only unversioined models.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOTH</code> - List both versioned and unversioned models.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelPackageType
     *        A filter that returns onlyl the model packages of the specified type. This can be one of the following
     *        values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VERSIONED</code> - List only versioned models.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNVERSIONED</code> - List only unversioined models.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BOTH</code> - List both versioned and unversioned models.
     *        </p>
     *        </li>
     * @see ModelPackageType
     */

    public void setModelPackageType(String modelPackageType) {
        this.modelPackageType = modelPackageType;
    }

    /**
     * <p>
     * A filter that returns onlyl the model packages of the specified type. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VERSIONED</code> - List only versioned models.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNVERSIONED</code> - List only unversioined models.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOTH</code> - List both versioned and unversioned models.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A filter that returns onlyl the model packages of the specified type. This can be one of the following
     *         values.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>VERSIONED</code> - List only versioned models.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNVERSIONED</code> - List only unversioined models.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BOTH</code> - List both versioned and unversioned models.
     *         </p>
     *         </li>
     * @see ModelPackageType
     */

    public String getModelPackageType() {
        return this.modelPackageType;
    }

    /**
     * <p>
     * A filter that returns onlyl the model packages of the specified type. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VERSIONED</code> - List only versioned models.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNVERSIONED</code> - List only unversioined models.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOTH</code> - List both versioned and unversioned models.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelPackageType
     *        A filter that returns onlyl the model packages of the specified type. This can be one of the following
     *        values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VERSIONED</code> - List only versioned models.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNVERSIONED</code> - List only unversioined models.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BOTH</code> - List both versioned and unversioned models.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelPackageType
     */

    public ListModelPackagesRequest withModelPackageType(String modelPackageType) {
        setModelPackageType(modelPackageType);
        return this;
    }

    /**
     * <p>
     * A filter that returns onlyl the model packages of the specified type. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VERSIONED</code> - List only versioned models.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNVERSIONED</code> - List only unversioined models.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOTH</code> - List both versioned and unversioned models.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelPackageType
     *        A filter that returns onlyl the model packages of the specified type. This can be one of the following
     *        values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VERSIONED</code> - List only versioned models.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNVERSIONED</code> - List only unversioined models.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BOTH</code> - List both versioned and unversioned models.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelPackageType
     */

    public ListModelPackagesRequest withModelPackageType(ModelPackageType modelPackageType) {
        this.modelPackageType = modelPackageType.toString();
        return this;
    }

    /**
     * <p>
     * If the response to a previous <code>ListModelPackages</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of model packages, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response to a previous <code>ListModelPackages</code> request was truncated, the response includes
     *        a <code>NextToken</code>. To retrieve the next set of model packages, use the token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response to a previous <code>ListModelPackages</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of model packages, use the token in the next request.
     * </p>
     * 
     * @return If the response to a previous <code>ListModelPackages</code> request was truncated, the response includes
     *         a <code>NextToken</code>. To retrieve the next set of model packages, use the token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response to a previous <code>ListModelPackages</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of model packages, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response to a previous <code>ListModelPackages</code> request was truncated, the response includes
     *        a <code>NextToken</code>. To retrieve the next set of model packages, use the token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelPackagesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * @see ModelPackageSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * </p>
     * 
     * @return The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * @see ModelPackageSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelPackageSortBy
     */

    public ListModelPackagesRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelPackageSortBy
     */

    public ListModelPackagesRequest withSortBy(ModelPackageSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the results. The default is <code>Ascending</code>.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     * 
     * @return The sort order for the results. The default is <code>Ascending</code>.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the results. The default is <code>Ascending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListModelPackagesRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the results. The default is <code>Ascending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListModelPackagesRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains()).append(",");
        if (getModelApprovalStatus() != null)
            sb.append("ModelApprovalStatus: ").append(getModelApprovalStatus()).append(",");
        if (getModelPackageGroupName() != null)
            sb.append("ModelPackageGroupName: ").append(getModelPackageGroupName()).append(",");
        if (getModelPackageType() != null)
            sb.append("ModelPackageType: ").append(getModelPackageType()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListModelPackagesRequest == false)
            return false;
        ListModelPackagesRequest other = (ListModelPackagesRequest) obj;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        if (other.getModelApprovalStatus() == null ^ this.getModelApprovalStatus() == null)
            return false;
        if (other.getModelApprovalStatus() != null && other.getModelApprovalStatus().equals(this.getModelApprovalStatus()) == false)
            return false;
        if (other.getModelPackageGroupName() == null ^ this.getModelPackageGroupName() == null)
            return false;
        if (other.getModelPackageGroupName() != null && other.getModelPackageGroupName().equals(this.getModelPackageGroupName()) == false)
            return false;
        if (other.getModelPackageType() == null ^ this.getModelPackageType() == null)
            return false;
        if (other.getModelPackageType() != null && other.getModelPackageType().equals(this.getModelPackageType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getModelApprovalStatus() == null) ? 0 : getModelApprovalStatus().hashCode());
        hashCode = prime * hashCode + ((getModelPackageGroupName() == null) ? 0 : getModelPackageGroupName().hashCode());
        hashCode = prime * hashCode + ((getModelPackageType() == null) ? 0 : getModelPackageType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListModelPackagesRequest clone() {
        return (ListModelPackagesRequest) super.clone();
    }

}
