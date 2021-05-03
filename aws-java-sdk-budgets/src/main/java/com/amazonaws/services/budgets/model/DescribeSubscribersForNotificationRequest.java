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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request of DescribeSubscribersForNotification
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSubscribersForNotificationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget whose subscribers you want descriptions of.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name of the budget whose subscribers you want descriptions of.
     * </p>
     */
    private String budgetName;
    /**
     * <p>
     * The notification whose subscribers you want to list.
     * </p>
     */
    private Notification notification;
    /**
     * <p>
     * An optional integer that represents how many entries a paginated response contains. The maximum is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token that you include in your request to indicate the next set of results that you want to
     * retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget whose subscribers you want descriptions of.
     * </p>
     * 
     * @param accountId
     *        The <code>accountId</code> that is associated with the budget whose subscribers you want descriptions of.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget whose subscribers you want descriptions of.
     * </p>
     * 
     * @return The <code>accountId</code> that is associated with the budget whose subscribers you want descriptions of.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget whose subscribers you want descriptions of.
     * </p>
     * 
     * @param accountId
     *        The <code>accountId</code> that is associated with the budget whose subscribers you want descriptions of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubscribersForNotificationRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name of the budget whose subscribers you want descriptions of.
     * </p>
     * 
     * @param budgetName
     *        The name of the budget whose subscribers you want descriptions of.
     */

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
    }

    /**
     * <p>
     * The name of the budget whose subscribers you want descriptions of.
     * </p>
     * 
     * @return The name of the budget whose subscribers you want descriptions of.
     */

    public String getBudgetName() {
        return this.budgetName;
    }

    /**
     * <p>
     * The name of the budget whose subscribers you want descriptions of.
     * </p>
     * 
     * @param budgetName
     *        The name of the budget whose subscribers you want descriptions of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubscribersForNotificationRequest withBudgetName(String budgetName) {
        setBudgetName(budgetName);
        return this;
    }

    /**
     * <p>
     * The notification whose subscribers you want to list.
     * </p>
     * 
     * @param notification
     *        The notification whose subscribers you want to list.
     */

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    /**
     * <p>
     * The notification whose subscribers you want to list.
     * </p>
     * 
     * @return The notification whose subscribers you want to list.
     */

    public Notification getNotification() {
        return this.notification;
    }

    /**
     * <p>
     * The notification whose subscribers you want to list.
     * </p>
     * 
     * @param notification
     *        The notification whose subscribers you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubscribersForNotificationRequest withNotification(Notification notification) {
        setNotification(notification);
        return this;
    }

    /**
     * <p>
     * An optional integer that represents how many entries a paginated response contains. The maximum is 100.
     * </p>
     * 
     * @param maxResults
     *        An optional integer that represents how many entries a paginated response contains. The maximum is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional integer that represents how many entries a paginated response contains. The maximum is 100.
     * </p>
     * 
     * @return An optional integer that represents how many entries a paginated response contains. The maximum is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional integer that represents how many entries a paginated response contains. The maximum is 100.
     * </p>
     * 
     * @param maxResults
     *        An optional integer that represents how many entries a paginated response contains. The maximum is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubscribersForNotificationRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token that you include in your request to indicate the next set of results that you want to
     * retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that you include in your request to indicate the next set of results that you want to
     *        retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that you include in your request to indicate the next set of results that you want to
     * retrieve.
     * </p>
     * 
     * @return The pagination token that you include in your request to indicate the next set of results that you want
     *         to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that you include in your request to indicate the next set of results that you want to
     * retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that you include in your request to indicate the next set of results that you want to
     *        retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubscribersForNotificationRequest withNextToken(String nextToken) {
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getBudgetName() != null)
            sb.append("BudgetName: ").append(getBudgetName()).append(",");
        if (getNotification() != null)
            sb.append("Notification: ").append(getNotification()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof DescribeSubscribersForNotificationRequest == false)
            return false;
        DescribeSubscribersForNotificationRequest other = (DescribeSubscribersForNotificationRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBudgetName() == null ^ this.getBudgetName() == null)
            return false;
        if (other.getBudgetName() != null && other.getBudgetName().equals(this.getBudgetName()) == false)
            return false;
        if (other.getNotification() == null ^ this.getNotification() == null)
            return false;
        if (other.getNotification() != null && other.getNotification().equals(this.getNotification()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBudgetName() == null) ? 0 : getBudgetName().hashCode());
        hashCode = prime * hashCode + ((getNotification() == null) ? 0 : getNotification().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSubscribersForNotificationRequest clone() {
        return (DescribeSubscribersForNotificationRequest) super.clone();
    }

}
