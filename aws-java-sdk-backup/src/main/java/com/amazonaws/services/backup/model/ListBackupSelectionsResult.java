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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupSelections" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBackupSelectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of backup selection list items containing metadata about each resource in the list.
     * </p>
     */
    private java.util.List<BackupSelectionsListMember> backupSelectionsList;

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @return The next item following a partial list of returned items. For example, if a request is made to return
     *         <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *         list starting at the location pointed to by the next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupSelectionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of backup selection list items containing metadata about each resource in the list.
     * </p>
     * 
     * @return An array of backup selection list items containing metadata about each resource in the list.
     */

    public java.util.List<BackupSelectionsListMember> getBackupSelectionsList() {
        return backupSelectionsList;
    }

    /**
     * <p>
     * An array of backup selection list items containing metadata about each resource in the list.
     * </p>
     * 
     * @param backupSelectionsList
     *        An array of backup selection list items containing metadata about each resource in the list.
     */

    public void setBackupSelectionsList(java.util.Collection<BackupSelectionsListMember> backupSelectionsList) {
        if (backupSelectionsList == null) {
            this.backupSelectionsList = null;
            return;
        }

        this.backupSelectionsList = new java.util.ArrayList<BackupSelectionsListMember>(backupSelectionsList);
    }

    /**
     * <p>
     * An array of backup selection list items containing metadata about each resource in the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBackupSelectionsList(java.util.Collection)} or {@link #withBackupSelectionsList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param backupSelectionsList
     *        An array of backup selection list items containing metadata about each resource in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupSelectionsResult withBackupSelectionsList(BackupSelectionsListMember... backupSelectionsList) {
        if (this.backupSelectionsList == null) {
            setBackupSelectionsList(new java.util.ArrayList<BackupSelectionsListMember>(backupSelectionsList.length));
        }
        for (BackupSelectionsListMember ele : backupSelectionsList) {
            this.backupSelectionsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of backup selection list items containing metadata about each resource in the list.
     * </p>
     * 
     * @param backupSelectionsList
     *        An array of backup selection list items containing metadata about each resource in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupSelectionsResult withBackupSelectionsList(java.util.Collection<BackupSelectionsListMember> backupSelectionsList) {
        setBackupSelectionsList(backupSelectionsList);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getBackupSelectionsList() != null)
            sb.append("BackupSelectionsList: ").append(getBackupSelectionsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBackupSelectionsResult == false)
            return false;
        ListBackupSelectionsResult other = (ListBackupSelectionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getBackupSelectionsList() == null ^ this.getBackupSelectionsList() == null)
            return false;
        if (other.getBackupSelectionsList() != null && other.getBackupSelectionsList().equals(this.getBackupSelectionsList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getBackupSelectionsList() == null) ? 0 : getBackupSelectionsList().hashCode());
        return hashCode;
    }

    @Override
    public ListBackupSelectionsResult clone() {
        try {
            return (ListBackupSelectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
